package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.3hE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90723hE extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C43I<? extends String>, C76800UCe> {
    public static final C90723hE LJLIL = new C90723hE();

    public C90723hE() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, C43I<? extends String> c43i) {
        Context context;
        Activity LJIJJ;
        UIAssem selectSubscribe = uIAssem;
        C43I<? extends String> it = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (((CharSequence) it.LIZ).length() > 0 && (context = selectSubscribe.getContext()) != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            C26045AKb c26045AKb = new C26045AKb(LJIJJ);
            c26045AKb.LJIIIZ((CharSequence) it.LIZ);
            c26045AKb.LJIIJ();
        }
        return C76800UCe.LIZ;
    }
}
