package com.ss.android.ugc.aweme.live.livehostimpl;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class LiveBusinessExtra extends F9E implements Serializable {

    @InterfaceC65349Pkn("anchor_info")
    public final CreateAnchorInfo AnchorInfo;

    @InterfaceC65349Pkn("fragment_type")
    public final int FragmentType;

    @InterfaceC65349Pkn("pin_time")
    public final long PinTime;

    @InterfaceC65349Pkn("product_click_count")
    public final long ProductClickCount;

    @InterfaceC65349Pkn("product_id")
    public final String ProductID;

    @InterfaceC65349Pkn("product_pic_url")
    public final String ProductPicURL;

    @InterfaceC65349Pkn("product_title")
    public final String ProductTitle;

    @InterfaceC65349Pkn("suggest_video_title")
    public final String VideoSuggestTitle;

    @InterfaceC65349Pkn("suggest_video_toast")
    public final String VideoSuggestToast;

    public static /* synthetic */ LiveBusinessExtra copy$default(LiveBusinessExtra liveBusinessExtra, String str, long j, int i, long j2, String str2, String str3, String str4, String str5, CreateAnchorInfo createAnchorInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = liveBusinessExtra.ProductID;
        }
        if ((i2 & 2) != 0) {
            j = liveBusinessExtra.PinTime;
        }
        if ((i2 & 4) != 0) {
            i = liveBusinessExtra.FragmentType;
        }
        if ((i2 & 8) != 0) {
            j2 = liveBusinessExtra.ProductClickCount;
        }
        if ((i2 & 16) != 0) {
            str2 = liveBusinessExtra.ProductPicURL;
        }
        if ((i2 & 32) != 0) {
            str3 = liveBusinessExtra.ProductTitle;
        }
        if ((i2 & 64) != 0) {
            str4 = liveBusinessExtra.VideoSuggestTitle;
        }
        if ((i2 & 128) != 0) {
            str5 = liveBusinessExtra.VideoSuggestToast;
        }
        if ((i2 & 256) != 0) {
            createAnchorInfo = liveBusinessExtra.AnchorInfo;
        }
        return liveBusinessExtra.copy(str, j, i, j2, str2, str3, str4, str5, createAnchorInfo);
    }

    public final LiveBusinessExtra copy(String ProductID, long j, int i, long j2, String ProductPicURL, String ProductTitle, String VideoSuggestTitle, String VideoSuggestToast, CreateAnchorInfo AnchorInfo) {
        o.LJIIIZ(ProductID, "ProductID");
        o.LJIIIZ(ProductPicURL, "ProductPicURL");
        o.LJIIIZ(ProductTitle, "ProductTitle");
        o.LJIIIZ(VideoSuggestTitle, "VideoSuggestTitle");
        o.LJIIIZ(VideoSuggestToast, "VideoSuggestToast");
        o.LJIIIZ(AnchorInfo, "AnchorInfo");
        return new LiveBusinessExtra(ProductID, j, i, j2, ProductPicURL, ProductTitle, VideoSuggestTitle, VideoSuggestToast, AnchorInfo);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.ProductID, Long.valueOf(this.PinTime), Integer.valueOf(this.FragmentType), Long.valueOf(this.ProductClickCount), this.ProductPicURL, this.ProductTitle, this.VideoSuggestTitle, this.VideoSuggestToast, this.AnchorInfo};
    }

    public final CreateAnchorInfo getAnchorInfo() {
        return this.AnchorInfo;
    }

    public final int getFragmentType() {
        return this.FragmentType;
    }

    public final long getPinTime() {
        return this.PinTime;
    }

    public final long getProductClickCount() {
        return this.ProductClickCount;
    }

    public final String getProductID() {
        return this.ProductID;
    }

    public final String getProductPicURL() {
        return this.ProductPicURL;
    }

    public final String getProductTitle() {
        return this.ProductTitle;
    }

    public final String getVideoSuggestTitle() {
        return this.VideoSuggestTitle;
    }

    public final String getVideoSuggestToast() {
        return this.VideoSuggestToast;
    }

    public LiveBusinessExtra(String ProductID, long j, int i, long j2, String ProductPicURL, String ProductTitle, String VideoSuggestTitle, String VideoSuggestToast, CreateAnchorInfo AnchorInfo) {
        o.LJIIIZ(ProductID, "ProductID");
        o.LJIIIZ(ProductPicURL, "ProductPicURL");
        o.LJIIIZ(ProductTitle, "ProductTitle");
        o.LJIIIZ(VideoSuggestTitle, "VideoSuggestTitle");
        o.LJIIIZ(VideoSuggestToast, "VideoSuggestToast");
        o.LJIIIZ(AnchorInfo, "AnchorInfo");
        this.ProductID = ProductID;
        this.PinTime = j;
        this.FragmentType = i;
        this.ProductClickCount = j2;
        this.ProductPicURL = ProductPicURL;
        this.ProductTitle = ProductTitle;
        this.VideoSuggestTitle = VideoSuggestTitle;
        this.VideoSuggestToast = VideoSuggestToast;
        this.AnchorInfo = AnchorInfo;
    }
}
