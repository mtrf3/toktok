package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.LKo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54086LKo implements LNI {
    public final /* synthetic */ C54085LKn LJLIL;

    public C54086LKo(C54085LKn c54085LKn) {
        this.LJLIL = c54085LKn;
    }

    @Override // X.LNI
    public final void LJJLIIIJ(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        this.LJLIL.LJ = aweme.isAd();
    }
}
