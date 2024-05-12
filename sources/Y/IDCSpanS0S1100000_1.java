package Y;

import X.ActivityC45651qj;
import X.C106674Gp;
import X.C109544Rq;
import X.C113644d6;
import X.C45804HyK;
import X.C47261Igj;
import X.C4AJ;
import X.C4AO;
import X.C84683Ua;
import X.C87393br;
import X.C88003cq;
import X.C88113d1;
import X.C89103ec;
import X.C91093hp;
import X.EnumC73222u6;
import X.EnumC91113hr;
import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDCSpanS0S1100000_1 extends ClickableSpan {
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
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }

    public static final void onClick$0(IDCSpanS0S1100000_1 iDCSpanS0S1100000_1, View view) {
        List LJJIJ;
        String str;
        Map<String, String> localExt;
        o.LJIIIZ(view, "view");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null) {
            return;
        }
        if (C113644d6.LIZIZ()) {
            LJJIJ = C47261Igj.LJJIJIIJI(Integer.valueOf(EnumC91113hr.VIDEO_STICKER.getType()), Integer.valueOf(EnumC91113hr.STICKER_SET.getType()));
        } else {
            LJJIJ = C47261Igj.LJJIJ(Integer.valueOf(EnumC91113hr.STICKER_SET.getType()));
        }
        C89103ec.LIZ(iDCSpanS0S1100000_1.s0);
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", "chat");
        bundle.putString("enter_method", "dm_inline");
        bundle.putString("target_tab", "v2s");
        C109544Rq c109544Rq = ((C4AO) iDCSpanS0S1100000_1.l1).LJZI;
        if (c109544Rq != null) {
            str = c109544Rq.getConversationId();
        } else {
            str = null;
        }
        C88113d1.LIZJ(LJJIFFI, LJJIJ, str, bundle);
        C91093hp.LJI();
        C84683Ua.LJFF.LIZIZ(new C88003cq(), true);
        C91093hp.LJIIIIZZ();
        C87393br.LJIJJ("chat", "dm_inline");
        C109544Rq c109544Rq2 = ((C4AO) iDCSpanS0S1100000_1.l1).LJZI;
        if (c109544Rq2 != null && (localExt = c109544Rq2.getLocalExt()) != null) {
            localExt.remove("a:sticker_store_inline");
        }
        C106674Gp.LJIILJJIL(((C4AO) iDCSpanS0S1100000_1.l1).LJZI);
    }

    public static final void onClick$1(IDCSpanS0S1100000_1 iDCSpanS0S1100000_1, View widget) {
        o.LJIIIZ(widget, "widget");
        SmartRoute buildRoute = SmartRouter.buildRoute((Context) iDCSpanS0S1100000_1.l1, "//webview");
        buildRoute.withParam("url", iDCSpanS0S1100000_1.s0);
        buildRoute.open();
    }

    public static final void onClick$2(IDCSpanS0S1100000_1 iDCSpanS0S1100000_1, View view) {
        List LJJIJ;
        String str;
        String str2;
        Map<String, String> localExt;
        o.LJIIIZ(view, "view");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null) {
            return;
        }
        if (C113644d6.LIZIZ()) {
            LJJIJ = C47261Igj.LJJIJIIJI(Integer.valueOf(EnumC91113hr.VIDEO_STICKER.getType()), Integer.valueOf(EnumC91113hr.STICKER_SET.getType()));
        } else {
            LJJIJ = C47261Igj.LJJIJ(Integer.valueOf(EnumC91113hr.STICKER_SET.getType()));
        }
        C89103ec.LIZ(iDCSpanS0S1100000_1.s0);
        Bundle bundle = new Bundle();
        C4AJ c4aj = (C4AJ) iDCSpanS0S1100000_1.l1;
        bundle.putString("enter_from", "chat");
        bundle.putString("enter_method", "dm_inline");
        String str3 = c4aj.LLIILII;
        if (o.LJ(str3, String.valueOf(EnumC73222u6.STATIC.getType())) || o.LJ(str3, String.valueOf(EnumC73222u6.ANIMATED.getType()))) {
            str = "all_set";
        } else {
            str = "v2s";
        }
        bundle.putString("target_tab", str);
        C109544Rq c109544Rq = ((C4AJ) iDCSpanS0S1100000_1.l1).LJZI;
        if (c109544Rq != null) {
            str2 = c109544Rq.getConversationId();
        } else {
            str2 = null;
        }
        C88113d1.LIZJ(LJJIFFI, LJJIJ, str2, bundle);
        C91093hp.LJI();
        C84683Ua.LJFF.LIZIZ(new C88003cq(), true);
        C91093hp.LJIIIIZZ();
        C87393br.LJIJJ("chat", "dm_inline");
        C109544Rq c109544Rq2 = ((C4AJ) iDCSpanS0S1100000_1.l1).LJZI;
        if (c109544Rq2 != null && (localExt = c109544Rq2.getLocalExt()) != null) {
            localExt.remove("a:sticker_store_inline");
        }
        C106674Gp.LJIILJJIL(((C4AJ) iDCSpanS0S1100000_1.l1).LJZI);
    }

    public static final void updateDrawState$0(IDCSpanS0S1100000_1 iDCSpanS0S1100000_1, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$1(IDCSpanS0S1100000_1 iDCSpanS0S1100000_1, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }

    public static final void updateDrawState$2(IDCSpanS0S1100000_1 iDCSpanS0S1100000_1, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }

    public IDCSpanS0S1100000_1(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
