package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.AqS164S0100000_14;

/* renamed from: X.WnD, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC83335WnD extends RecyclerView.ViewHolder {
    public final C62822Ol8 LJLIL;

    public abstract void L(AbstractC83369Wnl abstractC83369Wnl);

    public final TuxTextView M() {
        return (TuxTextView) this.LJLIL.getValue();
    }

    public AbstractC83335WnD(View view) {
        super(view);
        this.LJLIL = C221108m2.LIZIZ(new AqS164S0100000_14(view, 426));
    }
}
