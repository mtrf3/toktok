package com.ss.android.ugc.aweme.sticker.data;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class CountDownStickerStruct implements Serializable {

    @InterfaceC65349Pkn("end_time")
    public Long expiredTime;

    @InterfaceC65349Pkn("is_subscribed")
    public Boolean subscribe;

    @InterfaceC65349Pkn("subscribe_count")
    public long subscribeNum;

    @InterfaceC65349Pkn("text_already_ended")
    public String textAlreadyExpired;

    @InterfaceC65349Pkn("text_already_subscribed")
    public String textAlreadySubscribed;

    @InterfaceC65349Pkn("text_to_be_subscribed")
    public String textTobeSubscribed;

    @InterfaceC65349Pkn("title")
    public String title;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CountDownStickerStruct() {
        /*
            r12 = this;
            r1 = 0
            r2 = 0
            r10 = 127(0x7f, float:1.78E-43)
            r0 = r12
            r4 = r2
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r11 = r1
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct.<init>():void");
    }

    public final long getMillSecond() {
        Long l = this.expiredTime;
        if (l != null) {
            return l.longValue() * 1000;
        }
        return 0L;
    }

    public final Long getExpiredTime() {
        return this.expiredTime;
    }

    public final Boolean getSubscribe() {
        return this.subscribe;
    }

    public final long getSubscribeNum() {
        return this.subscribeNum;
    }

    public final String getTextAlreadyExpired() {
        return this.textAlreadyExpired;
    }

    public final String getTextAlreadySubscribed() {
        return this.textAlreadySubscribed;
    }

    public final String getTextTobeSubscribed() {
        return this.textTobeSubscribed;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setExpiredTime(Long l) {
        this.expiredTime = l;
    }

    public final void setSubscribe(Boolean bool) {
        this.subscribe = bool;
    }

    public final void setSubscribeNum(long j) {
        this.subscribeNum = j;
    }

    public final void setTextAlreadyExpired(String str) {
        this.textAlreadyExpired = str;
    }

    public final void setTextAlreadySubscribed(String str) {
        this.textAlreadySubscribed = str;
    }

    public final void setTextTobeSubscribed(String str) {
        this.textTobeSubscribed = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public CountDownStickerStruct(String str, long j, long j2, Boolean bool, String str2, String str3, String str4) {
        this.title = str;
        this.subscribeNum = j2;
        this.subscribe = bool;
        this.textAlreadyExpired = str2;
        this.textTobeSubscribed = str3;
        this.textAlreadySubscribed = str4;
        this.expiredTime = Long.valueOf(j);
    }

    public /* synthetic */ CountDownStickerStruct(String str, long j, long j2, Boolean bool, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0L : j, (i & 4) == 0 ? j2 : 0L, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) == 0 ? str4 : "");
    }
}
