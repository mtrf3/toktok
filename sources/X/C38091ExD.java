package X;

import com.bytedance.retrofit2.client.Request;
import java.util.LinkedList;

/* renamed from: X.ExD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38091ExD implements InterfaceC37216Ej6 {
    public final /* synthetic */ java.util.Map LJLIL;

    public C38091ExD(java.util.Map map) {
        this.LJLIL = map;
    }

    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt intercept(FBZ fbz) {
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(request.getHeaders());
        for (String str : this.LJLIL.keySet()) {
            linkedList.add(new EJ6(str, (String) this.LJLIL.get(str)));
        }
        C64908Pdg newBuilder = request.newBuilder();
        newBuilder.LIZJ = linkedList;
        return f7s.LIZ(newBuilder.LIZ());
    }
}
