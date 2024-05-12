package X;

import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.recommend.RecUserInMainActivityViewModel;
import com.ss.android.ugc.aweme.recommend.RecUserPopupInMainActivityController;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M42 {
    public static RecUserPopupInMainActivityController LIZ(ActivityC45651qj fragmentActivity, M43 sceneType, Aweme aweme) {
        o.LJIIIZ(fragmentActivity, "fragmentActivity");
        o.LJIIIZ(sceneType, "sceneType");
        java.util.Map<M43, RecUserPopupInMainActivityController> map = RecUserPopupInMainActivityController.LJLJJL;
        RecUserPopupInMainActivityController recUserPopupInMainActivityController = (RecUserPopupInMainActivityController) ((LinkedHashMap) map).get(sceneType);
        if (recUserPopupInMainActivityController == null) {
            RecUserPopupInMainActivityController recUserPopupInMainActivityController2 = new RecUserPopupInMainActivityController(fragmentActivity, sceneType, aweme, (RecUserInMainActivityViewModel) new ViewModelProvider(fragmentActivity).get(RecUserInMainActivityViewModel.class));
            map.put(sceneType, recUserPopupInMainActivityController2);
            return recUserPopupInMainActivityController2;
        }
        return recUserPopupInMainActivityController;
    }
}
