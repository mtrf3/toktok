package X;

import android.app.Activity;
import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OYT extends C41273GHt {
    public final /* synthetic */ Activity LIZJ;
    public final /* synthetic */ InterfaceC62225ObV LIZLLL;
    public final /* synthetic */ Context LJ;

    @Override // X.InterfaceC42064Gf6
    public final void LIZ(android.net.Uri uri) {
        DialogC25756A8y dialogC25756A8y = this.LIZIZ;
        if (dialogC25756A8y != null && dialogC25756A8y.isShowing()) {
            dialogC25756A8y.dismiss();
        }
        if (uri != null) {
            Activity activity = this.LIZJ;
            InterfaceC62225ObV interfaceC62225ObV = this.LIZLLL;
            Context context = this.LJ;
            String LIZIZ = C00S.LIZIZ(activity, uri);
            o.LJIIIIZZ(LIZIZ, "convertUriToPath(activity, uri)");
            C62313Ocv c62313Ocv = new C62313Ocv(uri, LIZIZ, null, null, null, null, false, 252);
            if (interfaceC62225ObV.LIZ(context, c62313Ocv)) {
                interfaceC62225ObV.LJIIJ(c62313Ocv, context, null);
            } else {
                new C62293Ocb(C1DD.LIZLLL(R.string.h33, "chaosContext().getString…string.i18n_share_system)")).LJII(c62313Ocv, context, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OYT(Activity activity, InterfaceC62225ObV interfaceC62225ObV, Context context) {
        super(activity);
        this.LIZJ = activity;
        this.LIZLLL = interfaceC62225ObV;
        this.LJ = context;
    }
}
