package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.services.BaseUserService;
import kotlin.jvm.internal.o;

/* renamed from: X.Xzt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C86669Xzt {
    public final Aweme LIZ;

    public C86669Xzt(Aweme aweme) {
        this.LIZ = aweme;
    }

    public static void LJFF(C188727au c188727au) {
        c188727au.LJIIIZ("user_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
    }

    public final void LIZJ(C188727au c188727au) {
        o.LJIIIZ(c188727au, "<this>");
        if (C41032G8m.LIZ()) {
            if (LJI(c188727au) || Y02.LJ(this.LIZ) || C2058886e.LIZ(this.LIZ)) {
                c188727au.LIZLLL(1, "is_video_translatable");
            }
        }
    }

    public final void LIZLLL(C188727au c188727au) {
        Object obj;
        Video video;
        o.LJIIIZ(c188727au, "<this>");
        Aweme aweme = this.LIZ;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            obj = Integer.valueOf(video.getDuration());
        } else {
            obj = "";
        }
        c188727au.LJFF(obj, "item_duration");
    }

    public final boolean LJI(C188727au c188727au) {
        o.LJIIIZ(c188727au, "<this>");
        String LJIIJ = c188727au.LJIIJ("have_transl");
        if (C78685UuP.LJJJZ(LJIIJ)) {
            return o.LJ(LJIIJ, "1");
        }
        Aweme aweme = this.LIZ;
        if ((aweme == null || Y04.LIZLLL(aweme) == null) && !C86670Xzu.LJIJ().LJIILJJIL(this.LIZ, C86670Xzu.LJIJ().LJJIIZI())) {
            return false;
        }
        return true;
    }

    public static void LIZ(C188727au c188727au, EnumC86777Y3x enterMethod) {
        o.LJIIIZ(enterMethod, "enterMethod");
        c188727au.LJIIIZ("enter_method", enterMethod.getValue());
    }

    public static void LIZIZ(C188727au c188727au, EnumC86689Y0n captionDisplayState) {
        String str;
        o.LJIIIZ(captionDisplayState, "captionDisplayState");
        int i = Y13.LIZ[captionDisplayState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str = "captions";
                } else {
                    throw new C162476Zf();
                }
            } else {
                str = "icon";
            }
        } else {
            str = "hidden";
        }
        c188727au.LJIIIZ("captions_show_type", str);
    }

    public final void LJ(C188727au c188727au, boolean z, String str) {
        String LJJIIZI = Y01.LIZIZ.LJJIIZI();
        String LJIIIZ = C86670Xzu.LJIIIZ(this.LIZ);
        if ((L2D.LIZ() && !o.LJ(LJJIIZI, LJIIIZ)) || C41032G8m.LIZ()) {
            if (str == null) {
                if (z) {
                    if (Y04.LIZIZ(this.LIZ)) {
                        str = "see_translation";
                    } else {
                        str = "see_translation_in_grey";
                    }
                } else {
                    str = "see_original";
                }
            }
            c188727au.LJI("translation_options", str);
        }
    }
}
