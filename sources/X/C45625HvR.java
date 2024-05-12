package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.HvR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45625HvR implements InterfaceC45559HuN {
    @Override // X.InterfaceC45559HuN
    public void callback(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        C62822Ol8 c62822Ol8 = C51549KKz.LIZ;
        if (!((Keva) c62822Ol8.getValue()).getBoolean("keva_key_tips", false)) {
            C51549KKz.LIZJ(activity);
            ((Keva) c62822Ol8.getValue()).storeBoolean("keva_key_tips", true);
        }
    }
}
