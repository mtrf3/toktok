package kotlin.jvm.internal;

import X.AbstractC029409q;
import X.AbstractC53958LFq;
import X.AbstractC57774Mlu;
import X.AbstractC65781Prl;
import X.C221018lt;
import X.C28871Bj;
import X.C2WH;
import X.C3XO;
import X.C41835GbP;
import X.C55727Ltz;
import X.C55817LvR;
import X.C55978Ly2;
import X.C56386MBa;
import X.C56569MIb;
import X.C56593MIz;
import X.C57629MjZ;
import X.C57776Mlw;
import X.C57788Mm8;
import X.C57789Mm9;
import X.C57825Mmj;
import X.C57826Mmk;
import X.C57900Mnw;
import X.C57967Mp1;
import X.C57970Mp4;
import X.C57983MpH;
import X.C58620MzY;
import X.C73305Spp;
import X.C76800UCe;
import X.C7MY;
import X.EnumC56568MIa;
import X.InterfaceC57910Mo6;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.L97;
import X.MDX;
import X.MS5;
import X.MT0;
import X.MTW;
import X.MTX;
import X.X1D;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel;
import com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM;
import com.ss.android.ugc.aweme.notification.creator.model.TabSortCacheModel;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.trending.ui.detailpage.ContentAssem;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public class AqS97S0101000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public Object l0;

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
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS97S0101000_9 aqS97S0101000_9, Object obj) {
        TopTabProtocol invoke = (TopTabProtocol) obj;
        o.LJIIIZ(invoke, "$this$invoke");
        AbstractC53958LFq LIZIZ = invoke.LJFF().LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.LIZLLL(aqS97S0101000_9.i1, (Fragment) aqS97S0101000_9.l0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS97S0101000_9 aqS97S0101000_9, Object obj) {
        InterfaceC57910Mo6 it = (InterfaceC57910Mo6) obj;
        o.LJIIIZ(it, "it");
        it.kR(new C57789Mm9(aqS97S0101000_9.i1, (C57900Mnw) aqS97S0101000_9.l0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS97S0101000_9 aqS97S0101000_9, Object obj) {
        InterfaceC57910Mo6 it = (InterfaceC57910Mo6) obj;
        o.LJIIIZ(it, "it");
        it.kR(new C57789Mm9(aqS97S0101000_9.i1, (RecUser) aqS97S0101000_9.l0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS97S0101000_9 aqS97S0101000_9, Object obj) {
        TabSortCacheModel tabSortCacheModel;
        MT0 it = (MT0) obj;
        o.LJIIIZ(it, "it");
        NoticeTabModel noticeTabModel = it.LJLIL;
        if (noticeTabModel != null) {
            int i = noticeTabModel.tabId;
            int i2 = aqS97S0101000_9.i1;
            if (i2 != MTW.UN_SUPPORT.getId() && i != 0) {
                Iterator<TabSortCacheModel> it2 = C2WH.LIZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        tabSortCacheModel = it2.next();
                        if (tabSortCacheModel.tabId == i) {
                            break;
                        }
                    } else {
                        tabSortCacheModel = null;
                        break;
                    }
                }
                TabSortCacheModel tabSortCacheModel2 = tabSortCacheModel;
                if (tabSortCacheModel2 != null) {
                    tabSortCacheModel2.sortType = i2;
                } else {
                    C2WH.LIZ.add(new TabSortCacheModel(i, i2));
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("upDateSortTypeList: ");
                LIZ.append(C2WH.LIZ);
                C221018lt.LJFF("Creators_Inbox", X1D.LIZIZ(LIZ));
                MS5.LJI(MTX.LJLIL);
            }
        }
        ((CreatorNoticeResultVM) aqS97S0101000_9.l0).setState(new AqS33S0001000_9(aqS97S0101000_9.i1, 5));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS97S0101000_9 aqS97S0101000_9, Object obj) {
        C55978Ly2 oldState = (C55978Ly2) obj;
        o.LJIIIZ(oldState, "oldState");
        C55817LvR LIZ = oldState.LJLJJL.LIZ();
        if (LIZ != null) {
            int i = aqS97S0101000_9.i1;
            ((ShopMainViewModel) aqS97S0101000_9.l0).setState(new AqS175S0100000_9(new C55817LvR(LIZ.LIZ, Integer.valueOf(i), LIZ.LIZIZ, LIZ.LIZJ, LIZ.LJ), 557));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS97S0101000_9 aqS97S0101000_9, Object obj) {
        C58620MzY log = (C58620MzY) obj;
        o.LJIIIZ(log, "$this$log");
        C56569MIb.LIZ.getClass();
        log.LJII(C56569MIb.LIZIZ, EnumC56568MIa.REQUEST);
        Map<String, Long> map = ((MDX) aqS97S0101000_9.l0).LIZ;
        C56593MIz c56593MIz = C56569MIb.LIZLLL;
        Long l = (Long) ((LinkedHashMap) map).get(c56593MIz.LIZ);
        if (l != null) {
            log.LJII(c56593MIz, Long.valueOf(l.longValue()));
        }
        Map<String, Long> map2 = ((MDX) aqS97S0101000_9.l0).LIZ;
        C56593MIz c56593MIz2 = C56569MIb.LJ;
        Long l2 = (Long) ((LinkedHashMap) map2).get(c56593MIz2.LIZ);
        if (l2 != null) {
            log.LJII(c56593MIz2, Long.valueOf(l2.longValue()));
        }
        log.LJII(C56569MIb.LJII, Integer.valueOf(aqS97S0101000_9.i1));
        Map<String, Long> map3 = ((MDX) aqS97S0101000_9.l0).LIZ;
        C56593MIz c56593MIz3 = C56569MIb.LJFF;
        Long l3 = (Long) ((LinkedHashMap) map3).get(c56593MIz3.LIZ);
        if (l3 != null) {
            log.LJII(c56593MIz3, Long.valueOf(l3.longValue()));
        }
        Map<String, Long> map4 = ((MDX) aqS97S0101000_9.l0).LIZ;
        C56593MIz c56593MIz4 = C56569MIb.LJI;
        Long l4 = (Long) ((LinkedHashMap) map4).get(c56593MIz4.LIZ);
        if (l4 != null) {
            log.LJII(c56593MIz4, Long.valueOf(l4.longValue()));
        }
        Map<String, Long> map5 = ((MDX) aqS97S0101000_9.l0).LIZ;
        C56593MIz c56593MIz5 = C56569MIb.LJIIIZ;
        Long l5 = (Long) ((LinkedHashMap) map5).get(c56593MIz5.LIZ);
        if (l5 != null) {
            log.LJII(c56593MIz5, Long.valueOf(l5.longValue()));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS97S0101000_9 aqS97S0101000_9, Object obj) {
        C57629MjZ setState = (C57629MjZ) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C57629MjZ.LIZ(setState, null, null, (RecUser) aqS97S0101000_9.l0, null, false, null, Integer.valueOf(aqS97S0101000_9.i1), null, null, 443);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$15(AqS97S0101000_9 aqS97S0101000_9, Object updateState) {
        C57967Mp1 c57967Mp1;
        o.LJIIIZ(updateState, "$this$updateState");
        C57983MpH c57983MpH = (C57983MpH) ((AbstractC57774Mlu) aqS97S0101000_9.l0);
        P p = c57983MpH.LIZJ;
        if (p instanceof C57967Mp1) {
            c57967Mp1 = (C57967Mp1) p;
        } else {
            c57967Mp1 = null;
        }
        return new C57970Mp4(false, c57967Mp1, true, aqS97S0101000_9.i1, c57983MpH.LIZLLL);
    }

    public static final Object invoke$16(AqS97S0101000_9 aqS97S0101000_9, Object updateState) {
        o.LJIIIZ(updateState, "$this$updateState");
        return new C57970Mp4(false, null, false, aqS97S0101000_9.i1, ((C57776Mlw) ((AbstractC57774Mlu) aqS97S0101000_9.l0)).LIZIZ);
    }

    public static final Object invoke$2(AqS97S0101000_9 aqS97S0101000_9, Object obj) {
        InterfaceC57910Mo6 it = (InterfaceC57910Mo6) obj;
        o.LJIIIZ(it, "it");
        it.kR(new C57788Mm8(aqS97S0101000_9.i1, ((C57826Mmk) aqS97S0101000_9.l0).LJLJI));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AqS97S0101000_9 aqS97S0101000_9, Object obj) {
        int intValue = ((Number) obj).intValue();
        FollowingRelationFragment followingRelationFragment = (FollowingRelationFragment) aqS97S0101000_9.l0;
        int i = aqS97S0101000_9.i1;
        if (intValue <= 0) {
            if (followingRelationFragment.Sl()) {
                followingRelationFragment.Wl();
                followingRelationFragment.LLIIII = false;
            } else {
                followingRelationFragment.getClass();
            }
        } else {
            if (followingRelationFragment.Sl()) {
                C28871Bj c28871Bj = followingRelationFragment.LJLLLL;
                AbstractC029409q<?> abstractC029409q = ((C3XO) followingRelationFragment.LJZI.getValue()).LIZ;
                if (abstractC029409q != null) {
                    c28871Bj.LJLIL.LIZ(i, abstractC029409q);
                    followingRelationFragment.LJZL = true;
                } else {
                    o.LJIJI("sectionAdapter");
                    throw null;
                }
            }
            C73305Spp c73305Spp = (C73305Spp) followingRelationFragment._$_findCachedViewById(R.id.kfh);
            if (c73305Spp != null) {
                c73305Spp.setVisibility(8);
            }
            View _$_findCachedViewById = followingRelationFragment._$_findCachedViewById(R.id.j_9);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(0);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS97S0101000_9 aqS97S0101000_9, Object obj) {
        C56386MBa it = (C56386MBa) obj;
        o.LJIIIZ(it, "it");
        if (!it.LJLJI.LIZ.booleanValue()) {
            if (aqS97S0101000_9.i1 == 1) {
                ContentAssem contentAssem = (ContentAssem) aqS97S0101000_9.l0;
                contentAssem.LJLJJLL = false;
                AssemSingleListViewModel.manualListLoadMore$default(contentAssem.v3(), null, 1, null);
            } else {
                ContentAssem contentAssem2 = (ContentAssem) aqS97S0101000_9.l0;
                contentAssem2.LJLJJLL = true;
                contentAssem2.v3().manualListRefresh();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS97S0101000_9 aqS97S0101000_9, Object obj) {
        C41835GbP param = (C41835GbP) obj;
        o.LJIIIZ(param, "param");
        return C41835GbP.L(param, ((C55727Ltz) aqS97S0101000_9.l0).LJLILLLLZI, "click_share_button", aqS97S0101000_9.i1 + 1, "action", "default_story_icon", 365);
    }

    public static final Object invoke$6(AqS97S0101000_9 aqS97S0101000_9, Object updateUIState) {
        o.LJIIIZ(updateUIState, "$this$updateUIState");
        int i = aqS97S0101000_9.i1;
        if (i <= 0) {
            return ((FriendsEmptyPageMainSectionVM) aqS97S0101000_9.l0).hv0();
        }
        if (i < 5) {
            return new L97(C7MY.LIZIZ(60), 44.0f, 9);
        }
        return new L97(0, 0.0f, 15);
    }

    public static final Object invoke$7(AqS97S0101000_9 aqS97S0101000_9, Object log) {
        o.LJIIIZ(log, "$this$log");
        ((InterfaceC88471Ynr) aqS97S0101000_9.l0).invoke(log, Integer.valueOf(aqS97S0101000_9.i1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS97S0101000_9 aqS97S0101000_9, Object obj) {
        InterfaceC57910Mo6 it = (InterfaceC57910Mo6) obj;
        o.LJIIIZ(it, "it");
        it.kR(new C57825Mmj(aqS97S0101000_9.i1, (C57900Mnw) aqS97S0101000_9.l0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS97S0101000_9 aqS97S0101000_9, Object obj) {
        InterfaceC57910Mo6 it = (InterfaceC57910Mo6) obj;
        o.LJIIIZ(it, "it");
        it.kR(new C57825Mmj(aqS97S0101000_9.i1, ((C57826Mmk) aqS97S0101000_9.l0).LJLJI));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS97S0101000_9(int i, C57826Mmk c57826Mmk, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c57826Mmk;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS97S0101000_9(int i, InterfaceC88471Ynr interfaceC88471Ynr, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = interfaceC88471Ynr;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS97S0101000_9(int i, Fragment fragment, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS97S0101000_9(int i, ShopMainViewModel shopMainViewModel, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = shopMainViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS97S0101000_9(int i, FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = friendsEmptyPageMainSectionVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS97S0101000_9(int i, RecUser recUser, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = recUser;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS97S0101000_9(int i, ContentAssem contentAssem, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = contentAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS97S0101000_9(C55727Ltz c55727Ltz, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c55727Ltz;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS97S0101000_9(MDX mdx, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = mdx;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS97S0101000_9(AbstractC57774Mlu abstractC57774Mlu, AbstractC57774Mlu<RecUser> abstractC57774Mlu2, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC57774Mlu;
        this.i1 = abstractC57774Mlu2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS97S0101000_9(C57900Mnw c57900Mnw, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c57900Mnw;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS97S0101000_9(FollowingRelationFragment followingRelationFragment, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = followingRelationFragment;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS97S0101000_9(CreatorNoticeResultVM creatorNoticeResultVM, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = creatorNoticeResultVM;
        this.i1 = i;
    }
}
