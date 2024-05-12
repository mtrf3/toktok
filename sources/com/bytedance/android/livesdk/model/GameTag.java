package com.bytedance.android.livesdk.model;

import X.BIC;
import X.BID;
import X.C05040Hs;
import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.ORZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GameTag extends F9E implements Parcelable {

    @InterfaceC65349Pkn("bundle_id")
    public String bundleId;

    @InterfaceC65349Pkn("full_name")
    public String fullName;

    @InterfaceC65349Pkn("game_category")
    public List<GameTagCategory> gameCategory;

    @InterfaceC65349Pkn("hashtag_list")
    public List<Hashtag> hashtagList;

    @InterfaceC65349Pkn("id")
    public Long id;
    public boolean isFromClick;

    @InterfaceC65349Pkn("landscape")
    public int landscape;

    @InterfaceC65349Pkn("package_name")
    public String packageName;
    public boolean selected;

    @InterfaceC65349Pkn("short_name")
    public String shortName;

    @InterfaceC65349Pkn("show_name")
    public String showName;
    public static final BID Companion = new BID();
    public static final Parcelable.Creator<GameTag> CREATOR = new BIC();

    public GameTag() {
        this(null, null, null, null, 0, null, null, null, null, 511, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.id, this.showName, this.shortName, this.fullName, Boolean.valueOf(this.selected), Integer.valueOf(this.landscape), this.packageName, this.bundleId};
    }

    public final Hashtag firstHashTag() {
        List<Hashtag> list = this.hashtagList;
        if (list != null) {
            return (Hashtag) ORZ.LJLLLL(list);
        }
        return null;
    }

    public final boolean isMobileGame() {
        List<GameTagCategory> list = this.gameCategory;
        if (list != null) {
            Iterator<GameTagCategory> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GameTagCategory next = it.next();
                if (next.gameType == 2) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean isNonGameItem() {
        Long l = this.id;
        if (l == null || l.longValue() != 0) {
            return false;
        }
        return true;
    }

    public final boolean isNonGameOrOtherGameItem() {
        Long l;
        Long l2 = this.id;
        if ((l2 == null || l2.longValue() != -1) && ((l = this.id) == null || l.longValue() != 0)) {
            return false;
        }
        return true;
    }

    public final boolean isOtherGameItem() {
        Long l = this.id;
        if (l == null || l.longValue() != -1) {
            return false;
        }
        return true;
    }

    public final boolean isRealGameItem() {
        Long l = this.id;
        if ((l == null || l.longValue() != 0) && !isNonGameItem()) {
            return true;
        }
        return false;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final boolean isFromClick() {
        return this.isFromClick;
    }

    public final void setFromClick(boolean z) {
        this.isFromClick = z;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        Long l = this.id;
        if (l != null) {
            C05040Hs.LIZLLL(parcel, 1, l);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.showName);
        parcel.writeString(this.shortName);
        parcel.writeString(this.fullName);
        parcel.writeInt(this.landscape);
        parcel.writeString(this.packageName);
        parcel.writeString(this.bundleId);
        List<Hashtag> list = this.hashtagList;
        parcel.writeInt(list.size());
        Iterator<Hashtag> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, 0);
        }
        List<GameTagCategory> list2 = this.gameCategory;
        parcel.writeInt(list2.size());
        Iterator<GameTagCategory> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, 0);
        }
    }

    public GameTag(Long l, String str, String str2, String str3, int i, String str4, String str5, List<Hashtag> hashtagList, List<GameTagCategory> gameCategory) {
        o.LJIIIZ(hashtagList, "hashtagList");
        o.LJIIIZ(gameCategory, "gameCategory");
        this.id = l;
        this.showName = str;
        this.shortName = str2;
        this.fullName = str3;
        this.landscape = i;
        this.packageName = str4;
        this.bundleId = str5;
        this.hashtagList = hashtagList;
        this.gameCategory = gameCategory;
    }

    public GameTag(Long l, String str, String str2, String str3, int i, String str4, String str5, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : l, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? "" : str4, (i2 & 64) == 0 ? str5 : "", (i2 & 128) != 0 ? C61878OQg.INSTANCE : list, (i2 & 256) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
