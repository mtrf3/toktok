package com.bytedance.effectcreatormobile.assetEditor.liquefy;

import X.C79863Bm;
import X.C94518aiI;
import X.V1M;
import X.V8H;
import X.XLM;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.effectcreator.swig.EEPoint;
import com.bytedance.ies.effectcreator.swig.EESize;
import com.bytedance.ies.effectcreator.swig.UIAnnotationBool;
import com.bytedance.ies.effectcreator.swig.UIAnnotationFloat;
import com.bytedance.ies.effectcreator.swig.UIAnnotationTransform3D;
import com.bytedance.ies.effectcreator.swig.UIAnnotationTransform3DData;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class LiquefyViewModel extends ViewModel {
    public C94518aiI LJLIL;
    public final XLM LJLILLLLZI;
    public final C79863Bm LJLJI;
    public final XLM LJLJJI;
    public final C79863Bm LJLJJL;
    public final XLM LJLJJLL;
    public final C79863Bm LJLJL;
    public final XLM LJLJLJ;
    public final C79863Bm LJLJLLL;
    public boolean LJLL;
    public UIAnnotationBool LJLLI;
    public UIAnnotationBool LJLLILLLL;
    public UIAnnotationFloat LJLLJ;
    public UIAnnotationFloat LJLLL;
    public LiquefyFeatureData LJLLLL;

    public static LiquefyFeatureData gv0() {
        return new LiquefyFeatureData(false, false, -1.0f, -1.0f, 0.25d, 0.25d, 0.5d, 0.5d, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, null);
    }

    public final LiquefyFeatureData iv0() {
        UIAnnotationTransform3DData normalizationTransform3DDataPtr;
        boolean z;
        boolean z2;
        float f;
        float f2;
        String str;
        Boolean bool;
        C94518aiI c94518aiI = this.LJLIL;
        if (c94518aiI != null) {
            UIAnnotationTransform3D uIAnnotationTransform3D = c94518aiI.LJFF;
            if (uIAnnotationTransform3D != null && (normalizationTransform3DDataPtr = uIAnnotationTransform3D.getNormalizationTransform3DDataPtr()) != null) {
                UIAnnotationBool uIAnnotationBool = this.LJLLILLLL;
                if (uIAnnotationBool != null) {
                    z = uIAnnotationBool.getCurrentValueSync();
                } else {
                    z = false;
                }
                UIAnnotationBool uIAnnotationBool2 = this.LJLLI;
                if (uIAnnotationBool2 != null) {
                    z2 = uIAnnotationBool2.getCurrentValueSync();
                } else {
                    z2 = false;
                }
                UIAnnotationFloat uIAnnotationFloat = this.LJLLJ;
                if (uIAnnotationFloat != null) {
                    f = uIAnnotationFloat.getCurrentValueSync();
                } else {
                    f = -1.0f;
                }
                UIAnnotationFloat uIAnnotationFloat2 = this.LJLLL;
                if (uIAnnotationFloat2 != null) {
                    f2 = uIAnnotationFloat2.getCurrentValueSync();
                } else {
                    f2 = -1.0f;
                }
                EESize size = normalizationTransform3DDataPtr.getSize();
                o.LJIIIIZZ(size, "transform3DData.size");
                double width = size.getWidth();
                EESize size2 = normalizationTransform3DDataPtr.getSize();
                o.LJIIIIZZ(size2, "transform3DData.size");
                double height = size2.getHeight();
                EEPoint center = normalizationTransform3DDataPtr.getCenter();
                o.LJIIIIZZ(center, "transform3DData.center");
                double x = center.getX();
                EEPoint center2 = normalizationTransform3DDataPtr.getCenter();
                o.LJIIIIZZ(center2, "transform3DData.center");
                double y = center2.getY();
                double rotationAngle = normalizationTransform3DDataPtr.getRotationAngle();
                UIAnnotationTransform3D uIAnnotationTransform3D2 = c94518aiI.LJFF;
                Boolean bool2 = null;
                if (uIAnnotationTransform3D2 != null) {
                    str = uIAnnotationTransform3D2.getName();
                } else {
                    str = null;
                }
                UIAnnotationTransform3D uIAnnotationTransform3D3 = c94518aiI.LJFF;
                if (uIAnnotationTransform3D3 != null) {
                    bool = Boolean.valueOf(uIAnnotationTransform3D3.getVisible());
                } else {
                    bool = null;
                }
                UIAnnotationTransform3D uIAnnotationTransform3D4 = c94518aiI.LJI;
                if (uIAnnotationTransform3D4 != null) {
                    bool2 = Boolean.valueOf(uIAnnotationTransform3D4.getVisible());
                }
                return new LiquefyFeatureData(z, z2, f, f2, width, height, x, y, rotationAngle, str, bool, bool2);
            }
            return gv0();
        }
        return gv0();
    }

    public LiquefyViewModel() {
        Boolean bool = Boolean.FALSE;
        XLM LIZ = V8H.LIZ(bool);
        this.LJLILLLLZI = LIZ;
        this.LJLJI = V1M.LIZLLL(LIZ);
        XLM LIZ2 = V8H.LIZ(bool);
        this.LJLJJI = LIZ2;
        this.LJLJJL = V1M.LIZLLL(LIZ2);
        Float valueOf = Float.valueOf(0.0f);
        XLM LIZ3 = V8H.LIZ(valueOf);
        this.LJLJJLL = LIZ3;
        this.LJLJL = V1M.LIZLLL(LIZ3);
        XLM LIZ4 = V8H.LIZ(valueOf);
        this.LJLJLJ = LIZ4;
        this.LJLJLLL = V1M.LIZLLL(LIZ4);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C94518aiI c94518aiI = this.LJLIL;
        if (c94518aiI != null) {
            c94518aiI.LIZLLL = false;
        }
    }

    public final void lv0(String str) {
        if (this.LJLIL != null) {
            C94518aiI.LJIILIIL(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mv0(X.InterfaceC67352kd<? super X.C76800UCe> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C94522aiM
            if (r0 == 0) goto L6b
            r5 = r9
            X.aiM r5 = (X.C94522aiM) r5
            int r2 = r5.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r5.LJLILLLLZI = r2
        L12:
            java.lang.Object r2 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLILLLLZI
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L48
            if (r0 == r1) goto L20
            if (r0 != r3) goto L71
        L20:
            X.C141335gf.LIZJ(r2)
        L23:
            X.aeR r0 = com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LIZJ
            r6 = 0
            if (r0 == 0) goto L3d
            long r0 = r0.getEffectHandle()
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            long r1 = r2.longValue()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L3d
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3d:
            r5.LJLILLLLZI = r3
            r0 = 200(0xc8, double:9.9E-322)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r5)
            if (r0 != r4) goto L23
            return r4
        L48:
            X.C141335gf.LIZJ(r2)
            r5.LJLILLLLZI = r1
            X.XKS r2 = new X.XKS
            X.2kd r0 = X.C78555UsJ.LJJII(r5)
            r2.<init>(r1, r0)
            r2.LJIIL()
            kotlin.jvm.internal.IDqS423S0100000_42 r1 = new kotlin.jvm.internal.IDqS423S0100000_42
            r0 = 159(0x9f, float:2.23E-43)
            r1.<init>(r2, r0)
            com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LIZLLL(r1)
            java.lang.Object r0 = r2.LJIIJJI()
            if (r0 != r4) goto L23
            return r4
        L6b:
            X.aiM r5 = new X.aiM
            r5.<init>(r8, r9)
            goto L12
        L71:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel.mv0(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[LOOP:0: B:25:0x0085->B:27:0x008b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hv0(boolean r9, X.InterfaceC67352kd<? super X.C76800UCe> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C94519aiJ
            if (r0 == 0) goto Lb4
            r5 = r10
            X.aiJ r5 = (X.C94519aiJ) r5
            int r2 = r5.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb4
            int r2 = r2 - r1
            r5.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLILLLLZI
            r3 = 1
            r6 = 3
            r2 = 2
            if (r0 == 0) goto L31
            if (r0 == r3) goto L29
            if (r0 == r2) goto L6a
            if (r0 != r6) goto Lbb
            X.C141335gf.LIZJ(r1)
        L26:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L29:
            java.lang.Object r7 = r5.LJLJJI
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel r7 = (com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel) r7
            X.C141335gf.LIZJ(r1)
            goto L5b
        L31:
            X.C141335gf.LIZJ(r1)
            com.bytedance.ies.effectcreator.swig.UIAnnotationBool r0 = r8.LJLLILLLL
            if (r0 == 0) goto L41
            boolean r0 = r0.getCurrentValueSync()
            if (r0 != r9) goto L41
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L41:
            com.bytedance.ies.effectcreator.swig.UIAnnotationBool r0 = r8.LJLLILLLL
            if (r0 == 0) goto L48
            r0.updateValue(r9)
        L48:
            X.XLM r1 = r8.LJLJJI
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r5.LJLJJI = r8
            r5.LJLILLLLZI = r3
            r1.setValue(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != r4) goto L5a
            return r4
        L5a:
            r7 = r8
        L5b:
            com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender r0 = X.C93939aYx.LIZ()
            r5.LJLJJI = r7
            r5.LJLILLLLZI = r2
            java.lang.Object r0 = r0.awaitAlgorithm(r3, r5)
            if (r0 != r4) goto L71
            return r4
        L6a:
            java.lang.Object r7 = r5.LJLJJI
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel r7 = (com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel) r7
            X.C141335gf.LIZJ(r1)
        L71:
            X.aiI r0 = r7.LJLIL
            if (r0 == 0) goto L9b
            com.bytedance.ies.effectcreator.swig.Feature r1 = r0.LIZJ
            if (r1 == 0) goto L9b
            com.bytedance.ies.effectcreator.swig.UIAnnotationUIType r0 = com.bytedance.ies.effectcreator.swig.UIAnnotationUIType.UIAnnotationUIType_Transform3D
            com.bytedance.ies.effectcreator.swig.EEStdUIAnnotationBaseList r0 = r1.getUiAnnotationsAccordingUIType(r0)
            if (r0 == 0) goto L9b
            java.util.Iterator r3 = r0.iterator()
        L85:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r2 = r3.next()
            com.bytedance.ies.effectcreator.swig.UIAnnotationBase r2 = (com.bytedance.ies.effectcreator.swig.UIAnnotationBase) r2
            kotlin.jvm.internal.IDqS423S0100000_42 r1 = new kotlin.jvm.internal.IDqS423S0100000_42
            r0 = 7
            r1.<init>(r2, r0)
            X.C93745aVp.LIZIZ(r1)
            goto L85
        L9b:
            X.aiI r0 = r7.LJLIL
            if (r0 == 0) goto La2
            r0.LJIIL()
        La2:
            com.bytedance.effectcreatormobile.assetEditor.AssetEditorImpl r2 = X.C93977aZZ.LIZIZ()
            X.aZa r1 = X.EnumC93978aZa.UPDATE
            r0 = 0
            r5.LJLJJI = r0
            r5.LJLILLLLZI = r6
            java.lang.Object r0 = r2.emitEditEvent(r1, r5)
            if (r0 != r4) goto L26
            return r4
        Lb4:
            X.aiJ r5 = new X.aiJ
            r5.<init>(r8, r10)
            goto L12
        Lbb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel.hv0(boolean, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object kv0(boolean r7, X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C94521aiL
            if (r0 == 0) goto L73
            r5 = r8
            X.aiL r5 = (X.C94521aiL) r5
            int r2 = r5.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L73
            int r2 = r2 - r1
            r5.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLILLLLZI
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L41
            if (r0 == r2) goto L37
            if (r0 != r3) goto L79
            boolean r7 = r5.LJLJJL
            java.lang.Object r2 = r5.LJLJJI
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel r2 = (com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel) r2
            X.C141335gf.LIZJ(r1)
        L29:
            X.aiI r0 = r2.LJLIL
            if (r0 == 0) goto L34
            com.bytedance.ies.effectcreator.swig.UIAnnotationTransform3D r0 = r0.LJI
            if (r0 == 0) goto L34
            r0.setVisible(r7)
        L34:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L37:
            boolean r7 = r5.LJLJJL
            java.lang.Object r2 = r5.LJLJJI
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel r2 = (com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel) r2
            X.C141335gf.LIZJ(r1)
            goto L60
        L41:
            X.C141335gf.LIZJ(r1)
            com.bytedance.ies.effectcreator.swig.UIAnnotationBool r0 = r6.LJLLI
            if (r0 == 0) goto L4b
            r0.updateValue(r7)
        L4b:
            X.XLM r1 = r6.LJLILLLLZI
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r5.LJLJJI = r6
            r5.LJLJJL = r7
            r5.LJLILLLLZI = r2
            r1.setValue(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != r4) goto L5f
            return r4
        L5f:
            r2 = r6
        L60:
            com.bytedance.effectcreatormobile.assetEditor.AssetEditorImpl r1 = X.C93977aZZ.LIZIZ()
            X.aZa r0 = X.EnumC93978aZa.UPDATE
            r5.LJLJJI = r2
            r5.LJLJJL = r7
            r5.LJLILLLLZI = r3
            java.lang.Object r0 = r1.emitEditEvent(r0, r5)
            if (r0 != r4) goto L29
            return r4
        L73:
            X.aiL r5 = new X.aiL
            r5.<init>(r6, r8)
            goto L12
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel.kv0(boolean, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object jv0(long r9, boolean r11, com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFeatureData r12, X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof X.C94520aiK
            if (r0 == 0) goto Lb4
            r5 = r13
            X.aiK r5 = (X.C94520aiK) r5
            int r2 = r5.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb4
            int r2 = r2 - r1
            r5.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLILLLLZI
            r6 = 0
            r3 = 2
            r7 = 1
            if (r0 == 0) goto L27
            if (r0 == r7) goto L85
            if (r0 != r3) goto Lbb
            X.C141335gf.LIZJ(r1)
        L24:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L27:
            X.C141335gf.LIZJ(r1)
            r8.LJLL = r11
            com.bytedance.effectcreatormobile.assetEditor.AssetEditorImpl r0 = X.C93977aZZ.LIZIZ()
            X.aZc r1 = r0.queryHandler(r9, r6)
            boolean r0 = r1 instanceof X.C94518aiI
            if (r0 != 0) goto L39
            r1 = r6
        L39:
            X.aiI r1 = (X.C94518aiI) r1
            r8.LJLIL = r1
            if (r1 == 0) goto L41
            r1.LIZLLL = r7
        L41:
            kotlin.jvm.internal.IDqS423S0100000_42 r1 = new kotlin.jvm.internal.IDqS423S0100000_42
            r0 = 8
            r1.<init>(r8, r0)
            X.C93745aVp.LIZIZ(r1)
            com.bytedance.ies.effectcreator.swig.UIAnnotationBool r0 = r8.LJLLI
            if (r0 == 0) goto L61
            boolean r0 = r0.getCurrentValueSync()
            if (r0 != 0) goto L61
            X.aiI r0 = r8.LJLIL
            if (r0 == 0) goto L61
            com.bytedance.ies.effectcreator.swig.UIAnnotationTransform3D r1 = r0.LJI
            if (r1 == 0) goto L61
            r0 = 0
            r1.setVisible(r0)
        L61:
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFeatureData r0 = r8.iv0()
            if (r12 == 0) goto L81
        L67:
            r8.LJLLLL = r12
            X.2pa r2 = androidx.lifecycle.ViewModelKt.getViewModelScope(r8)
            X.am0 r1 = new X.am0
            r1.<init>(r8, r0, r6)
            r0 = 3
            X.XKX.LIZLLL(r2, r6, r6, r1, r0)
            r5.LJLJJI = r8
            r5.LJLILLLLZI = r7
            java.lang.Object r0 = r8.mv0(r5)
            if (r0 != r4) goto L83
            return r4
        L81:
            r12 = r0
            goto L67
        L83:
            r0 = r8
            goto L8c
        L85:
            java.lang.Object r0 = r5.LJLJJI
            com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel r0 = (com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel) r0
            X.C141335gf.LIZJ(r1)
        L8c:
            X.aiI r0 = r0.LJLIL
            if (r0 == 0) goto Lb2
            com.bytedance.ies.effectcreator.swig.Feature r0 = r0.LIZJ
            if (r0 == 0) goto Lb2
            long r1 = X.C93825aX7.LIZ(r0)
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
        L9e:
            com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LJIILJJIL(r0)
            com.bytedance.effectcreatormobile.assetEditor.AssetEditorImpl r1 = X.C93977aZZ.LIZIZ()
            X.aZa r0 = X.EnumC93978aZa.UPDATE
            r5.LJLJJI = r6
            r5.LJLILLLLZI = r3
            java.lang.Object r0 = r1.emitEditEvent(r0, r5)
            if (r0 != r4) goto L24
            return r4
        Lb2:
            r0 = r6
            goto L9e
        Lb4:
            X.aiK r5 = new X.aiK
            r5.<init>(r8, r13)
            goto L12
        Lbb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel.jv0(long, boolean, com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFeatureData, X.2kd):java.lang.Object");
    }
}
