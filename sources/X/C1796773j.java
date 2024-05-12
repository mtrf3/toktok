package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.73j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1796773j extends Comment {
    public final Aweme LJLIL;
    public final C173966sC LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;

    public final Aweme getAweme() {
        return this.LJLIL;
    }

    public final C173966sC getMobParams() {
        return this.LJLILLLLZI;
    }

    public final boolean isAnchorsFold() {
        return this.LJLJJI;
    }

    public final boolean isTaggedPeopleFold() {
        return this.LJLJI;
    }

    public final void setAnchorsFold(boolean z) {
        this.LJLJJI = z;
    }

    public final void setTaggedPeopleFold(boolean z) {
        this.LJLJI = z;
    }

    public C1796773j(Aweme aweme, C173966sC mobParams) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(mobParams, "mobParams");
        this.LJLIL = aweme;
        this.LJLILLLLZI = mobParams;
        this.LJLJI = true;
        this.LJLJJI = true;
    }
}
