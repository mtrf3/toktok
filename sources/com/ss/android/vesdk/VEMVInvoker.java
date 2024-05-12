package com.ss.android.vesdk;

import X.C06540Nm;
import X.C16880lQ;
import X.C63867P4t;
import X.C84049Wyj;
import X.InterfaceC87307YOh;
import X.InterfaceC87313YOn;
import X.P4Q;
import X.X1D;
import X.X1H;
import X.YO9;
import X.YOB;
import X.YOO;
import X.YOU;
import X.YOY;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.model.MVInfoBean;
import com.ss.android.ttve.model.MVResourceBean;
import com.ss.android.ttve.model.VEMVAudioAlgorithmResult;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEMVAlgorithmConfig;
import com.ss.android.vesdk.VEMVParams;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.jni.TEMVInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class VEMVInvoker implements YOO {
    public boolean mIsMVInit;
    public int mMVBackgroundAudioRid;
    public List<Integer> mMVFilterIndex;
    public volatile InterfaceC87313YOn mMVInitListener;
    public String mMVPath;
    public X1H mMVResVideoInfo;
    public String[] mMVResourcePaths;
    public String[] mMVResourceTypes;
    public List<VESize> mMVSize;
    public final TEInterface mNativeEditor;
    public final TEMVInterface mNativeMVHandler;
    public final VEEditor mVEEditor;
    public MVInfoBean mvInfo;
    public VEMVParams.MVResolution mvResolution;
    public int mMVBackgroundAudioTrackIndex = -1;
    public int mMVKaraokeAudioTrackIndex = -1;
    public InterfaceC87307YOh mMVInitedCallback = new YOY(this);

    public void setListenerForMV(InterfaceC87313YOn interfaceC87313YOn) {
    }

    @Override // X.YOO
    public void clearNativeFromMV() {
        this.mNativeMVHandler.clearNative();
    }

    public MVInfoBean getMVInfo() {
        if (this.mIsMVInit) {
            MVInfoBean mVInfoBean = this.mvInfo;
            if (mVInfoBean != null) {
                return mVInfoBean;
            }
            throw new VEException(-1, "MV resource information construction failed!");
        }
        throw new VEException(-1, "The MV resource has not been initialized yet, please call the init2 method");
    }

    @Override // X.YOO
    public VEMVAudioInfo getMVOriginalBackgroundAudio() {
        P4Q.LJII("VEEditor_VEMVInvoker", "getMVOriginalBackgroundAudio");
        if (this.mMVPath == null || this.mMVResourcePaths == null || this.mMVResourceTypes == null) {
            P4Q.LIZJ("VEEditor_VEMVInvoker", "getMVOriginalBackgroundAudio bad input file, please call initMV first");
            return null;
        }
        return (VEMVAudioInfo) this.mNativeMVHandler.getMVOriginalBackgroundAudio();
    }

    public VEMVAlgorithmConfig getServerAlgorithmConfig() {
        P4Q.LJII("VEEditor_VEMVInvoker", "getServerAlgorithmConfig.");
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return (VEMVAlgorithmConfig) this.mNativeMVHandler.getServerAlgorithmConfig();
        }
        P4Q.LIZJ("VEEditor_VEMVInvoker", "getServerAlgorithmConfig error, please call initMV first!");
        throw new IllegalStateException("getServerAlgorithmConfig, initMv is not called!");
    }

    public int getMVBackgroundAudioRid() {
        return this.mMVBackgroundAudioRid;
    }

    public int getMVBackgroundAudioTrackIndex() {
        return this.mMVBackgroundAudioTrackIndex;
    }

    public int getMVKaraokeAudioIndex() {
        return this.mMVKaraokeAudioTrackIndex;
    }

    @Override // X.YOO
    public boolean isMVInitialedInternal() {
        return this.mIsMVInit;
    }

    public VEMVInvoker(VEEditor vEEditor) {
        this.mVEEditor = vEEditor;
        TEInterface tEInterface = vEEditor.LLIIII;
        this.mNativeEditor = tEInterface;
        this.mNativeMVHandler = new TEMVInterface(tEInterface.getNativeHandler());
    }

    @Override // X.YOO
    public void addMVFilterInternal(int i) {
        List<Integer> list = this.mMVFilterIndex;
        if (list != null) {
            list.add(Integer.valueOf(i));
        }
    }

    public Map<Integer, List<MVResourceBean>> getMVUserVideoInfo(String str) {
        if (this.mIsMVInit) {
            if (this.mMVResVideoInfo != null) {
                HashMap hashMap = new HashMap();
                Iterator it = ((ArrayList) this.mMVResVideoInfo.LIZ).iterator();
                while (it.hasNext()) {
                    MVResourceBean mVResourceBean = (MVResourceBean) it.next();
                    if (mVResourceBean.content.equals(str)) {
                        List list = (List) hashMap.get(Integer.valueOf(mVResourceBean.trackIndex));
                        if (list == null) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(mVResourceBean);
                            hashMap.put(Integer.valueOf(mVResourceBean.trackIndex), arrayList);
                        } else {
                            list.add(mVResourceBean);
                            hashMap.put(Integer.valueOf(mVResourceBean.trackIndex), list);
                        }
                    }
                }
                return hashMap;
            }
            throw new VEException(-1, "MV resource information construction failed");
        }
        throw new VEException(-1, "The MV resource has not been initialized yet, please call the init2 method");
    }

    @Override // X.YOO
    public int initMV(VEMVParams vEMVParams) {
        synchronized (this.mVEEditor) {
            try {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("initMV ");
                    LIZ.append(vEMVParams.toString());
                    P4Q.LJFF("VEEditor_VEMVInvoker", X1D.LIZIZ(LIZ));
                    return initMVInternal(vEMVParams.mvPath, vEMVParams.resourcesFilePaths, vEMVParams.resourcesTypes, vEMVParams.mvDuration, vEMVParams.bgmPath, vEMVParams.bgmTrimIn, vEMVParams.bgmTrimOut, vEMVParams.resMV, false, vEMVParams.isSingleVideo, vEMVParams.extraParams, vEMVParams.imgSizes, vEMVParams.backVolume, vEMVParams.originalVolume, vEMVParams.karaokeAudioPaths, vEMVParams.karaokeAudioDurations, vEMVParams.karaokeAudioSpeeds, vEMVParams.customRenderRes, vEMVParams.imageResizeRatio, vEMVParams.resFillMode);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public int setMVAudioBeatAlgorithmResult(VEMVAudioAlgorithmResult vEMVAudioAlgorithmResult) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setMVAudioBeatAlgorithmResult. beatSize : ");
        LIZ.append(vEMVAudioAlgorithmResult.size);
        P4Q.LJII("VEEditor_VEMVInvoker", X1D.LIZIZ(LIZ));
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return this.mNativeMVHandler.setMVAudioBeatAlgorithmResult(vEMVAudioAlgorithmResult);
        }
        P4Q.LIZJ("VEEditor_VEMVInvoker", "setMVAudioBeatAlgorithmResult error, please call initMV first!");
        throw new IllegalStateException("setMVAudioBeatAlgorithmResult, initMv is not called!");
    }

    public int setMVDataJson(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setMVDataJson. json = ");
        LIZ.append(str);
        P4Q.LJII("VEEditor_VEMVInvoker", X1D.LIZIZ(LIZ));
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return this.mNativeMVHandler.setMVDataJson(str);
        }
        P4Q.LIZJ("VEEditor_VEMVInvoker", "setMVDataJson error, please call initMV first!");
        throw new IllegalStateException("setMVDataJson, initMv is not called!");
    }

    @Override // X.YOO
    public int updateMVResources(VEMVParams vEMVParams) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateMVResources ");
        LIZ.append(vEMVParams.toString());
        P4Q.LJII("VEEditor_VEMVInvoker", X1D.LIZIZ(LIZ));
        return reInitMV(vEMVParams.mvPath, vEMVParams.resourcesFilePaths, vEMVParams.resourcesTypes, vEMVParams.mvDuration, null, 0, 0, vEMVParams.resMV, true, vEMVParams.isSingleVideo, vEMVParams.extraParams, vEMVParams.imgSizes, false, vEMVParams.karaokeAudioPaths, vEMVParams.karaokeAudioDurations, vEMVParams.karaokeAudioSpeeds);
    }

    public int updateMVResourcesRecreateEngine(VEMVParams vEMVParams) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateMVResourcesRecreateEngine ");
        LIZ.append(vEMVParams.toString());
        P4Q.LJII("VEEditor_VEMVInvoker", X1D.LIZIZ(LIZ));
        return reInitMV(vEMVParams.mvPath, vEMVParams.resourcesFilePaths, vEMVParams.resourcesTypes, vEMVParams.mvDuration, null, 0, 0, vEMVParams.resMV, true, vEMVParams.isSingleVideo, vEMVParams.extraParams, vEMVParams.imgSizes, true, vEMVParams.karaokeAudioPaths, vEMVParams.karaokeAudioDurations, vEMVParams.karaokeAudioSpeeds);
    }

    public int setMvOriginalAudio(boolean z, float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setMVoriginalAudio... ");
        LIZ.append(z);
        P4Q.LJFF("VEEditor_VEMVInvoker", X1D.LIZIZ(LIZ));
        if (this.mIsMVInit && this.mMVResVideoInfo == null) {
            return -502;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.mMVResVideoInfo.LIZ).iterator();
        while (it.hasNext()) {
            MVResourceBean mVResourceBean = (MVResourceBean) it.next();
            if (!arrayList.contains(Integer.valueOf(mVResourceBean.trackIndex))) {
                arrayList.add(Integer.valueOf(mVResourceBean.trackIndex));
            }
        }
        if (!z) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.mVEEditor.LJJJJ(0.0f, ((Integer) it2.next()).intValue(), 0);
            }
        } else {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                this.mVEEditor.LJJJJ(f, ((Integer) it3.next()).intValue(), 0);
            }
        }
        return 0;
    }

    private List<List<List<MVResourceBean>>> genMVResourceTracks(MVInfoBean mVInfoBean, List<String> list, List<String> list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);
        ArrayList<MVResourceBean> arrayList4 = mVInfoBean.resources;
        ArrayList arrayList5 = new ArrayList();
        while (arrayList5.size() != arrayList4.size()) {
            Iterator<MVResourceBean> it = arrayList4.iterator();
            ArrayList arrayList6 = new ArrayList();
            double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            while (it.hasNext()) {
                MVResourceBean next = it.next();
                if (!arrayList5.contains(Integer.valueOf(next.rid))) {
                    if ("video".equals(next.type) || "img".equals(next.type) || "bgimg".equals(next.type)) {
                        if (next.seqIn >= d) {
                            MVResourceBean mVResourceBean = new MVResourceBean();
                            mVResourceBean.seqIn = next.seqIn * 1000.0d;
                            mVResourceBean.seqOut = next.seqOut * 1000.0d;
                            mVResourceBean.trimIn = next.trimIn * 1000.0d;
                            double d3 = next.trimOut * 1000.0d;
                            mVResourceBean.trimOut = d3;
                            mVResourceBean.musicFadeIn = next.musicFadeIn * 1000.0d;
                            mVResourceBean.musicFadeOut = next.musicFadeOut * 1000.0d;
                            if (d3 == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && ("img".equals(next.type) || "bgimg".equals(next.type))) {
                                mVResourceBean.trimOut = mVResourceBean.seqOut - mVResourceBean.seqIn;
                            }
                            mVResourceBean.content = next.content;
                            mVResourceBean.type = next.type;
                            mVResourceBean.rid = next.rid;
                            mVResourceBean.isLoop = next.isLoop;
                            mVResourceBean.isMute = next.isMute;
                            mVResourceBean.timeMode = next.timeMode;
                            arrayList6.add(mVResourceBean);
                            d = next.seqOut;
                            arrayList5.add(Integer.valueOf(mVResourceBean.rid));
                            list.add(mVResourceBean.content);
                        }
                    } else if ("audio".equals(next.type)) {
                        if (next.seqIn >= d2) {
                            ArrayList arrayList7 = new ArrayList();
                            MVResourceBean mVResourceBean2 = new MVResourceBean();
                            mVResourceBean2.seqIn = next.seqIn * 1000.0d;
                            mVResourceBean2.seqOut = next.seqOut * 1000.0d;
                            mVResourceBean2.trimIn = next.trimIn * 1000.0d;
                            mVResourceBean2.trimOut = next.trimOut * 1000.0d;
                            mVResourceBean2.musicFadeIn = next.musicFadeIn * 1000.0d;
                            mVResourceBean2.musicFadeOut = next.musicFadeOut * 1000.0d;
                            mVResourceBean2.content = next.content;
                            mVResourceBean2.type = next.type;
                            int i = next.rid;
                            mVResourceBean2.rid = i;
                            mVResourceBean2.isLoop = next.isLoop;
                            mVResourceBean2.isMute = next.isMute;
                            mVResourceBean2.timeMode = next.timeMode;
                            if (this.mMVBackgroundAudioRid == 0) {
                                this.mMVBackgroundAudioRid = i;
                            }
                            arrayList7.add(mVResourceBean2);
                            d2 = next.seqOut;
                            arrayList5.add(Integer.valueOf(mVResourceBean2.rid));
                            list2.add(mVResourceBean2.content);
                            if (arrayList7.size() > 0) {
                                arrayList3.add(arrayList7);
                            }
                        }
                    } else if ("text".equals(next.type)) {
                        arrayList5.add(Integer.valueOf(next.rid));
                    } else {
                        arrayList5.add(Integer.valueOf(next.rid));
                    }
                }
            }
            if (arrayList6.size() > 0) {
                arrayList2.add(arrayList6);
            }
        }
        return arrayList;
    }

    public int initMV(String str, String[] strArr, String[] strArr2) {
        synchronized (this.mVEEditor) {
            try {
                try {
                    return initMVInternal(str, strArr, strArr2, null, null, 0, 0, VEMVParams.MVResolution.RES_RANDOM, false, false, null, null, 1.0f, 1.0f, null, null, null, null, null, 0);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public int setExternalAlgorithmResult(String str, String str2, String str3) {
        StringBuilder LIZLLL = C06540Nm.LIZLLL("setExternalAlgorithmResult. photoPath = ", str, ", algorithmType = ", str2, ", filePath = ");
        LIZLLL.append(str3);
        P4Q.LJII("VEEditor_VEMVInvoker", X1D.LIZIZ(LIZLLL));
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return this.mNativeMVHandler.setExternalAlgorithmResult(str, str2, str3, -1);
        }
        P4Q.LIZJ("VEEditor_VEMVInvoker", "setExternalAlgorithmResult error, please call initMV first!");
        throw new IllegalStateException("setExternalAlgorithmResult, initMv is not called!");
    }

    public int updateMVBackgroundAudioTrack(String str, int i, int i2) {
        P4Q.LJII("VEEditor_VEMVInvoker", "updateMVBackgroundAudioTrack");
        return reInitMV(this.mMVPath, this.mMVResourcePaths, this.mMVResourceTypes, null, str, i, i2, this.mvResolution, false, false, null, this.mMVSize, false, null, null, null);
    }

    public int updateMVBackgroundAudioTrack2(String str, int i, int i2) {
        int i3;
        P4Q.LJII("VEEditor_VEMVInvoker", "updateMVBackgroundAudioTrack2...");
        int reInitMV = reInitMV(this.mMVPath, this.mMVResourcePaths, this.mMVResourceTypes, null, null, 0, 0, this.mvResolution, true, false, null, this.mMVSize, false, null, null, null);
        if (reInitMV != 0) {
            P4Q.LIZJ("VEEditor_VEMVInvoker", "updateMVBackgroundAudioTrack2 failed when reinitMV !!!");
            return reInitMV;
        }
        this.mVEEditor.LJJJJ(0.0f, this.mMVBackgroundAudioTrackIndex, 1);
        YOU you = this.mVEEditor.LJLJJL;
        synchronized (you.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addAudioTrack... ");
            LIZ.append(str);
            LIZ.append(" In ");
            LIZ.append(i);
            LIZ.append(" Out ");
            LIZ.append(i2);
            LIZ.append(" ");
            LIZ.append(true);
            P4Q.LJII("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ));
            if (!TextUtils.isEmpty(str)) {
                if (i2 > i && i >= 0) {
                    C63867P4t.LIZLLL("iesve_veeditor_import_music", null);
                    int addAudioTrack = you.LIZIZ.addAudioTrack(str, 0, i2 - i, i, i2, true);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("trackIndexNative=");
                    LIZ2.append(addAudioTrack);
                    P4Q.LIZJ("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ2));
                    int LIZ3 = you.LIZ.LJLZ.LIZ(addAudioTrack);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("path", str);
                        jSONObject.put("trimIn", i);
                        jSONObject.put("trimOut", i2);
                        if (LIZ3 >= 0) {
                            i3 = 0;
                        } else {
                            i3 = -1;
                        }
                        jSONObject.put("resultCode", i3);
                        c.LIZ("vesdk_event_editor_audio_track", "business", jSONObject);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("addAudioTrack... ");
                    LIZ4.append(LIZ3);
                    P4Q.LJII("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ4));
                    return LIZ3;
                }
            }
            return -100;
        }
    }

    @Override // X.YOO
    public int updateMVResources(String str, String[] strArr, String[] strArr2) {
        P4Q.LJII("VEEditor_VEMVInvoker", "updateMVResources");
        return reInitMV(str, strArr, strArr2, null, null, 0, 0, VEMVParams.MVResolution.RES_RANDOM, true, false, null, null, false, null, null, null);
    }

    public int updateMVResourcesRecreateEngine(String str, String[] strArr, String[] strArr2) {
        P4Q.LJII("VEEditor_VEMVInvoker", "updateMVResourcesRecreateEngine");
        return reInitMV(str, strArr, strArr2, null, null, 0, 0, VEMVParams.MVResolution.RES_RANDOM, true, false, null, null, true, null, null, null);
    }

    public int changeMvUserVideoInfoInternal(int i, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr, VEClipSourceParam[] vEClipSourceParamArr) {
        MVResourceBean mVResourceBean;
        if (this.mMVResVideoInfo == null) {
            P4Q.LIZJ("VEEditor_VEMVInvoker", "changeMvUserVideoInfo... mvResInfo was not inited!");
            return -502;
        }
        if ((vEClipTimelineParamArr != null && iArr.length != vEClipTimelineParamArr.length) || (vEClipSourceParamArr != null && iArr.length != vEClipSourceParamArr.length)) {
            P4Q.LIZJ("VEEditor_VEMVInvoker", "changeMvUserVideoInfo... Invalid params!");
            return -1;
        }
        for (int i2 = 0; i2 < ((ArrayList) this.mMVResVideoInfo.LIZ).size(); i2++) {
            int i3 = 0;
            for (int i4 : iArr) {
                X1H x1h = this.mMVResVideoInfo;
                if (i2 < 0) {
                    x1h.getClass();
                    mVResourceBean = null;
                } else {
                    mVResourceBean = (MVResourceBean) ListProtector.get(x1h.LIZ, i2);
                }
                if (mVResourceBean.clipIndex == i4 && mVResourceBean.trackIndex == i) {
                    if (vEClipTimelineParamArr != null) {
                        VEClipTimelineParam vEClipTimelineParam = vEClipTimelineParamArr[i3];
                        mVResourceBean.trimIn = vEClipTimelineParam.trimIn;
                        mVResourceBean.trimOut = vEClipTimelineParam.trimOut;
                    }
                    if (vEClipSourceParamArr != null) {
                        mVResourceBean.content = vEClipSourceParamArr[i3].clipFilePath;
                    }
                    X1H x1h2 = this.mMVResVideoInfo;
                    if (i2 < 0) {
                        x1h2.getClass();
                    } else {
                        ListProtector.set(x1h2.LIZ, i2, mVResourceBean);
                    }
                }
                i3++;
            }
        }
        return 0;
    }

    public int setExternalAlgorithmResult(String str, String str2, String str3, VEMVAlgorithmConfig.MV_REESULT_IN_TYPE mv_reesult_in_type) {
        StringBuilder LIZLLL = C06540Nm.LIZLLL("setExternalAlgorithmResult. photoPath = ", str, ", algorithmType = ", str2, ", result = ");
        LIZLLL.append(str3);
        LIZLLL.append(", type = ");
        LIZLLL.append(mv_reesult_in_type);
        P4Q.LJII("VEEditor_VEMVInvoker", X1D.LIZIZ(LIZLLL));
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return this.mNativeMVHandler.setExternalAlgorithmResult(str, str2, str3, mv_reesult_in_type.ordinal());
        }
        P4Q.LIZJ("VEEditor_VEMVInvoker", "setExternalAlgorithmResult error, please call initMV first!");
        throw new IllegalStateException("setExternalAlgorithmResult, initMv is not called!");
    }

    public int initMV(String str, String[] strArr, String[] strArr2, int[] iArr, boolean z) {
        synchronized (this.mVEEditor) {
            try {
                try {
                    return initMVInternal(str, strArr, strArr2, iArr, null, 0, 0, VEMVParams.MVResolution.RES_RANDOM, false, z, null, null, 1.0f, 1.0f, null, null, null, null, null, 0);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public int updateMVResources(String str, String[] strArr, String[] strArr2, int[] iArr, boolean z) {
        P4Q.LJII("VEEditor_VEMVInvoker", "updateMVResources");
        return reInitMV(str, strArr, strArr2, iArr, null, 0, 0, VEMVParams.MVResolution.RES_RANDOM, true, z, null, null, false, null, null, null);
    }

    @Override // X.YOO
    public int initMV(String str, String[] strArr, String[] strArr2, String str2, int i, int i2) {
        synchronized (this.mVEEditor) {
            try {
                try {
                    return initMVInternal(str, strArr, strArr2, null, str2, i, i2, VEMVParams.MVResolution.RES_RANDOM, false, false, null, null, 1.0f, 1.0f, null, null, null, null, null, 0);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    private boolean genResourcesArrCycle(MVResourceBean mVResourceBean, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr, int[] iArr5, int i) {
        int i2 = (int) (mVResourceBean.seqOut - mVResourceBean.seqIn);
        if (i <= 0) {
            P4Q.LIZJ("VEEditor_VEMVInvoker", "mvDuration invalied ...");
            return false;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i3 + i2;
            if (i5 > i) {
                break;
            }
            iArr[i4] = (int) mVResourceBean.trimIn;
            iArr2[i4] = (int) mVResourceBean.trimOut;
            iArr3[i4] = ((int) mVResourceBean.seqIn) + i3;
            iArr4[i4] = ((int) mVResourceBean.seqOut) + i3;
            strArr[i4] = mVResourceBean.content;
            iArr5[i4] = mVResourceBean.rid;
            i4++;
            i3 = i5;
        }
        if (i3 < i) {
            iArr[i4] = 0;
            iArr2[i4] = i - i3;
            iArr3[i4] = ((int) mVResourceBean.seqIn) + i3;
            iArr4[i4] = i;
            strArr[i4] = mVResourceBean.content;
            iArr5[i4] = mVResourceBean.rid;
            return true;
        }
        return true;
    }

    private boolean genResourcesArrRepeat(MVResourceBean mVResourceBean, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr, int[] iArr5, int i) {
        int i2 = (int) (mVResourceBean.trimOut - mVResourceBean.trimIn);
        int i3 = (int) mVResourceBean.seqIn;
        for (int i4 = 0; i4 < i; i4++) {
            strArr[i4] = mVResourceBean.content;
            iArr5[i4] = mVResourceBean.rid;
            iArr[i4] = (int) mVResourceBean.trimIn;
            iArr2[i4] = (int) mVResourceBean.trimOut;
            iArr3[i4] = i3;
            i3 += i2;
            iArr4[i4] = i3;
        }
        int i5 = i - 1;
        int i6 = (int) mVResourceBean.seqOut;
        iArr4[i5] = i6;
        iArr2[i5] = (i6 - iArr3[i5]) + iArr[i5];
        return true;
    }

    private void genResourcesArr(List<MVResourceBean> list, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr, int[] iArr5, int i, boolean[] zArr) {
        MVResourceBean mVResourceBean;
        int i2 = 0;
        for (MVResourceBean mVResourceBean2 : list) {
            iArr[i2] = (int) mVResourceBean2.trimIn;
            iArr2[i2] = (int) mVResourceBean2.trimOut;
            iArr3[i2] = (int) mVResourceBean2.seqIn;
            iArr4[i2] = (int) mVResourceBean2.seqOut;
            strArr[i2] = mVResourceBean2.content;
            iArr5[i2] = mVResourceBean2.rid;
            zArr[i2] = mVResourceBean2.isMute;
            mVResourceBean2.trackIndex = i;
            mVResourceBean2.clipIndex = i2;
            i2++;
            if (Arrays.asList(this.mMVResourcePaths).contains(mVResourceBean2.content)) {
                int i3 = 0;
                while (true) {
                    if (i3 < ((ArrayList) this.mMVResVideoInfo.LIZ).size()) {
                        X1H x1h = this.mMVResVideoInfo;
                        if (i3 < 0) {
                            x1h.getClass();
                            mVResourceBean = null;
                        } else {
                            mVResourceBean = (MVResourceBean) ListProtector.get(x1h.LIZ, i3);
                        }
                        if (mVResourceBean.content.equals(mVResourceBean2.content) && mVResourceBean.trackIndex == -1) {
                            X1H x1h2 = this.mMVResVideoInfo;
                            if (i3 < 0) {
                                x1h2.getClass();
                            } else {
                                ListProtector.set(x1h2.LIZ, i3, mVResourceBean2);
                            }
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
    }

    private int reInitMV(String str, String[] strArr, String[] strArr2, int[] iArr, String str2, int i, int i2, VEMVParams.MVResolution mVResolution, boolean z, boolean z2, String[] strArr3, List<VESize> list, boolean z3, String[] strArr4, int[] iArr2, float[] fArr) {
        synchronized (this.mVEEditor) {
            try {
                P4Q.LJFF("VEEditor_VEMVInvoker", "reinitMV...");
                try {
                    if (str != null && strArr != null && strArr2 != null) {
                        this.mVEEditor.LJJIJIIJIL(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                        if (z3) {
                            YOB yob = this.mVEEditor.LJLZ;
                            yob.LIZ = -1;
                            yob.LIZIZ = -1;
                            ((ArrayList) yob.LIZJ).clear();
                            ((ArrayList) yob.LIZLLL).clear();
                            int releaseEngine = this.mNativeEditor.releaseEngine();
                            if (releaseEngine != 0) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("stop in reInitMV failed, ret = ");
                                LIZ.append(releaseEngine);
                                P4Q.LJFF("VEEditor_VEMVInvoker", X1D.LIZIZ(LIZ));
                                return -1;
                            }
                        } else {
                            int stop = this.mNativeEditor.stop();
                            if (stop != 0) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("release in reInitMV failed, ret = ");
                                LIZ2.append(stop);
                                P4Q.LJFF("VEEditor_VEMVInvoker", X1D.LIZIZ(LIZ2));
                                return -1;
                            }
                        }
                        this.mMVBackgroundAudioRid = 0;
                        this.mMVKaraokeAudioTrackIndex = -1;
                        int size = this.mMVFilterIndex.size();
                        int[] iArr3 = new int[size];
                        for (int i3 = 0; i3 < this.mMVFilterIndex.size(); i3++) {
                            iArr3[i3] = this.mMVFilterIndex.get(i3).intValue();
                        }
                        YO9 yo9 = this.mVEEditor.LJLJJI;
                        yo9.getClass();
                        P4Q.LJFF("VEEditor_VEFilterInvoker", "deleteFilterEffects...");
                        for (int i4 = 0; i4 < size; i4++) {
                            yo9.LIZ.LLJILJILJ.LIZJ(0, iArr3[i4]);
                        }
                        yo9.LIZIZ.removeFilter(iArr3);
                        try {
                            int initMVInternal = initMVInternal(str, strArr, strArr2, iArr, str2, i, i2, mVResolution, z, z2, strArr3, list, 1.0f, 1.0f, strArr4, iArr2, fArr, null, null, 0);
                            if (initMVInternal != 0) {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("init2 in reInitMV failed, ret = ");
                                LIZ3.append(initMVInternal);
                                P4Q.LIZJ("VEEditor_VEMVInvoker", X1D.LIZIZ(LIZ3));
                                return initMVInternal;
                            }
                            this.mNativeEditor.createTimeline();
                            int prepareEngine = this.mNativeEditor.prepareEngine(0);
                            this.mNativeEditor.updateTrackFilter(0, 0, false);
                            VEEditor vEEditor = this.mVEEditor;
                            C84049Wyj c84049Wyj = vEEditor.LJLJJI.LJII;
                            if (c84049Wyj != null) {
                                vEEditor.LJJIJL(c84049Wyj.LIZ);
                            }
                            return prepareEngine;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            throw th;
                        }
                    }
                    P4Q.LJFF("VEEditor_VEMVInvoker", "reinitMV bad input file, please call init2 first");
                    return -205;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x05d8, code lost:
    
        if (r53 > 0) goto L120;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int initMVInternal(java.lang.String r58, java.lang.String[] r59, java.lang.String[] r60, int[] r61, java.lang.String r62, int r63, int r64, com.ss.android.vesdk.VEMVParams.MVResolution r65, boolean r66, boolean r67, java.lang.String[] r68, java.util.List<com.ss.android.vesdk.VESize> r69, float r70, float r71, java.lang.String[] r72, int[] r73, float[] r74, com.ss.android.vesdk.VESize r75, com.ss.android.vesdk.VESize r76, int r77) {
        /*
            Method dump skipped, instructions count: 1516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEMVInvoker.initMVInternal(java.lang.String, java.lang.String[], java.lang.String[], int[], java.lang.String, int, int, com.ss.android.vesdk.VEMVParams$MVResolution, boolean, boolean, java.lang.String[], java.util.List, float, float, java.lang.String[], int[], float[], com.ss.android.vesdk.VESize, com.ss.android.vesdk.VESize, int):int");
    }
}
