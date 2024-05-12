package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS20S0010000_1;
import kotlin.jvm.internal.AqS44S0110000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.34L, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C34L implements C34J {
    public static final /* synthetic */ int LJIIJJI = 0;
    public Aweme LIZIZ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJII;
    public String LIZ = "";
    public String LIZJ = "";
    public String LJI = "";
    public final List<WeakReference<C34M>> LJIIIIZZ = FII.LIZ();
    public final List<WeakReference<C34N>> LJIIIZ = FII.LIZ();
    public List<Aweme> LJIIJ = FII.LIZ();

    @Override // X.C34J
    public final void onPause() {
        this.LIZLLL = false;
        List<WeakReference<C34M>> playStatusListenerList = this.LJIIIIZZ;
        o.LJIIIIZZ(playStatusListenerList, "playStatusListenerList");
        Iterator<E> it = C78886Uxe.LJJLIIIJL(playStatusListenerList).iterator();
        while (it.hasNext()) {
            C34M c34m = (C34M) ((Reference) it.next()).get();
            if (c34m != null) {
                c34m.o5();
            }
        }
    }

    @Override // X.C34J
    public final void onStart() {
        this.LIZLLL = true;
        List<WeakReference<C34M>> playStatusListenerList = this.LJIIIIZZ;
        o.LJIIIIZZ(playStatusListenerList, "playStatusListenerList");
        Iterator<E> it = C78886Uxe.LJJLIIIJL(playStatusListenerList).iterator();
        while (it.hasNext()) {
            C34M c34m = (C34M) ((Reference) it.next()).get();
            if (c34m != null) {
                c34m.s5();
            }
        }
    }

    public static boolean LIZLLL() {
        C779434c c779434c;
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe != null && (c779434c = c71082qe.LIZIZ) != null) {
            return c779434c.LJIIIZ();
        }
        return false;
    }

    public final boolean LJFF() {
        if (!LIZLLL()) {
            this.LIZLLL = false;
        }
        return this.LIZLLL;
    }

    public final void LIZ(C34M listener) {
        o.LJIIIZ(listener, "listener");
        this.LJIIIIZZ.add(new WeakReference<>(listener));
    }

    public final void LIZIZ(List<? extends Aweme> list) {
        o.LJIIIZ(list, "list");
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("appendPlaylist size: ");
        LIZ.append(list.size());
        C70922qO.LIZ("CastingPlayManager", X1D.LIZIZ(LIZ));
        if (LIZLLL()) {
            c71082qe.LIZ.LIZIZ("", list);
            this.LJIIJ.addAll(list);
        }
    }

    public final boolean LJ(String aid) {
        o.LJIIIZ(aid, "aid");
        List<Aweme> currentPlayingList = this.LJIIJ;
        o.LJIIIIZZ(currentPlayingList, "currentPlayingList");
        Iterator<Aweme> it = currentPlayingList.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (o.LJ(it.next().getAid(), aid)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        int intValue = valueOf.intValue();
        if (intValue == -1 || intValue != this.LJIIJ.size() - 1) {
            return false;
        }
        valueOf.intValue();
        return true;
    }

    public final void LJI(C34M listener) {
        o.LJIIIZ(listener, "listener");
        Iterator<WeakReference<C34M>> it = this.LJIIIIZZ.iterator();
        while (it.hasNext()) {
            if (o.LJ(it.next().get(), listener)) {
                it.remove();
            }
        }
    }

    public final void LJII(long j) {
        String str;
        String str2;
        C71052qb c71052qb;
        if (LIZLLL()) {
            Aweme aweme = this.LIZIZ;
            String str3 = null;
            if (aweme != null) {
                str = aweme.getGroupId();
            } else {
                str = null;
            }
            Aweme aweme2 = this.LIZIZ;
            if (aweme2 != null) {
                str3 = aweme2.getAuthorUid();
            }
            String enterFrom = this.LIZJ;
            String endPosition = String.valueOf(j);
            boolean z = !this.LJ;
            C85323Wm eventSender = C772831o.LIZ();
            o.LJIIIZ(enterFrom, "enterFrom");
            o.LJIIIZ(endPosition, "endPosition");
            o.LJIIIZ(eventSender, "eventSender");
            C1HQ LIZIZ = C48339Iy7.LIZIZ("enter_from", enterFrom);
            if (str == null) {
                str = "";
            }
            LIZIZ.put("group_id", str);
            if (str3 == null) {
                str3 = "";
            }
            LIZIZ.put("author_id", str3);
            LIZIZ.put("direction", "");
            LIZIZ.put("start_position", "");
            LIZIZ.put("end_position", endPosition);
            if (z) {
                str2 = "autoscroll";
            } else {
                str2 = "autoscroll_disabled";
            }
            LIZIZ.put("play_mode", str2);
            eventSender.LIZIZ("casting_video_progress_adjustment", LIZIZ);
            C71082qe c71082qe = C71042qa.LIZIZ;
            if (c71082qe != null && (c71052qb = c71082qe.LIZ) != null) {
                c71052qb.LJIILIIL(j);
            }
        }
    }

    public final void LJIIIIZZ(String str) {
        Aweme aweme;
        if (str == null) {
            return;
        }
        this.LIZ = str;
        List<Aweme> currentPlayingList = this.LJIIJ;
        o.LJIIIIZZ(currentPlayingList, "currentPlayingList");
        Iterator<Aweme> it = currentPlayingList.iterator();
        while (true) {
            if (it.hasNext()) {
                aweme = it.next();
                if (o.LJ(aweme.getAid(), str)) {
                    break;
                }
            } else {
                aweme = null;
                break;
            }
        }
        this.LIZIZ = aweme;
    }

    @Override // X.C34J
    public final void LJIL(String aid) {
        boolean z;
        String str;
        String str2;
        String str3;
        C779434c c779434c;
        o.LJIIIZ(aid, "aid");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onChangeFeed currentAid: ");
        LIZ.append(this.LIZ);
        LIZ.append(", aid: ");
        LIZ.append(aid);
        C70922qO.LIZ("CastingPlayManager", X1D.LIZIZ(LIZ));
        boolean z2 = !o.LJ(this.LIZ, aid);
        LJIIIIZZ(aid);
        if (z2) {
            String str4 = this.LIZJ;
            Aweme aweme = this.LIZIZ;
            String str5 = null;
            if (aweme != null) {
                str = aweme.getGroupId();
            } else {
                str = null;
            }
            Aweme aweme2 = this.LIZIZ;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            } else {
                str2 = null;
            }
            C71082qe c71082qe = C71042qa.LIZIZ;
            if (c71082qe != null && (c779434c = c71082qe.LIZIZ) != null) {
                str5 = c779434c.LJIIIIZZ();
            }
            Integer valueOf = Integer.valueOf(EF7.LJIIIZ);
            boolean z3 = !this.LJ;
            C85323Wm LIZ2 = C772831o.LIZ();
            C1HQ LIZ3 = C77800Ug8.LIZ(LIZ2, "eventSender");
            if (str4 == null) {
                str4 = "";
            }
            LIZ3.put("enter_from", str4);
            if (str == null) {
                str = "";
            }
            LIZ3.put("group_id", str);
            if (str2 == null) {
                str2 = "";
            }
            LIZ3.put("author_id", str2);
            LIZ3.put("is_tt_app", String.valueOf(true));
            if (str5 == null) {
                str5 = "";
            }
            LIZ3.put("casting_device_id", str5);
            LIZ3.put("app_id", "");
            if (valueOf != null) {
                valueOf.intValue();
                LIZ3.put("app_id", valueOf.toString());
            }
            LIZ3.put("start_position", String.valueOf(0));
            LIZ3.put("start_percent", String.valueOf(0));
            if (z3) {
                str3 = "autoscroll";
            } else {
                str3 = "autoscroll_disabled";
            }
            LIZ3.put("play_mode", str3);
            LIZ3.put("current_sender_screen", "video_feed");
            LIZ2.LIZIZ("casting_video_play", LIZ3);
            List<WeakReference<C34M>> playStatusListenerList = this.LJIIIIZZ;
            o.LJIIIIZZ(playStatusListenerList, "playStatusListenerList");
            Iterator<E> it = C78886Uxe.LJJLIIIJL(playStatusListenerList).iterator();
            while (it.hasNext()) {
                C34M c34m = (C34M) ((Reference) it.next()).get();
                if (c34m != null) {
                    c34m.LJIL(aid);
                }
            }
            List<WeakReference<C34N>> seekListenerList = this.LJIIIZ;
            o.LJIIIIZZ(seekListenerList, "seekListenerList");
            Iterator<E> it2 = C78886Uxe.LJJLIIIJL(seekListenerList).iterator();
            while (it2.hasNext()) {
                C34N c34n = (C34N) ((Reference) it2.next()).get();
                if (c34n != null) {
                    c34n.LJFF(this.LIZIZ);
                }
            }
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("onDramaId startingAid ");
        YE1.LIZLLL(LIZ4, this.LJI, " aid: ", aid, ", hasInitPlay: ");
        LIZ4.append(this.LJII);
        LIZ4.append(", condition: ");
        if (o.LJ(this.LJI, aid) && !this.LJII) {
            z = true;
        } else {
            z = false;
        }
        LIZ4.append(z);
        C70922qO.LIZ("CastingPlayManager", X1D.LIZIZ(LIZ4));
        if (o.LJ(this.LJI, aid) && !this.LJII) {
            this.LJII = true;
            List<WeakReference<C34M>> playStatusListenerList2 = this.LJIIIIZZ;
            o.LJIIIIZZ(playStatusListenerList2, "playStatusListenerList");
            Iterator<E> it3 = C78886Uxe.LJJLIIIJL(playStatusListenerList2).iterator();
            while (it3.hasNext()) {
                C34M c34m2 = (C34M) ((Reference) it3.next()).get();
                if (c34m2 != null) {
                    c34m2.v5(this.LIZIZ);
                }
            }
        }
        if (LJ(aid)) {
            LIZJ(this, true, false, 6);
        }
    }

    @Override // X.C34J
    public final void onPositionUpdate(long j, long j2) {
        Aweme aweme;
        String str;
        String str2;
        String str3;
        String str4;
        C779434c c779434c;
        StringBuilder LIZJ = V10.LIZJ("onPositionUpdate duration: ", j, ", position: ");
        LIZJ.append(j2);
        C70922qO.LIZ("CastingPlayManager", X1D.LIZIZ(LIZJ));
        if (this.LIZ.length() > 0 && LIZLLL()) {
            if (j > 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (timeUnit.toSeconds(j) == timeUnit.toSeconds(j2)) {
                    String str5 = this.LIZJ;
                    Aweme aweme2 = this.LIZIZ;
                    if (aweme2 != null) {
                        str = aweme2.getGroupId();
                    } else {
                        str = null;
                    }
                    Aweme aweme3 = this.LIZIZ;
                    if (aweme3 != null) {
                        str2 = aweme3.getAuthorUid();
                    } else {
                        str2 = null;
                    }
                    C71082qe c71082qe = C71042qa.LIZIZ;
                    if (c71082qe != null && (c779434c = c71082qe.LIZIZ) != null) {
                        str3 = c779434c.LJIIIIZZ();
                    } else {
                        str3 = null;
                    }
                    Integer valueOf = Integer.valueOf(EF7.LJIIIZ);
                    boolean z = !this.LJ;
                    C85323Wm LIZJ2 = C05040Hs.LIZJ(str5, "enterFrom", "eventSender");
                    C1HQ LIZIZ = C48339Iy7.LIZIZ("enter_from", str5);
                    if (str == null) {
                        str = "";
                    }
                    LIZIZ.put("group_id", str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    LIZIZ.put("author_id", str2);
                    LIZIZ.put("is_tt_app", String.valueOf(true));
                    LIZIZ.put("casting_device_id", str3);
                    LIZIZ.put("app_id", "");
                    if (valueOf != null) {
                        valueOf.intValue();
                        LIZIZ.put("app_id", valueOf.toString());
                    }
                    LIZIZ.put("duration", String.valueOf(j));
                    if (z) {
                        str4 = "autoscroll";
                    } else {
                        str4 = "autoscroll_disabled";
                    }
                    LIZIZ.put("play_mode", str4);
                    LIZIZ.put("current_sender_screen", "video_feed");
                    LIZIZ.put("current_sender_screen", "video_feed");
                    LIZJ2.LIZIZ("casting_video_playtime", LIZIZ);
                }
            }
            List<WeakReference<C34N>> seekListenerList = this.LJIIIZ;
            o.LJIIIIZZ(seekListenerList, "seekListenerList");
            Iterator<WeakReference<C34N>> it = seekListenerList.iterator();
            while (it.hasNext()) {
                C34N c34n = it.next().get();
                if (c34n != null) {
                    List<Aweme> currentPlayingList = this.LJIIJ;
                    o.LJIIIIZZ(currentPlayingList, "currentPlayingList");
                    Iterator<Aweme> it2 = currentPlayingList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            aweme = it2.next();
                            if (o.LJ(aweme.getAid(), this.LIZ)) {
                                break;
                            }
                        } else {
                            aweme = null;
                            break;
                        }
                    }
                    c34n.LIZJ(aweme, j, j2, this.LIZJ);
                }
            }
        }
    }

    public static void LIZJ(C34L c34l, boolean z, boolean z2, int i) {
        String str;
        String str2;
        String str3;
        C71052qb c71052qb;
        if ((i & 2) != 0) {
            z2 = false;
        }
        c34l.getClass();
        if (!LIZLLL() || z == c34l.LJ) {
            return;
        }
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe != null && (c71052qb = c71082qe.LIZ) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("changePlayMode isInitialized: ");
            LIZ.append(c71052qb.LIZJ);
            LIZ.append(", repeat: ");
            LIZ.append(z);
            C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
            if (c71052qb.LIZJ) {
                C71142qk c71142qk = new C71142qk();
                AqS44S0110000_1 aqS44S0110000_1 = new AqS44S0110000_1(c71052qb, z, 0);
                AqS20S0010000_1 aqS20S0010000_1 = new AqS20S0010000_1(z, 0);
                C71132qj failure = C71132qj.LJLIL;
                o.LJIIIZ(failure, "failure");
                synchronized (c71142qk) {
                    c71142qk.LJLIL = aqS44S0110000_1;
                    c71142qk.LJLILLLLZI = aqS20S0010000_1;
                    c71142qk.LJLJI = failure;
                    aqS44S0110000_1.invoke(c71142qk);
                }
            }
        }
        c34l.LJ = z;
        String str4 = c34l.LIZJ;
        Aweme aweme = c34l.LIZIZ;
        String str5 = null;
        if (aweme != null) {
            str = aweme.getGroupId();
        } else {
            str = null;
        }
        Aweme aweme2 = c34l.LIZIZ;
        if (aweme2 != null) {
            str5 = aweme2.getAuthorUid();
        }
        boolean z3 = !z;
        C85323Wm LIZJ = C05040Hs.LIZJ(str4, "enterFrom", "eventSender");
        C1HQ LIZIZ = C48339Iy7.LIZIZ("enter_from", str4);
        if (str == null) {
            str = "";
        }
        LIZIZ.put("group_id", str);
        if (str5 == null) {
            str5 = "";
        }
        LIZIZ.put("author_id", str5);
        if (z3) {
            str2 = "autoscroll";
        } else {
            str2 = "autoscroll_disabled";
        }
        LIZIZ.put("play_mode", str2);
        if (z2) {
            str3 = "user_click";
        } else {
            str3 = "non_video_feed";
        }
        LIZIZ.put("action_from", str3);
        LIZJ.LIZIZ("casting_video_autoscroll_change", LIZIZ);
        List<WeakReference<C34M>> playStatusListenerList = c34l.LJIIIIZZ;
        o.LJIIIIZZ(playStatusListenerList, "playStatusListenerList");
        Iterator<E> it = C78886Uxe.LJJLIIIJL(playStatusListenerList).iterator();
        while (it.hasNext()) {
            C34M c34m = (C34M) ((Reference) it.next()).get();
            if (c34m != null) {
                c34m.q5(c34l.LJ);
            }
        }
    }
}
