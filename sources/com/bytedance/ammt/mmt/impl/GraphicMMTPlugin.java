package com.bytedance.ammt.mmt.impl;

import X.C10940bq;
import X.C16880lQ;
import X.X1D;
import android.content.Context;
import com.bytedance.android.bytehook.ByteHook;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.io.File;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GraphicMMTPlugin extends C10940bq {
    public static GraphicMMTPlugin LIZLLL;
    public static final String LJ;
    public static final String LJFF;
    public static final String LJI;
    public String LIZIZ;
    public String LIZJ;

    public static native void gmt_native_dump(String str, String str2);

    public static native void gmt_native_setConfigParams(int i);

    public static native void gmt_native_setMemoryThreshold(long j, long j2);

    public static native void gmt_native_start();

    public static native void gmt_native_stop();

    static {
        C16880lQ.LLJJJIL("mmt");
        LJ = "gmt";
        LJFF = "_usage";
        LJI = "_profile";
    }

    public static GraphicMMTPlugin LIZJ() {
        if (LIZLLL == null) {
            synchronized (GraphicMMTPlugin.class) {
                LIZLLL = new GraphicMMTPlugin();
            }
        }
        return LIZLLL;
    }

    public final void LIZIZ() {
        gmt_native_dump(this.LIZIZ, this.LIZJ);
    }

    public final void LJI() {
        ByteHook.init();
        gmt_native_start();
        this.LIZ = true;
    }

    public final void LIZ(final Context context) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZIZ);
        String str = File.separator;
        LIZ.append(str);
        LIZ.append(this.LIZJ);
        LIZ.append(LJFF);
        final String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LIZIZ);
        LIZ2.append(str);
        LIZ2.append(this.LIZJ);
        LIZ2.append(LJI);
        final String LIZIZ2 = X1D.LIZIZ(LIZ2);
        File file = new File(LIZIZ);
        File file2 = new File(LIZIZ2);
        if (file.exists() && file2.exists()) {
            new PthreadThread(new Runnable() { // from class: X.0Zi
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ3;
                    try {
                        try {
                            C09640Zk.LIZIZ = LIZIZ2;
                            String str2 = LIZIZ;
                            C09640Zk.LIZ = str2;
                            List<JSONObject> LIZJ = C09640Zk.LIZJ(str2);
                            C09640Zk.LIZLLL(context, LIZIZ2, LIZJ);
                        } catch (JSONException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                    } finally {
                        if (LIZ3) {
                        }
                    }
                }
            }, "UploadManager").start();
        }
    }

    public final void LIZLLL(int i) {
        gmt_native_setConfigParams(i);
    }

    public final void LJ(long j, long j2) {
        gmt_native_setMemoryThreshold(j, j2);
    }

    public final void LJFF(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(File.separator);
        LIZ.append(LJ);
        this.LIZIZ = X1D.LIZIZ(LIZ);
        this.LIZJ = str2;
    }
}
