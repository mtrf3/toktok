package Y;

import X.AY5;
import X.AbstractC61537ODd;
import X.AbstractViewOnClickListenerC59797NdR;
import X.BFU;
import X.C156426By;
import X.C16880lQ;
import X.C169776lR;
import X.C36922EeM;
import X.C58655N0h;
import X.C58704N2e;
import X.C59096NHg;
import X.C59252NNg;
import X.C59333NQj;
import X.C59436NUi;
import X.C5MM;
import X.C60014Ngw;
import X.C61461OAf;
import X.C61938OSo;
import X.C63143OqJ;
import X.C63291Osh;
import X.C63308Osy;
import X.C63322OtC;
import X.C73062Slu;
import X.C73340SqO;
import X.C8BS;
import X.EnumC59048NFk;
import X.F67;
import X.FZ4;
import X.IWF;
import X.InterfaceC46937IbV;
import X.InterfaceC59381NSf;
import X.InterfaceC82683Wch;
import X.NDZ;
import X.NN1;
import X.NPQ;
import X.NQ1;
import X.NQL;
import X.NQM;
import X.NQN;
import X.OC6;
import X.OJY;
import X.OWC;
import X.ProgressDialogC173686rk;
import X.ProgressDialogC43241Gy5;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;
import com.bytedance.pitaya.cep_engine.dispatcher.Dispatcher;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.legoImp.task.InitAVModule;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;
import com.ss.android.ugc.aweme.prop.model.StickerPropAwemeList;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioCatcher;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ARunnableS14S0101000_10 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$0(ARunnableS14S0101000_10 aRunnableS14S0101000_10) {
        switch (aRunnableS14S0101000_10.i1) {
            case 0:
                NPQ.LIZIZ.LJ((String) aRunnableS14S0101000_10.l0);
                return;
            case 1:
                NQM nqm = (NQM) aRunnableS14S0101000_10.l0;
                NQN nqn = nqm.LIZ;
                if (nqn != null) {
                    C60014Ngw c60014Ngw = nqn.LIZIZ;
                    if (c60014Ngw != null) {
                        c60014Ngw.LIZJ();
                        nqn.LIZIZ = null;
                    }
                    nqm.LIZ = null;
                    return;
                }
                return;
            case 2:
                DetailFragmentPanel detailFragmentPanel = (DetailFragmentPanel) aRunnableS14S0101000_10.l0;
                InterfaceC82683Wch interfaceC82683Wch = detailFragmentPanel.LJLJJLL;
                if (interfaceC82683Wch != null && interfaceC82683Wch.isShowing()) {
                    detailFragmentPanel.LJLJJLL.dismiss();
                }
                detailFragmentPanel.LJLJJLL = null;
                return;
            case 3:
                FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) aRunnableS14S0101000_10.l0;
                feedRecommendFragment.Ql(Boolean.FALSE);
                feedRecommendFragment.LLI = true;
                return;
            case 4:
                AY5 ay5 = (AY5) aRunnableS14S0101000_10.l0;
                if (!ay5.isShowing()) {
                    return;
                }
                if (IWF.LJJLIIIIJ().isPlaying()) {
                    IWF.LJJLIIIIJ().LJIILJJIL();
                    ay5.LJLJI = true;
                    return;
                } else {
                    ay5.LJ();
                    return;
                }
            case 5:
                T t = ((C8BS) aRunnableS14S0101000_10.l0).mData;
                if (t != 0) {
                    List<Aweme> list = ((StickerPropAwemeList) t).items;
                    EnumC59048NFk preloadScene = EnumC59048NFk.AGGREGATION_PAGE;
                    o.LJIIIZ(preloadScene, "preloadScene");
                    NDZ.LIZ(list, preloadScene, null);
                    return;
                }
                return;
            case 6:
                ((C156426By) aRunnableS14S0101000_10.l0).LJIJJLI();
                return;
            case 7:
                ProgressDialogC173686rk.LIZ((ProgressDialogC173686rk) aRunnableS14S0101000_10.l0);
                return;
            default:
                AudioCatcher.lambda$semisugar$stop$0((AudioCatcher) aRunnableS14S0101000_10.l0);
                return;
        }
    }

    public static final void run$1(ARunnableS14S0101000_10 aRunnableS14S0101000_10) {
        FeedItemList feedItemList = (FeedItemList) aRunnableS14S0101000_10.l0;
        int i = aRunnableS14S0101000_10.i1;
        if (feedItemList != null) {
            NDZ.LIZ(feedItemList.getItems(), EnumC59048NFk.FEED, Integer.valueOf(i));
        }
    }

    public static final void run$10(ARunnableS14S0101000_10 aRunnableS14S0101000_10) {
        boolean LIZ;
        try {
            ((C61938OSo) aRunnableS14S0101000_10.l0).LJLL.LIZIZ(aRunnableS14S0101000_10.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS14S0101000_10 aRunnableS14S0101000_10) {
        switch (aRunnableS14S0101000_10.i1) {
            case 0:
                MultiGuestPreviewFragment multiGuestPreviewFragment = (MultiGuestPreviewFragment) aRunnableS14S0101000_10.l0;
                ViewGroup.LayoutParams layoutParams = multiGuestPreviewFragment.LLJJ;
                if (layoutParams != null && (layoutParams instanceof FrameLayout.LayoutParams)) {
                    ((View) multiGuestPreviewFragment.LJLJJL).setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    multiGuestPreviewFragment.xl();
                    return;
                }
                multiGuestPreviewFragment.xl();
                return;
            case 1:
                Dispatcher.m75dispatch$lambda4((FZ4) aRunnableS14S0101000_10.l0);
                return;
            case 2:
                AuthorizeActivity authorizeActivity = (AuthorizeActivity) aRunnableS14S0101000_10.l0;
                authorizeActivity.getClass();
                authorizeActivity.LLIIIJ(-1, new Intent());
                return;
            case 3:
                NQ1 nq1 = (NQ1) aRunnableS14S0101000_10.l0;
                if (nq1.LJLLLL != null) {
                    OJY LJIL = C73340SqO.LJIL();
                    Context context = nq1.getContext();
                    Aweme aweme = nq1.LJLLLL;
                    LJIL.getClass();
                    OJY.LJI(context, aweme);
                    C58704N2e.LIZLLL("draw_ad", "button_show", nq1.LJLLLL.getAwemeRawAd()).LJII();
                    C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", nq1.LJLLLL.getAwemeRawAd());
                    LIZLLL.LIZJ("button", "refer");
                    LIZLLL.LIZIZ(0, "is_lynx");
                    LIZLLL.LIZIZ(2, "button_type");
                    LIZLLL.LJII();
                }
                if (!nq1.LJIIJJI()) {
                    nq1.LJIIIIZZ(1000L);
                    return;
                }
                return;
            case 4:
                ((F67) aRunnableS14S0101000_10.l0).onChanged();
                return;
            case 5:
                try {
                    ((InterfaceC46937IbV) ((Surface) aRunnableS14S0101000_10.l0)).LJ();
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                AbstractViewOnClickListenerC59797NdR this$0 = (AbstractViewOnClickListenerC59797NdR) aRunnableS14S0101000_10.l0;
                o.LJIIIZ(this$0, "this$0");
                if (this$0.LJLILLLLZI) {
                    AbstractViewOnClickListenerC59797NdR.LJLJJL = true;
                    return;
                } else {
                    this$0.LJLJI = true;
                    return;
                }
        }
    }

    public static final void run$3(ARunnableS14S0101000_10 aRunnableS14S0101000_10) {
        boolean LIZ;
        try {
            ProgressDialogC43241Gy5 progressDialogC43241Gy5 = ((OWC) aRunnableS14S0101000_10.l0).LIZIZ;
            if (progressDialogC43241Gy5 != null) {
                progressDialogC43241Gy5.setProgress(aRunnableS14S0101000_10.i1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS14S0101000_10 aRunnableS14S0101000_10) {
        boolean LIZ;
        try {
            try {
                C61461OAf.LIZJ(aRunnableS14S0101000_10.i1, (List) aRunnableS14S0101000_10.l0);
            } catch (Exception e) {
                OC6.LJ("clean-channel", "", e);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS14S0101000_10 aRunnableS14S0101000_10) {
        boolean LIZ;
        try {
            ((C59096NHg) aRunnableS14S0101000_10.l0).LIZ(aRunnableS14S0101000_10.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS14S0101000_10 aRunnableS14S0101000_10) {
        boolean LIZ;
        try {
            ((C59096NHg) aRunnableS14S0101000_10.l0).LIZ(aRunnableS14S0101000_10.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS14S0101000_10 aRunnableS14S0101000_10) {
        boolean LIZ;
        try {
            C63322OtC.LIZLLL("IMClient checkRecover onRun");
            ((C63308Osy) aRunnableS14S0101000_10.l0).LJIIIIZZ();
            C63143OqJ.LJII().LIZLLL();
            C63291Osh.LIZ().getClass();
            C63322OtC.LJFF("SPUtils clear all");
            C63291Osh.LIZLLL.clearAll();
            C63291Osh LIZ2 = C63291Osh.LIZ();
            int i = aRunnableS14S0101000_10.i1;
            LIZ2.getClass();
            C63291Osh.LIZLLL.putInt(C63291Osh.LJIIIZ("recover_version"), i);
            ((C63308Osy) aRunnableS14S0101000_10.l0).LJII();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS14S0101000_10 aRunnableS14S0101000_10) {
        switch (aRunnableS14S0101000_10.i1) {
            case 0:
                IDAListenerS74S0100000_5 iDAListenerS74S0100000_5 = (IDAListenerS74S0100000_5) aRunnableS14S0101000_10.l0;
                if (((BFU) iDAListenerS74S0100000_5.l0).getParent() != null) {
                    C16880lQ.LJLLL((BFU) iDAListenerS74S0100000_5.l0, (ViewGroup) ((BFU) iDAListenerS74S0100000_5.l0).getParent());
                    return;
                }
                return;
            case 1:
                C73062Slu.LJI((C73062Slu) aRunnableS14S0101000_10.l0);
                return;
            case 2:
                ((ReactiveAccountActivity) aRunnableS14S0101000_10.l0).LJLJLLL.queryUser();
                return;
            case 3:
                C169776lR c169776lR = (C169776lR) aRunnableS14S0101000_10.l0;
                if (!c169776lR.LJJIL || !c169776lR.LJJIIZ.LIZJ()) {
                    return;
                }
                MutableLiveData<C5MM> mutableLiveData = c169776lR.LIZLLL;
                long j = c169776lR.LJJJJIZL.LIZIZ;
                if (j < 0) {
                    j = 0;
                }
                mutableLiveData.setValue(C5MM.LIZLLL(j));
                c169776lR.LJJIFFI((int) c169776lR.LJJJJIZL.LIZJ, false);
                c169776lR.LJIIJJI();
                return;
            case 4:
                ((RecommendFeedFragmentPanel) aRunnableS14S0101000_10.l0).LJLIL();
                return;
            case 5:
                ((InitAVModule) aRunnableS14S0101000_10.l0).LJIIJ();
                return;
            case 6:
                ProfilePageFragment profilePageFragment = (ProfilePageFragment) aRunnableS14S0101000_10.l0;
                List<Pair<Aweme, Integer>> list = profilePageFragment.LL;
                profilePageFragment.pm(0, list);
                profilePageFragment.LL = list;
                return;
            default:
                ((VideoRecordPermissionActivity) aRunnableS14S0101000_10.l0).LLIIIILZ();
                return;
        }
    }

    public static final void run$9(ARunnableS14S0101000_10 aRunnableS14S0101000_10) {
        InterfaceC59381NSf interfaceC59381NSf = (InterfaceC59381NSf) aRunnableS14S0101000_10.l0;
        int i = aRunnableS14S0101000_10.i1;
        if (interfaceC59381NSf != null) {
            int i2 = C59436NUi.LIZIZ;
            if (i2 == 0) {
                if (i > 0) {
                    C59333NQj c59333NQj = (C59333NQj) interfaceC59381NSf;
                    NQL nql = c59333NQj.LIZLLL;
                    Aweme aweme = c59333NQj.LIZ;
                    Context context = c59333NQj.LIZIZ;
                    nql.getClass();
                    if (aweme == null) {
                        return;
                    }
                    C36922EeM.LJ("AdOM playerMute ");
                    C59252NNg.LJIILIIL("mute", aweme, null);
                    NN1.LJJI(context, aweme, nql.LJIIIZ + 1);
                    C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "mute", aweme.getAwemeRawAd());
                    LIZLLL.LIZIZ(Integer.valueOf(nql.LJIIL(LIZLLL, aweme)), "play_order");
                    LIZLLL.LIZIZ(Float.valueOf(0.0f), "playervol");
                    LIZLLL.LJII();
                    return;
                }
                return;
            }
            if (i2 <= 0 || i != 0) {
                return;
            }
            C59333NQj c59333NQj2 = (C59333NQj) interfaceC59381NSf;
            NQL nql2 = c59333NQj2.LIZLLL;
            Aweme aweme2 = c59333NQj2.LIZ;
            Context context2 = c59333NQj2.LIZIZ;
            nql2.getClass();
            if (aweme2 == null) {
                return;
            }
            C59252NNg.LJIILIIL("unmute", aweme2, null);
            NN1.LJJIFFI(context2, aweme2, nql2.LJIIIZ + 1);
            C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "unmute", aweme2.getAwemeRawAd());
            LIZLLL2.LIZIZ(Integer.valueOf(nql2.LJIIL(LIZLLL2, aweme2)), "play_order");
            LIZLLL2.LIZIZ(Float.valueOf(NQL.LJIILIIL(context2)), "playervol");
            LIZLLL2.LJII();
        }
    }

    public ARunnableS14S0101000_10(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }

    public ARunnableS14S0101000_10(int i, List list, AbstractC61537ODd abstractC61537ODd, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = list;
    }
}
