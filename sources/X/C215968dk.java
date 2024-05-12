package X;

import android.content.Context;
import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8dk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215968dk extends AbstractC65781Prl implements InterfaceC88471Ynr<DanmakuPresentAssem, C43I<? extends C215958dj>, C76800UCe> {
    public static final C215968dk LJLIL = new C215968dk();

    public C215968dk() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(DanmakuPresentAssem danmakuPresentAssem, C43I<? extends C215958dj> c43i) {
        C215958dj c215958dj;
        Integer num;
        DanmakuPresentAssem selectSubscribe = danmakuPresentAssem;
        C43I<? extends C215958dj> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (c215958dj = (C215958dj) c43i2.LIZ) != null) {
            c215958dj.LJIJ = Float.valueOf(C32151Nz.LJIIZILJ(Double.valueOf(0.5d)));
            Context context = selectSubscribe.getContext();
            if (context != null) {
                num = C79045V0n.LJI(R.attr.dg, context);
            } else {
                num = null;
            }
            c215958dj.LJIIZILJ = num;
            selectSubscribe.q4(c215958dj);
        }
        return C76800UCe.LIZ;
    }
}
