package X;

import com.ss.ttm.player.AudioProcessor;
import java.nio.ByteBuffer;

/* renamed from: X.IeY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47126IeY extends AudioProcessor {
    public final /* synthetic */ InterfaceC47128Iea LIZJ;

    @Override // com.ss.ttm.player.AudioProcessor
    public final void audioClose() {
        this.LIZJ.LIZ();
    }

    public C47126IeY(InterfaceC47128Iea interfaceC47128Iea) {
        this.LIZJ = interfaceC47128Iea;
    }

    @Override // com.ss.ttm.player.AudioProcessor
    public final void audioRelease(int i) {
        this.LIZJ.LIZIZ();
    }

    @Override // com.ss.ttm.player.AudioProcessor
    public final void audioProcess(ByteBuffer[] byteBufferArr, int i, long j) {
        this.LIZJ.LIZJ(byteBufferArr, i, j);
    }

    @Override // com.ss.ttm.player.AudioProcessor
    public final void audioOpen(int i, int i2, int i3, int i4) {
        this.LIZJ.LIZLLL(i, i2, i3);
    }
}
