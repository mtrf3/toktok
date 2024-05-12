package com.byted.cast.common.bean;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes29.dex */
public class XiguaBdLinkUriInfo {

    @InterfaceC65349Pkn("play_info")
    public XiguaPlayInfo playInfo;

    /* loaded from: classes29.dex */
    public static class XiguaPlayInfo {

        @InterfaceC65349Pkn("resolution_info_list")
        public List<XiguaResolutionInfo> resolutionInfoList;

        @InterfaceC65349Pkn("target_resolution")
        public String targetResolution;

        public String getTargetResolutionUrl() {
            List<XiguaResolutionInfo> list = this.resolutionInfoList;
            if (list == null || list.isEmpty()) {
                return "";
            }
            if (TextUtils.isEmpty(this.targetResolution)) {
                return ((XiguaResolutionInfo) ListProtector.get(this.resolutionInfoList, 0)).getUrl();
            }
            for (XiguaResolutionInfo xiguaResolutionInfo : this.resolutionInfoList) {
                if (this.targetResolution.equals(xiguaResolutionInfo.getResolution())) {
                    return xiguaResolutionInfo.getUrl();
                }
            }
            return ((XiguaResolutionInfo) ListProtector.get(this.resolutionInfoList, 0)).getUrl();
        }

        public List<XiguaResolutionInfo> getResolutionInfoList() {
            return this.resolutionInfoList;
        }

        public String getTargetResolution() {
            return this.targetResolution;
        }

        public void setResolutionInfoList(List<XiguaResolutionInfo> list) {
            this.resolutionInfoList = list;
        }

        public void setTargetResolution(String str) {
            this.targetResolution = str;
        }
    }

    public String getTargetResolutionUrl() {
        XiguaPlayInfo xiguaPlayInfo = this.playInfo;
        if (xiguaPlayInfo == null) {
            return "";
        }
        return xiguaPlayInfo.getTargetResolutionUrl();
    }

    /* loaded from: classes29.dex */
    public static class XiguaResolutionInfo {
        public String resolution;
        public String url;

        public String getResolution() {
            return this.resolution;
        }

        public String getUrl() {
            return this.url;
        }

        public void setResolution(String str) {
            this.resolution = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }
    }

    public XiguaPlayInfo getPlayInfo() {
        return this.playInfo;
    }

    public void setPlayInfo(XiguaPlayInfo xiguaPlayInfo) {
        this.playInfo = xiguaPlayInfo;
    }
}
