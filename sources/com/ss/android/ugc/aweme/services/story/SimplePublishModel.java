package com.ss.android.ugc.aweme.services.story;

import X.AnonymousClass391;
import X.C79062V1e;
import X.X1D;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SimplePublishModel {
    public final List<String> coverPathList;
    public final String creationId;
    public final String publishId;
    public final PublishModel publishModel;
    public final String shootWay;
    public final String storyType;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SimplePublishModel copy$default(SimplePublishModel simplePublishModel, String str, String str2, String str3, String str4, List list, PublishModel publishModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simplePublishModel.creationId;
        }
        if ((i & 2) != 0) {
            str2 = simplePublishModel.publishId;
        }
        if ((i & 4) != 0) {
            str3 = simplePublishModel.shootWay;
        }
        if ((i & 8) != 0) {
            str4 = simplePublishModel.storyType;
        }
        if ((i & 16) != 0) {
            list = simplePublishModel.coverPathList;
        }
        if ((i & 32) != 0) {
            publishModel = simplePublishModel.publishModel;
        }
        return simplePublishModel.copy(str, str2, str3, str4, list, publishModel);
    }

    public final SimplePublishModel copy(String creationId, String publishId, String shootWay, String storyType, List<String> coverPathList, PublishModel publishModel) {
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(publishId, "publishId");
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(storyType, "storyType");
        o.LJIIIZ(coverPathList, "coverPathList");
        return new SimplePublishModel(creationId, publishId, shootWay, storyType, coverPathList, publishModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimplePublishModel)) {
            return false;
        }
        SimplePublishModel simplePublishModel = (SimplePublishModel) obj;
        return o.LJ(this.creationId, simplePublishModel.creationId) && o.LJ(this.publishId, simplePublishModel.publishId) && o.LJ(this.shootWay, simplePublishModel.shootWay) && o.LJ(this.storyType, simplePublishModel.storyType) && o.LJ(this.coverPathList, simplePublishModel.coverPathList) && o.LJ(this.publishModel, simplePublishModel.publishModel);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SimplePublishModel(creationId=");
        LIZ.append(this.creationId);
        LIZ.append(", publishId=");
        LIZ.append(this.publishId);
        LIZ.append(", shootWay=");
        LIZ.append(this.shootWay);
        LIZ.append(", storyType=");
        LIZ.append(this.storyType);
        LIZ.append(", coverPathList=");
        LIZ.append(this.coverPathList);
        LIZ.append(", publishModel=");
        LIZ.append(this.publishModel);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.coverPathList, C79062V1e.LJ(this.storyType, C79062V1e.LJ(this.shootWay, C79062V1e.LJ(this.publishId, this.creationId.hashCode() * 31, 31), 31), 31), 31);
        PublishModel publishModel = this.publishModel;
        if (publishModel == null) {
            hashCode = 0;
        } else {
            hashCode = publishModel.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public final List<String> getCoverPathList() {
        return this.coverPathList;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getPublishId() {
        return this.publishId;
    }

    public final PublishModel getPublishModel() {
        return this.publishModel;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final String getStoryType() {
        return this.storyType;
    }

    public SimplePublishModel(String creationId, String publishId, String shootWay, String storyType, List<String> coverPathList, PublishModel publishModel) {
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(publishId, "publishId");
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(storyType, "storyType");
        o.LJIIIZ(coverPathList, "coverPathList");
        this.creationId = creationId;
        this.publishId = publishId;
        this.shootWay = shootWay;
        this.storyType = storyType;
        this.coverPathList = coverPathList;
        this.publishModel = publishModel;
    }

    public /* synthetic */ SimplePublishModel(String str, String str2, String str3, String str4, List list, PublishModel publishModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, (i & 32) != 0 ? null : publishModel);
    }
}
