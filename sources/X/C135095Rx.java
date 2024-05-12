package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5Rx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135095Rx {
    public final Toast LIZ;

    public C135095Rx(Context context, int i, String content) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(content, "content");
        Toast toast = new Toast(context);
        this.LIZ = toast;
        Object LLILL = C16880lQ.LLILL(context, "layout_inflater");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.LayoutInflater");
        View view = C16880lQ.LLLZIIL(R.layout.cl5, (LayoutInflater) LLILL, null);
        o.LJIIIIZZ(view, "view");
        ((TextView) view.findViewById(R.id.ghd)).setText(content);
        toast.setView(view);
        toast.setGravity(55, 0, 0);
        toast.setDuration(i);
    }
}
