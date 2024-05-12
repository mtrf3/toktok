package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.mix.createmix.GuideCreateFragment;

/* renamed from: X.3nf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94713nf {
    public static GuideCreateFragment LIZ(String str, String str2) {
        GuideCreateFragment guideCreateFragment = new GuideCreateFragment();
        Bundle LIZJ = AnonymousClass036.LIZJ("enter_from", str, "enter_method", str2);
        LIZJ.putBoolean("half_create_name", false);
        guideCreateFragment.setArguments(LIZJ);
        return guideCreateFragment;
    }
}
