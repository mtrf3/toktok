package X;

import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import kotlin.jvm.internal.AqS0S0011000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.6yR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177836yR extends AbstractC65781Prl implements InterfaceC88472Yns<C177616y5, C76800UCe> {
    public final /* synthetic */ KeyboardVMV2 LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C177836yR(KeyboardVMV2 keyboardVMV2, boolean z, int i) {
        super(1);
        this.LJLIL = keyboardVMV2;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C177616y5 c177616y5) {
        C177616y5 it = c177616y5;
        o.LJIIIZ(it, "it");
        if (!(it.LJLJJI instanceof C177876yV)) {
            this.LJLIL.iv0(C177906yY.LIZ, false);
            this.LJLIL.setState(new AqS0S0011000_3(this.LJLILLLLZI, this.LJLJI, 0));
        }
        return C76800UCe.LIZ;
    }
}
