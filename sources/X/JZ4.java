package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JZ4 implements InterfaceC63694OzC<JZ4> {
    public final String LJLIL;
    public final JZX LJLILLLLZI;
    public final InterfaceC88472Yns<EnterRoomConfig, EnterRoomConfig> LJLJI;

    public JZ4() {
        this(0);
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JZ4)) {
            return false;
        }
        JZ4 jz4 = (JZ4) obj;
        return o.LJ(this.LJLIL, jz4.LJLIL) && o.LJ(this.LJLILLLLZI, jz4.LJLILLLLZI) && o.LJ(this.LJLJI, jz4.LJLJI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        JZX jzx = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (jzx == null ? 0 : jzx.hashCode())) * 31;
        InterfaceC88472Yns<EnterRoomConfig, EnterRoomConfig> interfaceC88472Yns = this.LJLJI;
        return hashCode2 + (interfaceC88472Yns != null ? interfaceC88472Yns.hashCode() : 0);
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        return C113554cx.LJJJLIIL();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchAwemeBindingState(demoSegment=");
        LIZ.append(this.LJLIL);
        LIZ.append(", cardItemInfo=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", liveRoomConfig=");
        return C249109q6.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public /* synthetic */ JZ4(int i) {
        this("", null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JZ4(String demoSegment, JZX jzx, InterfaceC88472Yns<? super EnterRoomConfig, EnterRoomConfig> interfaceC88472Yns) {
        o.LJIIIZ(demoSegment, "demoSegment");
        this.LJLIL = demoSegment;
        this.LJLILLLLZI = jzx;
        this.LJLJI = interfaceC88472Yns;
        o.LJIIIIZZ(UUID.randomUUID().toString(), "randomUUID().toString()");
    }

    public static JZ4 LIZ(JZ4 jz4, JZX jzx, InterfaceC88472Yns interfaceC88472Yns, int i) {
        String demoSegment;
        if ((i & 1) != 0) {
            demoSegment = jz4.LJLIL;
        } else {
            demoSegment = null;
        }
        if ((i & 2) != 0) {
            jzx = jz4.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            interfaceC88472Yns = jz4.LJLJI;
        }
        jz4.getClass();
        o.LJIIIZ(demoSegment, "demoSegment");
        return new JZ4(demoSegment, jzx, interfaceC88472Yns);
    }
}
