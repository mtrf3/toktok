package Y;

import X.A07;
import X.AnonymousClass636;
import X.C235779Nd;
import X.C26060AKq;
import X.C26227ARb;
import X.C26852AgK;
import X.C26854AgM;
import X.C26859AgR;
import X.C26867AgZ;
import X.C39061g6;
import X.C70891Rrz;
import X.C70917RsP;
import X.C78946Uyc;
import X.C79045V0n;
import X.C92163jY;
import X.UC0;
import X.X1D;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.BulletSpan;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeDialog;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.PaymentExtraFeeVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.sticker.model.CommerceSticker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDCSpanS2S0200000_4 extends ClickableSpan {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 4:
                onClick$4(this, view);
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
                textPaint.setUnderlineText(false);
                return;
            case 3:
                updateDrawState$3(this, textPaint);
                return;
            case 4:
                updateDrawState$4(this, textPaint);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }

    public static final void onClick$0(IDCSpanS2S0200000_4 iDCSpanS2S0200000_4, View widget) {
        List<String> list;
        o.LJIIIZ(widget, "widget");
        C78946Uyc.LJJIIJ(((PaymentExtraFeeVH) iDCSpanS2S0200000_4.l0).LJLIL, new C70917RsP(), C26852AgK.LJLIL);
        Integer num = ((ExtraFeeRichText) iDCSpanS2S0200000_4.l1).type;
        boolean z = false;
        if (num == null || num.intValue() != 1) {
            ExtraFeeRichText extraFeeRichText = (ExtraFeeRichText) iDCSpanS2S0200000_4.l1;
            String str = extraFeeRichText.link;
            if (str != null) {
                PaymentExtraFeeVH paymentExtraFeeVH = (PaymentExtraFeeVH) iDCSpanS2S0200000_4.l0;
                IBulletService LIZ = BulletService.LIZ();
                Context context = paymentExtraFeeVH.LJLIL.getContext();
                o.LJIIIIZZ(context, "view.context");
                Boolean bool = extraFeeRichText.isThirdPartyLink;
                if (bool != null) {
                    z = bool.booleanValue();
                }
                String uri = C26867AgZ.LIZJ(str, C26859AgR.LIZ(z)).build().toString();
                o.LJIIIIZZ(uri, "RouterUtils.createUrl(\n …     ).build().toString()");
                LIZ.LJIIIIZZ(context, uri);
                return;
            }
            return;
        }
        PaymentExtraFeeVH paymentExtraFeeVH2 = (PaymentExtraFeeVH) iDCSpanS2S0200000_4.l0;
        Context context2 = paymentExtraFeeVH2.LJLIL.getContext();
        o.LJIIIIZZ(context2, "view.context");
        ExtraFeeRichText extraFeeRichText2 = (ExtraFeeRichText) iDCSpanS2S0200000_4.l1;
        ExtraFeeDialog extraFeeDialog = extraFeeRichText2.dialog;
        String str2 = null;
        if (extraFeeDialog == null || (list = extraFeeDialog.content) == null || list.isEmpty()) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (String str3 : list) {
            SpannableString spannableString = new SpannableString(str3);
            spannableString.setSpan(new BulletSpan(15), 0, str3.length(), 33);
            Appendable append = spannableStringBuilder.append((CharSequence) spannableString);
            o.LJIIIIZZ(append, "append(value)");
            o.LJIIIIZZ(append.append('\n'), "append('\\n')");
        }
        C26227ARb c26227ARb = new C26227ARb(context2);
        A07 a07 = new A07(context2);
        ExtraFeeDialog extraFeeDialog2 = extraFeeRichText2.dialog;
        if (extraFeeDialog2 != null) {
            str2 = extraFeeDialog2.title;
        }
        a07.LJ = str2;
        a07.LJFF = spannableStringBuilder;
        c26227ARb.LJIIJ = a07;
        UC0.LIZJ(c26227ARb, new AqS135S0200000_4(extraFeeRichText2, paymentExtraFeeVH2, 276));
        c26227ARb.LJI().LIZLLL();
        C78946Uyc.LJJIIJ(paymentExtraFeeVH2.LJLIL, new C70891Rrz(), C26854AgM.LJLIL);
    }

    public static final void onClick$1(IDCSpanS2S0200000_4 iDCSpanS2S0200000_4, View widget) {
        boolean z;
        o.LJIIIZ(widget, "widget");
        Context context = ((View) iDCSpanS2S0200000_4.l0).getContext();
        if (context != null) {
            Map.Entry entry = (Map.Entry) iDCSpanS2S0200000_4.l1;
            IBulletService LIZ = BulletService.LIZ();
            String str = ((LinkText) entry.getValue()).link;
            if (str == null) {
                str = "";
            }
            Boolean bool = ((LinkText) entry.getValue()).isThirdPartyLink;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            String uri = C26867AgZ.LIZJ(str, C26859AgR.LIZ(z)).build().toString();
            o.LJIIIIZZ(uri, "RouterUtils.createUrl(\n …     ).build().toString()");
            LIZ.LJIIIIZZ(context, uri);
        }
    }

    public static final void onClick$2(IDCSpanS2S0200000_4 iDCSpanS2S0200000_4, View view) {
        C235779Nd.LIZ.LJIIIIZZ().LIZLLL(Boolean.TRUE);
        ((View) iDCSpanS2S0200000_4.l0).setVisibility(8);
        SmartRouter.buildRoute((Context) iDCSpanS2S0200000_4.l1, "aweme://privacy/setting").open();
    }

    public static final void onClick$3(IDCSpanS2S0200000_4 iDCSpanS2S0200000_4, View p0) {
        o.LJIIIZ(p0, "p0");
        ((C26060AKq) iDCSpanS2S0200000_4.l0).LJIIIIZZ((Context) iDCSpanS2S0200000_4.l1);
    }

    public static final void onClick$4(IDCSpanS2S0200000_4 iDCSpanS2S0200000_4, View widget) {
        o.LJIIIZ(widget, "widget");
        Context context = ((C92163jY) iDCSpanS2S0200000_4.l0).getContext();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://user/profile/");
        LIZ.append(((CommerceSticker) iDCSpanS2S0200000_4.l1).getAdOwnerId());
        C39061g6 c39061g6 = new C39061g6(X1D.LIZIZ(LIZ));
        c39061g6.LIZIZ("sec_user_id", ((CommerceSticker) iDCSpanS2S0200000_4.l1).getSecAdOwnerId());
        SmartRouter.buildRoute(context, c39061g6.LIZJ()).open();
    }

    public static final void updateDrawState$0(IDCSpanS2S0200000_4 iDCSpanS2S0200000_4, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        Context context = ((PaymentExtraFeeVH) iDCSpanS2S0200000_4.l0).LJLIL.getContext();
        o.LJIIIIZZ(context, "view.context");
        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$1(IDCSpanS2S0200000_4 iDCSpanS2S0200000_4, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$3(IDCSpanS2S0200000_4 iDCSpanS2S0200000_4, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        Integer LJI = C79045V0n.LJI(R.attr.go, (Context) iDCSpanS2S0200000_4.l1);
        if (LJI != null) {
            ds.setColor(LJI.intValue());
        }
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$4(IDCSpanS2S0200000_4 iDCSpanS2S0200000_4, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
        Context context = ((C92163jY) iDCSpanS2S0200000_4.l0).getContext();
        o.LJIIIIZZ(context, "context");
        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context));
    }

    public IDCSpanS2S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
