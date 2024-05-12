package X;

import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarState;
import kotlin.jvm.internal.o;

/* renamed from: X.62Y, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C62Y extends AbstractC65781Prl implements InterfaceC88472Yns<EditToolbarState, EditToolbarState> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62Y(int i, String str) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC88472Yns
    public final EditToolbarState invoke(EditToolbarState editToolbarState) {
        EditToolbarState setState = editToolbarState;
        o.LJIIIZ(setState, "$this$setState");
        return EditToolbarState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, new C150575vZ(new OSZ(Integer.valueOf(this.LJLIL), this.LJLILLLLZI)), null, null, null, false, 253951, null);
    }
}
