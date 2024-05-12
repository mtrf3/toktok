package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3qa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96523qa extends AbstractC65781Prl implements InterfaceC65784Pro<C96533qb> {
    public static final C96523qa LJLIL = new C96523qa();

    public C96523qa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C96533qb invoke() {
        int LIZIZ = C7MY.LIZIZ(56);
        Activity topActivity = ActivityStack.getTopActivity();
        o.LJIIIIZZ(topActivity, "getTopActivity()");
        return new C96533qb(0, LIZIZ, 0, 0, 42, 16, 51, AnonymousClass636.LJIIIIZZ(R.attr.gu, topActivity), R.attr.gu, C7MY.LIZIZ(3), 51, 0, null, 28813);
    }
}
