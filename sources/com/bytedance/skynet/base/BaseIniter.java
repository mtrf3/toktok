package com.bytedance.skynet.base;

import X.C16880lQ;
import X.C36837Ecz;
import X.C65949PuT;
import X.V1M;
import X.X1D;
import android.content.Context;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes12.dex */
public class BaseIniter {
    public static final String TAG = C16880lQ.LJLLJ(BaseIniter.class);
    public static volatile boolean started = false;

    public static native void addBlackHostNative(String str);

    public static native void init();

    public static native void setProxy(long j);

    public static native void startDns(String str, String str2, String str3, String str4);

    static {
        C16880lQ.LLJJJIL("skbase");
        init();
    }

    public static void addBlackHost(Set<String> set) {
        if (set != null && !set.isEmpty()) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                addBlackHostNative(it.next());
            }
        }
    }

    public static void initDns(Context context, boolean z, boolean z2) {
        initDns(context, z, z2, Collections.emptySet());
    }

    public static void initDns(Context context, boolean z, boolean z2, Set<String> set) {
        if (!started) {
            synchronized (BaseIniter.class) {
                if (!started) {
                    C65949PuT.LIZ.start();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(C16880lQ.LLIIIL(context).getAbsolutePath());
                    String str = File.separator;
                    LIZ.append(str);
                    LIZ.append("skynet:");
                    LIZ.append(C36837Ecz.LIZ(context));
                    File LJIJI = V1M.LJIJI(X1D.LIZIZ(LIZ));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(LJIJI.getAbsolutePath());
                    LIZ2.append(str);
                    LIZ2.append(".proxyfd");
                    File LJIJ = V1M.LJIJ(X1D.LIZIZ(LIZ2));
                    File LJJI = V1M.LJJI(LJIJI);
                    String LJJIIJZLJL = V1M.LJJIIJZLJL(LJIJI, z2);
                    String LJIL = V1M.LJIL(LJIJI, z);
                    addBlackHost(set);
                    startDns(LJIJ.getAbsolutePath(), LJIL, LJJI.getAbsolutePath(), LJJIIJZLJL);
                    started = true;
                }
            }
        }
    }
}
