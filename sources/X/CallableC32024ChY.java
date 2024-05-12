package X;

import com.bytedance.ies.mvp.presenter.MvpPresenter;
import java.util.concurrent.Callable;

/* renamed from: X.ChY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CallableC32024ChY implements Callable {
    public final /* synthetic */ Object[] LJLIL;
    public final /* synthetic */ MvpPresenter LJLILLLLZI;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.LJLILLLLZI.doWork(this.LJLIL);
    }

    public CallableC32024ChY(MvpPresenter mvpPresenter, Object[] objArr) {
        this.LJLILLLLZI = mvpPresenter;
        this.LJLIL = objArr;
    }
}
