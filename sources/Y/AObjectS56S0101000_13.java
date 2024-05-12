package Y;

import X.AnonymousClass710;
import X.AnonymousClass744;
import X.B5G;
import X.BZI;
import X.C0NB;
import X.C175296uL;
import X.C178406zM;
import X.C188727au;
import X.C28151B3b;
import X.C28787BRn;
import X.C29867Bnr;
import X.C30591Hz;
import X.C30868C9o;
import X.C32014ChO;
import X.C33814DOw;
import X.C35478DwA;
import X.C36152EGu;
import X.C38995FSd;
import X.C51421KGb;
import X.C74801TXh;
import X.C74838TYs;
import X.C74Z;
import X.C75017TcL;
import X.C75023TcR;
import X.C75457TjR;
import X.C75642TmQ;
import X.C75648TmW;
import X.C76800UCe;
import X.C77125UOr;
import X.C83621Wrp;
import X.CN1;
import X.DMI;
import X.DPB;
import X.DPI;
import X.EnumC57365MfJ;
import X.EnumC75636TmK;
import X.FMX;
import X.FNZ;
import X.G5D;
import X.GGS;
import X.InterfaceC65784Pro;
import X.InterfaceC75472Tjg;
import X.RunnableC51614KNm;
import X.T5T;
import X.UFE;
import X.X1D;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.util.concurrent.TimeUnit;

/* loaded from: classes14.dex */
public class AObjectS56S0101000_13 implements InterfaceC65784Pro {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS56S0101000_13 aObjectS56S0101000_13) {
        Boolean lambda$continueAfterWidgetLoaded$12;
        int i = 1;
        switch (aObjectS56S0101000_13.i1) {
            case 0:
                lambda$continueAfterWidgetLoaded$12 = ((AbsAudienceInteractionFragment) aObjectS56S0101000_13.l0).lambda$continueAfterWidgetLoaded$12();
                return lambda$continueAfterWidgetLoaded$12;
            case 1:
                C29867Bnr c29867Bnr = (C29867Bnr) aObjectS56S0101000_13.l0;
                c29867Bnr.getClass();
                BZI LIZ = C28787BRn.LIZ("livesdk_click_more_button");
                LIZ.LJIILLIIL(c29867Bnr.LJLLI);
                if (c29867Bnr.LJLJJL.getOwner().getSecret() != 1) {
                    i = 0;
                }
                UFE.LIZIZ(i, LIZ, "is_private_room");
                return C76800UCe.LIZ;
            case 2:
                AnonymousClass744 anonymousClass744 = (AnonymousClass744) aObjectS56S0101000_13.l0;
                if (AnonymousClass710.LIZLLL(anonymousClass744.LJLILLLLZI)) {
                    C74Z.LJJIJIIJIL("translate", anonymousClass744.LJLLLL, C178406zM.LJ(anonymousClass744.LLIIII, anonymousClass744.LJLILLLLZI), anonymousClass744.LJLILLLLZI, anonymousClass744.LJZ);
                    anonymousClass744.LLI.LJLILLLLZI = true;
                }
                if (C175296uL.LIZIZ(anonymousClass744.LJLILLLLZI, anonymousClass744.LJLLLLLL, anonymousClass744.LJLLLL, true)) {
                    C74Z.LJII(anonymousClass744.LJLLLL, anonymousClass744.LJLILLLLZI, EnumC57365MfJ.SHOW, null, anonymousClass744.LJLLLLLL);
                }
                Comment comment = anonymousClass744.LJLILLLLZI;
                if (!comment.isExpand && comment.needCollapse) {
                    FMX.LJIIL("show_more_comment", new C188727au().LIZ);
                }
                return Boolean.FALSE;
            case 3:
                Object obj = aObjectS56S0101000_13.l0;
                obj.getClass();
                DMI dmi = DMI.LJLIL;
                if (DPI.LIZ()) {
                    if (!C35478DwA.LIZIZ()) {
                        DPB.LIZIZ();
                    }
                } else {
                    dmi.invoke();
                }
                C38995FSd.LJ().schedule(new IDRunnableS6S0101000(4, obj, 6), ((Number) C33814DOw.LIZLLL.getValue()).longValue(), TimeUnit.MILLISECONDS);
                return null;
            case 4:
                aObjectS56S0101000_13.l0.getClass();
                return Boolean.valueOf(C36152EGu.LIZIZ(FNZ.LJLIL));
            case 5:
                return Long.valueOf(((VEVideoPublishPreviewScene) aObjectS56S0101000_13.l0).LJLLL.LJIIIZ.LJZL());
            default:
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS56S0101000_13.l0;
                G5D g5d = videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel;
                g5d.getClass();
                g5d.LJIL = "video_preview";
                View view = videoPublishContainerScene.LLIILZL;
                if (view != null) {
                    view.performClick();
                }
                G5D g5d2 = videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel;
                g5d2.getClass();
                g5d2.LJIL = "root";
                return null;
        }
    }

    public static final Object invoke$1(AObjectS56S0101000_13 aObjectS56S0101000_13) {
        switch (aObjectS56S0101000_13.i1) {
            case 0:
                return ((IGoodyBagService) aObjectS56S0101000_13.l0).qh0();
            case 1:
                Fragment fragment = (Fragment) aObjectS56S0101000_13.l0;
                if (fragment.mo49getActivity() != null) {
                    fragment.mo49getActivity().finishAndRemoveTask();
                    C28151B3b.LIZ().LIZIZ();
                    return null;
                }
                return null;
            case 2:
                return Boolean.valueOf(((BaseNewMusicTabFragment) aObjectS56S0101000_13.l0).LLIL);
            case 3:
                aObjectS56S0101000_13.l0.getClass();
                return GGS.LIZJ;
            case 4:
                return C83621Wrp.u((C83621Wrp) aObjectS56S0101000_13.l0);
            case 5:
                return Long.valueOf(((ChooseCoverActivity) aObjectS56S0101000_13.l0).LJLJJI.LJIIIZ.LJZL());
            case 6:
                return ((TTEPEffectPreviewActivity) aObjectS56S0101000_13.l0).LJLLILLLL;
            default:
                aObjectS56S0101000_13.l0.getClass();
                GGS.LIZ.getClass();
                return GGS.LIZLLL;
        }
    }

    public static final Object invoke$2(AObjectS56S0101000_13 aObjectS56S0101000_13) {
        switch (aObjectS56S0101000_13.i1) {
            case 0:
                LinkControlWidget linkControlWidget = (LinkControlWidget) ((LifecycleOwner) aObjectS56S0101000_13.l0);
                if (linkControlWidget.isViewValid() && linkControlWidget.LJLLI && linkControlWidget.LJZI()) {
                    B5G.LIZIZ().LJJJ = new C75648TmW("anchor_pair_designed_guide");
                    if (C77125UOr.LJIIJJI(linkControlWidget.LJLLL, 4)) {
                        if (B5G.LIZIZ().LIZ(EnumC75636TmK.CONNECTION_START)) {
                            linkControlWidget.LLIIJI();
                        } else if (B5G.LIZIZ().LIZJ() == EnumC75636TmK.INVITING) {
                            C32014ChO.LIZIZ(linkControlWidget.LLFZ(), "H5 open co-host, but is inviting other host!");
                        }
                    } else if (linkControlWidget.LJLLLL.LIZ.LLIIIILZ) {
                        C30591Hz.LJJII(1);
                        linkControlWidget.LJLLLL.getClass();
                        C75642TmQ.LJJJZ("connection_invite", null, 6);
                        linkControlWidget.LLIIJI();
                        C75017TcL.LJIIJ(linkControlWidget.dataChannel);
                    }
                }
                return null;
            case 1:
                EcBaseDiscoverAndSearchFragmentNew ecBaseDiscoverAndSearchFragmentNew = (EcBaseDiscoverAndSearchFragmentNew) ((LifecycleOwner) aObjectS56S0101000_13.l0);
                if (!ecBaseDiscoverAndSearchFragmentNew.mStatusDestroyed) {
                    KeyboardUtils.LIZLLL(ecBaseDiscoverAndSearchFragmentNew.LJLJI);
                    C51421KGb.LIZ();
                    T5T t5t = ecBaseDiscoverAndSearchFragmentNew.LJLJI;
                    if (t5t != null) {
                        t5t.post(new RunnableC51614KNm(2, ecBaseDiscoverAndSearchFragmentNew));
                    }
                }
                return null;
            case 2:
                ((StickerPropDetailFragment) ((LifecycleOwner) aObjectS56S0101000_13.l0)).Ol(null);
                return null;
            default:
                return ((ExteriorVideoRecordScene) ((LifecycleOwner) aObjectS56S0101000_13.l0)).LLILLJJLI;
        }
    }

    public static final Object invoke$3(AObjectS56S0101000_13 aObjectS56S0101000_13) {
        switch (aObjectS56S0101000_13.i1) {
            case 0:
                LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS56S0101000_13.l0;
                String LIZ = C74801TXh.LIZ(linkControlWidget.LJZ);
                C75023TcR.LIZLLL.LIZJ("key_checkAABCallback");
                Room room = linkControlWidget.LJLJLLL;
                if (room != null) {
                    if (linkControlWidget.LJLLL == 2) {
                        C75457TjR.LJIJJLI(room.getOwner().getFollowInfo().getFollowStatus(), LIZ, C75457TjR.LJ(C74838TYs.LJ().LJJ), ((IInteractService) CN1.LIZ(IInteractService.class)).ta0());
                        InterfaceC75472Tjg interfaceC75472Tjg = linkControlWidget.LJLJJI;
                        if (interfaceC75472Tjg != null) {
                            interfaceC75472Tjg.onInteractIconClick(true);
                        }
                        C0NB.LIZIZ("LinkControlWidget", "mMultiGuestAsGuestWidget audience onclick");
                    } else if (linkControlWidget.LJLLL == 4 && linkControlWidget.LLF()) {
                        C75457TjR.LJIJJLI(linkControlWidget.LJLJLLL.getOwner().getFollowInfo().getFollowStatus(), LIZ, "cohost", ((IInteractService) CN1.LIZ(IInteractService.class)).ta0());
                        linkControlWidget.LJLJJL.onInteractIconClick(true);
                        C0NB.LIZIZ("LinkControlWidget", "mMultiGuestAsGuestReservationWidget audience onclick");
                    }
                    return null;
                }
                C30868C9o.LIZJ(R.string.sp2);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onMultiGuestClickedV2 anr~~~");
                b1.LJ(LIZ2, linkControlWidget.LJLLL, LIZ2, "LinkControlWidget");
                return null;
            case 1:
                AwemeAppData.LIZJ((AwemeAppData) aObjectS56S0101000_13.l0);
                return null;
            case 2:
                ((BaseNewMusicTabFragment) aObjectS56S0101000_13.l0).Ml();
                return null;
            case 3:
                if (((AwemeListFragmentImpl) aObjectS56S0101000_13.l0).LJLLILLLL) {
                    return C76800UCe.LIZ;
                }
                return C76800UCe.LIZ;
            case 4:
                return C83621Wrp.D((C83621Wrp) aObjectS56S0101000_13.l0);
            default:
                return ((TTEPEffectPreviewActivity) aObjectS56S0101000_13.l0).LLIIJLIL;
        }
    }

    public static final Object invoke$4(AObjectS56S0101000_13 aObjectS56S0101000_13) {
        switch (aObjectS56S0101000_13.i1) {
            case 0:
                return ((BaseNewMusicTabFragment) ((LifecycleOwner) aObjectS56S0101000_13.l0)).Ml();
            case 1:
                AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) ((LifecycleOwner) aObjectS56S0101000_13.l0);
                if (awemeListFragmentImpl.LLILLIZIL != 1) {
                    awemeListFragmentImpl.LLLZI();
                }
                return C76800UCe.LIZ;
            case 2:
                return C83621Wrp.v((C83621Wrp) ((LifecycleOwner) aObjectS56S0101000_13.l0));
            case 3:
                return Long.valueOf(((ChooseCoverActivity) ((LifecycleOwner) aObjectS56S0101000_13.l0)).LJLJJI.LJIIIZ.getDuration());
            default:
                return ((TTEPEffectPreviewActivity) ((LifecycleOwner) aObjectS56S0101000_13.l0)).LJLL;
        }
    }

    public AObjectS56S0101000_13(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
