package com.ss.android.ugc.aweme.feed.count;

import X.F9E;

/* loaded from: classes9.dex */
public final class FeedPlayNumModel extends F9E {
    public int batchNum;
    public int batchNumAll;
    public int date;
    public int playNum;
    public int playNumAll;
    public long playTimeBefore;
    public int recommendBatchNum;
    public int recommendPlayNum;

    public static /* synthetic */ FeedPlayNumModel copy$default(FeedPlayNumModel feedPlayNumModel, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = feedPlayNumModel.batchNum;
        }
        if ((i8 & 2) != 0) {
            i2 = feedPlayNumModel.batchNumAll;
        }
        if ((i8 & 4) != 0) {
            i3 = feedPlayNumModel.playNum;
        }
        if ((i8 & 8) != 0) {
            i4 = feedPlayNumModel.playNumAll;
        }
        if ((i8 & 16) != 0) {
            i5 = feedPlayNumModel.recommendBatchNum;
        }
        if ((i8 & 32) != 0) {
            i6 = feedPlayNumModel.recommendPlayNum;
        }
        if ((i8 & 64) != 0) {
            j = feedPlayNumModel.playTimeBefore;
        }
        if ((i8 & 128) != 0) {
            i7 = feedPlayNumModel.date;
        }
        return feedPlayNumModel.copy(i, i2, i3, i4, i5, i6, j, i7);
    }

    public final FeedPlayNumModel copy(int i, int i2, int i3, int i4, int i5, int i6, long j, int i7) {
        return new FeedPlayNumModel(i, i2, i3, i4, i5, i6, j, i7);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.batchNum), Integer.valueOf(this.batchNumAll), Integer.valueOf(this.playNum), Integer.valueOf(this.playNumAll), Integer.valueOf(this.recommendBatchNum), Integer.valueOf(this.recommendPlayNum), Long.valueOf(this.playTimeBefore), Integer.valueOf(this.date)};
    }

    public final int getBatchNum() {
        return this.batchNum;
    }

    public final int getBatchNumAll() {
        return this.batchNumAll;
    }

    public final int getDate() {
        return this.date;
    }

    public final int getPlayNum() {
        return this.playNum;
    }

    public final int getPlayNumAll() {
        return this.playNumAll;
    }

    public final long getPlayTimeBefore() {
        return this.playTimeBefore;
    }

    public final int getRecommendBatchNum() {
        return this.recommendBatchNum;
    }

    public final int getRecommendPlayNum() {
        return this.recommendPlayNum;
    }

    public final void setBatchNum(int i) {
        this.batchNum = i;
    }

    public final void setBatchNumAll(int i) {
        this.batchNumAll = i;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setPlayNum(int i) {
        this.playNum = i;
    }

    public final void setPlayNumAll(int i) {
        this.playNumAll = i;
    }

    public final void setPlayTimeBefore(long j) {
        this.playTimeBefore = j;
    }

    public final void setRecommendBatchNum(int i) {
        this.recommendBatchNum = i;
    }

    public final void setRecommendPlayNum(int i) {
        this.recommendPlayNum = i;
    }

    public FeedPlayNumModel(int i, int i2, int i3, int i4, int i5, int i6, long j, int i7) {
        this.batchNum = i;
        this.batchNumAll = i2;
        this.playNum = i3;
        this.playNumAll = i4;
        this.recommendBatchNum = i5;
        this.recommendPlayNum = i6;
        this.playTimeBefore = j;
        this.date = i7;
    }
}
