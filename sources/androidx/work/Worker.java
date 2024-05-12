package androidx.work;

import X.C0CS;
import X.C43731nd;
import Y.IDRunnableS85S0100000;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    public C43731nd<C0CS> LJLJJLL;

    public abstract C0CS LJII();

    @Override // androidx.work.ListenableWorker
    public final C43731nd LJ() {
        this.LJLJJLL = new C43731nd<>();
        this.LJLILLLLZI.LIZJ.execute(new IDRunnableS85S0100000(this, 35));
        return this.LJLJJLL;
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
