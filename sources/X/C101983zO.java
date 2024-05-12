package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.3zO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101983zO extends RecyclerView.ViewHolder {
    public final AI8 LJLIL;

    public C101983zO(AI8 ai8) {
        super(ai8);
        this.LJLIL = ai8;
        ai8.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ai8.setInset(AKC.PADDING_16);
        Context context = ai8.getContext();
        o.LJIIIIZZ(context, "tuxTextCell.context");
        ai8.setAccessory(new C25991AHz(context));
    }
}
