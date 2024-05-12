package com.ss.android.ugc.aweme.ecommerce.video.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RecommendFeedExtra {

    @InterfaceC65349Pkn("recommend_info")
    public final String recommendInfo;

    public static /* synthetic */ RecommendFeedExtra copy$default(RecommendFeedExtra recommendFeedExtra, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recommendFeedExtra.recommendInfo;
        }
        return recommendFeedExtra.copy(str);
    }

    public final RecommendFeedExtra copy(String str) {
        return new RecommendFeedExtra(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendFeedExtra) && o.LJ(this.recommendInfo, ((RecommendFeedExtra) obj).recommendInfo);
    }

    public int hashCode() {
        String str = this.recommendInfo;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendFeedExtra(recommendInfo=");
        return q.LIZIZ(LIZ, this.recommendInfo, ')', LIZ);
    }

    public final String getRecommendInfo() {
        return this.recommendInfo;
    }

    public RecommendFeedExtra(String str) {
        this.recommendInfo = str;
    }
}
