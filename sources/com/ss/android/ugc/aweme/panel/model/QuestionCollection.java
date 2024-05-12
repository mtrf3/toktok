package com.ss.android.ugc.aweme.panel.model;

import X.C61878OQg;
import X.F9E;
import X.I1P;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QuestionCollection extends F9E {

    @InterfaceC65349Pkn("collection_category")
    public final int category;

    @InterfaceC65349Pkn("cursor")
    public final int cursor;

    @InterfaceC65349Pkn("has_more")
    public final int hasMore;

    @InterfaceC65349Pkn("question_sticker_list")
    public final List<QaStruct> questionStickerStruct;

    public QuestionCollection() {
        this(0, null, 0, 0, 15, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.category), this.questionStickerStruct, Integer.valueOf(this.cursor), Integer.valueOf(this.hasMore)};
    }

    public QuestionCollection(int i, List<QaStruct> questionStickerStruct, int i2, int i3) {
        o.LJIIIZ(questionStickerStruct, "questionStickerStruct");
        this.category = i;
        this.questionStickerStruct = questionStickerStruct;
        this.cursor = i2;
        this.hasMore = i3;
    }

    public QuestionCollection(int i, List list, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? I1P.QuestionCollectionUNKNOWN.ordinal() : i, (i4 & 2) != 0 ? C61878OQg.INSTANCE : list, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3);
    }
}
