package X;

import android.app.Activity;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UbY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC77516UbY implements Runnable {
    public final /* synthetic */ Activity LJLIL;
    public final /* synthetic */ Diamond LJLILLLLZI;
    public final /* synthetic */ InterfaceC77737Uf7 LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ Boolean LJLJJLL;
    public final /* synthetic */ CustomErrorExtra LJLJL;
    public final /* synthetic */ C68322mC<InterfaceC88472Yns<Throwable, Boolean>> LJLJLJ;
    public final /* synthetic */ List<String> LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ String LJLLI;

    public RunnableC77516UbY(Activity activity, Diamond diamond, InterfaceC77737Uf7 interfaceC77737Uf7, int i, int i2, Boolean bool, CustomErrorExtra customErrorExtra, C68322mC<InterfaceC88472Yns<Throwable, Boolean>> c68322mC, List<String> list, String str, String str2) {
        this.LJLIL = activity;
        this.LJLILLLLZI = diamond;
        this.LJLJI = interfaceC77737Uf7;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        this.LJLJJLL = bool;
        this.LJLJL = customErrorExtra;
        this.LJLJLJ = c68322mC;
        this.LJLJLLL = list;
        this.LJLL = str;
        this.LJLLI = str2;
    }

    public final void LIZ() {
        String penaltyWarningSkip;
        Activity activity = this.LJLIL;
        Diamond diamond = this.LJLILLLLZI;
        InterfaceC77737Uf7 interfaceC77737Uf7 = this.LJLJI;
        int i = this.LJLJJI;
        int i2 = this.LJLJJL;
        Boolean bool = this.LJLJJLL;
        CustomErrorExtra customErrorExtra = this.LJLJL;
        String str = "";
        if (customErrorExtra == null) {
            penaltyWarningSkip = "";
        } else {
            penaltyWarningSkip = customErrorExtra.getPenaltyWarningSkip();
        }
        o.LJIIIIZZ(penaltyWarningSkip, "if (customError == null)…mError.penaltyWarningSkip");
        InterfaceC88472Yns<Throwable, Boolean> interfaceC88472Yns = this.LJLJLJ.element;
        if (interfaceC88472Yns != null) {
            InterfaceC88472Yns<Throwable, Boolean> interfaceC88472Yns2 = interfaceC88472Yns;
            List<String> list = this.LJLJLLL;
            String str2 = this.LJLL;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = this.LJLLI;
            if (str3 != null) {
                str = str3;
            }
            C77731Uf1.LJIIIIZZ(activity, diamond, interfaceC77737Uf7, "", i, i2, 0, 0, bool, true, penaltyWarningSkip, null, interfaceC88472Yns2, list, str2, str);
            return;
        }
        o.LJIJI("createFailBlock");
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
