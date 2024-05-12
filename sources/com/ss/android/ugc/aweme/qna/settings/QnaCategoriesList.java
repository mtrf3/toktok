package com.ss.android.ugc.aweme.qna.settings;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QnaCategoriesList extends F9E {

    @InterfaceC65349Pkn("question_category")
    public final List<QnaCategoryListItem> categories;

    public QnaCategoriesList() {
        this(null, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.categories};
    }

    public QnaCategoriesList(List<QnaCategoryListItem> categories) {
        o.LJIIIZ(categories, "categories");
        this.categories = categories;
    }

    public QnaCategoriesList(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list);
    }
}
