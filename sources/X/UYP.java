package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UYP extends RecyclerView.ViewHolder {
    public final InterfaceC88471Ynr<Integer, Float, C76800UCe> LJLIL;
    public final InterfaceC65784Pro<Boolean> LJLILLLLZI;
    public final InterfaceC65784Pro<Boolean> LJLJI;
    public final C62822Ol8 LJLJJI;
    public final /* synthetic */ UYQ LJLJJL;

    public final W5G L() {
        return (W5G) this.LJLJJI.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UYP(UYQ uyq, View view, InterfaceC88471Ynr<? super Integer, ? super Float, C76800UCe> showLoadMoreIcon, InterfaceC65784Pro<Boolean> onStickerViewShow, InterfaceC65784Pro<Boolean> optimizeForbidIcon) {
        super(view);
        o.LJIIIZ(showLoadMoreIcon, "showLoadMoreIcon");
        o.LJIIIZ(onStickerViewShow, "onStickerViewShow");
        o.LJIIIZ(optimizeForbidIcon, "optimizeForbidIcon");
        this.LJLJJL = uyq;
        this.LJLIL = showLoadMoreIcon;
        this.LJLILLLLZI = onStickerViewShow;
        this.LJLJI = optimizeForbidIcon;
        this.LJLJJI = C221108m2.LIZIZ(new AqS163S0100000_13(view, 370));
    }
}
