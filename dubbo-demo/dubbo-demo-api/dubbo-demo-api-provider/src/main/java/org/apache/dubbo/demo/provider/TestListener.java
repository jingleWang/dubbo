package org.apache.dubbo.demo.provider;

import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.Exporter;
import org.apache.dubbo.rpc.ExporterListener;
import org.apache.dubbo.rpc.RpcException;

/**
 * @Date : 2019/8/6
 * @Author : 汪京陆(Ben)[wangjinglu@souche.com]
 * @CopyRight : DataTeam @ SouChe Inc
 * @Desc :
 */
@Activate
public class TestListener implements ExporterListener {
    @Override
    public void exported(Exporter<?> exporter) throws RpcException {
        System.out.println("***********export " + exporter.getInvoker().getUrl().toFullString());
    }

    @Override
    public void unexported(Exporter<?> exporter) {

    }
}
