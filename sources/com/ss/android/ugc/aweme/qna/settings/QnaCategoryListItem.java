package com.ss.android.ugc.aweme.qna.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QnaCategoryListItem extends F9E {

    @InterfaceC65349Pkn("category_id")
    public final String categoryId;

    @InterfaceC65349Pkn("category_display_name")
    public final String categoryName;

    /* JADX WARN: Multi-variable type inference failed */
    public QnaCategoryListItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.categoryName, this.categoryId};
    }

    public QnaCategoryListItem(String categoryName, String categoryId) {
        o.LJIIIZ(categoryName, "categoryName");
        o.LJIIIZ(categoryId, "categoryId");
        this.categoryName = categoryName;
        this.categoryId = categoryId;
    }

    public /* synthetic */ QnaCategoryListItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
