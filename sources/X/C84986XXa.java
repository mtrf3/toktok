package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XXa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84986XXa extends RecyclerView.ViewHolder {
    public final SmartImageView LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final FrameLayout LJLJI;
    public final TuxTextView LJLJJI;

    public final void L() {
        FrameLayout frameLayout;
        Context context = this.itemView.getContext();
        if (context == null || (frameLayout = this.LJLJI) == null) {
            return;
        }
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.dd);
        frameLayout.setBackground(c110614Vt.LIZ(context));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84986XXa(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        this.LJLIL = (SmartImageView) itemView.findViewById(R.id.k16);
        this.LJLILLLLZI = (TuxTextView) itemView.findViewById(R.id.lvc);
        this.LJLJI = (FrameLayout) itemView.findViewById(R.id.df3);
        this.LJLJJI = (TuxTextView) itemView.findViewById(R.id.m8d);
    }
}
