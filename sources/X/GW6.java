package X;

import Y.ACListenerS27S0100000_7;
import Y.IDCSpanS32S0100000_7;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GW6 implements GWH {
    public final ActivityC45651qj LJLIL;
    public final AwemeDraft LJLILLLLZI;
    public final GVB LJLJI;
    public final View LJLJJI;
    public ImageView LJLJJL;
    public ImageView LJLJJLL;

    @Override // X.GWH
    public final void setText(String str) {
    }

    @Override // X.GWH
    public final void onShow() {
        AwemeDraft awemeDraft = this.LJLILLLLZI;
        GW7 gw7 = new GW7(this);
        o.LJIIIZ(awemeDraft, "<this>");
        C41802Gas.LJIIIIZZ(awemeDraft, null, gw7);
        FMX.LJIIL("tns_ags_float_post_ban", new C145995oB().LIZ);
    }

    @Override // X.GWH
    public final void LIZ(boolean z, boolean z2) {
        if (this.LJLJI.isShowing()) {
            C268713r.LIZ();
            C41958GdO.LJIILJJIL(this.LJLILLLLZI.LIZJ());
            C41732GZk.LIZ();
            H78.LJI("Publish | remove recover path by dismiss panel");
        }
    }

    public GW6(ActivityC45651qj mFragmentActivity, AwemeDraft mDraft, GVB host, View view) {
        o.LJIIIZ(mFragmentActivity, "mFragmentActivity");
        o.LJIIIZ(mDraft, "mDraft");
        o.LJIIIZ(host, "host");
        this.LJLIL = mFragmentActivity;
        this.LJLILLLLZI = mDraft;
        this.LJLJI = host;
        this.LJLJJI = view;
        View findViewById = view.findViewById(R.id.f12);
        o.LJII(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.LJLJJL = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.f0h);
        o.LJII(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        this.LJLJJLL = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.mo5);
        o.LJII(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(mFragmentActivity.getString(R.string.p60));
        LIZ.append(' ');
        String LIZIZ = X1D.LIZIZ(LIZ);
        String string = mFragmentActivity.getString(R.string.tqv);
        o.LJIIIIZZ(string, "mFragmentActivity.getString(R.string.view_details)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i0.LJFF(LIZIZ, string));
        spannableStringBuilder.setSpan(new IDCSpanS32S0100000_7(this, 1), LIZIZ.length(), spannableStringBuilder.length(), 18);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(mFragmentActivity.getResources().getColor(R.color.c7)), LIZIZ.length(), spannableStringBuilder.length(), 18);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(new LinkMovementMethod());
        ImageView imageView = this.LJLJJLL;
        o.LJI(imageView);
        C16880lQ.LJIILLIIL(imageView, new ACListenerS27S0100000_7(this, 58));
    }
}
