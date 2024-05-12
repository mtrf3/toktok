package X;

import android.content.Context;
import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient;
import com.ss.android.agilelogger.ALog;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.o;

/* renamed from: X.QFj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66691QFj extends AbstractC66690QFi implements InterfaceC66694QFm {
    public C44378HbK LJFF;

    @Override // X.InterfaceC79523VIx
    public final String LIZJ(String str) {
        int i;
        C44378HbK c44378HbK = this.LJFF;
        if (c44378HbK != null && ((IWsClient) c44378HbK.LJLIL).isConnected()) {
            synchronized (this) {
                i = this.LIZIZ;
            }
            if (i == 1) {
                C44378HbK c44378HbK2 = this.LJFF;
                if (c44378HbK2 != null) {
                    Charset charset = StandardCharsets.UTF_8;
                    o.LJFF(charset, "StandardCharsets.UTF_8");
                    byte[] bytes = str.getBytes(charset);
                    o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
                    try {
                        ((IWsClient) c44378HbK2.LJLIL).sendMessage(bytes, 1);
                    } catch (Exception e) {
                        ALog.e("WsClientImpl", e);
                    }
                }
                return null;
            }
        }
        return "the socket is disconnected";
    }

    @Override // X.InterfaceC79523VIx
    public final String sendMessage(byte[] bArr) {
        int i;
        C44378HbK c44378HbK = this.LJFF;
        if (c44378HbK != null && ((IWsClient) c44378HbK.LJLIL).isConnected()) {
            synchronized (this) {
                i = this.LIZIZ;
            }
            if (i == 1) {
                C44378HbK c44378HbK2 = this.LJFF;
                if (c44378HbK2 != null) {
                    try {
                        ((IWsClient) c44378HbK2.LJLIL).sendMessage(bArr, 2);
                    } catch (Exception e) {
                        ALog.e("WsClientImpl", e);
                    }
                }
                return null;
            }
        }
        return "the socket is disconnected";
    }

    public C66691QFj(Context context, C46590IQg c46590IQg) {
        super(context, c46590IQg);
    }

    @Override // X.InterfaceC66694QFm
    public final void onMessage(byte[] bArr, int i) {
        String str;
        if (1 == i) {
            if (bArr != null) {
                Charset charset = StandardCharsets.UTF_8;
                o.LJFF(charset, "StandardCharsets.UTF_8");
                str = new String(bArr, charset);
            } else {
                str = "";
            }
            InterfaceC66693QFl interfaceC66693QFl = this.LIZ;
            if (interfaceC66693QFl != null) {
                interfaceC66693QFl.onMessage(str);
                return;
            }
            return;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        InterfaceC66693QFl interfaceC66693QFl2 = this.LIZ;
        if (interfaceC66693QFl2 == null) {
            return;
        }
        interfaceC66693QFl2.onMessage(bArr);
    }

    @Override // X.InterfaceC66694QFm
    public final void LIZ(int i, String url, String reason) {
        o.LJIIJ(url, "url");
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                InterfaceC66693QFl interfaceC66693QFl = this.LIZ;
                if (interfaceC66693QFl != null) {
                    interfaceC66693QFl.LIZ();
                }
                synchronized (this) {
                    this.LIZIZ = 1;
                }
                return;
            }
            if (reason == null) {
                reason = "unknown error";
            }
            InterfaceC66693QFl interfaceC66693QFl2 = this.LIZ;
            if (interfaceC66693QFl2 == null) {
                return;
            }
            interfaceC66693QFl2.LIZIZ(reason, true);
            return;
        }
        if (reason == null || reason.length() == 0) {
            InterfaceC66693QFl interfaceC66693QFl3 = this.LIZ;
            if (interfaceC66693QFl3 == null) {
                return;
            }
            interfaceC66693QFl3.onFailed("unknown error");
            return;
        }
        o.LJIIJ(reason, "reason");
        InterfaceC66693QFl interfaceC66693QFl4 = this.LIZ;
        if (interfaceC66693QFl4 == null) {
            return;
        }
        interfaceC66693QFl4.onFailed(reason);
    }
}
