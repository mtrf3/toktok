package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import kotlin.jvm.internal.o;

/* renamed from: X.Tk2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75494Tk2 implements UC4 {
    public final /* synthetic */ EnumC74991Tbv LIZ;
    public final /* synthetic */ C74983Tbn LIZIZ;
    public final /* synthetic */ C68322mC<InterfaceC75441TjB> LIZJ;
    public final /* synthetic */ InterfaceC75414Tik<CreateChannelResult> LIZLLL;
    public final /* synthetic */ EnumC74990Tbu LJ;

    @Override // X.UC4
    public final void LIZ(DslLayout dslLayout) {
        String businessType;
        int i;
        String str;
        Layout layout;
        o.LJIIIZ(dslLayout, "dslLayout");
        EnumC74991Tbv enumC74991Tbv = this.LIZ;
        if (enumC74991Tbv != null && (businessType = enumC74991Tbv.getBusinessType()) != null) {
            C74983Tbn c74983Tbn = this.LIZIZ;
            EnumC74991Tbv enumC74991Tbv2 = this.LIZ;
            C68322mC<InterfaceC75441TjB> c68322mC = this.LIZJ;
            InterfaceC75414Tik<CreateChannelResult> interfaceC75414Tik = this.LIZLLL;
            EnumC74990Tbu enumC74990Tbu = this.LJ;
            c74983Tbn.getClass();
            java.util.Map<String, Layout> data = dslLayout.getData();
            if (data != null && (layout = data.get(businessType)) != null) {
                i = layout.getMicCount();
            } else {
                i = 0;
            }
            if (i == 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("getLayoutMaxMicCount dslLayout = ");
                LIZ.append(dslLayout);
                LIZ.append(" can't find layoutName = ");
                LIZ.append(businessType);
                C0NB.LJIIIZ("OneVn_MultiGuestV3Manager", X1D.LIZIZ(LIZ));
                Integer num = InterfaceC30442Bx8.a0.LIZJ().get(Integer.valueOf(dslLayout.getScene()));
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 5;
                }
            }
            StringBuilder LJ = AnonymousClass028.LJ("getLayoutMaxMicCount layoutName = ", businessType, " count = ", i, " mDslLayout.scene = ");
            LJ.append(Integer.valueOf(dslLayout.getScene()));
            C0NB.LIZIZ("OneVn_MultiGuestV3Manager", X1D.LIZIZ(LJ));
            java.util.Map<String, Layout> data2 = dslLayout.getData();
            String str2 = null;
            if (enumC74991Tbv2 != null) {
                str = enumC74991Tbv2.getBusinessType();
            } else {
                str = null;
            }
            Layout layout2 = data2.get(str);
            if (layout2 != null) {
                str2 = layout2.getLayoutId();
            }
            c74983Tbn.LIZIZ(i, str2, c68322mC.element, interfaceC75414Tik, enumC74990Tbu);
        }
    }

    public C75494Tk2(EnumC74991Tbv enumC74991Tbv, C74983Tbn c74983Tbn, C68322mC c68322mC, C75020TcO c75020TcO, EnumC74990Tbu enumC74990Tbu) {
        this.LIZ = enumC74991Tbv;
        this.LIZIZ = c74983Tbn;
        this.LIZJ = c68322mC;
        this.LIZLLL = c75020TcO;
        this.LJ = enumC74990Tbu;
    }
}
