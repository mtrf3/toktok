package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.profile.effect.EffectProfileListFragment;

/* renamed from: X.SoU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73222SoU {
    public static EffectProfileListFragment LIZ(int i, String str, String str2, boolean z) {
        EffectProfileListFragment effectProfileListFragment = new EffectProfileListFragment();
        Bundle LIZJ = AnonymousClass036.LIZJ("user_id", str, "sec_user_id", str2);
        LIZJ.putBoolean("is_me", z);
        LIZJ.putInt("bottom_bar_height", i);
        effectProfileListFragment.setArguments(LIZJ);
        return effectProfileListFragment;
    }
}
