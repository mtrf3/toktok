package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Ziz, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90717Ziz extends AbstractC90446Zec {
    public final View LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    @Override // X.AbstractC90446Zec
    public final void LIZJ() {
        this.LIZIZ.setEnabled(false);
    }

    @Override // X.AbstractC90446Zec
    public final void LJ() {
        this.LIZIZ.setEnabled(false);
        this.LIZ = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF() {
        /*
            r7 = this;
            X.Zhj r6 = r7.LIZ
            r5 = 0
            if (r6 == 0) goto L11
            boolean r0 = r6.LJIIIZ()
            if (r0 == 0) goto L11
            com.google.android.gms.cast.MediaInfo r0 = r6.LJ()
            if (r0 != 0) goto L1e
        L11:
            android.view.View r0 = r7.LIZIZ
            r0.setEnabled(r5)
            android.view.View r1 = r7.LIZIZ
            java.lang.String r0 = r7.LIZLLL
            r1.setContentDescription(r0)
            return
        L1e:
            java.util.List<com.google.android.gms.cast.MediaTrack> r1 = r0.zzh
            if (r1 == 0) goto L11
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L11
            java.util.Iterator r4 = r1.iterator()
            r3 = 0
        L2d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L11
            java.lang.Object r0 = r4.next()
            com.google.android.gms.cast.MediaTrack r0 = (com.google.android.gms.cast.MediaTrack) r0
            int r2 = r0.zzc
            r0 = 2
            r1 = 1
            if (r2 != r0) goto L56
            int r3 = r3 + 1
            if (r3 <= r1) goto L2d
        L43:
            boolean r0 = r6.LJIILL()
            if (r0 != 0) goto L11
            android.view.View r0 = r7.LIZIZ
            r0.setEnabled(r1)
            android.view.View r1 = r7.LIZIZ
            java.lang.String r0 = r7.LIZJ
            r1.setContentDescription(r0)
            return
        L56:
            if (r2 != r1) goto L2d
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90717Ziz.LJFF():void");
    }

    @Override // X.AbstractC90446Zec
    public final void LIZIZ() {
        LJFF();
    }

    @Override // X.AbstractC90446Zec
    public final void LIZLLL(C90613ZhJ c90613ZhJ) {
        super.LIZLLL(c90613ZhJ);
        this.LIZIZ.setEnabled(true);
        LJFF();
    }

    public C90717Ziz(Context context, View view) {
        this.LIZIZ = view;
        this.LIZJ = context.getString(R.string.d);
        this.LIZLLL = context.getString(R.string.e);
        view.setEnabled(false);
    }
}
