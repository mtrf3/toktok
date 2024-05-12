package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.services.IAVMobService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import kotlin.jvm.internal.o;

/* renamed from: X.8Wo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212748Wo {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C212778Wr.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C212758Wp.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C212768Wq.LJLIL);

    public static void LIZIZ(Context context, Aweme aweme, String str) {
        String str2;
        String str3;
        Music music;
        Music music2;
        if (context == null) {
            return;
        }
        String LIZJ2 = C212688Wi.LIZJ(aweme);
        if (LIZJ2 != null) {
            C212648We.LIZIZ().storeLong(C212648We.LIZ(LIZJ2, "effect_%s_click_last_time"), System.currentTimeMillis());
        }
        String LIZ2 = AnonymousClass629.LIZ("randomUUID().toString()");
        IAVMobService aVMobService = AVExternalServiceImpl.LIZ().getAVMobService();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("shoot_way", "prop_page");
        c188727au.LJIIIZ("enter_method", "click_prop_publish");
        c188727au.LJIIIZ("creation_id", LIZ2);
        c188727au.LJIIIZ("is_prop_prompt", "1");
        String str4 = null;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("group_id", str2);
        if (aweme != null) {
            str3 = aweme.getAuthorUid();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("from_user_id", str3);
        aVMobService.onEventV3("shoot", c188727au.LIZ);
        ICommerceMediaService iCommerceMediaService = (ICommerceMediaService) LIZJ.getValue();
        if (aweme != null) {
            music = aweme.getMusic();
        } else {
            music = null;
        }
        if (!iCommerceMediaService.LJIILLIIL(music) && aweme != null && (music2 = aweme.getMusic()) != null) {
            str4 = music2.getIdStr();
        }
        ((IExternalService) LIZ.getValue()).asyncService("FEPXYH", new C43986HOc(context, aweme, LIZJ2, str4, str, LIZ2));
    }

    public static final void LIZ(Aweme aweme, int i, String eventType, Fragment fragment) {
        MainActivityScope LJJLIIIJILLIZJL;
        PublishTabAbility LJJJJJ;
        o.LJIIIZ(eventType, "eventType");
        if (!C47261Igj.LJJIJIIJI(1, 2).contains(Integer.valueOf(C212698Wj.LIZ().group))) {
            return;
        }
        ISpecialPlusService iSpecialPlusService = (ISpecialPlusService) LIZIZ.getValue();
        if ((iSpecialPlusService != null && iSpecialPlusService.shouldShowSpecialPlus()) || fragment == null || (LJJLIIIJILLIZJL = C78866UxK.LJJLIIIJILLIZJL(fragment)) == null || (LJJJJJ = C77357UXp.LJJJJJ(LJJLIIIJILLIZJL)) == null) {
            return;
        }
        String LIZJ2 = C212688Wi.LIZJ(aweme);
        if (C212688Wi.LIZLLL(aweme) && LIZJ2 != null && C212638Wd.LIZ.LIZ(i, LIZJ2, eventType)) {
            LJJJJJ.ey(aweme);
            C212648We.LIZIZ().storeLong("transform_total_count", C212648We.LIZIZ().getLong("transform_total_count", 0L) + 1);
            C212648We.LIZIZ().storeLong(C212648We.LIZ(LIZJ2, "effect_%s_transform_count"), C212648We.LIZIZ().getLong(C212648We.LIZ(LIZJ2, "effect_%s_transform_count"), 0L) + 1);
            C212638Wd.LIZIZ.put(eventType, Integer.valueOf(i));
            C212688Wi.LJ(aweme, eventType);
            return;
        }
        LJJJJJ.ey(null);
    }
}
