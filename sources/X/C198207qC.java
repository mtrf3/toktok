package X;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.7qC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198207qC extends AbstractC65781Prl implements InterfaceC65784Pro<SimpleDateFormat> {
    public static final C198207qC LJLIL = new C198207qC();

    public C198207qC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final SimpleDateFormat invoke() {
        return new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
    }
}
