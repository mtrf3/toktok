package com.ss.android.ugc.aweme.feed.model;

import X.C43588H8u;
import X.InterfaceC65349Pkn;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class CCTemplateInfo implements Serializable {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("author_name")
    public String authorName;

    @InterfaceC65349Pkn("clip_count")
    public int clip_count;

    @InterfaceC65349Pkn("duration_milliseconds")
    public int duration;

    @InterfaceC65349Pkn("match_type")
    public String match_type;

    @InterfaceC65349Pkn("music_copyright")
    public boolean music_copyright;

    @InterfaceC65349Pkn("onelink")
    public String onelink;

    @InterfaceC65349Pkn("schema_extra")
    public String schemaExtraJsonStr;

    @InterfaceC65349Pkn("style_type")
    public int style_type;
    public int templateOrder;

    @InterfaceC65349Pkn("desc")
    public String template_desc;

    @InterfaceC65349Pkn("template_id")
    public String template_id;

    @InterfaceC65349Pkn("related_music_id")
    public String template_music_id;

    @InterfaceC65349Pkn("usage")
    public int usage;

    public final String getMusicCopyrightStr() {
        if (this.music_copyright) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public final boolean isMatchThePolicy() {
        return !TextUtils.isEmpty(this.match_type);
    }

    public final boolean isTemplateBottomStyleDoubleBtn() {
        if (this.style_type == 2) {
            return true;
        }
        return false;
    }

    public final boolean isTemplateBottomStyleSingleBtn() {
        if (this.style_type == 1) {
            return true;
        }
        return false;
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final int getClip_count() {
        return this.clip_count;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getMatch_type() {
        return this.match_type;
    }

    public final boolean getMusic_copyright() {
        return this.music_copyright;
    }

    public final String getOnelink() {
        return this.onelink;
    }

    public final String getSchemaExtraJsonStr() {
        return this.schemaExtraJsonStr;
    }

    public final int getStyle_type() {
        return this.style_type;
    }

    public final int getTemplateOrder() {
        return this.templateOrder;
    }

    public final String getTemplate_desc() {
        return this.template_desc;
    }

    public final String getTemplate_id() {
        return this.template_id;
    }

    public final String getTemplate_music_id() {
        return this.template_music_id;
    }

    public final int getUsage() {
        return this.usage;
    }

    public final void appendQueryParameter(Uri.Builder uriBuilder) {
        o.LJIIIZ(uriBuilder, "uriBuilder");
        if (!TextUtils.isEmpty(this.schemaExtraJsonStr)) {
            try {
                JSONObject jSONObject = new JSONObject(this.schemaExtraJsonStr);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "jsonObj.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null) {
                        uriBuilder.appendQueryParameter(next, JSONObjectProtectorUtils.getString(jSONObject, next));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void setAuthorName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.authorName = str;
    }

    public final void setClip_count(int i) {
        this.clip_count = i;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setMatch_type(String str) {
        this.match_type = str;
    }

    public final void setMusic_copyright(boolean z) {
        this.music_copyright = z;
    }

    public final void setOnelink(String str) {
        this.onelink = str;
    }

    public final void setSchemaExtraJsonStr(String str) {
        this.schemaExtraJsonStr = str;
    }

    public final void setStyle_type(int i) {
        this.style_type = i;
    }

    public final void setTemplateOrder(int i) {
        this.templateOrder = i;
    }

    public final void setTemplate_desc(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.template_desc = str;
    }

    public final void setTemplate_id(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.template_id = str;
    }

    public final void setTemplate_music_id(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.template_music_id = str;
    }

    public final void setUsage(int i) {
        this.usage = i;
    }

    public CCTemplateInfo(String str, String str2, String str3, int i, int i2, String str4, int i3, boolean z, int i4, String str5, String str6, String str7) {
        C43588H8u.LIZLLL(str, "template_id", str2, "template_desc", str3, "authorName", str4, "template_music_id");
        this.template_id = str;
        this.template_desc = str2;
        this.authorName = str3;
        this.clip_count = i;
        this.duration = i2;
        this.template_music_id = str4;
        this.usage = i3;
        this.music_copyright = z;
        this.style_type = i4;
        this.onelink = str5;
        this.match_type = str6;
        this.schemaExtraJsonStr = str7;
        this.templateOrder = -1;
    }

    public /* synthetic */ CCTemplateInfo(String str, String str2, String str3, int i, int i2, String str4, int i3, boolean z, int i4, String str5, String str6, String str7, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i, i2, str4, i3, z, (i5 & 256) != 0 ? 0 : i4, (i5 & 512) != 0 ? "" : str5, (i5 & 1024) != 0 ? "" : str6, (i5 & 2048) == 0 ? str7 : "");
    }
}
