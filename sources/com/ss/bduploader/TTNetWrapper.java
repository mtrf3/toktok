package com.ss.bduploader;

import X.C16880lQ;
import com.bytedance.ttnet.TTNetInit;
import java.net.InetAddress;
import java.util.List;

/* loaded from: classes9.dex */
public class TTNetWrapper {
    public static List<InetAddress> dnsLookup(String str) {
        try {
            return TTNetInit.dnsLookup(str);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
