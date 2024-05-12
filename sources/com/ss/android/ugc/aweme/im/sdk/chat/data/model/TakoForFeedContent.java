package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TakoForFeedContent extends BaseContent {

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("with_action")
    public final boolean with_action;

    /* JADX WARN: Multi-variable type inference failed */
    public TakoForFeedContent() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TakoForFeedContent copy$default(TakoForFeedContent takoForFeedContent, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = takoForFeedContent.text;
        }
        if ((i & 2) != 0) {
            z = takoForFeedContent.with_action;
        }
        return takoForFeedContent.copy(str, z);
    }

    public final TakoForFeedContent copy(String str, boolean z) {
        return new TakoForFeedContent(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoForFeedContent)) {
            return false;
        }
        TakoForFeedContent takoForFeedContent = (TakoForFeedContent) obj;
        return o.LJ(this.text, takoForFeedContent.text) && this.with_action == takoForFeedContent.with_action;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.with_action;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        String str = this.text;
        if (str == null) {
            return super.getMsgHint();
        }
        return str;
    }

    public final boolean isValid() {
        boolean z;
        String str = this.text;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TakoForFeedContent(text=");
        LIZ.append(this.text);
        LIZ.append(", with_action=");
        return C48339Iy7.LIZJ(LIZ, this.with_action, ')', LIZ);
    }

    public final String getText() {
        return this.text;
    }

    public final boolean getWith_action() {
        return this.with_action;
    }

    public TakoForFeedContent(String str, boolean z) {
        this.text = str;
        this.with_action = z;
    }

    public /* synthetic */ TakoForFeedContent(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
    }
}
