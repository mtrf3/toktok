package X;

import Y.ARunnableS10S1100000_9;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher;
import defpackage.b1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LfB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54809LfB extends C199547sM<Aweme> implements InterfaceC54817LfJ {
    public final MineUserStoryFetcher LJ;
    public final C62822Ol8 LJFF;

    public final boolean LJIIIZ() {
        return ((Boolean) this.LJFF.getValue()).booleanValue();
    }

    @Override // X.InterfaceC54817LfJ
    public final MineUserStoryFetcher LIZJ() {
        return this.LJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54809LfB(MineUserStoryFetcher mineUserStoryFetcher) {
        super(0);
        o.LJIIIZ(mineUserStoryFetcher, "mineUserStoryFetcher");
        this.LJ = mineUserStoryFetcher;
        this.LJFF = C221108m2.LIZIZ(C54810LfC.LJLIL);
    }

    @Override // X.AbstractC54815LfH, X.InterfaceC54816LfI
    public final List<Aweme> LIZIZ(List<? extends String> uidList) {
        o.LJIIIZ(uidList, "uidList");
        if (!LJIIIZ()) {
            return null;
        }
        return super.LIZIZ(uidList);
    }

    @Override // X.AbstractC54815LfH, X.InterfaceC54816LfI
    /* renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final Aweme get(String uid) {
        o.LJIIIZ(uid, "uid");
        if (!LJIIIZ()) {
            return null;
        }
        if (C54838Lfe.LJIIJJI(uid)) {
            this.LJ.getClass();
            return MineUserStoryFetcher.LIZ();
        }
        return LIZLLL(uid);
    }

    @Override // X.InterfaceC54817LfJ
    public final void LIZ(String str, List userStories) {
        o.LJIIIZ(userStories, "userStories");
        if (!LJIIIZ()) {
            return;
        }
        Iterator it = userStories.iterator();
        while (it.hasNext()) {
            LJIIJ((Aweme) it.next(), str, true);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tried update ");
        LIZ.append(userStories.size());
        LIZ.append(" in cache");
        C189837ch.LJ("UserStoryCache", X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC54815LfH, X.InterfaceC54816LfI
    public final C199567sO<Aweme> replace(String k, Aweme v) {
        o.LJIIIZ(k, "k");
        o.LJIIIZ(v, "v");
        if (!LJIIIZ()) {
            return null;
        }
        return super.replace(k, v);
    }

    public final void LJIIJ(Aweme userStory, String str, boolean z) {
        User author;
        String uid;
        UserStory userStory2;
        UserStory userStory3;
        String uid2;
        long j;
        long j2;
        o.LJIIIZ(userStory, "userStory");
        if (!LJIIIZ()) {
            return;
        }
        C199567sO c199567sO = null;
        if (C54838Lfe.LJIIJJI(userStory.getAuthorUid()) || C54838Lfe.LJIIJJI(userStory.getAid())) {
            if (z) {
                if (userStory.getUserStory() == null) {
                    C36922EeM.LIZ(new IllegalArgumentException("UserStory Aweme is not valid"));
                }
                C78847Ux1.LJJJLL(userStory, str, true);
                if (userStory.getAuthor() == null) {
                    userStory.setAuthor(AV1.LIZIZ());
                }
                LYD lyd = LYD.LIZ;
                Aweme m114clone = userStory.m114clone();
                o.LJIIIIZZ(m114clone, "userStoryAweme.clone()");
                lyd.getClass();
                C53578L1a.LIZ.getClass();
                if (!C53578L1a.LIZ() || (author = m114clone.getAuthor()) == null || (uid = author.getUid()) == null || !C78857UxB.LJJJIL(uid) || (userStory2 = m114clone.getUserStory()) == null || userStory2.getFakeAwemeShell()) {
                    return;
                }
                Aweme aweme = LYD.LIZIZ;
                if (aweme != null) {
                    userStory3 = aweme.getUserStory();
                } else {
                    userStory3 = null;
                }
                LYD.LIZIZ = m114clone;
                C54808LfA c54808LfA = C54808LfA.LIZLLL;
                UserStory userStory4 = m114clone.getUserStory();
                o.LJI(userStory4);
                Aweme aweme2 = LYD.LIZIZ;
                if (aweme2 == null) {
                    aweme2 = LYD.LIZ();
                    aweme2.setUserStory(aweme2.getUserStory());
                }
                List LIZJ = C54808LfA.LIZJ(userStory3, userStory4);
                if (!(true ^ LIZJ.isEmpty())) {
                    return;
                }
                c54808LfA.LIZIZ.onNext(new C54789Ler(LIZJ, userStory4, aweme2, null));
                return;
            }
            return;
        }
        C78847Ux1.LJJJLL(userStory, str, z);
        if (!LJIIIZ()) {
            return;
        }
        User author2 = userStory.getAuthor();
        if (author2 != null && (uid2 = author2.getUid()) != null && C78857UxB.LJJJIL(uid2)) {
            UserStory userStory5 = userStory.getUserStory();
            if (userStory5 == null) {
                C189837ch.LIZ("UserStoryCache", "abort updating because this Aweme is not story collection");
                return;
            }
            if (userStory5.getFakeAwemeShell()) {
                C189837ch.LIZ("UserStoryCache", "abort updating because this Aweme is fake story collection");
                return;
            }
            String uid3 = userStory.getAuthor().getUid();
            o.LJIIIIZZ(uid3, "uid");
            C199567sO<Aweme> remove = remove(uid3);
            if (remove != null) {
                if (remove.LIZ.getUserStory() != null) {
                    StringBuilder LIZJ2 = b1.LIZJ(uid3, " already in cache, updated. old aweme instance: ");
                    LIZJ2.append(System.identityHashCode(remove.LIZ.getUserStory()));
                    LIZJ2.append(", new: ");
                    LIZJ2.append(System.identityHashCode(userStory));
                    C189837ch.LJ("UserStoryCache", X1D.LIZIZ(LIZJ2));
                }
            } else {
                StringBuilder LIZIZ = C25620zW.LIZIZ("add node ", uid3, " to cache, aweme instance: ");
                LIZIZ.append(System.identityHashCode(userStory));
                C189837ch.LJ("UserStoryCache", X1D.LIZIZ(LIZIZ));
            }
            if (z || remove == null) {
                String aid = userStory.getAid();
                o.LJIIIIZZ(aid, "userStory.aid");
                if (LJIIIZ()) {
                    c199567sO = super.replace(aid, userStory);
                }
            } else {
                String aid2 = userStory.getAid();
                o.LJIIIIZZ(aid2, "userStory.aid");
                if (LJIIIZ()) {
                    c199567sO = LJII(aid2, userStory);
                    ((C36040ECm) this.LIZ.getValue()).put(aid2, userStory);
                }
            }
            UserStory userStory6 = userStory.getUserStory();
            if (userStory6 != null) {
                if (c199567sO != null) {
                    j = c199567sO.LIZIZ;
                } else {
                    j = -1;
                }
                userStory6.setAddToCacheTime(j);
            }
            UserStory userStory7 = userStory.getUserStory();
            long j3 = 0;
            if (userStory7 != null) {
                j2 = userStory7.getAddToCacheTime();
            } else {
                j2 = 0;
            }
            UserStory userStory8 = userStory.getUserStory();
            if (userStory8 != null) {
                j3 = userStory8.getAddToCacheTime();
            }
            if (j2 >= j3) {
                String uid4 = userStory.getAuthor().getUid();
                o.LJIIIIZZ(uid4, "userStory.author.uid");
                C1DH.LJJIJIIJI(new ARunnableS10S1100000_9(userStory, uid4, 4));
                return;
            }
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("abort updating because uid empty, aid: ");
        LIZ.append(userStory.getAid());
        LIZ.append("; author: ");
        LIZ.append(userStory.getAuthor());
        C189837ch.LIZ("UserStoryCache", X1D.LIZIZ(LIZ));
    }
}
