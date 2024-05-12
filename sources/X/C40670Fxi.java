package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.play.core.assetpacks.p2;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.Fxi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40670Fxi implements BMY, InterfaceC153055zZ {
    public final Object LJLIL;

    public final synchronized JSONObject LIZ() {
        try {
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
        return new JSONObject((HashMap) this.LJLIL);
    }

    @Override // X.InterfaceC153055zZ
    public final Object a() {
        Context a = ((p2) ((InterfaceC153055zZ) this.LJLIL)).a();
        try {
            Bundle bundle = C16880lQ.LLLLLLLLL(a.getPackageManager(), a.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public /* synthetic */ C40670Fxi() {
        this.LJLIL = new HashMap();
    }

    public /* synthetic */ C40670Fxi(p2 p2Var) {
        this.LJLIL = p2Var;
    }
}
