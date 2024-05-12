package X;

import Y.ACListenerS36S0300000_10;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.OlF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62829OlF extends C62828OlE {
    public static RelativeLayout.LayoutParams LJIIJJI(TuxTextView view) {
        o.LJIIIZ(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        return (RelativeLayout.LayoutParams) layoutParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62829OlF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        View findViewById = findViewById(R.id.j7c);
        o.LJIIIIZZ(findViewById, "findViewById(com.ss.andr…ot_download_progress_bar)");
        setDownloadProgressViewRoot((RelativeLayout) findViewById);
        View findViewById2 = findViewById(R.id.cg1);
        o.LJIIIIZZ(findViewById2, "findViewById(com.ss.andr…feed.R.id.download_retry)");
        setDownloadVideoRetryView((TuxTextView) findViewById2);
        getDownloadProgressViewRoot().setBackgroundResource(R.drawable.any);
        getDownloadSuccessTextView().setTuxFont(41);
        getDownloadFailedTextView().setTuxFont(41);
        getDownloadVideoCancelView().setTuxFont(42);
        getDownloadVideoRetryView().setTuxFont(42);
        RelativeLayout.LayoutParams LJIIJJI = LJIIJJI(getDownloadProgressView());
        LJIIJJI.setMargins(((ViewGroup.MarginLayoutParams) LJIIJJI).leftMargin, O6R.LJJIIZ(C32151Nz.LJIIZILJ(15)), ((ViewGroup.MarginLayoutParams) LJIIJJI).rightMargin, O6R.LJJIIZ(C32151Nz.LJIIZILJ(15)));
        RelativeLayout.LayoutParams LJIIJJI2 = LJIIJJI(getDownloadingStatusTextView());
        LJIIJJI2.setMargins(((ViewGroup.MarginLayoutParams) LJIIJJI2).leftMargin, O6R.LJJIIZ(C32151Nz.LJIIZILJ(15)), ((ViewGroup.MarginLayoutParams) LJIIJJI2).rightMargin, O6R.LJJIIZ(C32151Nz.LJIIZILJ(15)));
        RelativeLayout.LayoutParams LJIIJJI3 = LJIIJJI(getDownloadVideoCancelView());
        LJIIJJI3.setMargins(((ViewGroup.MarginLayoutParams) LJIIJJI3).leftMargin, O6R.LJJIIZ(C32151Nz.LJIIZILJ(15)), ((ViewGroup.MarginLayoutParams) LJIIJJI3).rightMargin, O6R.LJJIIZ(C32151Nz.LJIIZILJ(15)));
        RelativeLayout.LayoutParams LJIIJJI4 = LJIIJJI(getDownloadVideoRetryView());
        LJIIJJI4.setMargins(((ViewGroup.MarginLayoutParams) LJIIJJI4).leftMargin, O6R.LJJIIZ(C32151Nz.LJIIZILJ(15)), ((ViewGroup.MarginLayoutParams) LJIIJJI4).rightMargin, O6R.LJJIIZ(C32151Nz.LJIIZILJ(15)));
        RelativeLayout.LayoutParams LJIIJJI5 = LJIIJJI(getDownloadSuccessTextView());
        LJIIJJI5.setMargins(((ViewGroup.MarginLayoutParams) LJIIJJI5).leftMargin, O6R.LJJIIZ(C32151Nz.LJIIZILJ(15)), ((ViewGroup.MarginLayoutParams) LJIIJJI5).rightMargin, O6R.LJJIIZ(C32151Nz.LJIIZILJ(15)));
        RelativeLayout.LayoutParams LJIIJJI6 = LJIIJJI(getDownloadFailedTextView());
        LJIIJJI6.setMargins(((ViewGroup.MarginLayoutParams) LJIIJJI6).leftMargin, O6R.LJJIIZ(C32151Nz.LJIIZILJ(15)), ((ViewGroup.MarginLayoutParams) LJIIJJI6).rightMargin, O6R.LJJIIZ(C32151Nz.LJIIZILJ(15)));
    }

    @Override // X.C62828OlE
    public final void LJIIIIZZ(int i, Integer num, EnumC62412cf type) {
        o.LJIIIZ(type, "type");
        super.LJIIIIZZ(i, num, EnumC62412cf.TYPE_PROFILE_PAGE);
    }

    @Override // X.C62828OlE
    public final void LIZ(boolean z, C45382HrW c45382HrW, Handler handler, EnumC62412cf type) {
        String string;
        o.LJIIIZ(type, "type");
        super.LIZ(z, c45382HrW, handler, type);
        getDownloadFailedTextView().setVisibility(0);
        getDownloadVideoCancelView().setVisibility(8);
        getDownloadVideoRetryView().setVisibility(0);
        getDownloadVideoRetryView().setText(getContext().getString(R.string.gdz));
        TuxTextView downloadVideoRetryView = getDownloadVideoRetryView();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        downloadVideoRetryView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, context));
        C16880lQ.LJJJJI(getDownloadVideoRetryView(), new ACListenerS36S0300000_10(this, handler, c45382HrW, 0));
        TuxTextView downloadFailedTextView = getDownloadFailedTextView();
        if (z) {
            string = getContext().getString(R.string.tr5);
        } else {
            string = getContext().getString(R.string.gdy);
        }
        downloadFailedTextView.setText(string);
    }

    @Override // X.C62828OlE
    public final void LIZJ(boolean z, int i, C45382HrW c45382HrW, EnumC62412cf type) {
        o.LJIIIZ(type, "type");
        super.LIZJ(z, i, c45382HrW, type);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_tick_fill;
        c2068389v.LJ = Integer.valueOf(R.attr.e8);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        getDownloadSuccessImageView().setImageDrawable(c2068389v.LIZ(context));
    }
}
