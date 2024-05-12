package X;

import java.io.IOException;

/* renamed from: X.Zkj, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90825Zkj implements InterfaceC90481ZfB {
    public final /* synthetic */ C90827Zkl LIZ;

    public C90825Zkj(C90827Zkl c90827Zkl) {
        this.LIZ = c90827Zkl;
    }

    @Override // X.InterfaceC90481ZfB
    public final void LIZ(long j) {
        this.LIZ.LJJII.LIZIZ(null);
    }

    @Override // X.InterfaceC90481ZfB
    public final void LIZIZ(long j, int i, Object obj) {
        if (i != 0) {
            this.LIZ.LJJII.LIZ(new IOException("storing session is timeout"));
        }
    }
}
