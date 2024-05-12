package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aVz, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class RunnableC93755aVz implements Runnable {
    public final /* synthetic */ C93566aSw LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public RunnableC93755aVz(C93566aSw c93566aSw, String str) {
        this.LJLIL = c93566aSw;
        this.LJLILLLLZI = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C94441ah3 c94441ah3 = this.LJLIL.LJLILLLLZI;
            if (c94441ah3 != null) {
                String str = this.LJLILLLLZI;
                c94441ah3.LJII(str.length(), str);
            } else {
                o.LJIJI("simpleEditText");
                throw null;
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
