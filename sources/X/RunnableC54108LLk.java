package X;

/* renamed from: X.LLk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC54108LLk implements Runnable {
    public final /* synthetic */ C54105LLh LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public RunnableC54108LLk(C54105LLh c54105LLh, String str, String str2, boolean z) {
        this.LJLIL = c54105LLh;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.LJJJI(this.LJLILLLLZI, this.LJLJI);
        } finally {
            if (LIZ) {
            }
        }
    }
}
