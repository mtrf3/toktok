package X;

import java.util.Comparator;
import kotlin.jvm.internal.o;

/* renamed from: X.4N0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4N0 extends AbstractC65781Prl implements InterfaceC65784Pro<Comparator<C63120Opw>> {
    public static final C4N0 LJLIL = new C4N0();

    public C4N0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final /* bridge */ /* synthetic */ Comparator<C63120Opw> invoke() {
        return new Comparator() { // from class: X.4N1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return o.LJIIL(((C63120Opw) obj2).getUpdatedTime(), ((C63120Opw) obj).getUpdatedTime());
            }
        };
    }
}
