package X;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.zzj;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.QkF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC67863QkF<T extends IInterface> {
    public static final Feature[] LLII = new Feature[0];
    public int LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public int LJLJJI;
    public long LJLJJL;
    public volatile String LJLJJLL;
    public C67978Qm6 LJLJL;
    public final Context LJLJLJ;
    public final Looper LJLJLLL;
    public final AbstractC67866QkI LJLL;
    public final C67258QaU LJLLI;
    public final HandlerC67864QkG LJLLILLLL;
    public InterfaceC67937QlR LJLLLL;
    public InterfaceC67783Qix LJLLLLLL;
    public T LJLZ;
    public ServiceConnectionC67871QkN LJZI;
    public final InterfaceC67926QlG LL;
    public final InterfaceC67948Qlc LLD;
    public final int LLF;
    public final String LLFF;
    public volatile String LLFFF;
    public final Object LJLLJ = new Object();
    public final Object LJLLL = new Object();
    public final ArrayList<AbstractC67875QkR<?>> LJZ = new ArrayList<>();
    public int LJZL = 1;
    public ConnectionResult LLFII = null;
    public boolean LLFZ = false;
    public volatile zzj LLI = null;
    public final AtomicInteger LLIFFJFJJ = new AtomicInteger(0);

    public boolean LIZIZ() {
        return false;
    }

    public final String LJIIIIZZ() {
        return this.LJLJJLL;
    }

    public boolean LJIIIZ() {
        return this instanceof C67704Qhg;
    }

    public final boolean LJIILLIIL() {
        return true;
    }

    public final Feature[] LJIJI() {
        zzj zzjVar = this.LLI;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.LJLILLLLZI;
    }

    public abstract T LJIJJLI(IBinder iBinder);

    public Account LJIL() {
        return null;
    }

    public Feature[] LJJ() {
        return LLII;
    }

    public void LJJI() {
    }

    public Bundle LJJIFFI() {
        return null;
    }

    public abstract String LJJIIJZLJL();

    public abstract String LJJIIZ();

    public boolean LJJIJIIJIL() {
        return this instanceof C67805QjJ;
    }

    public void LIZLLL() {
        this.LLIFFJFJJ.incrementAndGet();
        synchronized (this.LJZ) {
            int size = this.LJZ.size();
            for (int i = 0; i < size; i++) {
                this.LJZ.get(i).LIZJ();
            }
            this.LJZ.clear();
        }
        synchronized (this.LJLLL) {
            this.LJLLLL = null;
        }
        LJJIJLIJ(1, null);
    }

    public Intent LJFF() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public final boolean LJIIJJI() {
        boolean z;
        synchronized (this.LJLLJ) {
            int i = this.LJZL;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final void LJIJJ() {
        int isGooglePlayServicesAvailable = this.LJLLI.isGooglePlayServicesAvailable(this.LJLJLJ, LJIILJJIL());
        if (isGooglePlayServicesAvailable != 0) {
            LJJIJLIJ(1, null);
            this.LJLLLLLL = new C67880QkW(this);
            HandlerC67864QkG handlerC67864QkG = this.LJLLILLLL;
            handlerC67864QkG.sendMessage(handlerC67864QkG.obtainMessage(3, this.LLIFFJFJJ.get(), isGooglePlayServicesAvailable, null));
            return;
        }
        LJIIL(new C67880QkW(this));
    }

    public Bundle LJJII() {
        return new Bundle();
    }

    public final T LJJIIJ() {
        T t;
        synchronized (this.LJLLJ) {
            if (this.LJZL != 5) {
                if (isConnected()) {
                    t = this.LJLZ;
                    QH7.LJIIIZ(t, "Client is connected but service is null");
                } else {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    public final boolean isConnected() {
        boolean z;
        synchronized (this.LJLLJ) {
            if (this.LJZL == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final String LJI() {
        if (isConnected() && this.LJLJL != null) {
            return "com.google.android.gms";
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public java.util.Set<Scope> LJJIII() {
        return Collections.emptySet();
    }

    public boolean LJJIIZI() {
        if (LJIILJJIL() >= 211700000) {
            return true;
        }
        return false;
    }

    public int LJIILJJIL() {
        return C67258QaU.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public static /* bridge */ /* synthetic */ void LJJIJIL(AbstractC67863QkF abstractC67863QkF) {
        int i;
        int i2;
        synchronized (abstractC67863QkF.LJLLJ) {
            i = abstractC67863QkF.LJZL;
        }
        if (i == 3) {
            abstractC67863QkF.LLFZ = true;
            i2 = 5;
        } else {
            i2 = 4;
        }
        HandlerC67864QkG handlerC67864QkG = abstractC67863QkF.LJLLILLLL;
        handlerC67864QkG.sendMessage(handlerC67864QkG.obtainMessage(i2, abstractC67863QkF.LLIFFJFJJ.get(), 16));
    }

    public final void LJIIJ(String str) {
        this.LJLJJLL = str;
        LIZLLL();
    }

    public final void LJIIL(InterfaceC67783Qix interfaceC67783Qix) {
        QH7.LJIIIZ(interfaceC67783Qix, "Connection progress callbacks cannot be null.");
        this.LJLLLLLL = interfaceC67783Qix;
        LJJIJLIJ(2, null);
    }

    public final void LJIJ(C67972Qm0 c67972Qm0) {
        c67972Qm0.LIZ.LJLLJ.LJLLL.post(new RunnableC67878QkU(c67972Qm0));
    }

    public void LJJIJ(ConnectionResult connectionResult) {
        this.LJLJJI = connectionResult.zzb;
        this.LJLJJL = System.currentTimeMillis();
    }

    public final void LJIILIIL(InterfaceC67936QlQ interfaceC67936QlQ, java.util.Set<Scope> set) {
        Bundle LJJII = LJJII();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.LLF, this.LLFFF);
        getServiceRequest.LJLJJI = this.LJLJLJ.getPackageName();
        getServiceRequest.zzg = LJJII;
        if (set != null) {
            getServiceRequest.LJLJJLL = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (LIZIZ()) {
            Account LJIL = LJIL();
            if (LJIL == null) {
                LJIL = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.LJLJL = LJIL;
            if (interfaceC67936QlQ != null) {
                getServiceRequest.LJLJJL = interfaceC67936QlQ.asBinder();
            }
        } else if (this instanceof C67862QkE) {
            getServiceRequest.LJLJL = LJIL();
        }
        getServiceRequest.LJLJLJ = LLII;
        getServiceRequest.LJLJLLL = LJJ();
        if (LJJIJIIJIL()) {
            getServiceRequest.LJLLILLLL = true;
        }
        try {
            try {
                synchronized (this.LJLLL) {
                    InterfaceC67937QlR interfaceC67937QlR = this.LJLLLL;
                    if (interfaceC67937QlR != null) {
                        interfaceC67937QlR.q(new BinderC67923QlD(this, this.LLIFFJFJJ.get()), getServiceRequest);
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                LJJIJIIJI(8, null, null, this.LLIFFJFJJ.get());
            }
        } catch (DeadObjectException unused2) {
            HandlerC67864QkG handlerC67864QkG = this.LJLLILLLL;
            handlerC67864QkG.sendMessage(handlerC67864QkG.obtainMessage(6, this.LLIFFJFJJ.get(), 3));
        } catch (SecurityException e) {
            throw e;
        }
    }

    public final void LJIIZILJ(String str, PrintWriter printWriter) {
        int i;
        T t;
        InterfaceC67937QlR interfaceC67937QlR;
        synchronized (this.LJLLJ) {
            i = this.LJZL;
            t = this.LJLZ;
        }
        synchronized (this.LJLLL) {
            interfaceC67937QlR = this.LJLLLL;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            printWriter.print("UNKNOWN");
                        } else {
                            printWriter.print("DISCONNECTING");
                        }
                    } else {
                        printWriter.print("CONNECTED");
                    }
                } else {
                    printWriter.print("LOCAL_CONNECTING");
                }
            } else {
                printWriter.print("REMOTE_CONNECTING");
            }
        } else {
            printWriter.print("DISCONNECTED");
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) LJJIIJZLJL()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC67937QlR == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC67937QlR.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.LJLJI > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.LJLJI;
            String format = simpleDateFormat.format(new Date(j));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.LJLILLLLZI > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.LJLIL;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        printWriter.append((CharSequence) String.valueOf(i2));
                    } else {
                        printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                    }
                } else {
                    printWriter.append("CAUSE_NETWORK_LOST");
                }
            } else {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.LJLILLLLZI;
            String format2 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.LJLJJL > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) C79234V7u.LJIJ(this.LJLJJI));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.LJLJJL;
            String format3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public final void LJJIJLIJ(int i, T t) {
        boolean z;
        boolean z2;
        String str;
        C67978Qm6 c67978Qm6;
        boolean z3 = false;
        if (i != 4) {
            z = false;
        } else {
            z = true;
        }
        if (t == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            z3 = true;
        }
        QH7.LIZIZ(z3);
        synchronized (this.LJLLJ) {
            this.LJZL = i;
            this.LJLZ = t;
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        QH7.LJIIIIZZ(t);
                        this.LJLJI = System.currentTimeMillis();
                    }
                } else {
                    ServiceConnectionC67871QkN serviceConnectionC67871QkN = this.LJZI;
                    if (serviceConnectionC67871QkN != null && (c67978Qm6 = this.LJLJL) != null) {
                        new StringBuilder(String.valueOf(c67978Qm6.LIZ).length() + 70 + "com.google.android.gms".length());
                        AbstractC67866QkI abstractC67866QkI = this.LJLL;
                        String str2 = this.LJLJL.LIZ;
                        QH7.LJIIIIZZ(str2);
                        this.LJLJL.getClass();
                        if (this.LLFF == null) {
                            this.LJLJLJ.getClass();
                        }
                        abstractC67866QkI.LIZJ(str2, "com.google.android.gms", 4225, serviceConnectionC67871QkN, this.LJLJL.LIZIZ);
                        this.LLIFFJFJJ.incrementAndGet();
                    }
                    ServiceConnectionC67871QkN serviceConnectionC67871QkN2 = new ServiceConnectionC67871QkN(this, this.LLIFFJFJJ.get());
                    this.LJZI = serviceConnectionC67871QkN2;
                    String LJJIIZ = LJJIIZ();
                    boolean LJJIIZI = LJJIIZI();
                    this.LJLJL = new C67978Qm6(LJJIIZ, LJJIIZI);
                    if (LJJIIZI && LJIILJJIL() < 17895000) {
                        String valueOf = String.valueOf(this.LJLJL.LIZ);
                        if (valueOf.length() != 0) {
                            str = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf);
                        } else {
                            str = new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ");
                        }
                        throw new IllegalStateException(str);
                    }
                    AbstractC67866QkI abstractC67866QkI2 = this.LJLL;
                    String str3 = this.LJLJL.LIZ;
                    QH7.LJIIIIZZ(str3);
                    this.LJLJL.getClass();
                    String str4 = this.LLFF;
                    if (str4 == null) {
                        str4 = this.LJLJLJ.getClass().getName();
                    }
                    boolean z4 = this.LJLJL.LIZIZ;
                    LJJI();
                    if (!abstractC67866QkI2.LIZLLL(new C65428Pm4(str3, "com.google.android.gms", 4225, z4), serviceConnectionC67871QkN2, str4, null)) {
                        new StringBuilder(String.valueOf(this.LJLJL.LIZ).length() + 34 + "com.google.android.gms".length());
                        int i2 = this.LLIFFJFJJ.get();
                        HandlerC67864QkG handlerC67864QkG = this.LJLLILLLL;
                        handlerC67864QkG.sendMessage(handlerC67864QkG.obtainMessage(7, i2, -1, new C67885Qkb(this, 16)));
                    }
                }
            } else {
                ServiceConnectionC67871QkN serviceConnectionC67871QkN3 = this.LJZI;
                if (serviceConnectionC67871QkN3 != null) {
                    AbstractC67866QkI abstractC67866QkI3 = this.LJLL;
                    String str5 = this.LJLJL.LIZ;
                    QH7.LJIIIIZZ(str5);
                    this.LJLJL.getClass();
                    if (this.LLFF == null) {
                        this.LJLJLJ.getClass();
                    }
                    abstractC67866QkI3.LIZJ(str5, "com.google.android.gms", 4225, serviceConnectionC67871QkN3, this.LJLJL.LIZIZ);
                    this.LJZI = null;
                }
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean LJJIJL(AbstractC67863QkF abstractC67863QkF, int i, int i2, IInterface iInterface) {
        synchronized (abstractC67863QkF.LJLLJ) {
            if (abstractC67863QkF.LJZL != i) {
                return false;
            }
            abstractC67863QkF.LJJIJLIJ(i2, iInterface);
            return true;
        }
    }

    public void LJJIJIIJI(int i, IBinder iBinder, Bundle bundle, int i2) {
        HandlerC67864QkG handlerC67864QkG = this.LJLLILLLL;
        handlerC67864QkG.sendMessage(handlerC67864QkG.obtainMessage(1, i2, -1, new C67870QkM(this, i, iBinder, bundle)));
    }

    public AbstractC67863QkF(Context context, Looper looper, C67868QkK c67868QkK, C67258QaU c67258QaU, int i, InterfaceC67926QlG interfaceC67926QlG, InterfaceC67948Qlc interfaceC67948Qlc, String str) {
        QH7.LJIIIZ(context, "Context must not be null");
        this.LJLJLJ = context;
        QH7.LJIIIZ(looper, "Looper must not be null");
        this.LJLJLLL = looper;
        QH7.LJIIIZ(c67868QkK, "Supervisor must not be null");
        this.LJLL = c67868QkK;
        QH7.LJIIIZ(c67258QaU, "API availability must not be null");
        this.LJLLI = c67258QaU;
        this.LJLLILLLL = new HandlerC67864QkG(this, looper);
        this.LLF = i;
        this.LL = interfaceC67926QlG;
        this.LLD = interfaceC67948Qlc;
        this.LLFF = str;
    }
}
