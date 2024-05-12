package X;

import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8mb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221458mb extends AbstractC65781Prl implements InterfaceC88472Yns<C221298mL, C221298mL> {
    public final /* synthetic */ VideoExposeSharerInformationVM LJLIL;
    public final /* synthetic */ C76732zl LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;
    public final /* synthetic */ C34K LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ C34K LJLJJLL;
    public final /* synthetic */ boolean LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C221458mb(VideoExposeSharerInformationVM videoExposeSharerInformationVM, C76732zl c76732zl, C76732zl c76732zl2, C34K c34k, String str, C34K c34k2, boolean z) {
        super(1);
        this.LJLIL = videoExposeSharerInformationVM;
        this.LJLILLLLZI = c76732zl;
        this.LJLJI = c76732zl2;
        this.LJLJJI = c34k;
        this.LJLJJL = str;
        this.LJLJJLL = c34k2;
        this.LJLJL = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C221298mL invoke(C221298mL c221298mL) {
        C221298mL setState = c221298mL;
        o.LJIIIZ(setState, "$this$setState");
        boolean sv0 = this.LJLIL.sv0();
        C221298mL LIZ = C221298mL.LIZ(setState, null, null, null, null, null, this.LJLJJL, this.LJLILLLLZI.element, this.LJLJI.element, false, sv0, this.LJLJJI.element, null, 2335);
        C34K c34k = this.LJLJJLL;
        VideoExposeSharerInformationVM videoExposeSharerInformationVM = this.LJLIL;
        boolean z = this.LJLJL;
        if (c34k.element) {
            videoExposeSharerInformationVM.getClass();
            videoExposeSharerInformationVM.setState(new AqS8S0010000_3(z, 31));
        }
        return LIZ;
    }
}
