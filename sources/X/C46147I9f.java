package X;

import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import kotlin.jvm.internal.o;

/* renamed from: X.I9f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46147I9f implements IA6 {
    public final InterfaceC88472Yns<Boolean, Long> LIZ;

    public C46147I9f(int i) {
        C57352Mx shootMode = C57352Mx.LJLIL;
        o.LJIIIZ(shootMode, "shootMode");
        this.LIZ = shootMode;
    }

    @Override // X.IA6
    public final long LIZ(CameraComponentModel context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.invoke(Boolean.valueOf(context.mCurrentDurationMode)).longValue() - context.mTotalRecordingTime;
    }
}
