package X;

import java.util.Arrays;

/* loaded from: classes14.dex */
public class V8Q implements InterfaceC63146OqM {
    public Object LJLIL;

    public void LIZJ() {
        this.LJLIL = null;
    }

    @Override // X.InterfaceC63146OqM
    public final long LJIILJJIL() {
        return ((C84313X7d) this.LJLIL).LJIILJJIL();
    }

    @Override // X.InterfaceC63146OqM
    public final int LJIJJLI() {
        return ((C84313X7d) this.LJLIL).LJIIJ();
    }

    @Override // X.InterfaceC63146OqM
    public final void LJJIIZI() {
        Object[] objArr = ((AbstractC84311X7b) this.LJLIL).LJLJJLL;
        if (objArr != null) {
            Arrays.fill(objArr, (Object) null);
        }
    }

    @Override // X.InterfaceC63146OqM
    public final void close() {
        ((AbstractC84314X7e) this.LJLIL).LIZLLL();
    }

    public /* synthetic */ V8Q() {
    }

    public /* synthetic */ V8Q(Object obj) {
        this.LJLIL = obj;
    }

    public void LIZ(InterfaceC29082BbC interfaceC29082BbC) {
        this.LJLIL = interfaceC29082BbC;
    }

    @Override // X.InterfaceC63146OqM
    public final void LJIIIZ(int i, long j) {
        ((AbstractC84311X7b) this.LJLIL).LJ(i, Long.valueOf(j));
    }

    @Override // X.InterfaceC63146OqM
    public final void LJJII(int i, String str) {
        ((AbstractC84311X7b) this.LJLIL).LJJII(i, str);
    }

    @Override // X.InterfaceC63146OqM
    public final void LJJIIZ(int i, byte[] bArr) {
        AbstractC84311X7b abstractC84311X7b = (AbstractC84311X7b) this.LJLIL;
        if (bArr != null) {
            abstractC84311X7b.LJ(i, bArr);
        } else {
            abstractC84311X7b.getClass();
            throw new IllegalArgumentException(C0NY.LIZIZ("the bind value at index ", i, " is null"));
        }
    }
}
