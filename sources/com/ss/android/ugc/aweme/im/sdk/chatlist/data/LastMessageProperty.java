package com.ss.android.ugc.aweme.im.sdk.chatlist.data;

import X.AnonymousClass324;
import X.C109544Rq;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class LastMessageProperty implements Serializable {
    public static final AnonymousClass324 Companion = new Object() { // from class: X.324
    };

    @InterfaceC65349Pkn("create_at")
    public final Long create_at_in_seconds;

    @InterfaceC65349Pkn("idempotent_id")
    public final String idempotent_id;

    @InterfaceC65349Pkn("key")
    public final String key;

    @InterfaceC65349Pkn("mark_read")
    public Integer mark_read;

    @InterfaceC65349Pkn("message")
    public final C109544Rq message;

    @InterfaceC65349Pkn("message_id")
    public final String message_id;

    @InterfaceC65349Pkn("sender_sec_uid")
    public final String sender_sec_uid;

    @InterfaceC65349Pkn("sender_uid")
    public final String sender_uid;

    @InterfaceC65349Pkn("value")
    public final String value;

    /* JADX WARN: Multi-variable type inference failed */
    public LastMessageProperty() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public final Long getCreate_at_in_seconds() {
        return this.create_at_in_seconds;
    }

    public final String getIdempotent_id() {
        return this.idempotent_id;
    }

    public final String getKey() {
        return this.key;
    }

    public final Integer getMark_read() {
        return this.mark_read;
    }

    public final C109544Rq getMessage() {
        return this.message;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getSender_sec_uid() {
        return this.sender_sec_uid;
    }

    public final String getSender_uid() {
        return this.sender_uid;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setMark_read(Integer num) {
        this.mark_read = num;
    }

    public LastMessageProperty(String str, String str2, Long l, String str3, String str4, String str5, String str6, C109544Rq c109544Rq, Integer num) {
        this.key = str;
        this.idempotent_id = str2;
        this.create_at_in_seconds = l;
        this.value = str3;
        this.sender_uid = str4;
        this.sender_sec_uid = str5;
        this.message_id = str6;
        this.message = c109544Rq;
        this.mark_read = num;
    }

    public /* synthetic */ LastMessageProperty(String str, String str2, Long l, String str3, String str4, String str5, String str6, C109544Rq c109544Rq, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : c109544Rq, (i & 256) == 0 ? num : null);
    }
}
