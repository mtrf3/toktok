package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3dG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88263dG extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final TextView LJLILLLLZI;

    public C88263dG(View view) {
        super(view);
        this.LJLIL = view;
        View findViewById = view.findViewById(R.id.jc0);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.scopeName)");
        this.LJLILLLLZI = (TextView) findViewById;
    }
}
