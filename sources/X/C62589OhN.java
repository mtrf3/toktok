package X;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OhN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62589OhN extends PopupWindow {
    public final Activity LIZ;
    public C81303VvX LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62589OhN(ActivityC45651qj ctx, Aweme aweme, String channel, UrlModel urlModel) {
        super(ctx);
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(channel, "channel");
        this.LIZ = ctx;
        setContentView(C16880lQ.LLLZIIL(R.layout.cm1, C16880lQ.LLZIL(ctx), null));
        setBackgroundDrawable(new ColorDrawable(0));
        setWidth(KL2.LJIIJJI(ctx));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.a_l);
        TextView textView = (TextView) getContentView().findViewById(R.id.jsq);
        TextView textView2 = (TextView) getContentView().findViewById(R.id.jsp);
        if (C62417Oeb.LJ(aweme)) {
            textView.setText(ctx.getString(R.string.thn));
            textView2.setText(ctx.getResources().getString(R.string.r3i, channel));
        } else {
            textView2.setText(ctx.getResources().getString(R.string.r3h, channel));
        }
        C78765Uvh.LJFF((C62846OlW) getContentView().findViewById(R.id.jss), urlModel);
        View findViewById = getContentView().findViewById(R.id.ig1);
        o.LJIIIIZZ(findViewById, "contentView.findViewById(R.id.pull_layout)");
        C81303VvX c81303VvX = (C81303VvX) findViewById;
        this.LIZIZ = c81303VvX;
        c81303VvX.LJLJI = getContentView().findViewById(R.id.cgx);
    }
}
