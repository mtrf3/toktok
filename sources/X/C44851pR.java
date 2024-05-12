package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.o;

/* renamed from: X.1pR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44851pR implements InterfaceC39071g7 {
    public final InterfaceC274115t LJLIL;
    public final EnumC274215u LJLILLLLZI;
    public final EnumC274315v LJLJI;

    @Override // X.InterfaceC274115t
    public final Object LJIIJJI() {
        return this.LJLIL.LJIIJJI();
    }

    @Override // X.InterfaceC274115t
    public final int LJJJI(int i) {
        return this.LJLIL.LJJJI(i);
    }

    @Override // X.InterfaceC39071g7
    public final AbstractC39201gK LJJJIL(long j) {
        final int LJJLIIIJLLLLLLLZ;
        final int LJJJI;
        if (this.LJLJI == EnumC274315v.Width) {
            if (this.LJLILLLLZI == EnumC274215u.Max) {
                LJJJI = this.LJLIL.LJJLJLI(C23360vs.LJI(j));
            } else {
                LJJJI = this.LJLIL.LJJJI(C23360vs.LJI(j));
            }
            final int LJI = C23360vs.LJI(j);
            return new AbstractC39201gK(LJJJI, LJI) { // from class: X.1pT
                @Override // X.InterfaceC273715p
                public final int LJJJJ(AbstractC272415c alignmentLine) {
                    o.LJIIIZ(alignmentLine, "alignmentLine");
                    return LiveLayoutPreloadThreadPriority.DEFAULT;
                }

                @Override // X.AbstractC39201gK
                public final void LJL(long j2, float f, InterfaceC88472Yns<? super InterfaceC32701Qc, C76800UCe> interfaceC88472Yns) {
                }

                {
                    LJLIIIL(C78996UzQ.LIZIZ(LJJJI, LJI));
                }
            };
        }
        if (this.LJLILLLLZI == EnumC274215u.Max) {
            LJJLIIIJLLLLLLLZ = this.LJLIL.LJJLIIIJILLIZJL(C23360vs.LJII(j));
        } else {
            LJJLIIIJLLLLLLLZ = this.LJLIL.LJJLIIIJLLLLLLLZ(C23360vs.LJII(j));
        }
        final int LJII = C23360vs.LJII(j);
        return new AbstractC39201gK(LJII, LJJLIIIJLLLLLLLZ) { // from class: X.1pT
            @Override // X.InterfaceC273715p
            public final int LJJJJ(AbstractC272415c alignmentLine) {
                o.LJIIIZ(alignmentLine, "alignmentLine");
                return LiveLayoutPreloadThreadPriority.DEFAULT;
            }

            @Override // X.AbstractC39201gK
            public final void LJL(long j2, float f, InterfaceC88472Yns<? super InterfaceC32701Qc, C76800UCe> interfaceC88472Yns) {
            }

            {
                LJLIIIL(C78996UzQ.LIZIZ(LJII, LJJLIIIJLLLLLLLZ));
            }
        };
    }

    @Override // X.InterfaceC274115t
    public final int LJJLIIIJILLIZJL(int i) {
        return this.LJLIL.LJJLIIIJILLIZJL(i);
    }

    @Override // X.InterfaceC274115t
    public final int LJJLIIIJLLLLLLLZ(int i) {
        return this.LJLIL.LJJLIIIJLLLLLLLZ(i);
    }

    @Override // X.InterfaceC274115t
    public final int LJJLJLI(int i) {
        return this.LJLIL.LJJLJLI(i);
    }

    public C44851pR(InterfaceC274115t measurable, EnumC274215u minMax, EnumC274315v widthHeight) {
        o.LJIIIZ(measurable, "measurable");
        o.LJIIIZ(minMax, "minMax");
        o.LJIIIZ(widthHeight, "widthHeight");
        this.LJLIL = measurable;
        this.LJLILLLLZI = minMax;
        this.LJLJI = widthHeight;
    }
}
