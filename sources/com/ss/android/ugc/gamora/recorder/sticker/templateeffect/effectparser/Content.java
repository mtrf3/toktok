package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Content {

    @InterfaceC65349Pkn("content")
    public final Content2 content;

    @InterfaceC65349Pkn("requirement")
    public final Map<String, Boolean> requirement;

    @InterfaceC65349Pkn("tag")
    public final String tag;

    @InterfaceC65349Pkn("version")
    public final String version;

    /* JADX WARN: Multi-variable type inference failed */
    public Content() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content content = (Content) obj;
        return o.LJ(this.content, content.content) && o.LJ(this.requirement, content.requirement) && o.LJ(this.tag, content.tag) && o.LJ(this.version, content.version);
    }

    public final int hashCode() {
        Content2 content2 = this.content;
        int hashCode = (content2 == null ? 0 : content2.hashCode()) * 31;
        Map<String, Boolean> map = this.requirement;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.tag;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.version;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Content(content=");
        LIZ.append(this.content);
        LIZ.append(", requirement=");
        LIZ.append(this.requirement);
        LIZ.append(", tag=");
        LIZ.append(this.tag);
        LIZ.append(", version=");
        return q.LIZIZ(LIZ, this.version, ')', LIZ);
    }

    public Content(Content2 content2, Map<String, Boolean> map, String str, String str2) {
        this.content = content2;
        this.requirement = map;
        this.tag = str;
        this.version = str2;
    }

    public /* synthetic */ Content(Content2 content2, Map map, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : content2, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
