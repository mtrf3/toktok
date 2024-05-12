package X;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: X.Vwp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81383Vwp extends AbstractC81781W7t {
    public final AssetManager LIZJ;

    @Override // X.AbstractC81781W7t
    public final String LJ() {
        return "LocalAssetFetchProducer";
    }

    @Override // X.AbstractC81781W7t
    public final W8X LIZLLL(W5O w5o) {
        int i;
        InputStream open = this.LIZJ.open(w5o.LIZIZ.getPath().substring(1), 2);
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.LIZJ.openFd(w5o.LIZIZ.getPath().substring(1));
            i = (int) assetFileDescriptor.getLength();
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            i = -1;
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
        return LIZJ(open, i);
    }

    public C81383Vwp(Executor executor, W84 w84, AssetManager assetManager) {
        super(executor, w84);
        this.LIZJ = assetManager;
    }
}
