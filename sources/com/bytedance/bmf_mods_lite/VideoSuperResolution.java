package com.bytedance.bmf_mods_lite;

import X.C06460Ne;
import X.C0EH;
import X.C15890jp;
import X.C16880lQ;
import X.X1D;
import X.YE1;
import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.agilelogger.ALog;

/* loaded from: classes2.dex */
public class VideoSuperResolution {
    public static volatile boolean sIsSoInitialized;
    public long mNativePtr;
    public int scaleType;

    private native long nativeCreateSuperResolution();

    private native int nativeInitSuperResolution(long j, int i, int i2, int i3, int i4, int i5, int i6, String str, String str2, String str3);

    private native void nativeReleaseSuperResolution(long j);

    private native int nativeSuperResolutionGetResultTexture(long j);

    private native int nativeSuperResolutionOesProcess(long j, int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2);

    private native int nativeSuperResolutionOesProcessMultiScale(long j, int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, int i10);

    private native int nativeSuperResolutionProcess(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2);

    private native int nativeSuperResolutionProcessBitmap(long j, Bitmap bitmap, Bitmap bitmap2);

    private native int nativeSuperResolutionProcessMultiScale(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, int i10);

    private native int nativeSuperResolutionProcessYuv(long j, long j2, long j3, long j4, int i, int i2, int i3, int i4);

    static {
        try {
            C16880lQ.LLJJJIL("bmf_hydra_lite");
            sIsSoInitialized = true;
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("bmf VideoSuperResolution", "VideoSuperResolution is initialized");
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoSuperResolution initialize occurs error, the msg = ");
            LIZ.append(th.getMessage());
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("bmf VideoSuperResolution", X1D.LIZIZ(LIZ));
            sIsSoInitialized = false;
        }
    }

    public void Free() {
        long j = this.mNativePtr;
        if (j != 0) {
            nativeReleaseSuperResolution(j);
        }
    }

    public VideoSuperResolution() {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("bmf VideoSuperResolution", "New VideoSuperResolution");
    }

    public VideoSuperResolution(Context context) {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("bmf VideoSuperResolution", "New VideoSuperResolution with context");
    }

    public Bitmap ProcessBitmap(Bitmap bitmap, int i, int i2) {
        int i3;
        int i4;
        if (!sIsSoInitialized || bitmap == null || this.mNativePtr == 0) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i5 = this.scaleType;
        if (i5 == 0) {
            i3 = width * 2;
            i4 = height * 2;
        } else if (i5 == 1) {
            i3 = (width * 3) / 2;
            i4 = (height * 3) / 2;
        } else {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("bmf VideoSuperResolution", "VideoSuperResolution: scaleType is neither 0 nor 1");
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        if (nativeSuperResolutionProcessBitmap(this.mNativePtr, bitmap, createBitmap) < 0) {
            createBitmap.recycle();
            return null;
        }
        return createBitmap;
    }

    public int ProcessTexture(int i, int i2, int i3) {
        return ProcessTexture(i, i2, i3, 0, 0, 0, 0, 0, 0L);
    }

    public int ProcessOesTexture(int i, int i2, int i3, float[] fArr) {
        return ProcessOesTexture(i, i2, i3, fArr, 0, 0, 0, 0, 0, 0L);
    }

    public int Init(int i, int i2, int i3, int i4, String str, String str2) {
        return Init(i, i2, i3, i4, str, str2, "");
    }

    public int Init(int i, int i2, int i3, int i4, String str, String str2, String str3) {
        return Init(i, i2, i3, i4, str, str2, str3, 0, 0);
    }

    public int ProcessYuv420p(long j, long j2, long j3, int i, int i2, int i3, int i4) {
        if (!sIsSoInitialized) {
            return -1;
        }
        long j4 = this.mNativePtr;
        if (j4 == 0 || nativeSuperResolutionProcessYuv(j4, j, j2, j3, i3, i4, i, i2) != 0) {
            return -1;
        }
        return nativeSuperResolutionGetResultTexture(this.mNativePtr);
    }

    public int Init(int i, int i2, int i3, int i4, String str, String str2, String str3, int i5, int i6) {
        String str4 = str2;
        String str5 = str;
        this.scaleType = i3;
        if (i < 0 || i > 8 || i2 < 0 || i2 > 4) {
            StringBuilder LIZJ = C06460Ne.LIZJ("VideoSuperResolution: alg_type or backend is not support. check input param  alg_type:", i, " backend:", i2, " scale_type:");
            C15890jp.LIZIZ(LIZJ, i3, " pool_size:", i4, " libpath:");
            YE1.LIZLLL(LIZJ, str5, " licenseModuleName:", str4, " programCacheDir:");
            C0EH.LIZLLL(LIZJ, str3, " max_width:", i5, " max_height:");
            LIZJ.append(i6);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("bmf VideoSuperResolution", X1D.LIZIZ(LIZJ));
            return -1;
        }
        long nativeCreateSuperResolution = nativeCreateSuperResolution();
        this.mNativePtr = nativeCreateSuperResolution;
        if (nativeCreateSuperResolution == 0) {
            return -1;
        }
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        if (str3 != null) {
            str6 = str3;
        }
        return nativeInitSuperResolution(nativeCreateSuperResolution, i, i2, i3, i4, i5, i6, str5, str4, str6);
    }

    public int ProcessTexture(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        if (!sIsSoInitialized) {
            return -1;
        }
        long j2 = this.mNativePtr;
        if (j2 == 0 || nativeSuperResolutionProcess(j2, i, i2, i3, i4, i5, i6, i7, i8, j) != 0) {
            return -1;
        }
        return nativeSuperResolutionGetResultTexture(this.mNativePtr);
    }

    public int ProcessOesTexture(int i, int i2, int i3, float[] fArr, int i4, int i5, int i6, int i7, int i8, long j) {
        if (!sIsSoInitialized) {
            return -1;
        }
        long j2 = this.mNativePtr;
        if (j2 == 0 || nativeSuperResolutionOesProcess(j2, i, fArr, i2, i3, i4, i5, i6, i7, i8, j) != 0) {
            return -1;
        }
        return nativeSuperResolutionGetResultTexture(this.mNativePtr);
    }

    public int ProcessMultiScaleTexture(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, int i9, int i10) {
        if (!sIsSoInitialized) {
            return -1;
        }
        long j2 = this.mNativePtr;
        if (j2 == 0 || nativeSuperResolutionProcessMultiScale(j2, i, i2, i3, i4, i5, i6, i7, i8, j, i9, i10) != 0) {
            return -1;
        }
        return nativeSuperResolutionGetResultTexture(this.mNativePtr);
    }

    public int ProcessMultiScaleOesTexture(int i, int i2, int i3, float[] fArr, int i4, int i5, int i6, int i7, int i8, long j, int i9, int i10) {
        if (!sIsSoInitialized) {
            return -1;
        }
        long j2 = this.mNativePtr;
        if (j2 == 0 || nativeSuperResolutionOesProcessMultiScale(j2, i, fArr, i2, i3, i4, i5, i6, i7, i8, j, i9, i10) != 0) {
            return -1;
        }
        return nativeSuperResolutionGetResultTexture(this.mNativePtr);
    }
}
