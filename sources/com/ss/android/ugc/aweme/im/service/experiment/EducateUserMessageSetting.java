package com.ss.android.ugc.aweme.im.service.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class EducateUserMessageSetting {
    public static final EducateUserMessageConfig LIZ;

    /* loaded from: classes2.dex */
    public static final class EducateUserMessageConfig {

        @InterfaceC65349Pkn("max_chat_count")
        public final int maxChatCount;

        @InterfaceC65349Pkn("max_follower_count")
        public final int maxFollowerCount;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public EducateUserMessageConfig() {
            /*
                r3 = this;
                r2 = 3
                r1 = 0
                r0 = 0
                r3.<init>(r0, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.experiment.EducateUserMessageSetting.EducateUserMessageConfig.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EducateUserMessageConfig)) {
                return false;
            }
            EducateUserMessageConfig educateUserMessageConfig = (EducateUserMessageConfig) obj;
            return this.maxFollowerCount == educateUserMessageConfig.maxFollowerCount && this.maxChatCount == educateUserMessageConfig.maxChatCount;
        }

        public final int hashCode() {
            return (this.maxFollowerCount * 31) + this.maxChatCount;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EducateUserMessageConfig(maxFollowerCount=");
            LIZ.append(this.maxFollowerCount);
            LIZ.append(", maxChatCount=");
            return b0.LIZJ(LIZ, this.maxChatCount, ')', LIZ);
        }

        public EducateUserMessageConfig(int i, int i2) {
            this.maxFollowerCount = i;
            this.maxChatCount = i2;
        }

        public /* synthetic */ EducateUserMessageConfig(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? LiveChatShowDelayForHotLiveSetting.DEFAULT : i, (i3 & 2) != 0 ? 3 : i2);
        }
    }

    static {
        int i = 0;
        LIZ = new EducateUserMessageConfig(i, i, 3, null);
    }
}
