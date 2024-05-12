package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U68 implements InterfaceC76768UAy<PermitResult> {
    public final /* synthetic */ U65 LJLIL;
    public final /* synthetic */ C68322mC<LayoutDSLConfig> LJLILLLLZI;
    public final /* synthetic */ C75993Ts5 LJLJI;
    public final /* synthetic */ InterfaceC75414Tik<PermitResult> LJLJJI;

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(PermitResult value) {
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("permitApply success value=");
        LIZ.append(value);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        if (this.LJLIL.LJLJJL.LLZILL()) {
            LayoutDSLConfig layoutDSLConfig = this.LJLILLLLZI.element;
            if (layoutDSLConfig != null) {
                C75993Ts5 c75993Ts5 = this.LJLJI;
                U65 u65 = this.LJLIL;
                if (c75993Ts5.LJ == 1) {
                    U6E LJJI = u65.LJFF().LJJI();
                    long j = c75993Ts5.LIZIZ;
                    String linkMicId = c75993Ts5.LIZLLL;
                    LJJI.getClass();
                    o.LJIIIZ(linkMicId, "linkMicId");
                    LJJI.LIZIZ.LJIILJJIL(new C76701U8j(EnumC75419Tip.StateJoined, Long.valueOf(j), linkMicId, null, null, null, 248), null);
                    LJJI.LIZ("onReplyApplySucceed", layoutDSLConfig);
                }
            }
        } else {
            LayoutDSLConfig layoutDSLConfig2 = this.LJLILLLLZI.element;
            if (layoutDSLConfig2 != null) {
                C75993Ts5 c75993Ts52 = this.LJLJI;
                U65 u652 = this.LJLIL;
                if (c75993Ts52.LJ == 1) {
                    u652.LJFF().LJJI().LJ.invoke(layoutDSLConfig2);
                    InterfaceC75973Trl LLIIJI = u652.LLIIJI();
                    LinkUser.Builder builder = new LinkUser.Builder();
                    builder.setUserId(Long.valueOf(c75993Ts52.LIZIZ));
                    builder.setLinkMicId(c75993Ts52.LIZLLL);
                    LLIIJI.LJJJJLI(builder.build());
                }
            }
        }
        if (this.LJLJI.LJ == 1) {
            InterfaceC75973Trl LLIIJI2 = this.LJLIL.LLIIJI();
            C75993Ts5 c75993Ts53 = this.LJLJI;
            LinkUser.Builder builder2 = new LinkUser.Builder();
            builder2.setUserId(Long.valueOf(c75993Ts53.LIZIZ));
            builder2.setLinkMicId(c75993Ts53.LIZLLL);
            LLIIJI2.LJJJJ(builder2.build());
        }
        InterfaceC75414Tik<PermitResult> interfaceC75414Tik = this.LJLJJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        String LJIIIIZZ = U65.LJIIIIZZ(1142);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("permitApply fail error=");
        LIZ.append(error);
        LIZ.append(" throwable=");
        LIZ.append(th);
        C32014ChO.LIZJ(LJIIIIZZ, X1D.LIZIZ(LIZ), null);
        InterfaceC75414Tik<PermitResult> interfaceC75414Tik = this.LJLJJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }

    public U68(U65 u65, C68322mC<LayoutDSLConfig> c68322mC, C75993Ts5 c75993Ts5, InterfaceC75414Tik<PermitResult> interfaceC75414Tik) {
        this.LJLIL = u65;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = c75993Ts5;
        this.LJLJJI = interfaceC75414Tik;
    }
}
