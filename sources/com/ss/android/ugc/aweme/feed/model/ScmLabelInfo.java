package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ScmLabelInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("learn_more_url")
    public final String learnMoreUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public ScmLabelInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ScmLabelInfo copy$default(ScmLabelInfo scmLabelInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scmLabelInfo.content;
        }
        if ((i & 2) != 0) {
            str2 = scmLabelInfo.learnMoreUrl;
        }
        return scmLabelInfo.copy(str, str2);
    }

    public final ScmLabelInfo copy(String content, String learnMoreUrl) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(learnMoreUrl, "learnMoreUrl");
        return new ScmLabelInfo(content, learnMoreUrl);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.content, this.learnMoreUrl};
    }

    public final String getContent() {
        return this.content;
    }

    public final String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    public ScmLabelInfo(String content, String learnMoreUrl) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(learnMoreUrl, "learnMoreUrl");
        this.content = content;
        this.learnMoreUrl = learnMoreUrl;
    }

    public /* synthetic */ ScmLabelInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
