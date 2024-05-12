package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.zzar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Zm5, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90909Zm5 extends AbstractC67789Qj3<C90821Zkf> {
    public static final C90469Zez LLIZLLLIL = new C90469Zez("CastClientImpl");
    public static final Object LLJ = new Object();
    public static final Object LLJI = new Object();
    public ApplicationMetadata LLIIIL;
    public final CastDevice LLIIIZ;
    public final C90218Zaw LLIIJI;
    public final java.util.Map<String, InterfaceC90219Zax> LLIIJLIL;
    public final long LLIIL;
    public final Bundle LLIILII;
    public BinderC90908Zm4 LLIILZL;
    public String LLIIZ;
    public boolean LLIL;
    public boolean LLILII;
    public boolean LLILIL;
    public double LLILL;
    public zzar LLILLIZIL;
    public int LLILLJJLI;
    public int LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public Bundle LLILZLL;
    public final java.util.Map<Long, InterfaceC68012Qme<Status>> LLIZ;

    @Override // X.AbstractC67863QkF, X.InterfaceC67836Qjo
    public final int LJIILJJIL() {
        return 12800000;
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIJZLJL() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIZ() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC67863QkF, X.InterfaceC67836Qjo
    public final void LIZLLL() {
        C90909Zm5 andSet;
        C90469Zez c90469Zez = LLIZLLLIL;
        isConnected();
        c90469Zez.getClass();
        BinderC90908Zm4 binderC90908Zm4 = this.LLIILZL;
        this.LLIILZL = null;
        if (binderC90908Zm4 == null || (andSet = binderC90908Zm4.LJLIL.getAndSet(null)) == null) {
            return;
        }
        andSet.LLILLJJLI = -1;
        andSet.LLILLL = -1;
        andSet.LLIIIL = null;
        andSet.LLIIZ = null;
        andSet.LLILL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        andSet.LJJIZ();
        andSet.LLIL = false;
        andSet.LLILLIZIL = null;
        c90469Zez.getClass();
        synchronized (this.LLIIJLIL) {
            ((HashMap) this.LLIIJLIL).clear();
        }
        try {
            ((C90821Zkf) LJJIIJ()).j();
        } catch (RemoteException | IllegalStateException unused) {
            LLIZLLLIL.getClass();
        } finally {
            super.LIZLLL();
        }
    }

    @Override // X.AbstractC67863QkF
    public final Bundle LJJIFFI() {
        Bundle bundle = this.LLILZLL;
        if (bundle == null) {
            return null;
        }
        this.LLILZLL = null;
        return bundle;
    }

    @Override // X.AbstractC67863QkF
    public final Bundle LJJII() {
        Bundle bundle = new Bundle();
        LLIZLLLIL.getClass();
        CastDevice castDevice = this.LLIIIZ;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.LLIIL);
        Bundle bundle2 = this.LLIILII;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        this.LLIILZL = new BinderC90908Zm4(this);
        bundle.putParcelable("listener", new BinderWrapper(this.LLIILZL));
        String str = this.LLILZ;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.LLILZIL;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    public final void LJJIZ() {
        QH7.LJIIIZ(this.LLIIIZ, "device should not be null");
        if (!this.LLIIIZ.LJJJJZ(2048) && this.LLIIIZ.LJJJJZ(4) && !this.LLIIIZ.LJJJJZ(1)) {
            "Chromecast Audio".equals(this.LLIIIZ.zze);
        }
    }

    @Override // X.AbstractC67863QkF
    public final /* synthetic */ IInterface LJIJJLI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof C90821Zkf) {
            return queryLocalInterface;
        }
        return new C90821Zkf(iBinder);
    }

    @Override // X.AbstractC67863QkF
    public final void LJJIJ(ConnectionResult connectionResult) {
        super.LJJIJ(connectionResult);
        LLIZLLLIL.getClass();
        synchronized (this.LLIIJLIL) {
            ((HashMap) this.LLIIJLIL).clear();
        }
    }

    public static void LJJIL(C90909Zm5 c90909Zm5, long j, int i) {
        InterfaceC68012Qme interfaceC68012Qme;
        synchronized (c90909Zm5.LLIZ) {
            interfaceC68012Qme = (InterfaceC68012Qme) ((HashMap) c90909Zm5.LLIZ).remove(Long.valueOf(j));
        }
        if (interfaceC68012Qme != null) {
            interfaceC68012Qme.LIZ(new Status(i, null, null));
        }
    }

    @Override // X.AbstractC67863QkF
    public final void LJJIJIIJI(int i, IBinder iBinder, Bundle bundle, int i2) {
        LLIZLLLIL.getClass();
        if (i == 0 || i == 2300) {
            this.LLILII = true;
            this.LLILIL = true;
        }
        if (i == 2300) {
            Bundle bundle2 = new Bundle();
            this.LLILZLL = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super.LJJIJIIJI(i, iBinder, bundle, i2);
    }

    public C90909Zm5(Context context, Looper looper, C67736QiC c67736QiC, CastDevice castDevice, long j, C90218Zaw c90218Zaw, Bundle bundle, InterfaceC67706Qhi interfaceC67706Qhi, InterfaceC67707Qhj interfaceC67707Qhj) {
        super(context, looper, 10, c67736QiC, interfaceC67706Qhi, interfaceC67707Qhj);
        this.LLIIIZ = castDevice;
        this.LLIIJI = c90218Zaw;
        this.LLIIL = j;
        this.LLIILII = bundle;
        this.LLIIJLIL = new HashMap();
        new AtomicLong(0L);
        this.LLIZ = new HashMap();
        this.LLILLJJLI = -1;
        this.LLILLL = -1;
        this.LLIIIL = null;
        this.LLIIZ = null;
        this.LLILL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        LJJIZ();
        this.LLIL = false;
        this.LLILLIZIL = null;
        LJJIZ();
    }
}
