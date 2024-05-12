package X;

import Y.ACListenerS25S0100000_5;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStartDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final /* synthetic */ class BAC extends TBS implements InterfaceC88472Yns<Long, C76800UCe> {
    public BAC(Object obj) {
        super(1, obj, DrawGuessStartDialog.class, "initView", "initView(J)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Long l) {
        TextView textView;
        long longValue = l.longValue();
        DrawGuessStartDialog drawGuessStartDialog = (DrawGuessStartDialog) this.receiver;
        if (!drawGuessStartDialog.LJLIL) {
            drawGuessStartDialog.LJLIL = true;
            int i = (int) (longValue / 60);
            ((TextView) drawGuessStartDialog._$_findCachedViewById(R.id.e0o)).setText(C15380j0.LJIIIIZZ(R.plurals.kr, i, Integer.valueOf(i)));
            DrawGuessWord drawGuessWord = BFI.LJ;
            if ((drawGuessWord != null || (drawGuessWord = BFI.LIZ()) != null) && (textView = (TextView) drawGuessStartDialog._$_findCachedViewById(R.id.dzf)) != null) {
                textView.setText(drawGuessWord.word);
            }
            View change_btn = drawGuessStartDialog._$_findCachedViewById(R.id.b91);
            o.LJIIIIZZ(change_btn, "change_btn");
            C29306Beo.LJJJLL(change_btn, 500L, new AqS171S0100000_5(drawGuessStartDialog, 561));
            C16880lQ.LJJIII((C2A7) drawGuessStartDialog._$_findCachedViewById(R.id.kcs), new ACListenerS25S0100000_5(drawGuessStartDialog, 283));
        }
        return C76800UCe.LIZ;
    }
}
