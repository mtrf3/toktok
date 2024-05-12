package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C4FU;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ReferenceInfoHint implements Serializable {

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("refmsg_template_quote")
    public final String refMsg_template_quote;

    @InterfaceC65349Pkn("refmsg_content")
    public final String refmsg_content;

    @InterfaceC65349Pkn("refmsg_sec_uid")
    public final String refmsg_sec_uid;

    @InterfaceC65349Pkn("refmsg_sub_type")
    public final String refmsg_sub_type;

    @InterfaceC65349Pkn("refmsg_type")
    public final int refmsg_type;

    @InterfaceC65349Pkn("refmsg_uid")
    public final String refmsg_uid;

    /* JADX WARN: Multi-variable type inference failed */
    public ReferenceInfoHint() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public final String getRefMsgSubType() {
        String str = this.refmsg_sub_type;
        if (str != null) {
            return str;
        }
        if (this.refmsg_type != 5) {
            return null;
        }
        try {
            if (new JSONObject(this.content).optLong("image_id") != C4FU.LIZJ.getId()) {
                return null;
            }
            return "action_bar:nudge";
        } catch (Exception unused) {
            return null;
        }
    }

    public final String getContent() {
        return this.content;
    }

    public final String getRefMsg_template_quote() {
        return this.refMsg_template_quote;
    }

    public final String getRefmsg_content() {
        return this.refmsg_content;
    }

    public final String getRefmsg_sec_uid() {
        return this.refmsg_sec_uid;
    }

    public final int getRefmsg_type() {
        return this.refmsg_type;
    }

    public final String getRefmsg_uid() {
        return this.refmsg_uid;
    }

    public ReferenceInfoHint(String content, String refmsg_uid, String refmsg_sec_uid, int i, String str, String refmsg_content, String refMsg_template_quote) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(refmsg_uid, "refmsg_uid");
        o.LJIIIZ(refmsg_sec_uid, "refmsg_sec_uid");
        o.LJIIIZ(refmsg_content, "refmsg_content");
        o.LJIIIZ(refMsg_template_quote, "refMsg_template_quote");
        this.content = content;
        this.refmsg_uid = refmsg_uid;
        this.refmsg_sec_uid = refmsg_sec_uid;
        this.refmsg_type = i;
        this.refmsg_sub_type = str;
        this.refmsg_content = refmsg_content;
        this.refMsg_template_quote = refMsg_template_quote;
    }

    public /* synthetic */ ReferenceInfoHint(String str, String str2, String str3, int i, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) == 0 ? str6 : "");
    }
}
