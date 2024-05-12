package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ec1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36777Ec1 implements InterfaceC36737EbN {
    public final /* synthetic */ Collection<InterfaceC36778Ec2> LIZ;

    @Override // X.InterfaceC36737EbN
    public final List<String> LIZ() {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC36778Ec2> it = this.LIZ.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().LIZ());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C36777Ec1(Collection<? extends InterfaceC36778Ec2> collection) {
        this.LIZ = collection;
    }
}
