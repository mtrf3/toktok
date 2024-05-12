package X;

import android.util.Base64;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ENU extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final ENU LJLIL = new ENU();

    public ENU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        byte[] decode = Base64.decode("YW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfQ09OVEFDVFM=", 0);
        o.LJIIIIZZ(decode, "decode(ENCODED_READ_CONT…RMISSION, Base64.DEFAULT)");
        return new String(decode, PVC.LIZ);
    }
}
