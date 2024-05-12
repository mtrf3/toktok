package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.sei.SeiAppData;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TlO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75578TlO implements InterfaceC76112Tu0 {
    public final /* synthetic */ C75577TlN LJLIL;

    @Override // X.InterfaceC76112Tu0
    public final void LJJIIZ() {
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJILLIZJL() {
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLJJL(C76696U8e c76696U8e, int i) {
    }

    public C75578TlO(C75577TlN c75577TlN) {
        this.LJLIL = c75577TlN;
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJI(InterfaceC75787Tol layout) {
        o.LJIIIZ(layout, "layout");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJJ(C76696U8e layout) {
        o.LJIIIZ(layout, "layout");
        StringBuilder LIZ = X1D.LIZ();
        String str = C75577TlN.LJZI;
        C12400eC.LIZIZ(LIZ, str, "_onPlayerRangeCalculateFinish", LIZ, "1VNExperienceV1");
        this.LJLIL.LJIIIIZZ();
        C75577TlN c75577TlN = this.LJLIL;
        c75577TlN.getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append("_sendAdjustPlayerEvent");
        C0NB.LIZIZ("1VNExperienceV1", X1D.LIZIZ(LIZ2));
        InterfaceC75580TlQ LJFF = c75577TlN.LJFF();
        if (LJFF != null) {
            LJFF.LJ(layout);
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJ(SeiAppData seiAppData) {
        o.LJIIIZ(seiAppData, "seiAppData");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLLL(LinkUser user) {
        o.LJIIIZ(user, "user");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJIIJ(int i, List windows) {
        o.LJIIIZ(windows, "windows");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJJIZ(InterfaceC75787Tol layout, int i) {
        o.LJIIIZ(layout, "layout");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LLIIJLIL(InterfaceC75179Tex interfaceC75179Tex, EnumC75419Tip enumC75419Tip, EnumC75419Tip enumC75419Tip2, U9O u9o, C75786Tok c75786Tok) {
        C75240Tfw.LIZ(interfaceC75179Tex, enumC75419Tip, enumC75419Tip2, u9o);
    }
}
