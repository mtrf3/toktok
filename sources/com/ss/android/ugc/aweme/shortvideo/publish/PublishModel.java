package com.ss.android.ugc.aweme.shortvideo.publish;

import X.C162476Zf;
import X.GWA;
import X.GWB;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.StoryGroupPublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PublishModel {
    public final boolean LIZ;
    public transient PublishFailureReason LIZIZ;

    @InterfaceC65349Pkn("creationId")
    public final String creationId;

    @InterfaceC65349Pkn("disableProgressView")
    public final boolean disableProgressView;

    @InterfaceC65349Pkn("editModel")
    public final BaseShortVideoContext editModel;

    @InterfaceC65349Pkn("expectPublishTaskId")
    public String expectPublishTaskId;

    @InterfaceC65349Pkn("isEditPrePublish")
    public final boolean isEditPrePublish;

    @InterfaceC65349Pkn("isEditSave")
    public final boolean isEditSave;

    @InterfaceC65349Pkn("isFastPostShoutouts")
    public final boolean isFastPostShoutOuts;

    @InterfaceC65349Pkn("isStoryPublish")
    public final boolean isStoryPublish;

    @InterfaceC65349Pkn("isTTEPSave")
    public final boolean isTTEPSave;

    @InterfaceC65349Pkn("nowsShootData")
    public final NowsShootModel nowsShootData;

    @InterfaceC65349Pkn("publishId")
    public String publishId;

    @InterfaceC65349Pkn("publishPermission")
    public final int publishPermission;

    @InterfaceC65349Pkn("publishType")
    public final int publishType;

    @InterfaceC65349Pkn("retry_type")
    public GWB retryType;

    @InterfaceC65349Pkn("shootWay")
    public final String shootWay;

    @InterfaceC65349Pkn("storyGroupPublishModel")
    public StoryGroupPublishModel storyGroupPublishModel;

    @InterfaceC65349Pkn("storyType")
    public final String storyType;

    @InterfaceC65349Pkn("videoCoverPaths")
    public final List<String> videoCoverPaths;

    @InterfaceC65349Pkn("videoType")
    public final int videoType;

    public final String LIZ() {
        int i = GWA.LIZ[this.retryType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "2";
                }
                throw new C162476Zf();
            }
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public final boolean LIZIZ() {
        if (this.retryType == GWB.RETRY_BY_USER) {
            return true;
        }
        return false;
    }

    public PublishModel(String shootWay, String creationId, int i, GWB retryType, boolean z, int i2, int i3, List<String> videoCoverPaths, BaseShortVideoContext editModel, NowsShootModel nowsShootModel, boolean z2, String storyType, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, StoryGroupPublishModel storyGroupPublishModel) {
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(retryType, "retryType");
        o.LJIIIZ(videoCoverPaths, "videoCoverPaths");
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(storyType, "storyType");
        this.shootWay = shootWay;
        this.creationId = creationId;
        this.publishType = i;
        this.retryType = retryType;
        this.isFastPostShoutOuts = z;
        this.videoType = i2;
        this.publishPermission = i3;
        this.videoCoverPaths = videoCoverPaths;
        this.editModel = editModel;
        this.nowsShootData = nowsShootModel;
        this.isStoryPublish = z2;
        this.storyType = storyType;
        this.isTTEPSave = z3;
        this.isEditSave = z4;
        this.isEditPrePublish = z5;
        this.LIZ = z6;
        this.expectPublishTaskId = str;
        this.disableProgressView = z7;
        this.storyGroupPublishModel = storyGroupPublishModel;
        this.publishId = "";
    }

    public /* synthetic */ PublishModel(String str, String str2, int i, GWB gwb, boolean z, int i2, int i3, List list, BaseShortVideoContext baseShortVideoContext, NowsShootModel nowsShootModel, boolean z2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, String str4, boolean z7, StoryGroupPublishModel storyGroupPublishModel, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, gwb, z, i2, i3, list, baseShortVideoContext, (i4 & 512) != 0 ? null : nowsShootModel, (i4 & 1024) != 0 ? false : z2, (i4 & 2048) != 0 ? CardStruct.IStatusCode.DEFAULT : str3, (i4 & 4096) != 0 ? false : z3, (i4 & FileUtils.BUFFER_SIZE) != 0 ? false : z4, (i4 & 16384) != 0 ? false : z5, (32768 & i4) != 0 ? false : z6, (65536 & i4) != 0 ? null : str4, (131072 & i4) != 0 ? false : z7, (i4 & 262144) == 0 ? storyGroupPublishModel : null);
    }
}
