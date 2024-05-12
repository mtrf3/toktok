package X;

import com.ss.ttm.player.VoiceTrait;

/* renamed from: X.Ieq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47144Ieq extends VoiceTrait {
    public final /* synthetic */ InterfaceC47143Iep LIZIZ;

    @Override // com.ss.ttm.player.VoiceTrait
    public final void audioClose() {
        this.LIZIZ.LIZ();
    }

    @Override // com.ss.ttm.player.VoiceTrait
    public final void audioFlush() {
        this.LIZIZ.LJ();
    }

    @Override // com.ss.ttm.player.VoiceTrait
    public final void audioPause() {
        this.LIZIZ.LIZLLL();
    }

    @Override // com.ss.ttm.player.VoiceTrait
    public final void audioResume() {
        this.LIZIZ.LIZJ();
    }

    @Override // com.ss.ttm.player.VoiceTrait
    public final int getLatency() {
        return this.LIZIZ.LIZIZ();
    }

    public C47144Ieq(InterfaceC47143Iep interfaceC47143Iep) {
        this.LIZIZ = interfaceC47143Iep;
    }

    @Override // com.ss.ttm.player.VoiceTrait
    public final int audioOpen(C47146Ies c47146Ies) {
        throw null;
    }

    @Override // com.ss.ttm.player.VoiceTrait
    public final int audioWrite(C47145Ier c47145Ier) {
        throw null;
    }
}
