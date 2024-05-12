package X;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.AWw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26378AWw {
    public static final void LIZ(Context context, String filePath) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(filePath, "filePath");
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(android.net.Uri.fromFile(new File(filePath)));
        context.sendBroadcast(intent);
    }
}
