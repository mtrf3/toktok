package X;

import android.content.Context;

/* renamed from: X.W5l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81721W5l implements W65 {
    public volatile C81706W4w LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ C61093NyL LIZJ = null;

    public final C81706W4w LIZ() {
        if (this.LIZ == null) {
            synchronized (this) {
                if (this.LIZ == null) {
                    this.LIZ = new C81706W4w(this.LIZIZ, this.LIZJ);
                }
            }
        }
        return this.LIZ;
    }

    public C81721W5l(Context context) {
        this.LIZIZ = context;
    }
}
