package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.KTk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51768KTk extends RecyclerView.ViewHolder {
    public final TuxTextView LJLIL;

    public C51768KTk(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.mc_);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tv_normal_choice)");
        this.LJLIL = (TuxTextView) findViewById;
    }
}