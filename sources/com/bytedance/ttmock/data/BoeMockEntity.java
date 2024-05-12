package com.bytedance.ttmock.data;

import X.C07670Rv;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BoeMockEntity {
    public final String[] boeHostBypassList;
    public final String boeLane;
    public final String[] boePathBypassList;
    public final String[] boeWebviewHostBypassList;
    public final String[] boeWebviewPathBypassList;
    public final String channel;
    public final boolean enable;
    public final Boolean enableBoeJsbBypass;
    public final Boolean enablePPE;
    public final Boolean enableTTP;
    public final String ppeLane;
    public final String ttpLane;
    public final Integer type;

    public static /* synthetic */ BoeMockEntity copy$default(BoeMockEntity boeMockEntity, boolean z, Boolean bool, String str, Integer num, Boolean bool2, Boolean bool3, String str2, String str3, String str4, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = boeMockEntity.enable;
        }
        if ((i & 2) != 0) {
            bool = boeMockEntity.enableBoeJsbBypass;
        }
        if ((i & 4) != 0) {
            str = boeMockEntity.channel;
        }
        if ((i & 8) != 0) {
            num = boeMockEntity.type;
        }
        if ((i & 16) != 0) {
            bool2 = boeMockEntity.enablePPE;
        }
        if ((i & 32) != 0) {
            bool3 = boeMockEntity.enableTTP;
        }
        if ((i & 64) != 0) {
            str2 = boeMockEntity.boeLane;
        }
        if ((i & 128) != 0) {
            str3 = boeMockEntity.ppeLane;
        }
        if ((i & 256) != 0) {
            str4 = boeMockEntity.ttpLane;
        }
        if ((i & 512) != 0) {
            strArr = boeMockEntity.boeWebviewHostBypassList;
        }
        if ((i & 1024) != 0) {
            strArr2 = boeMockEntity.boeWebviewPathBypassList;
        }
        if ((i & 2048) != 0) {
            strArr3 = boeMockEntity.boeHostBypassList;
        }
        if ((i & 4096) != 0) {
            strArr4 = boeMockEntity.boePathBypassList;
        }
        return boeMockEntity.copy(z, bool, str, num, bool2, bool3, str2, str3, str4, strArr, strArr2, strArr3, strArr4);
    }

    public final BoeMockEntity copy(boolean z, Boolean bool, String str, Integer num, Boolean bool2, Boolean bool3, String str2, String str3, String str4, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        return new BoeMockEntity(z, bool, str, num, bool2, bool3, str2, str3, str4, strArr, strArr2, strArr3, strArr4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoeMockEntity)) {
            return false;
        }
        BoeMockEntity boeMockEntity = (BoeMockEntity) obj;
        return this.enable == boeMockEntity.enable && o.LJ(this.enableBoeJsbBypass, boeMockEntity.enableBoeJsbBypass) && o.LJ(this.channel, boeMockEntity.channel) && o.LJ(this.type, boeMockEntity.type) && o.LJ(this.enablePPE, boeMockEntity.enablePPE) && o.LJ(this.enableTTP, boeMockEntity.enableTTP) && o.LJ(this.boeLane, boeMockEntity.boeLane) && o.LJ(this.ppeLane, boeMockEntity.ppeLane) && o.LJ(this.ttpLane, boeMockEntity.ttpLane) && o.LJ(this.boeWebviewHostBypassList, boeMockEntity.boeWebviewHostBypassList) && o.LJ(this.boeWebviewPathBypassList, boeMockEntity.boeWebviewPathBypassList) && o.LJ(this.boeHostBypassList, boeMockEntity.boeHostBypassList) && o.LJ(this.boePathBypassList, boeMockEntity.boePathBypassList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    public int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Boolean bool = this.enableBoeJsbBypass;
        int hashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.channel;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.type;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.enablePPE;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.enableTTP;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.boeLane;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ppeLane;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ttpLane;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String[] strArr = this.boeWebviewHostBypassList;
        int hashCode9 = (hashCode8 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.boeWebviewPathBypassList;
        int hashCode10 = (hashCode9 + (strArr2 == null ? 0 : Arrays.hashCode(strArr2))) * 31;
        String[] strArr3 = this.boeHostBypassList;
        int hashCode11 = (hashCode10 + (strArr3 == null ? 0 : Arrays.hashCode(strArr3))) * 31;
        String[] strArr4 = this.boePathBypassList;
        return hashCode11 + (strArr4 != null ? Arrays.hashCode(strArr4) : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BoeMockEntity(enable=");
        sb.append(this.enable);
        sb.append(", enableBoeJsbBypass=");
        sb.append(this.enableBoeJsbBypass);
        sb.append(", channel=");
        sb.append((Object) this.channel);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", enablePPE=");
        sb.append(this.enablePPE);
        sb.append(", enableTTP=");
        sb.append(this.enableTTP);
        sb.append(", boeLane=");
        sb.append((Object) this.boeLane);
        sb.append(", ppeLane=");
        sb.append((Object) this.ppeLane);
        sb.append(", ttpLane=");
        sb.append((Object) this.ttpLane);
        sb.append(", boeWebviewHostBypassList=");
        sb.append(Arrays.toString(this.boeWebviewHostBypassList));
        sb.append(", boeWebviewPathBypassList=");
        sb.append(Arrays.toString(this.boeWebviewPathBypassList));
        sb.append(", boeHostBypassList=");
        sb.append(Arrays.toString(this.boeHostBypassList));
        sb.append(", boePathBypassList=");
        return C07670Rv.LIZIZ(sb, Arrays.toString(this.boePathBypassList), ')');
    }

    public final String[] getBoeHostBypassList() {
        return this.boeHostBypassList;
    }

    public final String getBoeLane() {
        return this.boeLane;
    }

    public final String[] getBoePathBypassList() {
        return this.boePathBypassList;
    }

    public final String[] getBoeWebviewHostBypassList() {
        return this.boeWebviewHostBypassList;
    }

    public final String[] getBoeWebviewPathBypassList() {
        return this.boeWebviewPathBypassList;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final Boolean getEnableBoeJsbBypass() {
        return this.enableBoeJsbBypass;
    }

    public final Boolean getEnablePPE() {
        return this.enablePPE;
    }

    public final Boolean getEnableTTP() {
        return this.enableTTP;
    }

    public final String getPpeLane() {
        return this.ppeLane;
    }

    public final String getTtpLane() {
        return this.ttpLane;
    }

    public final Integer getType() {
        return this.type;
    }

    public BoeMockEntity(boolean z, Boolean bool, String str, Integer num, Boolean bool2, Boolean bool3, String str2, String str3, String str4, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        this.enable = z;
        this.enableBoeJsbBypass = bool;
        this.channel = str;
        this.type = num;
        this.enablePPE = bool2;
        this.enableTTP = bool3;
        this.boeLane = str2;
        this.ppeLane = str3;
        this.ttpLane = str4;
        this.boeWebviewHostBypassList = strArr;
        this.boeWebviewPathBypassList = strArr2;
        this.boeHostBypassList = strArr3;
        this.boePathBypassList = strArr4;
    }

    public /* synthetic */ BoeMockEntity(boolean z, Boolean bool, String str, Integer num, Boolean bool2, Boolean bool3, String str2, String str3, String str4, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? 0 : num, (i & 16) != 0 ? Boolean.FALSE : bool2, (i & 32) != 0 ? Boolean.FALSE : bool3, (i & 64) != 0 ? "prod" : str2, (i & 128) != 0 ? "prod" : str3, (i & 256) == 0 ? str4 : "prod", (i & 512) != 0 ? null : strArr, (i & 1024) != 0 ? null : strArr2, (i & 2048) != 0 ? null : strArr3, (i & 4096) == 0 ? strArr4 : null);
    }
}
