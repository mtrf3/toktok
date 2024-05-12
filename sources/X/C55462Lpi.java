package X;

import com.bytedance.jedi.arch.JediViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lpi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55462Lpi implements InterfaceC50422Jqc {
    @Override // X.InterfaceC50422Jqc
    public final InterfaceC51679KPz LIZ(M89 param, AbstractC51036K1g<?, ?> abstractC51036K1g, JediViewModel<?> jediViewModel) {
        o.LJIIIZ(param, "param");
        List<String> uidList = param.getUidList();
        o.LJI(uidList);
        List<String> blueDotList = param.getBlueDotList();
        o.LJI(blueDotList);
        return new C223298pZ(uidList, blueDotList);
    }
}
