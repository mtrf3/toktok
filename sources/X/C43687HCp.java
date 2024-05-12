package X;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.discover.model.FormattedText;
import com.zhiliaoapp.musically.R;
import ujb.s;

/* renamed from: X.HCp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43687HCp {
    public static final java.util.Set<Integer> LJIIIZ = C77275UUl.LJIIIIZZ(1, 2);
    public final View LIZ;
    public final TextView LIZIZ;
    public final TextView LIZJ;
    public final TextView LIZLLL;
    public final TextView LJ;
    public final FrameLayout LJFF;
    public final FrameLayout LJI;
    public final SY4 LJII;
    public boolean LJIIIIZZ;

    public C43687HCp(View view) {
        this.LIZ = view;
        this.LIZIZ = (TextView) view.findViewById(R.id.gk9);
        this.LIZJ = (TextView) view.findViewById(R.id.c8l);
        this.LIZLLL = (TextView) view.findViewById(R.id.hig);
        this.LJ = (TextView) view.findViewById(R.id.iaj);
        this.LJFF = (FrameLayout) view.findViewById(R.id.iac);
        this.LJI = (FrameLayout) view.findViewById(R.id.iad);
        this.LJII = (SY4) view.findViewById(R.id.fcv);
    }

    public static void LIZ(TextView textView, FormattedText formattedText) {
        int LJJLIIIJL;
        if (formattedText != null) {
            if (Build.VERSION.SDK_INT < 28) {
                textView.setText(formattedText.getText());
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formattedText.getText());
            String bold = formattedText.getBold();
            if (bold != null && (LJJLIIIJL = s.LJJLIIIJL(formattedText.getText(), bold, 0, false, 6)) != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(-16777216), LJJLIIIJL, bold.length() + LJJLIIIJL, 18);
            }
            textView.setText(spannableStringBuilder);
        }
    }
}
