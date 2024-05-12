package com.ss.android.ugc.aweme.service.unlogindigg.network;

import X.AbstractC73638SvC;
import X.C77800Ug8;
import X.C79062V1e;
import X.E4T;
import X.EFJ;
import X.InterfaceC64989Pez;
import X.InterfaceC64997Pf7;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.service.unlogindigg.UnLoggedDiggResponse;
import defpackage.b0;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UnLoginDiggNetworkService {
    public static final UnLoginDiggNetworkApi LIZ;

    /* loaded from: classes7.dex */
    public static final class DiggInfo {

        @InterfaceC65349Pkn("aweme_id")
        public final String awemeId;

        @InterfaceC65349Pkn("channel_id")
        public final int channelId;

        @InterfaceC65349Pkn("digg_time")
        public final String diggTime;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DiggInfo)) {
                return false;
            }
            DiggInfo diggInfo = (DiggInfo) obj;
            return o.LJ(this.awemeId, diggInfo.awemeId) && o.LJ(this.diggTime, diggInfo.diggTime) && this.channelId == diggInfo.channelId;
        }

        public final int hashCode() {
            return C79062V1e.LJ(this.diggTime, this.awemeId.hashCode() * 31, 31) + this.channelId;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DiggInfo(awemeId=");
            LIZ.append(this.awemeId);
            LIZ.append(", diggTime=");
            LIZ.append(this.diggTime);
            LIZ.append(", channelId=");
            return b0.LIZJ(LIZ, this.channelId, ')', LIZ);
        }

        public DiggInfo(String awemeId, String diggTime, int i) {
            o.LJIIIZ(awemeId, "awemeId");
            o.LJIIIZ(diggTime, "diggTime");
            this.awemeId = awemeId;
            this.diggTime = diggTime;
            this.channelId = i;
        }

        public /* synthetic */ DiggInfo(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? 0 : i);
        }
    }

    /* loaded from: classes7.dex */
    public interface UnLoginDiggNetworkApi {
        @E4T("/aweme/v1/digg/sync/")
        AbstractC73638SvC<UnLoggedDiggResponse> diggSync(@InterfaceC64989Pez("digg_infos") String str, @InterfaceC64989Pez("device_id") String str2, @InterfaceC64989Pez("sync_count") int i, @InterfaceC64989Pez("sync_action") int i2);

        @E4T("/aweme/v1/unlogged/digg/")
        AbstractC73638SvC<UnLoggedDiggResponse> unLoggedDigg(@InterfaceC64997Pf7 Map<String, String> map);
    }

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZ = (UnLoginDiggNetworkApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, UnLoginDiggNetworkApi.class);
    }
}
