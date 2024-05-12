package X;

import defpackage.i0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;

/* loaded from: classes12.dex */
public final class QHR implements InterfaceC66743QHj, Runnable {
    public String LJLIL;
    public volatile long LJLILLLLZI = 200;
    public final BlockingQueue<QHS> LJLJI = new LinkedBlockingQueue();

    @Override // X.InterfaceC66743QHj
    public final boolean isEnable() {
        return false;
    }

    @Override // X.InterfaceC66743QHj
    public final void putEvent(String str, JSONArray jSONArray) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Thread.interrupted();
        } catch (Throwable unused) {
        }
    }

    @Override // X.InterfaceC66743QHj
    public final void setEventVerifyUrl(String str) {
        this.LJLIL = i0.LJFF(str, "/service/2/app_log_test/");
    }
}
