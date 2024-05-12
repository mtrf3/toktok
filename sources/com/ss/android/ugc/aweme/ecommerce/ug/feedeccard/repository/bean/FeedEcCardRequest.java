package com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.repository.bean;

import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FeedEcCardRequest {

    @InterfaceC65349Pkn("card_context")
    public final String cardConfig;

    @InterfaceC65349Pkn("page_source_info")
    public final String pageSourceInfo;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final Integer scene;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedEcCardRequest() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FeedEcCardRequest copy$default(FeedEcCardRequest feedEcCardRequest, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = feedEcCardRequest.scene;
        }
        if ((i & 2) != 0) {
            str = feedEcCardRequest.cardConfig;
        }
        if ((i & 4) != 0) {
            str2 = feedEcCardRequest.pageSourceInfo;
        }
        return feedEcCardRequest.copy(num, str, str2);
    }

    public final FeedEcCardRequest copy(Integer num, String str, String str2) {
        return new FeedEcCardRequest(num, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedEcCardRequest)) {
            return false;
        }
        FeedEcCardRequest feedEcCardRequest = (FeedEcCardRequest) obj;
        return o.LJ(this.scene, feedEcCardRequest.scene) && o.LJ(this.cardConfig, feedEcCardRequest.cardConfig) && o.LJ(this.pageSourceInfo, feedEcCardRequest.pageSourceInfo);
    }

    public int hashCode() {
        Integer num = this.scene;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.cardConfig;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pageSourceInfo;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedEcCardRequest(scene=");
        LIZ.append(this.scene);
        LIZ.append(", cardConfig=");
        LIZ.append(this.cardConfig);
        LIZ.append(", pageSourceInfo=");
        return q.LIZIZ(LIZ, this.pageSourceInfo, ')', LIZ);
    }

    public final String getCardConfig() {
        return this.cardConfig;
    }

    public final String getPageSourceInfo() {
        return this.pageSourceInfo;
    }

    public final Integer getScene() {
        return this.scene;
    }

    public FeedEcCardRequest(Integer num, String str, String str2) {
        this.scene = num;
        this.cardConfig = str;
        this.pageSourceInfo = str2;
    }

    public /* synthetic */ FeedEcCardRequest(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1 : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
