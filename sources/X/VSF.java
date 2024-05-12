package X;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.ies.xelement.input.LynxBaseInputView;
import com.bytedance.ies.xelement.input.LynxBaseInputView$showSoftInputRetryRunnable$mImmResultReceiver$1;
import com.lynx.tasm.base.LLog;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VSF implements Runnable {
    public int LJLIL;
    public final LynxBaseInputView$showSoftInputRetryRunnable$mImmResultReceiver$1 LJLILLLLZI;
    public final int LJLJI;
    public final VNU LJLJJI;
    public final LynxBaseInputView LJLJJL;

    public final void LIZ() {
        int i;
        Object LLIZLLLIL = C16880lQ.LLIZLLLIL(this.LJLJJI, "input_method");
        if (LLIZLLLIL != null) {
            if (!((InputMethodManager) LLIZLLLIL).showSoftInput(this.LJLJJL.mView, 1, this.LJLILLLLZI) && (i = this.LJLIL) < this.LJLJI) {
                this.LJLIL = i + 1;
                this.LJLJJL.mView.post(this);
                return;
            } else {
                this.LJLIL = 0;
                return;
            }
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
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

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.ies.xelement.input.LynxBaseInputView$showSoftInputRetryRunnable$mImmResultReceiver$1] */
    public VSF(VNU vnu, LynxBaseInputView runnableView) {
        o.LJIIJ(runnableView, "runnableView");
        this.LJLJI = 3;
        this.LJLJJI = vnu;
        this.LJLJJL = runnableView;
        this.LJLILLLLZI = new ResultReceiver() { // from class: com.bytedance.ies.xelement.input.LynxBaseInputView$showSoftInputRetryRunnable$mImmResultReceiver$1
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i, Bundle bundle) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return;
                            }
                            LLog.LIZLLL(2, "LynxBaseInputView", "input call keyboard with RESULT_HIDDEN");
                            return;
                        }
                        LLog.LIZLLL(2, "LynxBaseInputView", "input call keyboard with RESULT_SHOWN");
                        return;
                    }
                    LLog.LIZLLL(2, "LynxBaseInputView", "input call keyboard with RESULT_UNCHANGED_HIDDEN");
                    return;
                }
                LLog.LIZLLL(2, "LynxBaseInputView", "input call keyboard with RESULT_UNCHANGED_SHOWN");
            }
        };
    }
}
