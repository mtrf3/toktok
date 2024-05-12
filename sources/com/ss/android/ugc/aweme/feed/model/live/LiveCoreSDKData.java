package com.ss.android.ugc.aweme.feed.model.live;

import X.C1NE;
import X.C77800Ug8;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes6.dex */
public class LiveCoreSDKData implements Serializable {

    @InterfaceC65349Pkn("pull_data")
    public PullData pullData;

    /* loaded from: classes6.dex */
    public static class Options implements Serializable {

        @InterfaceC65349Pkn("default_preview_quality")
        public Quality defaultPreviewQuality;

        @InterfaceC65349Pkn("default_quality")
        public Quality defaultQuality;

        @InterfaceC65349Pkn("qualities")
        public List<Quality> qualityList;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Options{defaultQuality=");
            LIZ.append(this.defaultQuality);
            LIZ.append(", qualityList=");
            return C1NE.LIZIZ(LIZ, this.qualityList, '}', LIZ);
        }

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
    public static class PullData implements Serializable {

        @InterfaceC65349Pkn("options")
        public Options options;

        @InterfaceC65349Pkn("stream_data")
        public String streamData;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PullData{options=");
            LIZ.append(this.options);
            LIZ.append(", streamData='");
            return C77800Ug8.LIZJ(LIZ, this.streamData, '\'', '}', LIZ);
        }

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

    /* loaded from: classes6.dex */
    public static class Quality implements Serializable {

        @InterfaceC65349Pkn("name")
        public String name;

        @InterfaceC65349Pkn("sdk_key")
        public String sdkKey;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Quality{name='");
            Q89.LIZIZ(LIZ, this.name, '\'', ", sdkKey='");
            return C77800Ug8.LIZJ(LIZ, this.sdkKey, '\'', '}', LIZ);
        }
    }

    public Quality getDefaultPreviewQuality() {
        PullData pullData = this.pullData;
        if (pullData == null || pullData.getOptions() == null) {
            return null;
        }
        return this.pullData.getOptions().defaultPreviewQuality;
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

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveCoreSDKData{pullData=");
        LIZ.append(this.pullData);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public PullData getPullData() {
        return this.pullData;
    }

    public void setPullData(PullData pullData) {
        this.pullData = pullData;
    }
}
