package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* renamed from: X.8gI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217548gI extends AbstractC65781Prl implements InterfaceC88472Yns<Fragment, C76800UCe> {
    public static final C217548gI INSTANCE = new C217548gI();

    public C217548gI() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        Context context = fragment.getContext();
        if (context != null) {
            OHI.LIZ.getClass();
            Intent LIZJ = OHI.LIZJ(context);
            C78598Ut0.LJIJJ(LIZJ, fragment);
            fragment.startActivity(LIZJ);
        }
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(Fragment fragment) {
        invoke2(fragment);
        return C76800UCe.LIZ;
    }
}
