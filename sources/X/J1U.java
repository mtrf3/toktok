package X;

import android.os.SystemClock;
import java.net.InetAddress;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class J1U extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ EnumC48190Ivi LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ J1W LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1U(int i, long j, EnumC48190Ivi enumC48190Ivi, J1W j1w, String str) {
        super(0);
        this.LJLIL = str;
        this.LJLILLLLZI = enumC48190Ivi;
        this.LJLJI = j;
        this.LJLJJI = i;
        this.LJLJJL = j1w;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Object LIZ;
        J1X j1x = J1X.LIZ;
        String str = this.LJLIL;
        EnumC48190Ivi enumC48190Ivi = this.LJLILLLLZI;
        long j = this.LJLJI;
        int i = this.LJLJJI;
        J1W j1w = this.LJLJJL;
        j1x.getClass();
        if (i >= 0) {
            EnumC48190Ivi networkStateWhenPing = C2NU.LIZ.LIZIZ;
            if (C38354F3m.LJ(str)) {
                C221018lt.LJFF("PingUtils", "[realPing], failed, caused by empty host");
            } else {
                long uptimeMillis = SystemClock.uptimeMillis();
                int i2 = 0;
                long j2 = 0;
                try {
                    InetAddress byName = InetAddress.getByName(str);
                    if (byName.isReachable(i * 1000)) {
                        j2 = SystemClock.uptimeMillis() - uptimeMillis;
                        if (j1w != null) {
                            j1w.LIZ(byName);
                        }
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("[realPing], succeed, address = ");
                        LIZ2.append(byName);
                        LIZ2.append(", duration = ");
                        LIZ2.append(j2);
                        C221018lt.LJFF("PingUtils", X1D.LIZIZ(LIZ2));
                    } else {
                        i2 = -2;
                        if (j1w != null) {
                            j1w.LIZIZ();
                        }
                        C221018lt.LJFF("PingUtils", "[realPing], failed, caused by timeout");
                    }
                    LIZ = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
                    if (j1w != null) {
                        j1w.LIZIZ();
                    }
                    C221018lt.LJFF("PingUtils", "[realPing], failed, caused by unknown host");
                    i2 = -1;
                }
                o.LJIIIIZZ(networkStateWhenPing, "networkStateWhenPing");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ping_duration", j2);
                jSONObject.put("delay_seconds", j);
                jSONObject.put("timeout_seconds", i);
                jSONObject.put("network_state_before_ping", enumC48190Ivi);
                jSONObject.put("network_state_when_ping", networkStateWhenPing);
                jSONObject.put("ping_host", str);
                jSONObject.put("ping_status_code", i2);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("jsonObject = ");
                LIZ3.append(jSONObject);
                C221018lt.LJFF("PingUtils", X1D.LIZIZ(LIZ3));
                FMX.LJIILJJIL("ws_real_network_connectivity", jSONObject);
            }
        }
        return C76800UCe.LIZ;
    }
}
