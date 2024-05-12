package X;

/* renamed from: X.VKt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class RunnableC79571VKt implements Runnable {
    public final /* synthetic */ C79570VKs LJLIL;

    public final void LIZ() {
        try {
            Runnable poll = this.LJLIL.LJLJJI.poll();
            if (poll != null) {
                poll.run();
            } else {
                W58.LJIIJJI(C79570VKs.LJLJLJ, "%s: Worker has nothing to run", this.LJLIL.LJLIL);
            }
            int decrementAndGet = this.LJLIL.LJLJJLL.decrementAndGet();
            if (!this.LJLIL.LJLJJI.isEmpty()) {
                this.LJLIL.LIZ();
            } else {
                W58.LJIIL(C79570VKs.LJLJLJ, "%s: worker finished; %d workers left", this.LJLIL.LJLIL, Integer.valueOf(decrementAndGet));
            }
        } catch (Throwable th) {
            int decrementAndGet2 = this.LJLIL.LJLJJLL.decrementAndGet();
            if (!this.LJLIL.LJLJJI.isEmpty()) {
                this.LJLIL.LIZ();
            } else {
                W58.LJIIL(C79570VKs.LJLJLJ, "%s: worker finished; %d workers left", this.LJLIL.LJLIL, Integer.valueOf(decrementAndGet2));
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC79571VKt(C79570VKs c79570VKs) {
        this.LJLIL = c79570VKs;
    }
}
