package X;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.O7v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C61399O7v extends ThreadLocal<SimpleDateFormat> {
    @Override // java.lang.ThreadLocal
    public final SimpleDateFormat initialValue() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
    }
}
