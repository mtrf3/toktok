package X;

import Y.ARunnableS40S0100000_4;
import android.os.Handler;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ATT extends ASB {
    public final C62435Oet LJLJJI;
    public final AS3 LJLJJL;

    @Override // X.ASG
    public final void LIZ(View v) {
        o.LJIIIZ(v, "v");
        CharSequence text = ((AppCompatTextView) v).getText();
        o.LJIIIIZZ(text, "v.text");
        float parseFloat = CastFloatProtector.parseFloat(text.subSequence(0, r5.getText().length() - 1).toString());
        if (IFH.LIZIZ(this.LJLILLLLZI) == parseFloat) {
            return;
        }
        C98273tP.LIZ(this.LJLILLLLZI, this.LJLJJI.LJLILLLLZI, "long_press", parseFloat, new HashMap());
        IFH.LJ(this.LJLJJI.LJLILLLLZI, this.LJLILLLLZI, parseFloat);
    }

    @Override // X.ASG
    public final void LIZIZ(View v) {
        o.LJIIIZ(v, "v");
        new Handler(v.getContext().getMainLooper()).postDelayed(new ARunnableS40S0100000_4(this, 101), 100L);
        LIZ(v);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ATT(C62435Oet actionsManager, AS3 as3) {
        super(actionsManager, as3);
        o.LJIIIZ(actionsManager, "actionsManager");
        this.LJLJJI = actionsManager;
        this.LJLJJL = as3;
    }
}
