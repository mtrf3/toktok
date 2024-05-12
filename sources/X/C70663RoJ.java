package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.RoJ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70663RoJ {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final InterfaceC70422pa LIZLLL;
    public final Context LJ;
    public Drawable LJFF;

    public final void LIZ(Drawable drawable) {
        C69958Rcw c69958Rcw;
        ConcurrentHashMap<String, C69958Rcw> concurrentHashMap = C70660RoG.LIZLLL.get(this.LIZ);
        if (concurrentHashMap != null && (c69958Rcw = concurrentHashMap.get(this.LIZIZ)) != null) {
            SmartImageView smartImageView = c69958Rcw.LIZJ.get();
            if (smartImageView != null && o.LJ(smartImageView.getTag(-1420091667), this.LIZIZ)) {
                try {
                    V92 hierarchy = smartImageView.getHierarchy();
                    if (hierarchy != null) {
                        hierarchy.LJIJJ(drawable, InterfaceC78716Uuu.LJJL);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("LowImgLoadTask: setPlaceholderImage ");
                    LIZ.append(this.LIZIZ);
                    X1D.LIZIZ(LIZ);
                    return;
                }
            }
            concurrentHashMap.remove(this.LIZIZ);
        }
    }

    public C70663RoJ(AwemeHostApplication context, String pid, String key, String url, InterfaceC70422pa coroutineScope) {
        o.LJIIIZ(pid, "pid");
        o.LJIIIZ(key, "key");
        o.LJIIIZ(url, "url");
        o.LJIIIZ(coroutineScope, "coroutineScope");
        o.LJIIIZ(context, "context");
        this.LIZ = pid;
        this.LIZIZ = key;
        this.LIZJ = url;
        this.LIZLLL = coroutineScope;
        this.LJ = context;
    }
}
