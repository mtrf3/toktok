package kotlin.jvm.internal;

import X.AMD;
import X.AbstractC32579CqV;
import X.AbstractC65781Prl;
import X.AbstractC72932td;
import X.ActivityC45651qj;
import X.C213178Yf;
import X.C26045AKb;
import X.C29S;
import X.C32580CqW;
import X.C34K;
import X.C36978EfG;
import X.C36979EfH;
import X.C39557Ffl;
import X.C3C1;
import X.C42247Gi3;
import X.C58045MqH;
import X.C69698RXa;
import X.C70655RoB;
import X.C72912tb;
import X.C72922tc;
import X.C72977SkX;
import X.C73893SzJ;
import X.C76800UCe;
import X.C9QW;
import X.DialogC25756A8y;
import X.GSX;
import X.IA2;
import X.InterfaceC35811ar;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC72022SOk;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.MKQ;
import X.OSZ;
import X.RYJ;
import X.TEJ;
import X.TF5;
import X.TH0;
import X.TH1;
import X.TH7;
import X.TMX;
import X.TN1;
import X.TN2;
import Y.ARunnableS31S0200000_12;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc.LiveCPCViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.bytedance.widget.Widget;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.PrivacySettingDialogRouter;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpHeaderViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpSkcViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpTitleViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel;
import com.ss.android.ugc.aweme.library.viewmodel.LibraryDetailViewModel;
import com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel;
import com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailJediViewModel;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel;
import com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes13.dex */
public class AqS72S0400000_12 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0();
            case 1:
                return invoke$1();
            case 2:
                return invoke$2();
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$3();
            case 5:
                return invoke$4();
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$5();
            case 8:
                return invoke$6();
            case 9:
                return invoke$7();
            case 10:
                return invoke$8();
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$9();
            case 12:
                return invoke$10();
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$11();
            case 14:
                return invoke$12();
            case 15:
                return invoke$13();
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$14();
            case 17:
                return invoke$15();
            case 18:
                return invoke$16();
            case 19:
                return invoke$17();
            case 20:
                return invoke$18();
            case 21:
                return invoke$19();
            case 22:
                return invoke$20();
            case 23:
                return invoke$23(this);
            case 24:
                return invoke$24(this);
            case 25:
                return invoke$21();
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case 33:
                return invoke$33(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.bytedance.jedi.arch.JediViewModel, com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc.LiveCPCViewModel] */
    public final LiveCPCViewModel invoke$0() {
        Fragment fragment;
        C32580CqW c32580CqW = ((AbstractC32579CqV) this.l0).LJLJJL;
        if (c32580CqW != null) {
            fragment = c32580CqW.getFragment();
        } else {
            fragment = null;
        }
        o.LJI(fragment);
        ViewModel viewModel = ViewModelProviders.of(fragment, ((AMD) ((AbstractC32579CqV) this.l0)).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) this.l3;
        ?? r3 = (JediViewModel) viewModel;
        InterfaceC72022SOk create = r3.LJLJJI.create(LiveCPCViewModel.class);
        if (create != null) {
            create.binding(r3);
        }
        r3.ov0(interfaceC88472Yns);
        return r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bytedance.jedi.arch.JediViewModel, com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc.LiveCPCViewModel] */
    public final LiveCPCViewModel invoke$1() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(LiveCPCViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS178S0100000_12(this, 83));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final MiniPdpPanelViewModel invoke$10() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(MiniPdpPanelViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS178S0100000_12(this, 169));
        return r2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpSkcViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final MiniPdpSkcViewModel invoke$11() {
        ViewModelProvider of;
        Object host = ((Widget) this.l0).getHost();
        if (host instanceof Fragment) {
            of = ViewModelProviders.of((Fragment) host, ((AMD) ((Widget) this.l0)).getViewModelFactory());
        } else if (host instanceof ActivityC45651qj) {
            of = ViewModelProviders.of((ActivityC45651qj) host, ((AMD) ((Widget) this.l0)).getViewModelFactory());
        } else {
            throw new IllegalStateException();
        }
        ?? r2 = (JediViewModel) of.get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(MiniPdpSkcViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0((InterfaceC88472Yns) this.l3);
        return r2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpSkcViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final MiniPdpSkcViewModel invoke$12() {
        ViewModelProvider of;
        Object host = ((Widget) this.l0).getHost();
        if (host instanceof Fragment) {
            of = ViewModelProviders.of((Fragment) host, ((AMD) ((Widget) this.l0)).getViewModelFactory());
        } else if (host instanceof ActivityC45651qj) {
            of = ViewModelProviders.of((ActivityC45651qj) host, ((AMD) ((Widget) this.l0)).getViewModelFactory());
        } else {
            throw new IllegalStateException();
        }
        ?? r2 = (JediViewModel) of.get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(MiniPdpSkcViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0((InterfaceC88472Yns) this.l3);
        return r2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpTitleViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final MiniPdpTitleViewModel invoke$13() {
        ViewModelProvider of;
        Object host = ((Widget) this.l0).getHost();
        if (host instanceof Fragment) {
            of = ViewModelProviders.of((Fragment) host, ((AMD) ((Widget) this.l0)).getViewModelFactory());
        } else if (host instanceof ActivityC45651qj) {
            of = ViewModelProviders.of((ActivityC45651qj) host, ((AMD) ((Widget) this.l0)).getViewModelFactory());
        } else {
            throw new IllegalStateException();
        }
        ?? r2 = (JediViewModel) of.get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(MiniPdpTitleViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0((InterfaceC88472Yns) this.l3);
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel] */
    public final FollowerRelationViewModel invoke$14() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(FollowerRelationViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS178S0100000_12(this, 198));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final FollowingRelationViewModel invoke$15() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(FollowingRelationViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS178S0100000_12(this, 199));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.library.viewmodel.LibraryDetailViewModel] */
    public final LibraryDetailViewModel invoke$16() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(LibraryDetailViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS178S0100000_12(this, 231));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final EffectProfileListViewModel invoke$17() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(EffectProfileListViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS178S0100000_12(this, 260));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailJediViewModel] */
    public final QuestionDetailJediViewModel invoke$18() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(QuestionDetailJediViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS178S0100000_12(this, 273));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final SocialRecRequestViewModel invoke$19() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(SocialRecRequestViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS178S0100000_12(this, 274));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel] */
    public final ChallengeDetailJediViewModel invoke$2() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(ChallengeDetailJediViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS178S0100000_12(this, 100));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final ShoutoutsPlayViewModel invoke$20() {
        C29S c29s = (C29S) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(c29s, ((AMD) c29s).getViewModelFactory()).get(C39557Ffl.LIZ((InterfaceC65350Pko) this.l3).getName(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        InterfaceC72022SOk create = r2.LJLJJI.create(ShoutoutsPlayViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS178S0100000_12(this, 292));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bytedance.jedi.arch.JediViewModel, com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc.LiveCPCViewModel] */
    public final LiveCPCViewModel invoke$21() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(LiveCPCViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS178S0100000_12(this, 489));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke$22() {
        InterfaceC88472Yns interfaceC88472Yns;
        AbstractC72932td abstractC72932td = (AbstractC72932td) ((C213178Yf) this.l0).LIZ;
        if (abstractC72932td instanceof C72922tc) {
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) this.l1;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        if (abstractC72932td instanceof C3C1) {
            InterfaceC88472Yns interfaceC88472Yns2 = (InterfaceC88472Yns) this.l2;
            if (interfaceC88472Yns2 == null) {
                return;
            }
            interfaceC88472Yns2.invoke(((C3C1) abstractC72932td).LIZ);
            return;
        }
        if (!(abstractC72932td instanceof C72912tb) || (interfaceC88472Yns = (InterfaceC88472Yns) this.l3) == null) {
            return;
        }
        interfaceC88472Yns.invoke(((C72912tb) abstractC72932td).LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final TrendsTabViewModel invoke$3() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(TrendsTabViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS178S0100000_12(this, 106));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$4() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(PdpViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS178S0100000_12(this, 132));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final ProductReviewViewModel invoke$5() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(ProductReviewViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS178S0100000_12(this, 154));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final ProductReviewViewModel invoke$6() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(ProductReviewViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS178S0100000_12(this, 159));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final ProductReviewViewModel invoke$7() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(ProductReviewViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS178S0100000_12(this, 160));
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final ReviewGalleryViewModel invoke$8() {
        Fragment fragment = (Fragment) this.l0;
        ?? r2 = (JediViewModel) ViewModelProviders.of(fragment, ((AMD) fragment).getViewModelFactory()).get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(ReviewGalleryViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0(new AqS178S0100000_12(this, 162));
        return r2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpHeaderViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final MiniPdpHeaderViewModel invoke$9() {
        ViewModelProvider of;
        Object host = ((Widget) this.l0).getHost();
        if (host instanceof Fragment) {
            of = ViewModelProviders.of((Fragment) host, ((AMD) ((Widget) this.l0)).getViewModelFactory());
        } else if (host instanceof ActivityC45651qj) {
            of = ViewModelProviders.of((ActivityC45651qj) host, ((AMD) ((Widget) this.l0)).getViewModelFactory());
        } else {
            throw new IllegalStateException();
        }
        ?? r2 = (JediViewModel) of.get((String) ((InterfaceC65784Pro) this.l1).invoke(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l2));
        InterfaceC72022SOk create = r2.LJLJJI.create(MiniPdpHeaderViewModel.class);
        if (create != null) {
            create.binding(r2);
        }
        r2.ov0((InterfaceC88472Yns) this.l3);
        return r2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (((java.lang.Boolean) r2.invoke(r1)).booleanValue() == true) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$23(kotlin.jvm.internal.AqS72S0400000_12 r8) {
        /*
            java.lang.Object r2 = r8.l0
            X.Yns r2 = (X.InterfaceC88472Yns) r2
            if (r2 == 0) goto L1f
            java.lang.Object r1 = r8.l1
            X.MqH r1 = (X.C58045MqH) r1
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Object r0 = r2.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != r0) goto L1f
        L1c:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1f:
            java.lang.Object r7 = r8.l1
            X.MqH r7 = (X.C58045MqH) r7
            T r1 = r7.data
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemToCartData
            if (r0 == 0) goto L1c
            com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemToCartData r1 = (com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemToCartData) r1
            if (r1 == 0) goto L1c
            java.lang.Object r6 = r8.l2
            android.view.View r6 = (android.view.View) r6
            java.lang.Object r5 = r8.l3
            X.Ynr r5 = (X.InterfaceC88471Ynr) r5
            com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX r4 = r1.exceptionUX
            X.Rca r3 = X.C69936Rca.LJLIL
            X.Rcb r2 = X.C69937Rcb.LJLIL
            kotlin.jvm.internal.AqS140S0200000_9 r1 = new kotlin.jvm.internal.AqS140S0200000_9
            r0 = 54
            r1.<init>(r5, r7, r0)
            X.C28145B2v.LIZ(r6, r4, r3, r2, r1)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS72S0400000_12.invoke$23(kotlin.jvm.internal.AqS72S0400000_12):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (((java.lang.Boolean) r2.invoke(r1)).booleanValue() == true) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$24(kotlin.jvm.internal.AqS72S0400000_12 r8) {
        /*
            java.lang.Object r2 = r8.l0
            X.Yns r2 = (X.InterfaceC88472Yns) r2
            if (r2 == 0) goto L1f
            java.lang.Object r1 = r8.l1
            X.RYJ r1 = (X.RYJ) r1
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Object r0 = r2.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != r0) goto L1f
        L1c:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1f:
            java.lang.Object r7 = r8.l1
            X.RYJ r7 = (X.RYJ) r7
            T r1 = r7.data
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.BundleAddItemsToCartData
            if (r0 == 0) goto L1c
            com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.BundleAddItemsToCartData r1 = (com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.BundleAddItemsToCartData) r1
            if (r1 == 0) goto L1c
            java.lang.Object r6 = r8.l2
            android.view.View r6 = (android.view.View) r6
            java.lang.Object r5 = r8.l3
            X.Ynr r5 = (X.InterfaceC88471Ynr) r5
            com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX r4 = r1.exceptionUX
            X.Rcc r3 = X.C69938Rcc.LJLIL
            X.Rcd r2 = X.C69939Rcd.LJLIL
            kotlin.jvm.internal.AqS140S0200000_9 r1 = new kotlin.jvm.internal.AqS140S0200000_9
            r0 = 55
            r1.<init>(r5, r7, r0)
            X.C28145B2v.LIZ(r6, r4, r3, r2, r1)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS72S0400000_12.invoke$24(kotlin.jvm.internal.AqS72S0400000_12):java.lang.Object");
    }

    public static final Object invoke$26(AqS72S0400000_12 aqS72S0400000_12) {
        ((C72977SkX) aqS72S0400000_12.l1).LIZIZ(((InterfaceC88473Ynt) aqS72S0400000_12.l0).invoke(((C72977SkX) aqS72S0400000_12.l1).LIZIZ, ((C72977SkX) aqS72S0400000_12.l2).LIZIZ, ((C72977SkX) aqS72S0400000_12.l3).LIZIZ));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(AqS72S0400000_12 aqS72S0400000_12) {
        TH1 th1 = (TH1) aqS72S0400000_12.l0;
        FragmentManager fragmentManager = (FragmentManager) aqS72S0400000_12.l1;
        TF5 requiredDependency = (TF5) aqS72S0400000_12.l2;
        TEJ tej = th1.LJLJLLL;
        C73893SzJ<OSZ<Integer, Integer>> c73893SzJ = th1.LJLJJLL;
        tej.LJI = IA2.LIZ(c73893SzJ, c73893SzJ);
        TH7 categoryProvider = (TH7) aqS72S0400000_12.l3;
        o.LJIIIZ(fragmentManager, "fragmentManager");
        o.LJIIIZ(requiredDependency, "requiredDependency");
        o.LJIIIZ(categoryProvider, "categoryProvider");
        return new TH0(th1, fragmentManager, requiredDependency, tej, th1.LJLIL, th1.LJLILLLLZI, categoryProvider);
    }

    public static final Object invoke$28(AqS72S0400000_12 aqS72S0400000_12) {
        boolean z;
        int i;
        ReviewGalleryViewModel wl = ((ReviewGalleryFragment) aqS72S0400000_12.l0).wl();
        View view = (View) aqS72S0400000_12.l1;
        C69698RXa c69698RXa = (C69698RXa) aqS72S0400000_12.l2;
        String str = c69698RXa.LIZ;
        if (str == null) {
            str = "";
        }
        Boolean bool = c69698RXa.LJ;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        Integer num = ((C69698RXa) aqS72S0400000_12.l2).LIZLLL;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        wl.Nv0(view, str, z, i, (C69698RXa) aqS72S0400000_12.l3, ((Number) ((ReviewGalleryFragment) aqS72S0400000_12.l0).LJLJLLL.getValue()).intValue());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(AqS72S0400000_12 aqS72S0400000_12) {
        boolean z;
        int i;
        ReviewGalleryViewModel wl = ((ReviewGalleryFragment) aqS72S0400000_12.l0).wl();
        View view = (View) aqS72S0400000_12.l1;
        C69698RXa c69698RXa = (C69698RXa) aqS72S0400000_12.l2;
        String str = c69698RXa.LIZ;
        if (str == null) {
            str = "";
        }
        Boolean bool = c69698RXa.LJ;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        Integer num = ((C69698RXa) aqS72S0400000_12.l2).LIZLLL;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        wl.Nv0(view, str, z, i, (C69698RXa) aqS72S0400000_12.l3, ((Number) ((ReviewGalleryFragment) aqS72S0400000_12.l0).LJLJLLL.getValue()).intValue());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS72S0400000_12 aqS72S0400000_12) {
        ((DialogC25756A8y) aqS72S0400000_12.l0).dismiss();
        C26045AKb c26045AKb = new C26045AKb((ActivityC45651qj) aqS72S0400000_12.l1);
        c26045AKb.LJIIIIZZ(R.string.gqr);
        c26045AKb.LJIIJ();
        ((PrivacySettingDialogRouter) aqS72S0400000_12.l2).sendLoopCurrentStoryEvent((Aweme) aqS72S0400000_12.l3, false);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$30(AqS72S0400000_12 aqS72S0400000_12) {
        aqS72S0400000_12.invoke$22();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$31(AqS72S0400000_12 aqS72S0400000_12) {
        if (((C9QW) aqS72S0400000_12.l0) != null && !((MentionFavoriteVideoVM) aqS72S0400000_12.l1).hv0()) {
            ((IAVPublishService) aqS72S0400000_12.l2).setMentionVideoSubType(((MentionFavoriteVideoVM) aqS72S0400000_12.l1).getActivity(), 10);
            C42247Gi3.LIZIZ("favorites");
            C42247Gi3.LIZIZ = "favorites";
            ((MentionFavoriteVideoVM) aqS72S0400000_12.l1).kv0((View) aqS72S0400000_12.l3, ((C9QW) aqS72S0400000_12.l0).LJLIL);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$32(AqS72S0400000_12 aqS72S0400000_12) {
        if (((C9QW) aqS72S0400000_12.l0) != null) {
            if (((MentionFavoriteVideoVM) aqS72S0400000_12.l1).hv0()) {
                ((InterfaceC35811ar) aqS72S0400000_12.l3).setValue(Boolean.FALSE);
            } else {
                ((MentionFavoriteVideoVM) aqS72S0400000_12.l1).jv0(true);
                ((InterfaceC35811ar) aqS72S0400000_12.l3).setValue(Boolean.TRUE);
                if (((IAVPublishService) aqS72S0400000_12.l2).getCurrentUserId().equals(((C9QW) aqS72S0400000_12.l0).LJLIL.getAuthorUid())) {
                    IAVPublishService iAVPublishService = (IAVPublishService) aqS72S0400000_12.l2;
                    ActivityC45651qj activity = ((MentionFavoriteVideoVM) aqS72S0400000_12.l1).getActivity();
                    String uniqueId = ((C9QW) aqS72S0400000_12.l0).LJLIL.getAuthor().getUniqueId();
                    if (uniqueId == null) {
                        uniqueId = ((C9QW) aqS72S0400000_12.l0).LJLIL.getAuthor().getShortId();
                    }
                    iAVPublishService.setChainInfo(activity, new GSX(uniqueId, ((C9QW) aqS72S0400000_12.l0).LJLIL.getAuthor().getNickname(), ((C9QW) aqS72S0400000_12.l0).LJLIL.getAuthor().getUid(), ((C9QW) aqS72S0400000_12.l0).LJLIL.getAuthor().getSecUid(), ((C9QW) aqS72S0400000_12.l0).LJLIL.getAid(), ((C9QW) aqS72S0400000_12.l0).LJLIL.getStatus().getPrivateStatus(), ((C9QW) aqS72S0400000_12.l0).LJLIL.getAuthor().isAccuratePrivateAccount() ? 1 : 0, 10, "click_panel"));
                } else if (((MentionFavoriteVideoVM) aqS72S0400000_12.l1).getActivity() != null) {
                    ((IAVPublishService) aqS72S0400000_12.l2).setMentionVideoSubType(((MentionFavoriteVideoVM) aqS72S0400000_12.l1).getActivity(), 10);
                    ((IAVPublishService) aqS72S0400000_12.l2).showMentionVideoLoading(((MentionFavoriteVideoVM) aqS72S0400000_12.l1).getActivity());
                    ActivityC45651qj activity2 = ((MentionFavoriteVideoVM) aqS72S0400000_12.l1).getActivity();
                    if (activity2 != null) {
                        String aid = ((C9QW) aqS72S0400000_12.l0).LJLIL.getAid();
                        o.LJIIIIZZ(aid, "item.data.aid");
                        C42247Gi3.LIZ(activity2, aid, "click_panel");
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                C42247Gi3.LIZIZ("favorites");
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$33(AqS72S0400000_12 aqS72S0400000_12) {
        return new TMX((InterfaceC65784Pro) aqS72S0400000_12.l0, (InterfaceC65784Pro) aqS72S0400000_12.l1, (InterfaceC65784Pro) aqS72S0400000_12.l2, (InterfaceC65784Pro) aqS72S0400000_12.l3);
    }

    public static final Object invoke$6(AqS72S0400000_12 aqS72S0400000_12) {
        PdpBodyWidget pdpBodyWidget;
        View view;
        if (((C34K) aqS72S0400000_12.l0).element && (view = (pdpBodyWidget = (PdpBodyWidget) aqS72S0400000_12.l1).contentView) != null) {
            view.post(new ARunnableS31S0200000_12((MKQ) aqS72S0400000_12.l3, pdpBodyWidget, 14));
        }
        if (C70655RoB.LIZ().drawListener) {
            ((PdpBodyWidget) aqS72S0400000_12.l1).trackPdpPageDataMounted((List) aqS72S0400000_12.l2);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS72S0400000_12(C29S c29s, InterfaceC65350Pko interfaceC65350Pko, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC65350Pko interfaceC65350Pko2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c29s;
        this.l1 = interfaceC65350Pko;
        this.l2 = interfaceC88471Ynr;
        this.l3 = interfaceC65350Pko2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS72S0400000_12(C34K c34k, C34K c34k2, PdpBodyWidget pdpBodyWidget, List<? extends Object> list, MKQ mkq) {
        super(0);
        this.$t = mkq;
        this.l0 = c34k;
        this.l1 = c34k2;
        this.l2 = pdpBodyWidget;
        this.l3 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS72S0400000_12(C9QW c9qw, C9QW c9qw2, MentionFavoriteVideoVM mentionFavoriteVideoVM, IAVPublishService iAVPublishService, InterfaceC35811ar<Boolean> interfaceC35811ar) {
        super(0);
        this.$t = interfaceC35811ar;
        this.l0 = c9qw;
        this.l1 = c9qw2;
        this.l2 = mentionFavoriteVideoVM;
        this.l3 = iAVPublishService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS72S0400000_12(C9QW c9qw, MentionFavoriteVideoVM mentionFavoriteVideoVM, IAVPublishService iAVPublishService, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = c9qw;
        this.l1 = mentionFavoriteVideoVM;
        this.l2 = iAVPublishService;
        this.l3 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS72S0400000_12(DialogC25756A8y dialogC25756A8y, ActivityC45651qj activityC45651qj, PrivacySettingDialogRouter privacySettingDialogRouter, Aweme aweme, int i) {
        super(0);
        this.$t = i;
        this.l0 = dialogC25756A8y;
        this.l1 = activityC45651qj;
        this.l2 = privacySettingDialogRouter;
        this.l3 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS72S0400000_12(AbstractC32579CqV abstractC32579CqV, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65350Pko interfaceC65350Pko, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC32579CqV;
        this.l1 = interfaceC65784Pro;
        this.l2 = interfaceC65350Pko;
        this.l3 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS72S0400000_12(TH1 th1, FragmentManager fragmentManager, TF5 tf5, TH7 th7, int i) {
        super(0);
        this.$t = i;
        this.l0 = th1;
        this.l1 = fragmentManager;
        this.l2 = tf5;
        this.l3 = th7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS72S0400000_12(TN1 tn1, C36978EfG c36978EfG, TN2 tn2, C36979EfH c36979EfH, int i) {
        super(0);
        this.$t = i;
        this.l0 = tn1;
        this.l1 = c36978EfG;
        this.l2 = tn2;
        this.l3 = c36979EfH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS72S0400000_12(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super C58045MqH, Boolean> interfaceC88472Yns2, C58045MqH c58045MqH, View view, InterfaceC88471Ynr<? super C58045MqH, ? super ButtonAction, Boolean> interfaceC88471Ynr) {
        super(0);
        this.$t = interfaceC88471Ynr;
        this.l0 = interfaceC88472Yns;
        this.l1 = interfaceC88472Yns2;
        this.l2 = c58045MqH;
        this.l3 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS72S0400000_12(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super RYJ, Boolean> interfaceC88472Yns2, RYJ ryj, View view, InterfaceC88471Ynr<? super RYJ, ? super ButtonAction, Boolean> interfaceC88471Ynr) {
        super(0);
        this.$t = interfaceC88471Ynr;
        this.l0 = interfaceC88472Yns;
        this.l1 = interfaceC88472Yns2;
        this.l2 = ryj;
        this.l3 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS72S0400000_12(InterfaceC88473Ynt interfaceC88473Ynt, InterfaceC88473Ynt<Object, Object, Object, Object> interfaceC88473Ynt2, C72977SkX<Object> c72977SkX, C72977SkX<Object> c72977SkX2, C72977SkX<Object> c72977SkX3) {
        super(0);
        this.$t = c72977SkX3;
        this.l0 = interfaceC88473Ynt;
        this.l1 = interfaceC88473Ynt2;
        this.l2 = c72977SkX;
        this.l3 = c72977SkX2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS72S0400000_12(Fragment fragment, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65350Pko interfaceC65350Pko, InterfaceC88471Ynr interfaceC88471Ynr, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = interfaceC65784Pro;
        this.l2 = interfaceC65350Pko;
        this.l3 = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS72S0400000_12(Widget widget, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65350Pko interfaceC65350Pko, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(0);
        this.$t = i;
        this.l0 = widget;
        this.l1 = interfaceC65784Pro;
        this.l2 = interfaceC65350Pko;
        this.l3 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS72S0400000_12(ReviewGalleryFragment reviewGalleryFragment, View view, C69698RXa c69698RXa, C69698RXa c69698RXa2, int i) {
        super(0);
        this.$t = i;
        this.l0 = reviewGalleryFragment;
        this.l1 = view;
        this.l2 = c69698RXa;
        this.l3 = c69698RXa2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS72S0400000_12(Object obj, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, int i) {
        super(0);
        this.$t = i;
        this.l0 = obj;
        this.l1 = interfaceC65784Pro;
        this.l2 = interfaceC88472Yns;
        this.l3 = interfaceC88472Yns2;
    }
}
