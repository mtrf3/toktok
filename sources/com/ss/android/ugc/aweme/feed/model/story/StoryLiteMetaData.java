package com.ss.android.ugc.aweme.feed.model.story;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StoryLiteMetaData implements Serializable {

    @InterfaceC65349Pkn("item_id")
    public final String aid;

    @InterfaceC65349Pkn("progress_bar_count")
    public final int progressBarCnt;

    /* JADX WARN: Multi-variable type inference failed */
    public StoryLiteMetaData() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StoryLiteMetaData copy$default(StoryLiteMetaData storyLiteMetaData, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = storyLiteMetaData.aid;
        }
        if ((i2 & 2) != 0) {
            i = storyLiteMetaData.progressBarCnt;
        }
        return storyLiteMetaData.copy(str, i);
    }

    public final StoryLiteMetaData copy(String str, int i) {
        return new StoryLiteMetaData(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryLiteMetaData)) {
            return false;
        }
        StoryLiteMetaData storyLiteMetaData = (StoryLiteMetaData) obj;
        return o.LJ(this.aid, storyLiteMetaData.aid) && this.progressBarCnt == storyLiteMetaData.progressBarCnt;
    }

    public int hashCode() {
        String str = this.aid;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.progressBarCnt;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryLiteMetaData(aid=");
        LIZ.append(this.aid);
        LIZ.append(", progressBarCnt=");
        return b0.LIZJ(LIZ, this.progressBarCnt, ')', LIZ);
    }

    public final String getAid() {
        return this.aid;
    }

    public final int getProgressBarCnt() {
        return this.progressBarCnt;
    }

    public StoryLiteMetaData(String str, int i) {
        this.aid = str;
        this.progressBarCnt = i;
    }

    public /* synthetic */ StoryLiteMetaData(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i);
    }
}
