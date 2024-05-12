package X;

import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class MA6 {
    public static final long LIZ = TimeUnit.DAYS.toMillis(3);
    public static final /* synthetic */ int LIZIZ = 0;

    public static boolean LIZIZ() {
        boolean z;
        boolean LJIILLIIL = AV1.LJIILLIIL();
        boolean LJ = C46604IQu.LJ();
        if (LJIILLIIL || !LJ) {
            return false;
        }
        if (MAN.LIZIZ.LIZIZ(ActivityStack.getValidTopActivity())) {
            return true;
        }
        if (!UgCommonServiceImpl.LJIJ().LIZIZ().LJII()) {
            MCT.LIZ("StoryWidgetGuideLogicUtil", "resource preload failed");
            return false;
        }
        C62822Ol8 c62822Ol8 = C53108Ksq.LIZ;
        if (((Number) c62822Ol8.getValue()).intValue() == 1 || ((Number) c62822Ol8.getValue()).intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = MA1.LJLILLLLZI.LJIIZILJ().getBoolean("keva_key_has_added_story_widget", false);
        StringBuilder LIZLLL = C00F.LIZLLL("shouldShowStoryWidgetGuideItem - isKidsMode: ", LJIILLIIL, ", isInWidgetExp: ", z, ", isInInboxStoryExp: ");
        LIZLLL.append(LJ);
        LIZLLL.append(", hasAlreadyAddedStoryWidget: ");
        LIZLLL.append(z2);
        MCT.LIZ("StoryWidgetGuideLogicUtil", X1D.LIZIZ(LIZLLL));
        if (!z || z2) {
            return false;
        }
        return true;
    }

    public static boolean LIZ(AbstractC38911fr abstractC38911fr) {
        long j = abstractC38911fr.LJIIZILJ().getLong("keva_key_widget_guide_appear_time", -1L);
        if (j < 0) {
            MCT.LIZ("StoryWidgetGuideLogicUtil", "[dz isStoryGuideFirstTimeShowMoreThan72Hours] appearTimeInMs < 0");
            return false;
        }
        long j2 = j + LIZ;
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZJ = V10.LIZJ("[dz isStoryGuideFirstTimeShowMoreThan72Hours] show72HourTimeInMs:", j2, ", curTime: ");
        LIZJ.append(currentTimeMillis);
        MCT.LIZ("StoryWidgetGuideLogicUtil", X1D.LIZIZ(LIZJ));
        if (currentTimeMillis <= j2) {
            return false;
        }
        return true;
    }
}
