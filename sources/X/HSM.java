package X;

import android.app.Dialog;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HSM extends HSS {
    public AnchorPanelAction LJLJLJ;

    @Override // X.HSS
    public final String LJJIJIL() {
        return "app_page";
    }

    @Override // X.S1E
    public final S1E clone() {
        return new C44098HSk();
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        LJJJJJ(eventMapBuilder);
        C211648Si.LIZ(eventMapBuilder, LJJII(), LJJIIZI(), true);
        FMX.LJIIL("multi_anchor_entrance_show", eventMapBuilder.LIZ);
        C188727au LJJIJIIJI = LJJIJIIJI();
        LJJJJJ(LJJIJIIJI);
        FMX.LJIIL("anchor_entrance_show", LJJIJIIJI.LIZ);
    }

    @Override // X.HSS, X.S1E
    public final EnumC26289ATl LJFF(List<AnchorCommonStruct> list) {
        AnchorPanelAction anchorPanelAction;
        List<AnchorPanelAction> actions;
        Aweme LJJLL = LJIIIZ().LJJLL();
        if (HSN.LIZ(LJIIIZ().LJJLL()) && LJJLL.getAwemeType() != 61) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) list;
            Iterator it = arrayList2.iterator();
            while (true) {
                anchorPanelAction = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) next;
                if (anchorCommonStruct.getType() == 29 && (actions = anchorCommonStruct.getActions()) != null) {
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
            if (arrayList.size() == 0) {
                return EnumC26289ATl.NOT_FOUND;
            }
            AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) ORZ.LJLLJ(arrayList);
            LJJ(anchorCommonStruct2);
            arrayList2.remove(anchorCommonStruct2);
            List<AnchorPanelAction> actions2 = anchorCommonStruct2.getActions();
            if (actions2 != null) {
                Iterator<AnchorPanelAction> it3 = actions2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    AnchorPanelAction next3 = it3.next();
                    if (next3.getActionType() == 1) {
                        anchorPanelAction = next3;
                        break;
                    }
                }
                anchorPanelAction = anchorPanelAction;
            }
            this.LJLJLJ = anchorPanelAction;
            this.LJLJJL = anchorCommonStruct2;
            if (arrayList.size() > 1) {
                return EnumC26289ATl.PROCEED;
            }
            return EnumC26289ATl.DONE;
        }
        return EnumC26289ATl.NOT_FOUND;
    }

    @Override // X.HSS, X.S1E
    public final void LJI(C188727au c188727au) {
        LJJJJJ(c188727au);
        C211648Si.LIZ(c188727au, LJJII(), LJJIIZI(), false);
        FMX.LJIIL("multi_anchor_entrance_click", c188727au.LIZ);
        C188727au LJJIJIIJI = LJJIJIIJI();
        LJJJJJ(LJJIJIIJI);
        FMX.LJIIL("anchor_entrance_click", LJJIJIIJI.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    @Override // X.S1E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.C188727au r20) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HSM.LJIIIIZZ(X.7au):void");
    }

    public final void LJJJJJ(C188727au c188727au) {
        String str;
        int i;
        String aid;
        Aweme LJJII = LJJII();
        String optString = LJJIJLIJ().optString("request_id");
        String str2 = "";
        if (optString == null) {
            optString = "";
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(optString);
        C88547Yp5 c88547Yp5 = C88547Yp5.LIZIZ;
        if (c88547Yp5.LJIJI()) {
            c188727au.LIZLLL(c88547Yp5.LJIJJ(C227768wm.LIZIZ(LJJII)), "spammy_tag_cnt");
        }
        String LIZ = C3A5.LIZ.LIZ(logPbBean);
        c188727au.getClass();
        c188727au.LJIIIZ("log_pb", LIZ);
        if (LJJII == null || (str = LJJII.getAuthorUid()) == null) {
            str = "";
        }
        c188727au.LJIIIZ("author_id", str);
        String str3 = null;
        if (LJJII != null && (aid = LJJII.getAid()) != null) {
            str2 = aid;
        }
        c188727au.LJIIIZ("group_id", str2);
        c188727au.LJIIIZ("enter_from", LJJIIZI());
        if (LJJII.getUploadMiscInfoStruct().mvType == 2) {
            i = 1;
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "is_capcut");
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        if (anchorCommonStruct != null) {
            str3 = anchorCommonStruct.getId();
        }
        c188727au.LJIIIZ("mv_id", str3);
    }

    @Override // X.HSS, X.S1E
    public final void LJIIJ(ViewGroup viewGroup, Dialog dialog, C188727au c188727au, int i) {
        o.LJIIIZ(dialog, "dialog");
        LJJJJIZL(new AqS111S0300000_7(viewGroup, this, c188727au, 14));
    }
}
