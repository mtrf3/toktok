package X;

import android.app.RemoteInput;

/* renamed from: X.06c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C020206c {
    public static int LIZ(Object obj) {
        return ((RemoteInput) obj).getEditChoicesBeforeSending();
    }

    public static RemoteInput.Builder LIZIZ(RemoteInput.Builder builder, int i) {
        return builder.setEditChoicesBeforeSending(i);
    }
}
