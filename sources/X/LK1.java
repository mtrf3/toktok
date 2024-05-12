package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.discover.IDiscoveryAsyncInflateService;
import com.ss.android.ugc.aweme.discover.impl.DiscoveryAsyncInflateImpl;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LK1 implements View.OnClickListener {
    public final Context LJLIL;
    public final ActivityC45651qj LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public LK1(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        o.LJI(LJJIFFI);
        this.LJLILLLLZI = LJJIFFI;
        this.LJLJI = C221108m2.LIZIZ(LH2.INSTANCE);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        InterfaceC27853AwT interfaceC27853AwT;
        IDiscoveryAsyncInflateService iDiscoveryAsyncInflateService;
        TabChangeManager LIZ = C116694i1.LIZ(this.LJLILLLLZI);
        ScrollSwitchStateManager LIZ2 = C84193Sd.LIZ(this.LJLILLLLZI);
        AVExternalServiceImpl.LIZ().enterFromService().setEnterFrom("DISCOVER");
        C54362LVe.LJIJJ(false);
        C46538IOg.LIZ = false;
        C56662Kg.LIZ().LIZLLL = false;
        C56662Kg.LIZ().LJIIIZ = false;
        C44938HkM.LJ = null;
        LIZ.getClass();
        MainPageFragmentImpl.LJI().LJJLIIIJJI();
        if (C53320KwG.LIZIZ() && o.LJ(LIZ.nv0(), "HOME") && LKR.LIZIZ(this.LJLILLLLZI, "page_profile")) {
            z = true;
        } else {
            z = false;
        }
        String nv0 = LIZ.nv0();
        if (o.LJ(nv0, "HOME")) {
            if (LKR.LIZIZ(this.LJLILLLLZI, "page_profile")) {
                MainPageFragmentImpl.LJI().LJJLIIIJJI();
            }
        } else if (o.LJ(nv0, "NOTIFICATION")) {
            InterfaceC36571c5 mv0 = LIZ.mv0();
            if (mv0 instanceof AX8) {
                AX8 ax8 = (AX8) mv0;
                if (!ax8.L3()) {
                    ax8.getPageName();
                    ax8.getEnterMethod();
                    if ((mv0 instanceof InterfaceC27853AwT) && (interfaceC27853AwT = (InterfaceC27853AwT) mv0) != null) {
                        interfaceC27853AwT.getPageName();
                    }
                }
            }
        }
        if (!o.LJ("DISCOVER", LIZ.nv0())) {
            if (z) {
                Bundle bundle = new Bundle();
                bundle.putString("fromStart", "MainPage");
                bundle.putString("hox_skip_node", "RootNode");
                com.bytedance.hox.Hox.LJLLI.LIZ(this.LJLILLLLZI).Cv0(bundle, "DISCOVER");
                ((Handler) this.LJLJI.getValue()).post(new RunnableC53983LGp(this));
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putString("fromStart", "MainPage");
                try {
                    com.bytedance.hox.Hox.LJLLI.LIZ(this.LJLILLLLZI).Cv0(bundle2, "DISCOVER");
                } catch (Throwable th) {
                    String message = th.getMessage();
                    if (message == null) {
                        message = "message empty";
                    }
                    EPJ.LIZ = message;
                    Npth.addAttachUserData(new EPJ(), CrashType.JAVA);
                    throw new IllegalStateException("switch node fail!");
                }
            }
            IWF.LJJLIIIIJ().LJIILJJIL();
            C56692Kj.LIZ().LIZIZ();
            O5Y.LJJIZ(this.LJLILLLLZI);
            LIZ2.tv0(false);
            MainPageFragmentImpl.LJI().t9(true);
            MainPageFragmentImpl.LJI().LIZIZ(this.LJLILLLLZI);
            FRW.LIZLLL("discovery_trigger_net");
            FRW.LIZLLL("discovery_cost_time");
            C54502LaE.LIZ("discover_page");
            Object LIZ3 = C58096Mr6.LIZ(IDiscoveryAsyncInflateService.class, false);
            if (LIZ3 != null) {
                iDiscoveryAsyncInflateService = (IDiscoveryAsyncInflateService) LIZ3;
            } else {
                if (C58096Mr6.v == null) {
                    synchronized (IDiscoveryAsyncInflateService.class) {
                        if (C58096Mr6.v == null) {
                            C58096Mr6.v = new DiscoveryAsyncInflateImpl();
                        }
                    }
                }
                iDiscoveryAsyncInflateService = C58096Mr6.v;
            }
            iDiscoveryAsyncInflateService.LIZ(this.LJLIL);
            if (LIZ.mv0() != null) {
                C38987FRv.LJI(LSC.DISCOVER);
            } else {
                AV1.LJIIJJI();
            }
        }
        C10K.LIZIZ(CallableC53984LGq.LJLIL, FMX.LIZIZ(), null);
        C2U8.LIZ(new C46141I8z());
    }
}
