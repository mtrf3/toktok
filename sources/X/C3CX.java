package X;

import androidx.lifecycle.Observer;
import com.bytedance.android.widget.NextLiveData;

/* renamed from: X.3CX, reason: invalid class name */
/* loaded from: classes2.dex */
public class C3CX<T> implements Observer<T> {
    public final int LJLIL;
    public final Observer<T> LJLILLLLZI;
    public final boolean LJLJI;
    public final /* synthetic */ NextLiveData LJLJJI;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(T t) {
        if (!this.LJLJI && this.LJLIL >= this.LJLJJI.mLatestVersion) {
            return;
        }
        this.LJLILLLLZI.onChanged(t);
    }

    public C3CX(NextLiveData nextLiveData, int i, Observer<T> observer, boolean z) {
        this.LJLJJI = nextLiveData;
        this.LJLIL = i;
        this.LJLILLLLZI = observer;
        this.LJLJI = z;
    }
}
