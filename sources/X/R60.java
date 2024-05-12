package X;

import Y.ACListenerS31S0100000_11;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public final class R60 extends AbstractDialogC68995R5z {
    public static final /* synthetic */ int LJLLILLLL = 0;

    @Override // X.AbstractDialogC68995R5z
    public final void create(Context context) {
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.m_, getLayoutInflater(), null);
        this.LJLLI = LLLZIIL;
        if (LLLZIIL != null) {
            this.LJLILLLLZI.putBoolean("age_gate_block", true);
            C16880lQ.LJIIJ(new ACListenerS31S0100000_11(this, 19), LLLZIIL.findViewById(R.id.buw));
            C16880lQ.LJIIJ(new ACListenerS31S0100000_11(this, 20), LLLZIIL.findViewById(R.id.g_6));
            C16880lQ.LJIIJ(new ACListenerS31S0100000_11(this, 21), LLLZIIL.findViewById(R.id.k2f));
        }
        setContentView(this.LJLLI);
        ((CopyOnWriteArrayList) C69101RAb.LIZJ).add(this);
    }

    public R60(Activity activity, Bundle bundle) {
        super(activity, bundle);
        create(activity);
    }
}
