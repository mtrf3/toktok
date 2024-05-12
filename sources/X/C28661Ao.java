package X;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import java.util.List;

/* renamed from: X.1Ao, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28661Ao extends AnonymousClass084 {
    @Override // X.AnonymousClass084
    public final ProviderInfo LIZ(ResolveInfo resolveInfo) {
        return resolveInfo.providerInfo;
    }

    @Override // X.AnonymousClass084
    public final List LIZJ(PackageManager packageManager, Intent intent) {
        return packageManager.queryIntentContentProviders(intent, 0);
    }
}
