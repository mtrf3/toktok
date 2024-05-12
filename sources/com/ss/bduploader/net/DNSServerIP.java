package com.ss.bduploader.net;

import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: classes9.dex */
public class DNSServerIP {
    public static volatile String mServerIP;
    public static volatile long mServerIPTime;

    public static String getDNSServerIP() {
        updateDNSServerIP();
        return mServerIP;
    }

    public static void updateDNSServerIP() {
        if (System.currentTimeMillis() - mServerIPTime < LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
            return;
        }
        BDUploadThreadPool.addExecuteTask(new Runnable() { // from class: com.ss.bduploader.net.DNSServerIP.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_bduploader_net_DNSServerIP$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_bduploader_net_DNSServerIP$1__run$___twin___() {
                try {
                    InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                    if (byName != null) {
                        DNSServerIP.mServerIP = byName.getHostAddress();
                        DNSServerIP.mServerIPTime = System.currentTimeMillis();
                    }
                } catch (UnknownHostException unused) {
                }
            }

            public static void com_ss_bduploader_net_DNSServerIP$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_bduploader_net_DNSServerIP$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }
}
