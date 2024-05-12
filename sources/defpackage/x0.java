package defpackage;

import X.C15380j0;
import X.C17I;
import X.C41051jJ;
import X.CCJ;
import X.X1D;
import Y.IDCSpanS5S0200000_13;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ImageSpan;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class x0<T> implements Observer {
    public final /* synthetic */ TextView LJLIL;
    public final /* synthetic */ z0 LJLILLLLZI;
    public final /* synthetic */ TextView LJLJI;
    public final /* synthetic */ C41051jJ LJLJJI;
    public final /* synthetic */ c1 LJLJJL;

    public x0(TextView textView, z0 z0Var, TextView textView2, C41051jJ c41051jJ, c1 c1Var) {
        this.LJLIL = textView;
        this.LJLILLLLZI = z0Var;
        this.LJLJI = textView2;
        this.LJLJJI = c41051jJ;
        this.LJLJJL = c1Var;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        t0 t0Var = (t0) obj;
        this.LJLIL.setText(t0Var.LIZJ);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(t0Var.LIZLLL);
        LIZ.append(' ');
        String LIZIZ = X1D.LIZIZ(LIZ);
        spannableStringBuilder.append((CharSequence) LIZIZ);
        if (this.LJLILLLLZI.LJLJJI != null) {
            IDCSpanS5S0200000_13 iDCSpanS5S0200000_13 = new IDCSpanS5S0200000_13(this.LJLJJL, this.LJLILLLLZI, 2);
            spannableStringBuilder.append((CharSequence) "{voucherdetail}");
            C17I c17i = new C17I();
            c17i.LIZ(new ImageSpan(this.LJLILLLLZI.LJLJJI));
            c17i.LIZ(iDCSpanS5S0200000_13);
            c17i.LIZIZ = LIZIZ.length();
            c17i.LIZJ = LIZIZ.length() + 15;
            c17i.LIZIZ(spannableStringBuilder);
        }
        boolean z = false;
        if (t0Var.LIZIZ) {
            this.LJLIL.setTextColor(C15380j0.LIZIZ(R.color.cn));
            this.LJLJI.setTextColor(C15380j0.LIZIZ(R.color.cn));
            TextView title = this.LJLIL;
            o.LJIIIIZZ(title, "title");
            Drawable drawable = this.LJLILLLLZI.LJLJI;
            if (CCJ.LIZ(title.getContext())) {
                title.setCompoundDrawables(null, null, drawable, null);
            } else {
                title.setCompoundDrawables(drawable, null, null, null);
            }
            this.LJLJJI.setEnabled(false);
        } else {
            this.LJLIL.setTextColor(C15380j0.LIZIZ(R.color.ck));
            this.LJLJI.setTextColor(C15380j0.LIZIZ(R.color.cu));
            TextView title2 = this.LJLIL;
            o.LJIIIIZZ(title2, "title");
            Drawable drawable2 = this.LJLILLLLZI.LJLILLLLZI;
            if (CCJ.LIZ(title2.getContext())) {
                title2.setCompoundDrawables(null, null, drawable2, null);
            } else {
                title2.setCompoundDrawables(drawable2, null, null, null);
            }
            this.LJLJJI.setEnabled(true);
        }
        this.LJLJI.setMovementMethod(LinkMovementMethod.getInstance());
        this.LJLJI.setText(spannableStringBuilder);
        C41051jJ c41051jJ = this.LJLJJI;
        if (t0Var.LIZ && !t0Var.LIZIZ) {
            z = true;
        }
        c41051jJ.setChecked(z);
    }
}
