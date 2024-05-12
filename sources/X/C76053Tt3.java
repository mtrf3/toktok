package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tt3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76053Tt3 extends RecyclerView.ViewHolder {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    public final LiveIconView L() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-iconImage>(...)");
        return (LiveIconView) value;
    }

    public C76053Tt3(View view) {
        super(view);
        this.LJLIL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 663));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS163S0100000_13(view, 665));
    }
}
