package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.IbJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46925IbJ implements InterfaceC46926IbK {
    @Override // X.InterfaceC46926IbK
    public final void LIZ(IY3 iy3) {
    }

    @Override // X.InterfaceC46926IbK
    public final IYO LIZIZ(List<? extends IYN> list, java.util.Map<String, Object> map) {
        IYO iyo = new IYO();
        iyo.LJLJJL = "Lowest";
        if (list != null && !list.isEmpty()) {
            IYN iyn = (IYN) ListProtector.get(list, 0);
            for (IYN iyn2 : list) {
                if (iyn2.getBitRate() < iyn.getBitRate()) {
                    iyn = iyn2;
                }
            }
            iyo.LJLJI = iyn.getBitRate();
            iyo.LJLIL = iyn;
            return iyo;
        }
        iyo.LJLILLLLZI = new C46892Iam(0, "bitrate list is empty...");
        return iyo;
    }
}
