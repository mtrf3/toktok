package Y;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine.MineNavBarNicknameAssem;
import com.ss.android.ugc.profile.platform.business.navbar.business.NavBarNicknameComponent;

/* loaded from: classes16.dex */
public class IDCListenerS54S0200000_15 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                return;
            case 1:
                onClick$1(this, dialogInterface, i);
                return;
            default:
                return;
        }
    }

    public IDCListenerS54S0200000_15(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    public static final void onClick$0(IDCListenerS54S0200000_15 iDCListenerS54S0200000_15, DialogInterface dialogInterface, int i) {
        ((MineNavBarNicknameAssem) iDCListenerS54S0200000_15.l0).A3((User) iDCListenerS54S0200000_15.l1);
    }

    public static final void onClick$1(IDCListenerS54S0200000_15 iDCListenerS54S0200000_15, DialogInterface dialogInterface, int i) {
        ((NavBarNicknameComponent) iDCListenerS54S0200000_15.l0).C3((User) iDCListenerS54S0200000_15.l1);
    }
}
