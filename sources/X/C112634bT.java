package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4bT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112634bT extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C112634bT(String str, String str2, String str3, String str4) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN arn) {
        ARN it = arn;
        o.LJIIIZ(it, "it");
        String valueOf = String.valueOf(R.string.pjj);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("rule_id", this.LJLIL);
        c188727au.LJIIIZ("push_label", this.LJLILLLLZI);
        c188727au.LJIIIZ("anchor_id", this.LJLJI);
        c188727au.LJIIIZ("room_id", this.LJLJJI);
        FMX.LJIIL(valueOf, c188727au.LIZ);
        it.LIZ().LIZIZ(null);
        return C76800UCe.LIZ;
    }
}
