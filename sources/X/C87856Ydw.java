package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Ydw, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class C87856Ydw extends AbstractC78149Ull {
    public final AqS179S0100000_13 LJIILIIL;
    public final C09800a0 LJIILJJIL;
    public boolean LJIILL;

    @Override // X.AbstractC78149Ull
    public final void LIZJ() {
        LIZ(EnumC78138Ula.NOT_LOG);
    }

    @Override // X.AbstractC78149Ull
    public final void LIZLLL() {
        EnumC78147Ulj stage = EnumC78147Ulj.QUESTION;
        o.LJIIIZ(stage, "stage");
        this.LJIIJJI = stage;
        LJIIIIZZ();
        if (this.LJIIL) {
            this.LIZJ.invoke();
        }
        this.LJIIIZ.LIZ(this.LJFF);
        this.LJIIIZ.LIZLLL();
    }

    @Override // X.AbstractC78149Ull
    public final void LJ() {
        LIZ(EnumC78138Ula.CANCEL);
    }

    public final void LJIIIIZZ() {
        if (this.LJIILJJIL.LIZIZ()) {
            LJI(true);
        } else {
            LJFF();
        }
    }

    public boolean LJIIIZ() {
        if (!this.LJIILJJIL.LIZIZ() || this.LJIILL) {
            return false;
        }
        this.LJIILL = true;
        this.LJIIL = true;
        EnumC78147Ulj stage = EnumC78147Ulj.QUESTION;
        o.LJIIIZ(stage, "stage");
        this.LJIIJJI = stage;
        LJIIIIZZ();
        if (this.LJIIL) {
            this.LIZJ.invoke();
        }
        this.LJIIIZ.LIZ(this.LJFF);
        this.LJIIIZ.LIZLLL();
        return true;
    }

    public C09800a0 LJIIJ() {
        C09800a0 c09800a0 = new C09800a0(this.LIZ, this.LJIILIIL);
        c09800a0.LIZ(new C87859Ydz());
        c09800a0.LIZ(new C87852Yds());
        c09800a0.LIZ(new C87851Ydr());
        c09800a0.LIZ(new C87860Ye0());
        c09800a0.LIZ(new C87841Ydh());
        c09800a0.LIZ(new C87840Ydg());
        c09800a0.LIZ(new C87858Ydy());
        c09800a0.LIZ(new C87862Ye2());
        c09800a0.LIZ(new C87846Ydm());
        c09800a0.LIZ(new C87843Ydj());
        c09800a0.LIZ(new C87853Ydt());
        return c09800a0;
    }

    public C87856Ydw(DataChannel dataChannel, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC88472Yns<? super EnumC78138Ula, C76800UCe> interfaceC88472Yns2) {
        super(dataChannel, interfaceC88472Yns, interfaceC65784Pro, interfaceC65784Pro2, interfaceC88472Yns2);
        this.LJIILIIL = new AqS179S0100000_13(this, 429);
        C09800a0 LJIIJ = LJIIJ();
        this.LJIILJJIL = LJIIJ;
        LJIIJ.LIZLLL();
    }
}
