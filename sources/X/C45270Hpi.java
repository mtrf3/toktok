package X;

import Y.ARunnableS43S0100000_7;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Hpi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45270Hpi extends RecyclerView.ViewHolder {
    public final C62846OlW LJLIL;
    public final View LJLILLLLZI;
    public final C8HB LJLJI;
    public final C8HB LJLJJI;
    public final View LJLJJL;
    public final View LJLJJLL;
    public final TuxIconView LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45270Hpi(View view, InterfaceC88471Ynr<? super View, ? super Integer, C76800UCe> onItemClickListener) {
        super(view);
        o.LJIIIZ(onItemClickListener, "onItemClickListener");
        C62846OlW c62846OlW = (C62846OlW) view.findViewById(R.id.l64);
        this.LJLIL = c62846OlW;
        View findViewById = view.findViewById(R.id.jmb);
        this.LJLILLLLZI = findViewById;
        if (C58B.LIZ()) {
            if (c62846OlW != null) {
                c62846OlW.setCornerRadius(C32151Nz.LJIIZILJ(6));
            }
            if (findViewById != null) {
                findViewById.setBackgroundResource(R.drawable.pw);
            }
        }
        C8HB c8hb = (C8HB) view.findViewById(R.id.l66);
        this.LJLJI = c8hb;
        if (c8hb != null) {
            c8hb.setEllipsize(null);
        }
        C8HB c8hb2 = (C8HB) view.findViewById(R.id.aa0);
        this.LJLJJI = c8hb2;
        if (c8hb2 != null) {
            c8hb2.setEllipsize(null);
        }
        this.LJLJJL = view.findViewById(R.id.d2w);
        this.LJLJJLL = view.findViewById(R.id.aa1);
        this.LJLJL = (TuxIconView) view.findViewById(R.id.b7v);
        C16880lQ.LJIIJ(new C45269Hph(this, onItemClickListener, view), view);
    }

    public final void L(String str, boolean z, boolean z2) {
        if (z) {
            C8HB c8hb = this.LJLJI;
            if (c8hb != null) {
                c8hb.post(new ARunnableS43S0100000_7(this, 22));
            }
            C8HB c8hb2 = this.LJLJJI;
            if (c8hb2 != null) {
                c8hb2.post(new ARunnableS43S0100000_7(this, 23));
            }
        } else {
            C8HB c8hb3 = this.LJLJI;
            if (c8hb3 != null) {
                c8hb3.setEllipsize(null);
            }
            View view = this.LJLJJL;
            if (view != null) {
                view.setVisibility(0);
            }
            C8HB c8hb4 = this.LJLJJI;
            if (c8hb4 != null) {
                c8hb4.setEllipsize(null);
            }
            View view2 = this.LJLJJLL;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        if (z2 && str != null && str.length() > 0) {
            C8HB c8hb5 = this.LJLJJI;
            if (c8hb5 != null) {
                c8hb5.setVisibility(0);
            }
            C8HB c8hb6 = this.LJLJJI;
            if (c8hb6 == null) {
                return;
            }
            c8hb6.setText(this.itemView.getContext().getResources().getString(R.string.dz4, str));
            return;
        }
        C8HB c8hb7 = this.LJLJJI;
        if (c8hb7 == null) {
            return;
        }
        c8hb7.setVisibility(4);
    }
}
