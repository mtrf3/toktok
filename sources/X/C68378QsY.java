package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.QsY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68378QsY extends AbstractC68364QsK {
    public final List LJLJI;
    public final List LJLJJI;
    public final C68377QsX LJLJJL;

    @Override // X.AbstractC68364QsK, X.InterfaceC68379QsZ
    public final InterfaceC68379QsZ LIZLLL() {
        return new C68378QsY(this);
    }

    public C68378QsY(C68378QsY c68378QsY) {
        super(c68378QsY.LJLIL);
        ArrayList arrayList = new ArrayList(c68378QsY.LJLJI.size());
        this.LJLJI = arrayList;
        arrayList.addAll(c68378QsY.LJLJI);
        ArrayList arrayList2 = new ArrayList(c68378QsY.LJLJJI.size());
        this.LJLJJI = arrayList2;
        arrayList2.addAll(c68378QsY.LJLJJI);
        this.LJLJJL = c68378QsY.LJLJJL;
    }

    @Override // X.AbstractC68364QsK
    public final InterfaceC68379QsZ LIZ(C68377QsX c68377QsX, List list) {
        C68371QsR c68371QsR;
        C68377QsX LIZ = this.LJLJJL.LIZ();
        int i = 0;
        while (true) {
            int size = ((ArrayList) this.LJLJI).size();
            c68371QsR = InterfaceC68379QsZ.LJIIJ;
            if (i >= size) {
                break;
            }
            if (i < list.size()) {
                LIZ.LJ((String) ListProtector.get(this.LJLJI, i), c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, i)));
            } else {
                LIZ.LJ((String) ListProtector.get(this.LJLJI, i), c68371QsR);
            }
            i++;
        }
        Iterator it = ((ArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            InterfaceC68379QsZ interfaceC68379QsZ = (InterfaceC68379QsZ) it.next();
            InterfaceC68379QsZ LIZIZ = LIZ.LIZIZ(interfaceC68379QsZ);
            if (LIZIZ instanceof C68392Qsm) {
                LIZIZ = LIZ.LIZIZ(interfaceC68379QsZ);
            }
            if (LIZIZ instanceof C68381Qsb) {
                return ((C68381Qsb) LIZIZ).LJLIL;
            }
        }
        return c68371QsR;
    }

    public C68378QsY(String str, List list, List list2, C68377QsX c68377QsX) {
        super(str);
        this.LJLJI = new ArrayList();
        this.LJLJJL = c68377QsX;
        ArrayList arrayList = (ArrayList) list;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC68379QsZ interfaceC68379QsZ = (InterfaceC68379QsZ) it.next();
                ((ArrayList) this.LJLJI).add(interfaceC68379QsZ.LJII());
            }
        }
        this.LJLJJI = new ArrayList(list2);
    }
}
