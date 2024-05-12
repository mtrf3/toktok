package X;

import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.22j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C520122j extends AbstractC65781Prl implements InterfaceC88471Ynr<C1WN, C11630cx, C76800UCe> {
    public static final C520122j LJLIL = new C520122j();

    public C520122j() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(C1WN c1wn, C11630cx c11630cx) {
        Path.FillType fillType;
        C1WN set = c1wn;
        int i = c11630cx.LIZ;
        o.LJIIIZ(set, "$this$set");
        Path path = set.LJIJ.LIZIZ;
        if (i == 1) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
        set.LIZJ();
        return C76800UCe.LIZ;
    }
}
