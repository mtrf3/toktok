package X;

import Y.AfS66S0100000_14;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.other.FollowLiveBubbleSettings;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Wcx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82699Wcx {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LJI;
    public static final HashSet<InterfaceC82702Wd0> LIZLLL = new HashSet<>();
    public static final C54193LOr LJ = new C54193LOr();
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C54271LRr.LJLIL);
    public static final C82698Wcw LJII = new C82698Wcw();

    public static void LIZ() {
        HashSet<InterfaceC82702Wd0> hashSet = LIZLLL;
        synchronized (hashSet) {
            Iterator<InterfaceC82702Wd0> it = hashSet.iterator();
            while (it.hasNext()) {
                InterfaceC82702Wd0 next = it.next();
                if (next.isShowing()) {
                    next.LIZ();
                }
            }
            LIZLLL.clear();
        }
    }

    public static void LIZIZ(TuxIconView tuxIconView, FeedItem feedItem) {
        User owner;
        ImageModel avatarThumb;
        Room room = feedItem.getRoom();
        if (room != null && (owner = room.getOwner()) != null && (avatarThumb = owner.getAvatarThumb()) != null) {
            C78720Uuy LJII2 = C15650jR.LIZ().LJII(R.drawable.cul);
            LJII2.LJIIIZ(avatarThumb);
            LJII2.LJIIL = Boolean.TRUE;
            LJII2.LJIIJJI(tuxIconView);
            tuxIconView.setVisibility(0);
        }
    }

    public static void LIZJ(ActivityC45651qj activityC45651qj, C82691Wcp c82691Wcp, InterfaceC54197LOv manager) {
        o.LJIIIZ(manager, "manager");
        Long LIZJ2 = InterfaceC30442Bx8.a1.LIZJ();
        if (!Keva.getRepo("debug_follow_live").getBoolean("no_time_limit", false)) {
            if (System.currentTimeMillis() < (FollowLiveBubbleSettings.INSTANCE.getDiffTime() * 1000) + LIZJ2.longValue()) {
                return;
            }
        }
        C82700Wcy c82700Wcy = new C82700Wcy(activityC45651qj, c82691Wcp, manager);
        if (LIZ) {
            return;
        }
        LIZ = true;
        ((FeedApi) Q7L.LIZIZ(FeedApi.class)).feed("/webcast/feed/", 0L, "tiktok_follow_high_value_bubble", new LinkedHashMap()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS66S0100000_14(c82700Wcy, 10), C82701Wcz.LJLIL);
    }
}
