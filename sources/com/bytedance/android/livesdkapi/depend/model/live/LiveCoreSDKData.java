package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC65349Pkn;
import Y.IDCreatorS49S0000000_5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class LiveCoreSDKData {

    @InterfaceC65349Pkn("pull_data")
    public PullData pullData;

    /* loaded from: classes6.dex */
    public static class Quality implements Parcelable {
        public static final Parcelable.Creator<Quality> CREATOR = new IDCreatorS49S0000000_5(3);

        @InterfaceC65349Pkn("icon_type")
        public int iconType;

        @InterfaceC65349Pkn("name")
        public String name;
        public List<Room> roomList;

        @InterfaceC65349Pkn("sdk_key")
        public String sdkKey;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Quality() {
            this.roomList = new ArrayList();
        }

        public Quality(Parcel parcel) {
            this.roomList = new ArrayList();
            this.name = parcel.readString();
            this.sdkKey = parcel.readString();
            ArrayList arrayList = new ArrayList();
            this.roomList = arrayList;
            parcel.readList(arrayList, Room.class.getClassLoader());
        }

        public void readFromParcel(Parcel parcel) {
            this.name = parcel.readString();
            this.sdkKey = parcel.readString();
            ArrayList arrayList = new ArrayList();
            this.roomList = arrayList;
            parcel.readList(arrayList, Room.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.sdkKey);
            parcel.writeList(this.roomList);
        }
    }

    public Quality getDefaultQuality() {
        PullData pullData = this.pullData;
        if (pullData == null || pullData.getOptions() == null) {
            return null;
        }
        return this.pullData.getOptions().defaultQuality;
    }

    public List<Quality> getQualityList() {
        PullData pullData = this.pullData;
        if (pullData == null || pullData.getOptions() == null) {
            return null;
        }
        return this.pullData.getOptions().getQualityList();
    }

    /* loaded from: classes6.dex */
    public static class Options {

        @InterfaceC65349Pkn("default_preview_quality")
        public Quality defaultPreviewQuality;

        @InterfaceC65349Pkn("default_quality")
        public Quality defaultQuality;

        @InterfaceC65349Pkn("qualities")
        public List<Quality> qualityList;

        @InterfaceC65349Pkn("show_quality_button")
        public boolean showQualityButton;

        public Quality getDefaultQuality() {
            return this.defaultQuality;
        }

        public List<Quality> getQualityList() {
            return this.qualityList;
        }

        public void setDefaultQuality(Quality quality) {
            this.defaultQuality = quality;
        }

        public void setQualityList(List<Quality> list) {
            this.qualityList = list;
        }
    }

    /* loaded from: classes6.dex */
    public static class PullData {

        @InterfaceC65349Pkn("options")
        public Options options;

        @InterfaceC65349Pkn("stream_data")
        public String streamData;

        public Options getOptions() {
            return this.options;
        }

        public String getStreamData() {
            return this.streamData;
        }

        public void setOptions(Options options) {
            this.options = options;
        }

        public void setStreamData(String str) {
            this.streamData = str;
        }
    }

    public PullData getPullData() {
        return this.pullData;
    }

    public void setPullData(PullData pullData) {
        this.pullData = pullData;
    }
}
