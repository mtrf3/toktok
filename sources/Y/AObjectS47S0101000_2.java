package Y;

import X.ActivityC86117Xqz;
import X.BM5;
import X.C133765Mu;
import X.C145995oB;
import X.C146685pI;
import X.C164916db;
import X.C16880lQ;
import X.C169776lR;
import X.C169816lV;
import X.C24540xm;
import X.C26052AKi;
import X.C28834BTi;
import X.C42796Gqu;
import X.C5OL;
import X.C5S1;
import X.C76800UCe;
import X.FMX;
import X.GGS;
import X.IDP;
import X.InterfaceC153275zv;
import X.InterfaceC162426Za;
import X.InterfaceC65784Pro;
import X.WM7;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import com.bytedance.android.live.liveinteract.InteractServiceDel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseDiscoverMusicFragment;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import com.zhiliaoapp.musically.R;

/* loaded from: classes3.dex */
public class AObjectS47S0101000_2 implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
    public Object l0;

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
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS47S0101000_2 aObjectS47S0101000_2) {
        switch (aObjectS47S0101000_2.i1) {
            case 0:
                aObjectS47S0101000_2.l0.getClass();
                return GGS.LIZJ;
            case 1:
                return Long.valueOf(((IDP) aObjectS47S0101000_2.l0).LJJIJIL());
            default:
                ActivityC86117Xqz activityC86117Xqz = (ActivityC86117Xqz) aObjectS47S0101000_2.l0;
                activityC86117Xqz.getClass();
                if (C146685pI.LIZ()) {
                    C26052AKi c26052AKi = C26052AKi.LIZ;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(R.string.eyp);
                    c26052AKi.createToast(activityC86117Xqz, 5005, creativeToastBuilder);
                } else {
                    C5S1 c5s1 = new C5S1(activityC86117Xqz);
                    c5s1.LIZJ(R.string.eyp);
                    c5s1.LJ();
                }
                activityC86117Xqz.finish();
                return null;
        }
    }

    public static final Object invoke$1(AObjectS47S0101000_2 aObjectS47S0101000_2) {
        MyMediaModel myMediaModel = (MyMediaModel) aObjectS47S0101000_2.l0;
        int i = aObjectS47S0101000_2.i1;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unselect media model: ");
        LIZ.append(myMediaModel);
        LIZ.append(", position=");
        LIZ.append(i);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$2(AObjectS47S0101000_2 aObjectS47S0101000_2) {
        C76800UCe lambda$initView$118;
        switch (aObjectS47S0101000_2.i1) {
            case 0:
                return Boolean.valueOf(((InteractServiceDel) aObjectS47S0101000_2.l0).dX());
            case 1:
                ((StickerPropDetailFragment) aObjectS47S0101000_2.l0).LLJJL = 0.0f;
                return null;
            case 2:
                lambda$initView$118 = ((SettingNewVersionFragment) aObjectS47S0101000_2.l0).lambda$initView$118();
                return lambda$initView$118;
            default:
                VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) aObjectS47S0101000_2.l0;
                if (videoEditContainerScene.LLIILII.LLJJI() != null) {
                    if (videoEditContainerScene.LLIILII.LLJJI().LJIIIIZZ(null, InterfaceC153275zv.class) != null) {
                        ((InterfaceC153275zv) videoEditContainerScene.LLIILII.LLJJI().LJIIIIZZ(null, InterfaceC153275zv.class)).A7(1);
                    }
                    InterfaceC162426Za interfaceC162426Za = (InterfaceC162426Za) videoEditContainerScene.LLIILII.LLJJI().LJIIIIZZ(null, InterfaceC162426Za.class);
                    if (interfaceC162426Za != null) {
                        interfaceC162426Za.xj(true);
                    }
                }
                C145995oB LLLIIIIL = videoEditContainerScene.LLLIIIIL();
                LLLIIIIL.LJI("click_type", "select");
                FMX.LJIIL("click_audio_clear_popup", LLLIIIIL.LIZ);
                return null;
        }
    }

    public static final Object invoke$3(AObjectS47S0101000_2 aObjectS47S0101000_2) {
        InterfaceC162426Za interfaceC162426Za;
        switch (aObjectS47S0101000_2.i1) {
            case 0:
                LiveWidget liveWidget = (LiveWidget) aObjectS47S0101000_2.l0;
                liveWidget.getClass();
                return new BM5(liveWidget.context, liveWidget.dataChannel);
            case 1:
                C28834BTi.LIZ((C28834BTi) aObjectS47S0101000_2.l0);
                return null;
            case 2:
                aObjectS47S0101000_2.l0.getClass();
                return GGS.LIZJ;
            case 3:
                VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) aObjectS47S0101000_2.l0;
                if (videoEditContainerScene.LLIILII.LLJJI() != null && (interfaceC162426Za = (InterfaceC162426Za) videoEditContainerScene.LLIILII.LLJJI().LJIIIIZZ(null, InterfaceC162426Za.class)) != null) {
                    interfaceC162426Za.xj(true);
                }
                C145995oB LLLIIIIL = videoEditContainerScene.LLLIIIIL();
                LLLIIIIL.LJI("click_type", "not_now");
                FMX.LJIIL("click_audio_clear_popup", LLLIIIIL.LIZ);
                return null;
            default:
                C24540xm.LIZ(R.string.dq, ((WM7) aObjectS47S0101000_2.l0).requireActivity(), 2007);
                return null;
        }
    }

    public static final Object invoke$4(AObjectS47S0101000_2 aObjectS47S0101000_2) {
        boolean z;
        switch (aObjectS47S0101000_2.i1) {
            case 0:
                return ((BaseDiscoverMusicFragment) aObjectS47S0101000_2.l0).wl();
            case 1:
                C169776lR c169776lR = (C169776lR) aObjectS47S0101000_2.l0;
                C164916db c164916db = c169776lR.LJJJI;
                if (c164916db != null) {
                    if (c164916db.getCurrentPage() != null && c169776lR.LJJJI.getCurrentPage().LJII()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                return Boolean.valueOf(C169816lV.LIZJ(c169776lR.LJJ, c169776lR.LJJIJLIJ, c169776lR.LJJLIIIJL));
            default:
                ((VideoViewCell) aObjectS47S0101000_2.l0).LLIIJLIL().TD("others");
                return C76800UCe.LIZ;
        }
    }

    public static final Object invoke$5(AObjectS47S0101000_2 aObjectS47S0101000_2) {
        switch (aObjectS47S0101000_2.i1) {
            case 1:
                C169776lR c169776lR = (C169776lR) aObjectS47S0101000_2.l0;
                c169776lR.getClass();
                return Boolean.valueOf(C5OL.LJ(((C133765Mu) c169776lR.LJJIIJZLJL).LJI().LJIIJ.LJ(), c169776lR.LIZ));
            default:
                Context context = (Context) aObjectS47S0101000_2.l0;
                C16880lQ.LIZJ(context, new Intent(context, (Class<?>) DraftBoxActivity.class));
                return null;
        }
    }

    public static final Object invoke$6(AObjectS47S0101000_2 aObjectS47S0101000_2) {
        switch (aObjectS47S0101000_2.i1) {
            case 0:
                aObjectS47S0101000_2.l0.getClass();
                return GGS.LIZJ;
            case 1:
                return Boolean.valueOf(((C42796Gqu) aObjectS47S0101000_2.l0).LLFF);
            default:
                return Long.valueOf(((VEVideoPublishPreviewScene) aObjectS47S0101000_2.l0).LJLLL.LJIIIZ.getDuration());
        }
    }

    public AObjectS47S0101000_2(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
