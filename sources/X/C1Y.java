package X;

import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class C1Y<T> implements Observer {
    public final /* synthetic */ PerceptionDialogInfo LJLIL;
    public final /* synthetic */ ActivityC45651qj LJLILLLLZI;
    public final /* synthetic */ PerceptionMessage LJLJI;
    public final /* synthetic */ PerceptionMessage LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLJJLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1Y(PerceptionDialogInfo perceptionDialogInfo, ActivityC45651qj activityC45651qj, PerceptionMessage perceptionMessage, PerceptionMessage perceptionMessage2, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns2) {
        this.LJLIL = perceptionDialogInfo;
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = perceptionMessage;
        this.LJLJJI = perceptionMessage2;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = interfaceC88472Yns2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.bytedance.android.live.design.app.LifecycleAwareDialog, T, android.app.Dialog, java.lang.Object, com.bytedance.android.live.design.app.LiveDialog] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Spannable spannable;
        Spannable spannable2;
        Spannable spannable3;
        Spannable spannable4;
        Spannable spannable5 = CXJ.LIZ;
        Text text = this.LJLIL.title;
        int i = 0;
        if (text != null) {
            ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
            spannable = CXJ.LJFF(text, text.defaultPattern);
            spannable.setSpan(new ForegroundColorSpan(C04330Ez.LIZIZ(activityC45651qj, R.color.ck)), 0, spannable.length(), 18);
        } else {
            spannable = spannable5;
        }
        Text text2 = this.LJLIL.subTitle;
        if (text2 != null) {
            ActivityC45651qj activityC45651qj2 = this.LJLILLLLZI;
            spannable2 = CXJ.LJFF(text2, text2.defaultPattern);
            i = 0;
            C23010vJ.LJI(activityC45651qj2, spannable2, 0, spannable2.length(), 33, 3);
        } else {
            spannable2 = spannable5;
        }
        Text text3 = this.LJLIL.adviceActionText;
        if (text3 != null) {
            ActivityC45651qj activityC45651qj3 = this.LJLILLLLZI;
            spannable3 = CXJ.LJFF(text3, text3.defaultPattern);
            spannable3.setSpan(new ForegroundColorSpan(C04330Ez.LIZIZ(activityC45651qj3, R.color.bc)), i, spannable3.length(), 18);
            C23010vJ.LIZJ(activityC45651qj3, spannable3, i, spannable3.length(), 33, 3, 600);
        } else {
            spannable3 = spannable5;
        }
        int LIZIZ = C04330Ez.LIZIZ(this.LJLILLLLZI, R.color.cq);
        Text text4 = this.LJLIL.defaultActionText;
        if (text4 != null) {
            ActivityC45651qj activityC45651qj4 = this.LJLILLLLZI;
            spannable4 = CXJ.LJFF(text4, text4.defaultPattern);
            spannable4.setSpan(new ForegroundColorSpan(LIZIZ), i, spannable4.length(), 18);
            C23010vJ.LIZJ(activityC45651qj4, spannable4, i, spannable4.length(), 33, 3, LiveChatShowDelayForHotLiveSetting.DEFAULT);
        } else {
            spannable4 = spannable5;
        }
        C68322mC c68322mC = new C68322mC();
        if (spannable3 == spannable5 && spannable4 == spannable5) {
            C1Z.LIZ.LIZIZ();
            return;
        }
        C47071t1 c47071t1 = new C47071t1(this.LJLILLLLZI);
        c47071t1.LJII(spannable2);
        c47071t1.LJ(R.drawable.cyg);
        c47071t1.LJIILJJIL = i;
        if (spannable3 != spannable5) {
            c47071t1.LJIILJJIL(spannable3, new C30646C1a(this.LJLIL, this.LJLJI, this.LJLJJI, c68322mC, this.LJLJJL));
        }
        if (spannable4 != spannable5) {
            c47071t1.LJIILL(spannable4, new C30647C1b(this.LJLIL, this.LJLJI, c68322mC, this.LJLJJLL));
        }
        ?? r10 = (T) c47071t1.LIZ();
        c68322mC.element = r10;
        PerceptionDialogInfo perceptionDialogInfo = this.LJLIL;
        PerceptionMessage perceptionMessage = this.LJLJI;
        if (spannable != spannable5) {
            r10.setTitle(spannable);
        }
        r10.setOnDismissListener(DialogInterfaceOnDismissListenerC30648C1c.LJLIL);
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", r10, new Object[i], "void", new C65300Pk0(i, "()V", "-4116901468020914847")).LIZ) {
            r10.show();
        }
        C1Z.LIZIZ = true;
        C1Z.LIZ("show", perceptionDialogInfo.scene, "", perceptionMessage.publicEventInfo, perceptionDialogInfo);
    }
}
