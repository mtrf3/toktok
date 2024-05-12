package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.utils.crop.CropFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.CfC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31878CfC {
    public static CropFragment LIZ(boolean z, android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        CropFragment cropFragment = new CropFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg_origin_uri", uri);
        bundle.putBoolean("arg_is_for_live_cover", z);
        cropFragment.setArguments(bundle);
        return cropFragment;
    }
}
