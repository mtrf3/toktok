package X;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes12.dex */
public final class R1F extends Fragment {
    public Intent LJLIL;
    public InterfaceC88473Ynt<? super Integer, ? super Integer, ? super Intent, C76800UCe> LJLILLLLZI;

    @Override // android.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (intent = this.LJLIL) != null) {
            int i = arguments.getInt("extra_request_code");
            C78598Ut0.LJIJJ(intent, this);
            startActivityForResult(intent, i);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC88473Ynt<? super Integer, ? super Integer, ? super Intent, C76800UCe> interfaceC88473Ynt = this.LJLILLLLZI;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(Integer.valueOf(i), Integer.valueOf(i2), intent);
        }
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }
}
