package X;

import android.database.ContentObserver;

/* renamed from: X.QnR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68061QnR extends ContentObserver {
    public C68061QnR() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        C68058QnO.LIZLLL.set(true);
    }
}
