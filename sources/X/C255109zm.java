package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9zm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C255109zm extends AbstractC65781Prl implements InterfaceC88472Yns<C26231ARf, C76800UCe> {
    public static final C255109zm LJLIL = new C255109zm();

    public C255109zm() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C26231ARf c26231ARf) {
        ARI ari;
        List<ARL> list;
        ARL arl;
        C26231ARf it = c26231ARf;
        o.LJIIIZ(it, "it");
        AbstractC243009gG LJI = it.LJI();
        if ((LJI instanceof ARI) && (ari = (ARI) LJI) != null && (list = ari.LJFF) != null && (arl = (ARL) ListProtector.get(list, 0)) != null) {
            arl.LIZIZ(false);
        }
        return C76800UCe.LIZ;
    }
}
