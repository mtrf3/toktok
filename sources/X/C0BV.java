package X;

import android.content.Context;

/* renamed from: X.0BV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0BV {
    public static <T extends AbstractC03300Ba> C0BW<T> LIZ(Context context, Class<T> cls, String str) {
        if (str != null && str.trim().length() != 0) {
            return new C0BW<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }
}
