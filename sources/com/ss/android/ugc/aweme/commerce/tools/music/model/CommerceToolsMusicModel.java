package com.ss.android.ugc.aweme.commerce.tools.music.model;

import X.C42477Gll;
import X.C42478Glm;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommerceToolsMusicModel implements Serializable, Parcelable {
    public static final Parcelable.Creator<CommerceToolsMusicModel> CREATOR = new C42477Gll();

    @InterfaceC65349Pkn("banner_id")
    public String bannerId;

    @InterfaceC65349Pkn("banner_type")
    public String bannerType;

    @InterfaceC65349Pkn("category_id")
    public String categoryId;

    @InterfaceC65349Pkn("is_commercial")
    public boolean fromCommercialSoundPage;

    @InterfaceC65349Pkn("is_legal_term_checked")
    public Boolean isMusicLegalUsageTermChecked;

    @InterfaceC65349Pkn("music_order")
    public Integer musicOrder;

    @InterfaceC65349Pkn("suggestion_id")
    public String playlistSuggestionId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }

    public String getBannerId() {
        return C42478Glm.LIZ;
    }

    public String getBannerType() {
        return C42478Glm.LIZIZ;
    }

    public String getCategoryId() {
        return C42478Glm.LIZLLL;
    }

    public boolean getFromCommercialSoundPage() {
        return C42478Glm.LJFF;
    }

    public Integer getMusicOrder() {
        return C42478Glm.LJ;
    }

    public String getPlaylistSuggestionId() {
        return C42478Glm.LIZJ;
    }

    public final Boolean isMusicLegalUsageTermChecked() {
        return this.isMusicLegalUsageTermChecked;
    }

    public void setBannerId(String str) {
        C42478Glm.LIZ = str;
        this.bannerId = str;
    }

    public void setBannerType(String str) {
        C42478Glm.LIZIZ = str;
        this.bannerType = str;
    }

    public void setCategoryId(String str) {
        C42478Glm.LIZLLL = str;
        this.categoryId = str;
    }

    public void setFromCommercialSoundPage(boolean z) {
        C42478Glm.LJFF = z;
        this.fromCommercialSoundPage = z;
    }

    public final void setMusicLegalUsageTermChecked(Boolean bool) {
        this.isMusicLegalUsageTermChecked = bool;
    }

    public void setMusicOrder(Integer num) {
        C42478Glm.LJ = num;
        this.musicOrder = num;
    }

    public void setPlaylistSuggestionId(String str) {
        C42478Glm.LIZJ = str;
        this.playlistSuggestionId = str;
    }
}
