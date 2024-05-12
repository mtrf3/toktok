package Y;

import X.AbstractC32678Cs6;
import X.AbstractC32698CsQ;
import X.AnonymousClass025;
import X.BVA;
import X.C008901t;
import X.C28863BUl;
import X.C28868BUq;
import X.C29232Bdc;
import X.C29494Bhq;
import X.C30779C6d;
import X.C30896CAq;
import X.C31947CgJ;
import X.C32537Cpp;
import X.C60408NnI;
import X.CQO;
import X.CQQ;
import X.CR6;
import X.CSD;
import X.CSE;
import X.CUF;
import X.CUG;
import X.InterfaceC30264BuG;
import X.InterfaceC32725Csr;
import X.InterfaceViewOnClickListenerC30227Btf;
import android.content.Context;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.qa.QuestionCardWidget;
import com.bytedance.android.livesdk.qa.ReportQuestionDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDCListenerS298S0100000_5 implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            case 4:
                return onLongClick$4(this, view);
            case 5:
                return onLongClick$5(this, view);
            case 6:
                return onLongClick$6(this, view);
            case 7:
                return onLongClick$7(this, view);
            case 8:
                return onLongClick$8(this, view);
            case 9:
                return onLongClick$9(this, view);
            case 10:
                return onLongClick$10(this, view);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return onLongClick$11(this, view);
            case 12:
                return onLongClick$12(this, view);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return onLongClick$13(this, view);
            case 14:
                return onLongClick$14(this, view);
            default:
                return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDCListenerS298S0100000_5(Object obj, CUF<TEXT_MODEL, PINNED_MODEL> cuf) {
        this.$t = cuf;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(IDCListenerS298S0100000_5 iDCListenerS298S0100000_5, View view) {
        CUF cuf = (CUF) iDCListenerS298S0100000_5.l0;
        CQQ cqq = cuf.LJLIL;
        if (cqq != null) {
            CQO<? extends CR6> cqo = cuf.LJLJJI;
            C30779C6d c30779C6d = new C30779C6d();
            CUF cuf2 = (CUF) iDCListenerS298S0100000_5.l0;
            c30779C6d.LJFF = "user_name";
            String a0 = cuf2.a0();
            o.LJIIIZ(a0, "<set-?>");
            c30779C6d.LIZ = a0;
            c30779C6d.LIZIZ = "long_press";
            cqq.LJIIJ.LJJIIZ(cqo, c30779C6d);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$1(IDCListenerS298S0100000_5 iDCListenerS298S0100000_5, View view) {
        CUF cuf = (CUF) iDCListenerS298S0100000_5.l0;
        CQQ cqq = cuf.LJLIL;
        if (cqq != null) {
            CQO<? extends CR6> cqo = cuf.LJLJJI;
            C30779C6d c30779C6d = new C30779C6d();
            CUF cuf2 = (CUF) iDCListenerS298S0100000_5.l0;
            c30779C6d.LJFF = "comment";
            String a0 = cuf2.a0();
            o.LJIIIZ(a0, "<set-?>");
            c30779C6d.LIZ = a0;
            c30779C6d.LIZIZ = "long_press";
            cqq.LJIIJ.LJJIIZ(cqo, c30779C6d);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$10(IDCListenerS298S0100000_5 iDCListenerS298S0100000_5, View view) {
        CSD csd = (CSD) iDCListenerS298S0100000_5.l0;
        CQQ cqq = csd.LJLILLLLZI;
        if (cqq != null) {
            CQO<? extends CR6> cqo = csd.LJLJI;
            C30779C6d c30779C6d = new C30779C6d();
            c30779C6d.LJFF = "user_name";
            c30779C6d.LIZ = "report_message";
            c30779C6d.LIZIZ = "long_press";
            cqq.LJ(cqo, c30779C6d);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$11(IDCListenerS298S0100000_5 iDCListenerS298S0100000_5, View view) {
        CSD csd = (CSD) iDCListenerS298S0100000_5.l0;
        CQQ cqq = csd.LJLILLLLZI;
        if (cqq != null) {
            CQO<? extends CR6> cqo = csd.LJLJI;
            C30779C6d c30779C6d = new C30779C6d();
            c30779C6d.LJFF = "comment";
            c30779C6d.LIZ = "report_message";
            c30779C6d.LIZIZ = "long_press";
            cqq.LJ(cqo, c30779C6d);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$12(IDCListenerS298S0100000_5 iDCListenerS298S0100000_5, View view) {
        CSD csd = (CSD) iDCListenerS298S0100000_5.l0;
        CQQ cqq = csd.LJLILLLLZI;
        if (cqq != null) {
            CQO<? extends CR6> cqo = csd.LJLJI;
            C30779C6d c30779C6d = new C30779C6d();
            c30779C6d.LJFF = "avatar";
            c30779C6d.LIZ = "report_message";
            c30779C6d.LIZIZ = "long_press";
            cqq.LJ(cqo, c30779C6d);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$13(IDCListenerS298S0100000_5 iDCListenerS298S0100000_5, View view) {
        CSE cse = (CSE) iDCListenerS298S0100000_5.l0;
        CQQ cqq = cse.LJLILLLLZI;
        if (cqq != null) {
            CQO<? extends CR6> cqo = cse.LJLJI;
            C30779C6d c30779C6d = new C30779C6d();
            c30779C6d.LJFF = "avatar";
            c30779C6d.LIZ = "report_message";
            c30779C6d.LIZIZ = "long_press";
            cqq.LJ(cqo, c30779C6d);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$14(IDCListenerS298S0100000_5 iDCListenerS298S0100000_5, View view) {
        CUG cug = (CUG) iDCListenerS298S0100000_5.l0;
        CQQ cqq = cug.LJLIL;
        if (cqq != null) {
            CQO<? extends CR6> cqo = cug.LJLJJI;
            C30779C6d c30779C6d = new C30779C6d();
            CUG cug2 = (CUG) iDCListenerS298S0100000_5.l0;
            c30779C6d.LJFF = "avatar";
            cug2.getClass();
            c30779C6d.LIZ = "report_user";
            c30779C6d.LIZIZ = "long_press";
            cqq.LJ(cqo, c30779C6d);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$2(IDCListenerS298S0100000_5 iDCListenerS298S0100000_5, View view) {
        CUF cuf = (CUF) iDCListenerS298S0100000_5.l0;
        CQQ cqq = cuf.LJLIL;
        if (cqq != null) {
            CQO<? extends CR6> cqo = cuf.LJLJJI;
            C30779C6d c30779C6d = new C30779C6d();
            CUF cuf2 = (CUF) iDCListenerS298S0100000_5.l0;
            c30779C6d.LJFF = "avatar";
            String a0 = cuf2.a0();
            o.LJIIIZ(a0, "<set-?>");
            c30779C6d.LIZ = a0;
            c30779C6d.LIZIZ = "long_press";
            cqq.LJIIJ.LJJIIZ(cqo, c30779C6d);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$3(IDCListenerS298S0100000_5 iDCListenerS298S0100000_5, View view) {
        return ((InterfaceViewOnClickListenerC30227Btf) iDCListenerS298S0100000_5.l0).LLLILZJ(view);
    }

    public static final boolean onLongClick$4(IDCListenerS298S0100000_5 iDCListenerS298S0100000_5, View view) {
        long j;
        AbstractC32678Cs6 abstractC32678Cs6 = (AbstractC32678Cs6) iDCListenerS298S0100000_5.l0;
        SystemClock.uptimeMillis();
        abstractC32678Cs6.getClass();
        AbstractC32678Cs6 abstractC32678Cs62 = (AbstractC32678Cs6) iDCListenerS298S0100000_5.l0;
        InterfaceC32725Csr interfaceC32725Csr = abstractC32678Cs62.LJZI;
        if (interfaceC32725Csr != null) {
            AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = abstractC32678Cs62.LJZ;
            if (abstractC32698CsQ != null) {
                j = abstractC32698CsQ.LIZJ();
            } else {
                j = 0;
            }
            interfaceC32725Csr.LJIIIIZZ(j);
            return true;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.android.livesdk.model.message.Question, O] */
    public static final boolean onLongClick$5(IDCListenerS298S0100000_5 iDCListenerS298S0100000_5, View view) {
        QuestionCardWidget questionCardWidget;
        ?? r2;
        FragmentManager fragmentManager;
        ReportQuestionDialog reportQuestionDialog;
        QuestionCardWidget questionCardWidget2 = (QuestionCardWidget) iDCListenerS298S0100000_5.l0;
        if ((questionCardWidget2.LJLILLLLZI || !C29232Bdc.LJIIIZ(questionCardWidget2.dataChannel)) && (r2 = (questionCardWidget = (QuestionCardWidget) iDCListenerS298S0100000_5.l0).LJLJI) != 0) {
            ((C32537Cpp) questionCardWidget.dataChannel.gv0(C28868BUq.class)).LIZ = r2;
            ((C32537Cpp) questionCardWidget.dataChannel.gv0(C28863BUl.class)).LIZ = "qa_card";
            questionCardWidget.LJLJJLL = new ReportQuestionDialog();
            DataChannel dataChannel = questionCardWidget.dataChannel;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null && (reportQuestionDialog = questionCardWidget.LJLJJLL) != null) {
                reportQuestionDialog.show(fragmentManager, "QuestionCardWidget");
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bytedance.android.livesdk.model.message.Question, O] */
    public static final boolean onLongClick$6(IDCListenerS298S0100000_5 iDCListenerS298S0100000_5, View view) {
        BVA bva = (BVA) iDCListenerS298S0100000_5.l0;
        ((C32537Cpp) bva.LJLJLJ.LL.gv0(C28868BUq.class)).LIZ = bva.LJLIL;
        ((C32537Cpp) bva.LJLJLJ.LL.gv0(C28863BUl.class)).LIZ = "qa_board";
        bva.LJLJLJ.LLF = new ReportQuestionDialog();
        FragmentManager fragmentManager = (FragmentManager) bva.LJLJLJ.LL.kv0(C29494Bhq.class);
        if (fragmentManager != null) {
            bva.LJLJLJ.LLF.show(fragmentManager, "QuestionVieHolder");
            return false;
        }
        return false;
    }

    public static final boolean onLongClick$7(IDCListenerS298S0100000_5 iDCListenerS298S0100000_5, View view) {
        WebView webView;
        WebView.HitTestResult hitTestResult;
        final C60408NnI c60408NnI = (C60408NnI) iDCListenerS298S0100000_5.l0;
        c60408NnI.getClass();
        if (!(view instanceof WebView) || (hitTestResult = (webView = (WebView) view).getHitTestResult()) == null || webView.getSettings() == null) {
            return false;
        }
        if (hitTestResult.getType() != 5 && hitTestResult.getType() != 8) {
            return false;
        }
        final String extra = hitTestResult.getExtra();
        final Context context = webView.getContext();
        if (extra == null || context == null || !C31947CgJ.LIZLLL(extra)) {
            return false;
        }
        String[] strArr = {context.getResources().getString(R.string.swk)};
        AnonymousClass025 anonymousClass025 = new AnonymousClass025(context);
        C008901t c008901t = anonymousClass025.LIZ;
        c008901t.LIZLLL = extra;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.Fry
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C60408NnI c60408NnI2 = C60408NnI.this;
                Context context2 = context;
                String str = extra;
                c60408NnI2.getClass();
                if (context2 == null || TextUtils.isEmpty(str)) {
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(C16880lQ.LLIIIL(context2).getAbsolutePath());
                LIZ.append("/webview/");
                String LIZIZ = X1D.LIZIZ(LIZ);
                DownloadTask with = C84261X5d.with(context2);
                with.url(str);
                with.name("long_click_img.tmp");
                with.savePath(LIZIZ);
                with.mainThreadListener(new OWS(c60408NnI2, context2, str, LIZIZ));
                with.download();
            }
        };
        c008901t.LJIILL = strArr;
        c008901t.LJIIZILJ = onClickListener;
        anonymousClass025.LJ();
        return true;
    }

    public static final boolean onLongClick$8(IDCListenerS298S0100000_5 iDCListenerS298S0100000_5, View view) {
        return ((InterfaceViewOnClickListenerC30227Btf) iDCListenerS298S0100000_5.l0).LLLILZJ(view);
    }

    public static final boolean onLongClick$9(IDCListenerS298S0100000_5 iDCListenerS298S0100000_5, View view) {
        return ((InterfaceC30264BuG) iDCListenerS298S0100000_5.l0).LLLILZJ(view);
    }
}
