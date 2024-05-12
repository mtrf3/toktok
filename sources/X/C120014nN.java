package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4nN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120014nN extends C47631Imh implements InterfaceC120024nO {
    public final String LJLJI;
    public InterfaceC120024nO LJLJJI;

    @Override // X.C47631Imh
    public final void LIZIZ() {
        this.LJLJJI = null;
        C63309Osz LIZLLL = C63309Osz.LIZLLL();
        LIZLLL.getClass();
        String str = this.LJLJI;
        List list = (List) ((ConcurrentHashMap) LIZLLL.LIZJ).get(str);
        if (list != null) {
            list.remove(this);
            ((ConcurrentHashMap) LIZLLL.LIZJ).put(str, list);
        }
        super.LIZIZ();
    }

    @Override // X.InterfaceC120024nO
    public final int JG() {
        InterfaceC120024nO interfaceC120024nO = this.LJLJJI;
        if (interfaceC120024nO != null) {
            return interfaceC120024nO.JG();
        }
        return 0;
    }

    public C120014nN(String str) {
        super(0);
        this.LJLJI = str;
    }

    public static long LIZLLL(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        String[] split = str.split(":");
        if (split.length != 4) {
            return -1L;
        }
        long longValue = CastLongProtector.valueOf(split[2]).longValue();
        long longValue2 = CastLongProtector.valueOf(split[3]).longValue();
        long uid = C63308Osy.LJI().LIZIZ().getUid();
        if (uid == longValue) {
            return longValue2;
        }
        if (uid != longValue2) {
            return -1L;
        }
        return longValue;
    }

    @Override // X.InterfaceC120024nO
    public final void BH(List<C63089OpR> list) {
        InterfaceC120024nO interfaceC120024nO = this.LJLJJI;
        if (interfaceC120024nO != null) {
            interfaceC120024nO.BH(list);
        }
    }

    @Override // X.InterfaceC120024nO
    public final void CN(C63120Opw c63120Opw) {
        InterfaceC120024nO interfaceC120024nO = this.LJLJJI;
        if (interfaceC120024nO != null) {
            interfaceC120024nO.CN(c63120Opw);
        }
    }

    @Override // X.InterfaceC120024nO
    public final void DH(List<C63089OpR> list) {
        InterfaceC120024nO interfaceC120024nO = this.LJLJJI;
        if (interfaceC120024nO != null) {
            interfaceC120024nO.DH(list);
        }
    }

    public final void LJ(InterfaceC120024nO interfaceC120024nO) {
        this.LJLJJI = null;
        C63309Osz LIZLLL = C63309Osz.LIZLLL();
        String str = this.LJLJI;
        List list = (List) ((ConcurrentHashMap) LIZLLL.LIZJ).get(str);
        if (list != null) {
            list.remove(interfaceC120024nO);
            ((ConcurrentHashMap) LIZLLL.LIZJ).put(str, list);
        }
        super.LIZIZ();
    }

    @Override // X.InterfaceC120024nO
    public final void MO(List<C63089OpR> list) {
        InterfaceC120024nO interfaceC120024nO = this.LJLJJI;
        if (interfaceC120024nO != null) {
            interfaceC120024nO.MO(list);
        }
    }

    @Override // X.InterfaceC120024nO
    public final void Tu(C63120Opw c63120Opw) {
        InterfaceC120024nO interfaceC120024nO = this.LJLJJI;
        if (interfaceC120024nO != null) {
            interfaceC120024nO.Tu(c63120Opw);
        }
    }

    @Override // X.InterfaceC120024nO
    public final void f3(C63120Opw c63120Opw) {
        InterfaceC120024nO interfaceC120024nO = this.LJLJJI;
        if (interfaceC120024nO != null) {
            interfaceC120024nO.f3(c63120Opw);
        }
    }

    @Override // X.InterfaceC120024nO
    public final void we0(C63120Opw c63120Opw) {
        InterfaceC120024nO interfaceC120024nO = this.LJLJJI;
        if (interfaceC120024nO != null) {
            interfaceC120024nO.we0(c63120Opw);
        }
    }

    @Override // X.InterfaceC120024nO
    public final void Mi(String str, List<C63089OpR> list) {
        InterfaceC120024nO interfaceC120024nO = this.LJLJJI;
        if (interfaceC120024nO != null) {
            interfaceC120024nO.Mi(str, list);
        }
    }

    @Override // X.InterfaceC120024nO
    public final void hW(int i, String str) {
        InterfaceC120024nO interfaceC120024nO = this.LJLJJI;
        if (interfaceC120024nO != null) {
            interfaceC120024nO.hW(i, str);
        }
    }

    @Override // X.InterfaceC120024nO
    public final void y9(int i, C63120Opw c63120Opw) {
        InterfaceC120024nO interfaceC120024nO = this.LJLJJI;
        if (interfaceC120024nO != null) {
            interfaceC120024nO.y9(i, c63120Opw);
        }
    }

    public static String LIZJ(int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(Math.max(0, i));
        sb.append(":");
        sb.append(AbstractC63505Ow9.LIZ);
        sb.append(":");
        if (j2 < j) {
            sb.append(j2);
            sb.append(":");
            sb.append(j);
        } else {
            sb.append(j);
            sb.append(":");
            sb.append(j2);
        }
        return sb.toString();
    }

    @Override // X.InterfaceC120024nO
    public final void tq0(int i, String str, List list) {
        InterfaceC120024nO interfaceC120024nO = this.LJLJJI;
        if (interfaceC120024nO != null) {
            interfaceC120024nO.tq0(i, str, list);
        }
    }
}
