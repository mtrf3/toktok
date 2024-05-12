package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.MiV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57563MiV extends AbstractC65781Prl implements InterfaceC88472Yns<String, String> {
    public static final C57563MiV LJLIL = new C57563MiV();

    public C57563MiV() {
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
