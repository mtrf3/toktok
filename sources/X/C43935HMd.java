package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.HMd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43935HMd extends AbstractC65781Prl implements InterfaceC88471Ynr<Context, Integer, C76800UCe> {
    public static final C43935HMd LJLIL = new C43935HMd();

    public C43935HMd() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Context context, Integer num) {
        Context activity = context;
        int intValue = num.intValue();
        o.LJIIIZ(activity, "activity");
        C45804HyK.LJJLIIIJJI(activity, intValue, 1000, 0, 24);
        return C76800UCe.LIZ;
    }
}
