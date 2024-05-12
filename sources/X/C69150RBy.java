package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.bind.BindEmailCodeVerifyFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.RBy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69150RBy extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ BindEmailCodeVerifyFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69150RBy(BindEmailCodeVerifyFragment bindEmailCodeVerifyFragment) {
        super(0);
        this.LJLIL = bindEmailCodeVerifyFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Bundle arguments = this.LJLIL.getArguments();
        o.LJI(arguments);
        return Boolean.valueOf(arguments.getBoolean("from_ProAccount"));
    }
}
