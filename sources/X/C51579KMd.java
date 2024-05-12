package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.KMd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51579KMd extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C51579KMd LJLIL = new C51579KMd();

    public C51579KMd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Object value = C52904KpY.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-value>(...)");
        return Boolean.valueOf(TextUtils.equals((String) value, "1"));
    }
}
