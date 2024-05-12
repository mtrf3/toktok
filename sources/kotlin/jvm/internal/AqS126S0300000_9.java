package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C221018lt;
import X.C26045AKb;
import X.C56424MCm;
import X.C56912MVg;
import X.C56927MVv;
import X.C57826Mmk;
import X.C68322mC;
import X.C70B;
import X.C76800UCe;
import X.C8W0;
import X.EnumC57435MgR;
import X.InterfaceC56930MVy;
import X.InterfaceC88471Ynr;
import X.MWD;
import X.MWE;
import X.Q8U;
import X.UPJ;
import Y.ARunnableS28S0200000_9;
import android.os.Bundle;
import android.view.View;
import android.widget.TextSwitcher;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunPageFragment;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.ss.android.ugc.aweme.trending.ui.TrendingTitleSwitcher;
import com.ss.android.ugc.aweme.trending.ui.detailpage.BottomBarAssem;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public class AqS126S0300000_9 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0194, code lost:
    
        if (r6 != null) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AqS126S0300000_9 r28, java.lang.Object r29, java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 1871
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS126S0300000_9.invoke$0(kotlin.jvm.internal.AqS126S0300000_9, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AqS126S0300000_9 aqS126S0300000_9, Object obj, Object obj2) {
        EnumC57435MgR prev = (EnumC57435MgR) obj;
        EnumC57435MgR target = (EnumC57435MgR) obj2;
        o.LJIIIZ(prev, "prev");
        o.LJIIIZ(target, "target");
        IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) aqS126S0300000_9.l0;
        if (iUserCardListAbility != null) {
            iUserCardListAbility.Ju0(new AqS55S0400000_9(prev, target, (EnumC57435MgR) aqS126S0300000_9.l1, (RecUser) aqS126S0300000_9.l2, (AbsRecUserCell<C57826Mmk>) 1));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS126S0300000_9 aqS126S0300000_9, Object obj, Object obj2) {
        C8W0 selectSubscribe = (C8W0) obj;
        List total = (List) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(total, "total");
        if (!total.isEmpty()) {
            BottomBarAssem bottomBarAssem = (BottomBarAssem) aqS126S0300000_9.l0;
            if (bottomBarAssem.LJLJL) {
                bottomBarAssem.LJLJL = false;
                if (!C56424MCm.LIZ()) {
                    BottomBarAssem bottomBarAssem2 = (BottomBarAssem) aqS126S0300000_9.l0;
                    TextSwitcher bottomListTextSwitcher = (TextSwitcher) aqS126S0300000_9.l1;
                    o.LJIIIIZZ(bottomListTextSwitcher, "bottomListTextSwitcher");
                    bottomBarAssem2.LJLJLJ = new TrendingTitleSwitcher(bottomListTextSwitcher, selectSubscribe, total, new AqS172S0200000_9((BottomBarAssem) aqS126S0300000_9.l0, (BottomBarAssem) total, (List<TrendingEventModel>) 6));
                    TrendingTitleSwitcher trendingTitleSwitcher = ((BottomBarAssem) aqS126S0300000_9.l0).LJLJLJ;
                    if (trendingTitleSwitcher != null) {
                        trendingTitleSwitcher.init();
                    }
                }
                if (((BottomBarAssem) aqS126S0300000_9.l0).v3().LJLIL && !C56424MCm.LIZ()) {
                    new SafeHandler(selectSubscribe).postDelayed(new ARunnableS28S0200000_9((View) aqS126S0300000_9.l2, (BottomBarAssem) aqS126S0300000_9.l0, 29), TimeUnit.SECONDS.toMillis(1L));
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS126S0300000_9 aqS126S0300000_9, Object obj, Object obj2) {
        String LIZIZ;
        NoticeUITemplate noticeUITemplate;
        String str;
        String aid = (String) obj;
        String cid = (String) obj2;
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(cid, "cid");
        InterfaceC56930MVy mBridge = ((C56912MVg) aqS126S0300000_9.l0).getMBridge();
        if (mBridge != null) {
            mBridge.s();
        }
        C56927MVv expandAbility = ((C56912MVg) aqS126S0300000_9.l0).getExpandAbility();
        if (expandAbility != null) {
            MWE mwe = (MWE) aqS126S0300000_9.l2;
            C56912MVg c56912MVg = (C56912MVg) aqS126S0300000_9.l0;
            if (MWD.LIZ(expandAbility.LIZ)) {
                LIZIZ = Q8U.LIZIZ(new Object[]{aid, cid}, 2, "aweme://story/detail/%s?cid=%s&refer=notification_page&comment_enter_method=click_view_reply&video_from=STORY_ENTRANCE_DEFAULT", "format(format, *args)");
            } else {
                LIZIZ = Q8U.LIZIZ(new Object[]{aid, cid}, 2, "aweme://aweme/detail/%s?cid=%s&refer=notification_page&comment_enter_method=click_view_reply", "format(format, *args)");
            }
            c56912MVg.LJ(LIZIZ);
            if (C76800UCe.LIZ == null) {
                GeneralTemplateNotice generalTemplateNotice = mwe.LIZ;
                if (generalTemplateNotice != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (str = noticeUITemplate.toastText) != null) {
                    C26045AKb c26045AKb = new C26045AKb(c56912MVg);
                    c26045AKb.LJIIIZ(str);
                    c26045AKb.LJIIJ();
                }
                C221018lt.LJFF("NoticeTemplateView", "schemaUrl is null");
            }
            return C76800UCe.LIZ;
        }
        ((C56912MVg) aqS126S0300000_9.l0).LJ(UPJ.LIZIZ("aweme://aweme/detail/", aid, "?cid=", cid, "&refer=notification_page&comment_enter_method=click_view_reply"));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS126S0300000_9(C56912MVg c56912MVg, C56912MVg c56912MVg2, C68322mC<C70B> c68322mC, MWE mwe) {
        super(2);
        this.$t = mwe;
        this.l0 = c56912MVg;
        this.l1 = c56912MVg2;
        this.l2 = c68322mC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS126S0300000_9(MallRacunPageFragment mallRacunPageFragment, View view, Bundle bundle, int i) {
        super(2);
        this.$t = i;
        this.l0 = mallRacunPageFragment;
        this.l1 = view;
        this.l2 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS126S0300000_9(IUserCardListAbility iUserCardListAbility, IUserCardListAbility iUserCardListAbility2, RecUser recUser, AbsRecUserCell<ITEM> absRecUserCell) {
        super(2);
        this.$t = absRecUserCell;
        this.l0 = iUserCardListAbility;
        this.l1 = iUserCardListAbility2;
        this.l2 = recUser;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS126S0300000_9(BottomBarAssem bottomBarAssem, TextSwitcher textSwitcher, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = bottomBarAssem;
        this.l1 = textSwitcher;
        this.l2 = view;
    }
}
