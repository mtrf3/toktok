package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.commercialize.measurement.mrc.IMRCManager;
import com.ss.android.ugc.aweme.commercialize.measurement.mrc.MRCManager;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NT2 implements InterfaceC48872JGa {
    public static final NT2 LIZ = new NT2();
    public static NT3 LIZIZ;
    public static boolean LIZJ;

    static {
        C16880lQ.LJLLJ(NT2.class);
    }

    public static IMRCManager LJJJIL() {
        Object LIZ2 = C58096Mr6.LIZ(IMRCManager.class, false);
        if (LIZ2 != null) {
            return (IMRCManager) LIZ2;
        }
        if (C58096Mr6.LLLLLLLLLL == null) {
            synchronized (IMRCManager.class) {
                if (C58096Mr6.LLLLLLLLLL == null) {
                    C58096Mr6.LLLLLLLLLL = new MRCManager();
                }
            }
        }
        return C58096Mr6.LLLLLLLLLL;
    }

    public static final void LJJJJI(Context context) {
        NT3 nt3 = LIZIZ;
        if (nt3 != null) {
            nt3.LJJIIZ(context);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public static NT4 LJJJJLL(String str) {
        switch (str.hashCode()) {
            case -1271119582:
                if (str.equals("homepage_follow")) {
                    return NT4.FOLLOWING_FEED;
                }
                return NT4.DEFAULT;
            case -460940408:
                if (str.equals("homepage_popular")) {
                    return NT4.POPULAR_FEED;
                }
                return NT4.DEFAULT;
            case 998835423:
                if (str.equals("general_search")) {
                    return NT4.SEARCH;
                }
                return NT4.DEFAULT;
            case 1691937916:
                if (str.equals("homepage_hot")) {
                    return NT4.RECOMMEND_FEED;
                }
                return NT4.DEFAULT;
            default:
                return NT4.DEFAULT;
        }
    }

    @Override // X.InterfaceC48872JGa
    public final void init(JGV adSceneDepend) {
        o.LJIIIZ(adSceneDepend, "adSceneDepend");
        InterfaceC48875JGd interfaceC48875JGd = adSceneDepend.LIZ;
        o.LJII(interfaceC48875JGd, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.scene.api.video.IVideoAdSceneCallback");
        LIZIZ = (NT3) interfaceC48875JGd;
    }

    public final void onPlayStop(String str) {
        if (str == null || ujb.o.LJJJJJL(str)) {
            return;
        }
        LJJJIL().LIZIZ(str);
    }

    public static final void LJJIL(Aweme aweme, Context context) {
        NT3 nt3;
        if (aweme == null || context == null || !aweme.isAd() || (nt3 = LIZIZ) == null) {
            return;
        }
        nt3.LJJJLIIL(aweme, context);
    }

    public static final void LJJIZ(Aweme aweme, Context context) {
        NT3 nt3;
        if (aweme != null && context != null) {
            if ((!aweme.isAd() && !C63081OpJ.LLF(aweme)) || (nt3 = LIZIZ) == null) {
                return;
            }
            nt3.LJIIZILJ(aweme, context);
        }
    }

    public final void LJJIJIIJI(Context context, Aweme aweme) {
        if (context != null) {
            if (!aweme.isAd() && !C63081OpJ.LLF(aweme)) {
                return;
            }
            NT3 nt3 = LIZIZ;
            if (nt3 != null) {
                nt3.LJJIII(context, aweme);
            }
            if (!ECommerceService.createIECommerceServicebyMonsterPlugin(false).isECADVideo(aweme)) {
                return;
            }
            ECommerceService.createIECommerceServicebyMonsterPlugin(false).reportAdVideoLog(aweme, false, 3, ECommerceService.createIECommerceServicebyMonsterPlugin(false).generateTrackId(aweme));
        }
    }

    public final void LJJIJL(Context context, Aweme aweme) {
        if (aweme != null && context != null) {
            if (!aweme.isAd() && !C63081OpJ.LLF(aweme)) {
                return;
            }
            NT3 nt3 = LIZIZ;
            if (nt3 != null) {
                nt3.LJJIIZI(context, aweme);
            }
            if (!ECommerceService.createIECommerceServicebyMonsterPlugin(false).isECADVideo(aweme)) {
                return;
            }
            ECommerceService.createIECommerceServicebyMonsterPlugin(false).reportAdVideoLog(aweme, false, 1, ECommerceService.createIECommerceServicebyMonsterPlugin(false).generateTrackId(aweme));
        }
    }

    public final void LJJJJ(Context context, Aweme aweme) {
        NT3 nt3;
        if (context == null || !aweme.isAd() || (nt3 = LIZIZ) == null) {
            return;
        }
        nt3.LJIILIIL(context, aweme);
    }

    public static final void LJJIJIL(Aweme aweme, Context context, EnumC57246MdO enumC57246MdO) {
        NT3 nt3;
        if (context == null || !aweme.isAd() || (nt3 = LIZIZ) == null) {
            return;
        }
        nt3.LJJ(aweme, context, enumC57246MdO);
    }

    public final boolean LJJIJ(Context context, Aweme aweme, int i) {
        NT3 nt3;
        if (aweme == null || context == null) {
            return false;
        }
        if ((!aweme.isAd() && !C63081OpJ.LLF(aweme)) || (nt3 = LIZIZ) == null) {
            return false;
        }
        return nt3.LJIILLIIL(context, aweme, i);
    }

    public final void LJJIJIIJIL(Context context, Aweme aweme, boolean z) {
        NT3 nt3;
        if (aweme != null && context != null) {
            if ((!aweme.isAd() && !C63081OpJ.LLF(aweme)) || (nt3 = LIZIZ) == null) {
                return;
            }
            nt3.LJJIJIIJI(context, aweme, z);
        }
    }

    public final boolean LJJJI(Aweme aweme, ActivityC45651qj activityC45651qj, float f) {
        NT3 nt3;
        if (aweme == null || activityC45651qj == null || !aweme.isAd() || (nt3 = LIZIZ) == null) {
            return false;
        }
        return nt3.LJJJIL(aweme, activityC45651qj, f);
    }

    public static final void LJJJJLI(Aweme aweme, Context context, int i, int i2) {
        if (aweme == null || context == null || !aweme.isAd() || C63081OpJ.LJZL(aweme)) {
            return;
        }
        NT3 nt3 = LIZIZ;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LIZJ = true;
                if (nt3 == null) {
                    return;
                }
                nt3.LJJIJIIJIL(context, aweme);
                return;
            }
            if (LIZJ) {
                LIZJ = false;
                return;
            } else {
                if (nt3 == null) {
                    return;
                }
                nt3.LJIIJ(context, aweme, i2);
                return;
            }
        }
        if (LIZJ) {
            LIZJ = false;
        } else {
            if (nt3 == null) {
                return;
            }
            nt3.LJJIFFI(context, aweme, i2);
        }
    }

    public final void LJJJJJL(Context context, Aweme aweme, boolean z, boolean z2) {
        NT3 nt3;
        LIZJ = false;
        if (aweme != null && context != null) {
            if ((!aweme.isAd() && !C63081OpJ.LLF(aweme)) || (nt3 = LIZIZ) == null) {
                return;
            }
            nt3.LJJIZ(context, aweme, z, z2);
        }
    }

    public static final void LJJIJLIJ(Aweme aweme, Context context, String sourceId, OSZ<Integer, Long> osz, int i) {
        NT3 nt3;
        o.LJIIIZ(sourceId, "sourceId");
        if (context == null || !aweme.isAd() || (nt3 = LIZIZ) == null) {
            return;
        }
        nt3.LJIILL(aweme, context, sourceId, osz, i);
    }

    public static final void LJJJJIZL(Aweme aweme, Context context, long j, int i, String eventType) {
        o.LJIIIZ(eventType, "eventType");
        if (aweme == null || context == null || !aweme.isAd()) {
            return;
        }
        NT3 nt3 = LIZIZ;
        if (nt3 != null) {
            nt3.LJJIL(i, j, context, aweme);
        }
        LJJJIL().LIZJ("over", aweme, LJJJJLL(eventType));
    }

    public static final void LJJIIZI(Aweme aweme, Context context, Aweme aweme2, String str, OSZ<Integer, Long> osz, int i, String str2) {
        NT3 nt3;
        if (aweme == null || context == null || (nt3 = LIZIZ) == null) {
            return;
        }
        nt3.LJJIJL(aweme, context, aweme2, str, osz, i, str2);
    }

    public final void LJJJJJ(Aweme aweme, Context context, String eventType, View adView, String str, C94B isPlaying, C59343NQt currentSourceId) {
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(adView, "adView");
        o.LJIIIZ(isPlaying, "isPlaying");
        o.LJIIIZ(currentSourceId, "currentSourceId");
        if (str == null || ujb.o.LJJJJJL(str) || aweme == null || context == null) {
            return;
        }
        LJJJIL().LIZ(aweme, context, LJJJJLL(eventType), adView, str, new NT5(isPlaying, currentSourceId));
    }
}
