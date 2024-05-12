package X;

import com.bytedance.ies.smartmovie.jni.Meta;
import kotlin.jvm.internal.o;

/* renamed from: X.HoU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45194HoU extends AbstractC65781Prl implements InterfaceC88472Yns<Meta, CharSequence> {
    public static final C45194HoU LJLIL = new C45194HoU();

    public C45194HoU() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(Meta meta) {
        String LIZLLL = meta.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "it.path");
        return LIZLLL;
    }
}
