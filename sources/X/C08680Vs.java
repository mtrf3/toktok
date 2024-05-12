package X;

import Y.IDfS292S0100000;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.model.FeedBanner;
import com.bytedance.android.livesdk.model.FeedBannerContainer;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import kotlin.jvm.internal.o;

/* renamed from: X.0Vs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08680Vs {
    public static final C08680Vs LJIILJJIL = C08670Vr.LIZ;
    public static final String LJIILL = "click";
    public static final String LJIILLIIL = "swipe";
    public static final String LJIIZILJ = "is_esports";
    public static final String LJIJ = "screen_type";
    public static final List<String> LJIJI = C47261Igj.LJJIJIIJI("game_drawer", "game_drawer_drops", "game_drawer_tournament");
    public int LIZ;
    public FeedExtra LIZIZ;
    public long LJFF;
    public long LJI;
    public String LJII;
    public String LJIIJ;
    public String LIZJ = "scroll";
    public String LIZLLL = "drawer";
    public String LJ = LJIILLIIL;
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public String LJIIJJI = "";
    public final C62822Ol8 LJIIL = C221108m2.LIZIZ(C50261yA.LJLIL);
    public final C62822Ol8 LJIILIIL = C221108m2.LIZIZ(C50251y9.LJLIL);

    public final void LIZ() {
        this.LIZIZ = null;
        this.LJFF = 0L;
        this.LIZ = 0;
        LJI().clear();
        LIZJ().clear();
        this.LIZJ = "scroll";
        this.LIZLLL = "drawer";
        this.LJI = 0L;
        this.LJII = null;
        this.LJIIJ = null;
        BJB.LIZJ().clear();
    }

    public final String LIZIZ() {
        String str = this.LJIIIIZZ;
        if (o.LJ(str, "game_drawer_drops")) {
            return "more_drops";
        }
        if (o.LJ(str, "game_drawer")) {
            return "esports";
        }
        return "";
    }

    public final HashSet<FeedItem> LIZJ() {
        return (HashSet) this.LJIILIIL.getValue();
    }

    public final int LJFF() {
        return o.LJ(this.LJIIIIZZ, "game_drawer") ? 1 : 0;
    }

    public final Stack<Long> LJI() {
        return (Stack) this.LJIIL.getValue();
    }

    public final int LJII() {
        FeedExtra feedExtra = this.LIZIZ;
        if (feedExtra != null) {
            List<FeedBanner> list = null;
            if (feedExtra.bannerContainer != null) {
                FeedBannerContainer feedBannerContainer = feedExtra.bannerContainer;
                if (feedBannerContainer != null) {
                    list = feedBannerContainer.bannerList;
                }
                if (!C79004UzY.LJJIFFI(list)) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public final int LJ() {
        return LJI().size();
    }

    public final void LJIIIZ() {
        String str;
        Room room;
        Iterator<FeedItem> it = LIZJ().iterator();
        String str2 = "";
        while (it.hasNext()) {
            FeedItem next = it.next();
            if (next != null && (room = next.getRoom()) != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str2);
                LIZ.append(room.getId());
                LIZ.append(',');
                str2 = X1D.LIZIZ(LIZ);
            }
        }
        if (ujb.o.LJJJJ(str2, ",", false)) {
            str2 = str2.substring(0, str2.length() - 1);
            o.LJIIIIZZ(str2, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if (!C38354F3m.LJ(str2)) {
            FeedExtra feedExtra = this.LIZIZ;
            String str3 = null;
            if (feedExtra != null) {
                str = feedExtra.unreadExtra;
            } else {
                str = null;
            }
            if (C38354F3m.LJ(str)) {
                return;
            }
            RoomRetrofitApi roomRetrofitApi = (RoomRetrofitApi) Q7L.LIZIZ(RoomRetrofitApi.class);
            FeedExtra feedExtra2 = this.LIZIZ;
            if (feedExtra2 != null) {
                str3 = feedExtra2.unreadExtra;
            }
            roomRetrofitApi.collectUnreadRequest(str3, str2).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new IDfS292S0100000(this, 21), new InterfaceC64592gB() { // from class: X.1NV
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
            LIZJ().clear();
        }
    }

    public static final String LIZLLL(String str) {
        if (TextUtils.equals(str, "match")) {
            return "manual_pk";
        }
        if (TextUtils.equals(str, "guests")) {
            return "audience";
        }
        if (TextUtils.equals(str, "cohost")) {
            return "anchor";
        }
        return "normal";
    }

    public final void LJIIIIZZ(DataChannel dataChannel, boolean z) {
        if (this.LJFF != 0) {
            if (LJ() == 0 || z) {
                BZI LIZ = C28787BRn.LIZ("livesdk_explore_total_duration");
                LIZ.LJIILLIIL(dataChannel);
                LIZ.LJIJJ(Integer.valueOf(LJII()), "has_banner");
                I9A.LIZ(SystemClock.elapsedRealtime(), this.LJFF, LIZ, "duration");
                LIZ.LJIJJ(Integer.valueOf(this.LIZ), "total_explore_level");
                LIZ.LJIJJ(Integer.valueOf(LJIILJJIL.LJFF()), LJIIZILJ);
                LIZ.LJIJJ(C08660Vq.LIZ(), LJIJ);
                LIZ.LJIJJ(LIZIZ(), "entrance_type");
                LIZ.LJJIIJZLJL();
                this.LJFF = 0L;
                this.LIZ = 0;
            }
        }
    }
}
