package com.ss.android.ugc.tools.net;

import X.C74454TJy;
import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class WeakNetSortRule extends F9E {
    public static final C74454TJy Companion = new C74454TJy();
    public final int maxSortCount;
    public final int minNeededCount;
    public final int sortCategory;
    public final boolean sortCover;

    /* JADX WARN: Multi-variable type inference failed */
    public WeakNetSortRule() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, null);
    }

    public static /* synthetic */ WeakNetSortRule copy$default(WeakNetSortRule weakNetSortRule, int i, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = weakNetSortRule.sortCategory;
        }
        if ((i4 & 2) != 0) {
            i2 = weakNetSortRule.maxSortCount;
        }
        if ((i4 & 4) != 0) {
            i3 = weakNetSortRule.minNeededCount;
        }
        if ((i4 & 8) != 0) {
            z = weakNetSortRule.sortCover;
        }
        return weakNetSortRule.copy(i, i2, i3, z);
    }

    public final WeakNetSortRule copy(int i, int i2, int i3, boolean z) {
        return new WeakNetSortRule(i, i2, i3, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.sortCategory), Integer.valueOf(this.maxSortCount), Integer.valueOf(this.minNeededCount), Boolean.valueOf(this.sortCover)};
    }

    public final int getMaxSortCount() {
        return this.maxSortCount;
    }

    public final int getMinNeededCount() {
        return this.minNeededCount;
    }

    public final int getSortCategory() {
        return this.sortCategory;
    }

    public final boolean getSortCover() {
        return this.sortCover;
    }

    public WeakNetSortRule(int i, int i2, int i3, boolean z) {
        this.sortCategory = i;
        this.maxSortCount = i2;
        this.minNeededCount = i3;
        this.sortCover = z;
    }

    public /* synthetic */ WeakNetSortRule(int i, int i2, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? false : z);
    }
}
