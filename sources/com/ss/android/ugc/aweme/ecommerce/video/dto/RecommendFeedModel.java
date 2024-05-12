package com.ss.android.ugc.aweme.ecommerce.video.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RecommendFeedModel {

    @InterfaceC65349Pkn("extra")
    public final RecommendFeedExtra feedExtra;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("type")
    public final int type;

    @InterfaceC65349Pkn("video")
    public final RecommendVideoModel video;

    public static /* synthetic */ RecommendFeedModel copy$default(RecommendFeedModel recommendFeedModel, String str, int i, RecommendVideoModel recommendVideoModel, RecommendFeedExtra recommendFeedExtra, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = recommendFeedModel.id;
        }
        if ((i2 & 2) != 0) {
            i = recommendFeedModel.type;
        }
        if ((i2 & 4) != 0) {
            recommendVideoModel = recommendFeedModel.video;
        }
        if ((i2 & 8) != 0) {
            recommendFeedExtra = recommendFeedModel.feedExtra;
        }
        return recommendFeedModel.copy(str, i, recommendVideoModel, recommendFeedExtra);
    }

    public final RecommendFeedModel copy(String str, int i, RecommendVideoModel recommendVideoModel, RecommendFeedExtra recommendFeedExtra) {
        return new RecommendFeedModel(str, i, recommendVideoModel, recommendFeedExtra);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendFeedModel)) {
            return false;
        }
        RecommendFeedModel recommendFeedModel = (RecommendFeedModel) obj;
        return o.LJ(this.id, recommendFeedModel.id) && this.type == recommendFeedModel.type && o.LJ(this.video, recommendFeedModel.video) && o.LJ(this.feedExtra, recommendFeedModel.feedExtra);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.type) * 31;
        RecommendVideoModel recommendVideoModel = this.video;
        int hashCode2 = (hashCode + (recommendVideoModel == null ? 0 : recommendVideoModel.hashCode())) * 31;
        RecommendFeedExtra recommendFeedExtra = this.feedExtra;
        return hashCode2 + (recommendFeedExtra != null ? recommendFeedExtra.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendFeedModel(id=");
        LIZ.append(this.id);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", video=");
        LIZ.append(this.video);
        LIZ.append(", feedExtra=");
        LIZ.append(this.feedExtra);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final RecommendFeedExtra getFeedExtra() {
        return this.feedExtra;
    }

    public final String getId() {
        return this.id;
    }

    public final int getType() {
        return this.type;
    }

    public final RecommendVideoModel getVideo() {
        return this.video;
    }

    public RecommendFeedModel(String str, int i, RecommendVideoModel recommendVideoModel, RecommendFeedExtra recommendFeedExtra) {
        this.id = str;
        this.type = i;
        this.video = recommendVideoModel;
        this.feedExtra = recommendFeedExtra;
    }

    public /* synthetic */ RecommendFeedModel(String str, int i, RecommendVideoModel recommendVideoModel, RecommendFeedExtra recommendFeedExtra, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : recommendVideoModel, (i2 & 8) != 0 ? null : recommendFeedExtra);
    }
}
