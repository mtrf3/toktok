package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.X9y, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84386X9y<T> {
    public final long LIZ;
    public final C62822Ol8 LIZIZ;
    public final String LIZJ;
    public final InterfaceC78962Uys<T> LIZLLL;

    public final DiskLruCache LIZIZ() {
        return (DiskLruCache) this.LIZIZ.getValue();
    }

    public final C42348Gjg LIZ(String key) {
        o.LJIIIZ(key, "key");
        if (TextUtils.isEmpty(key)) {
            return null;
        }
        try {
            DiskLruCache.Snapshot snapshot = LIZIZ().get(MD5Utils.getMD5String(key));
            if (snapshot == null) {
                return null;
            }
            try {
                InputStream inputStream = snapshot.getInputStream(0);
                o.LJIIIIZZ(inputStream, "snapshot.getInputStream(0)");
                C42348Gjg LIZJ = this.LIZLLL.LIZJ(inputStream);
                inputStream.close();
                snapshot.close();
                return LIZJ;
            } catch (Throwable th) {
                snapshot.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean LIZLLL(String key) {
        DiskLruCache.Snapshot snapshot;
        o.LJIIIZ(key, "key");
        if (TextUtils.isEmpty(key) || (snapshot = LIZIZ().get(MD5Utils.getMD5String(key))) == null) {
            return false;
        }
        snapshot.close();
        return true;
    }

    public C84386X9y(Context context, String cacheDir, C78948Uye c78948Uye) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(cacheDir, "cacheDir");
        this.LIZJ = cacheDir;
        this.LIZLLL = c78948Uye;
        long LIZJ = C268513p.LIZJ(context);
        long j = 52428800;
        if (LIZJ <= 52428800) {
            j = 26214400;
            if (LIZJ <= 26214400) {
                j = 13107200;
                if (LIZJ <= 13107200) {
                    j = 10485760;
                }
            }
        }
        this.LIZ = j;
        this.LIZIZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 773));
    }

    public final void LIZJ(String key, C42348Gjg c42348Gjg, InterfaceC88472Yns onInsertFinish) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(onInsertFinish, "onInsertFinish");
        if (TextUtils.isEmpty(key)) {
            onInsertFinish.invoke(Boolean.FALSE);
            return;
        }
        try {
            DiskLruCache.Editor edit = LIZIZ().edit(MD5Utils.getMD5String(key));
            if (edit != null) {
                try {
                    OutputStream newOutputStream = edit.newOutputStream(0);
                    if (newOutputStream != null) {
                        this.LIZLLL.LJIIIIZZ(newOutputStream, c42348Gjg);
                        newOutputStream.flush();
                        newOutputStream.close();
                        edit.commit();
                        onInsertFinish.invoke(Boolean.TRUE);
                        LIZIZ().flush();
                    }
                } catch (Exception unused) {
                    if (edit != null) {
                        edit.abort();
                    }
                    onInsertFinish.invoke(Boolean.FALSE);
                }
            }
        } catch (Exception unused2) {
        }
    }
}
