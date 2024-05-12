package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS18S0200100_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Xds, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85304Xds extends AbstractC65781Prl implements InterfaceC88472Yns<ARH, C76800UCe> {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C85258Xd8 LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85304Xds(ActivityC45651qj activityC45651qj, long j, C85258Xd8 c85258Xd8, C85302Xdq c85302Xdq) {
        super(1);
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = j;
        this.LJLJI = c85258Xd8;
        this.LJLJJI = c85302Xdq;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARH arh) {
        ARH buttonGroup = arh;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        buttonGroup.LJFF(C03660Ck.LIZ(this.LJLIL, R.string.ce7, "activity).resources.getS…ng(R.string.btn_continue)"), new AqS18S0200100_15(this.LJLILLLLZI, (long) this.LJLJI, (C85258Xd8) this.LJLJJI, (InterfaceC65784Pro<C76800UCe>) 0));
        return C76800UCe.LIZ;
    }
}
