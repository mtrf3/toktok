package X;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.FhH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39651FhH {
    public final C39649FhF LIZ;

    public C39651FhH(C39649FhF c39649FhF) {
        this.LIZ = c39649FhF;
    }

    public final synchronized void LIZ(Context context, java.util.Set<File> set) {
        AssetManager assets = context.getAssets();
        Iterator it = ((HashSet) set).iterator();
        while (it.hasNext()) {
            ((Integer) C40654FxS.LIZ(assets, "addAssetPath", Integer.class, String.class, ((File) it.next()).getPath())).intValue();
        }
    }
}
