package X;

import com.ss.android.ugc.aweme.image.model.ImageSynthesisResult;
import kotlin.jvm.internal.o;

/* renamed from: X.5xK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151665xK extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ RunnableC151315wl LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C151665xK(RunnableC151315wl runnableC151315wl, int i, int i2) {
        super(0);
        this.LJLIL = runnableC151315wl;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        InterfaceC88472Yns<ImageSynthesisResult, C76800UCe> interfaceC88472Yns = this.LJLIL.LJLJJL;
        if (interfaceC88472Yns != null) {
            String str = this.LJLIL.LJLJI;
            o.LJI(str);
            interfaceC88472Yns.invoke(new ImageSynthesisResult(str, this.LJLILLLLZI, this.LJLJI));
        }
        return C76800UCe.LIZ;
    }
}
