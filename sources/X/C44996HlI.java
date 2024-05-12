package X;

import com.ss.android.ugc.bytebench.EditorDowngradeOptiStrategy;
import defpackage.e1;

/* renamed from: X.HlI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44996HlI implements InterfaceC44997HlJ {
    public static final /* synthetic */ C44996HlI LJIILL = new C44996HlI();
    public final /* synthetic */ InterfaceC44997HlJ LJIILJJIL;

    @Override // X.InterfaceC44997HlJ
    public final boolean isDowngrade() {
        return this.LJIILJJIL.isDowngrade();
    }

    public C44996HlI() {
        InterfaceC44997HlJ interfaceC44997HlJ;
        if (e1.LIZ(31744, "studio_editor_sticker_panel_show_opti", true, false)) {
            H7B.LIZ("[DowngradeOptiApi] ByteBenchDowngrade enable");
            C09580Ze LIZJ = C09580Ze.LIZJ();
            C60903NvH.LJIIJJI().getApplicationService().getClass();
            InterfaceC09240Xw LIZIZ = LIZJ.LIZIZ(EF7.LJIIIZ);
            interfaceC44997HlJ = (LIZIZ == null || (interfaceC44997HlJ = (InterfaceC44997HlJ) LIZIZ.LJIILJJIL(EditorDowngradeOptiStrategy.class)) == null) ? C44998HlK.LJIILJJIL : interfaceC44997HlJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[DowngradeOptiApi] Downgrade: ");
            LIZ.append(interfaceC44997HlJ.isDowngrade());
            H7B.LIZ(X1D.LIZIZ(LIZ));
        } else {
            H7B.LIZ("[DowngradeOptiApi] use DefaultApi");
            interfaceC44997HlJ = C44998HlK.LJIILJJIL;
        }
        this.LJIILJJIL = interfaceC44997HlJ;
    }
}
