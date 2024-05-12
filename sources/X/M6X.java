package X;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes10.dex */
public final class M6X {
    public static final List<String> LIZ = new ArrayList();

    public static void LIZ(Intent intent) {
        intent.putExtra("from_notification", true);
        String uuid = UUID.randomUUID().toString();
        ((ArrayList) LIZ).add(uuid);
        intent.putExtra("from_notification_uuid", uuid);
    }
}
