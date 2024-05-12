package X;

import com.bytedance.android.live.rank.impl.list.fragment.page.RankPageFragment;

/* renamed from: X.Uj4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77982Uj4 implements VTX {
    public final /* synthetic */ RankPageFragment LIZ;

    public C77982Uj4(RankPageFragment rankPageFragment) {
        this.LIZ = rankPageFragment;
    }

    @Override // X.VTY
    public final void LIZ(C80217Ve1 c80217Ve1, int i) {
        int i2;
        if (this.LIZ.LJLJLJ == null) {
            return;
        }
        if (c80217Ve1 != null) {
            i2 = c80217Ve1.getTotalScrollRange();
        } else {
            i2 = 0;
        }
        if (Math.abs(i) >= i2 && i2 > 0) {
            this.LIZ.Al(true);
        } else {
            this.LIZ.Al(false);
        }
    }
}
