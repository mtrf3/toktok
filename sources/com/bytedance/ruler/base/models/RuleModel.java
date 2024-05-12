package com.bytedance.ruler.base.models;

import X.InterfaceC65349Pkn;
import com.google.gson.j;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public class RuleModel {

    @InterfaceC65349Pkn("cel")
    public String cel;

    @InterfaceC65349Pkn("conf")
    public j conf;

    @InterfaceC65349Pkn("key")
    public String key;

    @InterfaceC65349Pkn("title")
    public String title;

    /* JADX WARN: Multi-variable type inference failed */
    public RuleModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public RuleModel(String str, j jVar, String str2, String str3) {
        this.title = str;
        this.conf = jVar;
        this.cel = str2;
        this.key = str3;
    }

    public /* synthetic */ RuleModel(String str, j jVar, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : jVar, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
