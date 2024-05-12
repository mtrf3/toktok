package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.QsP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68369QsP extends AbstractC68364QsK {
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final /* synthetic */ C68370QsQ LJLJJL;

    @Override // X.AbstractC68364QsK
    public final InterfaceC68379QsZ LIZ(C68377QsX c68377QsX, List list) {
        int i;
        C68368QsO.LJIIIIZZ(1, "log", list);
        int size = list.size();
        C68371QsR c68371QsR = InterfaceC68379QsZ.LJIIJ;
        if (size == 1) {
            this.LJLJJL.LJLJI.LIZIZ(3, c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJII(), this.LJLJI, this.LJLJJI, Collections.emptyList());
            return c68371QsR;
        }
        int LIZIZ = C68368QsO.LIZIZ(c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJI().doubleValue());
        if (LIZIZ != 2) {
            if (LIZIZ != 3) {
                if (LIZIZ != 5) {
                    if (LIZIZ != 6) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                } else {
                    i = 5;
                }
            } else {
                i = 1;
            }
        } else {
            i = 4;
        }
        String LJII = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1)).LJII();
        if (list.size() == 2) {
            this.LJLJJL.LJLJI.LIZIZ(i, LJII, this.LJLJI, this.LJLJJI, Collections.emptyList());
            return c68371QsR;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
            arrayList.add(c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, i2)).LJII());
        }
        this.LJLJJL.LJLJI.LIZIZ(i, LJII, this.LJLJI, this.LJLJJI, arrayList);
        return c68371QsR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68369QsP(C68370QsQ c68370QsQ, boolean z, boolean z2) {
        super("log");
        this.LJLJJL = c68370QsQ;
        this.LJLJI = z;
        this.LJLJJI = z2;
    }
}
