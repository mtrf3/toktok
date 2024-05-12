package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JUW extends JNU {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final TextView LJLJL;
    public final View LJLJLJ;

    @Override // X.JNU
    public final View getView() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JUW(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        this.LJLJLJ = itemView.findViewById(R.id.e3c);
        TextView textView = (TextView) itemView.findViewById(R.id.jgm);
        this.LJLJL = textView;
        C49098JOs.LIZ.getClass();
        Integer valueOf = Integer.valueOf(C49098JOs.LJFF());
        if (valueOf.intValue() > 0) {
            int intValue = valueOf.intValue();
            if (textView != null) {
                C54840Lfg.LJLIIL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(intValue))), textView);
            }
        }
        View findViewById = itemView.findViewById(R.id.jgp);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View findViewById2 = itemView.findViewById(R.id.f_6);
        if (findViewById2 == null) {
            return;
        }
        findViewById2.setVisibility(8);
    }

    public final void P(C35670DzG c35670DzG) {
        int i;
        View view = this.LJLJLJ;
        if (view != null) {
            if (getBindingAdapterPosition() == 0) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
        }
        if (C78685UuP.LJJJZ(c35670DzG.LIZIZ)) {
            TextView textView = this.LJLJL;
            if (textView != null) {
                textView.setText(c35670DzG.LIZIZ);
            }
            TextView textView2 = this.LJLJL;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = C7MY.LIZIZ(4);
                return;
            }
            return;
        }
        TextView textView3 = this.LJLJL;
        if (textView3 != null) {
            textView3.setText((CharSequence) null);
        }
        TextView textView4 = this.LJLJL;
        if (textView4 == null) {
            return;
        }
        textView4.setVisibility(8);
    }
}
