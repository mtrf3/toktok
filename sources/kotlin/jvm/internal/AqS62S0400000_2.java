package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C125234vn;
import X.C125254vp;
import X.C134735Qn;
import X.C134745Qo;
import X.C151525x6;
import X.C56K;
import X.C5KW;
import X.C5KY;
import X.C5QW;
import X.C5R5;
import X.C68322mC;
import X.C76732zl;
import X.C76800UCe;
import X.DialogC134805Qu;
import X.EnumC125274vr;
import X.HPJ;
import X.InterfaceC133095Kf;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.os.Handler;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AqS62S0400000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, X.4qk] */
    public static final Object invoke$0(AqS62S0400000_2 aqS62S0400000_2) {
        ((C68322mC) aqS62S0400000_2.l1).element = ((C5KY) ((C5KW) aqS62S0400000_2.l0).LJJIJIIJI.getValue()).LIZ((NLEEditor) aqS62S0400000_2.l2, (InterfaceC133095Kf) aqS62S0400000_2.l3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS62S0400000_2 aqS62S0400000_2) {
        Map map = (Map) aqS62S0400000_2.l0;
        ImageAlbumData imageAlbumData = ((VideoPublishEditModel) aqS62S0400000_2.l1).getImageAlbumData();
        o.LJIIIIZZ(imageAlbumData, "mModel.imageAlbumData");
        CreativeInfo creativeInfo = ((VideoPublishEditModel) aqS62S0400000_2.l1).creativeInfo;
        o.LJIIIIZZ(creativeInfo, "mModel.creativeInfo");
        C151525x6.LIZ(map, imageAlbumData, creativeInfo, new AqS149S0200000_2((ActivityC45651qj) aqS62S0400000_2.l2, (ActivityC45651qj) aqS62S0400000_2.l3, (InterfaceC65784Pro<C76800UCe>) 76));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS62S0400000_2 aqS62S0400000_2) {
        ((C125254vp) aqS62S0400000_2.l0).LIZIZ.LIZJ();
        C76732zl c76732zl = (C76732zl) aqS62S0400000_2.l1;
        int i = c76732zl.element + 1;
        c76732zl.element = i;
        if (i >= 90) {
            C125254vp c125254vp = (C125254vp) aqS62S0400000_2.l0;
            PthreadTimer pthreadTimer = c125254vp.LIZLLL;
            if (pthreadTimer != null) {
                pthreadTimer.cancel();
            }
            c125254vp.LIZLLL = null;
            MessageCenter.removeListener(((C125254vp) aqS62S0400000_2.l0).LJ);
            ((InterfaceC88472Yns) aqS62S0400000_2.l2).invoke(new C125234vn(false, EnumC125274vr.APPLY_TIME_OUT_ERROR));
        } else {
            int i2 = (int) ((i * 0.7d) + 30);
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS62S0400000_2.l3;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Integer.valueOf(i2));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS62S0400000_2 aqS62S0400000_2) {
        boolean LIZ = HPJ.LIZ((String[]) aqS62S0400000_2.l0, (ActivityC45651qj) aqS62S0400000_2.l1);
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aqS62S0400000_2.l2;
        if (videoPublishEditModel != null) {
            C5QW.LJJII(videoPublishEditModel, (EditorProContext) aqS62S0400000_2.l3, true, LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS62S0400000_2 aqS62S0400000_2) {
        final int i;
        DialogC134805Qu dialogC134805Qu = (DialogC134805Qu) aqS62S0400000_2.l0;
        dialogC134805Qu.LLFFF = false;
        C134745Qo c134745Qo = dialogC134805Qu.LJLILLLLZI;
        C134735Qn infoListener = dialogC134805Qu.LLI;
        c134745Qo.getClass();
        o.LJIIIZ(infoListener, "infoListener");
        c134745Qo.LIZIZ.add(infoListener);
        c134745Qo.LIZ.V8().LJJJJI(infoListener);
        C5R5 c5r5 = ((DialogC134805Qu) aqS62S0400000_2.l0).LLFZ;
        if (c5r5 != null) {
            c5r5.LIZLLL();
        }
        ((DialogC134805Qu) aqS62S0400000_2.l0).LIZ(false);
        final int i2 = ((C76732zl) aqS62S0400000_2.l1).element;
        if (i2 > 0 && (i = ((C76732zl) aqS62S0400000_2.l2).element) > 0) {
            final float f = ((C56K) aqS62S0400000_2.l3).element;
            if (f > 0.0f) {
                final DialogC134805Qu dialogC134805Qu2 = (DialogC134805Qu) aqS62S0400000_2.l0;
                final long j = dialogC134805Qu2.LLD;
                final FrameLayout frameLayout = (FrameLayout) dialogC134805Qu2.findViewById(R.id.dfv);
                frameLayout.post(new Runnable() { // from class: X.5Ql
                    public final void LIZ() {
                        float f2;
                        NLEModel nLEModel = DialogC134805Qu.this.LL;
                        if (nLEModel != null) {
                            f2 = nLEModel.getCanvasRatio();
                        } else {
                            f2 = 0.5625f;
                        }
                        OSZ LIZIZ = DialogC134805Qu.LIZIZ(f2, i2, i);
                        DialogC134805Qu dialogC134805Qu3 = DialogC134805Qu.this;
                        InterfaceC88477Ynx<? super NLEModel, ? super FrameLayout, ? super java.util.Map<String, View>, ? super Long, ? super Float, ? super Float, ? super Float, C76800UCe> interfaceC88477Ynx = dialogC134805Qu3.LJZ;
                        if (interfaceC88477Ynx != null) {
                            NLEModel nLEModel2 = dialogC134805Qu3.LL;
                            FrameLayout surfaceLayout = frameLayout;
                            o.LJIIIIZZ(surfaceLayout, "surfaceLayout");
                            interfaceC88477Ynx.LJJIL(nLEModel2, surfaceLayout, DialogC134805Qu.this.LJLLL, Long.valueOf(j), LIZIZ.getFirst(), LIZIZ.getSecond(), Float.valueOf(f));
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ;
                        try {
                            LIZ();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
        }
        SurfaceView surfaceView = ((DialogC134805Qu) aqS62S0400000_2.l0).LJLJJI;
        if (surfaceView != null) {
            surfaceView.setVisibility(0);
        }
        ((Handler) ((DialogC134805Qu) aqS62S0400000_2.l0).LJLZ.getValue()).sendEmptyMessage(4);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS62S0400000_2(C125254vp c125254vp, C125254vp c125254vp2, C76732zl c76732zl, InterfaceC88472Yns<? super C125234vn, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns2) {
        super(0);
        this.$t = interfaceC88472Yns2;
        this.l0 = c125254vp;
        this.l1 = c125254vp2;
        this.l2 = c76732zl;
        this.l3 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S0400000_2(C5KW c5kw, C68322mC c68322mC, NLEEditor nLEEditor, InterfaceC133095Kf interfaceC133095Kf, int i) {
        super(0);
        this.$t = i;
        this.l0 = c5kw;
        this.l1 = c68322mC;
        this.l2 = nLEEditor;
        this.l3 = interfaceC133095Kf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S0400000_2(DialogC134805Qu dialogC134805Qu, C76732zl c76732zl, C76732zl c76732zl2, C56K c56k, int i) {
        super(0);
        this.$t = i;
        this.l0 = dialogC134805Qu;
        this.l1 = c76732zl;
        this.l2 = c76732zl2;
        this.l3 = c56k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS62S0400000_2(Map map, Map<SingleImageData, Integer> map2, VideoPublishEditModel videoPublishEditModel, ActivityC45651qj activityC45651qj, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = map;
        this.l1 = map2;
        this.l2 = videoPublishEditModel;
        this.l3 = activityC45651qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S0400000_2(String[] strArr, ActivityC45651qj activityC45651qj, VideoPublishEditModel videoPublishEditModel, EditorProContext editorProContext, int i) {
        super(0);
        this.$t = i;
        this.l0 = strArr;
        this.l1 = activityC45651qj;
        this.l2 = videoPublishEditModel;
        this.l3 = editorProContext;
    }
}
