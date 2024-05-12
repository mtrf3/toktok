package X;

import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerState;
import kotlin.jvm.internal.o;

/* renamed from: X.5vQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150485vQ extends AbstractC65781Prl implements InterfaceC88472Yns<FTCEditStickerState, FTCEditStickerState> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C150485vQ(int i, boolean z) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC88472Yns
    public final FTCEditStickerState invoke(FTCEditStickerState fTCEditStickerState) {
        FTCEditStickerState setStateImmediate = fTCEditStickerState;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return FTCEditStickerState.copy$default(setStateImmediate, null, null, null, null, null, null, null, new C150575vZ(new OSZ(Integer.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI))), 127, null);
    }
}
