package X;

import android.content.ContentResolver;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;

/* renamed from: X.0Qu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07400Qu {
    public static ParcelFileDescriptor LIZ(ContentResolver contentResolver, android.net.Uri uri, String str, CancellationSignal cancellationSignal) {
        return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
    }
}
