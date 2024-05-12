package androidx.mediarouter.media;

import X.AbstractC90097ZXp;
import X.C35532Dx2;
import X.C38413F5t;
import X.C84763XOl;
import X.C90089ZXh;
import X.C90098ZXq;
import X.C90099ZXr;
import X.C90594Zh0;
import X.C90595Zh1;
import X.C90864ZlM;
import X.X1D;
import X.ZXW;
import X.ZXX;
import X.ZY5;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes29.dex */
public abstract class MediaRouteProviderService extends Service {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final Messenger LJLIL = new Messenger(new ZXX(this));
    public final ZXW LJLILLLLZI = new ZXW(this);
    public final C90594Zh0 LJLJI;
    public AbstractC90097ZXp LJLJJI;
    public final C90595Zh1 LJLJJL;

    public abstract AbstractC90097ZXp LIZJ();

    public final void LIZIZ() {
        AbstractC90097ZXp LIZJ;
        if (this.LJLJJI == null && (LIZJ = LIZJ()) != null) {
            String packageName = LIZJ.LJLILLLLZI.LIZ.getPackageName();
            if (packageName.equals(getPackageName())) {
                this.LJLJJI = LIZJ;
                C90594Zh0 c90594Zh0 = this.LJLJI;
                ZY5.LIZIZ();
                LIZJ.LJLJJI = c90594Zh0;
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onCreateMediaRouteProvider() returned a provider whose package name does not match the package name of the service.  A media route provider service can only export its own media route providers.  Provider package name: ");
            LIZ.append(packageName);
            LIZ.append(".  Service package name: ");
            LIZ.append(getPackageName());
            LIZ.append(".");
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        AbstractC90097ZXp abstractC90097ZXp = this.LJLJJI;
        if (abstractC90097ZXp != null) {
            ZY5.LIZIZ();
            abstractC90097ZXp.LJLJJI = null;
        }
        super.onDestroy();
    }

    public MediaRouteProviderService() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.LJLJJL = new C90864ZlM(this);
        } else {
            this.LJLJJL = new C90595Zh1(this);
        }
        C90595Zh1 c90595Zh1 = this.LJLJJL;
        c90595Zh1.getClass();
        this.LJLJI = new C90594Zh0(c90595Zh1);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
        this.LJLJJL.LIZ(context);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.LJLJJL.LIZIZ(intent);
    }

    public static Bundle LIZ(C90099ZXr c90099ZXr, int i) {
        if (c90099ZXr == null) {
            return null;
        }
        C90098ZXq c90098ZXq = new C90098ZXq(c90099ZXr);
        c90098ZXq.LIZ = null;
        if (i < 4) {
            c90098ZXq.LIZIZ = false;
        }
        for (C90089ZXh c90089ZXh : c90099ZXr.LIZIZ) {
            if (i >= c90089ZXh.LIZ.getInt("minClientVersion", 1) && i <= c90089ZXh.LIZ.getInt("maxClientVersion", Integer.MAX_VALUE)) {
                c90098ZXq.LIZ(c90089ZXh);
            }
        }
        C90099ZXr c90099ZXr2 = new C90099ZXr(c90098ZXq.LIZ, c90098ZXq.LIZIZ);
        Bundle bundle = c90099ZXr2.LIZ;
        if (bundle != null) {
            return bundle;
        }
        c90099ZXr2.LIZ = new Bundle();
        List<C90089ZXh> list = c90099ZXr2.LIZIZ;
        if (list != null && !list.isEmpty()) {
            int size = c90099ZXr2.LIZIZ.size();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((C90089ZXh) ListProtector.get(c90099ZXr2.LIZIZ, i2)).LIZ);
            }
            c90099ZXr2.LIZ.putParcelableArrayList("routes", arrayList);
        }
        c90099ZXr2.LIZ.putBoolean("supportsDynamicGroupRoute", c90099ZXr2.LIZJ);
        return c90099ZXr2.LIZ;
    }

    public static void LIZLLL(Messenger messenger, int i) {
        if (i != 0) {
            LJ(messenger, 1, i, 0, null, null);
        }
    }

    public static void LJ(Messenger messenger, int i, int i2, int i3, Object obj, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = obj;
        obtain.setData(bundle);
        try {
            messenger.send(obtain);
        } catch (DeadObjectException | RemoteException unused) {
        }
    }
}
