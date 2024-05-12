package X;

import android.text.TextUtils;
import com.bef.effectsdk.message.MessageCenter;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.vesdk.VEARCoreParam;
import com.ss.android.vesdk.VECherEffectParam;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VETouchPointer;
import com.ss.android.vesdk.effect.IEffect;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import jp3.c;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.WyK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84024WyK implements InterfaceC83727WtX {
    public final List<InterfaceC83327Wn5> LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public final List<MessageCenter.Listener> LIZLLL;
    public final C84031WyR LJ;
    public final C84027WyN LJFF;
    public final C62822Ol8 LJI;
    public final VERecorder LJII;
    public final InterfaceC65784Pro<Boolean> LJIIIIZZ;
    public final InterfaceC83927Wwl LJIIIZ;

    public final C84023WyJ LIZ() {
        return (C84023WyJ) this.LJI.getValue();
    }

    @Override // X.InterfaceC83727WtX
    public final void T9() {
        this.LIZIZ = false;
    }

    @Override // X.InterfaceC83727WtX
    public final int D9() {
        return this.LJII.LIZIZ.setSlamFace(null);
    }

    @Override // X.InterfaceC83727WtX
    public final void G9() {
        this.LJII.LIZIZ.unRegSkeletonDetectCallback();
    }

    @Override // X.InterfaceC83727WtX
    public final void K1() {
        this.LJII.LIZIZ.handleEffectAudioPlay(false);
    }

    @Override // X.InterfaceC83727WtX
    public final void LLIIIILZ() {
        this.LJII.LIZIZ.slamNotifyHideKeyBoard(true);
    }

    @Override // X.InterfaceC83727WtX
    public final ICH S9() {
        return this.LJII.LIZIZ.getVideoController();
    }

    @Override // X.InterfaceC83727WtX
    public final HYA V9() {
        return this.LJII.LIZIZ.getEffectStickerLagInfo();
    }

    @Override // X.InterfaceC83727WtX
    public final C78941UyX aa() {
        return this.LJII.LIZIZ.getEffectFrameCostStatistics();
    }

    @Override // X.InterfaceC83727WtX
    public final String ca() {
        return this.LJII.LIZIZ.getComposerNodePaths();
    }

    @Override // X.InterfaceC83727WtX
    public final void da() {
        this.LJII.LIZIZ.setForceAlgorithmExecuteCount(3);
    }

    @Override // X.InterfaceC83727WtX
    public final void ia() {
        this.LJII.LIZIZ.resetEffectFrameCostStatistics();
    }

    @Override // X.InterfaceC83727WtX
    public final void la() {
        if (!this.LIZJ) {
            VERecorder vERecorder = this.LJII;
            vERecorder.LIZIZ.regFaceInfoCallback(this.LJFF);
            this.LIZJ = true;
        }
    }

    @Override // X.InterfaceC83192Wku
    public final void j() {
        LIZ().j();
    }

    @Override // X.InterfaceC83192Wku
    public final void k() {
        LIZ().k();
    }

    @Override // X.InterfaceC83192Wku
    public final InterfaceC45910I0c l() {
        C84023WyJ LIZ = LIZ();
        LIZ.getClass();
        return new C84020WyG(LIZ);
    }

    @Override // X.InterfaceC83727WtX
    public final int B0(float f) {
        return this.LJII.LJI(9, f);
    }

    @Override // X.InterfaceC83727WtX
    public final void C0(boolean z) {
        this.LJII.LIZIZ.setLargeMattingModelEnable(z);
    }

    @Override // X.InterfaceC83727WtX
    public final void C9(InterfaceC83974WxW interfaceC83974WxW) {
        VERecorder vERecorder = this.LJII;
        vERecorder.LIZIZ.slamGetTextParagraphContent(new C84011Wy7(interfaceC83974WxW));
    }

    @Override // X.InterfaceC83727WtX
    public final void D0(boolean z) {
        this.LJII.LIZIZ.setEffectSlamEnable(z);
    }

    @Override // X.InterfaceC83727WtX
    public final void F9(C83743Wtn c83743Wtn) {
        AbstractC84025WyL abstractC84025WyL = this.LJII.LIZIZ;
        if (abstractC84025WyL != null) {
            abstractC84025WyL.setDetectListener(c83743Wtn, 0);
        }
    }

    @Override // X.InterfaceC83727WtX
    public final void G7(C29S context) {
        o.LJIIIZ(context, "context");
        this.LJII.LIZIZ.handleEffectAudioPlay(true);
    }

    @Override // X.InterfaceC83727WtX
    public final void H9(MessageCenter.Listener messageListener) {
        o.LJIIIZ(messageListener, "messageListener");
        synchronized (this.LIZLLL) {
            ((ArrayList) this.LIZLLL).remove(messageListener);
            if (this.LIZIZ && ((ArrayList) this.LIZLLL).isEmpty()) {
                this.LJII.LIZIZ.setEffectMessageListener(null);
                this.LIZIZ = false;
            }
        }
    }

    @Override // X.InterfaceC83727WtX
    public final void I9(String str) {
        this.LJII.LIZIZ.setMusicNodes(str);
    }

    @Override // X.InterfaceC83727WtX
    public final void K8(C84046Wyg c84046Wyg) {
        this.LJII.LIZIZ.mVECherEffectParamCallback = c84046Wyg;
    }

    @Override // X.InterfaceC83727WtX
    public final void K9(WSU wsu) {
        VERecorder vERecorder = this.LJII;
        vERecorder.LIZIZ.regSkeletonDetectCallback(new C84038WyY(wsu));
    }

    @Override // X.InterfaceC83727WtX
    public final void L9(MessageCenter.Listener messageListener) {
        o.LJIIIZ(messageListener, "messageListener");
        synchronized (this.LIZLLL) {
            if (!((ArrayList) this.LIZLLL).contains(messageListener)) {
                ((ArrayList) this.LIZLLL).add(messageListener);
            }
            if (!this.LIZIZ && (!((ArrayList) this.LIZLLL).isEmpty())) {
                this.LIZIZ = true;
                this.LJII.LIZIZ.setEffectMessageListener(this.LJ);
            }
        }
    }

    @Override // X.InterfaceC83727WtX
    public final void LJJIJLIJ(boolean z) {
        this.LJII.LIZIZ.enableEffect(z);
    }

    @Override // X.InterfaceC83727WtX
    public final void M9(C83590WrK c83590WrK) {
        VERecorder vERecorder = this.LJII;
        vERecorder.LIZIZ.slamGetTextLimitCount(new C79081V1x(c83590WrK));
    }

    @Override // X.InterfaceC83727WtX
    public final void N9(double d) {
        this.LJII.LIZIZ.setVideoBgSpeed(d);
    }

    @Override // X.InterfaceC83727WtX
    public final void O9(X0W landmarkListener) {
        o.LJIIIZ(landmarkListener, "landmarkListener");
        this.LJII.LIZIZ.addLandMarkDetectListener(landmarkListener);
    }

    @Override // X.InterfaceC83727WtX
    public final void U9(float f) {
        this.LJII.LJI(1, f);
    }

    @Override // X.InterfaceC83727WtX
    public final void W9(IB4 ib4) {
        this.LJII.LIZIZ.setStickerRequestCallback(ib4);
    }

    @Override // X.InterfaceC83727WtX
    public final VEFrame ea(String str) {
        C84041Wyb c84041Wyb = new C84041Wyb();
        c84041Wyb.LIZIZ = str;
        c84041Wyb.LIZ = 1;
        return this.LJII.LIZIZ.getFrameByConfig(c84041Wyb);
    }

    @Override // X.InterfaceC83727WtX
    public final int fa(VEEffectFilterParam vEEffectFilterParam) {
        return this.LJII.LIZIZ.switchEffect(vEEffectFilterParam);
    }

    @Override // X.InterfaceC83727WtX
    public final float getFilterIntensity(String filterPath) {
        o.LJIIIZ(filterPath, "filterPath");
        VERecorder vERecorder = this.LJII;
        vERecorder.getClass();
        if (TextUtils.isEmpty(filterPath)) {
            return -1.0f;
        }
        return vERecorder.LIZIZ.getFilterIntensity(filterPath);
    }

    @Override // X.InterfaceC83727WtX
    public final void ha(InterfaceC83327Wn5 callback) {
        o.LJIIIZ(callback, "callback");
        ((ArrayList) this.LIZ).add(callback);
    }

    @Override // X.InterfaceC83727WtX
    public final void ja(X0W landmarkListener) {
        o.LJIIIZ(landmarkListener, "landmarkListener");
        this.LJII.LIZIZ.removeLandMarkDetectListener(landmarkListener);
    }

    @Override // X.InterfaceC83192Wku
    public final void m(List<ComposerInfo> list) {
        LIZ().m(list);
    }

    @Override // X.InterfaceC83727WtX
    public final void na(InterfaceC83327Wn5 callback) {
        o.LJIIIZ(callback, "callback");
        ((ArrayList) this.LIZ).remove(callback);
    }

    @Override // X.InterfaceC83727WtX
    public final void pauseEffectAudio(boolean z) {
        this.LJII.LIZIZ.pauseEffectAudio(z);
    }

    @Override // X.InterfaceC83727WtX
    public final void setARCoreParam(VEARCoreParam vEARCoreParam) {
        IEffect LIZIZ = this.LJII.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.setARCoreParam(vEARCoreParam);
        }
    }

    @Override // X.InterfaceC83727WtX
    public final void setDetectInterval(int i) {
        this.LJII.LIZIZ.setDetectInterval(i);
    }

    @Override // X.InterfaceC83727WtX
    public final void setFilter(String str) {
        String str2;
        VERecorder vERecorder = this.LJII;
        vERecorder.getClass();
        C63870P4w c63870P4w = new C63870P4w();
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split(File.separator);
                if (split.length > 0) {
                    str2 = split[split.length - 1];
                    float min = Math.min(1.0f, Math.max(0.0f, 0.0f));
                    c63870P4w.LIZJ("iesve_verecorder_set_filter_click_idfilter_id", str2);
                    c63870P4w.LIZIZ(1, "old");
                    C63867P4t.LIZLLL("iesve_verecorder_set_filter_click", c63870P4w);
                    int filter = vERecorder.LIZIZ.setFilter(str, min, true);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("filterId", str2);
                    jSONObject.put("intensity", String.valueOf(min));
                    jSONObject.put("tag", "setFilter");
                    jSONObject.put("resultCode", filter);
                    c.LIZ("vesdk_event_recorder_single_filter", "business", jSONObject);
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("filterId", str2);
            jSONObject2.put("intensity", String.valueOf(min));
            jSONObject2.put("tag", "setFilter");
            jSONObject2.put("resultCode", filter);
            c.LIZ("vesdk_event_recorder_single_filter", "business", jSONObject2);
            return;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return;
        }
        str2 = "";
        float min2 = Math.min(1.0f, Math.max(0.0f, 0.0f));
        c63870P4w.LIZJ("iesve_verecorder_set_filter_click_idfilter_id", str2);
        c63870P4w.LIZIZ(1, "old");
        C63867P4t.LIZLLL("iesve_verecorder_set_filter_click", c63870P4w);
        int filter2 = vERecorder.LIZIZ.setFilter(str, min2, true);
    }

    @Override // X.InterfaceC83727WtX
    public final void setHandDetectLowpower(boolean z) {
        this.LJII.LIZIZ.setHandDetectLowpowerEnable(z);
    }

    @Override // X.InterfaceC83727WtX
    public final void u4(boolean z) {
        this.LJII.LIZIZ.setEffectBgmEnable(z);
    }

    @Override // X.InterfaceC83727WtX
    public final void v4(String str) {
        this.LJII.LIZIZ.slamSetLanguage(str);
    }

    @Override // X.InterfaceC83727WtX
    public final void w4(boolean z) {
        this.LJII.LIZIZ.setBgmMute(z);
    }

    @Override // X.InterfaceC83727WtX
    public final void B9(String resourcePath, java.util.Map<Integer, Float> intensityDict) {
        o.LJIIIZ(resourcePath, "resourcePath");
        o.LJIIIZ(intensityDict, "intensityDict");
        this.LJII.LIZIZ.setReshapeParam(resourcePath, intensityDict);
    }

    @Override // X.InterfaceC83727WtX
    public final int D7(String[] nodePaths, int i) {
        o.LJIIIZ(nodePaths, "nodePaths");
        return this.LJII.LIZIZ.appendComposerNodes(nodePaths, i);
    }

    @Override // X.InterfaceC83727WtX
    public final void F7(double[] dArr, double d) {
        this.LJII.LIZIZ.slamProcessIngestOri(dArr, d);
    }

    @Override // X.InterfaceC83727WtX
    public final int I1(String strRes, float f) {
        o.LJIIIZ(strRes, "strRes");
        return this.LJII.LJIIIIZZ(strRes, f, f);
    }

    @Override // X.InterfaceC83727WtX
    public final int I3(String[] nodePaths, int i) {
        o.LJIIIZ(nodePaths, "nodePaths");
        return this.LJII.LIZIZ.removeComposerNodes(nodePaths, i);
    }

    @Override // X.InterfaceC83727WtX
    public final boolean J9(VETouchPointer vETouchPointer, int i) {
        VERecorder vERecorder = this.LJII;
        vERecorder.getClass();
        if (vETouchPointer.getEvent() == null || i < 0) {
            return false;
        }
        return vERecorder.LIZIZ.processTouchEvent(vETouchPointer, i);
    }

    @Override // X.InterfaceC83727WtX
    public final int[] LLII(String nodePath, String nodeKey) {
        o.LJIIIZ(nodePath, "nodePath");
        o.LJIIIZ(nodeKey, "nodeKey");
        VERecorder vERecorder = this.LJII;
        vERecorder.getClass();
        int[] checkComposerNodeExclusion = vERecorder.LIZIZ.checkComposerNodeExclusion(nodePath, nodeKey);
        o.LJIIIIZZ(checkComposerNodeExclusion, "recoder.checkComposerNod…lusion(nodePath, nodeKey)");
        return checkComposerNodeExclusion;
    }

    @Override // X.InterfaceC83727WtX
    public final int LLIIIJ(String key, String imagePath) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(imagePath, "imagePath");
        return this.LJII.LIZIZ.animateImageToPreview(key, imagePath);
    }

    @Override // X.InterfaceC83192Wku
    public final void LLILLL(List<ComposerInfo> list, int i) {
        LIZ().LLILLL(list, i);
    }

    @Override // X.InterfaceC83192Wku
    public final void LLLLIIL(List<ComposerInfo> list, int i) {
        LIZ().LLLLIIL(list, i);
    }

    @Override // X.InterfaceC83727WtX
    public final int P9(String nodePath, float f) {
        o.LJIIIZ(nodePath, "nodePath");
        return this.LJII.LJIILL(nodePath, "Filter_intensity", f);
    }

    @Override // X.InterfaceC83727WtX
    public final void X9(float f, float f2) {
        this.LJII.LIZIZ.slamProcessRotationEvent(f, f2);
    }

    @Override // X.InterfaceC83727WtX
    public final void Y9(float f, float f2) {
        this.LJII.LIZIZ.slamProcessDoubleClickEvent(f, f2);
    }

    @Override // X.InterfaceC83727WtX
    public final void Z9(float f, float f2) {
        this.LJII.LIZIZ.slamProcessScaleEvent(f, f2);
    }

    @Override // X.InterfaceC83192Wku
    public final void a(List<ComposerInfo> list, int i) {
        LIZ().a(list, i);
    }

    @Override // X.InterfaceC83192Wku
    public final void i(List<ComposerInfo> list, int i) {
        LIZ().i(list, i);
    }

    @Override // X.InterfaceC83727WtX
    public final void l3(int i, String strBeautyFaceRes) {
        o.LJIIIZ(strBeautyFaceRes, "strBeautyFaceRes");
        VERecorder vERecorder = this.LJII;
        vERecorder.getClass();
        C63870P4w c63870P4w = new C63870P4w();
        c63870P4w.LIZIZ(i, "iesve_verecorder_set_beauty_algorithm");
        c63870P4w.LIZIZ(1, "old");
        C63867P4t.LIZLLL("iesve_verecorder_set_beauty_algorithm", c63870P4w);
        int beautyFace = vERecorder.LIZIZ.setBeautyFace(i, strBeautyFaceRes);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("beautyFaceType", String.valueOf(i));
            jSONObject.put("strBeautyFaceRes", strBeautyFaceRes);
            jSONObject.put("resultCode", beautyFace);
            c.LIZ("vesdk_event_recorder_beauty_face", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC83727WtX
    public final void ma(float f, float f2) {
        this.LJII.LIZIZ.processTouchEvent(f, f2);
    }

    @Override // X.InterfaceC83727WtX
    public final int oa(List<String> list, List<? extends VEFrame> list2) {
        return this.LJII.LIZIZ.animateImagesToPreview(list, list2);
    }

    @Override // X.InterfaceC83727WtX
    public final void processTouchEvent(float f, float f2) {
        this.LJII.LIZIZ.processTouchEvent(f, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // X.InterfaceC83727WtX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setFilter(java.lang.String r9, float r10) {
        /*
            r8 = this;
            com.ss.android.vesdk.VERecorder r6 = r8.LJII
            r6.getClass()
            X.P4w r3 = new X.P4w
            r3.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r7 = 1
            if (r0 != 0) goto L45
            java.lang.String r0 = java.io.File.separator
            java.lang.String[] r1 = r9.split(r0)
            int r0 = r1.length
            if (r0 <= 0) goto L45
            int r0 = r1.length
            int r0 = r0 - r7
            r5 = r1[r0]
        L1e:
            r2 = 0
            float r1 = java.lang.Math.max(r10, r2)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = java.lang.Math.min(r0, r1)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2f
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
        L2f:
            java.lang.String r0 = "iesve_verecorder_set_filter_click_idfilter_id"
            r3.LIZJ(r0, r5)
            java.lang.String r0 = "old"
            r3.LIZIZ(r7, r0)
            java.lang.String r0 = "iesve_verecorder_set_filter_click"
            X.C63867P4t.LIZLLL(r0, r3)
            X.WyL r0 = r6.LIZIZ
            int r3 = r0.setFilterNew(r9, r4)
            goto L48
        L45:
            java.lang.String r5 = ""
            goto L1e
        L48:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6f
            r2.<init>()     // Catch: org.json.JSONException -> L6f
            java.lang.String r0 = "filterId"
            r2.put(r0, r5)     // Catch: org.json.JSONException -> L6f
            java.lang.String r1 = "intensity"
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch: org.json.JSONException -> L6f
            r2.put(r1, r0)     // Catch: org.json.JSONException -> L6f
            java.lang.String r1 = "tag"
            java.lang.String r0 = "setFilterNew"
            r2.put(r1, r0)     // Catch: org.json.JSONException -> L6f
            java.lang.String r0 = "resultCode"
            r2.put(r0, r3)     // Catch: org.json.JSONException -> L6f
            java.lang.String r1 = "vesdk_event_recorder_single_filter"
            java.lang.String r0 = "business"
            jp3.c.LIZ(r1, r0, r2)     // Catch: org.json.JSONException -> L6f
            goto L73
        L6f:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84024WyK.setFilter(java.lang.String, float):void");
    }

    @Override // X.InterfaceC83727WtX
    public final void setRenderCacheString(String str, String value) {
        o.LJIIIZ(value, "value");
        this.LJII.LIZIZ.setRenderCacheString(str, value);
    }

    @Override // X.InterfaceC83727WtX
    public final void t4(float f, float f2) {
        VERecorder vERecorder = this.LJII;
        vERecorder.getClass();
        C63870P4w c63870P4w = new C63870P4w();
        c63870P4w.LIZ(f, "iesve_verecorder_set_beauty_level");
        c63870P4w.LIZIZ(1, "old");
        C63867P4t.LIZLLL("iesve_verecorder_set_beauty_level", c63870P4w);
        int beautyFaceIntensity = vERecorder.LIZIZ.setBeautyFaceIntensity(f, f2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fSmoothIntensity", String.valueOf(f));
            jSONObject.put("fBrightenIntensity", String.valueOf(f));
            jSONObject.put("resultCode", beautyFaceIntensity);
            c.LIZ("vesdk_event_recorder_beauty_face_intensity", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public C84024WyK(InterfaceC83927Wwl recorderContext, VERecorder recoder, InterfaceC65784Pro interceptCallback) {
        o.LJIIIZ(recoder, "recoder");
        o.LJIIIZ(interceptCallback, "interceptCallback");
        o.LJIIIZ(recorderContext, "recorderContext");
        this.LJII = recoder;
        this.LJIIIIZZ = interceptCallback;
        this.LJIIIZ = recorderContext;
        this.LIZ = new ArrayList();
        this.LIZLLL = new ArrayList();
        this.LJ = new C84031WyR(this);
        this.LJFF = new C84027WyN(this);
        this.LIZJ = false;
        if (!recorderContext.LLZILL().invoke().booleanValue()) {
            la();
        }
        this.LJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // X.InterfaceC83727WtX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E9(java.lang.String r8, java.lang.String r9, float r10) {
        /*
            r7 = this;
            com.ss.android.vesdk.VERecorder r4 = r7.LJII
            r4.getClass()
            X.P4w r3 = new X.P4w
            r3.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r5 = 1
            java.lang.String r6 = ""
            if (r0 != 0) goto L4d
            java.lang.String r0 = java.io.File.separator
            java.lang.String[] r1 = r8.split(r0)
            int r0 = r1.length
            if (r0 <= 0) goto L4d
            int r0 = r1.length
            int r0 = r0 - r5
            r2 = r1[r0]
        L20:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L33
            java.lang.String r0 = java.io.File.separator
            java.lang.String[] r1 = r9.split(r0)
            int r0 = r1.length
            if (r0 <= 0) goto L33
            int r0 = r1.length
            int r0 = r0 - r5
            r6 = r1[r0]
        L33:
            java.lang.String r0 = "iesve_verecorder_set_filter_slide_left_id"
            r3.LIZJ(r0, r2)
            java.lang.String r0 = "iesve_verecorder_set_filter_slide_right_id"
            r3.LIZJ(r0, r6)
            java.lang.String r0 = "old"
            r3.LIZIZ(r5, r0)
            java.lang.String r0 = "iesve_verecorder_set_filter_slide"
            X.C63867P4t.LIZLLL(r0, r3)
            X.WyL r0 = r4.LIZIZ
            r0.setFilter(r8, r9, r10)
            return
        L4d:
            r2 = r6
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84024WyK.E9(java.lang.String, java.lang.String, float):void");
    }

    @Override // X.InterfaceC83727WtX
    public final void J1(String[] strArr, double[] dArr, boolean[] zArr) {
        VERecorder vERecorder = this.LJII;
        vERecorder.LIZIZ.recoverCherEffect(new VECherEffectParam(strArr, dArr, zArr));
    }

    @Override // X.InterfaceC83727WtX
    public final int J8(String strRes, float f, float f2) {
        o.LJIIIZ(strRes, "strRes");
        VERecorder vERecorder = this.LJII;
        vERecorder.getClass();
        C63870P4w c63870P4w = new C63870P4w();
        c63870P4w.LIZ(f, "iesve_verecorder_set_lipstick_and_blusher_level");
        c63870P4w.LIZIZ(1, "old");
        C63867P4t.LIZLLL("iesve_verecorder_set_lipstick_and_blusher_level", c63870P4w);
        int faceMakeUp = vERecorder.LIZIZ.setFaceMakeUp(strRes, f, f2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("strResPath", strRes);
            jSONObject.put("fLipstickIntensity", String.valueOf(f));
            jSONObject.put("fBlusherIntensity", String.valueOf(f));
            jSONObject.put("resultCode", faceMakeUp);
            c.LIZ("vesdk_event_recorder_face_make_up_intensity", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return faceMakeUp;
    }

    @Override // X.InterfaceC83192Wku
    public final void LLIIJI(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        LIZ().LLIIJI(list, list2, i);
    }

    @Override // X.InterfaceC83727WtX
    public final void Q9(C29S c29s, String str, String str2) {
        this.LJII.LIZIZ.setCustomVideoBg(str, str2);
    }

    @Override // X.InterfaceC83727WtX
    public final void ga(int i, int i2, InterfaceC63955P8d interfaceC63955P8d) {
        this.LJII.LJIIL(i, i2, false, true, interfaceC63955P8d, false);
    }

    @Override // X.InterfaceC83727WtX
    public final int setReshape(String strRes, float f, float f2) {
        o.LJIIIZ(strRes, "strRes");
        return this.LJII.LJIIIIZZ(strRes, f, f2);
    }

    @Override // X.InterfaceC83727WtX
    public final void E7(double d, double d2, double d3, double d4) {
        this.LJII.LIZIZ.slamProcessIngestGyr(d, d2, d3, d4);
    }

    @Override // X.InterfaceC83727WtX
    public final void H7(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LJII.LIZIZ.slamDeviceConfig(z, z2, z3, z4);
    }

    @Override // X.InterfaceC83727WtX
    public final void J3(int i, int i2, String str, String arg3) {
        o.LJIIIZ(arg3, "arg3");
        this.LJII.LIZIZ.slamSetInputText(str, i, i2, arg3);
    }

    @Override // X.InterfaceC83727WtX
    public final void K3(double d, double d2, double d3, double d4) {
        this.LJII.LIZIZ.slamProcessIngestGra(d, d2, d3, d4);
    }

    @Override // X.InterfaceC83727WtX
    public final void LJJIJL(int i, long j, long j2, String msg) {
        o.LJIIIZ(msg, "msg");
        if (this.LJIIIZ.LJJJJJL().LJIIJJI()) {
            this.LJII.LIZIZ.sendEffectMsg(i, j, j2, msg);
        } else {
            C43045Guv.LIZLLL(new C84037WyX(this, i, j, j2, msg), 0L);
        }
    }

    @Override // X.InterfaceC83727WtX
    public final void LLIIII(double d, double d2, double d3, double d4) {
        this.LJII.LIZIZ.slamProcessIngestAcc(d, d2, d3, d4);
    }

    @Override // X.InterfaceC83727WtX
    public final void R9(C29S c29s, String str, String str2, String str3) {
        this.LJII.LIZIZ.setCustomVideoBg(str, str2, str3);
    }

    @Override // X.InterfaceC83727WtX
    public final void ka(float f, float f2, int i, int i2) {
        this.LJII.LIZIZ.slamProcessTouchEventByType(i, f, f2, i2);
    }

    @Override // X.InterfaceC83727WtX
    public final int u3(String[] oldPaths, int i, String[] newPaths, int i2) {
        o.LJIIIZ(oldPaths, "oldPaths");
        o.LJIIIZ(newPaths, "newPaths");
        return this.LJII.LIZIZ.replaceComposerNodes(oldPaths, i, newPaths, i2);
    }

    @Override // X.InterfaceC83727WtX
    public final void ba(float f, float f2, float f3, float f4, float f5) {
        this.LJII.LIZIZ.slamProcessPanEvent(f, f2, f3, f4, f5);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // X.InterfaceC83727WtX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setFilter(java.lang.String r13, java.lang.String r14, float r15, float r16, float r17) {
        /*
            r12 = this;
            r10 = r16
            com.ss.android.vesdk.VERecorder r3 = r12.LJII
            r3.getClass()
            X.P4w r2 = new X.P4w
            r2.<init>()
            r7 = r13
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r4 = 1
            java.lang.String r5 = ""
            if (r0 != 0) goto L6e
            java.lang.String r0 = java.io.File.separator
            java.lang.String[] r1 = r7.split(r0)
            int r0 = r1.length
            if (r0 <= 0) goto L6e
            int r0 = r1.length
            int r0 = r0 - r4
            r6 = r1[r0]
        L23:
            r8 = r14
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L37
            java.lang.String r0 = java.io.File.separator
            java.lang.String[] r1 = r8.split(r0)
            int r0 = r1.length
            if (r0 <= 0) goto L37
            int r0 = r1.length
            int r0 = r0 - r4
            r5 = r1[r0]
        L37:
            r11 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r0 <= 0) goto L3f
            r10 = 1065353216(0x3f800000, float:1.0)
        L3f:
            int r0 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r0 <= 0) goto L6b
        L43:
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4a
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
        L4a:
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L50
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
        L50:
            java.lang.String r0 = "iesve_verecorder_set_filter_slide_left_id"
            r2.LIZJ(r0, r6)
            java.lang.String r0 = "iesve_verecorder_set_filter_slide_right_id"
            r2.LIZJ(r0, r5)
            java.lang.String r0 = "old"
            r2.LIZIZ(r4, r0)
            java.lang.String r0 = "iesve_verecorder_set_filter_slide"
            X.C63867P4t.LIZLLL(r0, r2)
            X.WyL r6 = r3.LIZIZ
            r9 = r15
            r6.setFilterNew(r7, r8, r9, r10, r11)
            return
        L6b:
            r11 = r17
            goto L43
        L6e:
            r6 = r5
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84024WyK.setFilter(java.lang.String, java.lang.String, float, float, float):void");
    }
}
