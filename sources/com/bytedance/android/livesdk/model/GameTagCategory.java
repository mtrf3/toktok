package com.bytedance.android.livesdk.model;

import X.BIB;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GameTagCategory extends F9E implements Parcelable {
    public static final Parcelable.Creator<GameTagCategory> CREATOR = new BIB();

    @InterfaceC65349Pkn("game_type")
    public int gameType;

    @InterfaceC65349Pkn("title")
    public String title;

    /* JADX WARN: Multi-variable type inference failed */
    public GameTagCategory() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        String str = this.title;
        return new Object[]{Integer.valueOf(this.gameType), str, str};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeInt(this.gameType);
        parcel.writeString(this.title);
    }

    public GameTagCategory(int i, String str) {
        this.gameType = i;
        this.title = str;
    }

    public /* synthetic */ GameTagCategory(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}
