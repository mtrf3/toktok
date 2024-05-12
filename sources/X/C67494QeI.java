package X;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.QeI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67494QeI implements InterfaceC67507QeV<Date> {
    public static final DateFormat LIZ;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        LIZ = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // X.InterfaceC67511QeZ
    public final void LIZ(Object obj, InterfaceC67510QeY interfaceC67510QeY) {
        interfaceC67510QeY.LIZ(LIZ.format((Date) obj));
    }
}
