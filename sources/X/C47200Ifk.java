package X;

import Y.ARunnableS27S0200000_8;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ifk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47200Ifk extends C47153Iez {
    public final /* synthetic */ C47198Ifi LJLIL;

    public C47200Ifk(C47198Ifi c47198Ifi) {
        this.LJLIL = c47198Ifi;
    }

    @Override // X.C47153Iez, X.InterfaceC46540IOi
    public final void onCompleteLoaded(String str, boolean z) {
        List<C47227IgB> LIZ;
        C16880lQ.LLLZ("onCompleteLoaded: sourceid:%s, isDash:%s", new Object[]{str, Boolean.valueOf(z)});
        if (!this.LJLIL.LIZ.LIZIZ(str)) {
            return;
        }
        C47198Ifi c47198Ifi = this.LJLIL;
        c47198Ifi.LIZIZ.LIZIZ(c47198Ifi, new IU2(str, z));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onCompleteLoaded trigger preload, key:");
        LIZ2.append(str);
        X1D.LIZIZ(LIZ2);
        C47198Ifi c47198Ifi2 = this.LJLIL;
        c47198Ifi2.getClass();
        ArrayList arrayList = new ArrayList();
        InterfaceC47225Ig9 interfaceC47225Ig9 = c47198Ifi2.LJFF;
        if (interfaceC47225Ig9 != null && (LIZ = interfaceC47225Ig9.LIZ()) != null && LIZ.size() > 0) {
            arrayList.addAll(LIZ);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C47198Ifi c47198Ifi3 = this.LJLIL;
        c47198Ifi3.LJII = str;
        c47198Ifi3.LJIIIIZZ.submit(new ARunnableS27S0200000_8(c47198Ifi3, arrayList, 75));
    }
}
