package Y;

import X.C00F;
import X.C122034qd;
import X.C123804tU;
import X.C123814tV;
import X.C133765Mu;
import X.C135215Sj;
import X.C135315St;
import X.C139875eJ;
import X.C139975eT;
import X.C158706Ks;
import X.C16880lQ;
import X.C44298Ha2;
import X.C5MG;
import X.C5MM;
import X.C5MX;
import X.C5RM;
import X.C5T9;
import X.C6KO;
import X.EnumC123844tY;
import X.G8G;
import X.H78;
import X.InterfaceC143655kP;
import X.InterfaceC153045zY;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackMV;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.videolength.VideoLengthChecker;
import dmt.av.video.VEPreviewParams;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AObserverS63S0300000_2 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS63S0300000_2 aObserverS63S0300000_2, Object obj) {
        MvCreateVideoData mvCreateVideoData;
        C133765Mu c133765Mu;
        C122034qd LJI;
        NLEEditor nLEEditor;
        NLETrackMV LJJII;
        VEPreviewParams params = (VEPreviewParams) obj;
        C44298Ha2 c44298Ha2 = G8G.LIZ;
        c44298Ha2.step("av_video_edit", "VEEditor init start");
        C5RM.LIZ(params);
        final C135315St c135315St = (C135315St) aObserverS63S0300000_2.l0;
        C5MG c5mg = c135315St.LJIILJJIL;
        c5mg.LJJ = new C5MX() { // from class: X.5Sn
            @Override // X.C5MX
            public final void LIZ() {
                C135315St c135315St2 = C135315St.this;
                if (!c135315St2.LJIIJJI) {
                    c135315St2.LJIIJJI = true;
                    C170666ms.LIZIZ("receive prepare done event");
                    C135315St.this.LJIIL.postValue(null);
                }
            }
        };
        Context context = c135315St.LIZ;
        o.LJIIIIZZ(params, "params");
        int LJJII2 = c5mg.LJJII(context, params, ((C135315St) aObserverS63S0300000_2.l0).LIZJ, (LifecycleOwner) aObserverS63S0300000_2.l1);
        boolean z = false;
        if ((C00F.LIZ(31744, 0, "autocut_image_support_fast_import", true) == 1 || C00F.LIZ(31744, 0, "autocut_image_support_fast_import", true) == 2) && ((VideoPublishEditModel) aObserverS63S0300000_2.l2).isCurrentAutoCutMode()) {
            ((C133765Mu) ((C135315St) aObserverS63S0300000_2.l0).LJIILJJIL.LJJ()).LJIIIZ(1080, 1920, 4);
        } else {
            C5MG c5mg2 = ((C135315St) aObserverS63S0300000_2.l0).LJIILJJIL;
            if (((c5mg2 instanceof C123814tV) || (c5mg2 instanceof C123804tU)) && (mvCreateVideoData = params.mvCreateVideoData) != null) {
                ((C133765Mu) c5mg2.LJJ()).LJIIIZ(mvCreateVideoData.resDestWidth, mvCreateVideoData.resDestHeight, mvCreateVideoData.resFillMode);
            }
        }
        C135315St c135315St2 = (C135315St) aObserverS63S0300000_2.l0;
        if (c135315St2.LJIIZILJ != null) {
            C5MG veVideoEditor = c135315St2.LJIILJJIL;
            o.LJIIIIZZ(veVideoEditor, "veVideoEditor");
            NLEModel nLEModel = ((C135315St) aObserverS63S0300000_2.l0).LJIIZILJ;
            if (nLEModel != null) {
                veVideoEditor.LJJI(nLEModel, true);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else if (!TextUtils.isEmpty(c135315St2.LJIJ)) {
            C5MG veVideoEditor2 = ((C135315St) aObserverS63S0300000_2.l0).LJIILJJIL;
            o.LJIIIIZZ(veVideoEditor2, "veVideoEditor");
            veVideoEditor2.LJJIFFI(((C135315St) aObserverS63S0300000_2.l0).LJIJ, true);
        } else {
            C133765Mu LIZIZ = C135215Sj.LIZIZ((VideoPublishEditModel) aObserverS63S0300000_2.l2, false);
            C5MG veVideoEditor3 = ((C135315St) aObserverS63S0300000_2.l0).LJIILJJIL;
            o.LJIIIIZZ(veVideoEditor3, "veVideoEditor");
            NLEModel LJ = LIZIZ.LJI().LJIIJ.LJ();
            o.LJIIIIZZ(LJ, "asnleEditor.getNLEPro().editor.model");
            veVideoEditor3.LJJI(LJ, true);
            ((VideoPublishEditModel) aObserverS63S0300000_2.l2).nleData = LIZIZ.LJI().LJIIJ.LJIIIIZZ();
        }
        C135315St c135315St3 = (C135315St) aObserverS63S0300000_2.l0;
        c135315St3.LJIIIZ = c135315St3.LJIILJJIL.LJJ();
        C135315St c135315St4 = (C135315St) aObserverS63S0300000_2.l0;
        if (c135315St4.LJIILJJIL instanceof C123814tV) {
            InterfaceC153045zY interfaceC153045zY = c135315St4.LJIIIZ;
            if ((interfaceC153045zY instanceof C133765Mu) && (c133765Mu = (C133765Mu) interfaceC153045zY) != null && (LJI = c133765Mu.LJI()) != null && (nLEEditor = LJI.LJIIJ) != null && (LJJII = NLETrackMV.LJJII(nLEEditor.LJ().getMainTrack())) != null) {
                NLEEditorJniJNI.NLETrackMV_setMVResolution(LJJII.LIZJ, LJJII, EnumC123844tY.RES_CUSTOM.swigValue());
                NLEEditorJniJNI.NLETrackMV_setCustomWidth(LJJII.LIZJ, LJJII, params.mCanvasWidth);
                NLEEditorJniJNI.NLETrackMV_setCustomHeight(LJJII.LIZJ, LJJII, params.mCanvasHeight);
                nLEEditor.LIZIZ();
            }
        }
        C135315St c135315St5 = (C135315St) aObserverS63S0300000_2.l0;
        C5MG c5mg3 = c135315St5.LJIILJJIL;
        c135315St5.LJIIIIZZ = c5mg3.LJFF;
        if (!c135315St5.LJIILIIL || !params.recordData.isMultiEditRetake) {
            z = true;
        }
        c5mg3.LJJIII(z);
        ((C135315St) aObserverS63S0300000_2.l0).LJIIJ.setValue(Integer.valueOf(LJJII2));
        ((C135315St) aObserverS63S0300000_2.l0).getClass();
        c44298Ha2.step("av_video_edit", "VEEditor init end");
        H78.LIZ("VEEditor init end");
    }

    public static final void onChanged$1(AObserverS63S0300000_2 aObserverS63S0300000_2, Object obj) {
        InterfaceC153045zY value;
        C158706Ks c158706Ks = (C158706Ks) aObserverS63S0300000_2.l0;
        c158706Ks.LJLJL = new C5T9(c158706Ks.LJLILLLLZI.Ll0());
        C158706Ks c158706Ks2 = (C158706Ks) aObserverS63S0300000_2.l0;
        FrameLayout frameLayout = c158706Ks2.LJLLILLLL;
        if (frameLayout != null) {
            C6KO c6ko = c158706Ks2.LJLLLL;
            if (c6ko != null) {
                C16880lQ.LJLLLL(c6ko, frameLayout);
                ((C158706Ks) aObserverS63S0300000_2.l0).LLJJ();
                C158706Ks c158706Ks3 = (C158706Ks) aObserverS63S0300000_2.l0;
                c158706Ks3.LJLILLLLZI.rr0(c158706Ks3.LJLJL);
                Rect rect = (Rect) aObserverS63S0300000_2.l1;
                if (rect != null) {
                    C158706Ks c158706Ks4 = (C158706Ks) aObserverS63S0300000_2.l0;
                    if ((rect.left > 0 || rect.top > 0 || rect.right > 0 || rect.bottom > 0) && (value = c158706Ks4.LJLILLLLZI.Ll0().Kh().getValue()) != null) {
                        value.LIZ(rect.left, rect.top, rect.right, rect.bottom);
                    }
                }
                ((C158706Ks) aObserverS63S0300000_2.l0).getUiActions().LJIIL.invoke(Boolean.FALSE);
                ((NLEEditor) aObserverS63S0300000_2.l2).LIZJ();
                MutableLiveData<C5MM> DM = ((C158706Ks) aObserverS63S0300000_2.l0).LJLILLLLZI.Ll0().DM();
                DM.setValue(C5MM.LIZJ());
                DM.setValue(C5MM.LIZLLL(0L));
                return;
            }
            o.LJIJI("currentSeekBar");
            throw null;
        }
        o.LJIJI("seekLayout");
        throw null;
    }

    public static final void onChanged$2(AObserverS63S0300000_2 aObserverS63S0300000_2, Object obj) {
        VideoLengthChecker videoLengthChecker = (VideoLengthChecker) aObserverS63S0300000_2.l0;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aObserverS63S0300000_2.l1;
        InterfaceC153045zY value = ((InterfaceC143655kP) aObserverS63S0300000_2.l2).Kh().getValue();
        videoLengthChecker.getClass();
        VideoLengthChecker.LJI(value, videoPublishEditModel);
    }

    public static final void onChanged$3(AObserverS63S0300000_2 aObserverS63S0300000_2, Object obj) {
        if (!((C139975eT) aObserverS63S0300000_2.l0).LIZIZ) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = ((C139975eT) aObserverS63S0300000_2.l0).LIZ().getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        ViewGroup.MarginLayoutParams cd = ((C139875eJ) aObserverS63S0300000_2.l1).cd();
        int i = cd.width;
        layoutParams2.width = i;
        int i2 = cd.height;
        layoutParams2.height = i2;
        layoutParams2.topMargin = cd.topMargin;
        layoutParams2.leftMargin = cd.leftMargin;
        if (((Drawable) aObserverS63S0300000_2.l2) instanceof GradientDrawable) {
            float min = Math.min(i / 125.0f, i2 / 125.0f);
            ((GradientDrawable) ((Drawable) aObserverS63S0300000_2.l2)).setSize((int) (layoutParams2.width / min), (int) (layoutParams2.height / min));
        }
        ((C139975eT) aObserverS63S0300000_2.l0).LIZ().setBackground((Drawable) aObserverS63S0300000_2.l2);
    }

    public AObserverS63S0300000_2(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
