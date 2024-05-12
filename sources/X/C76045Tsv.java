package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tsv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76045Tsv extends RecyclerView.ViewHolder {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public final LiveIconView L() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-foldIcon>(...)");
        return (LiveIconView) value;
    }

    public C76045Tsv(View view) {
        super(view);
        this.LJLIL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 728));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS163S0100000_13(view, 721));
        this.LJLJI = C221108m2.LIZIZ(new AqS163S0100000_13(view, 705));
    }
}
