package X;

import Y.ARunnableS18S0300000_7;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import v5.n;

/* renamed from: X.Gmh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C42535Gmh implements InterfaceC65784Pro {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ n LJLJI;
    public final /* synthetic */ Bundle LJLJJI;

    public /* synthetic */ C42535Gmh(Context context, Bundle bundle, n nVar, String str) {
        this.LJLIL = context;
        this.LJLILLLLZI = str;
        this.LJLJI = nVar;
        this.LJLJJI = bundle;
    }

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        Context context = this.LJLIL;
        String str = this.LJLILLLLZI;
        n nVar = this.LJLJI;
        Bundle bundle = this.LJLJJI;
        boolean[] zArr = {false};
        ProgressDialogC43239Gy3[] progressDialogC43239Gy3Arr = {null};
        if (context instanceof LifecycleOwner) {
            zArr[0] = true;
            new SafeHandler(C60903NvH.LJIIJJI().LJIL().LIZ(C45804HyK.LJIJJ(context))).postDelayed(new ARunnableS18S0300000_7(zArr, context, progressDialogC43239Gy3Arr, 2), 300L);
        }
        AVExternalServiceImpl.LIZ().abilityService().effectService().buildEffectPlatform(context, new H9E(str, C03660Ck.LIZJ(WM7.SCENE_SERVICE, ""), zArr, progressDialogC43239Gy3Arr, nVar, bundle), null);
        return C76800UCe.LIZ;
    }
}
