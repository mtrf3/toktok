package com.ss.android.vesdk;

import X.AbstractC84025WyL;
import X.AbstractC84033WyT;
import X.C16880lQ;
import X.C63081OpJ;
import X.C63856P4i;
import X.C63867P4t;
import X.C63868P4u;
import X.C63870P4w;
import X.C63878P5e;
import X.C63913P6n;
import X.C63922P6w;
import X.C63962P8k;
import X.C63963P8l;
import X.C63964P8m;
import X.C63965P8n;
import X.C78866UxK;
import X.C83932Wwq;
import X.C84002Wxy;
import X.C84032WyS;
import X.C84035WyV;
import X.C84092WzQ;
import X.EnumC83975WxX;
import X.InterfaceC63955P8d;
import X.InterfaceC63961P8j;
import X.InterfaceC83705WtB;
import X.InterfaceC84051Wyl;
import X.InterfaceC84052Wym;
import X.InterfaceC84100WzY;
import X.P4Q;
import X.P8W;
import X.P8X;
import X.X03;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.effect.IEffect;
import com.ss.android.vesdk.lens.VEAdaptiveSharpenParams;
import com.ss.android.vesdk.lens.VEBaseRecorderLensParams;
import com.ss.android.vesdk.lens.VETaintSceneDetectParams;
import com.ss.android.vesdk.runtime.VERuntime;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VERecorder {
    public AbstractC84033WyT LIZ;
    public final AbstractC84025WyL LIZIZ;
    public final VERuntime LIZJ;
    public InterfaceC83705WtB LIZLLL;

    /* loaded from: classes12.dex */
    public interface IVEFrameShotScreenCallback {
        void onShotScreen(VEFrame vEFrame, int i);
    }

    /* loaded from: classes12.dex */
    public interface OnFrameAvailableListenerExt {
        void OnFrameAvailable(VEFrame vEFrame);

        C63913P6n config();
    }

    public final IEffect LIZIZ() {
        return this.LIZIZ.getEffect();
    }

    public final void LJ() {
        P4Q.LJII("VERecorder", "onDestroy...");
        AbstractC84025WyL abstractC84025WyL = this.LIZIZ;
        if (abstractC84025WyL != null) {
            abstractC84025WyL.onDestroy();
        }
        AbstractC84033WyT abstractC84033WyT = this.LIZ;
        if (abstractC84033WyT != null) {
            List<String> list = abstractC84033WyT.LIZJ;
            if (list != null) {
                ((ArrayList) list).clear();
                abstractC84033WyT.LIZJ = null;
            }
            List<String> list2 = abstractC84033WyT.LIZLLL;
            if (list2 != null) {
                ((ArrayList) list2).clear();
                abstractC84033WyT.LIZLLL = null;
            }
        }
    }

    public final AbstractC84025WyL LIZJ(Context context) {
        AbstractC84033WyT abstractC84033WyT = this.LIZ;
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_use_titan_recorder_engine");
        if (value != null && value.getValue() != null && (value.getValue() instanceof Boolean) && ((Boolean) value.getValue()).booleanValue()) {
            P4Q.LJFF("TERecordFactory", "KEY_USE_TITAN_RECORDER_ENGINE");
            C63868P4u.LJ(0, 1L, "te_record_instance_type");
            VERuntime.getInstance().enableRefactorRecorder(true);
            return new C84092WzQ(context, abstractC84033WyT);
        }
        if (VERuntime.getInstance().isEnableRefactorRecorder()) {
            C63868P4u.LJ(0, 1L, "te_record_instance_type");
            P4Q.LJFF("TERecordFactory", "KEY_USE_TITAN_RECORDER_ENGINE");
            return new C84092WzQ(context, abstractC84033WyT);
        }
        C63868P4u.LJ(0, 0L, "te_record_instance_type");
        VERuntime.getInstance().enableRefactorRecorder(false);
        return new TECameraVideoRecorder(context, abstractC84033WyT, null);
    }

    public final void LJIIJ(EnumC83975WxX enumC83975WxX) {
        this.LIZIZ.setMultiCamMode(enumC83975WxX);
    }

    public final void LJIILIIL(C63965P8n c63965P8n) {
        IVEFrameShotScreenCallback iVEFrameShotScreenCallback;
        long currentTimeMillis = System.currentTimeMillis();
        C63856P4i.LIZ(1L, "ve_use_camera");
        InterfaceC63961P8j interfaceC63961P8j = c63965P8n.LJI;
        if (interfaceC63961P8j != null) {
            c63965P8n.LJI = new C63964P8m(c63965P8n, currentTimeMillis, interfaceC63961P8j);
        }
        InterfaceC63955P8d interfaceC63955P8d = c63965P8n.LJII;
        if (interfaceC63955P8d != null) {
            c63965P8n.LJII = new C63962P8k(c63965P8n, currentTimeMillis, interfaceC63955P8d);
        }
        if (interfaceC63961P8j == null && interfaceC63955P8d == null && (iVEFrameShotScreenCallback = c63965P8n.LJIIIIZZ) != null) {
            c63965P8n.LJIIIIZZ = new C63963P8l(c63965P8n, currentTimeMillis, iVEFrameShotScreenCallback);
        }
        this.LIZIZ.shotScreen(c63965P8n);
    }

    public final void LJIILJJIL(InterfaceC84052Wym interfaceC84052Wym) {
        int stopRecord = this.LIZIZ.stopRecord(interfaceC84052Wym);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", stopRecord);
            c.LIZ("vesdk_event_recorder_record_finish", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public VERecorder(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            this.LIZ = new C84032WyS(str);
            this.LIZJ = VERuntime.getInstance();
            this.LIZIZ = LIZJ(context);
            return;
        }
        throw new VEException(-100, "workSpace is null");
    }

    public final void LIZ(String str, InterfaceC84051Wyl interfaceC84051Wyl) {
        try {
            AbstractC84033WyT abstractC84033WyT = this.LIZ;
            abstractC84033WyT.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C63878P5e.LIZIZ(abstractC84033WyT.LIZ, "concat"));
            String str2 = File.separator;
            LIZ.append(str2);
            LIZ.append("concat");
            LIZ.append(".mp4");
            abstractC84033WyT.LJ = X1D.LIZIZ(LIZ);
            AbstractC84033WyT abstractC84033WyT2 = this.LIZ;
            abstractC84033WyT2.getClass();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C63878P5e.LIZIZ(abstractC84033WyT2.LIZ, "concat"));
            LIZ2.append(str2);
            LIZ2.append("concat");
            LIZ2.append(".wav");
            abstractC84033WyT2.LJFF = X1D.LIZIZ(LIZ2);
            String LIZIZ = this.LIZ.LIZIZ();
            String LIZ3 = this.LIZ.LIZ();
            String LJFF = i0.LJFF(LIZIZ, ".tmp");
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(LIZ3);
            LIZ4.append(".tmp");
            String LIZIZ2 = X1D.LIZIZ(LIZ4);
            VEFileUtils.deleteFile(LJFF);
            VEFileUtils.deleteFile(LIZIZ2);
            VEFileUtils.renameFile(LIZIZ, LJFF);
            VEFileUtils.renameFile(LIZ3, LIZIZ2);
            if (this.LIZIZ.getCurRecordMode() != VERecordMode.DUET) {
                this.LIZIZ.getCurRecordMode();
            }
            this.LIZIZ.concatAsync(LIZIZ, LIZ3, 0, str, "", new C84035WyV(LIZIZ, LJFF, LIZ3, LIZIZ2, interfaceC84051Wyl), -1);
        } catch (VEException e) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("No need to concat because: ");
            LIZ5.append(e.getMsgDes());
            C63922P6w.LIZIZ("VERecorder", X1D.LIZIZ(LIZ5));
            interfaceC84051Wyl.LIZIZ(-108, "", "");
        }
    }

    public final int LJI(int i, float f) {
        C63870P4w c63870P4w = new C63870P4w();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("iesve_verecorder_");
        LIZ.append(C63081OpJ.LJIJI(i));
        LIZ.append("_level");
        c63870P4w.LIZ(f, X1D.LIZIZ(LIZ));
        c63870P4w.LIZIZ(1, "old");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("iesve_verecorder_");
        LIZ2.append(C63081OpJ.LJIJI(i));
        LIZ2.append("_level");
        C63867P4t.LIZLLL(X1D.LIZIZ(LIZ2), c63870P4w);
        return this.LIZIZ.setBeautyIntensity(i, f);
    }

    public final void LJIIIZ(VEBaseRecorderLensParams vEBaseRecorderLensParams, X03 x03) {
        int i = vEBaseRecorderLensParams.algorithmFlag;
        if (i != 15) {
            if (i != 21) {
                if (i != 24) {
                    if (i != 27) {
                        if (i != 28) {
                            this.LIZIZ.setLensParams(vEBaseRecorderLensParams, x03);
                            return;
                        } else {
                            this.LIZIZ.setLensParams(vEBaseRecorderLensParams, x03);
                            return;
                        }
                    }
                } else {
                    VEAdaptiveSharpenParams vEAdaptiveSharpenParams = (VEAdaptiveSharpenParams) vEBaseRecorderLensParams;
                    VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_asf_amount");
                    if (value != null && value.getValue() != null && (value.getValue() instanceof Float)) {
                        vEAdaptiveSharpenParams.amount = ((Float) value.getValue()).floatValue();
                    }
                    VEConfigCenter.ValuePkt value2 = VEConfigCenter.getInstance().getValue("ve_asf_over_ratio");
                    if (value2 != null && value2.getValue() != null && (value2.getValue() instanceof Float)) {
                        vEAdaptiveSharpenParams.overRatio = ((Float) value2.getValue()).floatValue();
                    }
                    VEConfigCenter.ValuePkt value3 = VEConfigCenter.getInstance().getValue("ve_asf_gpu_power_level");
                    if (value3 != null && value3.getValue() != null && (value3.getValue() instanceof Integer)) {
                        vEAdaptiveSharpenParams.powerLevelPara = ((Integer) value3.getValue()).intValue();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("powerLevelPara: ");
                        LIZ.append(value3.getValue());
                        P4Q.LJFF("VERecorder", X1D.LIZIZ(LIZ));
                    }
                    VEConfigCenter.ValuePkt value4 = VEConfigCenter.getInstance().getValue("ve_asf_init_delay_frame_cnt");
                    if (value4 != null && value4.getValue() != null && (value4.getValue() instanceof Integer)) {
                        vEAdaptiveSharpenParams.initDelayFrameCnt = ((Integer) value4.getValue()).intValue();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("initDelayFrameCnt: ");
                        LIZ2.append(value4.getValue());
                        P4Q.LJFF("VERecorder", X1D.LIZIZ(LIZ2));
                    }
                    VEConfigCenter.ValuePkt value5 = VEConfigCenter.getInstance().getValue("ve_asf_process_delay_frame_cnt");
                    if (value5 != null && value5.getValue() != null && (value5.getValue() instanceof Integer)) {
                        vEAdaptiveSharpenParams.processDelayFrameCnt = ((Integer) value5.getValue()).intValue();
                    }
                    this.LIZIZ.setLensParams(vEBaseRecorderLensParams, x03);
                    return;
                }
            } else {
                VETaintSceneDetectParams vETaintSceneDetectParams = (VETaintSceneDetectParams) vEBaseRecorderLensParams;
                InterfaceC83705WtB interfaceC83705WtB = this.LIZLLL;
                if (interfaceC83705WtB == null) {
                    return;
                }
                interfaceC83705WtB.LIZ(new C84002Wxy(this, vETaintSceneDetectParams, x03));
                return;
            }
        }
        this.LIZIZ.setLensParams(vEBaseRecorderLensParams, x03);
    }

    public VERecorder(C83932Wwq c83932Wwq, Context context) {
        this.LIZ = c83932Wwq;
        this.LIZJ = VERuntime.getInstance();
        this.LIZIZ = LIZJ(context);
    }

    public final void LJII(String[] strArr, int i, String[] strArr2) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_SET_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        P4Q.LJII("VERecorder", "setComposerNodesWithTag...");
        if (vEEffectParams.stringArrayOne.size() != i || vEEffectParams.stringArrayTwo.size() != i) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Nodes size=");
            LIZ.append(vEEffectParams.stringArrayOne.size());
            LIZ.append(", tags size=");
            LIZ.append(vEEffectParams.stringArrayTwo.size());
            LIZ.append(", but nodeNum=");
            LIZ.append(i);
            P4Q.LIZJ("VERecorder", X1D.LIZIZ(LIZ));
            return;
        }
        int vEEffectParams2 = this.LIZIZ.setVEEffectParams(vEEffectParams);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", Arrays.toString(strArr));
            jSONObject.put("nodeTag", Arrays.toString(strArr2));
            jSONObject.put("nodeValue", String.valueOf(i));
            jSONObject.put("resultCode", String.valueOf(vEEffectParams2));
            c.LIZ("vesdk_event_recorder_composer", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final int LJIIIIZZ(String str, float f, float f2) {
        C63870P4w c63870P4w = new C63870P4w();
        c63870P4w.LIZ(f, "iesve_verecorder_set_bigeyes_smallface_level");
        c63870P4w.LIZIZ(1, "old");
        C63867P4t.LIZLLL("iesve_verecorder_set_bigeyes_smallface", c63870P4w);
        int faceReshape = this.LIZIZ.setFaceReshape(str, f, f2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("strResPath", str);
            jSONObject.put("fEyeIntensity", String.valueOf(f));
            jSONObject.put("fCheekIntensity", String.valueOf(f2));
            jSONObject.put("resultCode", faceReshape);
            c.LIZ("vesdk_event_recorder_face_reshape", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return faceReshape;
    }

    public final int LJIILL(String str, String str2, float f) {
        int updateComposerNode = this.LIZIZ.updateComposerNode(str, str2, f);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", str);
            jSONObject.put("nodeTag", str2);
            jSONObject.put("nodeValue", String.valueOf(f));
            jSONObject.put("resultCode", String.valueOf(updateComposerNode));
            c.LIZ("vesdk_event_recorder_composer", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return updateComposerNode;
    }

    public final int LIZLLL(VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, VEPreviewSettings vEPreviewSettings, boolean z) {
        C78866UxK.LJIJ("VECamera-VERecorder-init");
        long currentTimeMillis = System.currentTimeMillis();
        int i = -1;
        try {
            try {
                try {
                    int init = this.LIZIZ.init((InterfaceC84100WzY) null, vEVideoEncodeSettings, vEAudioEncodeSettings, vEPreviewSettings, this.LIZ.LIZJ(), this.LIZJ.getEnv().LIZ(), z);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", System.currentTimeMillis() - currentTimeMillis);
                        c.LIZ("vesdk_event_recorder_init", "performance", jSONObject);
                        return init;
                    } catch (JSONException e) {
                        e = e;
                        i = init;
                        C16880lQ.LLLLIIL(e);
                        return i;
                    }
                } catch (NullPointerException e2) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("init failed: VESDK need to be init: ");
                    LIZ.append(Log.getStackTraceString(e2));
                    throw new VEException(-1, X1D.LIZIZ(LIZ));
                }
            } catch (JSONException e3) {
                e = e3;
            }
        } finally {
            C78866UxK.LJJIIJ();
        }
    }

    public final void LJFF(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_REPLACE_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i;
        vEEffectParams.intValueTwo = i2;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        vEEffectParams.stringArrayThree = new ArrayList<>(Arrays.asList(strArr3));
        P4Q.LJII("VERecorder", "replaceComposerNodes...");
        this.LIZIZ.setVEEffectParams(vEEffectParams);
    }

    public final void LJIIJJI(int i, int i2, InterfaceC63955P8d interfaceC63955P8d, boolean z, IVEFrameShotScreenCallback iVEFrameShotScreenCallback) {
        this.LIZIZ.shotScreen(i, i2, true, (InterfaceC63955P8d) new P8W(i, i2, System.currentTimeMillis(), interfaceC63955P8d), z, iVEFrameShotScreenCallback, true);
    }

    public final void LJIIL(int i, int i2, boolean z, boolean z2, InterfaceC63955P8d interfaceC63955P8d, boolean z3) {
        long currentTimeMillis = System.currentTimeMillis();
        C63856P4i.LIZ(1L, "ve_use_camera");
        this.LIZIZ.shotScreen(i, i2, z, z2, new P8X(i, i2, z3, z2, currentTimeMillis, interfaceC63955P8d));
    }
}
