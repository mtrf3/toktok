package com.bytedance.android.livesdk.envelope.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class RedEnvelopInfo extends F9E {

    @InterfaceC65349Pkn("business_type")
    public Integer businessType;

    @InterfaceC65349Pkn("diamond_count")
    public Integer diamondCount;

    @InterfaceC65349Pkn("envelope_id")
    public String envelopeId;

    @InterfaceC65349Pkn("envelope_idc")
    public String envelopeIdc;

    @InterfaceC65349Pkn("follow_show_status")
    public int followShowStatus;

    @InterfaceC65349Pkn("people_count")
    public Integer peopleCount;

    @InterfaceC65349Pkn("room_id")
    public String roomId;

    @InterfaceC65349Pkn("send_user_avatar")
    public ImageModel sendUserAvatar;

    @InterfaceC65349Pkn("send_user_id")
    public String sendUserId;

    @InterfaceC65349Pkn("send_user_name")
    public String sendUserName;

    @InterfaceC65349Pkn("skin_id")
    public int skinId;

    @InterfaceC65349Pkn("unpack_at")
    public Integer unpackAt;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RedEnvelopInfo() {
        /*
            r15 = this;
            r1 = 0
            r11 = 0
            r13 = 4095(0xfff, float:5.738E-42)
            r0 = r15
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r12 = r11
            r14 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.envelope.model.RedEnvelopInfo.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.envelopeId, this.businessType, this.envelopeIdc, this.sendUserName, this.diamondCount, this.peopleCount, this.unpackAt, this.sendUserId, this.sendUserAvatar, this.roomId, Integer.valueOf(this.followShowStatus), Integer.valueOf(this.skinId)};
    }

    public RedEnvelopInfo(String str, Integer num, String str2, String str3, Integer num2, Integer num3, Integer num4, String str4, ImageModel imageModel, String str5, int i, int i2) {
        this.envelopeId = str;
        this.businessType = num;
        this.envelopeIdc = str2;
        this.sendUserName = str3;
        this.diamondCount = num2;
        this.peopleCount = num3;
        this.unpackAt = num4;
        this.sendUserId = str4;
        this.sendUserAvatar = imageModel;
        this.roomId = str5;
        this.followShowStatus = i;
        this.skinId = i2;
    }

    public /* synthetic */ RedEnvelopInfo(String str, Integer num, String str2, String str3, Integer num2, Integer num3, Integer num4, String str4, ImageModel imageModel, String str5, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : num2, (i3 & 32) != 0 ? null : num3, (i3 & 64) != 0 ? null : num4, (i3 & 128) != 0 ? null : str4, (i3 & 256) != 0 ? null : imageModel, (i3 & 512) == 0 ? str5 : null, (i3 & 1024) != 0 ? 0 : i, (i3 & 2048) == 0 ? i2 : 0);
    }
}
