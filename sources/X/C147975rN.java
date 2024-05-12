package X;

import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5rN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147975rN extends AbstractC163776bl<FTCEditStickerViewModel> implements InterfaceC135635Tz {
    public final C82622Wbi LJLJLJ;
    public final WMH LJLJLLL;
    public final C148005rQ LJLL;
    public final C62822Ol8 LJLLI;

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.AbstractC165596eh, X.AbstractC29891Fh
    public final void onCreate() {
        super.onCreate();
        ((FTCEditStickerViewModel) LJJLIIIJJI()).s60((C146945pi) this.LJLLI.getValue());
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<FTCEditStickerViewModel> LJJLIIIJILLIZJL() {
        return this.LJLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJLJ;
    }

    public C147975rN(C82622Wbi diContainer, WMH parentScene) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJLJ = diContainer;
        this.LJLJLLL = parentScene;
        this.LJLL = C148005rQ.LJLIL;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1006));
        this.LJLLI = LIZIZ;
        C146945pi c146945pi = (C146945pi) LIZIZ.getValue();
        InterfaceC152085y0 interfaceC152085y0 = (InterfaceC152085y0) diContainer.LJ(InterfaceC152085y0.class, null);
        c146945pi.getClass();
        c146945pi.LJLJI = interfaceC152085y0;
        c146945pi.LJLJJI = (AnonymousClass655) diContainer.LJ(AnonymousClass655.class, null);
        c146945pi.LJLLILLLL = (InterfaceC137115Zr) diContainer.LJ(InterfaceC137115Zr.class, null);
        parentScene.add(R.id.cpo, c146945pi, "FTCEditStickerScene");
    }
}
