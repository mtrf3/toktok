package X;

import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Ull, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC78149Ull {
    public final DataChannel LIZ;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LIZIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;
    public final InterfaceC88472Yns<EnumC78138Ula, C76800UCe> LJ;
    public final long LJFF = 10;
    public final long LJI = 1;
    public long LJII = -1;
    public final C78150Ulm LJIIIIZZ = new C78150Ulm(new AqS163S0100000_13(this, 389), 1);
    public final C78150Ulm LJIIIZ = new C78150Ulm(new AqS163S0100000_13(this, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT), 10);
    public final C78150Ulm LJIIJ = new C78150Ulm(new AqS163S0100000_13(this, 388), 1);
    public EnumC78147Ulj LJIIJJI = EnumC78147Ulj.HOLD;
    public boolean LJIIL;

    public abstract void LIZJ();

    public abstract void LIZLLL();

    public abstract void LJ();

    public final void LJII() {
        this.LJIIL = true;
        int i = C78148Ulk.LIZ[this.LJIIJJI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    LIZIZ(EnumC78138Ula.NOT_LOG);
                    return;
                }
                this.LJIIIZ.LIZJ();
                this.LJIIJ.LIZLLL();
                LJI(false);
                if (!this.LJIIL) {
                    return;
                }
                this.LIZLLL.invoke();
                return;
            }
            this.LJIIIZ.LIZLLL();
            LJI(false);
            if (!this.LJIIL) {
                return;
            }
            this.LIZJ.invoke();
            return;
        }
        LIZIZ(EnumC78138Ula.NOT_LOG);
        if (this.LJII < 0) {
            return;
        }
        this.LJIIIIZZ.LIZLLL();
    }

    public final void LJFF() {
        LIZIZ(EnumC78138Ula.NOT_LOG);
        this.LJIIL = false;
        int i = C78148Ulk.LIZ[this.LJIIJJI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.LJIIJ.LIZIZ();
                return;
            }
            this.LJIIIZ.LIZIZ();
            return;
        }
        this.LJIIIIZZ.LIZIZ();
    }

    public final void LIZ(EnumC78138Ula method) {
        o.LJIIIZ(method, "method");
        EnumC78147Ulj enumC78147Ulj = this.LJIIJJI;
        EnumC78147Ulj stage = EnumC78147Ulj.DISMISSED;
        if (enumC78147Ulj == stage) {
            return;
        }
        o.LJIIIZ(stage, "stage");
        this.LJIIJJI = stage;
        LIZIZ(method);
        this.LJIIIIZZ.LIZJ();
        this.LJIIIZ.LIZJ();
        this.LJIIJ.LIZJ();
    }

    public final void LIZIZ(EnumC78138Ula method) {
        o.LJIIIZ(method, "method");
        if (this.LJIIL) {
            this.LJ.invoke(method);
        }
    }

    public final void LJI(boolean z) {
        if (this.LJIIL) {
            this.LIZIZ.invoke(Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC78149Ull(DataChannel dataChannel, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC88472Yns<? super EnumC78138Ula, C76800UCe> interfaceC88472Yns2) {
        this.LIZ = dataChannel;
        this.LIZIZ = interfaceC88472Yns;
        this.LIZJ = interfaceC65784Pro;
        this.LIZLLL = interfaceC65784Pro2;
        this.LJ = interfaceC88472Yns2;
    }
}
