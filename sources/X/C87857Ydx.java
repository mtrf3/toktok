package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Ydx, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87857Ydx extends C87856Ydw {
    public boolean LJIILLIIL;

    @Override // X.C87856Ydw
    public final boolean LJIIIZ() {
        if (!this.LJIILJJIL.LIZIZ()) {
            return false;
        }
        if (!this.LJIILLIIL) {
            this.LJIILLIIL = true;
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
        if (this.LJIIJJI == EnumC78147Ulj.DISMISSED) {
            return false;
        }
        return true;
    }

    @Override // X.C87856Ydw
    public final C09800a0 LJIIJ() {
        C09800a0 c09800a0 = new C09800a0(this.LIZ, this.LJIILIIL);
        c09800a0.LIZ(new C87859Ydz());
        c09800a0.LIZ(new C87852Yds());
        c09800a0.LIZ(new C87860Ye0());
        c09800a0.LIZ(new C87841Ydh());
        c09800a0.LIZ(new C87840Ydg());
        c09800a0.LIZ(new C87861Ye1());
        c09800a0.LIZ(new C87853Ydt());
        c09800a0.LIZ(new C87847Ydn());
        c09800a0.LIZ(new C87845Ydl());
        return c09800a0;
    }

    public C87857Ydx(DataChannel dataChannel, AqS179S0100000_13 aqS179S0100000_13, AqS163S0100000_13 aqS163S0100000_13, AqS163S0100000_13 aqS163S0100000_132, AqS179S0100000_13 aqS179S0100000_132) {
        super(dataChannel, aqS179S0100000_13, aqS163S0100000_13, aqS163S0100000_132, aqS179S0100000_132);
    }
}
