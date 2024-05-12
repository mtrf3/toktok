package X;

import java.io.OutputStream;
import java.nio.channels.Channels;

/* loaded from: classes12.dex */
public final class QEY implements QF3 {
    public final /* synthetic */ QEW LIZ;

    @Override // X.QF3
    public final void run() {
        QEZ qez = (QEZ) this.LIZ;
        if (qez.LJLL == null) {
            qez.LJLLILLLL.getClass();
            qez.LJLJLJ.setDoOutput(true);
            qez.LJLJLJ.connect();
            qez.LJLLILLLL.getClass();
            OutputStream outputStream = qez.LJLJLJ.getOutputStream();
            qez.LJLLI = outputStream;
            qez.LJLL = Channels.newChannel(outputStream);
        }
        this.LIZ.LJLIL.set(0);
        this.LIZ.LLLLZ(new C66661QEf(this));
    }

    public QEY(QEW qew) {
        this.LIZ = qew;
    }
}
