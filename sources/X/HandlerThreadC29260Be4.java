package X;

import android.os.HandlerThread;

/* renamed from: X.Be4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class HandlerThreadC29260Be4 extends HandlerThread {
    public volatile boolean LJLIL;

    @Override // java.lang.Thread
    public final synchronized void start() {
        if (this.LJLIL) {
            return;
        }
        this.LJLIL = true;
        super.start();
    }

    public HandlerThreadC29260Be4() {
        super("ParseThread", 0);
    }
}
