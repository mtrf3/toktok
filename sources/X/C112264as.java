package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.IDqS448S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4as, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112264as implements LEA {
    public final /* synthetic */ InterfaceC88474Ynu LJLIL;

    public C112264as(IDqS448S0100000_1 function) {
        o.LJIIIZ(function, "function");
        this.LJLIL = function;
    }

    @Override // X.LEA
    public final /* synthetic */ void onAccountResult(int i, boolean z, int i2, User user) {
        this.LJLIL.invoke(Integer.valueOf(i), Boolean.valueOf(z), 0, user);
    }
}
