package X;

import androidx.media.MediaBrowserServiceCompat;

/* renamed from: X.1ho, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C40121ho extends C1BG {
    public final /* synthetic */ MediaBrowserServiceCompat LJ;

    @Override // X.C1BG, X.C09P
    public void onCreate() {
        C1BH c1bh = new C1BH(this, this.LJ);
        this.LIZIZ = c1bh;
        c1bh.onCreate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40121ho(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        super(mediaBrowserServiceCompat);
        this.LJ = mediaBrowserServiceCompat;
    }
}
