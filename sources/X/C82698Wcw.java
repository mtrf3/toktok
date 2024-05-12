package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.live.Live;
import kotlin.jvm.internal.o;

/* renamed from: X.Wcw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82698Wcw implements LDY {
    @Override // X.LDY
    public final void LIZ(String str, String to) {
        o.LJIIIZ(to, "to");
        if (!C82699Wcx.LIZJ && TextUtils.equals(to, "Following")) {
            C82699Wcx.LIZJ = true;
            Live.getService().LJLLLL(true, 2L, 0L, new C82519Wa3());
        }
    }
}
