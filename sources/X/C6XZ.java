package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ImageChooseCoverActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6XZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6XZ {
    public static void LIZ(Activity activity, VideoPublishEditModel model) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(model, "model");
        Intent intent = new Intent(activity, (Class<?>) ImageChooseCoverActivity.class);
        intent.addFlags(603979776);
        C78866UxK.LJJLIIIJLLLLLLLZ(intent, model);
        C42326GjK.LIZ.getClass();
        C42326GjK.LJFF(activity, 9, intent);
        activity.overridePendingTransition(R.anim.x, R.anim.y);
    }
}
