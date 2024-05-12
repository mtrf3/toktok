package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.UZl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77405UZl implements InterfaceC77407UZn {
    public final /* synthetic */ C77403UZj LIZ;

    @Override // X.InterfaceC77407UZn
    public final void onFail() {
        C77403UZj c77403UZj = this.LIZ;
        c77403UZj.LJIIIIZZ = false;
        synchronized (c77403UZj.LJIIIZ) {
            Iterator<InterfaceC77407UZn> it = c77403UZj.LJII.iterator();
            while (it.hasNext()) {
                it.next().onFail();
            }
            ((ArrayList) c77403UZj.LJII).clear();
        }
    }

    @Override // X.InterfaceC77407UZn
    public final void onSuccess() {
        C77403UZj c77403UZj = this.LIZ;
        c77403UZj.LJIIIIZZ = false;
        synchronized (c77403UZj.LJIIIZ) {
            Iterator<InterfaceC77407UZn> it = c77403UZj.LJII.iterator();
            while (it.hasNext()) {
                it.next().onSuccess();
            }
            ((ArrayList) c77403UZj.LJII).clear();
        }
    }

    public C77405UZl(C77403UZj c77403UZj) {
        this.LIZ = c77403UZj;
    }
}
