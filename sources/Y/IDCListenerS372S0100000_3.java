package Y;

import X.ASQ;
import X.C218888iS;
import X.C55096Ljo;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem;

/* loaded from: classes4.dex */
public class IDCListenerS372S0100000_3 implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                return;
            case 1:
                onFocusChange$1(this, view, z);
                return;
            default:
                return;
        }
    }

    public IDCListenerS372S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFocusChange$0(IDCListenerS372S0100000_3 iDCListenerS372S0100000_3, View view, boolean z) {
        if (z) {
            EditText editText = (EditText) iDCListenerS372S0100000_3.l0;
            editText.postDelayed(new ARunnableS39S0100000_3(editText, 1), 300L);
        }
    }

    public static final void onFocusChange$1(IDCListenerS372S0100000_3 iDCListenerS372S0100000_3, View view, boolean z) {
        Fragment LJIIIZ;
        if (z && (LJIIIZ = C55096Ljo.LJIIIZ((AddYoursInviteFriendsAssem) iDCListenerS372S0100000_3.l0)) != null && !((C218888iS) ((AddYoursInviteFriendsAssem) iDCListenerS372S0100000_3.l0).LJLIL.getValue()).LJLJJL) {
            ASQ.LJII(LJIIIZ, true);
        }
    }
}
