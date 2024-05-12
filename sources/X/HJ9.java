package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HJ9 {
    public static void LIZJ(Activity activity, Bundle bundle, int i) {
        o.LJIIIZ(activity, "activity");
        if (C42721Gph.LIZ()) {
            bundle.putInt("key_choose_request_code", i);
            C42662Gok.LIZLLL(activity, bundle, "SelectMaterialScene", null, 24);
        } else {
            Intent intent = new Intent(activity, (Class<?>) MvChoosePhotoActivity.class);
            intent.putExtras(bundle);
            intent.putExtra("key_choose_request_code", i);
            C16880lQ.LIZIZ(activity, intent);
        }
    }

    public static void LIZLLL(Activity activity, Bundle bundle, int i) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(bundle, "bundle");
        Intent intent = new Intent(activity, (Class<?>) MvChoosePhotoActivity.class);
        intent.putExtras(bundle);
        intent.putExtra("key_choose_request_code", i);
        C16880lQ.LIZIZ(activity, intent);
    }

    public static Intent LIZ(Activity activity, Bundle bundle, int i, int i2) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(bundle, "bundle");
        Intent intent = new Intent(activity, (Class<?>) MvChoosePhotoActivity.class);
        intent.putExtras(bundle);
        intent.putExtra("key_choose_request_code", i);
        intent.putExtra("key_start_activity_request_code", i2);
        return intent;
    }

    public static Intent LIZIZ(Fragment fragment, Bundle bundle, int i, int i2) {
        o.LJIIIZ(fragment, "fragment");
        Intent intent = new Intent(fragment.requireContext(), (Class<?>) MvChoosePhotoActivity.class);
        intent.putExtras(bundle);
        intent.putExtra("key_choose_request_code", i);
        intent.putExtra("key_start_activity_request_code", i2);
        return intent;
    }

    public static void LJ(Activity activity, Bundle bundle, int i, int i2) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(bundle, "bundle");
        C16880lQ.LJFF(activity, i2, LIZ(activity, bundle, i, i2));
    }
}
