package X;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OVR extends F9E {
    public final View LJLIL;
    public final List<InterfaceC62480Ofc> LJLILLLLZI;
    public final OSJ<View, View, View> LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OVR(View view, List<? extends InterfaceC62480Ofc> list, OSJ<? extends View, ? extends View, ? extends View> panelWidgetSlots) {
        o.LJIIIZ(panelWidgetSlots, "panelWidgetSlots");
        this.LJLIL = view;
        this.LJLILLLLZI = list;
        this.LJLJI = panelWidgetSlots;
    }
}
