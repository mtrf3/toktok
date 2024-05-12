package X;

import android.os.Process;

/* renamed from: X.Eas, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36706Eas extends ThreadLocal<Long> {
    @Override // java.lang.ThreadLocal
    public final Long initialValue() {
        return Long.valueOf(Process.myTid());
    }
}
