package com.ss.android.ugc.aweme.commercialize.live.settings;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class PromoteConfigSettings {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes10.dex */
    public static final class PromoteConfig implements Serializable {

        @InterfaceC65349Pkn("pa_recommend_cml")
        public Integer recommendCML;

        /* JADX WARN: Multi-variable type inference failed */
        public PromoteConfig() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Integer getRecommendCML() {
            return this.recommendCML;
        }

        public PromoteConfig(Integer num) {
            this.recommendCML = num;
        }

        public final void setRecommendCML(Integer num) {
            this.recommendCML = num;
        }

        public /* synthetic */ PromoteConfig(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0 : num);
        }
    }
}
