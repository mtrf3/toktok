package X;

import android.content.Intent;
import android.text.TextUtils;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.F5v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38415F5v implements F61 {
    @Override // X.F61
    public final boolean LIZ(Intent intent) {
        o.LJIIIZ(intent, "intent");
        if (intent.getData() == null) {
            return false;
        }
        if (!s.LJJJLZIJ(String.valueOf(intent.getData()), "com.zhiliaoapp.musically", false) && !s.LJJJLZIJ(String.valueOf(intent.getData()), "com.ss.android.ugc.trill", false)) {
            return false;
        }
        return true;
    }

    @Override // X.F61
    public final boolean LIZIZ(Intent intent) {
        o.LJIIIZ(intent, "intent");
        return TextUtils.equals(intent.getAction(), "android.settings.APPLICATION_DETAILS_SETTINGS");
    }
}
