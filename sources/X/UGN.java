package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.browser.emote.CropEmoteFragment;

/* loaded from: classes14.dex */
public final class UGN {
    public static CropEmoteFragment LIZ(String str) {
        CropEmoteFragment cropEmoteFragment = new CropEmoteFragment();
        Bundle bundle = new Bundle();
        bundle.putString("arg_origin_data", str);
        cropEmoteFragment.setArguments(bundle);
        return cropEmoteFragment;
    }
}
