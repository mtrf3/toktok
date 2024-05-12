package X;

import Y.ACListenerS35S0100000_15;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Xrf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86159Xrf {
    public final Activity LIZ;
    public AbstractC86162Xri LIZIZ;
    public AbstractC86162Xri LIZJ;
    public AbstractC86162Xri LIZLLL;
    public SY4 LJ;
    public AqS165S0100000_15 LJFF;
    public AqS165S0100000_15 LJI;
    public AqS165S0100000_15 LJII;

    public final SY4 LIZIZ() {
        SY4 sy4 = this.LJ;
        if (sy4 != null) {
            return sy4;
        }
        o.LJIJI("continueButton");
        throw null;
    }

    public C86159Xrf(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        SY4 sy4 = (SY4) activity.findViewById(R.id.avq);
        o.LJIIIZ(sy4, "<set-?>");
        this.LJ = sy4;
        C16880lQ.LJJIZ(LIZIZ(), new ACListenerS35S0100000_15(this, 206));
        LIZ(activity, (TuxTextView) activity.findViewById(R.id.mn3), R.string.dua, R.string.dtv, new ACListenerS35S0100000_15(this, 207));
        LIZ(activity, (TuxTextView) activity.findViewById(R.id.met), R.string.du_, R.string.dtu, new ACListenerS35S0100000_15(this, 208));
        activity.findViewById(R.id.fmt).setVisibility(0);
        C02Y c02y = (C02Y) activity.findViewById(R.id.b7a);
        c02y.setVisibility(0);
        this.LIZIZ = new C86161Xrh(c02y);
        activity.findViewById(R.id.fkh).setVisibility(0);
        C02Y c02y2 = (C02Y) activity.findViewById(R.id.b79);
        c02y2.setVisibility(0);
        this.LIZJ = new C86161Xrh(c02y2);
        this.LIZLLL = new C86160Xrg(this);
    }

    public static void LIZ(Context context, TuxTextView tuxTextView, int i, int i2, View.OnClickListener onClickListener) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(i2));
        String string = context.getString(i);
        o.LJIIIIZZ(string, "context.getString(clickStrId)");
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.gu, context);
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        o.LJIIIIZZ(spannableStringBuilder2, "builder.toString()");
        int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder2, string, 0, false, 6);
        try {
            spannableStringBuilder.setSpan(new C251949ug(LJIIIIZZ, onClickListener), LJJLIIIJL, string.length() + LJJLIIIJL, 34);
            tuxTextView.setHighlightColor(C04330Ez.LIZIZ(context, R.color.cz));
            tuxTextView.setText(spannableStringBuilder);
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        } catch (IndexOutOfBoundsException unused) {
        }
    }
}
