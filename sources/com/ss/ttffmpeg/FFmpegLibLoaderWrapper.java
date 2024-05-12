package com.ss.ttffmpeg;

import X.C16880lQ;
import X.C47821Ipl;
import X.C48236IwS;
import X.C56662Kg;
import X.FAM;
import X.FWL;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class FFmpegLibLoaderWrapper {
    public static boolean LIZ;

    public static boolean LIZ() {
        long j;
        boolean z;
        if (C47821Ipl.LIZJ && C56662Kg.LIZ().LIZLLL) {
            C56662Kg.LIZ().LJFF("player_precreate_ttvideoengine_lock_duration", false);
            C56662Kg.LIZ().LIZJ("player_precreate_load_vcnlib_duration", false);
        }
        FAM LIZ2 = C56662Kg.LIZ();
        if (C48236IwS.LJIIJ()) {
            j = 1;
        } else {
            j = 2;
        }
        LIZ2.LIZLLL(j, "feed_get_cache_type");
        boolean z2 = true;
        if (((Number) FWL.LIZ.getValue()).intValue() > 0) {
            C48236IwS.LJIILJJIL = false;
        } else {
            synchronized (FFmpegLibLoaderWrapper.class) {
                if (!LIZ) {
                    try {
                        try {
                            C16880lQ.LLJJJIL("ttmverify");
                        } catch (UnsatisfiedLinkError unused) {
                            C16880lQ.LLJJJIL("ttmverifylite");
                            CustomVerify._init();
                        }
                        z = true;
                    } catch (UnsatisfiedLinkError unused2) {
                        z = false;
                    }
                    LIZ = z;
                } else {
                    z = true;
                }
            }
            C48236IwS.LJIILJJIL = true;
            z2 = z;
        }
        if (C47821Ipl.LIZJ && C56662Kg.LIZ().LIZLLL) {
            C56662Kg.LIZ().LJFF("player_precreate_load_vcnlib_duration", false);
            C56662Kg.LIZ().LIZJ("player_precreate_ttvideoengine_create_duration", false);
            C47821Ipl.LIZJ = false;
        }
        return z2;
    }

    public static List<String> LIZIZ() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add("ttcrypto");
            arrayList.add("ttboringssl");
            arrayList.add("ttffmpeg");
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static synchronized String getFFmpegVersion() {
        synchronized (FFmpegLibLoaderWrapper.class) {
        }
        return "1.1.149.10-mt-webp";
    }
}
