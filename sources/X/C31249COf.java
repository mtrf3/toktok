package X;

import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.COf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31249COf<T> implements InterfaceC31253COj {
    public static final C31249COf<T> LIZ = new C31249COf<>();

    @Override // X.InterfaceC31253COj
    public final Object LIZ(android.net.Uri uri, String key, String str) {
        int LIZ2;
        int LJIIL;
        o.LJIIIZ(uri, "<anonymous parameter 0>");
        o.LJIIIZ(key, "key");
        if (ujb.o.LJJJJ(str, "rpx", false)) {
            LIZ2 = (int) ((CastFloatProtector.parseFloat(s.LJJZZIII("rpx", str)) / 750) * C15380j0.LJIIL());
        } else if (ujb.o.LJJJJ(str, "%", false)) {
            float parseFloat = CastFloatProtector.parseFloat(s.LJJZZIII("%", str)) / 100.0f;
            if (s.LJJJLZIJ(key, "width", false)) {
                LJIIL = C15380j0.LJIIL();
            } else if (s.LJJJLZIJ(key, "height", false)) {
                LJIIL = C15380j0.LJIIIZ(((IHostAction) CN1.LIZ(IHostAction.class)).getTopActivity());
            } else {
                LJIIL = C15380j0.LJIIL();
            }
            LIZ2 = (int) (LJIIL * parseFloat);
        } else {
            LIZ2 = C15380j0.LIZ(CastFloatProtector.parseFloat(str));
        }
        return Integer.valueOf(LIZ2);
    }
}
