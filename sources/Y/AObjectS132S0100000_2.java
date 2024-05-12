package Y;

import X.C1545664u;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C6FS;
import X.C73305Spp;
import X.C76800UCe;
import X.InterfaceC157206Ey;
import X.InterfaceC65784Pro;
import X.XWS;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity;
import com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes3.dex */
public class AObjectS132S0100000_2 implements InterfaceC65784Pro {
    public final int $t;
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
            case 7:
                return invoke$7(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS132S0100000_2 aObjectS132S0100000_2) {
        ((VideoEditContainerScene) aObjectS132S0100000_2.l0).LLLLIIIILLL();
        return null;
    }

    public static final Object invoke$1(AObjectS132S0100000_2 aObjectS132S0100000_2) {
        VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) aObjectS132S0100000_2.l0;
        videoEditContainerScene.LJLLLL.addView(videoEditContainerScene.LLII.Iy());
        return null;
    }

    public static final Object invoke$2(AObjectS132S0100000_2 aObjectS132S0100000_2) {
        ((C6FS) aObjectS132S0100000_2.l0).Tq();
        return null;
    }

    public static final Object invoke$3(AObjectS132S0100000_2 aObjectS132S0100000_2) {
        return Long.valueOf(((VEVideoPublishPreviewActivity) aObjectS132S0100000_2.l0).LJLLI.LJIIIZ.LJZL());
    }

    public static final Object invoke$4(AObjectS132S0100000_2 aObjectS132S0100000_2) {
        return Long.valueOf(((VEVideoPublishPreviewActivity) aObjectS132S0100000_2.l0).LJLLI.LJIIIZ.getDuration());
    }

    public static final Object invoke$5(AObjectS132S0100000_2 aObjectS132S0100000_2) {
        C1545664u c1545664u = (C1545664u) aObjectS132S0100000_2.l0;
        c1545664u.LLIIIL.LIZIZ();
        c1545664u.LLIIL = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AObjectS132S0100000_2 aObjectS132S0100000_2) {
        DraftBoxActivity draftBoxActivity = (DraftBoxActivity) ((KeyEvent.Callback) aObjectS132S0100000_2.l0);
        Fragment LJJJI = draftBoxActivity.getSupportFragmentManager().LJJJI(R.id.dm7);
        draftBoxActivity.LJLJI = LJJJI;
        if (LJJJI == null) {
            draftBoxActivity.LJLJI = new DraftFragment();
            if (draftBoxActivity.getIntent() != null) {
                draftBoxActivity.LJLJI.setArguments(C16880lQ.LLJJIJI(draftBoxActivity.getIntent()));
            }
            FragmentManager supportFragmentManager = draftBoxActivity.getSupportFragmentManager();
            C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
            LIZ.LJIIIIZZ(R.id.dm7, 1, draftBoxActivity.LJLJI, null);
            LIZ.LJ(null);
            LIZ.LJI();
        }
        return null;
    }

    public static final Object invoke$7(AObjectS132S0100000_2 aObjectS132S0100000_2) {
        XWS xws = (XWS) aObjectS132S0100000_2.l0;
        C73305Spp c73305Spp = xws.LIZJ;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
            xws.LIZJ.LJFF();
        }
        InterfaceC157206Ey interfaceC157206Ey = xws.LJI;
        if (interfaceC157206Ey != null) {
            interfaceC157206Ey.refreshData();
            return null;
        }
        return null;
    }

    public AObjectS132S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
