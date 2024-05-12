package X;

import com.ss.android.ugc.aweme.feed.model.story.Story;
import kotlin.jvm.internal.o;

/* renamed from: X.LlF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55185LlF extends AbstractC65781Prl implements InterfaceC88472Yns<C55127LkJ, Boolean> {
    public static final C55185LlF LJLIL = new C55185LlF();

    public C55185LlF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C55127LkJ c55127LkJ) {
        Story story;
        C55127LkJ it = c55127LkJ;
        o.LJIIIZ(it, "it");
        boolean z = false;
        if (C54838Lfe.LJJI(it.LIZ) && (story = it.LIZ.getStory()) != null && story.isPublishing()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
