package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.VisibilityComparisonPlayer;

/* renamed from: X.JkX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50045JkX implements InterfaceC50046JkY {
    public final /* synthetic */ VisibilityComparisonPlayer LIZ;

    public C50045JkX(VisibilityComparisonPlayer visibilityComparisonPlayer) {
        this.LIZ = visibilityComparisonPlayer;
    }

    @Override // X.InterfaceC50046JkY
    public final /* synthetic */ void LIZ() {
    }

    @Override // X.InterfaceC50046JkY
    public final /* synthetic */ void LIZJ() {
    }

    @Override // X.InterfaceC50046JkY
    public final void LIZIZ(boolean z) {
        VisibilityComparisonPlayer visibilityComparisonPlayer = this.LIZ;
        visibilityComparisonPlayer.LJLL = z;
        if (!z) {
            visibilityComparisonPlayer.pause();
        }
    }
}
