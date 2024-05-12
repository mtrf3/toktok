package ms.bd.o;

import X.C16880lQ;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import ms.bd.o.b;
import org.json.JSONArray;

/* loaded from: classes7.dex */
public final class a1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        JSONArray jSONArray = new JSONArray();
        try {
            DhcpInfo dhcpInfo = ((WifiManager) C16880lQ.LLILL(C16880lQ.LLLLL(a.LIZIZ.LIZ), (String) k.a(16777217, 0, 0L, "cd2b6a", new byte[]{101, 111, 71, 31}))).getDhcpInfo();
            StringBuilder sb = new StringBuilder();
            sb.append(dhcpInfo.dns1 & 255);
            sb.append((String) k.a(16777217, 0, 0L, "e5efa6", new byte[]{58}));
            sb.append((dhcpInfo.dns1 >> 8) & 255);
            sb.append((String) k.a(16777217, 0, 0L, "3b32e3", new byte[]{108}));
            sb.append((dhcpInfo.dns1 >> 16) & 255);
            sb.append((String) k.a(16777217, 0, 0L, "d67cc2", new byte[]{59}));
            sb.append((dhcpInfo.dns1 >> 24) & 255);
            jSONArray.put(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dhcpInfo.dns2 & 255);
            sb2.append((String) k.a(16777217, 0, 0L, "d988a0", new byte[]{59}));
            sb2.append((dhcpInfo.dns2 >> 8) & 255);
            sb2.append((String) k.a(16777217, 0, 0L, "ca3990", new byte[]{60}));
            sb2.append((dhcpInfo.dns2 >> 16) & 255);
            sb2.append((String) k.a(16777217, 0, 0L, "da8b3c", new byte[]{59}));
            sb2.append((dhcpInfo.dns2 >> 24) & 255);
            jSONArray.put(sb2.toString());
        } catch (Throwable unused) {
            k.a(16777217, 0, 0L, "477e87", new byte[]{40, 60, 76, 46, 3, 44});
        }
        return jSONArray.toString();
    }
}
