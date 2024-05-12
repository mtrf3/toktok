package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T57 implements InterfaceC43690HCs {
    public final /* synthetic */ T55 LIZ;

    public T57(T55 t55) {
        this.LIZ = t55;
    }

    @Override // X.InterfaceC43690HCs
    public final void LIZ(String str) {
        T58 LIZ = NTK.LIZ();
        if (LIZ != null) {
            Context context = this.LIZ.LJIIZILJ;
            if (context != null) {
                LIZ.openAdOpenUrl(context, str, false);
            } else {
                o.LJIJI("mContext");
                throw null;
            }
        }
    }
}
