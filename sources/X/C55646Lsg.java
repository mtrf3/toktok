package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.utils.ActivityStack;

/* renamed from: X.Lsg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55646Lsg extends AbstractC65781Prl implements InterfaceC65784Pro<Activity> {
    public static final C55646Lsg LJLIL = new C55646Lsg();

    public C55646Lsg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Activity invoke() {
        return ActivityStack.getTopActivity();
    }
}
