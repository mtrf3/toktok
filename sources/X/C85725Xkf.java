package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Xkf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85725Xkf extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ InputCodeFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85725Xkf(InputCodeFragment inputCodeFragment) {
        super(0);
        this.LJLIL = inputCodeFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Bundle arguments = this.LJLIL.getArguments();
        o.LJI(arguments);
        return Boolean.valueOf(arguments.getBoolean("from_ProAccount", false));
    }
}
