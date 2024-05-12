package X;

import androidx.lifecycle.Observer;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import kotlin.jvm.internal.o;

/* renamed from: X.Crw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32668Crw<T> implements Observer<T> {
    public final InterfaceC88472Yns<T, C76800UCe> LJLIL;
    public final boolean LJLILLLLZI;
    public final NextLiveData<T> LJLJI;
    public final int LJLJJI;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(T t) {
        if (!this.LJLILLLLZI && this.LJLJJI >= this.LJLJI.getMLatestVersion$live_datachannel_release()) {
            return;
        }
        this.LJLIL.invoke(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C32668Crw(InterfaceC88472Yns<? super T, C76800UCe> observer, boolean z, NextLiveData<T> liveData) {
        o.LJIIIZ(observer, "observer");
        o.LJIIIZ(liveData, "liveData");
        this.LJLIL = observer;
        this.LJLILLLLZI = z;
        this.LJLJI = liveData;
        this.LJLJJI = liveData.getMLatestVersion$live_datachannel_release();
    }
}
