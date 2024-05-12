package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.8s8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224888s8 {
    public static Fragment LIZ;
    public static IAutoAScrollAbility LIZIZ;
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C224898s9.LJLIL);

    public static final String LIZJ() {
        if (LJFF(false)) {
            return "normal";
        }
        return "auto";
    }

    public static final AbstractC48820JEa LIZIZ() {
        return (AbstractC48820JEa) LIZJ.getValue();
    }

    public static final java.util.Map<String, String> LIZLLL() {
        java.util.Map<String, String> LLIZLLLIL = Z9N.LIZIZ.LLIZLLLIL();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : LLIZLLLIL.entrySet()) {
            if (o.LJ(entry.getKey(), "search_id")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final IAutoAScrollAbility LIZ(ActivityC45651qj activityC45651qj) {
        InterfaceC55235Lm3 LJFF;
        Fragment LJJJJIZL;
        HomeTabAbility LJIL;
        Context context = activityC45651qj;
        if (LIZIZ == null) {
            if (activityC45651qj == null) {
                context = C84763XOl.LJIIIIZZ();
            }
            IAutoAScrollAbility iAutoAScrollAbility = null;
            if (!(context instanceof ActivityC45651qj)) {
                return null;
            }
            ActivityC45651qj activityC45651qj2 = (ActivityC45651qj) context;
            if (LIZ == null) {
                String eventType = C2S6.LIZ(activityC45651qj2).getEventType();
                if ((activityC45651qj2 instanceof InterfaceC55058LjC) && C48758JBq.LIZ()) {
                    MainActivityScope LJJLIIIJJI = C78866UxK.LJJLIIIJJI(activityC45651qj2);
                    if (LJJLIIIJJI != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJI)) != null) {
                        LJJJJIZL = LJIL.Ja("For You");
                        LIZ = LJJJJIZL;
                    }
                    LJJJJIZL = null;
                    LIZ = LJJJJIZL;
                } else {
                    if (LJI(eventType) && (activityC45651qj2 instanceof InterfaceC224908sA) && Z9N.LIZIZ.LLJJIJI()) {
                        LJJJJIZL = ((InterfaceC224908sA) activityC45651qj2).LJJJJIZL();
                        LIZ = LJJJJIZL;
                    }
                    LJJJJIZL = null;
                    LIZ = LJJJJIZL;
                }
            }
            Fragment fragment = LIZ;
            if (fragment != null && (LJFF = KR8.LJFF(fragment)) != null) {
                iAutoAScrollAbility = (IAutoAScrollAbility) C55096Ljo.LIZ(LJFF, IAutoAScrollAbility.class, null);
            }
            LIZIZ = iAutoAScrollAbility;
        }
        return LIZIZ;
    }

    public static final boolean LJ(String str) {
        if (o.LJ(str, "homepage_hot") || LJI(str)) {
            return true;
        }
        return false;
    }

    public static final boolean LJFF(boolean z) {
        if (z) {
            if (!C48758JBq.LIZ()) {
                return true;
            }
        } else if (!C48758JBq.LIZ() && !Z9N.LIZIZ.LLJJIJI()) {
            return true;
        }
        IAutoAScrollAbility LIZ2 = LIZ(null);
        if (LIZ2 == null || LIZ2.dl() == EnumC223268pW.AUTO_SCROLL_STATE_STOP) {
            return true;
        }
        return false;
    }

    public static final boolean LJI(String str) {
        if (o.LJ(str, "general_search") || o.LJ(str, "search_result")) {
            return true;
        }
        return false;
    }

    public static final boolean LJII(Aweme aweme) {
        Integer num;
        List<PhotoModeImageUrlModel> imageList;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("isSpecialCard: type: ");
        Boolean bool = null;
        if (aweme != null) {
            num = Integer.valueOf(aweme.getAwemeType());
        } else {
            num = null;
        }
        LIZ2.append(num);
        LIZ2.append(", meet:");
        if (aweme != null) {
            bool = Boolean.valueOf(LJIIIZ(aweme));
        }
        LIZ2.append(bool);
        X1D.LIZIZ(LIZ2);
        if (aweme == null || aweme.isLive()) {
            return true;
        }
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if ((photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && imageList.size() == 1) || !LJIIIZ(aweme)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIIZZ(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 40) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIZ(Aweme aweme) {
        Boolean bool;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("meetAutoScrollCondition: isAd: ");
        Integer num = null;
        if (aweme != null) {
            bool = Boolean.valueOf(aweme.isAd());
        } else {
            bool = null;
        }
        LIZ2.append(bool);
        LIZ2.append(", type: ");
        if (aweme != null) {
            num = Integer.valueOf(aweme.getAwemeType());
        }
        LIZ2.append(num);
        LIZ2.append(' ');
        X1D.LIZIZ(LIZ2);
        if (aweme == null || C220858ld.LJIIJ(aweme)) {
            return false;
        }
        String aid = aweme.getAid();
        if (aid != null && ujb.o.LJJJLIIL(aid, "ug_referral_sub_", true)) {
            return false;
        }
        if (!aweme.isAd() && aweme.getAwemeType() != 0 && aweme.getAwemeType() != 40 && aweme.getAwemeType() != 152 && aweme.getAwemeType() != 150 && aweme.getAwemeType() != 51 && aweme.getAwemeType() != 58) {
            return false;
        }
        return true;
    }
}
