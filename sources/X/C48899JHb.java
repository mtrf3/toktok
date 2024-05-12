package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.JHb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48899JHb {
    public static final /* synthetic */ int LIZLLL = 0;
    public Aweme LIZ;
    public boolean LIZIZ;
    public InterfaceC48908JHk LIZJ;

    public final void LIZ(Aweme aweme, C48883JGl c48883JGl, boolean z, EnumC48901JHd synergyActions) {
        InterfaceC48908JHk interfaceC48908JHk;
        o.LJIIIZ(synergyActions, "synergyActions");
        if (!o.LJ(this.LIZ, aweme)) {
            int i = C48900JHc.LIZ[synergyActions.ordinal()];
            if (i != 1) {
                if (i == 2 && (interfaceC48908JHk = this.LIZJ) != null) {
                    interfaceC48908JHk.LLLLLJLJLL();
                }
            } else {
                InterfaceC48908JHk interfaceC48908JHk2 = this.LIZJ;
                if (interfaceC48908JHk2 != null) {
                    interfaceC48908JHk2.LJIILL();
                }
            }
        }
        if (aweme != null) {
            new WeakReference(aweme);
        } else {
            aweme = null;
        }
        this.LIZ = aweme;
        this.LIZJ = c48883JGl;
        this.LIZIZ = z;
    }
}
