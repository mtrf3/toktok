package X;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes13.dex */
public final class SU2 extends AbstractC65781Prl implements InterfaceC65784Pro<SimpleDateFormat> {
    public static final SU2 LJLIL = new SU2();

    public SU2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final SimpleDateFormat invoke() {
        return new SimpleDateFormat("mm:ss", Locale.getDefault());
    }
}
