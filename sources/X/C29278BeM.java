package X;

import Y.ACListenerS40S0200000_5;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSharePanelSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BeM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29278BeM extends CSX<CPY> {
    public final TextView LJLJLLL;
    public final TextView LJLL;
    public final boolean LJLLI;
    public final boolean LJLLILLLL;
    public final int LJLLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29278BeM(View itemView) {
        super(itemView);
        boolean z;
        boolean z2;
        o.LJIIIZ(itemView, "itemView");
        this.LJLJLLL = (TextView) itemView.findViewById(R.id.jt4);
        this.LJLL = (TextView) itemView.findViewById(R.id.jsh);
        CQQ cqq = this.LJLILLLLZI;
        if (cqq != null) {
            z = cqq.LJFF;
        } else {
            z = false;
        }
        this.LJLLI = z;
        if (cqq != null) {
            z2 = cqq.LIZLLL;
        } else {
            z2 = true;
        }
        this.LJLLILLLL = z2;
        this.LJLLJ = LiveSharePanelSetting.INSTANCE.getValue();
    }

    @Override // X.CSF
    public final void L(CQQ cqq, CRD crd) {
        CQL model = (CQL) crd;
        o.LJIIIZ(model, "model");
        TextView textView = this.LJLJLLL;
        if (textView == null || this.LJLL == null) {
            return;
        }
        textView.setText(model.getContent());
        C16880lQ.LJIJI(this.LJLL, new ACListenerS40S0200000_5(this, cqq, 77));
    }
}
