package com.ss.android.ugc.aweme.compliance.business.search.feedback;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class QuestionContent extends F9E implements Serializable {
    public static final int $stable = 8;
    public boolean LJLIL;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("value")
    public final String value;

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionContent() {
        this(null, 0 == true ? 1 : 0, false, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ QuestionContent copy$default(QuestionContent questionContent, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = questionContent.id;
        }
        if ((i & 2) != 0) {
            str2 = questionContent.value;
        }
        if ((i & 4) != 0) {
            z = questionContent.LJLIL;
        }
        return questionContent.copy(str, str2, z);
    }

    public final QuestionContent copy(String id, String value, boolean z) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(value, "value");
        return new QuestionContent(id, value, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.id, this.value, Boolean.valueOf(this.LJLIL)};
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getSelected() {
        return this.LJLIL;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setSelected(boolean z) {
        this.LJLIL = z;
    }

    public QuestionContent(String id, String value, boolean z) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(value, "value");
        this.id = id;
        this.value = value;
        this.LJLIL = z;
    }

    public /* synthetic */ QuestionContent(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }
}
