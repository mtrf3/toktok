package X;

import android.content.Context;
import android.database.ContentObserver;
import android.graphics.Point;
import android.os.Handler;
import android.view.WindowManager;
import kotlin.jvm.internal.o;

/* renamed from: X.OiA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62638OiA extends ContentObserver {
    public final android.net.Uri LIZ;
    public final /* synthetic */ C62635Oi7 LIZIZ;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Point point;
        super.onChange(z);
        android.net.Uri contentUri = this.LIZ;
        Context context = (Context) this.LIZIZ.LJFF.LIZ(C62635Oi7.LJII[0]);
        long j = this.LIZIZ.LJ;
        o.LJIIIZ(contentUri, "contentUri");
        if (context == null) {
            C62657OiT.LIZIZ("context is null");
            return;
        }
        if (C62639OiB.LIZ == null) {
            try {
                point = new Point();
            } catch (Exception e) {
                e = e;
                point = null;
            }
            try {
                Object LLILL = C16880lQ.LLILL(context, "window");
                o.LJII(LLILL, "null cannot be cast to non-null type android.view.WindowManager");
                ((WindowManager) LLILL).getDefaultDisplay().getRealSize(point);
            } catch (Exception e2) {
                e = e2;
                C16880lQ.LLLLIIL(e);
                C62639OiB.LIZ = point;
                C68322mC c68322mC = new C68322mC();
                C10K.LIZJ(new CallableC45699Hwd(c68322mC, context, contentUri)).LJ(new C62640OiC(c68322mC, j), C10K.LJIIIIZZ, null);
            }
            C62639OiB.LIZ = point;
        }
        C68322mC c68322mC2 = new C68322mC();
        C10K.LIZJ(new CallableC45699Hwd(c68322mC2, context, contentUri)).LJ(new C62640OiC(c68322mC2, j), C10K.LJIIIIZZ, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62638OiA(C62635Oi7 c62635Oi7, android.net.Uri uri, Handler handler) {
        super(handler);
        this.LIZIZ = c62635Oi7;
        this.LIZ = uri;
    }
}
