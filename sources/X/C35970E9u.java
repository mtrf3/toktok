package X;

import com.ss.android.ugc.aweme.follow.widget.api.IFollowWidgetApi;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.E9u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35970E9u {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C35969E9t.LJLIL);

    public static AbstractC73672Svk LIZ() {
        int i;
        if (o.LJ(a.LJFF().LJFF().getValue(), Boolean.TRUE) && C35971E9v.LIZ()) {
            i = 1;
        } else {
            i = 0;
        }
        return ((IFollowWidgetApi) LIZ.getValue()).getInterestUsers(2, 0L, 2, i);
    }
}
