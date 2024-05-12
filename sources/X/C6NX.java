package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.6NX, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6NX<T extends StickerModel> {
    public final Context LIZ;
    public final C6NZ LIZIZ;

    public abstract String LIZ(T t);

    public abstract View LIZIZ(T t);

    public abstract EnumC157656Gr LIZLLL();

    public abstract T LJ(T t, int i, int i2);

    public C6NX(Context context, C6NZ params) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(params, "params");
        this.LIZ = context;
        this.LIZIZ = params;
    }

    public final String LIZJ(T t, long j) {
        boolean z;
        String compilePath = t.getBaseSticker().getCompilePath();
        if (compilePath.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            compilePath = LIZ(t);
            t.getBaseSticker().setCompilePath(compilePath);
        }
        File file = new File(compilePath);
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    C44687HgJ.LJIILIIL(compilePath);
                } else {
                    C16880lQ.LLLZZIL(file);
                }
            }
        } catch (Exception e) {
            long currentTimeMillis = System.currentTimeMillis() - j;
            String name = LIZLLL().name();
            StringBuilder LIZ = X1D.LIZ();
            C159316Nb.LIZ(currentTimeMillis, name, KMP.LJFF(LIZ, "getOrCreateOutputPath error -> ", e, LIZ), false);
            C16880lQ.LLLLIIL(e);
        }
        return compilePath;
    }
}
