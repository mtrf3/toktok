package X;

import com.bytedance.ies.nle.editor_jni.NLEAlgorithmPath;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.5NG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5NG extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C133795Mx LJLIL;
    public final /* synthetic */ C76732zl LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ NLEAlgorithmPath LJLJJLL;
    public final /* synthetic */ CountDownLatch LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5NG(C133795Mx c133795Mx, C76732zl c76732zl, String str, int i, int i2, NLEAlgorithmPath nLEAlgorithmPath, CountDownLatch countDownLatch) {
        super(0);
        this.LJLIL = c133795Mx;
        this.LJLILLLLZI = c76732zl;
        this.LJLJI = str;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        this.LJLJJLL = nLEAlgorithmPath;
        this.LJLJL = countDownLatch;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLILLLLZI.element = this.LJLIL.LJIJ(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
        this.LJLJL.countDown();
        return C76800UCe.LIZ;
    }
}
