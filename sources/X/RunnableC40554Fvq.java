package X;

import android.content.Context;

/* renamed from: X.Fvq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC40554Fvq implements Runnable {
    public final /* synthetic */ Context LJLIL;

    public RunnableC40554Fvq(Context context) {
        this.LJLIL = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        C40551Fvn c40551Fvn;
        try {
            Context context = this.LJLIL;
            synchronized (C40551Fvn.class) {
                if (C40551Fvn.LJIIIZ == null) {
                    C40551Fvn.LJIIIZ = new C40551Fvn(context, EnumC39661FhR.a);
                }
                c40551Fvn = C40551Fvn.LJIIIZ;
            }
            c40551Fvn.LIZJ(true);
        } finally {
            if (LIZ) {
            }
        }
    }
}
