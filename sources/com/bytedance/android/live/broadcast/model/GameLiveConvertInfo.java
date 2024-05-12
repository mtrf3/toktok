package com.bytedance.android.live.broadcast.model;

import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.broadcast.model.GameLiveConvertInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class GameLiveConvertInfo implements Parcelable {
    public static final Parcelable.Creator<GameLiveConvertInfo> CREATOR = new Parcelable.Creator<GameLiveConvertInfo>() { // from class: X.0Ji
        @Override // android.os.Parcelable.Creator
        public final GameLiveConvertInfo createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            parcel.readInt();
            return new GameLiveConvertInfo();
        }

        @Override // android.os.Parcelable.Creator
        public final GameLiveConvertInfo[] newArray(int i) {
            return new GameLiveConvertInfo[i];
        }
    };

    @InterfaceC65349Pkn("acu_type")
    public int acuType;

    @InterfaceC65349Pkn("convert_type")
    public int convertType;

    @InterfaceC65349Pkn("text")
    public String text;

    @InterfaceC65349Pkn("title")
    public String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }
}
