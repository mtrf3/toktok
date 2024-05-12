package X;

import com.lynx.tasm.base.LLog;
import java.lang.ref.WeakReference;

/* loaded from: classes14.dex */
public final class V9I extends W4V<InterfaceC81599W0t> {
    public final /* synthetic */ WeakReference LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ V9P LIZLLL;

    @Override // X.W4V, X.W4Z
    public final void LJ(String str, Throwable th) {
        if (this.LIZLLL.mImageDelegate.LJII(this.LIZJ)) {
            return;
        }
        this.LIZLLL.mIsDirty = true;
        int LJFF = C78685UuP.LJFF(th);
        int LJI = C78685UuP.LJI(LJFF);
        if (this.LIZLLL.mLoaderCallback != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Android FrescoImageView loading image failed, and the url is ");
            LIZ.append(this.LIZLLL.getSrc());
            LIZ.append(". The Fresco throw error msg is ");
            LIZ.append(th.getMessage());
            this.LIZLLL.mLoaderCallback.LIZJ(LJI, LJFF, X1D.LIZIZ(LIZ));
        }
        long currentTimeMillis = System.currentTimeMillis();
        V9P v9p = this.LIZLLL;
        C79285V9t c79285V9t = v9p.mImageDelegate;
        c79285V9t.LJ(c79285V9t.LJIILJJIL, false, v9p.mStartTimeStamp, currentTimeMillis, 0, null);
        V9P v9p2 = this.LIZLLL;
        C79285V9t c79285V9t2 = v9p2.mImageDelegate;
        c79285V9t2.LJFF(LJFF, 0, v9p2.mStartTimeStamp, currentTimeMillis, c79285V9t2.LJIILJJIL, false, false);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onFailed src:");
        LLog.LIZLLL(4, "FrescoImageView", C61328O5c.LIZLLL(LIZ2, this.LIZJ, "with reason", th, LIZ2));
    }

    @Override // X.W4V, X.W4Z
    public final void LJI(Object obj, String str) {
        LLog.LIZLLL(2, "FrescoImageView", "onSubmit");
    }

    public V9I(V9P v9p, WeakReference weakReference, String str) {
        this.LIZLLL = v9p;
        this.LIZIZ = weakReference;
        this.LIZJ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015e A[Catch: JSONException -> 0x017c, TryCatch #0 {JSONException -> 0x017c, blocks: (B:34:0x00ef, B:36:0x0156, B:38:0x015e, B:39:0x0162), top: B:33:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0179  */
    @Override // X.W4V, X.W4Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(java.lang.String r20, java.lang.Object r21, android.graphics.drawable.Animatable r22) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V9I.LJFF(java.lang.String, java.lang.Object, android.graphics.drawable.Animatable):void");
    }
}
