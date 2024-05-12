package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MBE {
    public static MBA LIZ(MBA mba, MBA context) {
        o.LJIIIZ(context, "context");
        if (context == MBB.INSTANCE) {
            return mba;
        }
        return (MBA) context.fold(mba, MBG.LJLIL);
    }
}
