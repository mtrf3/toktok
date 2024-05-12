package com.ss.android.ugc.aweme.utils;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class BoolParams implements Serializable {

    @InterfaceC65349Pkn("is_ads")
    public Integer is_ads;

    @InterfaceC65349Pkn("is_disliked")
    public Integer is_disliked;

    @InterfaceC65349Pkn("is_ecom")
    public Integer is_ecom;

    @InterfaceC65349Pkn("is_entered_profile")
    public Integer is_enter_profile;

    @InterfaceC65349Pkn("is_favorited")
    public Integer is_favorite;

    @InterfaceC65349Pkn("is_finished")
    public Integer is_finished;

    @InterfaceC65349Pkn("is_followed")
    public Integer is_followed;

    @InterfaceC65349Pkn("is_liked")
    public Integer is_like;

    @InterfaceC65349Pkn("is_reported")
    public Integer is_reported;

    @InterfaceC65349Pkn("is_shared")
    public Integer is_share;

    /* JADX WARN: Multi-variable type inference failed */
    public BoolParams() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BoolParams copy$default(BoolParams boolParams, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, int i, Object obj) {
        if ((i & 1) != 0) {
            num = boolParams.is_ecom;
        }
        if ((i & 2) != 0) {
            num2 = boolParams.is_ads;
        }
        if ((i & 4) != 0) {
            num3 = boolParams.is_finished;
        }
        if ((i & 8) != 0) {
            num4 = boolParams.is_followed;
        }
        if ((i & 16) != 0) {
            num5 = boolParams.is_enter_profile;
        }
        if ((i & 32) != 0) {
            num6 = boolParams.is_like;
        }
        if ((i & 64) != 0) {
            num7 = boolParams.is_favorite;
        }
        if ((i & 128) != 0) {
            num8 = boolParams.is_share;
        }
        if ((i & 256) != 0) {
            num9 = boolParams.is_disliked;
        }
        if ((i & 512) != 0) {
            num10 = boolParams.is_reported;
        }
        return boolParams.copy(num, num2, num3, num4, num5, num6, num7, num8, num9, num10);
    }

    public final BoolParams copy(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10) {
        return new BoolParams(num, num2, num3, num4, num5, num6, num7, num8, num9, num10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoolParams)) {
            return false;
        }
        BoolParams boolParams = (BoolParams) obj;
        return o.LJ(this.is_ecom, boolParams.is_ecom) && o.LJ(this.is_ads, boolParams.is_ads) && o.LJ(this.is_finished, boolParams.is_finished) && o.LJ(this.is_followed, boolParams.is_followed) && o.LJ(this.is_enter_profile, boolParams.is_enter_profile) && o.LJ(this.is_like, boolParams.is_like) && o.LJ(this.is_favorite, boolParams.is_favorite) && o.LJ(this.is_share, boolParams.is_share) && o.LJ(this.is_disliked, boolParams.is_disliked) && o.LJ(this.is_reported, boolParams.is_reported);
    }

    public int hashCode() {
        Integer num = this.is_ecom;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.is_ads;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.is_finished;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.is_followed;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.is_enter_profile;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.is_like;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.is_favorite;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.is_share;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.is_disliked;
        int hashCode9 = (hashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.is_reported;
        return hashCode9 + (num10 != null ? num10.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BoolParams(is_ecom=");
        LIZ.append(this.is_ecom);
        LIZ.append(", is_ads=");
        LIZ.append(this.is_ads);
        LIZ.append(", is_finished=");
        LIZ.append(this.is_finished);
        LIZ.append(", is_followed=");
        LIZ.append(this.is_followed);
        LIZ.append(", is_enter_profile=");
        LIZ.append(this.is_enter_profile);
        LIZ.append(", is_like=");
        LIZ.append(this.is_like);
        LIZ.append(", is_favorite=");
        LIZ.append(this.is_favorite);
        LIZ.append(", is_share=");
        LIZ.append(this.is_share);
        LIZ.append(", is_disliked=");
        LIZ.append(this.is_disliked);
        LIZ.append(", is_reported=");
        return s0.LIZJ(LIZ, this.is_reported, ')', LIZ);
    }

    public final Integer is_ads() {
        return this.is_ads;
    }

    public final Integer is_disliked() {
        return this.is_disliked;
    }

    public final Integer is_ecom() {
        return this.is_ecom;
    }

    public final Integer is_enter_profile() {
        return this.is_enter_profile;
    }

    public final Integer is_favorite() {
        return this.is_favorite;
    }

    public final Integer is_finished() {
        return this.is_finished;
    }

    public final Integer is_followed() {
        return this.is_followed;
    }

    public final Integer is_like() {
        return this.is_like;
    }

    public final Integer is_reported() {
        return this.is_reported;
    }

    public final Integer is_share() {
        return this.is_share;
    }

    public final void set_ads(Integer num) {
        this.is_ads = num;
    }

    public final void set_disliked(Integer num) {
        this.is_disliked = num;
    }

    public final void set_ecom(Integer num) {
        this.is_ecom = num;
    }

    public final void set_enter_profile(Integer num) {
        this.is_enter_profile = num;
    }

    public final void set_favorite(Integer num) {
        this.is_favorite = num;
    }

    public final void set_finished(Integer num) {
        this.is_finished = num;
    }

    public final void set_followed(Integer num) {
        this.is_followed = num;
    }

    public final void set_like(Integer num) {
        this.is_like = num;
    }

    public final void set_reported(Integer num) {
        this.is_reported = num;
    }

    public final void set_share(Integer num) {
        this.is_share = num;
    }

    public BoolParams(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10) {
        this.is_ecom = num;
        this.is_ads = num2;
        this.is_finished = num3;
        this.is_followed = num4;
        this.is_enter_profile = num5;
        this.is_like = num6;
        this.is_favorite = num7;
        this.is_share = num8;
        this.is_disliked = num9;
        this.is_reported = num10;
    }

    public /* synthetic */ BoolParams(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : num6, (i & 64) != 0 ? null : num7, (i & 128) != 0 ? null : num8, (i & 256) != 0 ? null : num9, (i & 512) == 0 ? num10 : null);
    }
}
