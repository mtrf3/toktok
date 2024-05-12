package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6mb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170496mb extends RecyclerView.ViewHolder {
    public final TextView LJLIL;

    public C170496mb() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C170496mb(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.m8i);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tv_hint)");
        this.LJLIL = (TextView) findViewById;
    }
}
