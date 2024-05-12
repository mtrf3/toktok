package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.085, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass085 {
    public static C28721Au LIZ(Context context) {
        ApplicationInfo applicationInfo;
        AnonymousClass083 anonymousClass083 = new AnonymousClass083();
        PackageManager packageManager = context.getPackageManager();
        TMC.LJIIIZ(packageManager, "Package manager required to locate emoji font provider");
        Iterator it = anonymousClass083.LIZ.LIZJ(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT")).iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            ProviderInfo LIZ = anonymousClass083.LIZ.LIZ((ResolveInfo) it.next());
            if (LIZ != null && (applicationInfo = LIZ.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                try {
                    String str = LIZ.authority;
                    String str2 = LIZ.packageName;
                    Signature[] LIZIZ = anonymousClass083.LIZ.LIZIZ(packageManager, str2);
                    ArrayList arrayList = new ArrayList();
                    for (Signature signature : LIZIZ) {
                        arrayList.add(signature.toByteArray());
                    }
                    return new C28721Au(context, new C12120dk(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList)));
                } catch (PackageManager.NameNotFoundException e) {
                    android.util.Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                    return null;
                }
            }
        }
    }
}
