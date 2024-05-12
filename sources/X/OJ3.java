package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;

/* loaded from: classes11.dex */
public final class OJ3 implements InterfaceC68141Qoj, InterfaceC153055zZ {
    public final Object LJLIL;

    @Override // X.InterfaceC153055zZ
    public final Object a() {
        String string;
        Context context = ((C40646FxK) ((InterfaceC153055zZ) this.LJLIL)).LJLIL.LIZ;
        C40654FxS.LJI(context);
        try {
            Bundle bundle = C16880lQ.LLLLLLLLL(context.getPackageManager(), context.getPackageName(), 128).metaData;
            if (bundle == null || (string = bundle.getString("local_testing_dir")) == null) {
                return null;
            }
            return new File(C16880lQ.LLIIJI(context, null), string);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public /* synthetic */ OJ3(Object obj) {
        this.LJLIL = obj;
    }

    @Override // X.InterfaceC68141Qoj
    public final void LIZ(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            C68082Qnm c68082Qnm = (C68082Qnm) this.LJLIL;
            c68082Qnm.LIZ.LJIILIIL.getClass();
            c68082Qnm.LJIIJJI("auto", "_err", bundle, true, true, System.currentTimeMillis());
            return;
        }
        this.LJLIL.getClass();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
