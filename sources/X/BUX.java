package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.qa.AskQuestionDialog;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BUX implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ AskQuestionDialog LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public BUX(String str, AskQuestionDialog askQuestionDialog, Context context, String str2, String str3) {
        this.LJLIL = str;
        this.LJLILLLLZI = askQuestionDialog;
        this.LJLJI = context;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
    }

    public final void LIZ() {
        boolean z;
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        if (iHostAction != null) {
            z = iHostAction.hostInterceptSpark(this.LJLIL);
        } else {
            z = false;
        }
        if (z) {
            AskQuestionDialog askQuestionDialog = this.LJLILLLLZI;
            String str = this.LJLIL;
            Context context = this.LJLJI;
            askQuestionDialog.getClass();
            C29682Bks LIZJ = C29683Bkt.LIZJ(str);
            LIZJ.LJIIIZ("bottom");
            DataChannel dataChannel = askQuestionDialog.dataChannel;
            if (dataChannel != null && o.LJ(dataChannel.kv0(BCW.class), Boolean.TRUE)) {
                C29682Bks.LJIIJJI(LIZJ, (int) C15380j0.LJIJ((int) (C15380j0.LJIIJJI() * 0.9f)));
                C29682Bks.LJJ(LIZJ, (int) C15380j0.LJIJ(C15380j0.LJIIL()));
            } else {
                C29682Bks.LJIJI(LIZJ, 8);
                C29682Bks.LJIIJJI(LIZJ, (int) C15380j0.LJIJ(C15380j0.LJIIJJI()));
                C29682Bks.LJJ(LIZJ, 395);
            }
            LIZJ.LJ(-1);
            String uri = LIZJ.LIZ().toString();
            o.LJIIIIZZ(uri, "SparkPopupSchemaBuilder.…      .build().toString()");
            InterfaceC06390Mx LIZ = CN1.LIZ(IHybridContainerService.class);
            o.LJIIIIZZ(LIZ, "getService(IHybridContainerService::class.java)");
            ((IHybridContainerService) LIZ).Vs0(context, uri, null);
        } else {
            AskQuestionDialog askQuestionDialog2 = this.LJLILLLLZI;
            String str2 = this.LJLIL;
            Context context2 = this.LJLJI;
            askQuestionDialog2.getClass();
            C28870BUs c28870BUs = new C28870BUs(str2);
            c28870BUs.LJIIJ = -1;
            c28870BUs.LJIIIZ = 80;
            DataChannel dataChannel2 = askQuestionDialog2.dataChannel;
            if (dataChannel2 != null && o.LJ(dataChannel2.kv0(BCW.class), Boolean.TRUE)) {
                c28870BUs.LIZJ = (int) C15380j0.LJIJ((int) (C15380j0.LJIIJJI() * 0.9f));
                c28870BUs.LIZIZ = (int) C15380j0.LJIJ(C15380j0.LJIIL());
                c28870BUs.LJIJJ = C15380j0.LJIILJJIL(R.string.ljd);
                c28870BUs.LJIJJLI = true;
                c28870BUs.LJJIFFI = true;
            } else {
                c28870BUs.LIZ(8, 0, 8);
                c28870BUs.LJIIL = true;
                c28870BUs.LIZJ = (int) C15380j0.LJIJ(C15380j0.LJIIJJI());
                c28870BUs.LIZIZ = 395;
            }
            BaseDialogFragment.wl(C29306Beo.LIZIZ(context2), ((IBrowserService) CN1.LIZ(IBrowserService.class)).Lu().LIZ(c28870BUs));
        }
        DataChannel dataChannel3 = this.LJLILLLLZI.dataChannel;
        String str3 = this.LJLJJI;
        String str4 = this.LJLJJL;
        C28852BUa.LIZ = true;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_qa_rethink_cg_ck");
        C06540Nm.LJFF((C29374Bfu) C279117r.LIZJ(LIZ2, dataChannel3), LIZ2, "user_id", str4, "comment");
        LIZ2.LJIJJ(Integer.valueOf(TextUtils.equals(str3, str4) ? 1 : 0), "resend_same_cmt");
        LIZ2.LJJIIJZLJL();
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
