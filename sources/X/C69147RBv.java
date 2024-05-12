package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.verify.VerifyEmailCodeFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.RBv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69147RBv extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ VerifyEmailCodeFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69147RBv(VerifyEmailCodeFragment verifyEmailCodeFragment) {
        super(0);
        this.LJLIL = verifyEmailCodeFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Bundle arguments = this.LJLIL.getArguments();
        o.LJI(arguments);
        return Boolean.valueOf(arguments.getBoolean("from_ProAccount"));
    }
}
