package a04;

import X.C145995oB;
import X.C45495HtL;
import X.C47789IpF;
import X.C81392Vwy;
import X.GXR;
import X.KL2;
import X.QXX;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene;
import com.ss.ttvideoengine.TTVideoEngine;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class IDfS1S0100000_14 extends QXX {
    public final int $t;
    public Object l0;

    @Override // X.QXX
    public final void LLLLIILLL(Object obj) {
        switch (this.$t) {
            case 0:
                LLLLIILLL$0(this, obj);
                return;
            case 1:
                LLLLIILLL$1(this, obj);
                return;
            case 2:
                LLLLIILLL$2(this, obj);
                return;
            default:
                super.LLLLIILLL(obj);
                return;
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onError(C47789IpF c47789IpF) {
        switch (this.$t) {
            case 3:
                onError$0(this, c47789IpF);
                return;
            default:
                super.onError(c47789IpF);
                return;
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPrepared(TTVideoEngine tTVideoEngine) {
        switch (this.$t) {
            case 3:
                onPrepared$0(this, tTVideoEngine);
                return;
            default:
                super.onPrepared(tTVideoEngine);
                return;
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
        switch (this.$t) {
            case 3:
                onRenderStart$0(this, tTVideoEngine);
                return;
            default:
                super.onRenderStart(tTVideoEngine);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDfS1S0100000_14(C81392Vwy c81392Vwy, int i) {
        super((Object) null);
        this.$t = i;
        this.l0 = c81392Vwy;
    }

    public static final void LLLLIILLL$0(IDfS1S0100000_14 iDfS1S0100000_14, Object obj) {
        ((C81392Vwy) iDfS1S0100000_14.l0).close();
    }

    public static final void LLLLIILLL$1(IDfS1S0100000_14 iDfS1S0100000_14, Object obj) {
        ((C81392Vwy) iDfS1S0100000_14.l0).close();
    }

    public static final void LLLLIILLL$2(IDfS1S0100000_14 iDfS1S0100000_14, Object obj) {
        ((C81392Vwy) iDfS1S0100000_14.l0).close();
    }

    public static final void onError$0(IDfS1S0100000_14 iDfS1S0100000_14, C47789IpF c47789IpF) {
        if (c47789IpF != null) {
            PreviewVideoScene previewVideoScene = (PreviewVideoScene) iDfS1S0100000_14.l0;
            previewVideoScene.LJLJJI = c47789IpF.LIZ;
            String c47789IpF2 = c47789IpF.toString();
            o.LJIIIIZZ(c47789IpF2, "it.toString()");
            previewVideoScene.LJLJJL = c47789IpF2;
        }
        ((PreviewVideoScene) iDfS1S0100000_14.l0).LJLLL = true;
    }

    public static final void onPrepared$0(IDfS1S0100000_14 iDfS1S0100000_14, TTVideoEngine tTVideoEngine) {
        PreviewVideoScene previewVideoScene = (PreviewVideoScene) iDfS1S0100000_14.l0;
        previewVideoScene.LJLLI = true;
        if (!previewVideoScene.mUserVisibleHint) {
            TTVideoEngine tTVideoEngine2 = previewVideoScene.LJLL;
            if (tTVideoEngine2 != null) {
                tTVideoEngine2.LJJL();
            } else {
                o.LJIJI("videoEngine");
                throw null;
            }
        }
        PreviewVideoScene previewVideoScene2 = (PreviewVideoScene) iDfS1S0100000_14.l0;
        TTVideoEngine tTVideoEngine3 = previewVideoScene2.LJLL;
        if (tTVideoEngine3 != null) {
            int LJJJIL = tTVideoEngine3.LJJJIL();
            TTVideoEngine tTVideoEngine4 = ((PreviewVideoScene) iDfS1S0100000_14.l0).LJLL;
            if (tTVideoEngine4 != null) {
                int LJJJ = tTVideoEngine4.LJJJ();
                previewVideoScene2.getClass();
                if (LJJJIL <= 0 || LJJJ <= 0) {
                    return;
                }
                int LJIIIZ = KL2.LJIIIZ(previewVideoScene2.requireActivity());
                int LJIIJJI = KL2.LJIIJJI(previewVideoScene2.requireActivity());
                float f = LJJJ;
                float f2 = LJJJIL;
                float LJIIJJI2 = (KL2.LJIIJJI(previewVideoScene2.requireActivity()) * f) / f2;
                float f3 = LJIIIZ;
                if (LJIIJJI2 >= f3) {
                    LJIIJJI = (int) ((f3 * f2) / f);
                } else {
                    LJIIIZ = (int) LJIIJJI2;
                }
                KL2.LJIJ(LJIIJJI, LJIIIZ, previewVideoScene2.LLJJIJI());
                return;
            }
            o.LJIJI("videoEngine");
            throw null;
        }
        o.LJIJI("videoEngine");
        throw null;
    }

    public static final void onRenderStart$0(IDfS1S0100000_14 iDfS1S0100000_14, TTVideoEngine tTVideoEngine) {
        Integer num;
        C45495HtL c45495HtL;
        ((PreviewVideoScene) iDfS1S0100000_14.l0).LLJJIJIIJIL().setVisibility(8);
        ((PreviewVideoScene) iDfS1S0100000_14.l0).LLJILJILJ();
        MyMediaModel myMediaModel = ((PreviewVideoScene) iDfS1S0100000_14.l0).LJLJL;
        if (myMediaModel != null && (c45495HtL = myMediaModel.libraryState) != null && c45495HtL.isSucceed()) {
            ((PreviewVideoScene) iDfS1S0100000_14.l0).LJLLILLLL = true;
        }
        PreviewVideoScene previewVideoScene = (PreviewVideoScene) iDfS1S0100000_14.l0;
        previewVideoScene.getClass();
        C145995oB c145995oB = new C145995oB();
        MyMediaModel myMediaModel2 = previewVideoScene.LJLJL;
        if (myMediaModel2 != null) {
            num = Integer.valueOf(myMediaModel2.type);
        } else {
            num = null;
        }
        c145995oB.LJI("content_type", String.valueOf(num));
        c145995oB.LIZIZ(System.currentTimeMillis() - previewVideoScene.LJLLLLLL, "first_frame_duration");
        c145995oB.LIZ(previewVideoScene.LJLJLLL, "content_cnt");
        c145995oB.LIZ(previewVideoScene.isVisible() ? 1 : 0, "is_visible");
        GXR.LIZ("tool_performance_album_preview_first_frame", c145995oB.LIZ);
    }

    public IDfS1S0100000_14(PreviewVideoScene previewVideoScene, int i) {
        this.$t = i;
        this.l0 = previewVideoScene;
    }
}
