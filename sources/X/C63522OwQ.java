package X;

import com.bytedance.im.core.proto.Response;
import java.util.HashSet;

/* renamed from: X.OwQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63522OwQ extends AbstractC63527OwV {
    @Override // X.AbstractC63527OwV, X.InterfaceC63520OwO
    public final EnumC35451Dvj LIZ() {
        return EnumC35451Dvj.CORE_PARALLEL;
    }

    @Override // X.InterfaceC63520OwO
    public final EnumC63524OwS getPriority() {
        return EnumC63524OwS.MEDIUM;
    }

    public C63522OwQ(C63528OwW c63528OwW) {
        super(c63528OwW);
    }

    public static final boolean LJ(Integer num) {
        if (num == null) {
            return false;
        }
        return ((HashSet) C63308Osy.LJI().LIZLLL().LJJJJLL.LIZ).contains(num);
    }

    @Override // X.InterfaceC63520OwO
    public final boolean LIZJ(Response response) {
        return LJ(response.cmd);
    }

    @Override // X.InterfaceC63520OwO
    public final boolean LIZLLL(C63622Oy2 c63622Oy2) {
        return LJ(Integer.valueOf(c63622Oy2.LJFF()));
    }
}
