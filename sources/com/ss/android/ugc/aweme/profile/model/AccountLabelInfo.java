package com.ss.android.ugc.aweme.profile.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AccountLabelInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("label_type")
    public int labelType;

    @InterfaceC65349Pkn("learn_more_url")
    public String learnMoreUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public AccountLabelInfo() {
        this(0, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AccountLabelInfo copy$default(AccountLabelInfo accountLabelInfo, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = accountLabelInfo.labelType;
        }
        if ((i2 & 2) != 0) {
            str = accountLabelInfo.content;
        }
        if ((i2 & 4) != 0) {
            str2 = accountLabelInfo.learnMoreUrl;
        }
        return accountLabelInfo.copy(i, str, str2);
    }

    public final AccountLabelInfo copy(int i, String content, String learnMoreUrl) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(learnMoreUrl, "learnMoreUrl");
        return new AccountLabelInfo(i, content, learnMoreUrl);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.labelType), this.content, this.learnMoreUrl};
    }

    public final String getContent() {
        return this.content;
    }

    public final int getLabelType() {
        return this.labelType;
    }

    public final String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    public final void setContent(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.content = str;
    }

    public final void setLabelType(int i) {
        this.labelType = i;
    }

    public final void setLearnMoreUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.learnMoreUrl = str;
    }

    public AccountLabelInfo(int i, String content, String learnMoreUrl) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(learnMoreUrl, "learnMoreUrl");
        this.labelType = i;
        this.content = content;
        this.learnMoreUrl = learnMoreUrl;
    }

    public /* synthetic */ AccountLabelInfo(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }
}
