package X;

import com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

/* renamed from: X.a9y, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92390a9y extends AbstractC65781Prl implements InterfaceC65784Pro<IComponentProvider> {
    public static final C92390a9y LJLIL = new C92390a9y();

    public C92390a9y() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final IComponentProvider invoke() {
        ServiceLoader load = ServiceLoader.load(IComponentProvider.class);
        ArrayList arrayList = new ArrayList();
        Iterator it = load.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add(new C92171a6R());
        C40675Fxn.LJJLIIIIJ(arrayList);
        return ORZ.LJLLJ(arrayList);
    }
}
