package X;

import android.app.Dialog;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HSJ extends HSS {
    public AnchorPanelAction LJLJLJ;

    @Override // X.HSS
    public final String LJJIJIL() {
        return "app_page";
    }

    @Override // X.S1E
    public final S1E clone() {
        return new HSJ();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.ANCHOR_VOICECONVERSION.getTYPE();
    }

    public final HSI LJJJJJ() {
        boolean z;
        String logExtra;
        AnchorCommonStruct anchorCommonStruct;
        String logExtra2;
        if (LJJII().getAnchors() != null && (!r0.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            logExtra2 = ((AnchorCommonStruct) ListProtector.get(LJJII().getAnchors(), 0)).getLogExtra();
        } else {
            AnchorCommonStruct anchorCommonStruct2 = this.LJLJJL;
            if (anchorCommonStruct2 == null || (logExtra = anchorCommonStruct2.getLogExtra()) == null || logExtra.length() <= 0 || (anchorCommonStruct = this.LJLJJL) == null) {
                return null;
            }
            logExtra2 = anchorCommonStruct.getLogExtra();
        }
        if (logExtra2 == null) {
            return null;
        }
        return new HSI(logExtra2);
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        String LJJLJLI = LJIIIZ().LJJLJLI();
        Aweme LJJLL = LJIIIZ().LJJLL();
        C211648Si.LIZ(eventMapBuilder, LJJLL, LJJLJLI, true);
        eventMapBuilder.LJIIIZ("enter_from", LJJLJLI);
        String authorUid = LJJLL.getAuthorUid();
        String str = "";
        if (authorUid == null) {
            authorUid = "";
        }
        eventMapBuilder.LJIIIZ("author_id", authorUid);
        String aid = LJJLL.getAid();
        if (aid != null) {
            str = aid;
        }
        eventMapBuilder.LJIIIZ("group_id", str);
        FMX.LJIIL("multi_anchor_entrance_show", eventMapBuilder.LIZ);
    }

    @Override // X.HSS, X.S1E
    public final EnumC26289ATl LJFF(List<AnchorCommonStruct> list) {
        boolean z;
        List<AnchorPanelAction> actions;
        List<AnchorPanelAction> actions2;
        if (((RBX) HG3.LJIILL()).getCurUser().getAccountType() == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
        boolean isChildrenMode = ((RBY) HG3.LJIILL()).isChildrenMode();
        AnchorPanelAction anchorPanelAction = null;
        if (z || !isLogin || isChildrenMode) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) list;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) next;
                if (anchorCommonStruct.getType() == type() && (actions = anchorCommonStruct.getActions()) != null) {
                    Iterator<AnchorPanelAction> it2 = actions.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            AnchorPanelAction next2 = it2.next();
                            if (next2.getActionType() == 1) {
                                if (next2 != null) {
                                    arrayList.add(next);
                                }
                            }
                        }
                    }
                }
            }
            arrayList2.removeAll(arrayList);
            return EnumC26289ATl.NOT_FOUND;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = (ArrayList) list;
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) next3;
            if (anchorCommonStruct2.getType() == type() && (actions2 = anchorCommonStruct2.getActions()) != null) {
                Iterator<AnchorPanelAction> it4 = actions2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        AnchorPanelAction next4 = it4.next();
                        if (next4.getActionType() == 1) {
                            if (next4 != null) {
                                arrayList3.add(next3);
                            }
                        }
                    }
                }
            }
        }
        if (arrayList3.size() == 0) {
            return EnumC26289ATl.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct3 = (AnchorCommonStruct) ORZ.LJLLJ(arrayList3);
        LJJ(anchorCommonStruct3);
        arrayList4.remove(anchorCommonStruct3);
        List<AnchorPanelAction> actions3 = anchorCommonStruct3.getActions();
        if (actions3 != null) {
            Iterator<AnchorPanelAction> it5 = actions3.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                AnchorPanelAction next5 = it5.next();
                if (next5.getActionType() == 1) {
                    anchorPanelAction = next5;
                    break;
                }
            }
            anchorPanelAction = anchorPanelAction;
        }
        this.LJLJLJ = anchorPanelAction;
        this.LJLJJL = anchorCommonStruct3;
        if (arrayList3.size() > 1) {
            return EnumC26289ATl.PROCEED;
        }
        return EnumC26289ATl.DONE;
    }

    @Override // X.HSS, X.S1E
    public final void LJI(C188727au c188727au) {
        String LJJLJLI = LJIIIZ().LJJLJLI();
        Aweme LJJLL = LJIIIZ().LJJLL();
        c188727au.LJIIIZ("enter_from", LJJLJLI);
        String authorUid = LJJLL.getAuthorUid();
        String str = "";
        if (authorUid == null) {
            authorUid = "";
        }
        c188727au.LJIIIZ("author_id", authorUid);
        String aid = LJJLL.getAid();
        if (aid != null) {
            str = aid;
        }
        c188727au.LJIIIZ("group_id", str);
        C211648Si.LIZ(c188727au, LJJLL, LJJLJLI, false);
        FMX.LJIIL("multi_anchor_entrance_click", c188727au.LIZ);
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        String str;
        String str2;
        String str3;
        String str4;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        String LJJLJLI = LJIIIZ().LJJLJLI();
        Aweme LJJLL = LJIIIZ().LJJLL();
        eventMapBuilder.LJIIIZ("enter_from", LJJLJLI);
        String authorUid = LJJLL.getAuthorUid();
        String str5 = "";
        if (authorUid == null) {
            authorUid = "";
        }
        eventMapBuilder.LJIIIZ("author_id", authorUid);
        String aid = LJJLL.getAid();
        if (aid == null) {
            aid = "";
        }
        eventMapBuilder.LJIIIZ("group_id", aid);
        FMX.LJIIL("enter_multi_anchor_detail", eventMapBuilder.LIZ);
        SmartRoute buildRoute = SmartRouter.buildRoute(LJJI(), "//voice_conversion/detail");
        buildRoute.withParam("anchor_type", "voice_conversion");
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        String str6 = null;
        if (anchorCommonStruct != null) {
            str = new HSI(anchorCommonStruct.getLogExtra()).LIZ();
        } else {
            str = null;
        }
        buildRoute.withParam("anchor_id", str);
        AnchorCommonStruct anchorCommonStruct2 = this.LJLJJL;
        if (anchorCommonStruct2 == null || (str2 = anchorCommonStruct2.getKeyword()) == null) {
            str2 = "";
        }
        buildRoute.withParam("anchor_name", str2);
        HSI LJJJJJ = LJJJJJ();
        if (LJJJJJ != null) {
            str3 = LJJJJJ.LIZLLL();
        } else {
            str3 = null;
        }
        buildRoute.withParam("main_anchor_type", str3);
        HSI LJJJJJ2 = LJJJJJ();
        if (LJJJJJ2 != null) {
            str4 = LJJJJJ2.LIZ();
        } else {
            str4 = null;
        }
        buildRoute.withParam("main_anchor_id", str4);
        HSI LJJJJJ3 = LJJJJJ();
        if (LJJJJJ3 != null) {
            str6 = LJJJJJ3.LIZJ();
        }
        buildRoute.withParam("main_anchor_name", str6);
        buildRoute.withParam("music_model", LJJII().getMusic());
        buildRoute.withParam("enter_from", LJJLJLI);
        String authorUid2 = LJJLL.getAuthorUid();
        if (authorUid2 == null) {
            authorUid2 = "";
        }
        buildRoute.withParam("author_id", authorUid2);
        String aid2 = LJJLL.getAid();
        if (aid2 != null) {
            str5 = aid2;
        }
        buildRoute.withParam("group_id", str5);
        buildRoute.open();
    }

    @Override // X.HSS, X.S1E
    public final void LJIIJ(ViewGroup viewGroup, Dialog dialog, C188727au c188727au, int i) {
        o.LJIIIZ(dialog, "dialog");
        LJJJJIZL(new AqS111S0300000_7(viewGroup, this, c188727au, 23));
    }
}
