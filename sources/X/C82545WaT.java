package X;

import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WaT, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82545WaT extends ESP {
    public final InterfaceC83863Wvj LJLILLLLZI;
    public final TEZ LJLJI;
    public final InterfaceC83624Wrs LJLJJI;
    public final InterfaceC65784Pro<Cert> LJLJJL;
    public final InterfaceC65784Pro<Cert> LJLJJLL;

    @Override // X.ESP
    public final void LJIIJJI() {
        this.LJLILLLLZI.LJJIL(this.LJLJJLL.invoke());
        this.LJLJJI.LLLLLLLLLL(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILIIL() {
        Effect effect;
        Effect effect2;
        String str;
        String str2;
        I2C i2c = (I2C) this.LJLJI.LJIIIIZZ().LIZ().getValue();
        Boolean bool = null;
        if (i2c != null) {
            effect = i2c.LJLIL;
            effect2 = i2c.LJLILLLLZI;
        } else {
            effect = null;
            effect2 = null;
        }
        if (V3N.LJIL(effect) == V3N.LJIL(effect2)) {
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            if (effect2 != null) {
                str2 = effect2.getEffectId();
            } else {
                str2 = null;
            }
            if (!o.LJ(str, str2)) {
                return;
            }
        }
        InterfaceC83863Wvj interfaceC83863Wvj = this.LJLILLLLZI;
        List<String> tags = effect2.getTags();
        if (tags.contains("camera_front")) {
            bool = Boolean.TRUE;
        } else if (tags.contains("camera_back")) {
            bool = Boolean.FALSE;
        }
        interfaceC83863Wvj.LJJIIJ(true, bool, this.LJLJJL.invoke());
        this.LJLJJI.LLLLLLLLLL(false);
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        return V3N.LJIL(session.LIZ);
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        if (this.LJLILLLLZI.getCameraState() == 0) {
            this.LJLILLLLZI.LJJJJ(new C82546WaU(this));
        } else {
            LJIILIIL();
        }
    }

    public C82545WaT(InterfaceC83863Wvj cameraController, TEZ stickerDataManager, InterfaceC83624Wrs asCameraView, C46226ICg enableCert, C46225ICf disableCert) {
        o.LJIIIZ(cameraController, "cameraController");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(asCameraView, "asCameraView");
        o.LJIIIZ(enableCert, "enableCert");
        o.LJIIIZ(disableCert, "disableCert");
        this.LJLILLLLZI = cameraController;
        this.LJLJI = stickerDataManager;
        this.LJLJJI = asCameraView;
        this.LJLJJL = enableCert;
        this.LJLJJLL = disableCert;
    }
}
