package X;

import android.app.Dialog;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HSK extends HSS {
    public AnchorPanelAction LJLJLJ;

    @Override // X.HSS
    public final String LJJIJIL() {
        return "app_page";
    }

    @Override // X.S1E
    public final S1E clone() {
        return new HSK();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.TTS_VOICE.getTYPE();
    }

    public final HSI LJJJJJL() {
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

    public static final HSI LJJJJJ(AnchorCommonStruct anchorCommonStruct) {
        return new HSI(anchorCommonStruct.getLogExtra());
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        C211648Si.LIZ(eventMapBuilder, LJJII(), LJJIIZI(), true);
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
        AnchorPanelAction anchorPanelAction = null;
        if (z) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) list;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) next;
                if (anchorCommonStruct.getType() == type() && (actions2 = anchorCommonStruct.getActions()) != null) {
                    Iterator<AnchorPanelAction> it2 = actions2.iterator();
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
            if (anchorCommonStruct2.getType() == type() && (actions = anchorCommonStruct2.getActions()) != null) {
                Iterator<AnchorPanelAction> it4 = actions.iterator();
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
        C211648Si.LIZ(c188727au, LJJII(), LJJIIZI(), true);
        FMX.LJIIL("multi_anchor_entrance_click", c188727au.LIZ);
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        String str6 = null;
        if (anchorCommonStruct != null) {
            str = LJJJJJ(anchorCommonStruct).LIZ();
        } else {
            str = null;
        }
        eventMapBuilder.LJIIIZ("tone_list", str);
        FMX.LJIIL("enter_multi_anchor_detail", eventMapBuilder.LIZ);
        SmartRoute buildRoute = SmartRouter.buildRoute(LJJI(), "//ttsvoice/info");
        buildRoute.withParam("anchor_type", "tts");
        AnchorCommonStruct anchorCommonStruct2 = this.LJLJJL;
        if (anchorCommonStruct2 != null) {
            str2 = LJJJJJ(anchorCommonStruct2).LIZ();
        } else {
            str2 = null;
        }
        buildRoute.withParam("voice_id", str2);
        AnchorCommonStruct anchorCommonStruct3 = this.LJLJJL;
        if (anchorCommonStruct3 == null || (str3 = anchorCommonStruct3.getKeyword()) == null) {
            str3 = "";
        }
        buildRoute.withParam("anchor_name", str3);
        HSI LJJJJJL = LJJJJJL();
        if (LJJJJJL != null) {
            str4 = LJJJJJL.LIZLLL();
        } else {
            str4 = null;
        }
        buildRoute.withParam("main_anchor_type", str4);
        HSI LJJJJJL2 = LJJJJJL();
        if (LJJJJJL2 != null) {
            str5 = LJJJJJL2.LIZ();
        } else {
            str5 = null;
        }
        buildRoute.withParam("main_anchor_id", str5);
        HSI LJJJJJL3 = LJJJJJL();
        if (LJJJJJL3 != null) {
            str6 = LJJJJJL3.LIZJ();
        }
        buildRoute.withParam("main_anchor_name", str6);
        buildRoute.withParam("music_model", LJJII().getMusic());
        buildRoute.open();
    }

    @Override // X.HSS, X.S1E
    public final void LJIIJ(ViewGroup viewGroup, Dialog dialog, C188727au c188727au, int i) {
        o.LJIIIZ(dialog, "dialog");
        LJJJJIZL(new AqS111S0300000_7(viewGroup, this, c188727au, 18));
    }
}
