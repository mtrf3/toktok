package X;

import java.nio.ByteBuffer;

/* renamed from: X.PSy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64496PSy extends AbstractC66664QEi {
    public final /* synthetic */ C64495PSx LJLIL;

    @Override // X.AbstractC66664QEi
    public final long LIZ() {
        int position;
        C64495PSx c64495PSx = this.LJLIL;
        int i = c64495PSx.LJLJJI;
        if (i == -1) {
            boolean z = c64495PSx.LJLJL;
            ByteBuffer byteBuffer = c64495PSx.LJLJJLL;
            if (z) {
                position = byteBuffer.limit();
            } else {
                position = byteBuffer.position();
            }
            return position;
        }
        return i;
    }

    public C64496PSy(C64495PSx c64495PSx) {
        this.LJLIL = c64495PSx;
    }

    @Override // X.AbstractC66664QEi
    public final void LIZJ(QXX qxx) {
        this.LJLIL.LJLJJLL.position(0);
        qxx.LLLIZZ();
    }

    @Override // X.AbstractC66664QEi
    public final void LIZIZ(QXX qxx, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining < this.LJLIL.LJLJJLL.remaining()) {
            byteBuffer.put(this.LJLIL.LJLJJLL.array(), this.LJLIL.LJLJJLL.position(), remaining);
            ByteBuffer byteBuffer2 = this.LJLIL.LJLJJLL;
            byteBuffer2.position(byteBuffer2.position() + remaining);
        } else {
            byteBuffer.put(this.LJLIL.LJLJJLL);
        }
        qxx.LLLIL(false);
    }
}
