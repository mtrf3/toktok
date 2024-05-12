package X;

import com.ss.android.vesdk.VEMVAudioInfo;
import com.ss.android.vesdk.VEMVParams;

/* loaded from: classes16.dex */
public interface YOO {
    void addMVFilterInternal(int i);

    void clearNativeFromMV();

    VEMVAudioInfo getMVOriginalBackgroundAudio();

    int initMV(VEMVParams vEMVParams);

    int initMV(String str, String[] strArr, String[] strArr2, String str2, int i, int i2);

    boolean isMVInitialedInternal();

    int updateMVResources(VEMVParams vEMVParams);

    int updateMVResources(String str, String[] strArr, String[] strArr2);
}
