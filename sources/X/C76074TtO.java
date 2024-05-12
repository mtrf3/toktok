package X;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TtO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76074TtO extends AbstractC76221Tvl<C76067TtH> {
    public C76074TtO(View view) {
        super(view);
    }

    @Override // X.AbstractC76213Tvd
    public final void L(int i, Object obj) {
        C76069TtJ data = (C76069TtJ) obj;
        o.LJIIIZ(data, "data");
        C76070TtK.LJJ(this, data);
    }

    @Override // X.AbstractC76213Tvd
    public final void M(int i, Object obj, List payloads) {
        C76069TtJ data = (C76069TtJ) obj;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(payloads, "payloads");
        C76070TtK.LJJI(this, data, i, payloads);
    }
}
