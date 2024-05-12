package X;

import android.content.Context;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;

/* renamed from: X.2Zy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60742Zy extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C60742Zy LJLIL = new C60742Zy();

    public C60742Zy() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Context topActivity = ActivityStack.getTopActivity();
        if (topActivity == null) {
            topActivity = EF7.LIZIZ();
        }
        return Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.gu, topActivity));
    }
}
