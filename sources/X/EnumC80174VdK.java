package X;

/* renamed from: X.VdK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC80174VdK {
    None(0, false, false, false, false, false),
    PullDownToRefresh(1, true, false, false, false, false),
    PullUpToLoad(2, true, false, false, false, false),
    PullDownCanceled(1, false, false, false, false, false),
    PullUpCanceled(2, false, false, false, false, false),
    ReleaseToRefresh(1, true, false, false, false, true),
    ReleaseToLoad(2, true, false, false, false, true),
    ReleaseToTwoLevel(1, true, false, false, true, true),
    TwoLevelReleased(1, false, false, false, true, false),
    RefreshReleased(1, false, false, false, false, false),
    LoadReleased(2, false, false, false, false, false),
    Refreshing(1, false, true, false, false, false),
    Loading(2, false, true, false, false, false),
    TwoLevel(1, false, true, false, true, false),
    RefreshFinish(1, false, false, true, false, false),
    LoadFinish(2, false, false, true, false, false),
    TwoLevelFinish(1, false, false, true, true, false);

    public final boolean isDragging;
    public final boolean isFinishing;
    public final boolean isFooter;
    public final boolean isHeader;
    public final boolean isOpening;
    public final boolean isReleaseToOpening;
    public final boolean isTwoLevel;

    public EnumC80174VdK toFooter() {
        if (this.isHeader && !this.isTwoLevel) {
            return values()[ordinal() + 1];
        }
        return this;
    }

    public EnumC80174VdK toHeader() {
        if (this.isFooter && !this.isTwoLevel) {
            return values()[ordinal() - 1];
        }
        return this;
    }

    public static EnumC80174VdK valueOf(String str) {
        return (EnumC80174VdK) V0N.LJJJ(EnumC80174VdK.class, str);
    }

    EnumC80174VdK(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        if (i == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.isHeader = z6;
        this.isFooter = i == 2;
        this.isDragging = z;
        this.isOpening = z2;
        this.isFinishing = z3;
        this.isTwoLevel = z4;
        this.isReleaseToOpening = z5;
    }
}
