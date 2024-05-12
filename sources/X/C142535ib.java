package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import kotlin.jvm.internal.o;

/* renamed from: X.5ib, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142535ib extends F9E {
    public final DraftSaveResult LJLIL;
    public final AwemeDraft LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C142535ib(DraftSaveResult draftSaveResult, AwemeDraft draft) {
        o.LJIIIZ(draft, "draft");
        this.LJLIL = draftSaveResult;
        this.LJLILLLLZI = draft;
    }
}
