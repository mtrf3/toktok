package com.bytedance.android.livesdk.chatroom.model;

import X.C31114CJa;
import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class QuickComment extends F9E {
    public static final C31114CJa Companion = new C31114CJa();

    @InterfaceC65349Pkn("duration")
    public final long duration;

    @InterfaceC65349Pkn("emote_list")
    public final List<EmoteModel> emoteList;

    @InterfaceC65349Pkn("priority")
    public final long priority;

    @InterfaceC65349Pkn("list")
    public final List<String> quickComments;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuickComment copy$default(QuickComment quickComment, List list, long j, List list2, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = quickComment.quickComments;
        }
        if ((i & 2) != 0) {
            j = quickComment.duration;
        }
        if ((i & 4) != 0) {
            list2 = quickComment.emoteList;
        }
        if ((i & 8) != 0) {
            j2 = quickComment.priority;
        }
        return quickComment.copy(list, j, list2, j2);
    }

    public final QuickComment copy(List<String> quickComments, long j, List<? extends EmoteModel> emoteList, long j2) {
        o.LJIIIZ(quickComments, "quickComments");
        o.LJIIIZ(emoteList, "emoteList");
        return new QuickComment(quickComments, j, emoteList, j2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.quickComments, Long.valueOf(this.duration), this.emoteList, Long.valueOf(this.priority)};
    }

    public final long getDuration() {
        return this.duration;
    }

    public final List<EmoteModel> getEmoteList() {
        return this.emoteList;
    }

    public final long getPriority() {
        return this.priority;
    }

    public final List<String> getQuickComments() {
        return this.quickComments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuickComment(List<String> quickComments, long j, List<? extends EmoteModel> emoteList, long j2) {
        o.LJIIIZ(quickComments, "quickComments");
        o.LJIIIZ(emoteList, "emoteList");
        this.quickComments = quickComments;
        this.duration = j;
        this.emoteList = emoteList;
        this.priority = j2;
    }
}
