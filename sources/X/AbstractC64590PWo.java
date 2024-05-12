package X;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Request;

/* renamed from: X.PWo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC64590PWo {
    public static final AbstractC64590PWo NONE = new PXE();

    public void callEnd(InterfaceC48133Iun interfaceC48133Iun) {
    }

    public void callFailed(InterfaceC48133Iun interfaceC48133Iun, IOException iOException) {
    }

    public void callStart(InterfaceC48133Iun interfaceC48133Iun) {
    }

    public void connectEnd(InterfaceC48133Iun interfaceC48133Iun, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC64572PVw enumC64572PVw) {
    }

    public void connectFailed(InterfaceC48133Iun interfaceC48133Iun, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC64572PVw enumC64572PVw, IOException iOException) {
    }

    public void connectStart(InterfaceC48133Iun interfaceC48133Iun, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    public void connectionAcquired(InterfaceC48133Iun interfaceC48133Iun, InterfaceC64569PVt interfaceC64569PVt) {
    }

    public void connectionReleased(InterfaceC48133Iun interfaceC48133Iun, InterfaceC64569PVt interfaceC64569PVt) {
    }

    public void dnsEnd(InterfaceC48133Iun interfaceC48133Iun, String str, List<InetAddress> list) {
    }

    public void dnsEnd(InterfaceC48133Iun interfaceC48133Iun, String str, List<InetAddress> list, String str2) {
    }

    public void dnsStart(InterfaceC48133Iun interfaceC48133Iun, String str) {
    }

    public void requestBodyEnd(InterfaceC48133Iun interfaceC48133Iun, long j) {
    }

    public void requestBodyStart(InterfaceC48133Iun interfaceC48133Iun) {
    }

    public void requestHeadersEnd(InterfaceC48133Iun interfaceC48133Iun, Request request) {
    }

    public void requestHeadersStart(InterfaceC48133Iun interfaceC48133Iun) {
    }

    public void responseBodyEnd(InterfaceC48133Iun interfaceC48133Iun, long j) {
    }

    public void responseBodyStart(InterfaceC48133Iun interfaceC48133Iun) {
    }

    public void responseHeadersEnd(InterfaceC48133Iun interfaceC48133Iun, C64598PWw c64598PWw) {
    }

    public void responseHeadersStart(InterfaceC48133Iun interfaceC48133Iun) {
    }

    public void secureConnectEnd(InterfaceC48133Iun interfaceC48133Iun, PNS pns) {
    }

    public void secureConnectStart(InterfaceC48133Iun interfaceC48133Iun) {
    }

    public static PXC factory(AbstractC64590PWo abstractC64590PWo) {
        return new PX9(abstractC64590PWo);
    }
}
