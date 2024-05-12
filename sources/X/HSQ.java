package X;

import android.app.Dialog;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectAnchorInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class HSQ extends HSS {
    public static final /* synthetic */ int LJLLJ = 0;
    public final int LJLJLJ;
    public AnchorPanelAction LJLLI;
    public List<EditEffectAnchorInfo> LJLJLLL = new ArrayList();
    public String LJLL = "";
    public final String LJLLILLLL = AnonymousClass629.LIZ("randomUUID().toString()");

    @Override // X.HSS
    public final String LJJIJIL() {
        return "app_page";
    }

    @Override // X.HSS, X.S1E
    public final String LIZ() {
        String keyword;
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        if (anchorCommonStruct == null || (keyword = anchorCommonStruct.getKeyword()) == null) {
            return "";
        }
        return keyword;
    }

    @Override // X.HSW, X.S1E
    public final InterfaceC44104HSq LJIJI() {
        String str = this.LJLJI;
        type();
        return new HSH(str);
    }

    public final String LJJJJLL() {
        String str = this.LJLL;
        if (o.LJ(str, EnumC133695Mn.EDIT_PROP.getType())) {
            return "editing_prop_page";
        }
        if (o.LJ(str, EnumC133695Mn.EDIT_EFFECT.getType()) || o.LJ(str, EnumC133695Mn.EDIT_EFFECT_SERVER.getType()) || o.LJ(str, EnumC133695Mn.EDIT_EFFECT_CLIENT.getType())) {
            return "editing_effect_page";
        }
        return "editing_effect_template";
    }

    public final boolean LJJJJZ() {
        if (o.LJ(this.LJLL, "template") || ((C140315f1.LIZ && (o.LJ(this.LJLL, EnumC133695Mn.EDIT_EFFECT.getType()) || o.LJ(this.LJLL, EnumC133695Mn.EDIT_EFFECT_SERVER.getType()) || o.LJ(this.LJLL, EnumC133695Mn.EDIT_EFFECT_CLIENT.getType()))) || (C140395f9.LIZ && o.LJ(this.LJLL, EnumC133695Mn.EDIT_PROP.getType())))) {
            return true;
        }
        return false;
    }

    @Override // X.S1E
    public final S1E clone() {
        return new HSQ(this.LJLJLJ + 1);
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        boolean z;
        AnchorCommonStruct anchorCommonStruct;
        List<AnchorPanelAction> actions;
        AnchorCommonStruct anchorCommonStruct2;
        List<AnchorPanelAction> actions2;
        String extra;
        AnchorCommonStruct anchorCommonStruct3 = this.LJLJJL;
        if (anchorCommonStruct3 != null && anchorCommonStruct3.getType() == 28) {
            z = true;
        } else {
            z = false;
        }
        if (z && (anchorCommonStruct2 = this.LJLJJL) != null && (actions2 = anchorCommonStruct2.getActions()) != null) {
            Iterator<AnchorPanelAction> it = actions2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnchorPanelAction next = it.next();
                if (next.getActionType() == 1) {
                    if (next != null) {
                        AnchorCommonStruct anchorCommonStruct4 = this.LJLJJL;
                        if (anchorCommonStruct4 != null && (extra = anchorCommonStruct4.getExtra()) != null) {
                            try {
                                if (JSONObjectProtectorUtils.getInt(new JSONObject(extra), "is_commerce") == 1) {
                                    return EnumC42934Gt8.PROP_COMMERCIAL_EFFECT.getTYPE();
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        return EnumC42934Gt8.PROP.getTYPE();
                    }
                }
            }
        }
        AnchorCommonStruct anchorCommonStruct5 = this.LJLJJL;
        if (anchorCommonStruct5 != null && anchorCommonStruct5.getType() == 64 && (anchorCommonStruct = this.LJLJJL) != null && (actions = anchorCommonStruct.getActions()) != null) {
            Iterator<AnchorPanelAction> it2 = actions.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AnchorPanelAction next2 = it2.next();
                if (next2.getActionType() == 1) {
                    if (next2 != null) {
                        return EnumC42934Gt8.ANCHOR_EDIT_EFFECT.getTYPE();
                    }
                }
            }
        }
        return super.type();
    }

    public final String LJJJJJL() {
        String str;
        JSONObject LJJIJLIJ = LJJIJLIJ();
        if (LJJIJLIJ == null || (str = LJJIJLIJ.optString("request_id")) == null) {
            str = "";
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(str);
        String LIZ = C3A5.LIZ.LIZ(logPbBean);
        o.LJIIIIZZ(LIZ, "getInstance().formatLogPb(logPb)");
        return LIZ;
    }

    public HSQ(int i) {
        this.LJLJLJ = i;
    }

    public static /* synthetic */ JSONObject LJJJJLI(HSQ hsq) {
        return hsq.LJJJJL("", new C76W());
    }

    @Override // X.HSS, X.S1E
    public final void LIZLLL(SmartImageView imageView) {
        o.LJIIIZ(imageView, "imageView");
        boolean z = true;
        if (this.LJLL.length() > 0) {
            String str = this.LJLL;
            if (o.LJ(str, "template")) {
                if (this.LJLJJI) {
                    LJJJLIIL(imageView, R.raw.icon_template_fill, R.raw.icon_anchor_templates);
                    return;
                } else {
                    LJJJLIIL(imageView, R.raw.icon_template, R.raw.icon_anchor_templates);
                    return;
                }
            }
            if (!o.LJ(str, EnumC133695Mn.EDIT_EFFECT.getType()) && !o.LJ(str, EnumC133695Mn.EDIT_EFFECT_SERVER.getType())) {
                z = o.LJ(str, EnumC133695Mn.EDIT_EFFECT_CLIENT.getType());
            }
            if (z) {
                LJJJLIIL(imageView, R.raw.icon_effect_rectangle_fill_fallback, R.raw.icon_anchor_effect_edit);
                return;
            }
            if (o.LJ(str, EnumC133695Mn.EDIT_PROP.getType())) {
                if (C140395f9.LIZ) {
                    LJJJLIIL(imageView, R.raw.icon_effect_rectangle_fill_fallback, R.raw.icon_anchor_effect_edit);
                    return;
                } else if (this.LJLJJI) {
                    LJJJLIIL(imageView, R.raw.icon_effect_fill, R.raw.icon_anchor_effect);
                    return;
                } else {
                    LJJJLIIL(imageView, R.raw.icon_effect, R.raw.icon_anchor_effect);
                    return;
                }
            }
            if (this.LJLJJI) {
                LJJJLIIL(imageView, R.raw.icon_effect_fill, R.raw.icon_anchor_effect);
                return;
            } else {
                LJJJLIIL(imageView, R.raw.icon_effect, R.raw.icon_anchor_effect);
                return;
            }
        }
        super.LIZLLL(imageView);
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        HSS.LJJIFFI(eventMapBuilder, LJJJJLI(this));
        C211648Si.LIZ(eventMapBuilder, LJJII(), LJJIIZI(), true);
        FMX.LJIIL("multi_anchor_entrance_show", eventMapBuilder.LIZ);
        C188727au LJJIJIIJI = LJJIJIIJI();
        HSS.LJJIFFI(LJJIJIIJI, LJJJJLI(this));
        FMX.LJIIL("anchor_entrance_show", LJJIJIIJI.LIZ);
        if (LJJII().isAd()) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", LJJII().getAwemeRawAd());
            LIZLLL.LIZJ("prop_anchor", "refer");
            LIZLLL.LJI();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0134, code lost:
    
        r12 = r12;
        r13 = r13;
        r14 = r14;
        r15 = r15;
        LJJJJZI(r12, r13, r14, r15, r5, r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107 A[Catch: JSONException -> 0x0140, TryCatch #1 {JSONException -> 0x0140, blocks: (B:84:0x00f8, B:85:0x00fd, B:86:0x0101, B:88:0x0107, B:90:0x011a, B:92:0x0126, B:96:0x0134), top: B:83:0x00f8 }] */
    @Override // X.HSS, X.S1E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC26289ATl LJFF(java.util.List<com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct> r19) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HSQ.LJFF(java.util.List):X.ATl");
    }

    @Override // X.HSS, X.S1E
    public final void LJI(C188727au c188727au) {
        HSS.LJJIFFI(c188727au, LJJJJLI(this));
        C211648Si.LIZ(c188727au, LJJII(), LJJIIZI(), false);
        FMX.LJIIL("multi_anchor_entrance_click", c188727au.LIZ);
        C188727au LJJIJIIJI = LJJIJIIJI();
        HSS.LJJIFFI(LJJIJIIJI, LJJJJLI(this));
        FMX.LJIIL("anchor_entrance_click", LJJIJIIJI.LIZ);
        if (LJJII().isAd()) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "otherclick", LJJII().getAwemeRawAd());
            LIZLLL.LIZJ("prop_anchor", "refer");
            LIZLLL.LJI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015c  */
    @Override // X.S1E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.C188727au r38) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HSQ.LJIIIIZZ(X.7au):void");
    }

    public final EditEffectAnchorInfo LJJJJJ(AnchorCommonStruct anchorCommonStruct, EnumC133695Mn enumC133695Mn) {
        try {
            JSONObject jSONObject = new JSONObject(anchorCommonStruct.getExtra());
            List LIZ = C173076ql.LIZ(jSONObject);
            if (LIZ == null) {
                return null;
            }
            String optString = jSONObject.optString("sub_type", "");
            o.LJIIIIZZ(optString, "anchorExtraObject.optStr…ants.EFFECT_SUB_TYPE, \"\")");
            this.LJLL = optString;
            return new EditEffectAnchorInfo(anchorCommonStruct.getId(), LIZ, null, enumC133695Mn);
        } catch (JSONException e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Cannot parse anchor extra in createEditEffectInfo with  ");
            LIZ2.append(e);
            C78983UzD.LJIIZILJ(new Throwable(X1D.LIZIZ(LIZ2)));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LJJJJL(java.lang.String r11, X.C76W r12) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HSQ.LJJJJL(java.lang.String, X.76W):org.json.JSONObject");
    }

    public final void LJJJLIIL(SmartImageView smartImageView, int i, int i2) {
        if (this.LJLJJI) {
            smartImageView.setImageDrawable(new SY9(LJJI(), i));
            Integer LJI = C79045V0n.LJI(R.attr.dj, LJJI());
            if (LJI != null) {
                smartImageView.setColorFilter(LJI.intValue());
                return;
            }
            return;
        }
        smartImageView.setImageDrawable(new SY9(LJJI(), i2));
    }

    @Override // X.HSS, X.S1E
    public final void LJIIJ(ViewGroup viewGroup, Dialog dialog, C188727au c188727au, int i) {
        o.LJIIIZ(dialog, "dialog");
        LJJJJIZL(new AqS111S0300000_7(viewGroup, this, c188727au, 16));
    }

    public static void LJJJJZI(List list, List list2, List list3, List list4, List list5, List list6) {
        ArrayList arrayList = (ArrayList) list;
        arrayList.removeAll(list2);
        arrayList.removeAll(list3);
        arrayList.removeAll(list4);
        ((ArrayList) list2).clear();
        ((ArrayList) list3).clear();
        ((ArrayList) list4).clear();
        ((ArrayList) list5).clear();
        if (list6 != null) {
            arrayList.removeAll(list6);
            ((ArrayList) list6).clear();
        }
    }
}
