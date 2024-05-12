package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UYU extends RecyclerView.ViewHolder {
    public final InterfaceC65784Pro<AbstractC77373UYf> LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UYU(View view, InterfaceC65784Pro<? extends AbstractC77373UYf> getSelectedChooseEffect) {
        super(view);
        o.LJIIIZ(getSelectedChooseEffect, "getSelectedChooseEffect");
        this.LJLIL = getSelectedChooseEffect;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS163S0100000_13(view, 311));
        this.LJLJI = C221108m2.LIZIZ(new AqS163S0100000_13(view, 312));
    }
}
