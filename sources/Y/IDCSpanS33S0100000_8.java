package Y;

import X.AnonymousClass636;
import X.C188727au;
import X.EF7;
import X.FMX;
import X.T5C;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity;
import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IDCSpanS33S0100000_8 extends ClickableSpan {
    public final int $t;
    public Object l0;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
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
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }

    public IDCSpanS33S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(IDCSpanS33S0100000_8 iDCSpanS33S0100000_8, View widget) {
        o.LJIIIZ(widget, "widget");
        ShoutoutsPlayViewModel LLFZ = ((ShoutoutsPlayActivity) iDCSpanS33S0100000_8.l0).LLFZ();
        Context context = widget.getContext();
        o.LJIIIIZZ(context, "widget.context");
        LLFZ.Hv0(context, ((ShoutoutsPlayActivity) iDCSpanS33S0100000_8.l0).LJLJJL);
    }

    public static final void onClick$1(IDCSpanS33S0100000_8 iDCSpanS33S0100000_8, View widget) {
        o.LJIIIZ(widget, "widget");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "challenge");
        c188727au.LJIIIZ("secuid", ((T5C) iDCSpanS33S0100000_8.l0).getMChallenge().getAuthor().getSecUid());
        c188727au.LJIIIZ("page_type", "challenge");
        c188727au.LJIIIZ("tag_id", ((T5C) iDCSpanS33S0100000_8.l0).getMChallenge().getCid());
        FMX.LJIIL("click_account_button", c188727au.LIZ);
        SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), "aweme://user/profile/");
        buildRoute.withParam("uid", ((T5C) iDCSpanS33S0100000_8.l0).getMChallenge().getAuthor().getUid());
        buildRoute.withParam("sec_user_id", ((T5C) iDCSpanS33S0100000_8.l0).getMChallenge().getAuthor().getSecUid());
        buildRoute.open();
    }

    public static final void updateDrawState$0(IDCSpanS33S0100000_8 iDCSpanS33S0100000_8, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, (ShoutoutsPlayActivity) iDCSpanS33S0100000_8.l0));
        ds.setUnderlineText(true);
    }

    public static final void updateDrawState$1(IDCSpanS33S0100000_8 iDCSpanS33S0100000_8, TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
        Context context = ((T5C) iDCSpanS33S0100000_8.l0).getContext();
        o.LJIIIIZZ(context, "context");
        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context));
    }
}
