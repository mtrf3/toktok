package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OcI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62274OcI extends AbstractC65781Prl implements InterfaceC88472Yns<String, String> {
    public static final C62274OcI LJLIL = new C62274OcI();

    public C62274OcI() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(String tag) {
        o.LJIIIZ(tag, "tag");
        if (o.LJ(tag, "more")) {
            return EF7.LIZIZ().getString(R.string.h33);
        }
        return null;
    }
}
