package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Psu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65852Psu extends F9E implements InterfaceC66068PwO {
    public final Thread LJLIL;
    public final Throwable LJLILLLLZI;
    public final String LJLJI;
    public final java.util.Map<String, String> LJLJJI;
    public final boolean LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, Boolean.valueOf(this.LJLJJL)};
    }

    @Override // X.InterfaceC66068PwO
    public final String getTag() {
        return "ExceptionEvent";
    }

    public /* synthetic */ C65852Psu(Thread thread, Throwable th, String str, java.util.Map map, int i) {
        this((i & 1) != 0 ? null : thread, th, (i & 4) != 0 ? "" : str, (java.util.Map<String, String>) ((i & 8) == 0 ? map : null), false);
    }

    public C65852Psu(Thread thread, Throwable e, String label, java.util.Map<String, String> map, boolean z) {
        o.LJIIIZ(e, "e");
        o.LJIIIZ(label, "label");
        this.LJLIL = thread;
        this.LJLILLLLZI = e;
        this.LJLJI = label;
        this.LJLJJI = map;
        this.LJLJJL = z;
    }
}
