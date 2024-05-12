package X;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JPo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC49120JPo {
    public final JTI LJLIL;
    public JQA LJLILLLLZI = new JQA();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 643));

    public final Context LJIIIIZZ() {
        Context context = this.LJLIL.itemView.getContext();
        o.LJIIIIZZ(context, "viewHolder.itemView.context");
        return context;
    }

    public AbstractC49120JPo(JTI jti) {
        this.LJLIL = jti;
    }

    public final void LJII(List<? extends Object> list, AbstractC029409q<?> adapter) {
        o.LJIIIZ(list, "list");
        o.LJIIIZ(adapter, "adapter");
        this.LJLIL.LJLILLLLZI.LJLI(0);
        this.LJLIL.L(adapter);
    }
}
