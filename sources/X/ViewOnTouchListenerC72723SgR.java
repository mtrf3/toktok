package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;

/* renamed from: X.SgR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewOnTouchListenerC72723SgR implements View.OnTouchListener {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ Switch LJLILLLLZI;
    public final /* synthetic */ DialogC72721SgP LJLJI;

    public ViewOnTouchListenerC72723SgR(Switch r1, DialogC72721SgP dialogC72721SgP, C34K c34k) {
        this.LJLIL = c34k;
        this.LJLILLLLZI = r1;
        this.LJLJI = dialogC72721SgP;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return true;
        }
        C34K c34k = this.LJLIL;
        if (c34k.element) {
            return true;
        }
        c34k.element = true;
        boolean z = !this.LJLILLLLZI.isChecked();
        this.LJLILLLLZI.setChecked(z);
        if (this.LJLILLLLZI.isChecked()) {
            SmartImageView smartImageView = this.LJLJI.LLFII;
            if (smartImageView != null) {
                smartImageView.setVisibility(0);
            }
            TextView textView = this.LJLJI.LLFZ;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else {
            SmartImageView smartImageView2 = this.LJLJI.LLFII;
            if (smartImageView2 != null) {
                smartImageView2.setVisibility(8);
            }
            TextView textView2 = this.LJLJI.LLFZ;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        DialogC72721SgP dialogC72721SgP = this.LJLJI;
        dialogC72721SgP.LLIIJI.updateProfileBadgeIsShow(z, new C72722SgQ(this.LJLILLLLZI, dialogC72721SgP, this.LJLIL));
        return true;
    }
}
