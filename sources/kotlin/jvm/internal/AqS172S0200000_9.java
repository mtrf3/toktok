package kotlin.jvm.internal;

import X.AbstractC51036K1g;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C116144h8;
import X.C1DH;
import X.C221018lt;
import X.C2U8;
import X.C43I;
import X.C45804HyK;
import X.C46420IJs;
import X.C53117Ksz;
import X.C53155Ktb;
import X.C54510LaM;
import X.C54535Lal;
import X.C54539Lap;
import X.C56424MCm;
import X.C56916MVk;
import X.C56975MXr;
import X.C56976MXs;
import X.C56977MXt;
import X.C56985MYb;
import X.C56990MYg;
import X.C57295MeB;
import X.C57308MeO;
import X.C57309MeP;
import X.C61996OUu;
import X.C72808Sho;
import X.C76732zl;
import X.C76800UCe;
import X.C7MY;
import X.C8RO;
import X.EXV;
import X.EnumC226878vL;
import X.EnumC226888vM;
import X.EnumC226898vN;
import X.EnumC57435MgR;
import X.EnumC57597Mj3;
import X.InterfaceC54536Lam;
import X.InterfaceC55062LjG;
import X.InterfaceC57784Mm4;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC92513k7;
import X.M78;
import X.MB3;
import X.MBA;
import X.MYP;
import X.SY4;
import X.TBT;
import X.TBW;
import X.X1D;
import X.XKQ;
import X.XKX;
import Y.ARunnableS23S0200000_4;
import Y.ARunnableS28S0200000_9;
import Y.ARunnableS45S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.XTabAbility;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.xtab.XTabPanelController;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightMediaListViewModel;
import com.ss.android.ugc.aweme.inbox.skylight.template.SkylightFriendPostNormalCell;
import com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.utils.FollowSortDataCache;
import com.ss.android.ugc.aweme.profile.popup.AvatarAndNicknamePopupController;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeButtonsAssem;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.LargeRectRecUserCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRecUserCell;
import com.ss.android.ugc.aweme.roaming.NearbyRegionListV1Response;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.ss.android.ugc.aweme.story.model.UserStoriesResponse;
import com.ss.android.ugc.aweme.trending.ui.detailpage.BottomBarAssem;
import com.ss.android.ugc.aweme.ui.NearbyFeedContentAssem;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class AqS172S0200000_9 extends AbstractC65781Prl implements InterfaceC88471Ynr {
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
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case 9:
                return invoke$9(this, obj, obj2);
            case 10:
                return invoke$10(this, obj, obj2);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2);
            case 12:
                return invoke$12(this, obj, obj2);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj, obj2);
            case 17:
                return invoke$17(this, obj, obj2);
            case 18:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case 20:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS172S0200000_9(AbstractC51036K1g abstractC51036K1g, DetailPageComponent detailPageComponent, int i) {
        super(2);
        this.$t = i;
        this.l0 = abstractC51036K1g;
        this.l1 = detailPageComponent;
    }

    public static final Object invoke$0(AqS172S0200000_9 aqS172S0200000_9, Object aweme, Object obj) {
        InterfaceC55062LjG adapter;
        int intValue = ((Number) obj).intValue();
        o.LJIIIZ(aweme, "aweme");
        ((AbstractC51036K1g) aqS172S0200000_9.l0).insertItem(aweme, intValue);
        DetailFragmentPanel detailFragmentPanel = ((DetailPageComponent) aqS172S0200000_9.l1).LJZL;
        if (detailFragmentPanel != null && (adapter = detailFragmentPanel.getAdapter()) != null) {
            List<? extends Aweme> items = ((AbstractC51036K1g) aqS172S0200000_9.l0).getItems();
            if (!(items instanceof List)) {
                items = null;
            }
            adapter.setData(items);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.3qT] */
    public static final Object invoke$1(AqS172S0200000_9 aqS172S0200000_9, Object obj, Object obj2) {
        FragmentManager supportFragmentManager;
        EnumC226888vM enumC226888vM;
        EnumC57435MgR status = (EnumC57435MgR) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        o.LJIIIZ(status, "status");
        C56916MVk c56916MVk = (C56916MVk) aqS172S0200000_9.l0;
        c56916MVk.LJLIL = false;
        if (booleanValue) {
            Context context = c56916MVk.LJLJJLL.getContext();
            o.LJIIIIZZ(context, "relationBtn.context");
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (LJIJJ != null) {
                if (status == EnumC57435MgR.FOLLOW_MUTUAL) {
                    enumC226888vM = EnumC226888vM.FOLLOW_BACK;
                } else {
                    enumC226888vM = EnumC226888vM.FOLLOW;
                }
                AvatarAndNicknamePopupController.LIZJ().LIZ(LJIJJ, EnumC226898vN.NOTIFICATION_PAGE, EnumC226878vL.NEW_FOLLOWERS, enumC226888vM);
            }
            if (((C56916MVk) aqS172S0200000_9.l0).LJLIL && status.ordinal() == 2) {
                Context context2 = ((C56916MVk) aqS172S0200000_9.l0).mContext;
                o.LJIIIIZZ(context2, "context");
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context2);
                if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
                    final C56916MVk c56916MVk2 = (C56916MVk) aqS172S0200000_9.l0;
                    final IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                    o.LJIIIIZZ(createIIMServicebyMonsterPlugin, "get()");
                    createIIMServicebyMonsterPlugin.getImChatSettingsService().LJII("notification_page", supportFragmentManager, new InterfaceC92513k7() { // from class: X.3qT
                        @Override // X.InterfaceC92513k7
                        public final void onCancel() {
                        }

                        @Override // X.InterfaceC92513k7
                        public final void LIZ(int i) {
                            if (i != 3) {
                                InterfaceC98813uH imChatService = IIMService.this.getImChatService();
                                Context context3 = c56916MVk2.mContext;
                                o.LJIIIIZZ(context3, "context");
                                C98823uI.LIZ(imChatService, context3, null, false, null, 12);
                            }
                        }
                    });
                }
                if (((C56916MVk) aqS172S0200000_9.l0).Q()) {
                    String str = ((BaseNotice) aqS172S0200000_9.l1).nid;
                    o.LJIIIIZZ(str, "notice.nid");
                    FollowSortDataCache.LIZIZ();
                    FollowSortDataCache.LIZ.remove(str);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$10(AqS172S0200000_9 aqS172S0200000_9, Object obj, Object element) {
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(element, "element");
        MBA[] mbaArr = (MBA[]) aqS172S0200000_9.l0;
        C76732zl c76732zl = (C76732zl) aqS172S0200000_9.l1;
        int i = c76732zl.element;
        c76732zl.element = i + 1;
        mbaArr[i] = element;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$11(AqS172S0200000_9 aqS172S0200000_9, Object selectSubscribe, Object obj) {
        C43I postEvent = (C43I) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(postEvent, "postEvent");
        if (((SkylightListViewModel) aqS172S0200000_9.l0).hv0(selectSubscribe.hashCode())) {
            ((C56977MXt) aqS172S0200000_9.l1).LJLJJL(((Boolean) postEvent.LIZ).booleanValue());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS172S0200000_9 aqS172S0200000_9, Object selectSubscribe, Object obj) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (((InboxTopHorizontalListVM) aqS172S0200000_9.l0).hv0(selectSubscribe.hashCode())) {
            Long LIZ = MYP.LIZ();
            if (LIZ != null) {
                ((C56976MXs) aqS172S0200000_9.l1).i0(LIZ.longValue());
            }
            C56976MXs c56976MXs = (C56976MXs) aqS172S0200000_9.l1;
            c56976MXs.itemView.post(new ARunnableS45S0100000_9(c56976MXs, 172));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$13(AqS172S0200000_9 aqS172S0200000_9, Object selectSubscribe, Object obj) {
        C43I postEvent = (C43I) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(postEvent, "postEvent");
        if (((SkylightMediaListViewModel) aqS172S0200000_9.l0).hv0(selectSubscribe.hashCode())) {
            ((C56975MXr) aqS172S0200000_9.l1).LJLJJL(((Boolean) postEvent.LIZ).booleanValue());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS172S0200000_9 aqS172S0200000_9, Object selectSubscribe, Object obj) {
        C43I posEvent = (C43I) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(posEvent, "posEvent");
        if (((SkylightListViewModel) aqS172S0200000_9.l0).hv0(selectSubscribe.hashCode())) {
            C56977MXt c56977MXt = (C56977MXt) aqS172S0200000_9.l1;
            c56977MXt.LJLLL.post(new ARunnableS23S0200000_4(c56977MXt, posEvent, 32));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$15(AqS172S0200000_9 aqS172S0200000_9, Object selectSubscribe, Object obj) {
        C43I posEvent = (C43I) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(posEvent, "posEvent");
        if (((SkylightMediaListViewModel) aqS172S0200000_9.l0).hv0(selectSubscribe.hashCode())) {
            RecyclerView.ViewHolder LJJIZ = ((C56975MXr) aqS172S0200000_9.l1).LJLLL.LJJIZ(((Number) posEvent.LIZ).intValue());
            if (LJJIZ instanceof SkylightFriendPostNormalCell) {
                ((SkylightFriendPostNormalCell) LJJIZ).L();
            } else if (LJJIZ instanceof SkylightBaseMediaCard) {
                ((SkylightBaseMediaCard) LJJIZ).Q();
            }
            C56975MXr c56975MXr = (C56975MXr) aqS172S0200000_9.l1;
            c56975MXr.LJLLL.post(new ARunnableS23S0200000_4(c56975MXr, posEvent, 33));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS172S0200000_9 aqS172S0200000_9, Object selectSubscribe, Object it) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (((InboxTopHorizontalListVM) aqS172S0200000_9.l0).hv0(selectSubscribe.hashCode())) {
            InboxTopHorizontalListVM inboxTopHorizontalListVM = (InboxTopHorizontalListVM) aqS172S0200000_9.l0;
            C72808Sho<InterfaceC57784Mm4> state = ((C56976MXs) aqS172S0200000_9.l1).LJLLL.getState();
            o.LJIIIIZZ(state, "list.state");
            inboxTopHorizontalListVM.getClass();
            if (inboxTopHorizontalListVM.LJZI) {
                if (C53117Ksz.LJ) {
                    XKX.LIZLLL(inboxTopHorizontalListVM.getAssemVMScope(), EXV.LIZ, null, new C56990MYg(inboxTopHorizontalListVM, null), 2);
                }
                if (!C53117Ksz.LIZIZ) {
                    List<InterfaceC57784Mm4> LJII = state.LJII();
                    C76732zl c76732zl = new C76732zl();
                    if (!C53155Ktb.LIZ()) {
                        Iterator it2 = ((ArrayList) LJII).iterator();
                        int i = 0;
                        while (true) {
                            if (it2.hasNext()) {
                                if (it2.next() instanceof C116144h8) {
                                    break;
                                }
                                i++;
                            } else {
                                i = -1;
                                break;
                            }
                        }
                        c76732zl.element = i;
                    }
                    if (c76732zl.element >= 0) {
                        XKQ xkq = inboxTopHorizontalListVM.LLF;
                        if (xkq != null) {
                            xkq.LIZIZ(null);
                        }
                        inboxTopHorizontalListVM.LLF = XKX.LIZLLL(inboxTopHorizontalListVM.getAssemVMScope(), EXV.LIZ, null, new C56985MYb(inboxTopHorizontalListVM, state, LJII, c76732zl, null), 2);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$17(AqS172S0200000_9 aqS172S0200000_9, Object selectSubscribe, Object obj) {
        C43I postEvent = (C43I) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(postEvent, "postEvent");
        if (((InboxTopHorizontalListVM) aqS172S0200000_9.l0).hv0(selectSubscribe.hashCode())) {
            ((C56976MXs) aqS172S0200000_9.l1).LJLJJL(((Boolean) postEvent.LIZ).booleanValue());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS172S0200000_9 aqS172S0200000_9, Object selectSubscribe, Object obj) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (((SkylightListViewModel) aqS172S0200000_9.l0).hv0(selectSubscribe.hashCode())) {
            Long LIZ = MYP.LIZ();
            if (LIZ != null) {
                ((C56977MXt) aqS172S0200000_9.l1).i0(LIZ.longValue());
            }
            C56977MXt c56977MXt = (C56977MXt) aqS172S0200000_9.l1;
            c56977MXt.itemView.post(new ARunnableS45S0100000_9(c56977MXt, 176));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS172S0200000_9 aqS172S0200000_9, Object selectSubscribe, Object obj) {
        C43I posEvent = (C43I) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(posEvent, "posEvent");
        if (((InboxTopHorizontalListVM) aqS172S0200000_9.l0).hv0(selectSubscribe.hashCode())) {
            C56976MXs c56976MXs = (C56976MXs) aqS172S0200000_9.l1;
            c56976MXs.LJLLL.post(new ARunnableS23S0200000_4(c56976MXs, posEvent, 34));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS172S0200000_9 aqS172S0200000_9, Object relationStatusType, Object obj) {
        IUserCardListAbility iUserCardListAbility;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(relationStatusType, "relationStatusType");
        if (booleanValue && relationStatusType == EnumC57435MgR.FOLLOWED && (iUserCardListAbility = (IUserCardListAbility) aqS172S0200000_9.l0) != null) {
            iUserCardListAbility.mz((RecUser) aqS172S0200000_9.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS172S0200000_9 aqS172S0200000_9, Object selectSubscribe, Object obj) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (((SkylightMediaListViewModel) aqS172S0200000_9.l0).hv0(selectSubscribe.hashCode())) {
            Long LIZ = MYP.LIZ();
            if (LIZ != null) {
                ((C56975MXr) aqS172S0200000_9.l1).i0(LIZ.longValue());
            }
            C56975MXr c56975MXr = (C56975MXr) aqS172S0200000_9.l1;
            c56975MXr.itemView.post(new ARunnableS28S0200000_9((SkylightMediaListViewModel) aqS172S0200000_9.l0, c56975MXr, 60));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS172S0200000_9 aqS172S0200000_9, Object obj, Object obj2) {
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        List<Aweme> LIZIZ = ((C57308MeO) aqS172S0200000_9.l0).LJLJI.LIZIZ((List) ((C57309MeP) aqS172S0200000_9.l1).LJLILLLLZI);
        if (LIZIZ == null || !(!LIZIZ.isEmpty())) {
            return null;
        }
        return new C57295MeB(new UserStoriesResponse(LIZIZ));
    }

    public static final Object invoke$22(AqS172S0200000_9 aqS172S0200000_9, Object obj, Object relationStatusType2) {
        EnumC57435MgR relationStatusType = (EnumC57435MgR) obj;
        o.LJIIIZ(relationStatusType, "relationStatusType");
        o.LJIIIZ(relationStatusType2, "relationStatusType2");
        Context context = ((RecSwipeButtonsAssem) aqS172S0200000_9.l0).getContext();
        if (context != null) {
            new C61996OUu(context).LIZ(0);
        }
        ((RecSwipeButtonsAssem) aqS172S0200000_9.l0).Z3().gv0(EnumC57597Mj3.CLICK_UNFOLLOW);
        ((RecSwipeButtonsAssem) aqS172S0200000_9.l0).Z3().getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[UnfollowRelationButton]  setFollowClickListener relationStatusType = ");
        LIZ.append(relationStatusType.name());
        LIZ.append(" and relationStatusType2 = ");
        LIZ.append(relationStatusType2);
        C221018lt.LIZ("RecSwipeButtonsAssem", X1D.LIZIZ(LIZ));
        ((RelationButton) aqS172S0200000_9.l1).setVisibility(4);
        SY4 sy4 = ((RecSwipeButtonsAssem) aqS172S0200000_9.l0).LLD;
        if (sy4 != null) {
            sy4.setVisibility(0);
            RelationButton relationButton = ((RecSwipeButtonsAssem) aqS172S0200000_9.l0).LLF;
            if (relationButton != null) {
                relationButton.setVisibility(0);
                return C76800UCe.LIZ;
            }
            o.LJIJI("followButton");
            throw null;
        }
        o.LJIJI("notInterestedButton");
        throw null;
    }

    public static final Object invoke$23(AqS172S0200000_9 aqS172S0200000_9, Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        View view = (View) obj2;
        o.LJIIIZ(view, "view");
        XTabPanelController xTabPanelController = (XTabPanelController) aqS172S0200000_9.l0;
        if (xTabPanelController.LJLJLJ == intValue) {
            XTabAbility xTabAbility = xTabPanelController.LJLJJL;
            if (xTabAbility != null) {
                xTabAbility.b60((C46420IJs) ListProtector.get((List) aqS172S0200000_9.l1, intValue), view);
            }
        } else {
            XTabAbility xTabAbility2 = xTabPanelController.LJLJJL;
            if (xTabAbility2 != null) {
                xTabAbility2.Yo((C46420IJs) ListProtector.get((List) aqS172S0200000_9.l1, intValue), view);
            }
        }
        ((XTabPanelController) aqS172S0200000_9.l0).LJLJLJ = intValue;
        C8RO c8ro = MainTabStrip.LLD;
        StringBuilder LJ = C7MY.LJ("createXTabPanel: subTabClickListener ", intValue, " , ");
        LJ.append(((XTabPanelController) aqS172S0200000_9.l0).LJLJLJ);
        c8ro.LIZLLL(X1D.LIZIZ(LJ));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:3|4|5|(1:7)(2:79|(2:87|(2:92|(1:94)(8:95|(1:97)(1:101)|98|(1:100)|9|(1:78)(1:15)|16|(16:20|(1:22)(1:77)|23|24|25|(1:27)(2:49|(2:57|(2:62|(1:64)(12:65|(1:67)(1:71)|68|(1:70)|29|(1:48)(1:35)|36|(1:38)|39|(1:41)(1:47)|42|(1:46))))(1:72))|28|29|(1:31)|48|36|(0)|39|(0)(0)|42|(2:44|46)))))(1:102))|8|9|(1:11)|78|16|(1:18)|20|(0)(0)|23|24|25|(0)(0)|28|29|(0)|48|36|(0)|39|(0)(0)|42|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ab, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ac, code lost:
    
        X.AYY.LIZ.getClass();
        X.AYY.LIZ("Ability", "get ability error!", r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117 A[Catch: all -> 0x01ab, TryCatch #1 {all -> 0x01ab, blocks: (B:25:0x0107, B:49:0x0117, B:51:0x011f, B:53:0x012b, B:55:0x0131, B:57:0x0140, B:59:0x0146, B:62:0x014d, B:64:0x0155, B:65:0x015e, B:67:0x0164, B:68:0x0168, B:70:0x0179, B:72:0x0137, B:73:0x0123), top: B:24:0x0107 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AqS172S0200000_9 r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS172S0200000_9.invoke$3(kotlin.jvm.internal.AqS172S0200000_9, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:3|4|5|(1:7)(2:79|(2:87|(2:92|(1:94)(8:95|(1:97)(1:101)|98|(1:100)|9|(1:78)(1:15)|16|(16:20|(1:22)(1:77)|23|24|25|(1:27)(2:49|(2:57|(2:62|(1:64)(12:65|(1:67)(1:71)|68|(1:70)|29|(1:48)(1:35)|36|(1:38)|39|(1:41)(1:47)|42|(1:46))))(1:72))|28|29|(1:31)|48|36|(0)|39|(0)(0)|42|(2:44|46)))))(1:102))|8|9|(1:11)|78|16|(1:18)|20|(0)(0)|23|24|25|(0)(0)|28|29|(0)|48|36|(0)|39|(0)(0)|42|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ab, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ac, code lost:
    
        X.AYY.LIZ.getClass();
        X.AYY.LIZ("Ability", "get ability error!", r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117 A[Catch: all -> 0x01ab, TryCatch #1 {all -> 0x01ab, blocks: (B:25:0x0107, B:49:0x0117, B:51:0x011f, B:53:0x012b, B:55:0x0131, B:57:0x0140, B:59:0x0146, B:62:0x014d, B:64:0x0155, B:65:0x015e, B:67:0x0164, B:68:0x0168, B:70:0x0179, B:72:0x0137, B:73:0x0123), top: B:24:0x0107 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AqS172S0200000_9 r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS172S0200000_9.invoke$4(kotlin.jvm.internal.AqS172S0200000_9, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AqS172S0200000_9 aqS172S0200000_9, Object selectSubscribe, Object obj) {
        C43I showBillboard = (C43I) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(showBillboard, "showBillboard");
        if (!C56424MCm.LIZ() && o.LJ(showBillboard.LIZ(), Boolean.TRUE)) {
            C1DH.LJJIJIIJIL(TimeUnit.SECONDS.toMillis(1L), new ARunnableS28S0200000_9((View) aqS172S0200000_9.l1, (BottomBarAssem) aqS172S0200000_9.l0, 30));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS172S0200000_9 aqS172S0200000_9, Object obj, Object obj2) {
        String title = (String) obj;
        int intValue = ((Number) obj2).intValue();
        o.LJIIIZ(title, "title");
        MB3.LIZJ(((BottomBarAssem) aqS172S0200000_9.l0).v3().LJLJI.getEnterFromRequestId(), title, intValue, ((BottomBarAssem) aqS172S0200000_9.l0).v3().LJLJI);
        if (intValue < ((List) aqS172S0200000_9.l1).size() && intValue > -1) {
            MB3.LIZIZ(((BottomBarAssem) aqS172S0200000_9.l0).v3().LJLILLLLZI, (TrendingEventModel) ListProtector.get((List) aqS172S0200000_9.l1, intValue));
            ((BottomBarAssem) aqS172S0200000_9.l0).LJLJJLL = (TrendingEventModel) ListProtector.get((List) aqS172S0200000_9.l1, intValue);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS172S0200000_9 aqS172S0200000_9, Object obj, Object obj2) {
        String title = (String) obj;
        int intValue = ((Number) obj2).intValue();
        o.LJIIIZ(title, "title");
        MB3.LIZJ(((BottomBarAssem) aqS172S0200000_9.l0).v3().LJLJI.getEnterFromRequestId(), title, intValue, ((BottomBarAssem) aqS172S0200000_9.l0).v3().LJLJI);
        if (intValue < ((List) aqS172S0200000_9.l1).size() && intValue > -1) {
            MB3.LIZIZ(((BottomBarAssem) aqS172S0200000_9.l0).v3().LJLILLLLZI, (TrendingEventModel) ListProtector.get((List) aqS172S0200000_9.l1, intValue));
            ((BottomBarAssem) aqS172S0200000_9.l0).LJLJJLL = (TrendingEventModel) ListProtector.get((List) aqS172S0200000_9.l1, intValue);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS172S0200000_9 aqS172S0200000_9, Object selectSubscribe, Object obj) {
        M78 stateWrapper;
        InterfaceC54536Lam interfaceC54536Lam = (InterfaceC54536Lam) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (interfaceC54536Lam != null) {
            NearbyFeedContentAssem nearbyFeedContentAssem = (NearbyFeedContentAssem) aqS172S0200000_9.l0;
            if (!nearbyFeedContentAssem.LJLJJL) {
                nearbyFeedContentAssem.LJLJJL = true;
                if (interfaceC54536Lam instanceof C54539Lap) {
                    ((InterfaceC65784Pro) aqS172S0200000_9.l1).invoke();
                } else {
                    NearbyRegionListV1Response nearbyRegionListV1Response = ((C54535Lal) interfaceC54536Lam).LIZ;
                    LocationRegion locationRegion = nearbyRegionListV1Response.currentRegion;
                    if (locationRegion == null) {
                        ((InterfaceC65784Pro) aqS172S0200000_9.l1).invoke();
                    } else {
                        C2U8.LIZ(new RoamingLocationInfo(locationRegion.getRegionCode(), nearbyRegionListV1Response.currentRegion.getName(), false, 3));
                        C54510LaM c54510LaM = ((NearbyFeedContentAssem) aqS172S0200000_9.l0).LJLJL;
                        if (c54510LaM != null && (stateWrapper = c54510LaM.getStateWrapper()) != null) {
                            stateWrapper.LIZ();
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS172S0200000_9 aqS172S0200000_9, Object old, Object obj) {
        o.LJIIIZ(old, "old");
        o.LJIIIZ(obj, "new");
        if (!o.LJ(((TBW) aqS172S0200000_9.l0).get(old), ((TBW) aqS172S0200000_9.l0).get(obj))) {
            ((InterfaceC88472Yns) aqS172S0200000_9.l1).invoke(((TBW) aqS172S0200000_9.l0).get(obj));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS172S0200000_9(C56916MVk c56916MVk, BaseNotice baseNotice, int i) {
        super(2);
        this.$t = i;
        this.l0 = c56916MVk;
        this.l1 = baseNotice;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS172S0200000_9(C56976MXs c56976MXs, InboxTopHorizontalListVM inboxTopHorizontalListVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = inboxTopHorizontalListVM;
        this.l1 = c56976MXs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS172S0200000_9(C57308MeO c57308MeO, C57309MeP c57309MeP, int i) {
        super(2);
        this.$t = i;
        this.l0 = c57308MeO;
        this.l1 = c57309MeP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS172S0200000_9(TBT tbt, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(2);
        this.$t = i;
        this.l0 = tbt;
        this.l1 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS172S0200000_9(XTabPanelController xTabPanelController, XTabPanelController xTabPanelController2, List<C46420IJs> list) {
        super(2);
        this.$t = list;
        this.l0 = xTabPanelController;
        this.l1 = xTabPanelController2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS172S0200000_9(SkylightListViewModel skylightListViewModel, C56977MXt c56977MXt, int i) {
        super(2);
        this.$t = i;
        this.l0 = skylightListViewModel;
        this.l1 = c56977MXt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS172S0200000_9(SkylightMediaListViewModel skylightMediaListViewModel, C56975MXr c56975MXr, int i) {
        super(2);
        this.$t = i;
        this.l0 = skylightMediaListViewModel;
        this.l1 = c56975MXr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS172S0200000_9(RecSwipeButtonsAssem recSwipeButtonsAssem, RelationButton relationButton, int i) {
        super(2);
        this.$t = i;
        this.l0 = recSwipeButtonsAssem;
        this.l1 = relationButton;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS172S0200000_9(IUserCardListAbility iUserCardListAbility, RecUser recUser, int i) {
        super(2);
        this.$t = i;
        this.l0 = iUserCardListAbility;
        this.l1 = recUser;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS172S0200000_9(LargeRectRecUserCell largeRectRecUserCell, LargeRectRecUserCell<ITEM> largeRectRecUserCell2, Fragment fragment) {
        super(2);
        this.$t = fragment;
        this.l0 = largeRectRecUserCell;
        this.l1 = largeRectRecUserCell2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS172S0200000_9(RectRecUserCell rectRecUserCell, RectRecUserCell<ITEM> rectRecUserCell2, Fragment fragment) {
        super(2);
        this.$t = fragment;
        this.l0 = rectRecUserCell;
        this.l1 = rectRecUserCell2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS172S0200000_9(BottomBarAssem bottomBarAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = bottomBarAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS172S0200000_9(BottomBarAssem bottomBarAssem, BottomBarAssem bottomBarAssem2, List<TrendingEventModel> list) {
        super(2);
        this.$t = list;
        this.l0 = bottomBarAssem;
        this.l1 = bottomBarAssem2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS172S0200000_9(NearbyFeedContentAssem nearbyFeedContentAssem, AqS98S0300000_9 aqS98S0300000_9, int i) {
        super(2);
        this.$t = i;
        this.l0 = nearbyFeedContentAssem;
        this.l1 = aqS98S0300000_9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS172S0200000_9(MBA[] mbaArr, C76732zl c76732zl, int i) {
        super(2);
        this.$t = i;
        this.l0 = mbaArr;
        this.l1 = c76732zl;
    }
}
