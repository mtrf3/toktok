package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.FpB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40141FpB extends OAC {
    public final /* synthetic */ C40140FpA LJLJJL;

    public C40141FpB(C40140FpA c40140FpA) {
        this.LJLJJL = c40140FpA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.OAC, X.InterfaceC40148FpI
    public final void LIZLLL(InterfaceC60761Nsz kitView, List<String> list) {
        java.util.Map<String, Object> LJ;
        java.util.Map<String, Object> map;
        o.LJIIIZ(kitView, "kitView");
        InterfaceC60710NsA interfaceC60710NsA = kitView.getHybridContext().hybridParams;
        if (interfaceC60710NsA != null && (LJ = interfaceC60710NsA.LJ()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : LJ.entrySet()) {
                if (((ArrayList) list).contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                C40156FpQ c40156FpQ = (C40156FpQ) kitView.getHybridContext().LIZIZ(C40156FpQ.class);
                if (c40156FpQ != null && (map = c40156FpQ.LIZ) != 0) {
                    map.put(entry2.getKey(), entry2.getValue());
                }
            }
        }
        super.LIZLLL(kitView, list);
    }

    @Override // X.OAC, X.InterfaceC40148FpI
    public final void LJFF(InterfaceC60761Nsz kitView, java.util.Map<String, Object> map) {
        o.LJIIIZ(kitView, "kitView");
        this.LJLJJL.getClass();
        super.LJFF(kitView, C40140FpA.LJFF(kitView, map));
    }

    @Override // X.OAC, X.InterfaceC40148FpI
    public final void LJI(InterfaceC60761Nsz kitView, java.util.Map<String, Object> map) {
        o.LJIIIZ(kitView, "kitView");
        this.LJLJJL.getClass();
        super.LJI(kitView, C40140FpA.LJFF(kitView, map));
    }
}
