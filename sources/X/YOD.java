package X;

import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import java.util.List;

/* loaded from: classes16.dex */
public interface YOD {
    int beginGenVideoFrames(int i, int i2, boolean z, InterfaceC133855Nd interfaceC133855Nd);

    int cancelGenVideoFrame(int i);

    void clearNativeFromBingo();

    int genRandomSolve();

    int genSmartCutting();

    List<VEClipAlgorithmParam> getAllVideoRangeData();

    int initBingoAlgorithm();

    int initWithAlgorithm(String[] strArr, C5NI c5ni);

    int removeAllVideoSound();

    int restoreAllVideoSound();

    int updateAlgorithmFromNormal();
}
