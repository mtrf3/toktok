package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OaD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62145OaD extends AbstractC65781Prl implements InterfaceC88472Yns<String, String> {
    public static final C62145OaD LJLIL = new C62145OaD();

    public C62145OaD() {
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
