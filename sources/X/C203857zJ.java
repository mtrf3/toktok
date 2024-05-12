package X;

import android.view.View;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.7zJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203857zJ {
    public static final java.util.Map<String, OSJ<String, Boolean, Boolean>> LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final C62822Ol8 LIZJ;

    static {
        C203857zJ c203857zJ = new C203857zJ();
        LIZ = new LinkedHashMap();
        LIZIZ = C221108m2.LIZIZ(C203887zM.LJLIL);
        LIZJ = C221108m2.LIZIZ(C203847zI.LJLIL);
        EventBus.LIZJ().LJIILJJIL(c203857zJ);
    }

    public static void LIZIZ(Aweme aweme) {
        String str;
        if (aweme != null) {
            C62822Ol8 c62822Ol8 = LIZIZ;
            Object value = c62822Ol8.getValue();
            o.LJIIIIZZ(value, "<get-favoriteService>(...)");
            if (!((IFavoriteService) value).LJIIIZ()) {
                str = "hit_favorite_reverse";
            } else {
                Object value2 = c62822Ol8.getValue();
                o.LJIIIIZZ(value2, "<get-favoriteService>(...)");
                if (((IFavoriteService) value2).LJI() == 0) {
                    str = "hit_favorite_on_video_player_reverse";
                } else if (aweme.isAd() && !C203867zK.LIZ) {
                    str = "model_is_ad";
                } else if (aweme.getAwemeType() == 40) {
                    str = "model_is_story";
                } else {
                    str = "unknown_reason";
                }
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("reason", str);
            FMX.LJIIL("collection_button_not_exposed", c188727au.LIZ);
        }
    }

    public static boolean LIZLLL(Aweme aweme) {
        if (aweme != null && (((aweme.isAd() && C203867zK.LIZ) || !aweme.isAd()) && !C54838Lfe.LJJI(aweme))) {
            Object value = LIZIZ.getValue();
            o.LJIIIIZZ(value, "<get-favoriteService>(...)");
            if (((IFavoriteService) value).LJI() > 0) {
                return true;
            }
        }
        return false;
    }

    @QD3
    public final void onPanelShowed(C203877zL event) {
        o.LJIIIZ(event, "event");
        Aweme i6 = AwemeService.LIZ().i6(event.LJLIL);
        if (i6 != null && i6.getAwemeType() == 40) {
            return;
        }
        for (OSJ osj : ((LinkedHashMap) LIZ).values()) {
            if (o.LJ(osj.getFirst(), event.LJLIL)) {
                if (!event.LJLILLLLZI && !((Boolean) osj.getSecond()).booleanValue() && FavoriteServiceImpl.LJIJJLI().LJIIIZ()) {
                    if (((Boolean) osj.getThird()).booleanValue() && !C203867zK.LIZ) {
                        return;
                    }
                    FMX.onEventV3("collection_function_vanished");
                    return;
                }
                return;
            }
        }
        if (!event.LJLILLLLZI && FavoriteServiceImpl.LJIJJLI().LJIIIZ()) {
            if (AwemeService.LIZ().k6(event.LJLIL) != null && !C203867zK.LIZ) {
                return;
            }
            FMX.onEventV3("collection_function_vanished");
        }
    }

    public static void LIZJ(ActivityC45651qj activity, String id, String enterFrom, View view) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(id, "id");
        o.LJIIIZ(enterFrom, "enterFrom");
        if (view == null) {
            FavoriteServiceImpl.LJIJJLI().LIZJ(activity, id, enterFrom);
        } else {
            FavoriteServiceImpl.LJIJJLI().LJIILLIIL(activity, id, enterFrom, view);
        }
    }

    public static InterfaceC65462ha LIZ(Aweme aweme, String str, String str2, boolean z, long j) {
        o.LJIIIZ(aweme, "aweme");
        return ((InterfaceC203837zH) ((InterfaceC214228aw) LIZJ.getValue()).getOperator()).LJJLIL(aweme, str, str2, z, j);
    }
}
