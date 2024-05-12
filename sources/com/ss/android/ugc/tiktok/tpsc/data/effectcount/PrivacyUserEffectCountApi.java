package com.ss.android.ugc.tiktok.tpsc.data.effectcount;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public interface PrivacyUserEffectCountApi {
    @E8L("/tiktok/privacy/user/effected_count/v1")
    AbstractC73672Svk<PrivacyUserEffectCountResp> getPrivacyUserEffectCount();

    /* loaded from: classes13.dex */
    public static final class PrivacyUserEffectCountResp extends BaseResponse {

        @InterfaceC65349Pkn("interaction_video_count")
        public final InteractionVideoCount interactionVideoCount;

        @InterfaceC65349Pkn("no_pa_control_settings")
        public final NoPAControlSettings noPAControlSettings;

        /* JADX WARN: Multi-variable type inference failed */
        public PrivacyUserEffectCountResp() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrivacyUserEffectCountResp)) {
                return false;
            }
            PrivacyUserEffectCountResp privacyUserEffectCountResp = (PrivacyUserEffectCountResp) obj;
            return o.LJ(this.interactionVideoCount, privacyUserEffectCountResp.interactionVideoCount) && o.LJ(this.noPAControlSettings, privacyUserEffectCountResp.noPAControlSettings);
        }

        public final int hashCode() {
            InteractionVideoCount interactionVideoCount = this.interactionVideoCount;
            int hashCode = (interactionVideoCount == null ? 0 : interactionVideoCount.hashCode()) * 31;
            NoPAControlSettings noPAControlSettings = this.noPAControlSettings;
            return hashCode + (noPAControlSettings != null ? noPAControlSettings.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PrivacyUserEffectCountResp(interactionVideoCount=");
            LIZ.append(this.interactionVideoCount);
            LIZ.append(", noPAControlSettings=");
            LIZ.append(this.noPAControlSettings);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public PrivacyUserEffectCountResp(InteractionVideoCount interactionVideoCount, NoPAControlSettings noPAControlSettings) {
            this.interactionVideoCount = interactionVideoCount;
            this.noPAControlSettings = noPAControlSettings;
        }

        public /* synthetic */ PrivacyUserEffectCountResp(InteractionVideoCount interactionVideoCount, NoPAControlSettings noPAControlSettings, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : interactionVideoCount, (i & 2) != 0 ? null : noPAControlSettings);
        }
    }
}
