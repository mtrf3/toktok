package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionFragment;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.UrM, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C78496UrM implements RTU {
    @Override // X.RTU
    public Object apply(Object obj, Object obj2) {
        return I18nSettingNewVersionFragment.lambda$semisugar$$init$$0((ITpcConsentService) obj, (Activity) obj2);
    }

    public static long LIZ(String str) {
        return new File(str).length();
    }

    public static View LIZIZ(LayoutInflater layoutInflater, String str, LayoutInflater layoutInflater2, int i, ViewGroup viewGroup, boolean z, String str2) {
        o.LJIIIZ(layoutInflater, str);
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater2, i, viewGroup, z);
        o.LJIIIIZZ(LLLLIILL, str2);
        return LLLLIILL;
    }
}
