package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F6D implements InterfaceC37126Ehe {
    public final /* synthetic */ String LJLIL;

    public F6D(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC37126Ehe
    public final void onSuccess(String name, boolean z) {
        o.LJIIIZ(name, "name");
        String str = this.LJLIL;
        if (str == null) {
            str = "";
        }
        C225248si.LJIJJLI(null, str, "succeed");
    }

    @Override // X.InterfaceC37126Ehe
    public final void onFailed(String str, boolean z, int i) {
        String str2 = this.LJLIL;
        if (str2 == null) {
            str2 = "";
        }
        C225248si.LJIJJLI(Integer.valueOf(i), str2, "failed");
    }
}
