package X;

import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3rl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97253rl extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup.MarginLayoutParams, C76800UCe> {
    public static final C97253rl LJLIL = new C97253rl();

    public C97253rl() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ViewGroup.MarginLayoutParams marginLayoutParams) {
        ViewGroup.MarginLayoutParams configMarginLayoutParams = marginLayoutParams;
        o.LJIIIZ(configMarginLayoutParams, "$this$configMarginLayoutParams");
        configMarginLayoutParams.setMarginStart(C97343ru.LJ(R.dimen.vl) - C97343ru.LJ(R.dimen.v3));
        return C76800UCe.LIZ;
    }
}
