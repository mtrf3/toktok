package X;

import Y.ARunnableS3S1101000_11;
import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.os.Handler;
import android.os.HandlerThread;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.Pu3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65923Pu3 extends PthreadThread {
    public static final /* synthetic */ int LJLJJL = 0;
    public final String LJLIL;
    public C65952PuW LJLILLLLZI;
    public HandlerThread LJLJI;
    public Handler LJLJJI;

    static {
        C16880lQ.LJLLJ(C65923Pu3.class);
    }

    public C65923Pu3() {
        super("DnsMonitorThread");
        HandlerThread handlerThread = new HandlerThread("skynetDH");
        this.LJLJI = handlerThread;
        handlerThread.start();
        this.LJLJJI = new Handler(this.LJLJI.getLooper());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            String str = this.LJLIL;
            int i = 0;
            do {
                try {
                    LocalServerSocket localServerSocket = new LocalServerSocket(str);
                    while (true) {
                        try {
                            LocalSocket accept = localServerSocket.accept();
                            if (accept != null) {
                                try {
                                    LIZLLL(accept);
                                } catch (Exception unused) {
                                } catch (Throwable th) {
                                    try {
                                        accept.close();
                                    } catch (IOException unused2) {
                                    }
                                    throw th;
                                }
                                accept.close();
                            }
                        } catch (IOException unused3) {
                        }
                    }
                } catch (IOException unused4) {
                    i++;
                }
            } while (i < 3);
        } finally {
            if (LIZ) {
            }
        }
    }

    public C65923Pu3(int i) {
        super("DnsMonitorThread");
        this.LJLIL = "skynetDM";
        HandlerThread handlerThread = new HandlerThread("skynetDH");
        this.LJLJI = handlerThread;
        handlerThread.start();
        this.LJLJJI = new Handler(this.LJLJI.getLooper());
    }

    public final void LIZLLL(LocalSocket localSocket) {
        byte[] bArr = new byte[8];
        InputStream inputStream = localSocket.getInputStream();
        if (inputStream.read(bArr) <= 0) {
            return;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        int i = wrap.getInt();
        int i2 = wrap.getInt();
        if (i2 <= 0) {
            return;
        }
        byte[] bArr2 = new byte[i2];
        inputStream.read(bArr2);
        this.LJLJJI.post(new ARunnableS3S1101000_11(i, this, new String(bArr2), 1));
    }
}
