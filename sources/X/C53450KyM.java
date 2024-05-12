package X;

import kotlin.jvm.internal.o;

/* renamed from: X.KyM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53450KyM extends AbstractC65781Prl implements InterfaceC88472Yns<C53447KyJ, Float> {
    public final /* synthetic */ float LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53450KyM(float f) {
        super(1);
        this.LJLIL = f;
    }

    @Override // X.InterfaceC88472Yns
    public final Float invoke(C53447KyJ c53447KyJ) {
        C53447KyJ avatarSizeData = c53447KyJ;
        o.LJIIIZ(avatarSizeData, "avatarSizeData");
        return Float.valueOf(this.LJLIL * avatarSizeData.LJLIL);
    }
}
