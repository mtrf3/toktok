package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("edge_slide_guide_popup")
/* loaded from: classes10.dex */
public final class LZN extends AbstractC55363Lo7 {
    public final Context LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final LZQ LJLJI;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 5000;
    }

    @Override // X.M74
    public final boolean canShow() {
        return this.LJLJI.LJJLIIJ();
    }

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        return C54081LKj.LIZ(this.LJLIL, this.LJLILLLLZI);
    }

    @Override // X.M74
    public final void onConflict() {
        super.onConflict();
        this.LJLJI.LIZ();
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        this.LJLJI.LIZIZ(wrapper);
    }

    public LZN(Context context, LifecycleOwner lifecycleOwner, LZM lzm) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = context;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = lzm;
    }
}
