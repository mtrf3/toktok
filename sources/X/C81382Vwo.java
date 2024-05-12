package X;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: X.Vwo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81382Vwo extends AbstractC81781W7t {
    public final Resources LIZJ;

    @Override // X.AbstractC81781W7t
    public final String LJ() {
        return "LocalResourceFetchProducer";
    }

    @Override // X.AbstractC81781W7t
    public final W8X LIZLLL(W5O w5o) {
        int i;
        InputStream openRawResource = this.LIZJ.openRawResource(Integer.parseInt(w5o.LIZIZ.getPath().substring(1)));
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.LIZJ.openRawResourceFd(Integer.parseInt(w5o.LIZIZ.getPath().substring(1)));
            i = (int) assetFileDescriptor.getLength();
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        } catch (Resources.NotFoundException unused2) {
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
        return LIZJ(openRawResource, i);
    }

    public C81382Vwo(Executor executor, W84 w84, Resources resources) {
        super(executor, w84);
        this.LIZJ = resources;
    }
}
