package X;

import com.ss.android.ugc.gamora.editor.filter.core.EditFilterState;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WPS extends AbstractC65781Prl implements InterfaceC88472Yns<EditFilterState, EditFilterState> {
    public static final WPS LJLIL = new WPS();

    public WPS() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final EditFilterState invoke(EditFilterState editFilterState) {
        EditFilterState receiver = editFilterState;
        o.LJIIIZ(receiver, "$receiver");
        return EditFilterState.copy$default(receiver, null, null, null, null, new C81668W3k(), 15, null);
    }
}
