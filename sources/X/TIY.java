package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.gamora.editor.filter.indicator.EditFilterIndicatorState;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TIY extends AbstractC65781Prl implements InterfaceC88472Yns<EditFilterIndicatorState, EditFilterIndicatorState> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ FilterBean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TIY(boolean z, FilterBean filterBean, boolean z2) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = filterBean;
        this.LJLJI = z2;
    }

    @Override // X.InterfaceC88472Yns
    public final EditFilterIndicatorState invoke(EditFilterIndicatorState editFilterIndicatorState) {
        EditFilterIndicatorState receiver = editFilterIndicatorState;
        o.LJIIIZ(receiver, "$receiver");
        return EditFilterIndicatorState.copy$default(receiver, this.LJLIL, this.LJLJI, this.LJLILLLLZI, null, 8, null);
    }
}
