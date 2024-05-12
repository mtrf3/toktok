package X;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.OJn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C61703OJn extends ThreadLocal<DateFormat> {
    @Override // java.lang.ThreadLocal
    public final DateFormat initialValue() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(PVA.LJIILIIL);
        return simpleDateFormat;
    }
}
