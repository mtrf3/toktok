package com.ss.android.vesdk;

import X.AnonymousClass028;
import X.C01R;
import X.C06540Nm;
import X.C16880lQ;
import X.C1B6;
import X.P4Q;
import X.X1D;
import android.os.Build;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.vesdk.runtime.VEEffectConfig;
import com.ss.android.vesdk.runtime.VERuntime;
import java.util.List;

/* loaded from: classes12.dex */
public class VEImageDetectUtils {
    public static final String TAG = C16880lQ.LJLLJ(VEImageDetectUtils.class);
    public IDetectImageEnigmaResultListener mDetectEnigmaResultListener;
    public IDetectImageResultListener mDetectResultListener;
    public IDetectImageResultWithNumListener mDetectResultWithNumListener;
    public boolean mInterruptDetectImageContent = true;
    public long mNativeHandler;

    /* loaded from: classes12.dex */
    public interface IDetectImageEnigmaResultListener {
        void onDetectResult(EnigmaResult enigmaResult);
    }

    /* loaded from: classes8.dex */
    public interface IDetectImageResultListener {
        void onDetectResult(String str, String str2, String str3, boolean z);
    }

    /* loaded from: classes12.dex */
    public interface IDetectImageResultWithNumListener {
        void onDetectResult(String str, String str2, String str3, int i);
    }

    private native int nativeDestroy(long j);

    private native int nativeDetectImageContent(long j, String str, String str2, String[] strArr, int i, int i2);

    private native int nativeDetectImageEnigma(long j, String str, int i, int i2);

    private native long nativeInit(int i, int i2, String str, String str2, boolean z, String str3);

    public int init() {
        long nativeInit = nativeInit(0, 0, VERuntime.getInstance().getEnv().LIZ(), Build.DEVICE, false, VEEffectConfig.getCacheDir());
        if (nativeInit == 0) {
            return -1;
        }
        this.mNativeHandler = nativeInit;
        return 0;
    }

    public synchronized void stopDetectImagesContentIfNeed() {
        this.mInterruptDetectImageContent = true;
    }

    static {
        TENativeLibsLoader.loadLibrary();
    }

    public int destroy() {
        long j = this.mNativeHandler;
        if (j == 0) {
            P4Q.LJII(TAG, "invoke destroy() encounter handler == 0. Consider destroy() has been called already?");
            return -1;
        }
        int nativeDestroy = nativeDestroy(j);
        if (nativeDestroy == 0) {
            this.mNativeHandler = 0L;
            P4Q.LJFF(TAG, "NativeHandler destroy succeed.");
        }
        this.mDetectResultListener = null;
        return nativeDestroy;
    }

    public void onNativeCallback_onDetectImageEnigma(EnigmaResult enigmaResult) {
        IDetectImageEnigmaResultListener iDetectImageEnigmaResultListener = this.mDetectEnigmaResultListener;
        if (iDetectImageEnigmaResultListener == null) {
            P4Q.LJII(TAG, "Native callback onDetectImageEnigma encounter no listener handle?");
        } else {
            iDetectImageEnigmaResultListener.onDetectResult(enigmaResult);
        }
    }

    public void setDetectImageContentListener(IDetectImageResultListener iDetectImageResultListener) {
        this.mDetectResultListener = iDetectImageResultListener;
    }

    public void setDetectImageContentWithNumListener(IDetectImageResultWithNumListener iDetectImageResultWithNumListener) {
        this.mDetectResultWithNumListener = iDetectImageResultWithNumListener;
    }

    public void setDetectImageEnigmaListener(IDetectImageEnigmaResultListener iDetectImageEnigmaResultListener) {
        this.mDetectEnigmaResultListener = iDetectImageEnigmaResultListener;
    }

    public int detectImageEnigma(String str, int i, int i2) {
        if (!str.startsWith("content") && !C1B6.LIZIZ(str)) {
            String str2 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Illegal argument. file: \"");
            LIZ.append(str);
            LIZ.append("\" is not exist.");
            P4Q.LIZJ(str2, X1D.LIZIZ(LIZ));
            return -100;
        }
        String str3 = TAG;
        StringBuilder LJ = AnonymousClass028.LJ("detectImageEnigma..., imagePath=", str, ", maxWidth=", i, ", maxHeight=");
        C01R.LIZJ(LJ, i, LJ, str3);
        return nativeDetectImageEnigma(this.mNativeHandler, str, i, i2);
    }

    public void detectImagesContent(String str, List<String> list, List<String> list2) {
        int i;
        synchronized (this) {
            this.mInterruptDetectImageContent = false;
        }
        if (list2.isEmpty()) {
            P4Q.LJII(TAG, "Unexpected argument. scanAlgorithmList is empty?");
            return;
        }
        String[] strArr = new String[list2.size()];
        list2.toArray(strArr);
        int size = list.size();
        for (i = 0; i < size && !this.mInterruptDetectImageContent; i++) {
            String str2 = (String) ListProtector.get(list, i);
            if (!str2.startsWith("content") && !C1B6.LIZIZ(str2)) {
                String str3 = TAG;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Illegal argument. file: \"");
                LIZ.append(str2);
                LIZ.append("\" is not exist.");
                P4Q.LIZJ(str3, X1D.LIZIZ(LIZ));
            } else {
                nativeDetectImageContent(this.mNativeHandler, str, (String) ListProtector.get(list, i), strArr, -1, -1);
            }
        }
    }

    public int detectImageContent(String str, String str2, List<String> list, int i, int i2) {
        if (!str2.startsWith("content") && !C1B6.LIZIZ(str2)) {
            String str3 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Illegal argument. file: \"");
            LIZ.append(str2);
            LIZ.append("\" is not exist.");
            P4Q.LIZJ(str3, X1D.LIZIZ(LIZ));
            return -100;
        }
        if (list.isEmpty()) {
            P4Q.LJII(TAG, "Unexpected argument. scanAlgorithmList is empty?");
            return -100;
        }
        String str4 = TAG;
        StringBuilder LIZLLL = C06540Nm.LIZLLL("detectImageContent... stickerId:", str, ", imagePath=", str2, ", maxWidth=");
        LIZLLL.append(i);
        LIZLLL.append(", maxHeight=");
        LIZLLL.append(i);
        P4Q.LJII(str4, X1D.LIZIZ(LIZLLL));
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        return nativeDetectImageContent(this.mNativeHandler, str, str2, strArr, i, i2);
    }

    public void detectImagesContentWithSize(String str, List<String> list, List<String> list2, int i, int i2) {
        int i3;
        synchronized (this) {
            this.mInterruptDetectImageContent = false;
        }
        if (list2.isEmpty()) {
            P4Q.LJII(TAG, "Unexpected argument. scanAlgorithmList is empty?");
            return;
        }
        String[] strArr = new String[list2.size()];
        list2.toArray(strArr);
        int size = list.size();
        for (i3 = 0; i3 < size && !this.mInterruptDetectImageContent; i3++) {
            String str2 = (String) ListProtector.get(list, i3);
            if (!str2.startsWith("content") && !C1B6.LIZIZ(str2)) {
                String str3 = TAG;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Illegal argument. file: \"");
                LIZ.append(str2);
                LIZ.append("\" is not exist.");
                P4Q.LIZJ(str3, X1D.LIZIZ(LIZ));
            } else {
                nativeDetectImageContent(this.mNativeHandler, str, (String) ListProtector.get(list, i3), strArr, i, i2);
            }
        }
    }

    public void onNativeCallback_onDetectImageContent(String str, String str2, String str3, boolean z, int i) {
        IDetectImageResultListener iDetectImageResultListener = this.mDetectResultListener;
        if (iDetectImageResultListener == null) {
            if (this.mDetectResultWithNumListener == null) {
                P4Q.LJII(TAG, "Native callback onDetectImageContent encounter no listener handle?");
                return;
            }
        } else {
            iDetectImageResultListener.onDetectResult(str, str2, str3, z);
        }
        IDetectImageResultWithNumListener iDetectImageResultWithNumListener = this.mDetectResultWithNumListener;
        if (iDetectImageResultWithNumListener != null) {
            iDetectImageResultWithNumListener.onDetectResult(str, str2, str3, i);
        }
    }
}
