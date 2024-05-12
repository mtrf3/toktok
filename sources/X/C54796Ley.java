package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ley, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54796Ley implements InterfaceC54795Lex {
    @Override // X.InterfaceC54795Lex
    public final void LIZ(String str, List userStories) {
        o.LJIIIZ(userStories, "userStories");
    }

    @Override // X.InterfaceC54795Lex
    public final void LIZIZ(String uid) {
        o.LJIIIZ(uid, "uid");
    }

    @Override // X.InterfaceC54795Lex
    public final void LIZJ(Aweme userStory, String str, boolean z) {
        o.LJIIIZ(userStory, "userStory");
    }

    @Override // X.InterfaceC54795Lex
    public final void LJFF(FollowStatus followStatus) {
        o.LJIIIZ(followStatus, "followStatus");
    }

    @Override // X.InterfaceC54795Lex
    public final Aweme LJII(String uid) {
        o.LJIIIZ(uid, "uid");
        return null;
    }

    @Override // X.InterfaceC54795Lex
    public final void clear() {
    }

    @Override // X.InterfaceC54795Lex
    public final Aweme LJI() {
        Aweme aweme = new Aweme();
        aweme.setAid("");
        return aweme;
    }

    @Override // X.InterfaceC54795Lex
    public final AbstractC73672Svk LIZLLL(List list) {
        return AbstractC73672Svk.LJJIJIL(C61878OQg.INSTANCE);
    }

    @Override // X.InterfaceC54795Lex
    public final AbstractC73672Svk LJ(String uid) {
        o.LJIIIZ(uid, "uid");
        return AbstractC73672Svk.LJJIJIL(new Aweme());
    }
}
