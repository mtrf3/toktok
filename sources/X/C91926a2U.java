package X;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import kotlin.jvm.internal.IDqS2S0010000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a2U, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91926a2U {
    public static String LIZ() {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        o.LJIIIIZZ(networkInterfaces, "getNetworkInterfaces()");
        while (networkInterfaces.hasMoreElements()) {
            Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
            o.LJIIIIZZ(inetAddresses, "intf.inetAddresses");
            while (inetAddresses.hasMoreElements()) {
                InetAddress nextElement = inetAddresses.nextElement();
                if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                    return ((Inet4Address) nextElement).getHostAddress();
                }
            }
        }
        return null;
    }

    public static String LIZIZ() {
        ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
        o.LJIIIIZZ(list, "list(NetworkInterface.getNetworkInterfaces())");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ArrayList list2 = Collections.list(((NetworkInterface) it.next()).getInetAddresses());
            o.LJIIIIZZ(list2, "list(it.inetAddresses)");
            ORS.LJJLIIIJILLIZJL(list2, arrayList);
        }
        return (String) OJ4.LJJJJJ(OJ4.LJJJJLL(OJ4.LJJJJ(OJ4.LJJJJLL(OJ4.LJJJJ(ORZ.LJLIIIL(arrayList), C92830aH4.LJLIL), C92831aH5.LJLIL), new IDqS2S0010000_31(4)), new IDqS2S0010000_31(5)));
    }
}
