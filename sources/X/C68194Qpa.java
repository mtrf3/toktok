package X;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/* renamed from: X.Qpa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68194Qpa implements InterfaceC68730QyE {
    public final /* synthetic */ C68074Qne LIZ;

    public C68194Qpa(C68074Qne c68074Qne) {
        this.LIZ = c68074Qne;
    }

    @Override // X.InterfaceC68730QyE
    public final long LIZ() {
        C68074Qne c68074Qne = this.LIZ;
        c68074Qne.getClass();
        BinderC68193QpZ binderC68193QpZ = new BinderC68193QpZ();
        c68074Qne.LIZIZ(new C68198Qpe(c68074Qne, binderC68193QpZ));
        Long l = (Long) BinderC68193QpZ.LLZZJLIL(binderC68193QpZ.LLJI(500L), Long.class);
        if (l == null) {
            long nanoTime = System.nanoTime();
            c68074Qne.LIZIZ.getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i = c68074Qne.LJ + 1;
            c68074Qne.LJ = i;
            return nextLong + i;
        }
        return l.longValue();
    }

    @Override // X.InterfaceC68730QyE
    public final String LJI() {
        C68074Qne c68074Qne = this.LIZ;
        c68074Qne.getClass();
        BinderC68193QpZ binderC68193QpZ = new BinderC68193QpZ();
        c68074Qne.LIZIZ(new C68197Qpd(c68074Qne, binderC68193QpZ));
        return binderC68193QpZ.LLJJIII(50L);
    }

    @Override // X.InterfaceC68730QyE
    public final String LJII() {
        C68074Qne c68074Qne = this.LIZ;
        c68074Qne.getClass();
        BinderC68193QpZ binderC68193QpZ = new BinderC68193QpZ();
        c68074Qne.LIZIZ(new C68200Qpg(c68074Qne, binderC68193QpZ));
        return binderC68193QpZ.LLJJIII(500L);
    }

    @Override // X.InterfaceC68730QyE
    public final String LJIIJJI() {
        C68074Qne c68074Qne = this.LIZ;
        c68074Qne.getClass();
        BinderC68193QpZ binderC68193QpZ = new BinderC68193QpZ();
        c68074Qne.LIZIZ(new C68199Qpf(c68074Qne, binderC68193QpZ));
        return binderC68193QpZ.LLJJIII(500L);
    }

    @Override // X.InterfaceC68730QyE
    public final String LJIIL() {
        C68074Qne c68074Qne = this.LIZ;
        c68074Qne.getClass();
        BinderC68193QpZ binderC68193QpZ = new BinderC68193QpZ();
        c68074Qne.LIZIZ(new C68196Qpc(c68074Qne, binderC68193QpZ));
        return binderC68193QpZ.LLJJIII(500L);
    }

    @Override // X.InterfaceC68730QyE
    public final void LJIILL(String str) {
        C68074Qne c68074Qne = this.LIZ;
        c68074Qne.getClass();
        c68074Qne.LIZIZ(new C68205Qpl(c68074Qne, str));
    }

    @Override // X.InterfaceC68730QyE
    public final void LJIILLIIL(String str) {
        C68074Qne c68074Qne = this.LIZ;
        c68074Qne.getClass();
        c68074Qne.LIZIZ(new C68206Qpm(c68074Qne, str));
    }

    @Override // X.InterfaceC68730QyE
    public final int LJIJ(String str) {
        C68074Qne c68074Qne = this.LIZ;
        c68074Qne.getClass();
        BinderC68193QpZ binderC68193QpZ = new BinderC68193QpZ();
        c68074Qne.LIZIZ(new C68202Qpi(c68074Qne, str, binderC68193QpZ));
        Integer num = (Integer) BinderC68193QpZ.LLZZJLIL(binderC68193QpZ.LLJI(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // X.InterfaceC68730QyE
    public final void LJIJI(Bundle bundle) {
        C68074Qne c68074Qne = this.LIZ;
        c68074Qne.getClass();
        c68074Qne.LIZIZ(new C68203Qpj(c68074Qne, bundle));
    }

    @Override // X.InterfaceC68730QyE
    public final List LJIILJJIL(String str, String str2) {
        C68074Qne c68074Qne = this.LIZ;
        c68074Qne.getClass();
        BinderC68193QpZ binderC68193QpZ = new BinderC68193QpZ();
        c68074Qne.LIZIZ(new C68195Qpb(c68074Qne, str, str2, binderC68193QpZ));
        List list = (List) BinderC68193QpZ.LLZZJLIL(binderC68193QpZ.LLJI(5000L), List.class);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    @Override // X.InterfaceC68730QyE
    public final void LJIILIIL(String str, String str2, Bundle bundle) {
        C68074Qne c68074Qne = this.LIZ;
        c68074Qne.getClass();
        c68074Qne.LIZIZ(new C68158Qp0(c68074Qne, str, str2, bundle, true));
    }

    @Override // X.InterfaceC68730QyE
    public final java.util.Map LJIIZILJ(String str, String str2, boolean z) {
        C68074Qne c68074Qne = this.LIZ;
        c68074Qne.getClass();
        BinderC68193QpZ binderC68193QpZ = new BinderC68193QpZ();
        c68074Qne.LIZIZ(new C68201Qph(c68074Qne, str, str2, z, binderC68193QpZ));
        Bundle LLJI = binderC68193QpZ.LLJI(5000L);
        if (LLJI == null || LLJI.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(LLJI.size());
        for (String str3 : LLJI.keySet()) {
            Object LLJJIII = C16880lQ.LLJJIII(LLJI, str3);
            if ((LLJJIII instanceof Double) || (LLJJIII instanceof Long) || (LLJJIII instanceof String)) {
                hashMap.put(str3, LLJJIII);
            }
        }
        return hashMap;
    }

    @Override // X.InterfaceC68730QyE
    public final void LJIJJ(String str, String str2, Bundle bundle) {
        C68074Qne c68074Qne = this.LIZ;
        c68074Qne.getClass();
        c68074Qne.LIZIZ(new C68204Qpk(c68074Qne, str, str2, bundle));
    }
}
