package com.bytedance.ies.cutsame.cut_android;

import X.C141335gf;
import X.C16880lQ;
import X.C171956ox;
import X.C172586py;
import X.C172876qR;
import X.C172906qU;
import X.C172916qV;
import X.C172976qb;
import X.C221108m2;
import X.C3C5;
import X.C45244HpI;
import X.C62822Ol8;
import X.C6Y0;
import X.C76800UCe;
import X.C82876Wfo;
import X.EnumC172866qQ;
import X.PVC;
import X.X1D;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.cutsame.resourcefetcher.ResourceFetcher;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.ies.nleeditor.NLE;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.android.ugc.cut_reportor_interface.ICutReporter;
import com.ss.android.ugc.cut_ui.CutSource;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class NLETemplateSource {
    public final CutSource LIZ;
    public long LIZIZ;
    public final HashMap<EnumC172866qQ, ResourceFetcher> LIZJ;
    public final C62822Ol8 LIZLLL;
    public final List<NLEPrepareListener> LJ;
    public final C62822Ol8 LJFF;
    public ICutReporter LJI;
    public int LJII;

    private final native long nativeClone_nle(long j);

    private final native long nativeCreate_nle(String str, String str2, String str3, String str4);

    private final native void nativePrepare_nle(long j, int i);

    private final native void nativeRelease_nle(long j);

    private final native void nativeSetDownloaderParams_nle(long j, long j2);

    private final native void nativeSetDownloader_nle(long j, long j2);

    private final native void nativeSetPrepareListener_nle(long j, NLEPrepareListener nLEPrepareListener);

    private final native void nativeSetReporter(long j, ICutReporter iCutReporter);

    private final native void nativeSetResourceFetcher_nle(long j, ResourceFetcher resourceFetcher);

    public final void LIZLLL() {
        C172586py.LIZJ("NLETemplateSource", o.LJIILLIIL(Long.valueOf(this.LIZIZ), "releaseObject : "));
        this.LIZJ.clear();
        long j = this.LIZIZ;
        if (j != 0) {
            nativeRelease_nle(j);
            this.LIZIZ = 0L;
        }
    }

    static {
        C172976qb.LIZ.LIZ();
        NLE.INSTANCE.loadNLELibrary(true);
    }

    public final void LIZJ() {
        C172586py.LIZJ("NLETemplateSource", "prepareAsync");
        long j = this.LIZIZ;
        int i = 0;
        if (j == 0) {
            return;
        }
        new PthreadThread(new C6Y0(nativeClone_nle(j), i, this), "NLETemplateSource").start();
    }

    public final void finalize() {
        try {
            if (this.LIZIZ != 0) {
                C172586py.LJFF("NLETemplateSource", "You forget to release TemplateSource !!");
                LIZLLL();
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public NLETemplateSource() {
        this.LIZJ = new HashMap<>();
        this.LIZLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 61));
        this.LJ = new ArrayList();
        this.LJFF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 62));
    }

    public final void LIZ(NLEPrepareListener nLEPrepareListener) {
        if (this.LIZIZ == 0) {
            return;
        }
        ((ArrayList) this.LJ).add(nLEPrepareListener);
    }

    public final void LJ(C82876Wfo c82876Wfo) {
        C172586py.LIZ("NLETemplateSource", "setNetworkFileFetcher");
        if (this.LIZIZ == 0) {
            return;
        }
        this.LIZJ.put(EnumC172866qQ.NORMAL, c82876Wfo);
    }

    public final void LJFF(ICutReporter iCutReporter) {
        this.LJI = iCutReporter;
        nativeSetReporter(this.LIZIZ, iCutReporter);
    }

    public final void LJI(NLEModelDownloader downloader) {
        o.LJIIIZ(downloader, "downloader");
        C172586py.LIZ("NLETemplateSource", "setNetworkFileFetcher");
        long j = this.LIZIZ;
        long j2 = 0;
        if (j == 0) {
            return;
        }
        try {
            Field field = downloader.getClass().getDeclaredField("swigCPtr");
            o.LJFF(field, "field");
            field.setAccessible(true);
            j2 = field.getLong(downloader);
        } catch (Exception unused) {
        }
        nativeSetDownloader_nle(j, j2);
    }

    public static void LIZIZ(NLETemplateSource this$0, long j) {
        o.LJIIIZ(this$0, "this$0");
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            this$0.nativePrepare_nle(j, 0);
            ICutReporter iCutReporter = this$0.LJI;
            if (iCutReporter != null) {
                String valueOf = String.valueOf(this$0.LJII);
                String valueOf2 = String.valueOf(SystemClock.uptimeMillis() - uptimeMillis);
                CutSource cutSource = this$0.LIZ;
                o.LJI(cutSource);
                String desc = cutSource.type.getDesc();
                CutSource cutSource2 = this$0.LIZ;
                o.LJI(cutSource2);
                C171956ox.LIZ(iCutReporter, 1, valueOf, valueOf2, desc, cutSource2.value, 96);
            }
        } finally {
            this$0.nativeRelease_nle(j);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NLETemplateSource(Context context, CutSource cutSource, String str) {
        this();
        String LJIILLIIL;
        String LIZIZ;
        o.LJIIIZ(context, "context");
        C16880lQ.LLLLL(context);
        this.LIZ = cutSource;
        C172976qb.LIZJ = C16880lQ.LLLLL(context);
        String str2 = cutSource.value;
        if (!TextUtils.isEmpty(str2)) {
            int i = C172876qR.LIZ[cutSource.type.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i == 4 || i == 5) {
                        LIZIZ = "";
                    } else {
                        throw new RuntimeException("unknown CutSourceType");
                    }
                } else {
                    LIZIZ = cutSource.value;
                }
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(C45244HpI.LIZIZ);
                LIZ.append('/');
                String sourceStr = cutSource.value;
                o.LJIIIZ(sourceStr, "sourceStr");
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    byte[] bytes = sourceStr.getBytes(PVC.LIZ);
                    o.LJIIIIZZ(bytes, "(this as java.lang.String).getBytes(charset)");
                    LJIILLIIL = C16880lQ.LLLZ("%032x", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest(bytes))}, 1));
                    o.LJIIIIZZ(LJIILLIIL, "java.lang.String.format(format, *args)");
                } catch (NoSuchAlgorithmException unused) {
                    LJIILLIIL = o.LJIILLIIL(Long.valueOf(System.currentTimeMillis()), "TS_");
                }
                LIZ.append(LJIILLIIL);
                LIZIZ = X1D.LIZIZ(LIZ);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("constructor : source=");
            LIZ2.append(cutSource);
            LIZ2.append(", initFolder=");
            LIZ2.append((Object) LIZIZ);
            C172586py.LIZ("NLETemplateSource", X1D.LIZIZ(LIZ2));
            CutSource cutSource2 = this.LIZ;
            o.LJI(cutSource2);
            long nativeCreate_nle = nativeCreate_nle(LIZIZ, cutSource2.type.getDesc(), str2, str == null ? "" : str);
            this.LIZIZ = nativeCreate_nle;
            nativeSetResourceFetcher_nle(nativeCreate_nle, (C172916qV) this.LIZLLL.getValue());
            nativeSetPrepareListener_nle(this.LIZIZ, (C172906qU) this.LJFF.getValue());
            return;
        }
        throw new NullPointerException("source is empty");
    }
}
