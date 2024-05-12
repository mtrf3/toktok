package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.Pcz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64865Pcz {
    public final Context LIZ;
    public List<String> LIZIZ = null;
    public final C48128Iui LIZJ;
    public final AbstractC64867Pd1 LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Config{mHeartBeatPolicy=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", mContext=");
        LIZ.append(this.LIZ);
        LIZ.append(", wsUrls=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mOkHttpClient=");
        LIZ.append((Object) null);
        LIZ.append(", mRetryPolicy=");
        LIZ.append(this.LIZJ);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public C64865Pcz(Context context, C48128Iui c48128Iui, AbstractC64867Pd1 abstractC64867Pd1) {
        this.LIZ = context;
        this.LIZJ = c48128Iui;
        this.LIZLLL = abstractC64867Pd1;
    }
}
