package Y;

import X.ASL;
import X.ActivityC45651qj;
import X.C234529Ii;
import X.C235119Kp;
import X.C247279n9;
import X.C247489nU;
import X.C26955Ahz;
import X.C26969AiD;
import X.C27162AlK;
import X.C27949Ay1;
import X.C38350F3i;
import X.C45804HyK;
import X.C76542zS;
import X.C9KF;
import X.FKM;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.StaticAdExplainDialog;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDCSpanS1S1100000_4 extends ClickableSpan {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            default:
                super.onClick(view);
                return;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                return;
            case 1:
                updateDrawState$1(this, textPaint);
                return;
            case 2:
                updateDrawState$2(this, textPaint);
                return;
            case 3:
                updateDrawState$3(this, textPaint);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }

    public IDCSpanS1S1100000_4(StaticAdExplainDialog staticAdExplainDialog, int i) {
        this.$t = i;
        this.l1 = staticAdExplainDialog;
        this.s0 = "https://www.tiktok.com/legal/privacy-policy";
    }

    public static final void onClick$0(IDCSpanS1S1100000_4 iDCSpanS1S1100000_4, View widget) {
        o.LJIIIZ(widget, "widget");
        TuxSheet tuxSheet = StaticAdExplainDialog.LJLJJL;
        String str = null;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
            SmartRoute buildRoute = SmartRouter.buildRoute(((StaticAdExplainDialog) iDCSpanS1S1100000_4.l1).getContext(), "//webview");
            buildRoute.withParam("url", iDCSpanS1S1100000_4.s0);
            Context context = ((StaticAdExplainDialog) iDCSpanS1S1100000_4.l1).getContext();
            if (context != null) {
                str = context.getString(R.string.gdf);
            }
            buildRoute.withParam("title", str);
            buildRoute.open();
            return;
        }
        o.LJIJI("tuxSheet");
        throw null;
    }

    public static final void onClick$1(IDCSpanS1S1100000_4 iDCSpanS1S1100000_4, View widget) {
        String str;
        Float f;
        String str2;
        String priceVal;
        o.LJIIIZ(widget, "widget");
        Map<String, String> map = ((LogisticDTO) iDCSpanS1S1100000_4.l1).eventTrackInfo;
        if (map != null) {
            str = map.get("is_next_day_delivery");
        } else {
            str = null;
        }
        C27949Ay1.LJIJ("next_day_delivery_info", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, 201326586);
        String str3 = iDCSpanS1S1100000_4.s0;
        Price price = ((LogisticDTO) iDCSpanS1S1100000_4.l1).shippingFee;
        if (price != null && (priceVal = price.getPriceVal()) != null) {
            f = C38350F3i.LJJIJLIJ(priceVal);
        } else {
            f = null;
        }
        Price price2 = ((LogisticDTO) iDCSpanS1S1100000_4.l1).shippingFee;
        if (price2 != null) {
            str2 = price2.getCurrency();
        } else {
            str2 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "order_submit");
        linkedHashMap.put("actionsheet_name", "next_day_delivery");
        if (str3 != null) {
            linkedHashMap.put("enter_from_info", str3);
        }
        if (f != null) {
            linkedHashMap.put("shipping_price", f);
        }
        if (str2 != null) {
            linkedHashMap.put("shipping_currency", str2);
        }
        C76542zS.LIZ("tiktokec_enter_actionsheet", linkedHashMap);
        Context context = widget.getContext();
        o.LJIIIIZZ(context, "widget.context");
        LogisticDTO logistic = (LogisticDTO) iDCSpanS1S1100000_4.l1;
        String enterFrom = iDCSpanS1S1100000_4.s0;
        o.LJIIIZ(logistic, "logistic");
        o.LJIIIZ(enterFrom, "enterFrom");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C26969AiD c26969AiD = new C26969AiD(context, null, 0);
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = FKM.LIZ().getString(R.string.fan);
        o.LJIIIIZZ(string, "application.getString(id)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        ASL asl = new ASL();
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLL = c235119Kp;
        tuxSheet.LJLLI = c26969AiD;
        asl.LJI(1);
        int i = (int) C27162AlK.LIZJ;
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLLLLLL = i;
        tuxSheet2.LJLLJ = true;
        tuxSheet2.LJZL = true;
        tuxSheet2.LJZI = false;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new C26955Ahz(elapsedRealtime, enterFrom, logistic, tuxSheet2));
        c235119Kp.LIZIZ(LIZJ);
        c235119Kp.LIZLLL = true;
        c26969AiD.LJJLJLI(logistic, false);
        FragmentManager supportFragmentManager = ((ActivityC45651qj) context).getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "context as AppCompatActi…y).supportFragmentManager");
        tuxSheet2.show(supportFragmentManager, "next_day_delivery");
    }

    public static final void onClick$2(IDCSpanS1S1100000_4 iDCSpanS1S1100000_4, View widget) {
        Activity LJIJJ;
        o.LJIIIZ(widget, "widget");
        Context context = ((C247279n9) iDCSpanS1S1100000_4.l1).LJJ;
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            SmartRoute buildRoute = SmartRouter.buildRoute(LJIJJ, "aweme://webview");
            buildRoute.withParam(UriProtector.parse(iDCSpanS1S1100000_4.s0));
            buildRoute.open();
        }
    }

    public static final void onClick$3(IDCSpanS1S1100000_4 iDCSpanS1S1100000_4, View widget) {
        o.LJIIIZ(widget, "widget");
        Context context = (Context) iDCSpanS1S1100000_4.l1;
        if (context instanceof Activity) {
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://webview");
            buildRoute.withParam(UriProtector.parse(iDCSpanS1S1100000_4.s0));
            buildRoute.open();
        }
    }

    public static final void updateDrawState$0(IDCSpanS1S1100000_4 iDCSpanS1S1100000_4, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$1(IDCSpanS1S1100000_4 iDCSpanS1S1100000_4, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$2(IDCSpanS1S1100000_4 iDCSpanS1S1100000_4, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setColor(C247489nU.LIZIZ(C247489nU.LIZ, "#FF161823"));
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$3(IDCSpanS1S1100000_4 iDCSpanS1S1100000_4, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setColor(C247489nU.LIZ(R.attr.go, (Context) iDCSpanS1S1100000_4.l1));
        ds.setUnderlineText(false);
    }

    public IDCSpanS1S1100000_4(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
