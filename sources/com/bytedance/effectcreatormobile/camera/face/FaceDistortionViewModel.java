package com.bytedance.effectcreatormobile.camera.face;

import X.C61878OQg;
import X.C76800UCe;
import X.C79863Bm;
import X.C93829aXB;
import X.C93886aY6;
import X.C94061aav;
import X.C94656akW;
import X.C94754am6;
import X.V1M;
import X.V8H;
import X.XKX;
import X.XLM;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.util.Size;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ies.effectcreator.swig.Canvas;
import com.bytedance.ies.effectcreator.swig.EEStdFeatureList;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.FeatureManager;
import com.bytedance.ies.effectcreator.swig.Model;
import com.bytedance.ies.effectcreator.swig.UIAnnotationFacePoints;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class FaceDistortionViewModel extends ViewModel {
    public final C93886aY6 LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final Long LJLJL;
    public final XLM LJLJLJ;
    public final C79863Bm LJLJLLL;
    public final XLM LJLL;
    public final C79863Bm LJLLI;
    public final XLM LJLLILLLL;
    public final C79863Bm LJLLJ;
    public List<? extends PointF> LJLLL;
    public UIAnnotationFacePoints LJLLLL;
    public Feature LJLLLLLL;

    public final C76800UCe hv0() {
        String str;
        Feature feature = this.LJLLLLLL;
        if (feature != null) {
            str = feature.getExtraInfo("cke_distortion_status");
            if (str == null) {
                str = "";
            }
        } else {
            str = null;
        }
        String str2 = "unmirror";
        boolean z = !o.LJ(str, "unmirror");
        Feature feature2 = this.LJLLLLLL;
        if (feature2 != null) {
            if (z) {
                str2 = "mirror";
            }
            feature2.setExtraInfo("cke_distortion_status", str2);
        }
        this.LJLLILLLL.setValue(Boolean.valueOf(z));
        return C76800UCe.LIZ;
    }

    public final void jv0() {
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C94754am6(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object iv0(X.InterfaceC67352kd<? super X.C76800UCe> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C94535aiZ
            if (r0 == 0) goto L81
            r7 = r11
            X.aiZ r7 = (X.C94535aiZ) r7
            int r2 = r7.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L81
            int r2 = r2 - r1
            r7.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r7.LJLIL
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLILLLLZI
            r8 = 1
            if (r0 == 0) goto L23
            if (r0 != r8) goto L87
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            com.bytedance.ies.effectcreator.swig.Feature r1 = r10.LJLLLLLL
            if (r1 == 0) goto L71
            com.bytedance.ies.effectcreator.swig.UIAnnotationUIType r0 = com.bytedance.ies.effectcreator.swig.UIAnnotationUIType.UIAnnotationUIType_FacePoints
            com.bytedance.ies.effectcreator.swig.UIAnnotationBase r0 = r1.getUiAnnotationAccordingUIType(r0)
        L30:
            com.bytedance.ies.effectcreator.swig.UIAnnotationFacePoints r0 = com.bytedance.ies.effectcreator.swig.UIAnnotationFacePoints.dynamicCast(r0)
            r10.LJLLLL = r0
            if (r0 == 0) goto L20
            com.bytedance.ies.effectcreator.swig.EEPointList r1 = r0.getFacePoints()
            if (r1 == 0) goto L20
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r5.<init>(r0)
            java.util.Iterator r9 = r1.iterator()
        L4d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r2 = r9.next()
            com.bytedance.ies.effectcreator.swig.EEPoint r2 = (com.bytedance.ies.effectcreator.swig.EEPoint) r2
            android.graphics.PointF r4 = new android.graphics.PointF
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            double r0 = r2.getX()
            float r3 = (float) r0
            double r1 = r2.getY()
            float r0 = (float) r1
            r4.<init>(r3, r0)
            r5.add(r4)
            goto L4d
        L71:
            r0 = 0
            goto L30
        L73:
            r10.LJLLL = r5
            X.XLM r0 = r10.LJLL
            r7.LJLILLLLZI = r8
            r0.setValue(r5)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != r6) goto L20
            return r6
        L81:
            X.aiZ r7 = new X.aiZ
            r7.<init>(r10, r11)
            goto L12
        L87:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel.iv0(X.2kd):java.lang.Object");
    }

    public FaceDistortionViewModel(C93886aY6 veRecordHelper, long j) {
        o.LJIIIZ(veRecordHelper, "veRecordHelper");
        XLM LIZ = V8H.LIZ(C94061aav.LIZIZ);
        this.LJLJLJ = LIZ;
        this.LJLJLLL = V1M.LIZLLL(LIZ);
        XLM LIZ2 = V8H.LIZ(C61878OQg.INSTANCE);
        this.LJLL = LIZ2;
        this.LJLLI = V1M.LIZLLL(LIZ2);
        XLM LIZ3 = V8H.LIZ(Boolean.TRUE);
        this.LJLLILLLL = LIZ3;
        this.LJLLJ = V1M.LIZLLL(LIZ3);
        this.LJLIL = veRecordHelper;
        this.LJLJL = Long.valueOf(j);
    }

    public static void gv0(boolean z, C93886aY6 c93886aY6, String imagePath, String str) {
        Canvas LJ;
        FeatureManager featureManager;
        Model workingModel;
        FeatureManager featureManager2;
        if (!z) {
            C93829aXB LJI = CKEffectEditorContext.LJI();
            if (LJI != null && (workingModel = LJI.LIZJ.getWorkingModel()) != null && (featureManager2 = workingModel.featureManager()) != null) {
                featureManager2.recordFeatureVisibleStates();
            }
            C93829aXB LJI2 = CKEffectEditorContext.LJI();
            if (LJI2 != null) {
                C61878OQg exceptFeatureList = C61878OQg.INSTANCE;
                o.LJIIIZ(exceptFeatureList, "exceptFeatureList");
                Model workingModel2 = LJI2.LIZJ.getWorkingModel();
                if (workingModel2 != null && (featureManager = workingModel2.featureManager()) != null) {
                    featureManager.hideAllFeatureExcept(new EEStdFeatureList(exceptFeatureList));
                }
            }
        }
        c93886aY6.LJI(imagePath);
        o.LJIIIZ(imagePath, "imagePath");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(imagePath, options);
        Size size = new Size(options.outWidth, options.outHeight);
        CKEffectEditorContext.LIZLLL(new C94656akW(size.getWidth(), size.getHeight()));
        C93829aXB LJI3 = CKEffectEditorContext.LJI();
        if (LJI3 != null && (LJ = LJI3.LJ()) != null) {
            LJ.setFaceStretchFacePointsInfo(str);
        }
    }

    public FaceDistortionViewModel(C93886aY6 veRecordHelper, String faceEffectPath, String faceEffectId, String displayName, String resourceName, String capabilities) {
        o.LJIIIZ(veRecordHelper, "veRecordHelper");
        o.LJIIIZ(faceEffectPath, "faceEffectPath");
        o.LJIIIZ(faceEffectId, "faceEffectId");
        o.LJIIIZ(displayName, "displayName");
        o.LJIIIZ(resourceName, "resourceName");
        o.LJIIIZ(capabilities, "capabilities");
        XLM LIZ = V8H.LIZ(C94061aav.LIZIZ);
        this.LJLJLJ = LIZ;
        this.LJLJLLL = V1M.LIZLLL(LIZ);
        XLM LIZ2 = V8H.LIZ(C61878OQg.INSTANCE);
        this.LJLL = LIZ2;
        this.LJLLI = V1M.LIZLLL(LIZ2);
        XLM LIZ3 = V8H.LIZ(Boolean.TRUE);
        this.LJLLILLLL = LIZ3;
        this.LJLLJ = V1M.LIZLLL(LIZ3);
        this.LJLIL = veRecordHelper;
        this.LJLILLLLZI = faceEffectPath;
        this.LJLJI = faceEffectId;
        this.LJLJJI = displayName;
        this.LJLJJL = resourceName;
        this.LJLJJLL = capabilities;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object lv0(java.lang.Long r10, X.C93886aY6 r11, java.lang.String r12, java.lang.String r13, long r14, X.InterfaceC67352kd<? super X.C76800UCe> r16) {
        /*
            r9 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C94537aib
            if (r0 == 0) goto L7a
            r4 = r3
            X.aib r4 = (X.C94537aib) r4
            int r2 = r4.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r4.LJLILLLLZI = r2
        L14:
            java.lang.Object r8 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLILLLLZI
            r7 = 1
            r2 = 0
            r6 = 0
            r1 = 3
            r5 = 2
            if (r0 == 0) goto L2d
            if (r0 == r7) goto L58
            if (r0 == r5) goto L6a
            if (r0 != r1) goto L80
            X.C141335gf.LIZJ(r8)
        L2a:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2d:
            X.C141335gf.LIZJ(r8)
            if (r10 == 0) goto L54
            r0 = 1
        L33:
            gv0(r0, r11, r13, r12)
            X.aXB r0 = com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LJI()
            if (r0 == 0) goto L52
            com.bytedance.ies.effectcreator.swig.Feature r0 = r0.LJFF(r14)
        L40:
            r9.LJLLLLLL = r0
            if (r0 == 0) goto L47
            r0.setVisible(r7)
        L47:
            r4.LJLJJI = r9
            r4.LJLILLLLZI = r7
            X.UCe r0 = r9.hv0()
            if (r0 != r3) goto L56
            return r3
        L52:
            r0 = r6
            goto L40
        L54:
            r0 = 0
            goto L33
        L56:
            r0 = r9
            goto L5f
        L58:
            java.lang.Object r0 = r4.LJLJJI
            com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel r0 = (com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel) r0
            X.C141335gf.LIZJ(r8)
        L5f:
            r4.LJLJJI = r6
            r4.LJLILLLLZI = r5
            java.lang.Object r0 = r0.iv0(r4)
            if (r0 != r3) goto L6d
            return r3
        L6a:
            X.C141335gf.LIZJ(r8)
        L6d:
            com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender r0 = X.C93939aYx.LIZ()
            r4.LJLILLLLZI = r1
            java.lang.Object r0 = r0.awaitAlgorithm(r2, r4)
            if (r0 != r3) goto L2a
            return r3
        L7a:
            X.aib r4 = new X.aib
            r4.<init>(r9, r3)
            goto L14
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel.lv0(java.lang.Long, X.aY6, java.lang.String, java.lang.String, long, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0058, code lost:
    
        if (r0 != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object kv0(java.lang.Long r13, X.C93886aY6 r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, X.InterfaceC67352kd<? super X.C76800UCe> r21) {
        /*
            r12 = this;
            r3 = r21
            boolean r0 = r3 instanceof X.C94536aia
            if (r0 == 0) goto Lc3
            r5 = r3
            X.aia r5 = (X.C94536aia) r5
            int r2 = r5.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc3
            int r2 = r2 - r1
            r5.LJLILLLLZI = r2
        L14:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLILLLLZI
            r8 = 1
            r3 = 0
            r2 = 3
            r7 = 2
            r6 = 0
            if (r0 == 0) goto L2d
            if (r0 == r8) goto L98
            if (r0 == r7) goto Laa
            if (r0 != r2) goto Lca
            X.C141335gf.LIZJ(r1)
        L2a:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2d:
            X.C141335gf.LIZJ(r1)
            if (r13 == 0) goto L94
            r0 = 1
        L33:
            r1 = r16
            gv0(r0, r14, r1, r15)
            com.bytedance.ies.effectcreator.swig.FeatureType r0 = com.bytedance.ies.effectcreator.swig.FeatureType.FeatureType_FaceDistortion
            int r1 = com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LJIIJ(r0)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            int r10 = r0.intValue()
            if (r13 == 0) goto L7c
            long r0 = r13.longValue()
            X.aXB r9 = com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LJI()
            if (r9 == 0) goto L7c
            com.bytedance.ies.effectcreator.swig.Feature r0 = r9.LJFF(r0)
            if (r0 == 0) goto L7c
        L5a:
            r12.LJLLLLLL = r0
            if (r0 == 0) goto L63
            r1 = r20
            r0.loadCapabilityFromString(r1)
        L63:
            com.bytedance.ies.effectcreator.swig.Feature r9 = r12.LJLLLLLL
            if (r9 == 0) goto L71
            java.lang.String r1 = r12.LJLJI
            kotlin.jvm.internal.o.LJI(r1)
            java.lang.String r0 = "cke_effect_identity"
            r9.setExtraInfo(r0, r1)
        L71:
            r5.LJLJJI = r12
            r5.LJLILLLLZI = r8
            X.UCe r0 = r12.hv0()
            if (r0 != r4) goto L96
            return r4
        L7c:
            X.aXB r1 = com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LJI()
            if (r1 == 0) goto L92
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r10)
            r10 = r18
            r11 = r17
            r9 = r19
            com.bytedance.ies.effectcreator.swig.Feature r0 = r1.LIZJ(r0, r11, r9, r10)
            goto L5a
        L92:
            r0 = r6
            goto L5a
        L94:
            r0 = 0
            goto L33
        L96:
            r0 = r12
            goto L9f
        L98:
            java.lang.Object r0 = r5.LJLJJI
            com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel r0 = (com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel) r0
            X.C141335gf.LIZJ(r1)
        L9f:
            r5.LJLJJI = r6
            r5.LJLILLLLZI = r7
            java.lang.Object r0 = r0.iv0(r5)
            if (r0 != r4) goto Lad
            return r4
        Laa:
            X.C141335gf.LIZJ(r1)
        Lad:
            X.aXB r0 = com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LJI()
            if (r0 == 0) goto Lb6
            r0.LIZIZ()
        Lb6:
            com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender r0 = X.C93939aYx.LIZ()
            r5.LJLILLLLZI = r2
            java.lang.Object r0 = r0.awaitAlgorithm(r3, r5)
            if (r0 != r4) goto L2a
            return r4
        Lc3:
            X.aia r5 = new X.aia
            r5.<init>(r12, r3)
            goto L14
        Lca:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel.kv0(java.lang.Long, X.aY6, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.2kd):java.lang.Object");
    }
}
