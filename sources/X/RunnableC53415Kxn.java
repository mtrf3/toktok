package X;

import com.bytedance.keva.Keva;

/* renamed from: X.Kxn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC53415Kxn implements Runnable {
    public final /* synthetic */ String LJLIL;

    public RunnableC53415Kxn(String str) {
        this.LJLIL = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            Keva keva = C53414Kxm.LJLJI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("page_token_");
            LIZ2.append(C53414Kxm.LJLJJI);
            String LIZIZ = X1D.LIZIZ(LIZ2);
            String str = this.LJLIL;
            if (str == null) {
                str = "";
            }
            keva.storeString(LIZIZ, str);
        } finally {
            if (LIZ) {
            }
        }
    }
}
