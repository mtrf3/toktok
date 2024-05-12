package X;

import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.vision.PhotoSearchViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KHS {
    public static PhotoSearchViewModel LIZ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return (PhotoSearchViewModel) ViewModelProviders.of(activity).get(PhotoSearchViewModel.class);
    }
}
