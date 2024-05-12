package com.ss.android.ugc.aweme.feed.model.bottom.banner;

import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FeedBottomBannerUIModel {
    public final String iconUrl;
    public final CharSequence titleContent;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedBottomBannerUIModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FeedBottomBannerUIModel copy$default(FeedBottomBannerUIModel feedBottomBannerUIModel, String str, CharSequence charSequence, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedBottomBannerUIModel.iconUrl;
        }
        if ((i & 2) != 0) {
            charSequence = feedBottomBannerUIModel.titleContent;
        }
        return feedBottomBannerUIModel.copy(str, charSequence);
    }

    public final FeedBottomBannerUIModel copy(String str, CharSequence charSequence) {
        return new FeedBottomBannerUIModel(str, charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedBottomBannerUIModel)) {
            return false;
        }
        FeedBottomBannerUIModel feedBottomBannerUIModel = (FeedBottomBannerUIModel) obj;
        return o.LJ(this.iconUrl, feedBottomBannerUIModel.iconUrl) && o.LJ(this.titleContent, feedBottomBannerUIModel.titleContent);
    }

    public int hashCode() {
        String str = this.iconUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CharSequence charSequence = this.titleContent;
        return hashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedBottomBannerUIModel(iconUrl=");
        LIZ.append(this.iconUrl);
        LIZ.append(", titleContent=");
        LIZ.append((Object) this.titleContent);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public FeedBottomBannerUIModel(String str, CharSequence charSequence) {
        this.iconUrl = str;
        this.titleContent = charSequence;
    }

    public /* synthetic */ FeedBottomBannerUIModel(String str, CharSequence charSequence, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : charSequence);
    }
}
