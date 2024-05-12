package X;

import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS29S0210000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I9r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46159I9r implements IA3 {
    public final IA7 LIZIZ;

    public C46159I9r(IA7 ia7) {
        this.LIZIZ = ia7;
    }

    @Override // X.IA3
    public final void LIZ(InterfaceC83624Wrs stopRecordAsyncWrapped, AqS29S0210000_7 aqS29S0210000_7) {
        o.LJIIIZ(stopRecordAsyncWrapped, "$this$stopRecordAsyncWrapped");
        this.LIZIZ.LIZ();
        stopRecordAsyncWrapped.LLZLI(new AqS138S0200000_7(this, aqS29S0210000_7, 25));
    }
}
