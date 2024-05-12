package X;

import android.app.Activity;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdk.wallet.Diamond;
import kotlin.jvm.internal.o;

/* renamed from: X.UbZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC77517UbZ implements Runnable {
    public final /* synthetic */ Activity LJLIL;
    public final /* synthetic */ Diamond LJLILLLLZI;
    public final /* synthetic */ InterfaceC77737Uf7 LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ int LJLJLJ;
    public final /* synthetic */ CustomErrorExtra LJLJLLL;

    public RunnableC77517UbZ(Activity activity, Diamond diamond, InterfaceC77737Uf7 interfaceC77737Uf7, String str, int i, int i2, int i3, int i4, CustomErrorExtra customErrorExtra) {
        this.LJLIL = activity;
        this.LJLILLLLZI = diamond;
        this.LJLJI = interfaceC77737Uf7;
        this.LJLJJI = str;
        this.LJLJJL = i;
        this.LJLJJLL = i2;
        this.LJLJL = i3;
        this.LJLJLJ = i4;
        this.LJLJLLL = customErrorExtra;
    }

    public final void LIZ() {
        String penaltyWarningSkip;
        Activity activity = this.LJLIL;
        Diamond diamond = this.LJLILLLLZI;
        InterfaceC77737Uf7 interfaceC77737Uf7 = this.LJLJI;
        String str = this.LJLJJI;
        int i = this.LJLJJL;
        int i2 = this.LJLJJLL;
        int i3 = this.LJLJL;
        int i4 = this.LJLJLJ;
        CustomErrorExtra customErrorExtra = this.LJLJLLL;
        if (customErrorExtra == null) {
            penaltyWarningSkip = "";
        } else {
            penaltyWarningSkip = customErrorExtra.getPenaltyWarningSkip();
        }
        o.LJIIIIZZ(penaltyWarningSkip, "if (customError == null)…mError.penaltyWarningSkip");
        C77731Uf1.LJIIIIZZ(activity, diamond, interfaceC77737Uf7, str, i, i2, i3, i4, null, true, penaltyWarningSkip, null, null, null, "", "");
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
