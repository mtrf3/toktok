package X;

import android.content.Context;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O96 implements O98 {
    public final O99 LIZ;

    @Override // X.O98
    public final void LIZ(Integer num, String str) {
    }

    public O96(O99 lynCreator) {
        o.LJIIIZ(lynCreator, "lynCreator");
        this.LIZ = lynCreator;
    }

    @Override // X.O98
    public final O97 LIZIZ(Context context, String str, C60825Nu1 c60825Nu1, O93 o93) {
        return new O97(this.LIZ.LIZ(context, str, new AqS141S0200000_10(c60825Nu1, o93, 80)), false);
    }
}
