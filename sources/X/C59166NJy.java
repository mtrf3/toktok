package X;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.NJy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59166NJy implements OIJ {
    public final File LIZ;
    public final AssetManager LIZIZ;
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);

    @Override // X.OIJ
    public final String LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("asset:///");
        LIZ.append(this.LIZ);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.OIJ
    public final java.util.Map<String, Long> LIZIZ() {
        return Collections.emptyMap();
    }

    @Override // X.OIJ
    public final InputStream LIZJ(String str) {
        if (!this.LIZJ.get()) {
            OC6.LIZ("WebOffline-falcon", "AssetResLoader ready to load, file:", str);
            return this.LIZIZ.open(new File(this.LIZ, str).getPath());
        }
        throw new RuntimeException("released!");
    }

    public C59166NJy(Context context, File file) {
        this.LIZ = file;
        this.LIZIZ = context.getAssets();
    }
}
