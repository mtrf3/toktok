package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TaS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74900TaS extends F9E implements InterfaceC73131Sn1 {
    public String LJLIL;
    public int LJLILLLLZI;

    public /* synthetic */ C74900TaS() {
        throw null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI)};
    }

    @Override // X.InterfaceC73131Sn1
    public final boolean LLILLIZIL(Object obj) {
        if (!(obj instanceof C74900TaS) || !o.LJ(((C74900TaS) obj).LJLIL, this.LJLIL)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC73131Sn1
    public final boolean LLLLLLZ(Object obj) {
        return obj instanceof C74900TaS;
    }

    public C74900TaS(String str, int i) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }
}
