package com.ss.android.ugc.aweme.im.sdk.chat.feature.nudge;

import X.C113554cx;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TTDmNudgeConfigNudgeSticker extends F9E {

    @InterfaceC65349Pkn("animate_type")
    public final String animate_type;

    @InterfaceC65349Pkn("animate_url")
    public final String animate_url;

    @InterfaceC65349Pkn("display_name")
    public final String display_name;

    @InterfaceC65349Pkn("display_name_lang")
    public final Map<String, String> display_name_lang;

    @InterfaceC65349Pkn("height")
    public final int height;

    @InterfaceC65349Pkn("id")
    public final long id;

    @InterfaceC65349Pkn("resource_id")
    public final long resource_id;

    @InterfaceC65349Pkn("static_type")
    public final String static_type;

    @InterfaceC65349Pkn("static_url")
    public final String static_url;

    @InterfaceC65349Pkn("width")
    public final int width;

    public TTDmNudgeConfigNudgeSticker() {
        this(null, null, null, null, 0, 0, 0L, 0L, null, null, 1023, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.animate_type, this.animate_url, this.display_name, this.display_name_lang, Integer.valueOf(this.height), Integer.valueOf(this.width), Long.valueOf(this.id), Long.valueOf(this.resource_id), this.static_type, this.static_url};
    }

    public TTDmNudgeConfigNudgeSticker(String animate_type, String animate_url, String display_name, Map<String, String> display_name_lang, int i, int i2, long j, long j2, String static_type, String static_url) {
        o.LJIIIZ(animate_type, "animate_type");
        o.LJIIIZ(animate_url, "animate_url");
        o.LJIIIZ(display_name, "display_name");
        o.LJIIIZ(display_name_lang, "display_name_lang");
        o.LJIIIZ(static_type, "static_type");
        o.LJIIIZ(static_url, "static_url");
        this.animate_type = animate_type;
        this.animate_url = animate_url;
        this.display_name = display_name;
        this.display_name_lang = display_name_lang;
        this.height = i;
        this.width = i2;
        this.id = j;
        this.resource_id = j2;
        this.static_type = static_type;
        this.static_url = static_url;
    }

    public TTDmNudgeConfigNudgeSticker(String str, String str2, String str3, Map map, int i, int i2, long j, long j2, String str4, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "webp" : str, (i3 & 2) != 0 ? "https://p16-tiktokcdn-com.akamaized.net/obj/im-resource-tiktok/6867821798952443009.webp" : str2, (i3 & 4) != 0 ? "nudge" : str3, (i3 & 8) != 0 ? C113554cx.LJJL(new OSZ("en", "nudge"), new OSZ("local", "nudge")) : map, (i3 & 16) != 0 ? 300 : i, (i3 & 32) == 0 ? i2 : 300, (i3 & 64) != 0 ? 6867821798952443009L : j, (i3 & 128) != 0 ? 0L : j2, (i3 & 256) != 0 ? "png" : str4, (i3 & 512) != 0 ? "https://p16-tiktokcdn-com.akamaized.net/obj/im-resource-tiktok/6867821798952443009.png" : str5);
    }
}
