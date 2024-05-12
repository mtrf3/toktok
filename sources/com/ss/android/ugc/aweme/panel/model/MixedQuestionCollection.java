package com.ss.android.ugc.aweme.panel.model;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MixedQuestionCollection extends F9E {

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("next_page_token")
    public final String nextPageToken;

    @InterfaceC65349Pkn("question_sticker_list")
    public final List<QaStruct> questionStickerList;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.nextPageToken, this.questionStickerList, Boolean.valueOf(this.hasMore)};
    }

    public MixedQuestionCollection(String nextPageToken, List<QaStruct> questionStickerList, boolean z) {
        o.LJIIIZ(nextPageToken, "nextPageToken");
        o.LJIIIZ(questionStickerList, "questionStickerList");
        this.nextPageToken = nextPageToken;
        this.questionStickerList = questionStickerList;
        this.hasMore = z;
    }

    public MixedQuestionCollection(String str, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C61878OQg.INSTANCE : list, z);
    }
}
