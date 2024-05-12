package X;

import java.text.SimpleDateFormat;

/* renamed from: X.R1r, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C68883R1r extends ThreadLocal<SimpleDateFormat> {
    @Override // java.lang.ThreadLocal
    public final SimpleDateFormat initialValue() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
