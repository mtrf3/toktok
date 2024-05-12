package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.Cd5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31747Cd5 extends RecyclerView.ViewHolder {
    public final View LJLIL;

    public C31747Cd5(View view) {
        super(view);
        this.LJLIL = view;
    }

    public final void L(String str) {
        if (str != null && str.length() > 0) {
            TextView textView = (TextView) this.LJLIL.findViewById(R.id.d2f);
            String LLLZ = C16880lQ.LLLZ(" (%s)", Arrays.copyOf(new Object[]{str}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            textView.setText(LLLZ);
            return;
        }
        ((TextView) this.LJLIL.findViewById(R.id.d2f)).setText((CharSequence) null);
    }
}
