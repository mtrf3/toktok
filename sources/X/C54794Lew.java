package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lew, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54794Lew implements InterfaceC54795Lex {
    public static final C54794Lew LIZ = new C54794Lew();

    public static InterfaceC54795Lex LJIIIIZZ() {
        C53578L1a.LIZ.getClass();
        if (C53578L1a.LIZ()) {
            return C54812LfE.LIZ;
        }
        return new InterfaceC54795Lex() { // from class: X.7Ou
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
                HG3.LJIIL();
                aweme.setAid(HG3.LJLJL.LJFF().getCurUserId());
                aweme.setUserStory(new UserStory(new ArrayList(), 1L, 0L, false, 0L, 0L, false, false, 0L, true, null, false, 0L, null, false, false, null, 0, false, 523772, null));
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
        };
    }

    @Override // X.InterfaceC54795Lex
    public final Aweme LJI() {
        return LJIIIIZZ().LJI();
    }

    @Override // X.InterfaceC54795Lex
    public final void clear() {
        LJIIIIZZ().clear();
    }

    @Override // X.InterfaceC54795Lex
    public final void LIZIZ(String uid) {
        o.LJIIIZ(uid, "uid");
        LJIIIIZZ().LIZIZ(uid);
    }

    @Override // X.InterfaceC54795Lex
    public final AbstractC73672Svk LIZLLL(List list) {
        return LJIIIIZZ().LIZLLL(list);
    }

    @Override // X.InterfaceC54795Lex
    public final AbstractC73672Svk LJ(String uid) {
        o.LJIIIZ(uid, "uid");
        return LJIIIIZZ().LJ(uid);
    }

    @Override // X.InterfaceC54795Lex
    public final void LJFF(FollowStatus followStatus) {
        o.LJIIIZ(followStatus, "followStatus");
        LJIIIIZZ().LJFF(followStatus);
    }

    @Override // X.InterfaceC54795Lex
    public final Aweme LJII(String uid) {
        o.LJIIIZ(uid, "uid");
        return LJIIIIZZ().LJII(uid);
    }

    @Override // X.InterfaceC54795Lex
    public final void LIZ(String str, List userStories) {
        o.LJIIIZ(userStories, "userStories");
        LJIIIIZZ().LIZ(str, userStories);
    }

    @Override // X.InterfaceC54795Lex
    public final void LIZJ(Aweme userStory, String str, boolean z) {
        o.LJIIIZ(userStory, "userStory");
        LJIIIIZZ().LIZJ(userStory, str, z);
    }
}
