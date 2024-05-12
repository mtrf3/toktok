package com.ss.android.ugc.aweme.share.improve.action.whythisvid;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class WhyThisVideoModel extends F9E {

    @InterfaceC65349Pkn("biz_type")
    public final String bizType;

    @InterfaceC65349Pkn("body")
    public final String body;

    @InterfaceC65349Pkn("button_text")
    public final String buttonText;

    @InterfaceC65349Pkn("sub_body")
    public final String subBody;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public WhyThisVideoModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.title, this.body, this.subBody, this.buttonText, this.bizType};
    }

    public WhyThisVideoModel(String title, String body, String subBody, String buttonText, String bizType) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(body, "body");
        o.LJIIIZ(subBody, "subBody");
        o.LJIIIZ(buttonText, "buttonText");
        o.LJIIIZ(bizType, "bizType");
        this.title = title;
        this.body = body;
        this.subBody = subBody;
        this.buttonText = buttonText;
        this.bizType = bizType;
    }

    public /* synthetic */ WhyThisVideoModel(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? "algo" : str5);
    }
}
