package X;

import Y.ARunnableS30S0200000_11;
import Y.ARunnableS47S0100000_11;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* renamed from: X.QEc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66658QEc implements QF3 {
    public final /* synthetic */ ARunnableS30S0200000_11 LIZ;

    @Override // X.QF3
    public final void run() {
        int read;
        ARunnableS30S0200000_11 aRunnableS30S0200000_11 = this.LIZ;
        ReadableByteChannel readableByteChannel = ((QET) aRunnableS30S0200000_11.l1).LJIIIIZZ;
        if (readableByteChannel == null) {
            read = -1;
        } else {
            read = readableByteChannel.read((ByteBuffer) aRunnableS30S0200000_11.l0);
        }
        QET qet = (QET) this.LIZ.l1;
        if (read == -1) {
            ReadableByteChannel readableByteChannel2 = qet.LJIIIIZZ;
            if (readableByteChannel2 != null) {
                readableByteChannel2.close();
            }
            if (!qet.LIZJ.compareAndSet(5, 7)) {
                return;
            }
            qet.getClass();
            new ARunnableS47S0100000_11(qet, 78);
            throw null;
        }
        qet.getClass();
        throw null;
    }

    public C66658QEc(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        this.LIZ = aRunnableS30S0200000_11;
    }
}
