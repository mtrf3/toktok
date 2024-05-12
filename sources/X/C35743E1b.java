package X;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.E1b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35743E1b extends AbstractC65781Prl implements InterfaceC65784Pro<ArrayList<byte[]>> {
    public static final C35743E1b LJLIL = new C35743E1b();

    public C35743E1b() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ArrayList<byte[]> invoke() {
        ArrayList<byte[]> arrayList = new ArrayList<>(160);
        System.currentTimeMillis();
        Iterator<String> it = C35742E1a.LIZ.iterator();
        while (it.hasNext()) {
            arrayList.add(Base64.decode(it.next(), 0));
        }
        System.currentTimeMillis();
        return arrayList;
    }
}
