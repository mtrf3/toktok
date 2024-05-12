package X;

import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.5pV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146815pV extends AbstractC46064I6a {
    public final WMH LLIL;
    public final int LLILII;
    public final InterfaceC146755pP LLILIL;
    public final C5H3 LLILL;
    public final C5H3 LLILLIZIL;
    public final C5H3 LLILLJJLI;
    public final C5H3 LLILLL;
    public final LiveEvent<C76800UCe> LLILZ;
    public final LiveEvent<Boolean> LLILZIL;

    @Override // X.I6G
    public void AS() {
    }

    @Override // X.InterfaceC146755pP
    public void Mr0(boolean z) {
    }

    @Override // X.InterfaceC146755pP
    public void TY() {
    }

    @Override // X.InterfaceC146755pP
    public void dp() {
    }

    @Override // X.I6G
    public void kx() {
    }

    @Override // X.I6G
    public void switchMode(boolean z) {
    }

    private final InterfaceC146715pL LLLJL() {
        return (InterfaceC146715pL) this.LLILLL.getValue();
    }

    private final InterfaceC145415nF LLLL() {
        return (InterfaceC145415nF) this.LLILLJJLI.getValue();
    }

    private final InterfaceC146785pS LLLLJ() {
        return (InterfaceC146785pS) this.LLILL.getValue();
    }

    private final InterfaceC146805pU LLLLJI() {
        return (InterfaceC146805pU) this.LLILLIZIL.getValue();
    }

    @Override // X.AbstractC46064I6a
    public void LLJJ() {
        C78688UuS.LJIIJJI(this, new AqS173S0100000_7(this, 363));
        C44384HbQ.LJIIIIZZ(this, C146825pW.LJLIL);
    }

    @Override // X.AbstractC46064I6a
    public void LJJJJLI() {
        InterfaceC146715pL LLLJL = LLLJL();
        if (LLLJL != null) {
            LLLJL.LJJJJLI();
        }
    }

    @Override // X.AbstractC46064I6a
    public void LLIL() {
        LLLLJ().LLIL();
    }

    @Override // X.AbstractC46064I6a
    public void LLZIL() {
        LLLLJI().LLZIL();
    }

    @Override // X.AbstractC46064I6a
    public boolean LLZZ() {
        return LLLLJI().LLZZ();
    }

    @Override // X.AbstractC46064I6a
    public void Q9() {
        LLLLJ().Q9();
    }

    @Override // X.InterfaceC146755pP
    public LiveEvent<Boolean> KC() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC146755pP
    public LiveEvent<C76800UCe> L90() {
        return this.LLILZ;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C0I6 getApiComponent() {
        return this.LLILIL;
    }

    @Override // X.AbstractC46064I6a
    public void LLLFFI(int i) {
        LLLL().LJJLIIIJ(i);
    }

    @Override // X.AbstractC46064I6a
    public void LLLI(int i) {
        LLLLJ().LJJLIIIJ(i);
    }

    @Override // X.AbstractC46064I6a
    public void LLLLIIIILLL(OSZ<Integer, Integer> value) {
        o.LJIIIZ(value, "value");
        LLLLJI().LLLLIIIILLL(value);
    }

    @Override // X.AbstractC46064I6a
    public void U70(boolean z) {
        float f;
        InterfaceC143655kP LJLJJLL = LJLJJLL();
        if (z) {
            f = LJLIIL().musicVolume;
        } else {
            f = 0.0f;
        }
        VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f);
        o.LJIIIIZZ(ofMusic, "ofMusic(if (enable) editModel.musicVolume else 0f)");
        LJLJJLL.Dl0(ofMusic);
    }

    @Override // X.AbstractC46064I6a
    public void WW(boolean z) {
        LLLLJI().WW(z);
    }

    @Override // X.I6G
    public void aA(boolean z) {
        this.LJLJLLL = z;
    }

    @Override // X.AbstractC46064I6a
    public void l0(int i) {
        LLLLJ().l0(i);
    }

    @Override // X.AbstractC46064I6a
    public void LLZILL(int i, boolean z) {
        LLLLJI().LLZILL(i, z);
    }

    @Override // X.InterfaceC146755pP
    public void V7(AVMusic aVMusic, InterfaceC65784Pro<C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        callback.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C146815pV(C82622Wbi parentOC, WMH parentScene, int i) {
        super(parentOC, parentScene, i);
        o.LJIIIZ(parentOC, "parentOC");
        o.LJIIIZ(parentScene, "parentScene");
        this.LLIL = parentScene;
        this.LLILII = i;
        this.LLILIL = this;
        this.LLILL = C269113v.LIZ(this, InterfaceC146785pS.class);
        this.LLILLIZIL = C269113v.LIZ(this, InterfaceC146805pU.class);
        this.LLILLJJLI = C269113v.LIZ(this, InterfaceC145415nF.class);
        this.LLILLL = C269113v.LIZIZ(this, InterfaceC146715pL.class);
        this.LLILZ = new LiveEvent<>();
        this.LLILZIL = new LiveEvent<>();
    }
}
