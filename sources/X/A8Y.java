package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.paid.content.consumption.PaidContentAnchorExtraModel;
import com.ss.android.ugc.aweme.paid.content.consumption.PaidContentAnchorLogExtraModel;
import com.ss.android.ugc.aweme.service.ISeriesPricingService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class A8Y extends HSS {
    public final C25732A8a LJLJLJ = new C25732A8a();

    @Override // X.S1E
    public final S1E clone() {
        return new A8Y();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.PAID_COLLECTION.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        String logExtra;
        String str;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        super.LJ(eventMapBuilder);
        String LJJLJLI = LJIIIZ().LJJLJLI();
        Aweme LJJLL = LJIIIZ().LJJLL();
        C188727au LJJIJIIJI = LJJIJIIJI();
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        if (anchorCommonStruct != null && (logExtra = anchorCommonStruct.getLogExtra()) != null && logExtra.length() != 0) {
            JSONObject jSONObject = new JSONObject(logExtra);
            Iterator<String> keys = jSONObject.keys();
            o.LJIIIIZZ(keys, "logExtraObj.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if ((obj instanceof String) && (str = (String) obj) != null) {
                    LJJIJIIJI.LJI(next, str);
                }
            }
        }
        LJJIJIIJI.LJIIIZ("enter_from", LJJLJLI);
        String authorUid = LJJLL.getAuthorUid();
        String str2 = "";
        if (authorUid == null) {
            authorUid = "";
        }
        LJJIJIIJI.LJIIIZ("author_id", authorUid);
        LJJIJIIJI.LJIIIZ("music_id", C227768wm.LJIIJJI(LJJLL));
        String aid = LJJLL.getAid();
        if (aid != null) {
            str2 = aid;
        }
        LJJIJIIJI.LJIIIZ("group_id", str2);
        FMX.LJIIL("anchor_entrance_show", LJJIJIIJI.LIZ);
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        HSS.LJJIZ(this, eventMapBuilder, 6);
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        if (anchorCommonStruct != null) {
            SmartRoute buildRoute = SmartRouter.buildRoute(LJIIIZ().LIZ(), anchorCommonStruct.getSchema());
            buildRoute.withParam("anchor_event_map", (HashMap) LJJIII(eventMapBuilder));
            buildRoute.withParam("author_id", LJIIIZ().LJJLL().getAuthorUid());
            String aid = LJIIIZ().LJJLL().getAid();
            String str = "";
            if (aid == null) {
                aid = "";
            }
            buildRoute.withParam("group_id", aid);
            buildRoute.withParam("anchor_id", anchorCommonStruct.getId());
            buildRoute.withParam("enter_from", LJJIIZI());
            String aid2 = LJIIIZ().LJJLL().getAid();
            if (aid2 != null) {
                str = aid2;
            }
            buildRoute.withParam("from_group_id", str);
            buildRoute.withParam("previous_page", LJJIIZI());
            buildRoute.withParam("detail_aweme_from", LJJIIZI());
            buildRoute.open();
        }
    }

    @Override // X.HSS, X.S1E
    public final void LJIIJ(ViewGroup viewGroup, Dialog dialog, C188727au c188727au, int i) {
        String str;
        String str2;
        String str3;
        PriceInfo priceInfo;
        String str4;
        long j;
        String valueOf;
        Character LLFZ;
        String str5;
        String valueOf2;
        Character LLFZ2;
        o.LJIIIZ(dialog, "dialog");
        if (C19N.LJ("paid_content_seller_voucher_enabled", false)) {
            AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
            if (anchorCommonStruct != null) {
                C25732A8a c25732A8a = this.LJLJLJ;
                InterfaceC44105HSr LJIIIZ = LJIIIZ();
                String eventType = LJJIIZI();
                HashMap hashMap = (HashMap) LJJIII(c188727au);
                c25732A8a.getClass();
                o.LJIIIZ(eventType, "eventType");
                Activity LIZ = LJIIIZ.LIZ();
                String extra = anchorCommonStruct.getExtra();
                String logExtra = anchorCommonStruct.getLogExtra();
                try {
                    Object value = c25732A8a.LIZLLL.getValue();
                    o.LJIIIIZZ(value, "<get-gson>(...)");
                    Object LJI = ((Gson) value).LJI(extra, PaidContentAnchorExtraModel.class);
                    o.LJIIIIZZ(LJI, "gson.fromJson(extraDataS…rExtraModel::class.java )");
                    c25732A8a.LIZJ = (PaidContentAnchorExtraModel) LJI;
                    Object value2 = c25732A8a.LIZLLL.getValue();
                    o.LJIIIIZZ(value2, "<get-gson>(...)");
                    Object LJI2 = ((Gson) value2).LJI(logExtra, PaidContentAnchorLogExtraModel.class);
                    o.LJIIIIZZ(LJI2, "gson.fromJson(logExtraDa…gExtraModel::class.java )");
                    c25732A8a.LIZ = ((PaidContentAnchorLogExtraModel) LJI2).collectionID;
                } catch (Exception unused) {
                    FMX.LJIIL("paid_content_anchor_extra_model_failed", new C188727au().LIZ);
                }
                View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), R.layout.bz8, viewGroup, false);
                viewGroup.addView(LLLLIILL);
                ConstraintLayout constraintLayout = (ConstraintLayout) LLLLIILL.findViewById(R.id.a4t);
                SmartImageView smartImageView = (SmartImageView) LLLLIILL.findViewById(R.id.a26);
                TuxTextView tuxTextView = (TuxTextView) LLLLIILL.findViewById(R.id.a4u);
                TuxTextView tuxTextView2 = (TuxTextView) LLLLIILL.findViewById(R.id.a3g);
                TuxTextView tuxTextView3 = (TuxTextView) LLLLIILL.findViewById(R.id.a35);
                SY4 sy4 = (SY4) LLLLIILL.findViewById(R.id.a1v);
                TextView textView = (TextView) LLLLIILL.findViewById(R.id.a4n);
                if (textView != null) {
                    textView.setText(anchorCommonStruct.getKeyword());
                }
                PaidContentAnchorExtraModel paidContentAnchorExtraModel = c25732A8a.LIZJ;
                String str6 = null;
                if (paidContentAnchorExtraModel != null) {
                    str = paidContentAnchorExtraModel.seriesCoverImageUrl;
                } else {
                    str = null;
                }
                W5F LJIIIIZZ = W5U.LJIIIIZZ(String.valueOf(str));
                LJIIIIZZ.LJJIIJ = smartImageView;
                C16880lQ.LLJJJ(LJIIIIZZ);
                sy4.setText(LIZ.getString(R.string.s8o));
                C16880lQ.LJIIJ(new A8Z(anchorCommonStruct, c188727au, LJIIIZ, c25732A8a, LIZ, hashMap, eventType), LLLLIILL);
                PaidContentAnchorExtraModel paidContentAnchorExtraModel2 = c25732A8a.LIZJ;
                if (paidContentAnchorExtraModel2 != null) {
                    str2 = paidContentAnchorExtraModel2.discountedUSDPrice;
                    str3 = paidContentAnchorExtraModel2.discountedIapID;
                } else {
                    str2 = null;
                    str3 = null;
                }
                if (C78685UuP.LJJJZ(str3)) {
                    PaidContentAnchorExtraModel paidContentAnchorExtraModel3 = c25732A8a.LIZJ;
                    if (paidContentAnchorExtraModel3 != null) {
                        str5 = paidContentAnchorExtraModel3.discountedIapID;
                    } else {
                        str5 = null;
                    }
                    String valueOf3 = String.valueOf(str5);
                    if (str2 == null || (LLFZ2 = C40689Fy1.LLFZ(str2)) == null || LLFZ2.charValue() != '$') {
                        valueOf2 = String.valueOf(str2);
                    } else {
                        valueOf2 = C40689Fy1.LLF(1, str2);
                    }
                    priceInfo = new PriceInfo(0L, valueOf3, valueOf2, 1, null);
                } else {
                    priceInfo = null;
                }
                PaidContentAnchorExtraModel paidContentAnchorExtraModel4 = c25732A8a.LIZJ;
                if (paidContentAnchorExtraModel4 != null) {
                    str4 = paidContentAnchorExtraModel4.originalUSDPrice;
                } else {
                    str4 = null;
                }
                Object value3 = c25732A8a.LJ.getValue();
                o.LJIIIIZZ(value3, "<get-seriesPricingService>(...)");
                ISeriesPricingService iSeriesPricingService = (ISeriesPricingService) value3;
                Context LIZIZ = EF7.LIZIZ();
                Long l = c25732A8a.LIZ;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                PaidContentAnchorExtraModel paidContentAnchorExtraModel5 = c25732A8a.LIZJ;
                if (paidContentAnchorExtraModel5 != null) {
                    str6 = paidContentAnchorExtraModel5.originalIapID;
                }
                String valueOf4 = String.valueOf(str6);
                if (str4 == null || (LLFZ = C40689Fy1.LLFZ(str4)) == null || LLFZ.charValue() != '$') {
                    valueOf = String.valueOf(str4);
                } else {
                    valueOf = C40689Fy1.LLF(1, str4);
                }
                iSeriesPricingService.LIZ(LIZIZ, C47261Igj.LJJIJ(new A2Z(j, new PriceInfo(0L, valueOf4, valueOf, 1, null), priceInfo))).observe((C1AU) LIZ, new A8S(c25732A8a, tuxTextView3, tuxTextView, tuxTextView2, constraintLayout, LJIIIZ, smartImageView, sy4));
                return;
            }
            return;
        }
        super.LJIIJ(viewGroup, dialog, c188727au, i);
    }
}
