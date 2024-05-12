package X;

import java.io.Serializable;

/* loaded from: classes7.dex */
public final /* synthetic */ class FUB implements Runnable, Serializable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ float LJLJI;

    public /* synthetic */ FUB(String str, String str2, float f) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C64235PIx.LIZIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
    }
}
