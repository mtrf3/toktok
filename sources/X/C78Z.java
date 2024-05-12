package X;

import Y.ACListenerS27S0400000_3;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.78Z, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C78Z {
    public static final /* synthetic */ int LIZ = 0;

    public static C188727au LIZ(String str, String str2, boolean z) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ(WM7.SCENE_SERVICE, str);
        c188727au.LJIIIZ("group_id", str2);
        c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJFF(Boolean.valueOf(z), "resend_same_cmt");
        return c188727au;
    }

    public static TuxSheet LIZIZ(final Context context, CommentRethinkPopup commentRethinkPopup, final InterfaceC178306zC interfaceC178306zC, boolean z, String str, String aid) {
        C34K c34k;
        final CommentRethinkPopup commentRethinkPopup2 = commentRethinkPopup;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aid, "aid");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.pc, null, false);
        final TuxTextView tuxTextView = (TuxTextView) LLLLIILL.findViewById(R.id.lvz);
        TextView textView = (TextView) LLLLIILL.findViewById(R.id.lyc);
        TuxTextView tuxTextView2 = (TuxTextView) LLLLIILL.findViewById(R.id.hy_);
        TuxTextView tuxTextView3 = (TuxTextView) LLLLIILL.findViewById(R.id.gyj);
        ASL asl = new ASL();
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLI = LLLLIILL;
        tuxSheet.LJLJI = false;
        tuxSheet.LLD = false;
        tuxSheet.LL = false;
        asl.LJI(0);
        TuxSheet tuxSheet2 = asl.LIZ;
        if (commentRethinkPopup2 == null) {
            commentRethinkPopup2 = new CommentRethinkPopup(null, null, null, null, 15, null);
        }
        if (TextUtils.isEmpty(commentRethinkPopup2.getTitle()) || TextUtils.isEmpty(commentRethinkPopup2.getBody()) || TextUtils.isEmpty(commentRethinkPopup2.getHighlight())) {
            String string = context.getString(R.string.dl8);
            o.LJIIIIZZ(string, "context.getString(R.stri…ish_rethink_common_title)");
            commentRethinkPopup2.setTitle(string);
            String string2 = context.getString(R.string.dl6);
            o.LJIIIIZZ(string2, "context.getString(R.stri…lish_rethink_common_body)");
            commentRethinkPopup2.setBody(string2);
            String string3 = context.getString(R.string.dl7);
            o.LJIIIIZZ(string3, "context.getString(R.stri…rethink_common_highlight)");
            commentRethinkPopup2.setHighlight(string3);
        }
        String LIZIZ = Q8U.LIZIZ(new Object[]{commentRethinkPopup2.getHighlight()}, 1, commentRethinkPopup2.getBody(), "format(format, *args)");
        int LJJLIIIJL = s.LJJLIIIJL(LIZIZ, commentRethinkPopup2.getHighlight(), 0, false, 6);
        final C188727au LIZ2 = LIZ(str, aid, z);
        final C34K c34k2 = new C34K();
        SpannableString spannableString = new SpannableString(LIZIZ);
        if (LJJLIIIJL >= 0) {
            int length = commentRethinkPopup2.getHighlight().length() + LJJLIIIJL;
            spannableString.setSpan(new StyleSpan(1), LJJLIIIJL, length, 18);
            if (!TextUtils.isEmpty(commentRethinkPopup2.getLink())) {
                c34k = c34k2;
                commentRethinkPopup2 = commentRethinkPopup2;
                spannableString.setSpan(new ClickableSpan() { // from class: X.7Ej
                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View widget) {
                        o.LJIIIZ(widget, "widget");
                        C38281F0r c38281F0r = new C38281F0r(CommentRethinkPopup.this.getLink());
                        c38281F0r.LIZLLL("lang", LocalServiceImpl.LIZIZ().LIZ(context));
                        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://webview/");
                        buildRoute.withParam("url", c38281F0r.LJ());
                        buildRoute.open();
                        InterfaceC178306zC interfaceC178306zC2 = interfaceC178306zC;
                        if (interfaceC178306zC2 != null) {
                            interfaceC178306zC2.LIZJ();
                        }
                        c34k2.element = true;
                        FMX.LJIIL("comment_rethink_cg_ck", LIZ2.LIZ);
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint ds) {
                        o.LJIIIZ(ds, "ds");
                        Context context2 = tuxTextView.getContext();
                        o.LJIIIIZZ(context2, "tvContent.context");
                        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context2));
                        ds.setUnderlineText(false);
                    }
                }, LJJLIIIJL, length, 18);
                tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setText(commentRethinkPopup2.getTitle());
                tuxTextView.setText(spannableString);
                FMX.LJIIL("comment_rethink_sw", LIZ2.LIZ);
                C16880lQ.LJJJJI(tuxTextView2, new ACListenerS27S0400000_3(interfaceC178306zC, LIZ2, c34k, tuxSheet2, 0));
                C78897Uxp.LJJJJJL(tuxTextView2, 0.0f);
                C16880lQ.LJJJJI(tuxTextView3, new ACListenerS27S0400000_3(interfaceC178306zC, LIZ2, c34k, tuxSheet2, 1));
                C78897Uxp.LJJJJJL(tuxTextView3, 0.0f);
                return tuxSheet2;
            }
        }
        c34k = c34k2;
        textView.setText(commentRethinkPopup2.getTitle());
        tuxTextView.setText(spannableString);
        FMX.LJIIL("comment_rethink_sw", LIZ2.LIZ);
        C16880lQ.LJJJJI(tuxTextView2, new ACListenerS27S0400000_3(interfaceC178306zC, LIZ2, c34k, tuxSheet2, 0));
        C78897Uxp.LJJJJJL(tuxTextView2, 0.0f);
        C16880lQ.LJJJJI(tuxTextView3, new ACListenerS27S0400000_3(interfaceC178306zC, LIZ2, c34k, tuxSheet2, 1));
        C78897Uxp.LJJJJJL(tuxTextView3, 0.0f);
        return tuxSheet2;
    }
}
