package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class LiveTwoMatchLinkOptSettingData {

    @InterfaceC65349Pkn("cancel_invite_info_retry_duration")
    public int cancel_invite_info_retry_duration;

    @InterfaceC65349Pkn("invitee_battle_info_retry_duration")
    public int invitee_battle_info_retry_duration;

    @InterfaceC65349Pkn("invitee_open_delay")
    public int invitee_open_delay;

    @InterfaceC65349Pkn("inviter_battle_info_retry_count")
    public int inviter_battle_info_retry_count;

    @InterfaceC65349Pkn("inviter_battle_info_retry_duration")
    public int inviter_battle_info_retry_duration;

    @InterfaceC65349Pkn("inviter_open_delay")
    public int inviter_open_delay;

    @InterfaceC65349Pkn("permission_retry_count")
    public int permission_retry_count;

    @InterfaceC65349Pkn("permission_retry_duration")
    public int permission_retry_duration;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveTwoMatchLinkOptSettingData() {
        /*
            r11 = this;
            r1 = 0
            r9 = 255(0xff, float:3.57E-43)
            r10 = 0
            r0 = r11
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptSettingData.<init>():void");
    }

    public LiveTwoMatchLinkOptSettingData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.invitee_open_delay = i;
        this.inviter_open_delay = i2;
        this.inviter_battle_info_retry_duration = i3;
        this.invitee_battle_info_retry_duration = i4;
        this.cancel_invite_info_retry_duration = i5;
        this.inviter_battle_info_retry_count = i6;
        this.permission_retry_count = i7;
        this.permission_retry_duration = i8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ LiveTwoMatchLinkOptSettingData(int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r3 = r12
            r1 = r19
            r2 = r11
            r5 = r14
            r6 = r15
            r7 = r16
            r0 = r1 & 1
            r4 = 2000(0x7d0, float:2.803E-42)
            if (r0 == 0) goto L10
            r2 = 2000(0x7d0, float:2.803E-42)
        L10:
            r0 = r1 & 2
            if (r0 == 0) goto L16
            r3 = 6000(0x1770, float:8.408E-42)
        L16:
            r0 = r1 & 4
            if (r0 == 0) goto L41
        L1a:
            r0 = r1 & 8
            r9 = 1000(0x3e8, float:1.401E-42)
            if (r0 == 0) goto L22
            r5 = 1000(0x3e8, float:1.401E-42)
        L22:
            r0 = r1 & 16
            if (r0 == 0) goto L28
            r6 = 1000(0x3e8, float:1.401E-42)
        L28:
            r0 = r1 & 32
            r8 = 3
            if (r0 == 0) goto L2e
            r7 = 3
        L2e:
            r0 = r1 & 64
            if (r0 == 0) goto L3e
        L32:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L3b
        L36:
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L3b:
            r9 = r18
            goto L36
        L3e:
            r8 = r17
            goto L32
        L41:
            r4 = r13
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptSettingData.<init>(int, int, int, int, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
