package X;

import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListState;
import kotlin.jvm.internal.o;

/* renamed from: X.T2t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74007T2t extends AbstractC65781Prl implements InterfaceC88471Ynr<GifEmojiListState, ListState, GifEmojiListState> {
    public static final C74007T2t LJLIL = new C74007T2t();

    public C74007T2t() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final GifEmojiListState invoke(GifEmojiListState gifEmojiListState, ListState listState) {
        GifEmojiListState inject = gifEmojiListState;
        ListState it = listState;
        o.LJIIIZ(inject, "$this$inject");
        o.LJIIIZ(it, "it");
        return GifEmojiListState.copy$default(inject, null, null, it, 3, null);
    }
}
