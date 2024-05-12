package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class FJV<V> implements Callable {
    public static final FJV<V> LJLIL = new FJV<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (validTopActivity == null) {
            return null;
        }
        Intent intent = new Intent(validTopActivity, (Class<?>) DFInstallBlankActivity.class);
        intent.putExtra("is_guide_clean_dialog", true);
        C16880lQ.LIZIZ(validTopActivity, intent);
        validTopActivity.overridePendingTransition(0, 0);
        return C76800UCe.LIZ;
    }
}
