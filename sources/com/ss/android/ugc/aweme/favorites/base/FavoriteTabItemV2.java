package com.ss.android.ugc.aweme.favorites.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.favorites.base.FavoriteTabItemV2;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class FavoriteTabItemV2 implements Parcelable {
    public static final Parcelable.Creator<FavoriteTabItemV2> CREATOR = new Parcelable.Creator<FavoriteTabItemV2>() { // from class: X.8ZA
        @Override // android.os.Parcelable.Creator
        public final FavoriteTabItemV2 createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new FavoriteTabItemV2((PowerViewPagerFragmentItem) parcel.readParcelable(FavoriteTabItemV2.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FavoriteTabItemV2[] newArray(int i) {
            return new FavoriteTabItemV2[i];
        }
    };
    public final PowerViewPagerFragmentItem<?> fragmentPowerItem;
    public final String mobKey;
    public final String pageTitle;
    public final String standalonePageTitle;
    public final String tabCountKey;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.fragmentPowerItem, i);
        out.writeString(this.pageTitle);
        out.writeString(this.mobKey);
        out.writeString(this.tabCountKey);
        out.writeString(this.standalonePageTitle);
    }

    public /* synthetic */ FavoriteTabItemV2(PowerViewPagerFragmentItem powerViewPagerFragmentItem, String str, String str2, String str3) {
        this(powerViewPagerFragmentItem, str, str2, str3, null);
    }

    public FavoriteTabItemV2(PowerViewPagerFragmentItem<?> fragmentPowerItem, String pageTitle, String mobKey, String tabCountKey, String str) {
        o.LJIIIZ(fragmentPowerItem, "fragmentPowerItem");
        o.LJIIIZ(pageTitle, "pageTitle");
        o.LJIIIZ(mobKey, "mobKey");
        o.LJIIIZ(tabCountKey, "tabCountKey");
        this.fragmentPowerItem = fragmentPowerItem;
        this.pageTitle = pageTitle;
        this.mobKey = mobKey;
        this.tabCountKey = tabCountKey;
        this.standalonePageTitle = str;
    }
}
