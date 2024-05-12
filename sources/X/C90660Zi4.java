package X;

import android.widget.TextView;

/* renamed from: X.Zi4, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90660Zi4 extends AbstractC90446Zec {
    public final TextView LIZIZ;

    public C90660Zi4(TextView textView) {
        this.LIZIZ = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0027, code lost:
    
        if (r2 != 4) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        if (r4.LJJJJL("com.google.android.gms.cast.metadata.COMPOSER") != false) goto L30;
     */
    @Override // X.AbstractC90446Zec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r5 = this;
            X.Zhj r0 = r5.LIZ
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.gms.cast.MediaInfo r0 = r0.LJ()
            if (r0 != 0) goto Lc
            return
        Lc:
            com.google.android.gms.cast.MediaMetadata r4 = r0.zzf
            if (r4 != 0) goto L11
            return
        L11:
            java.lang.String r3 = "com.google.android.gms.cast.metadata.SUBTITLE"
            boolean r0 = r4.LJJJJL(r3)
            if (r0 != 0) goto L29
            int r2 = r4.zze
            r0 = 1
            if (r2 == r0) goto L53
            r0 = 2
            if (r2 == r0) goto L50
            r0 = 3
            java.lang.String r1 = "com.google.android.gms.cast.metadata.ARTIST"
            if (r2 == r0) goto L35
            r0 = 4
            if (r2 == r0) goto L3b
        L29:
            java.lang.String r1 = r4.LJJJJZ(r3)
            if (r1 == 0) goto L34
            android.widget.TextView r0 = r5.LIZIZ
            r0.setText(r1)
        L34:
            return
        L35:
            boolean r0 = r4.LJJJJL(r1)
            if (r0 == 0) goto L3d
        L3b:
            r3 = r1
            goto L29
        L3d:
            java.lang.String r1 = "com.google.android.gms.cast.metadata.ALBUM_ARTIST"
            boolean r0 = r4.LJJJJL(r1)
            if (r0 == 0) goto L47
        L45:
            r3 = r1
            goto L29
        L47:
            java.lang.String r1 = "com.google.android.gms.cast.metadata.COMPOSER"
            boolean r0 = r4.LJJJJL(r1)
            if (r0 == 0) goto L29
            goto L45
        L50:
            java.lang.String r3 = "com.google.android.gms.cast.metadata.SERIES_TITLE"
            goto L29
        L53:
            java.lang.String r3 = "com.google.android.gms.cast.metadata.STUDIO"
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90660Zi4.LIZIZ():void");
    }
}
