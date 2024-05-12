package X;

import com.bytedance.pipo.checkout.pux.theme.compose.theme.interfaze.IComponentProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.a00, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final /* synthetic */ class C91772a00 {
    public static int LIZ(IComponentProvider iComponentProvider, IComponentProvider other) {
        o.LJIIIZ(other, "other");
        return other.getPriority() - iComponentProvider.getPriority();
    }
}
