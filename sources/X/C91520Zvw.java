package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Zvw, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91520Zvw extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC91289ZsD, C76800UCe> {
    public final /* synthetic */ long LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91520Zvw(long j) {
        super(1);
        this.LJLIL = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC91289ZsD interfaceC91289ZsD) {
        InterfaceC91289ZsD it = interfaceC91289ZsD;
        o.LJIIIZ(it, "it");
        it.onPlaybackTimeChanged(this.LJLIL);
        return C76800UCe.LIZ;
    }
}
