package X;

import com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeState;
import kotlin.jvm.internal.o;

/* renamed from: X.Vzs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81572Vzs extends AbstractC65781Prl implements InterfaceC88472Yns<DuetLayoutModeState, DuetLayoutModeState> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81572Vzs(int i, int i2, int i3) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
    }

    @Override // X.InterfaceC88472Yns
    public final DuetLayoutModeState invoke(DuetLayoutModeState duetLayoutModeState) {
        DuetLayoutModeState setState = duetLayoutModeState;
        o.LJIIIZ(setState, "$this$setState");
        return DuetLayoutModeState.copy$default(setState, this.LJLIL, 0, this.LJLILLLLZI, this.LJLJI, null, null, null, 114, null);
    }
}
