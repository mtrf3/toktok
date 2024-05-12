package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C1294856i;
import X.C135445Tg;
import X.C158716Kt;
import X.C54F;
import X.C54I;
import X.C54J;
import X.C56W;
import X.C57F;
import X.C5F9;
import X.C76800UCe;
import X.H78;
import X.InterfaceC1278950f;
import X.InterfaceC135455Th;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.O6R;
import X.X1D;
import Y.ARunnableS21S0200000_2;
import Y.ARunnableS38S0100000_2;
import android.view.SurfaceView;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.VideoTransitionFragment;
import com.ss.ugc.android.editor.core.EditorProContext;

/* loaded from: classes3.dex */
public class AqS165S0200000_2 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS165S0200000_2(C1294856i c1294856i, C54F c54f, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1294856i;
        this.l1 = c54f;
    }

    public static final Object invoke$0(AqS165S0200000_2 aqS165S0200000_2, Object obj, Object obj2) {
        AudioRecorderParam oldParam = (AudioRecorderParam) obj;
        AudioRecorderParam newParam = (AudioRecorderParam) obj2;
        o.LJIIIZ(oldParam, "oldParam");
        o.LJIIIZ(newParam, "newParam");
        ((C158716Kt) aqS165S0200000_2.l0).LLIIIL().Vc0();
        InterfaceC135455Th LLIIIL = ((C158716Kt) aqS165S0200000_2.l0).LLIIIL();
        final C158716Kt c158716Kt = (C158716Kt) aqS165S0200000_2.l0;
        final InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS165S0200000_2.l1;
        LLIIIL.l90(oldParam, newParam, new C5F9() { // from class: X.6LA
            @Override // X.C5F9
            public final void LIZ() {
                C158716Kt c158716Kt2 = C158716Kt.this;
                c158716Kt2.LJLLLL.post(new ARunnableS21S0200000_2(interfaceC65784Pro, c158716Kt2, 11));
            }

            @Override // X.C5F9
            public final void LIZIZ() {
                C158716Kt c158716Kt2 = C158716Kt.this;
                c158716Kt2.LJLLLL.post(new ARunnableS38S0100000_2(c158716Kt2, 49));
            }
        });
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS165S0200000_2 aqS165S0200000_2, Object obj, Object obj2) {
        AudioRecorderParam oldParam = (AudioRecorderParam) obj;
        AudioRecorderParam newParam = (AudioRecorderParam) obj2;
        o.LJIIIZ(oldParam, "oldParam");
        o.LJIIIZ(newParam, "newParam");
        C135445Tg c135445Tg = (C135445Tg) aqS165S0200000_2.l0;
        AudioRecorderParam audioRecorderParam = new AudioRecorderParam();
        audioRecorderParam.copyFrom(oldParam);
        c135445Tg.LJZI = audioRecorderParam;
        C135445Tg c135445Tg2 = (C135445Tg) aqS165S0200000_2.l0;
        AudioRecorderParam audioRecorderParam2 = new AudioRecorderParam();
        audioRecorderParam2.copyFrom(newParam);
        c135445Tg2.LJZL = audioRecorderParam2;
        ((InterfaceC65784Pro) aqS165S0200000_2.l1).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS165S0200000_2 aqS165S0200000_2, Object obj, Object obj2) {
        SurfaceView surfaceView;
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditorProScene init video w ");
        LIZ.append(((PairIntInt) aqS165S0200000_2.l0).LIZ());
        LIZ.append(" h ");
        LIZ.append(((PairIntInt) aqS165S0200000_2.l0).LIZIZ());
        LIZ.append(" display w ");
        LIZ.append(intValue);
        LIZ.append(" h ");
        LIZ.append(intValue2);
        H78.LJI(X1D.LIZIZ(LIZ));
        EditorProContext editorContext = ((EditorProScene) aqS165S0200000_2.l1).getEditorContext();
        int LIZ2 = ((PairIntInt) aqS165S0200000_2.l0).LIZ();
        int LIZIZ = ((PairIntInt) aqS165S0200000_2.l0).LIZIZ();
        InterfaceC1278950f interfaceC1278950f = ((EditorProScene) aqS165S0200000_2.l1).previewPanel;
        if (interfaceC1278950f != null) {
            surfaceView = interfaceC1278950f.Jq();
        } else {
            surfaceView = null;
        }
        C56W.LIZIZ(editorContext, LIZ2, LIZIZ, intValue, intValue2, surfaceView, ((EditorProScene) aqS165S0200000_2.l1).getDisplayTopMargin());
        InterfaceC1278950f interfaceC1278950f2 = ((EditorProScene) aqS165S0200000_2.l1).previewPanel;
        if (interfaceC1278950f2 != null) {
            interfaceC1278950f2.cK(intValue, intValue2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS165S0200000_2 aqS165S0200000_2, Object obj, Object obj2) {
        float min;
        int i;
        float f;
        float f2;
        float floatValue = ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        float translationX = ((C1294856i) aqS165S0200000_2.l0).getTranslationX() + floatValue;
        float videoSelectFrameLeft = ((C54F) aqS165S0200000_2.l1).getVideoSelectFrameLeft();
        float videoSelectFrameRight = ((C54F) aqS165S0200000_2.l1).getVideoSelectFrameRight();
        float maxSelectFrameWidthOnScreen = ((C54F) aqS165S0200000_2.l1).getMaxSelectFrameWidthOnScreen();
        if (((C54F) aqS165S0200000_2.l1).LIZJ()) {
            min = Math.min(Math.max(translationX, (videoSelectFrameLeft - maxSelectFrameWidthOnScreen) - ((C54F) aqS165S0200000_2.l1).LJLJI), (videoSelectFrameRight - maxSelectFrameWidthOnScreen) - ((C54F) aqS165S0200000_2.l1).LJLJI);
        } else {
            min = Math.min(Math.max(translationX, videoSelectFrameLeft + ((C54F) aqS165S0200000_2.l1).LJLJI), videoSelectFrameRight + ((C54F) aqS165S0200000_2.l1).LJLJI);
        }
        ((C1294856i) aqS165S0200000_2.l0).setTranslationX(min);
        C54J videoFrameTrack$tools_camera_edit_release = ((C54F) aqS165S0200000_2.l1).getVideoFrameTrack$tools_camera_edit_release();
        if (videoFrameTrack$tools_camera_edit_release != null) {
            i = videoFrameTrack$tools_camera_edit_release.getScrollX();
        } else {
            i = 0;
        }
        float f3 = i;
        C54J videoFrameTrack$tools_camera_edit_release2 = ((C54F) aqS165S0200000_2.l1).getVideoFrameTrack$tools_camera_edit_release();
        if (videoFrameTrack$tools_camera_edit_release2 != null) {
            f = videoFrameTrack$tools_camera_edit_release2.getVideoFrameScale();
        } else {
            f = ((C54F) aqS165S0200000_2.l1).LJLJJL;
        }
        float LJIIJJI = ((float) (((C54F) aqS165S0200000_2.l1).getEditorContext().getMainTrack().LJIIJJI() / 1000)) * f;
        if (((C54F) aqS165S0200000_2.l1).LIZJ()) {
            f2 = (((LJIIJJI - f3) - min) - ((C54F) aqS165S0200000_2.l1).getMaxSelectFrameWidthOnScreen()) - ((C54F) aqS165S0200000_2.l1).LJLJI;
        } else {
            f2 = (min + f3) - ((C54F) aqS165S0200000_2.l1).LJLJI;
        }
        float f4 = f2 / f;
        C54I videoCursorTouchListener = ((C54F) aqS165S0200000_2.l1).getVideoCursorTouchListener();
        if (videoCursorTouchListener != null) {
            videoCursorTouchListener.LIZ(O6R.LJJIJ(f4 * 1000));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r6 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AqS165S0200000_2 r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r0 = r8.booleanValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r6 = r9.booleanValue()
            r4 = 0
            r5 = 8
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r7.l0
            X.57F r0 = (X.C57F) r0
            java.util.ArrayList r0 = r0.getCategoryList()
            int r3 = r0.size()
            r2 = 0
            r0 = 1
            java.lang.String r1 = "resourceMultiTab"
            if (r3 != r0) goto L3f
            java.lang.Object r0 = r7.l0
            X.57F r0 = (X.C57F) r0
            X.57H r0 = r0.LJLIL
            if (r0 == 0) goto Lda
            r0.setVisibility(r5)
        L2e:
            if (r6 == 0) goto L3c
        L30:
            X.5oB r0 = new X.5oB
            r0.<init>()
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.LIZ
            java.lang.String r0 = "transition_loading_fail"
            X.FMX.LJIIL(r0, r1)
        L3c:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3f:
            java.lang.Object r0 = r7.l0
            X.57F r0 = (X.C57F) r0
            X.57H r0 = r0.LJLIL
            if (r0 == 0) goto Lde
            r0.setVisibility(r4)
            goto L2e
        L4b:
            java.lang.Object r1 = r7.l1
            com.ss.android.ugc.gamora.editorpro.bottom.panel.VideoTransitionFragment r1 = (com.ss.android.ugc.gamora.editorpro.bottom.panel.VideoTransitionFragment) r1
            r0 = 2131378248(0x7f0a4048, float:1.8376723E38)
            android.view.View r0 = r1._$_findCachedViewById(r0)
            r0.setVisibility(r5)
            java.lang.Object r1 = r7.l1
            com.ss.android.ugc.gamora.editorpro.bottom.panel.VideoTransitionFragment r1 = (com.ss.android.ugc.gamora.editorpro.bottom.panel.VideoTransitionFragment) r1
            r0 = 2131378252(0x7f0a404c, float:1.8376731E38)
            android.view.View r0 = r1._$_findCachedViewById(r0)
            r0.setVisibility(r4)
            if (r6 == 0) goto L3c
            java.lang.Object r5 = r7.l1
            com.ss.android.ugc.gamora.editorpro.bottom.panel.VideoTransitionFragment r5 = (com.ss.android.ugc.gamora.editorpro.bottom.panel.VideoTransitionFragment) r5
            r5.getClass()
            com.ss.android.ugc.aweme.network.spi.INetworkStateService r0 = X.C163626bW.LIZ()
            boolean r1 = r0.isFakeNetwork()
            com.ss.android.ugc.aweme.network.spi.INetworkStateService r0 = X.C163626bW.LIZ()
            boolean r2 = r0.isWeakNetwork()
            X.1qj r0 = r5.requireActivity()
            java.lang.String r4 = "requireActivity()"
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r4)
            boolean r0 = X.C48203Ivv.LIZJ(r0)
            if (r1 == 0) goto Lb5
            X.1qj r1 = r5.requireActivity()
            r0 = 2131847086(0x7f1167ae, float:1.932764E38)
            java.lang.String r3 = r1.getString(r0)
        L9a:
            java.lang.String r0 = "if (isFakeNet) {\n       …essage_connect)\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            X.1qj r2 = r5.requireActivity()
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r4)
            com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder r1 = new com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder
            r1.<init>()
            r1.message(r3)
            r0 = 6001(0x1771, float:8.409E-42)
            X.C78915Uy7.LJJIIZI(r2, r0, r1)
            goto L30
        Lb5:
            r1 = 2131847084(0x7f1167ac, float:1.9327635E38)
            if (r2 == 0) goto Lc3
            X.1qj r0 = r5.requireActivity()
            java.lang.String r3 = r0.getString(r1)
            goto L9a
        Lc3:
            if (r0 == 0) goto Ld1
            X.1qj r1 = r5.requireActivity()
            r0 = 2131847082(0x7f1167aa, float:1.9327631E38)
            java.lang.String r3 = r1.getString(r0)
            goto L9a
        Ld1:
            X.1qj r0 = r5.requireActivity()
            java.lang.String r3 = r0.getString(r1)
            goto L9a
        Lda:
            kotlin.jvm.internal.o.LJIJI(r1)
            throw r2
        Lde:
            kotlin.jvm.internal.o.LJIJI(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS165S0200000_2.invoke$4(kotlin.jvm.internal.AqS165S0200000_2, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS165S0200000_2(C135445Tg c135445Tg, C135445Tg c135445Tg2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(2);
        this.$t = interfaceC65784Pro;
        this.l0 = c135445Tg;
        this.l1 = c135445Tg2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS165S0200000_2(C158716Kt c158716Kt, C158716Kt c158716Kt2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(2);
        this.$t = interfaceC65784Pro;
        this.l0 = c158716Kt;
        this.l1 = c158716Kt2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS165S0200000_2(PairIntInt pairIntInt, EditorProScene editorProScene, int i) {
        super(2);
        this.$t = i;
        this.l0 = pairIntInt;
        this.l1 = editorProScene;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS165S0200000_2(VideoTransitionFragment videoTransitionFragment, C57F c57f, int i) {
        super(2);
        this.$t = i;
        this.l0 = c57f;
        this.l1 = videoTransitionFragment;
    }
}
