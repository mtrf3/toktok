package X;

import Y.ARunnableS51S0100000_15;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;

/* renamed from: X.XVk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84944XVk implements C8BT {
    public final Effect LJLIL;
    public final String LJLILLLLZI;
    public final /* synthetic */ C84942XVi LJLJI;

    @Override // X.C8BT
    public final void onSuccess() {
        C38816FLg.LIZJ(new ARunnableS51S0100000_15(this, 110));
    }

    @Override // X.C8BT
    public final void onFailed(Exception exc) {
        Context context = this.LJLJI.LJIIJ;
        if ((context instanceof Activity) && !C45804HyK.LJIJJ(context).isFinishing()) {
            AnonymousClass114.LIZ(C45804HyK.LJIJJ(this.LJLJI.LJIIJ), R.string.rjt);
        }
    }

    public C84944XVk(C84942XVi c84942XVi, Effect effect, String str) {
        this.LJLJI = c84942XVi;
        this.LJLIL = effect;
        this.LJLILLLLZI = str;
    }
}
