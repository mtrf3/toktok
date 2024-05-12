package kotlin.jvm.internal;

import X.A2F;
import X.A2G;
import X.AYY;
import X.AbstractC65781Prl;
import X.AbstractC72932td;
import X.C221018lt;
import X.C223208pQ;
import X.C2321199b;
import X.C33X;
import X.C34K;
import X.C3C1;
import X.C50389Jq5;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55988LyC;
import X.C56849MSv;
import X.C57819Mmd;
import X.C57823Mmh;
import X.C57826Mmk;
import X.C61878OQg;
import X.C65352Pkq;
import X.C68322mC;
import X.C72912tb;
import X.C76800UCe;
import X.C79234V7u;
import X.C8HZ;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.EnumC57435MgR;
import X.InterfaceC57910Mo6;
import X.InterfaceC57932MoS;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.MST;
import X.MT0;
import X.MT2;
import X.MT7;
import X.MTK;
import X.MTT;
import X.MUA;
import X.SZP;
import X.X1D;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.creator.model.response.CreatorNoticeResponse;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.usercard.ability.RecUserCellTrackAbility;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRecUserVideoCell;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.ss.android.ugc.aweme.search.TrendingItems;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailSharedVM;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public class AqS55S0400000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS55S0400000_9 aqS55S0400000_9, Object obj) {
        MT0 it = (MT0) obj;
        o.LJIIIZ(it, "it");
        CreatorNoticeResultVM creatorNoticeResultVM = (CreatorNoticeResultVM) aqS55S0400000_9.l0;
        List list = (List) aqS55S0400000_9.l1;
        boolean z = ((C34K) aqS55S0400000_9.l2).element;
        boolean z2 = ((C34K) aqS55S0400000_9.l3).element;
        C56849MSv c56849MSv = it.LJLLI;
        if (c56849MSv == null) {
            c56849MSv = new C56849MSv(0);
        }
        creatorNoticeResultVM.getClass();
        if (z && z2) {
            o.LJIIIZ(list, "<this>");
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (!((MusNotice) next).isMock()) {
                    if (next != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(creatorNoticeResultVM.nv0());
                        LIZ.append(": notify Notice load More Error");
                        C221018lt.LJFF("Creators_Inbox", X1D.LIZIZ(LIZ));
                        creatorNoticeResultVM.setState(new AqS21S0310000_9((AbstractC72932td) new C72912tb(creatorNoticeResultVM.rv0()), (AbstractC72932td<? extends List<? extends MusNotice>>) MTT.SUCCESS, (MTT) c56849MSv, (C56849MSv) creatorNoticeResultVM.LJLLJ, true));
                    }
                }
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(creatorNoticeResultVM.nv0());
            LIZ2.append(": notify Notice Error");
            C221018lt.LJFF("Creators_Inbox", X1D.LIZIZ(LIZ2));
            creatorNoticeResultVM.setState(new AqS21S0310000_9((AbstractC72932td) new C3C1(new MST()), (AbstractC72932td<? extends List<? extends MusNotice>>) MTT.ERROR_STATUS, (MTT) c56849MSv, (C56849MSv) true, true));
        } else if (list.isEmpty()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(creatorNoticeResultVM.nv0());
            LIZ3.append(": notify Notice Empty");
            C221018lt.LJFF("Creators_Inbox", X1D.LIZIZ(LIZ3));
            creatorNoticeResultVM.setState(new AqS21S0310000_9((AbstractC72932td) new C3C1(new MUA()), (AbstractC72932td<? extends List<? extends MusNotice>>) MTT.SUCCESS, (MTT) c56849MSv, (C56849MSv) true, true));
        } else {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(creatorNoticeResultVM.nv0());
            LIZ4.append(": notify Notice Success");
            C221018lt.LJFF("Creators_Inbox", X1D.LIZIZ(LIZ4));
            creatorNoticeResultVM.setState(new AqS21S0310000_9((AbstractC72932td) new C72912tb(creatorNoticeResultVM.rv0()), (AbstractC72932td<? extends List<? extends MusNotice>>) MTT.SUCCESS, (MTT) c56849MSv, (C56849MSv) creatorNoticeResultVM.LJLLJ, true));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS55S0400000_9 aqS55S0400000_9, Object obj) {
        InterfaceC57910Mo6 it = (InterfaceC57910Mo6) obj;
        o.LJIIIZ(it, "it");
        it.kR(new C57823Mmh((EnumC57435MgR) aqS55S0400000_9.l0, (EnumC57435MgR) aqS55S0400000_9.l1, (RecUser) aqS55S0400000_9.l2, ((AbsRecUserCell) aqS55S0400000_9.l3).M()));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS55S0400000_9 aqS55S0400000_9, Object obj) {
        boolean z;
        C55988LyC it = (C55988LyC) obj;
        o.LJIIIZ(it, "it");
        C8HZ<C50389Jq5> c8hz = it.LJLIL;
        SearchSeparateTabHorizontalVM searchSeparateTabHorizontalVM = (SearchSeparateTabHorizontalVM) aqS55S0400000_9.l0;
        boolean z2 = false;
        if (((Integer) aqS55S0400000_9.l1) != null) {
            z = true;
        } else {
            z = false;
        }
        if (((Integer) aqS55S0400000_9.l2) != null) {
            z2 = true;
        }
        C72912tb c72912tb = new C72912tb(new C223208pQ(z, z2));
        C33X c33x = C33X.LIZ;
        List list = (List) aqS55S0400000_9.l3;
        c8hz.getClass();
        searchSeparateTabHorizontalVM.newState(C8HZ.LIZ(c72912tb, c33x, c33x, list));
        if (((Integer) aqS55S0400000_9.l2) == null && ((Integer) aqS55S0400000_9.l1) == null) {
            ((SearchSeparateTabHorizontalVM) aqS55S0400000_9.l0).getConfig().getOperator().LIZLLL(SZP.Refresh, A2F.LIZIZ(A2G.LIZ), true);
        } else {
            ((SearchSeparateTabHorizontalVM) aqS55S0400000_9.l0).getConfig().getOperator().LIZLLL(SZP.Refresh, A2F.LJ(A2G.LIZ, (Integer) aqS55S0400000_9.l1, (Integer) aqS55S0400000_9.l2, null, 4), true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS55S0400000_9 aqS55S0400000_9, Object obj) {
        boolean z;
        C55988LyC it = (C55988LyC) obj;
        o.LJIIIZ(it, "it");
        C8HZ<C50389Jq5> c8hz = it.LJLIL;
        SearchTabHorizontalVM searchTabHorizontalVM = (SearchTabHorizontalVM) aqS55S0400000_9.l0;
        boolean z2 = false;
        if (((Integer) aqS55S0400000_9.l1) != null) {
            z = true;
        } else {
            z = false;
        }
        if (((Integer) aqS55S0400000_9.l2) != null) {
            z2 = true;
        }
        C72912tb c72912tb = new C72912tb(new C223208pQ(z, z2));
        C33X c33x = C33X.LIZ;
        List list = (List) aqS55S0400000_9.l3;
        c8hz.getClass();
        searchTabHorizontalVM.newState(C8HZ.LIZ(c72912tb, c33x, c33x, list));
        if (((Integer) aqS55S0400000_9.l2) == null && ((Integer) aqS55S0400000_9.l1) == null) {
            ((SearchTabHorizontalVM) aqS55S0400000_9.l0).getConfig().getOperator().LIZLLL(SZP.Refresh, A2F.LIZIZ(A2G.LIZ), true);
        } else {
            ((SearchTabHorizontalVM) aqS55S0400000_9.l0).getConfig().getOperator().LIZLLL(SZP.Refresh, A2F.LJ(A2G.LIZ, (Integer) aqS55S0400000_9.l1, (Integer) aqS55S0400000_9.l2, null, 4), true);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AqS55S0400000_9 r15, java.lang.Object r16) {
        /*
            r5 = r16
            X.MBa r5 = (X.C56386MBa) r5
            java.lang.String r0 = "$this$setState"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.Object r0 = r15.l0
            com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailSharedVM r0 = (com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailSharedVM) r0
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r0.LJLJJL
            r4 = 0
            if (r1 == 0) goto L7a
            java.lang.Object r0 = r15.l1
            X.2mC r0 = (X.C68322mC) r0
            T r0 = r0.element
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L7a
            int r13 = r0.size()
        L26:
            java.lang.Object r0 = r15.l0
            com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailSharedVM r0 = (com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailSharedVM) r0
            java.lang.String r1 = r0.gv0()
            java.lang.String r0 = "general_search"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L48
            r14 = 1
        L37:
            r6 = 0
            java.lang.Object r7 = r15.l3
            com.ss.android.ugc.aweme.search.TrendingEventModel r7 = (com.ss.android.ugc.aweme.search.TrendingEventModel) r7
            r12 = 0
            r15 = 125(0x7d, float:1.75E-43)
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            X.MBa r0 = X.C56386MBa.LIZ(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        L48:
            java.lang.Object r0 = r15.l2
            com.ss.android.ugc.aweme.search.TrendingItems r0 = (com.ss.android.ugc.aweme.search.TrendingItems) r0
            java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r0.awemeList
            if (r0 == 0) goto L72
            java.lang.Object r3 = r15.l0
            com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailSharedVM r3 = (com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailSharedVM) r3
            java.util.Iterator r2 = r0.iterator()
        L58:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r1 = r0.getAid()
            java.lang.String r0 = r3.LJLLI
            if (r0 == 0) goto L7c
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L75
        L72:
            int r14 = r4 + 1
            goto L37
        L75:
            int r4 = r4 + 1
            goto L58
        L78:
            r4 = -1
            goto L72
        L7a:
            r13 = 0
            goto L26
        L7c:
            java.lang.String r0 = "awemeId"
            kotlin.jvm.internal.o.LJIJI(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS55S0400000_9.invoke$4(kotlin.jvm.internal.AqS55S0400000_9, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AqS55S0400000_9 aqS55S0400000_9, Object obj) {
        C57819Mmd configTracker = (C57819Mmd) obj;
        o.LJIIIZ(configTracker, "$this$configTracker");
        String str = (String) ((C68322mC) aqS55S0400000_9.l0).element;
        o.LJIIIZ(str, "<set-?>");
        configTracker.LIZ = str;
        String str2 = (String) ((C68322mC) aqS55S0400000_9.l1).element;
        o.LJIIIZ(str2, "<set-?>");
        configTracker.LJFF = str2;
        String str3 = (String) ((C68322mC) aqS55S0400000_9.l2).element;
        o.LJIIIZ(str3, "<set-?>");
        configTracker.LIZIZ = str3;
        configTracker.LIZJ((String) ((C68322mC) aqS55S0400000_9.l3).element);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$6(AqS55S0400000_9 aqS55S0400000_9, Object obj) {
        AbstractC72932td c3c1;
        List<NoticeTabModel> list;
        MT0 setState = (MT0) obj;
        o.LJIIIZ(setState, "$this$setState");
        CreatorNoticeResultVM creatorNoticeResultVM = (CreatorNoticeResultVM) aqS55S0400000_9.l0;
        MT7 mt7 = (MT7) aqS55S0400000_9.l1;
        CreatorNoticeResponse creatorNoticeResponse = (CreatorNoticeResponse) ((C72912tb) ((AbstractC72932td) aqS55S0400000_9.l2)).LIZ;
        int i = ((NoticeTabModel) aqS55S0400000_9.l3).tabId;
        creatorNoticeResultVM.getClass();
        if (creatorNoticeResponse != null && (list = creatorNoticeResponse.tabDataModel) != null) {
            c3c1 = new C72912tb(new MTK(i, mt7, list));
        } else {
            c3c1 = new C3C1(new Throwable());
        }
        CreatorNoticeResponse creatorNoticeResponse2 = (CreatorNoticeResponse) ((C72912tb) ((AbstractC72932td) aqS55S0400000_9.l2)).LIZ;
        String str = creatorNoticeResponse2.cursor;
        if (str == null) {
            str = setState.LJLJJI;
        }
        MT2 mt2 = new MT2(Integer.valueOf(creatorNoticeResponse2.resultSortId));
        Object obj2 = ((CreatorNoticeResponse) ((C72912tb) ((AbstractC72932td) aqS55S0400000_9.l2)).LIZ).resultFilterIds;
        if (obj2 == null) {
            obj2 = C61878OQg.INSTANCE;
        }
        return MT0.LIZ(setState, null, mt2, new MT2(obj2), str, c3c1, null, null, false, false, null, 2017);
    }

    public static final Object invoke$7(AqS55S0400000_9 aqS55S0400000_9, Object it) {
        o.LJIIIZ(it, "it");
        CreatorNoticeResultVM creatorNoticeResultVM = (CreatorNoticeResultVM) aqS55S0400000_9.l0;
        creatorNoticeResultVM.setState(new AqS55S0400000_9((AbstractC72932td) aqS55S0400000_9.l2, (MT7) aqS55S0400000_9.l1, (NoticeTabModel) aqS55S0400000_9.l3, creatorNoticeResultVM, 6));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS55S0400000_9 aqS55S0400000_9, Object obj) {
        String str;
        InterfaceC65784Pro<C57819Mmd> interfaceC65784Pro;
        C57819Mmd invoke;
        Fragment LJIIIZ;
        Lifecycle lifecycle;
        String str2;
        Aweme aweme = (Aweme) obj;
        o.LJIIIZ(aweme, "aweme");
        RectRecUserVideoCell rectRecUserVideoCell = (RectRecUserVideoCell) aqS55S0400000_9.l0;
        Object obj2 = null;
        try {
            if (!o.LJ(rectRecUserVideoCell.itemView.getTag(R.id.n1_), Boolean.TRUE)) {
                LifecycleOwner lifecycleOwner = rectRecUserVideoCell.getLifecycleOwner();
                if ((((lifecycleOwner instanceof Fragment) && (LJIIIZ = (Fragment) lifecycleOwner) != null) || (LJIIIZ = C79234V7u.LJIIIZ(rectRecUserVideoCell.itemView)) != null) && (LJIIIZ.isDetached() || !LJIIIZ.isAdded())) {
                    AYY.LIZ.getClass();
                    AYY.LIZ("Ability", "attach fragment illegal!", null);
                } else {
                    LifecycleOwner lifecycleOwner2 = rectRecUserVideoCell.getLifecycleOwner();
                    if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                            AYY.LIZ.getClass();
                            AYY.LIZ("Ability", "get ability illegal!", null);
                        } else {
                            InterfaceC57932MoS L = rectRecUserVideoCell.L();
                            if (L != null) {
                                str2 = L.LJJIFFI();
                            } else {
                                str2 = null;
                            }
                            View itemView = rectRecUserVideoCell.itemView;
                            o.LJIIIIZZ(itemView, "itemView");
                            Object LIZ = C55096Ljo.LIZ(C55230Lly.LJ(itemView), RecUserCellTrackAbility.class, str2);
                            if (LIZ == null) {
                                AYY ayy = AYY.LIZ;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(str2);
                                LIZ2.append("'s ");
                                LIZ2.append(C65352Pkq.LIZ(RecUserCellTrackAbility.class).LJFF());
                                LIZ2.append(" not found, parent: ");
                                LIZ2.append(rectRecUserVideoCell.itemView.getParent());
                                String LIZIZ = X1D.LIZIZ(LIZ2);
                                ayy.getClass();
                                AYY.LIZ("Ability", LIZIZ, null);
                            }
                            obj2 = LIZ;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            AYY.LIZ.getClass();
            AYY.LIZ("Ability", "get ability error!", th);
        }
        RecUserCellTrackAbility recUserCellTrackAbility = (RecUserCellTrackAbility) obj2;
        if (recUserCellTrackAbility == null || (interfaceC65784Pro = recUserCellTrackAbility.LJLIL) == null || (invoke = interfaceC65784Pro.invoke()) == null || (str = invoke.LIZ) == null) {
            str = "";
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(((C2321199b) aqS55S0400000_9.l1).getContext(), "//aweme/detail");
        buildRoute.withParam("enter_from", str);
        buildRoute.withParam("video_from", "[UserCard]_DETAIL");
        buildRoute.withParam("id", aweme.getAid());
        buildRoute.withParam("userid", ((RecUser) aqS55S0400000_9.l2).getUid());
        buildRoute.withParam("sec_userid", ((RecUser) aqS55S0400000_9.l2).getSecUid());
        buildRoute.withParam("is_show_follow_btn_on_bottom", true);
        buildRoute.withParam("refer", "others_homepage");
        buildRoute.withParam("previous_page", str);
        buildRoute.withParam("matched_friend_strcut", ((RecUser) aqS55S0400000_9.l2).getMatchedFriendStruct());
        buildRoute.withParam("is_card", true);
        buildRoute.withParam("follow_recommned_enter_from", str);
        buildRoute.withParam("scene_type", EnumC57366MfK.CARD.getType());
        buildRoute.open();
        if (recUserCellTrackAbility != null) {
            C57826Mmk item = (C57826Mmk) aqS55S0400000_9.l3;
            o.LJIIIZ(item, "item");
            recUserCellTrackAbility.LIZJ(recUserCellTrackAbility.LIZ(), item, recUserCellTrackAbility.LIZIZ(), EnumC57365MfJ.CLICK_COVER);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS55S0400000_9(C68322mC c68322mC, C68322mC<String> c68322mC2, C68322mC<String> c68322mC3, C68322mC<String> c68322mC4, C68322mC<String> c68322mC5) {
        super(1);
        this.$t = c68322mC5;
        this.l0 = c68322mC;
        this.l1 = c68322mC2;
        this.l2 = c68322mC3;
        this.l3 = c68322mC4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS55S0400000_9(AbstractC72932td abstractC72932td, MT7 mt7, NoticeTabModel noticeTabModel, CreatorNoticeResultVM creatorNoticeResultVM, int i) {
        super(1);
        this.$t = i;
        this.l0 = creatorNoticeResultVM;
        this.l1 = mt7;
        this.l2 = abstractC72932td;
        this.l3 = noticeTabModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS55S0400000_9(EnumC57435MgR enumC57435MgR, EnumC57435MgR enumC57435MgR2, EnumC57435MgR enumC57435MgR3, RecUser recUser, AbsRecUserCell<C57826Mmk> absRecUserCell) {
        super(1);
        this.$t = absRecUserCell;
        this.l0 = enumC57435MgR;
        this.l1 = enumC57435MgR2;
        this.l2 = enumC57435MgR3;
        this.l3 = recUser;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS55S0400000_9(CreatorNoticeResultVM creatorNoticeResultVM, CreatorNoticeResultVM creatorNoticeResultVM2, List<? extends MusNotice> list, C34K c34k, C34K c34k2) {
        super(1);
        this.$t = c34k2;
        this.l0 = creatorNoticeResultVM;
        this.l1 = creatorNoticeResultVM2;
        this.l2 = list;
        this.l3 = c34k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS55S0400000_9(RectRecUserVideoCell rectRecUserVideoCell, C2321199b c2321199b, RecUser recUser, C57826Mmk c57826Mmk, int i) {
        super(1);
        this.$t = i;
        this.l0 = rectRecUserVideoCell;
        this.l1 = c2321199b;
        this.l2 = recUser;
        this.l3 = c57826Mmk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS55S0400000_9(SearchSeparateTabHorizontalVM searchSeparateTabHorizontalVM, SearchSeparateTabHorizontalVM searchSeparateTabHorizontalVM2, Integer num, Integer num2, List<C50389Jq5> list) {
        super(1);
        this.$t = list;
        this.l0 = searchSeparateTabHorizontalVM;
        this.l1 = searchSeparateTabHorizontalVM2;
        this.l2 = num;
        this.l3 = num2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS55S0400000_9(SearchTabHorizontalVM searchTabHorizontalVM, SearchTabHorizontalVM searchTabHorizontalVM2, Integer num, Integer num2, List<C50389Jq5> list) {
        super(1);
        this.$t = list;
        this.l0 = searchTabHorizontalVM;
        this.l1 = searchTabHorizontalVM2;
        this.l2 = num;
        this.l3 = num2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS55S0400000_9(TrendingDetailSharedVM trendingDetailSharedVM, TrendingDetailSharedVM trendingDetailSharedVM2, C68322mC<String> c68322mC, TrendingItems trendingItems, TrendingEventModel trendingEventModel) {
        super(1);
        this.$t = trendingEventModel;
        this.l0 = trendingDetailSharedVM;
        this.l1 = trendingDetailSharedVM2;
        this.l2 = c68322mC;
        this.l3 = trendingItems;
    }
}
