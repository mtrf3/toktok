package com.ss.android.ugc.aweme.plugin.not_interested;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NotInterestedTutorialData {

    @InterfaceC65349Pkn("add_favorite_text")
    public final String addFavoriteText;

    @InterfaceC65349Pkn("button")
    public final String button;

    @InterfaceC65349Pkn("not_interested_text")
    public final String notInterestedText;

    @InterfaceC65349Pkn("skip_video_count")
    public final Integer skipVideoCount;

    @InterfaceC65349Pkn("style")
    public final int style;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public NotInterestedTutorialData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 63, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotInterestedTutorialData)) {
            return false;
        }
        NotInterestedTutorialData notInterestedTutorialData = (NotInterestedTutorialData) obj;
        return o.LJ(this.skipVideoCount, notInterestedTutorialData.skipVideoCount) && o.LJ(this.title, notInterestedTutorialData.title) && o.LJ(this.button, notInterestedTutorialData.button) && o.LJ(this.notInterestedText, notInterestedTutorialData.notInterestedText) && o.LJ(this.addFavoriteText, notInterestedTutorialData.addFavoriteText) && this.style == notInterestedTutorialData.style;
    }

    public final int hashCode() {
        Integer num = this.skipVideoCount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.button;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.notInterestedText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.addFavoriteText;
        return ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.style;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NotInterestedTutorialData(skipVideoCount=");
        LIZ.append(this.skipVideoCount);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", button=");
        LIZ.append(this.button);
        LIZ.append(", notInterestedText=");
        LIZ.append(this.notInterestedText);
        LIZ.append(", addFavoriteText=");
        LIZ.append(this.addFavoriteText);
        LIZ.append(", style=");
        return b0.LIZJ(LIZ, this.style, ')', LIZ);
    }

    public NotInterestedTutorialData(Integer num, String str, String str2, String str3, String str4, int i) {
        this.skipVideoCount = num;
        this.title = str;
        this.button = str2;
        this.notInterestedText = str3;
        this.addFavoriteText = str4;
        this.style = i;
    }

    public /* synthetic */ NotInterestedTutorialData(Integer num, String str, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : num, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) == 0 ? str4 : null, (i2 & 32) != 0 ? -1 : i);
    }
}
