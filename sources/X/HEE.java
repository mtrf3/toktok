package X;

import com.ss.android.ttve.nativePort.TEVideoUtils;

/* loaded from: classes8.dex */
public final class HEE<T> implements InterfaceC86003Zc {
    public final /* synthetic */ HEF LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJI = 0;
    public final /* synthetic */ int LJLJJL = 0;
    public final /* synthetic */ int LJLJJLL = -1;

    public HEE(HED hed, String str, String str2) {
        this.LJLIL = hed;
        this.LJLILLLLZI = str;
        this.LJLJJI = str2;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<Integer> interfaceC73573Su9) {
        if (interfaceC73573Su9.isDisposed()) {
            interfaceC73573Su9.onError(new IllegalStateException("The job is disposed."));
        }
        this.LJLIL.onStart();
        interfaceC73573Su9.onNext(Integer.valueOf(TEVideoUtils.nativeFindAudioSegmentStartTimeInOrigin(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL)));
        interfaceC73573Su9.onComplete();
    }
}
