package X;

import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel$launchShowGuideJob$1", f = "SlideGuideViewModel.kt", l = {228}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class LNC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ SlideGuideViewModel LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LNC(boolean z, long j, String str, SlideGuideViewModel slideGuideViewModel, InterfaceC67352kd<? super LNC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = z;
        this.LJLJI = j;
        this.LJLJJI = str;
        this.LJLJJL = slideGuideViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new LNC(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0049. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d9  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LNC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
