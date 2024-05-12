package X;

import android.content.Context;

/* loaded from: classes6.dex */
public interface BTW {
    boolean LIZJ(Context context, android.net.Uri uri, java.util.Map<String, String> map);

    boolean canHandle(android.net.Uri uri);

    boolean handle(Context context, android.net.Uri uri);
}
