package X;

import com.google.android.gms.cast.internal.zza;

/* renamed from: X.Zf4, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class RunnableC90474Zf4 implements Runnable {
    public final /* synthetic */ C90909Zm5 LJLIL;
    public final /* synthetic */ zza LJLILLLLZI;

    public RunnableC90474Zf4(C90909Zm5 c90909Zm5, zza zzaVar) {
        this.LJLIL = c90909Zm5;
        this.LJLILLLLZI = zzaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        boolean z;
        try {
            C90909Zm5 c90909Zm5 = this.LJLIL;
            String str = this.LJLILLLLZI.zza;
            if (!C90468Zey.LJFF(str, c90909Zm5.LLIIZ)) {
                c90909Zm5.LLIIZ = str;
                z = true;
            } else {
                z = false;
            }
            C90909Zm5.LLIZLLLIL.getClass();
            C90218Zaw c90218Zaw = c90909Zm5.LLIIJI;
            if (c90218Zaw != null && (z || c90909Zm5.LLILII)) {
                c90218Zaw.LIZLLL();
            }
            c90909Zm5.LLILII = false;
        } finally {
            if (LIZ) {
            }
        }
    }
}
