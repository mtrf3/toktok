package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Inw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47708Inw {
    public String LIZ;
    public C47164IfA LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public C47804IpU LJFF;
    public C5ML LJI;
    public String LJII;
    public C47398Iiw LJIIIZ;
    public C47396Iiu LJIIJ;
    public boolean LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public EnumC47176IfM LJ = EnumC47176IfM.Undefine;
    public String LJIIIIZZ = "";
    public int LJIILJJIL = -1;
    public final List<C47714Io2> LJIILL = new CopyOnWriteArrayList();

    public final InterfaceC47122IeU LIZJ() {
        InterfaceC47122IeU interfaceC47122IeU;
        C47396Iiu c47396Iiu = this.LJIIJ;
        if (c47396Iiu != null && (interfaceC47122IeU = c47396Iiu.LJIIIIZZ) != null) {
            return interfaceC47122IeU;
        }
        C5ML c5ml = this.LJI;
        if (c5ml != null) {
            c5ml.getClass();
            return null;
        }
        C47398Iiw c47398Iiw = this.LJIIIZ;
        if (c47398Iiw == null) {
            return null;
        }
        return c47398Iiw.LJIIJ;
    }

    public final void LIZ(int i) {
        if (LIZJ() != null) {
            C47121IeT c47121IeT = new C47121IeT(3);
            c47121IeT.LIZJ = new C47789IpF("kTTVideoErrorDomainDataLoaderPreload", i);
            LIZJ().LIZ(c47121IeT);
        }
    }

    public final C47714Io2 LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C47714Io2 LIZLLL = LIZLLL(str);
        if (LIZLLL == null) {
            C47714Io2 c47714Io2 = new C47714Io2();
            c47714Io2.LIZ = str;
            ((CopyOnWriteArrayList) this.LJIILL).add(c47714Io2);
            return c47714Io2;
        }
        return LIZLLL;
    }

    public final C47714Io2 LIZLLL(String str) {
        if (((CopyOnWriteArrayList) this.LJIILL).size() > 0) {
            for (int i = 0; i < ((CopyOnWriteArrayList) this.LJIILL).size(); i++) {
                C47714Io2 c47714Io2 = (C47714Io2) ListProtector.get(this.LJIILL, i);
                if (c47714Io2.LIZ.equals(str)) {
                    return c47714Io2;
                }
            }
        }
        return null;
    }
}
