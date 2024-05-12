package X;

/* renamed from: X.PCo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractRunnableC64070PCo implements Runnable {
    public final long LJLIL;
    public final boolean LJLILLLLZI;
    public final long LJLJI;

    public AbstractRunnableC64070PCo() {
        this(0L);
    }

    public AbstractRunnableC64070PCo(long j) {
        this(j, 0L);
    }

    public AbstractRunnableC64070PCo(long j, long j2) {
        this.LJLIL = j;
        this.LJLJI = j2;
        if (j2 > 0) {
            this.LJLILLLLZI = true;
        }
    }
}
