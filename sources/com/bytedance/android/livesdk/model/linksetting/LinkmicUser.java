package com.bytedance.android.livesdk.model.linksetting;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LinkmicUser extends F9E {

    @InterfaceC65349Pkn("avatar_thumb")
    public ImageModel avatar;

    @InterfaceC65349Pkn("display_id")
    public String displayId;

    @InterfaceC65349Pkn("linkmic_id_str")
    public String linkMicIdStr;

    @InterfaceC65349Pkn("nick_name")
    public String nickName;

    @InterfaceC65349Pkn("room_id")
    public long roomId;

    @InterfaceC65349Pkn("user_id")
    public long userId;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LinkmicUser() {
        /*
            r11 = this;
            r1 = 0
            r5 = 0
            r9 = 63
            r0 = r11
            r3 = r1
            r6 = r5
            r7 = r5
            r8 = r5
            r10 = r5
            r0.<init>(r1, r3, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.model.linksetting.LinkmicUser.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.userId), Long.valueOf(this.roomId), this.linkMicIdStr, this.nickName, this.displayId, this.avatar};
    }

    public LinkmicUser(long j, long j2, String str, String str2, String str3, ImageModel imageModel) {
        HH1.LIZ(str, "linkMicIdStr", str2, "nickName", str3, "displayId");
        this.userId = j;
        this.roomId = j2;
        this.linkMicIdStr = str;
        this.nickName = str2;
        this.displayId = str3;
        this.avatar = imageModel;
    }

    public /* synthetic */ LinkmicUser(long j, long j2, String str, String str2, String str3, ImageModel imageModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) == 0 ? j2 : 0L, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) == 0 ? str3 : "", (i & 32) != 0 ? null : imageModel);
    }
}
