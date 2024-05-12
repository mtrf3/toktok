package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UYc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77370UYc extends AbstractC65781Prl implements InterfaceC65784Pro<List<AbstractC77369UYb>> {
    public static final C77370UYc LJLIL = new C77370UYc();

    public C77370UYc() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<AbstractC77369UYb> invoke() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            arrayList.add(new C77368UYa());
            i++;
        } while (i < 5);
        return arrayList;
    }
}
