package com.ss.android.ugc.aweme.comment.viewmodel;

import X.C70839Rr9;
import X.F9E;
import X.InterfaceC61312at;
import com.bytedance.jedi.arch.ext.list.ListState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class GifEmojiListState extends F9E implements InterfaceC61312at {
    public final String awemeId;
    public final String keyword;
    public final ListState listState;

    /* JADX WARN: Multi-variable type inference failed */
    public GifEmojiListState() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GifEmojiListState copy$default(GifEmojiListState gifEmojiListState, String str, String str2, ListState listState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gifEmojiListState.keyword;
        }
        if ((i & 2) != 0) {
            str2 = gifEmojiListState.awemeId;
        }
        if ((i & 4) != 0) {
            listState = gifEmojiListState.listState;
        }
        return gifEmojiListState.copy(str, str2, listState);
    }

    public final GifEmojiListState copy(String keyword, String awemeId, ListState listState) {
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(listState, "listState");
        return new GifEmojiListState(keyword, awemeId, listState);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.keyword, this.awemeId, this.listState};
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final ListState getListState() {
        return this.listState;
    }

    public GifEmojiListState(String keyword, String awemeId, ListState listState) {
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(listState, "listState");
        this.keyword = keyword;
        this.awemeId = awemeId;
        this.listState = listState;
    }

    public /* synthetic */ GifEmojiListState(String str, String str2, ListState listState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new ListState(new C70839Rr9(3), null, null, null, null, 30, null) : listState);
    }
}
