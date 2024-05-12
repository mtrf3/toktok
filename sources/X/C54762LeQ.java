package X;

import Y.ARunnableS8S1200000_9;
import Y.AfS61S0100000_9;
import Y.IDhS102S0100000_9;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.base.distribution.dispatcher.StoryReceiver;
import com.ss.android.ugc.aweme.story.experiment.PreloadConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS62S1100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.LeQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54762LeQ implements L6O {
    public final L61 LIZ = L61.STORY;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C53697L5p.LJLIL);
    public final String LIZJ = "aweme://story/detail";

    @Override // X.L6O
    public final C53710L6c LJ() {
        return LIZIZ(C54794Lew.LIZ.LJI());
    }

    @Override // X.L6O
    public final InterfaceC53698L5q LJII() {
        return (InterfaceC53698L5q) this.LIZIZ.getValue();
    }

    @Override // X.L6O
    public final L6U LJIIIZ() {
        return new C54763LeR();
    }

    public final C53710L6c LJIILJJIL() {
        C53710L6c LIZIZ = LIZIZ(C54794Lew.LIZ.LJI());
        C47261Igj.LJJJJLI(LIZIZ, Boolean.TRUE, Long.valueOf(System.currentTimeMillis()));
        C53708L6a.LIZIZ.LIZLLL(this.LIZ, LIZIZ);
        return LIZIZ;
    }

    @Override // X.L6O
    public final String LIZLLL() {
        return this.LIZJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        if (r1 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJIILIIL(int r6) {
        /*
            X.HLp r0 = X.C43921HLp.LIZ
            r0.getClass()
            java.util.concurrent.CopyOnWriteArrayList r1 = X.C43921HLp.LJIJ()
            r5 = 0
            r4 = 1
            if (r1 == 0) goto L13
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L43
        L13:
            r0 = 1
        L14:
            r3 = 2
            if (r0 == 0) goto L22
            r0 = 0
        L18:
            if (r6 != r4) goto L1c
        L1a:
            r5 = 1
        L1b:
            return r5
        L1c:
            if (r0 == r3) goto L20
            if (r6 != r3) goto L1b
        L20:
            r5 = 2
            goto L1b
        L22:
            java.util.Iterator r2 = r1.iterator()
        L26:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            com.ss.android.ugc.aweme.feed.model.story.Story r0 = r0.getStory()
            if (r0 == 0) goto L26
            boolean r0 = r0.getViewed()
            if (r0 != 0) goto L26
            if (r1 != 0) goto L1a
        L41:
            r0 = 2
            goto L18
        L43:
            r0 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54762LeQ.LJIILIIL(int):int");
    }

    @Override // X.L6O
    public final C53710L6c LIZ(User user) {
        int i;
        String str;
        if (user != null) {
            i = user.getStoryStatus();
            str = user.getUid();
        } else {
            i = -1;
            str = null;
        }
        if (C54838Lfe.LJIIJJI(str)) {
            return new C53710L6c(LJIILIIL(i), 6);
        }
        return new C53710L6c(i, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0072, code lost:
    
        if (0 != 0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    @Override // X.L6O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C53710L6c LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            r5 = this;
            java.lang.String r0 = "aweme"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            com.ss.android.ugc.aweme.feed.model.story.UserStory r0 = r6.getUserStory()
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L52
            java.util.List r0 = r0.getStories()
            if (r0 == 0) goto L52
            boolean r0 = r0.isEmpty()
            if (r0 != r4) goto L52
        L19:
            java.lang.String r1 = "getStatusFromAweme: status: "
            java.lang.String r0 = "， size: "
            java.lang.StringBuilder r1 = X.C7MY.LJ(r1, r3, r0)
            com.ss.android.ugc.aweme.feed.model.story.UserStory r0 = r6.getUserStory()
            if (r0 == 0) goto L50
            java.util.List r0 = r0.getStories()
            if (r0 == 0) goto L50
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L35:
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            java.lang.String r0 = r6.getAuthorUid()
            boolean r0 = X.C54838Lfe.LJIIJJI(r0)
            r2 = 6
            if (r0 == 0) goto L7a
            X.L6c r1 = new X.L6c
            int r0 = LJIILIIL(r3)
            r1.<init>(r0, r2)
            return r1
        L50:
            r0 = 0
            goto L35
        L52:
            r2 = 0
            com.ss.android.ugc.aweme.feed.model.story.UserStory r0 = r6.getUserStory()
            if (r0 == 0) goto L71
            boolean r0 = r0.getAllViewed()
            if (r0 != 0) goto L71
            r1 = 1
        L60:
            com.ss.android.ugc.aweme.feed.model.story.UserStory r0 = r6.getUserStory()
            if (r0 == 0) goto L74
            boolean r0 = r0.getAllViewed()
            if (r0 != r4) goto L74
            r0 = 1
        L6d:
            if (r1 == 0) goto L76
            r3 = 1
            goto L19
        L71:
            r1 = 0
            if (r2 == 0) goto L60
        L74:
            r0 = 0
            goto L6d
        L76:
            if (r0 == 0) goto L19
            r3 = 2
            goto L19
        L7a:
            X.L6c r0 = new X.L6c
            r0.<init>(r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54762LeQ.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme):X.L6c");
    }

    @Override // X.L6O
    public final void LJI(String tag) {
        o.LJIIIZ(tag, "tag");
        C43921HLp.LIZ.LIZLLL(tag);
    }

    @Override // X.L6O
    public final void LJIIJ(String str) {
        UserStory userStory;
        UserStory userStory2;
        List<Aweme> stories;
        Aweme LJII = C54794Lew.LIZ.LJII(str);
        int i = 0;
        if (LJII == null || (((userStory = LJII.getUserStory()) != null && userStory.getFakeSelfStoryCollection()) || (userStory2 = LJII.getUserStory()) == null || (stories = userStory2.getStories()) == null || stories.isEmpty())) {
            LJII = null;
        } else {
            i = 1;
        }
        FMX.LJIIL("story_cache_hit_event", C78920UyC.LIZJ(i, "is_hit_cache").LIZ);
        C55457Lpd.LJLJJLL = new C224348rG(str, LJII);
        C222578oP.LIZ = "click";
        IOF.LIZ.put("detail_page", new IOE(System.currentTimeMillis()));
    }

    @Override // X.L6O
    public final boolean LJIIJJI(EnumC53719L6l scene) {
        o.LJIIIZ(scene, "scene");
        int i = C53718L6k.LIZ[scene.ordinal()];
        if (i != 2 && i != 7) {
            if (i != 4) {
                if (i != 5) {
                    switch (i) {
                        case 10:
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            return L7K.LIZIZ;
                        case 12:
                            return L7K.LIZJ;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        case 14:
                            return C2304092m.LIZ();
                        default:
                            return C7EI.LIZ(scene);
                    }
                }
            } else {
                return L1Y.LIZ();
            }
        }
        return C53196KuG.LIZ();
    }

    @Override // X.L6O
    public final L6T LJIIL(EnumC53719L6l scene) {
        o.LJIIIZ(scene, "scene");
        switch (C53718L6k.LIZ[scene.ordinal()]) {
            case 1:
                return EnumC54773Leb.SEARCH;
            case 2:
                return EnumC54773Leb.FEED;
            case 3:
                return EnumC54773Leb.DM;
            case 4:
                return EnumC54773Leb.INBOX_TOP_LIST;
            case 5:
                return EnumC54773Leb.PROFILE;
            case 6:
                return EnumC54773Leb.PROFILE_VIEWS;
            case 7:
                return EnumC54773Leb.INBOX;
            case 8:
                return EnumC54773Leb.INBOX_SUGGESTED_ACCOUNT;
            case 9:
                return EnumC54773Leb.COMMENT;
            case 10:
                return EnumC54773Leb.FOLLOW_LIST;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return EnumC54773Leb.FOLLOW_SKYLIGHT;
            case 12:
                return EnumC54773Leb.FRIENDS_SKYLIGHT;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return EnumC54773Leb.STORY_GUIDE_CARD;
            case 14:
                return EnumC54773Leb.STORY_VIEWS_LIST_PANEL;
            default:
                return EnumC54773Leb.OTHER;
        }
    }

    @Override // X.L6O
    public final void LIZJ(String tag, InterfaceC54403LWt listener) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(listener, "listener");
        C43921HLp.LIZ.LJIIL(tag, new C54402LWs(listener, this));
    }

    @Override // X.L6O
    public final void LJFF(LifecycleOwner lifecycleOwner, AqS62S1100000_9 aqS62S1100000_9) {
        Class cls;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        C54764LeS c54764LeS = new C54764LeS(lifecycleOwner);
        String uid = ((RBX) HG3.LJIILL()).getCurUserId();
        if (!C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            C1DH.LJJIJIIJI(new ARunnableS8S1200000_9(c54764LeS, uid, aqS62S1100000_9, 8));
            return;
        }
        o.LJIIIIZZ(uid, "uid");
        TBW[] tbwArr = new TBW[0];
        C54808LfA c54808LfA = C54808LfA.LIZLLL;
        if (o.LJ(C65352Pkq.LIZ(C54772Lea.class), C65352Pkq.LIZ(C54772Lea.class))) {
            cls = C54772Lea.class;
        } else {
            cls = C54771LeZ.class;
        }
        C65776Prg LIZ = C65352Pkq.LIZ(cls);
        StoryReceiver storyReceiver = new StoryReceiver(uid, c54764LeS, c54808LfA);
        if (o.LJ(LIZ, C65352Pkq.LIZ(C54772Lea.class))) {
            c54808LfA.LIZIZ(c54764LeS, storyReceiver);
        }
        C73849Syb<C54789Ler<SUBSCRIBE_DATA, OUTPUT_DATA>> c73849Syb = c54808LfA.LIZIZ;
        storyReceiver.LJLJJI = C42193GhB.LIZJ(c73849Syb, c73849Syb).LJJIFFI(new C54766LeU(c54808LfA, uid)).LJJIJL(new IDhS102S0100000_9(tbwArr, 24)).LJIILJJIL(c54808LfA.LIZJ).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(aqS62S1100000_9, 85), new InterfaceC64592gB() { // from class: X.9Fp
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    @Override // X.L6O
    public final void LJIIIIZZ(List<? extends User> list, EnumC53719L6l enumC53719L6l) {
        int i;
        boolean z;
        if (enumC53719L6l == null) {
            i = -1;
        } else {
            i = L27.LIZ[enumC53719L6l.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                z = ((PreloadConfig) L26.LIZIZ.getValue()).otherAdvancePreload;
            } else {
                z = ((PreloadConfig) L26.LIZIZ.getValue()).profileAdvancePreload;
            }
        } else {
            z = ((PreloadConfig) L26.LIZIZ.getValue()).feedAdvancePreload;
        }
        if (!z) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            User user = (User) next;
            if (user.getStoryStatus() == 1 || user.getStoryStatus() == 2) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((User) it2.next()).getUid());
        }
        C54794Lew.LJIIIIZZ().LIZLLL(arrayList2);
    }
}
