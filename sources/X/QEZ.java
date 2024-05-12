package X;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class QEZ extends QEW {
    public final HttpURLConnection LJLJLJ;
    public final AtomicBoolean LJLJLLL;
    public WritableByteChannel LJLL;
    public OutputStream LJLLI;
    public final /* synthetic */ QET LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QEZ(QET qet, Executor executor, NC5 nc5, HttpURLConnection httpURLConnection, C66663QEh c66663QEh) {
        super(executor, nc5, c66663QEh);
        this.LJLLILLLL = qet;
        this.LJLJLLL = new AtomicBoolean(false);
        this.LJLJLJ = httpURLConnection;
    }
}
