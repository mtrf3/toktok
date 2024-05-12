package X;

import android.view.View;

/* renamed from: X.HZk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44280HZk implements InterfaceC44281HZl {
    public final /* synthetic */ View LIZ;
    public final /* synthetic */ C44277HZh LIZIZ;

    @Override // X.InterfaceC44281HZl
    public final void onDetach() {
        C44277HZh c44277HZh = this.LIZIZ;
        C44273HZd.LIZIZ(c44277HZh.LIZ, c44277HZh.LIZJ.getTag());
        View view = this.LIZ;
        if (view != null) {
            C78932UyO.LJFF(view);
        }
    }

    public C44280HZk(C44277HZh c44277HZh, View view) {
        this.LIZIZ = c44277HZh;
        this.LIZ = view;
    }
}
