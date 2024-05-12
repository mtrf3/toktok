package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.VisibilityComparisonPlayer;

/* renamed from: X.JkT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50041JkT extends C0A4 {
    public final /* synthetic */ VisibilityComparisonPlayer LIZ;

    public C50041JkT(VisibilityComparisonPlayer visibilityComparisonPlayer) {
        this.LIZ = visibilityComparisonPlayer;
    }

    @Override // X.C0A4
    public final boolean LIZ(int i, int i2) {
        int intValue;
        boolean z;
        VisibilityComparisonPlayer visibilityComparisonPlayer = this.LIZ;
        Integer num = visibilityComparisonPlayer.LJLJLLL;
        if (num != null && (intValue = num.intValue()) > 0) {
            if (Math.abs(i2) > intValue) {
                z = true;
            } else {
                z = false;
            }
            visibilityComparisonPlayer.LJLJLJ = z;
        }
        return false;
    }
}
