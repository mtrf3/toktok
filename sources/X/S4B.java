package X;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.IDqS460S0100000_12;

/* loaded from: classes13.dex */
public final class S4B implements View.OnTouchListener {
    public final /* synthetic */ InterfaceC88475Ynv<Boolean, C27941Axt, C27959AyB, String, Integer, Boolean> LJLIL;
    public final /* synthetic */ S49 LJLILLLLZI;
    public final /* synthetic */ C27941Axt LJLJI;
    public final /* synthetic */ C27959AyB LJLJJI;
    public final /* synthetic */ int LJLJJL;

    public S4B(IDqS460S0100000_12 iDqS460S0100000_12, S49 s49, C27941Axt c27941Axt, C27959AyB c27959AyB, int i) {
        this.LJLIL = iDqS460S0100000_12;
        this.LJLILLLLZI = s49;
        this.LJLJI = c27941Axt;
        this.LJLJJI = c27959AyB;
        this.LJLJJL = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            return this.LJLIL.invoke(Boolean.valueOf(this.LJLILLLLZI.LJLJJL.isChecked()), this.LJLJI, this.LJLJJI, "button", Integer.valueOf(this.LJLJJL)).booleanValue();
        }
        return false;
    }
}
