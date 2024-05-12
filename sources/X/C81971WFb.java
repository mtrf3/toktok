package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.WFb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81971WFb extends AbstractViewOnClickListenerC81978WFi {
    public final /* synthetic */ C81970WFa LJLJJLL;
    public final /* synthetic */ WFU LJLJL;

    @Override // X.AbstractViewOnClickListenerC81978WFi
    public final void LIZ(View v) {
        o.LJIIIZ(v, "v");
        int adapterPosition = this.LJLJJLL.getAdapterPosition();
        if (adapterPosition == -1) {
            return;
        }
        C81975WFf c81975WFf = (C81975WFf) ListProtector.get(this.LJLJL.LJLILLLLZI, adapterPosition);
        InterfaceC81972WFc interfaceC81972WFc = c81975WFf.LJLLI;
        if (c81975WFf.LJLJLJ && interfaceC81972WFc != null) {
            interfaceC81972WFc.LIZJ(c81975WFf);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81971WFb(C81970WFa c81970WFa, WFU wfu) {
        super(0, 3);
        this.LJLJJLL = c81970WFa;
        this.LJLJL = wfu;
    }
}
