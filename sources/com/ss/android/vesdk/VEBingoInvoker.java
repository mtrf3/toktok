package com.ss.android.vesdk;

import X.AnonymousClass028;
import X.C06460Ne;
import X.C16880lQ;
import X.C44520Hdc;
import X.C5NI;
import X.C63868P4u;
import X.C7MY;
import X.InterfaceC133855Nd;
import X.P4Q;
import X.P51;
import X.P5C;
import X.Q7K;
import X.V2B;
import X.X1D;
import X.YOD;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.jni.TEBingoInterface;
import com.ss.android.vesdk.runtime.VEEditorResManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class VEBingoInvoker implements YOD {
    public int frameCountCur;
    public Map<Integer, Boolean> genFrameMap = new HashMap();
    public final TEBingoInterface mNativeBingoHandler;
    public final TEInterface mNativeEditor;
    public final VEEditor mVEEditor;

    @Override // X.YOD
    public void clearNativeFromBingo() {
        this.mNativeBingoHandler.clearNative();
    }

    @Override // X.YOD
    public int genRandomSolve() {
        synchronized (this.mVEEditor) {
            P4Q.LJII("VEEditor_VEBingoInvoker", "genRandomSolve");
            this.mNativeEditor.stop();
            int randomSolve = this.mNativeBingoHandler.getRandomSolve();
            if (randomSolve != 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("getRandomSolve failed, ret = ");
                LIZ.append(randomSolve);
                P4Q.LIZJ("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ));
                return randomSolve;
            }
            return this.mNativeEditor.prepareEngine(0);
        }
    }

    @Override // X.YOD
    public int genSmartCutting() {
        synchronized (this.mVEEditor) {
            P4Q.LJII("VEEditor_VEBingoInvoker", "genSmartCutting");
            this.mNativeEditor.stop();
            int genAISolve = this.mNativeBingoHandler.genAISolve();
            if (genAISolve != 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("genSmartCutting failed, ret = ");
                LIZ.append(genAISolve);
                P4Q.LIZJ("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ));
                return genAISolve;
            }
            return this.mNativeEditor.prepareEngine(0);
        }
    }

    @Override // X.YOD
    public List<VEClipAlgorithmParam> getAllVideoRangeData() {
        P4Q.LJII("VEEditor_VEBingoInvoker", "getAllVideoRangeData");
        List<VEClipAlgorithmParam> allVideoRangeData = this.mNativeBingoHandler.getAllVideoRangeData();
        for (int i = 0; i < allVideoRangeData.size(); i++) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("rangData: ");
            LIZ.append(((VEClipAlgorithmParam) ListProtector.get(allVideoRangeData, i)).toString());
            P4Q.LJII("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ));
        }
        return allVideoRangeData;
    }

    @Override // X.YOD
    public int initBingoAlgorithm() {
        P4Q.LJFF("VEEditor_VEBingoInvoker", "initBingoAlgorithm");
        int initBingoAlgorithm = this.mNativeBingoHandler.initBingoAlgorithm();
        if (initBingoAlgorithm != 0) {
            Q7K.LJ("initBingoAlgorithm failed, ret = ", initBingoAlgorithm, "VEEditor_VEBingoInvoker");
        }
        return initBingoAlgorithm;
    }

    @Override // X.YOD
    public int removeAllVideoSound() {
        synchronized (this.mVEEditor) {
            P4Q.LJII("VEEditor_VEBingoInvoker", "removeAllVideoSound");
            this.mNativeEditor.stop();
            int removeAllVideoSound = this.mNativeBingoHandler.removeAllVideoSound();
            if (removeAllVideoSound != 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("removeAllVideoSound failed, ret = ");
                LIZ.append(removeAllVideoSound);
                P4Q.LIZJ("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ));
                return removeAllVideoSound;
            }
            return this.mNativeEditor.prepareEngine(0);
        }
    }

    @Override // X.YOD
    public int restoreAllVideoSound() {
        synchronized (this.mVEEditor) {
            P4Q.LJII("VEEditor_VEBingoInvoker", "restoreAllVideoSound");
            this.mNativeEditor.stop();
            int restoreAllVideoSound = this.mNativeBingoHandler.restoreAllVideoSound();
            if (restoreAllVideoSound != 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("restoreAllVideoSound failed, ret = ");
                LIZ.append(restoreAllVideoSound);
                P4Q.LIZJ("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ));
                return restoreAllVideoSound;
            }
            return this.mNativeEditor.prepareEngine(0);
        }
    }

    @Override // X.YOD
    public int updateAlgorithmFromNormal() {
        int updateAlgorithmFromNormal;
        synchronized (this.mVEEditor) {
            P4Q.LJII("VEEditor_VEBingoInvoker", "updateAlgorithmFromNormal");
            updateAlgorithmFromNormal = this.mNativeBingoHandler.updateAlgorithmFromNormal();
            if (updateAlgorithmFromNormal != 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("updateAlgorithmFromNormal failed, ret = ");
                LIZ.append(updateAlgorithmFromNormal);
                P4Q.LIZJ("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ));
            }
        }
        return updateAlgorithmFromNormal;
    }

    public VEBingoInvoker(VEEditor vEEditor) {
        this.mVEEditor = vEEditor;
        TEInterface tEInterface = vEEditor.LLIIII;
        this.mNativeEditor = tEInterface;
        this.mNativeBingoHandler = new TEBingoInterface(tEInterface);
    }

    public int addVideoClipWithAlgorithm(String[] strArr) {
        synchronized (this.mVEEditor) {
            if (strArr.length == 0) {
                return -100;
            }
            for (int i = 0; i < strArr.length; i++) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("addVidoeClipWithAlgorithm...  i: ");
                LIZ.append(i);
                LIZ.append(" path: ");
                LIZ.append(strArr[i]);
                P4Q.LJII("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ));
            }
            this.mNativeEditor.stop();
            int addVidoeClipWithAlgorithm = this.mNativeBingoHandler.addVidoeClipWithAlgorithm(strArr);
            if (addVidoeClipWithAlgorithm != 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("addVidoeClipWithAlgorithm failed, ret = ");
                LIZ2.append(addVidoeClipWithAlgorithm);
                P4Q.LIZJ("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ2));
                return addVidoeClipWithAlgorithm;
            }
            return this.mNativeEditor.prepareEngine(0);
        }
    }

    @Override // X.YOD
    public int cancelGenVideoFrame(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelGenVideoFrame... index: ");
        LIZ.append(i);
        P4Q.LJII("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ));
        this.genFrameMap.put(Integer.valueOf(i), Boolean.FALSE);
        this.frameCountCur = 0;
        return 0;
    }

    public int checkScoresFile(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            return -100;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("checkScoresFile filePath:");
        LIZ.append(str);
        P4Q.LJII("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ));
        int checkScoresFile = this.mNativeBingoHandler.checkScoresFile(str);
        if (checkScoresFile != 0) {
            Q7K.LJ("checkScoresFile failed, ret = ", checkScoresFile, "VEEditor_VEBingoInvoker");
        }
        return checkScoresFile;
    }

    public int deleteVideoClipWithAlgorithm(int i) {
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("deleteVideoClipWithAlgorithm... ");
            LIZ.append(i);
            P4Q.LJII("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ));
            if (i < 0) {
                return -100;
            }
            this.mNativeEditor.stop();
            int deleteVideoClipWithAlgorithm = this.mNativeBingoHandler.deleteVideoClipWithAlgorithm(i);
            if (deleteVideoClipWithAlgorithm != 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("deleteVideoClipWithAlgorithm failed, ret = ");
                LIZ2.append(deleteVideoClipWithAlgorithm);
                P4Q.LIZJ("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ2));
                return deleteVideoClipWithAlgorithm;
            }
            return this.mNativeEditor.prepareEngine(0);
        }
    }

    public int removeMusic(int i) {
        synchronized (this.mVEEditor) {
            this.mNativeEditor.stop();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("removeMusic index: ");
            LIZ.append(i);
            P4Q.LJII("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ));
            int removeMusic = this.mNativeBingoHandler.removeMusic(i);
            if (removeMusic != 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("removeMusic failed, ret = ");
                LIZ2.append(removeMusic);
                P4Q.LIZJ("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ2));
                return removeMusic;
            }
            this.mNativeEditor.prepareEngine(0);
            return 0;
        }
    }

    public int setInterimScoresToFile(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            return -100;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setInterimScoresToFile filePath:");
        LIZ.append(str);
        P4Q.LJII("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ));
        int interimScoresToFile = this.mNativeBingoHandler.setInterimScoresToFile(str);
        if (interimScoresToFile != 0) {
            Q7K.LJ("setInterimScoresToFile failed, ret = ", interimScoresToFile, "VEEditor_VEBingoInvoker");
        }
        return interimScoresToFile;
    }

    public int setMusicCropRatio(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setMusicCropRatio crop:");
        LIZ.append(i);
        P4Q.LJII("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ));
        int musicCropRatio = this.mNativeBingoHandler.setMusicCropRatio(i);
        if (musicCropRatio != 0) {
            Q7K.LJ("setMusicCropRatio failed, ret = ", musicCropRatio, "VEEditor_VEBingoInvoker");
        }
        return musicCropRatio;
    }

    @Override // X.YOD
    public int initWithAlgorithm(String[] strArr, C5NI c5ni) {
        synchronized (this.mVEEditor) {
            TEMonitorInvoker.nativeReset(1);
            C63868P4u.LIZIZ(1);
            if (strArr.length == 0) {
                return -100;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("initWithAlgorithm... ");
            LIZ.append(c5ni);
            P4Q.LJII("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ));
            for (int i = 0; i < strArr.length; i++) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("initWithAlgorithm...  i: ");
                LIZ2.append(i);
                LIZ2.append(" path: ");
                LIZ2.append(strArr[i]);
                P4Q.LJII("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ2));
            }
            this.mVEEditor.LLIIL = System.currentTimeMillis();
            this.mVEEditor.LLIILII = System.currentTimeMillis();
            int initVideoEditorWithAlgorithm = this.mNativeBingoHandler.initVideoEditorWithAlgorithm(strArr, c5ni.ordinal());
            if (initVideoEditorWithAlgorithm != 0) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("initVideoEditorWithAlgorithm failed, ret = ");
                LIZ3.append(initVideoEditorWithAlgorithm);
                P4Q.LIZJ("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ3));
                this.mVEEditor.LLILZ = false;
                return initVideoEditorWithAlgorithm;
            }
            VEEditor vEEditor = this.mVEEditor;
            vEEditor.LLILZ = true;
            VEEditorResManager vEEditorResManager = vEEditor.LJLJJLL;
            vEEditorResManager.mReverseDone = false;
            vEEditorResManager.mOriginalSoundTrackType = 0;
            vEEditorResManager.mOriginalSoundTrackIndex = 0;
            vEEditor.LLILLIZIL = c5ni;
            vEEditor.LJLJJI.getClass();
            VEEditor vEEditor2 = this.mVEEditor;
            vEEditor2.LLII = 0;
            vEEditor2.LJLJJI.LIZ();
            return 0;
        }
    }

    public int moveVideoClipWithAlgorithm(int i, int i2) {
        synchronized (this.mVEEditor) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("moveVideoClipWithAlgorithm... from: ");
            LIZ.append(i);
            LIZ.append(" to: ");
            LIZ.append(i2);
            P4Q.LJII("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ));
            if (i != i2 && i >= 0 && i2 >= 0) {
                this.mNativeEditor.stop();
                int moveVideoClipWithAlgorithm = this.mNativeBingoHandler.moveVideoClipWithAlgorithm(i, i2);
                if (moveVideoClipWithAlgorithm != 0) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("moveVideoClipWithAlgorithm failed, ret = ");
                    LIZ2.append(moveVideoClipWithAlgorithm);
                    P4Q.LIZJ("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ2));
                    return moveVideoClipWithAlgorithm;
                }
                return this.mNativeEditor.prepareEngine(0);
            }
            return -100;
        }
    }

    public int setAIRotation(int i, ROTATE_DEGREE rotate_degree) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAIRotation index:");
        LIZ.append(i);
        LIZ.append(" rotation: ");
        LIZ.append(rotate_degree);
        P4Q.LJII("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ));
        int i2 = C44520Hdc.LIZ[rotate_degree.ordinal()];
        int i3 = 0;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        i3 = 270;
                    }
                } else {
                    i3 = 180;
                }
            } else {
                i3 = 90;
            }
        }
        int aIRotation = this.mNativeBingoHandler.setAIRotation(i, i3);
        if (aIRotation != 0) {
            Q7K.LJ("setAIRotation failed, ret = ", aIRotation, "VEEditor_VEBingoInvoker");
        }
        return aIRotation;
    }

    @Override // X.YOD
    public int beginGenVideoFrames(int i, int i2, boolean z, InterfaceC133855Nd interfaceC133855Nd) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        StringBuilder LIZJ = C06460Ne.LIZJ("beginGenVideoFrames...:", i, ", second:", i2, ", hasHWDecode:");
        LIZJ.append(z);
        P4Q.LJII("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZJ));
        this.genFrameMap.put(Integer.valueOf(i), Boolean.TRUE);
        String clipPath = this.mNativeBingoHandler.getClipPath(i);
        if (clipPath.equals("")) {
            Q7K.LJ("getClipPath wrong index: ", i, "VEEditor_VEBingoInvoker");
            return -100;
        }
        int[] iArr = new int[10];
        TEVideoUtils.nativeGetFileInfo(clipPath, iArr);
        int i8 = iArr[0];
        if (i8 <= 0 || (i3 = iArr[1]) <= 0) {
            P4Q.LIZJ("VEEditor_VEBingoInvoker", "beginGenVideoFrames error for invalid video size");
            return -1;
        }
        if (i8 > i3) {
            int i9 = (int) (i3 / (i8 / 320));
            int i10 = i9 % 16;
            if (i10 >= 8) {
                i9 += 16;
            }
            i5 = i9 - i10;
            i4 = 320;
        } else {
            int i11 = (int) (i8 / (i3 / 320));
            int i12 = i11 % 16;
            if (i12 >= 8) {
                i11 += 16;
            }
            i4 = i11 - i12;
            i5 = 320;
        }
        int i13 = 3;
        int i14 = (iArr[3] / (i2 * 1000)) + 1;
        if (z) {
            i6 = i14 / 3;
        } else {
            i13 = i14;
            i6 = i14;
        }
        StringBuilder LIZJ2 = C06460Ne.LIZJ("HwFrameExtractor_", i, " second:", i2, " hasHWDecode:");
        LIZJ2.append(z);
        LIZJ2.append(" beginGenVideoFrames HWSteps:");
        LIZJ2.append(i6);
        P4Q.LJII("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZJ2));
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < i14; i15 += i13) {
            arrayList.add(Integer.valueOf(i15 * 1000));
        }
        if (arrayList.size() > 0 && ((Integer) AnonymousClass028.LIZIZ(arrayList, 1, arrayList)).intValue() > 1000) {
            ListProtector.set(arrayList, arrayList.size() - 1, Integer.valueOf(((Integer) AnonymousClass028.LIZIZ(arrayList, 1, arrayList)).intValue() - 1000));
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            iArr2[i16] = ((Integer) ListProtector.get(arrayList, i16)).intValue();
            StringBuilder LJ = C7MY.LJ("HwFrameExtractor_", i, " softList value:");
            LJ.append(iArr2[i16]);
            P4Q.LJFF("VEEditor_VEBingoInvoker", X1D.LIZIZ(LJ));
        }
        new PthreadThread(new P5C(this, new long[]{System.currentTimeMillis()}, i, clipPath, interfaceC133855Nd, i14, currentTimeMillis, iArr, iArr2, i4, i5), "EBingoInvoker").start();
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (int i17 = 0; i17 < i6; i17++) {
                int i18 = i17 * 1000;
                if (!arrayList.contains(Integer.valueOf(i18))) {
                    arrayList2.add(Integer.valueOf(i18));
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("HwFrameExtractor_");
                    LIZ.append(i);
                    LIZ.append(" hwListOne value:");
                    LIZ.append(i18);
                    P4Q.LJFF("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ));
                }
            }
            int i19 = i6;
            while (true) {
                i7 = i6 * 2;
                if (i19 >= i7) {
                    break;
                }
                int i20 = i19 * 1000;
                if (!arrayList.contains(Integer.valueOf(i20))) {
                    arrayList3.add(Integer.valueOf(i20));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("HwFrameExtractor_");
                    LIZ2.append(i);
                    LIZ2.append(" hwListTwo value:");
                    LIZ2.append(i20);
                    P4Q.LJFF("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ2));
                }
                i19++;
            }
            while (i7 < i14) {
                int i21 = i7 * 1000;
                if (!arrayList.contains(Integer.valueOf(i21))) {
                    arrayList4.add(Integer.valueOf(i21));
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("HwFrameExtractor_");
                    LIZ3.append(i);
                    LIZ3.append(" hwListThree value:");
                    LIZ3.append(i21);
                    P4Q.LJFF("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ3));
                }
                i7++;
            }
            beginGenFrameHW(clipPath, arrayList2, i4, i5, 2, i14, i, 1, iArr, currentTimeMillis, interfaceC133855Nd);
            beginGenFrameHW(clipPath, arrayList3, i4, i5, 2, i14, i, 2, iArr, currentTimeMillis, interfaceC133855Nd);
            beginGenFrameHW(clipPath, arrayList4, i4, i5, 2, i14, i, 3, iArr, currentTimeMillis, interfaceC133855Nd);
        }
        return 0;
    }

    public int setMusicAndResult(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath) {
        synchronized (this.mVEEditor) {
            this.mNativeEditor.stop();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setMusicAndResult... audioFilePath: ");
            LIZ.append(str);
            LIZ.append(" trimIn: ");
            LIZ.append(i);
            LIZ.append(" trimOut: ");
            LIZ.append(i2);
            LIZ.append(" ");
            LIZ.append(vEAlgorithmPath.toString());
            P4Q.LJII("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ));
            if ((vEAlgorithmPath.getVeBeatsPath() != null && !V2B.LIZLLL(vEAlgorithmPath.getVeBeatsPath())) || ((vEAlgorithmPath.getDownBeatsPath() != null && !V2B.LIZLLL(vEAlgorithmPath.getDownBeatsPath())) || ((vEAlgorithmPath.getNoStrengthBeatsPath() != null && !V2B.LIZLLL(vEAlgorithmPath.getNoStrengthBeatsPath())) || ((vEAlgorithmPath.getManMadePath() != null && !V2B.LIZLLL(vEAlgorithmPath.getManMadePath())) || (vEAlgorithmPath.getOnlineBeatsPath() != null && !V2B.LIZLLL(vEAlgorithmPath.getOnlineBeatsPath())))))) {
                P4Q.LIZJ("VEEditor_VEBingoInvoker", "file is not exist !");
                return -100;
            }
            int musicAndResult = this.mNativeBingoHandler.setMusicAndResult(str, i, i2, vEAlgorithmPath.getVeBeatsPath(), vEAlgorithmPath.getDownBeatsPath(), vEAlgorithmPath.getNoStrengthBeatsPath(), vEAlgorithmPath.getOnlineBeatsPath(), vEAlgorithmPath.getManMadePath(), vEAlgorithmPath.getType(), vEAlgorithmPath.getMode());
            if (musicAndResult < 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("setMusicAndResult failed, ret = ");
                LIZ2.append(musicAndResult);
                P4Q.LIZJ("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ2));
                return musicAndResult;
            }
            return this.mNativeEditor.prepareEngine(0);
        }
    }

    public void progressBack(InterfaceC133855Nd interfaceC133855Nd, int i, int i2, long j, int[] iArr) {
        synchronized (this.mVEEditor) {
            float f = i;
            float f2 = (this.frameCountCur + 1) / f;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HwFrameExtractor_");
            LIZ.append(i2);
            LIZ.append(" count:");
            LIZ.append(this.frameCountCur);
            LIZ.append(" steps:");
            LIZ.append(i);
            LIZ.append(" progress:");
            LIZ.append(f2);
            P4Q.LJII("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ));
            if (f2 <= 1.0f && this.genFrameMap.get(Integer.valueOf(i2)).booleanValue()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("HwFrameExtractor_");
                LIZ2.append(i2);
                LIZ2.append(" progressBack < 1 count:");
                LIZ2.append(this.frameCountCur);
                LIZ2.append(" steps:");
                LIZ2.append(i);
                LIZ2.append(" progress:");
                LIZ2.append(f2);
                P4Q.LJII("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ2));
                int i3 = this.frameCountCur + 1;
                this.frameCountCur = i3;
                interfaceC133855Nd.onProgress(i3 / f);
            }
            if (f2 == 1.0f) {
                long currentTimeMillis = System.currentTimeMillis() - j;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("bingo extractFrame ");
                LIZ3.append(i2);
                LIZ3.append(" progressBack == 1, count:");
                LIZ3.append(this.frameCountCur);
                LIZ3.append(" steps:");
                LIZ3.append(i);
                LIZ3.append(" progress:");
                LIZ3.append(f2);
                LIZ3.append(", cost:");
                LIZ3.append(currentTimeMillis);
                P4Q.LJII("VEEditor_VEBingoInvoker", X1D.LIZIZ(LIZ3));
                this.frameCountCur = 0;
                this.genFrameMap.put(Integer.valueOf(i2), Boolean.FALSE);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("src_width", iArr[0]);
                    jSONObject.put("src_height", iArr[1]);
                    jSONObject.put("src_duration", iArr[3]);
                    jSONObject.put("all_frame_count", i);
                    jSONObject.put("all_cost_ms", currentTimeMillis);
                    jSONObject.put("mean_cost_ms", ((float) currentTimeMillis) / f);
                    c.LIZIZ("vesdk_event_editor_extract_frame_time", "performance", jSONObject, false, true);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }

    private void beginGenFrameHW(String str, List<Integer> list, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, long j, InterfaceC133855Nd interfaceC133855Nd) {
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((Integer) ListProtector.get(list, i7)).intValue();
        }
        new PthreadThread(new P51(this, str, iArr2, i, i2, i3, i5, i6, interfaceC133855Nd, i4, j, iArr), "EBingoInvoker").start();
    }
}
