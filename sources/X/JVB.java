package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JVB implements JV4 {
    public JQX LIZ;
    public JQX LIZIZ;

    @Override // X.JV4
    public final void LIZ(JQX holder) {
        o.LJIIIZ(holder, "holder");
        if (holder instanceof JSH) {
            JLU.LJFF();
        } else {
            holder.LLLLLJLJLL();
        }
    }

    @Override // X.JV4
    public final void LIZIZ(JQX holder) {
        o.LJIIIZ(holder, "holder");
        JQX jqx = this.LIZIZ;
        if (jqx != null && C78926UyI.LJIILIIL(jqx) != C78926UyI.LJIILIIL(holder) && jqx.isPlaying()) {
            LIZ(jqx);
        }
        InterfaceC48907JHj LIZLLL = JLU.LIZLLL();
        if (LIZLLL != null) {
            LIZLLL.LLLLLJLJLL();
        }
        holder.LLLJIL();
        this.LIZIZ = holder;
    }
}
