package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.Ogc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62542Ogc implements InterfaceC229218z7 {
    public final /* synthetic */ Aweme LIZ;

    @Override // X.InterfaceC229218z7
    public final void LIZ(boolean z) {
    }

    public C62542Ogc(Aweme aweme) {
        this.LIZ = aweme;
    }

    @Override // X.InterfaceC229218z7
    public final void LIZIZ(boolean z) {
        Aweme aweme;
        if (z && (aweme = this.LIZ) != null) {
            aweme.playlist_info = null;
        }
    }
}
