package X;

import android.view.KeyEvent;
import android.view.View;
import com.bytedance.android.livesdk.mvp.PaidRoomCheckDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BK4 implements View.OnKeyListener {
    public final /* synthetic */ PaidRoomCheckDialog LJLIL;

    public BK4(PaidRoomCheckDialog paidRoomCheckDialog) {
        this.LJLIL = paidRoomCheckDialog;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (66 == i && 1 == keyEvent.getAction()) {
            PaidRoomCheckDialog paidRoomCheckDialog = this.LJLIL;
            String upperCase = String.valueOf(((C19K) paidRoomCheckDialog._$_findCachedViewById(R.id.cq8)).getText()).toUpperCase();
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase()");
            paidRoomCheckDialog.checkCode(upperCase);
            return true;
        }
        return false;
    }
}
