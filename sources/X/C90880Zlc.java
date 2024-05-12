package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.zzar;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Zlc, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90880Zlc extends AbstractC67791Qj5<C90655Zhz> implements InterfaceC90656Zi0 {
    public static final C90469Zez LJJIJ = new C90469Zez("CastClient");
    public static final C67718Qhu<C90655Zhz> LJJIJIIJI = new C67718Qhu<>("Cast.API_CXLESS", new C90878Zla(), C90476Zf6.LIZIZ);
    public final BinderC90879Zlb LJIIJ;
    public Handler LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public C67649Qgn<InterfaceC90654Zhy> LJIILJJIL;
    public C67649Qgn<Status> LJIILL;
    public final AtomicLong LJIILLIIL;
    public final Object LJIIZILJ;
    public final Object LJIJ;
    public ApplicationMetadata LJIJI;
    public String LJIJJ;
    public double LJIJJLI;
    public boolean LJIL;
    public int LJJ;
    public int LJJI;
    public zzar LJJIFFI;
    public final CastDevice LJJII;
    public final java.util.Map<Long, C67649Qgn<Void>> LJJIII;
    public final java.util.Map<String, InterfaceC90219Zax> LJJIIJ;
    public final C90218Zaw LJJIIJZLJL;
    public final List<ZX1> LJJIIZ;
    public int LJJIIZI;

    public final void LJII() {
        boolean z;
        if (this.LJJIIZI == 2) {
            z = true;
        } else {
            z = false;
        }
        QH7.LJIIJ("Not connected to device", z);
    }

    public final void LJIIIIZZ() {
        LJJIJ.getClass();
        synchronized (this.LJJIIJ) {
            ((HashMap) this.LJJIIJ).clear();
        }
    }

    public final C67646Qgk LJIIJ() {
        C67887Qkd c67887Qkd = new C67887Qkd();
        c67887Qkd.LIZ = new InterfaceC67935QlP() { // from class: X.ZgT
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC67935QlP
            public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
                ((C90821Zkf) ((AbstractC67863QkF) interfaceC67836Qjo).LJJIIJ()).j();
                ((C67649Qgn) obj).LIZIZ(null);
            }
        };
        c67887Qkd.LIZLLL = 8403;
        C67646Qgk LIZLLL = LIZLLL(1, c67887Qkd.LIZ());
        LJIIIIZZ();
        LJI(this.LJIIJ);
        return LIZLLL;
    }

    public final void LJIILIIL() {
        if (!this.LJJII.LJJJJZ(2048) && this.LJJII.LJJJJZ(4) && !this.LJJII.LJJJJZ(1)) {
            "Chromecast Audio".equals(this.LJJII.zze);
        }
    }

    public static /* bridge */ /* synthetic */ Handler LJIILJJIL(C90880Zlc c90880Zlc) {
        if (c90880Zlc.LJIIJJI == null) {
            c90880Zlc.LJIIJJI = new HandlerC90301ZcH(c90880Zlc.LJFF);
        }
        return c90880Zlc.LJIIJJI;
    }

    public final C67646Qgk LJI(BinderC90879Zlb binderC90879Zlb) {
        Looper looper = this.LJFF;
        QH7.LJIIIZ(binderC90879Zlb, "Listener must not be null");
        QH7.LJIIIZ(looper, "Looper must not be null");
        C67891Qkh<L> c67891Qkh = new C67890Qkg(looper, binderC90879Zlb).LIZIZ;
        QH7.LJIIIZ(c67891Qkh, "Key must not be null");
        C67824Qjc c67824Qjc = this.LJIIIZ;
        c67824Qjc.getClass();
        C67649Qgn c67649Qgn = new C67649Qgn();
        c67824Qjc.LJFF(c67649Qgn, 8415, this);
        C67832Qjk c67832Qjk = new C67832Qjk(c67891Qkh, c67649Qgn);
        HandlerC67272Qai handlerC67272Qai = c67824Qjc.LJLLL;
        handlerC67272Qai.sendMessage(handlerC67272Qai.obtainMessage(13, new C67894Qkk(c67832Qjk, c67824Qjc.LJLJLLL.get(), this)));
        return c67649Qgn.LIZ;
    }

    public final void LJIIIZ(int i) {
        synchronized (this.LJIIZILJ) {
            C67649Qgn<InterfaceC90654Zhy> c67649Qgn = this.LJIILJJIL;
            if (c67649Qgn != null) {
                c67649Qgn.LIZ(C1GE.LIZJ(new Status(i, null)));
            }
            this.LJIILJJIL = null;
        }
    }

    public C90880Zlc(Context context, C90655Zhz c90655Zhz) {
        super(context, LJJIJIIJI, c90655Zhz, C67795Qj9.LIZJ);
        this.LJIIJ = new BinderC90879Zlb(this);
        this.LJIIZILJ = new Object();
        this.LJIJ = new Object();
        this.LJJIIZ = Collections.synchronizedList(new ArrayList());
        QH7.LJIIIZ(context, "context cannot be null");
        this.LJJIIJZLJL = c90655Zhz.LJLILLLLZI;
        this.LJJII = c90655Zhz.LJLIL;
        this.LJJIII = new HashMap();
        this.LJJIIJ = new HashMap();
        this.LJIILLIIL = new AtomicLong(0L);
        this.LJJIIZI = 1;
        LJIILIIL();
    }

    public static void LJFF(C90880Zlc c90880Zlc, int i) {
        synchronized (c90880Zlc.LJIJ) {
            C67649Qgn<Status> c67649Qgn = c90880Zlc.LJIILL;
            if (c67649Qgn == null) {
                return;
            }
            if (i != 0) {
                c67649Qgn.LIZ(C1GE.LIZJ(new Status(i, null)));
            } else {
                c67649Qgn.LIZIZ(new Status(0, null, null));
            }
            c90880Zlc.LJIILL = null;
        }
    }

    public final C67646Qgk LJIIJJI(final String str, final String str2) {
        C90468Zey.LIZLLL(str);
        if (!TextUtils.isEmpty(str2)) {
            if (str2.length() <= 524288) {
                C67887Qkd c67887Qkd = new C67887Qkd();
                c67887Qkd.LIZ = new InterfaceC67935QlP() { // from class: X.Zgb
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC67935QlP
                    public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
                        C90880Zlc c90880Zlc = C90880Zlc.this;
                        String str3 = str;
                        String str4 = str2;
                        AbstractC67863QkF abstractC67863QkF = (AbstractC67863QkF) interfaceC67836Qjo;
                        C67649Qgn c67649Qgn = (C67649Qgn) obj;
                        long incrementAndGet = c90880Zlc.LJIILLIIL.incrementAndGet();
                        c90880Zlc.LJII();
                        try {
                            ((HashMap) c90880Zlc.LJJIII).put(Long.valueOf(incrementAndGet), c67649Qgn);
                            C90232ZbA c90232ZbA = (C90232ZbA) abstractC67863QkF.LJJIIJ();
                            Parcel LJLJI = c90232ZbA.LJLJI();
                            LJLJI.writeString(str3);
                            LJLJI.writeString(str4);
                            LJLJI.writeLong(incrementAndGet);
                            c90232ZbA.LLZZJLIL(LJLJI, 9);
                        } catch (RemoteException e) {
                            ((HashMap) c90880Zlc.LJJIII).remove(Long.valueOf(incrementAndGet));
                            c67649Qgn.LIZ(e);
                        }
                    }
                };
                c67887Qkd.LIZLLL = 8405;
                return LIZLLL(1, c67887Qkd.LIZ());
            }
            LJJIJ.getClass();
            throw new IllegalArgumentException("Message exceeds maximum size524288");
        }
        throw new IllegalArgumentException("The message payload cannot be null or empty");
    }

    public final C67646Qgk LJIIL(final String str, final InterfaceC90219Zax interfaceC90219Zax) {
        C90468Zey.LIZLLL(str);
        if (interfaceC90219Zax != null) {
            synchronized (this.LJJIIJ) {
                ((HashMap) this.LJJIIJ).put(str, interfaceC90219Zax);
            }
        }
        C67887Qkd c67887Qkd = new C67887Qkd();
        c67887Qkd.LIZ = new InterfaceC67935QlP() { // from class: X.ZgY
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC67935QlP
            public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
                C90880Zlc c90880Zlc = this;
                String str2 = str;
                InterfaceC90219Zax interfaceC90219Zax2 = interfaceC90219Zax;
                AbstractC67863QkF abstractC67863QkF = (AbstractC67863QkF) interfaceC67836Qjo;
                C67649Qgn c67649Qgn = (C67649Qgn) obj;
                boolean z = true;
                if (c90880Zlc.LJJIIZI == 1) {
                    z = false;
                }
                QH7.LJIIJ("Not active connection", z);
                C90232ZbA c90232ZbA = (C90232ZbA) abstractC67863QkF.LJJIIJ();
                Parcel LJLJI = c90232ZbA.LJLJI();
                LJLJI.writeString(str2);
                c90232ZbA.LLZZJLIL(LJLJI, 12);
                if (interfaceC90219Zax2 != null) {
                    C90232ZbA c90232ZbA2 = (C90232ZbA) abstractC67863QkF.LJJIIJ();
                    Parcel LJLJI2 = c90232ZbA2.LJLJI();
                    LJLJI2.writeString(str2);
                    c90232ZbA2.LLZZJLIL(LJLJI2, 11);
                }
                c67649Qgn.LIZIZ(null);
            }
        };
        c67887Qkd.LIZLLL = 8413;
        return LIZLLL(1, c67887Qkd.LIZ());
    }

    public static void LJ(C90880Zlc c90880Zlc, long j, int i) {
        C67649Qgn c67649Qgn;
        synchronized (c90880Zlc.LJJIII) {
            java.util.Map<Long, C67649Qgn<Void>> map = c90880Zlc.LJJIII;
            Long valueOf = Long.valueOf(j);
            c67649Qgn = (C67649Qgn) ((HashMap) map).get(valueOf);
            ((HashMap) c90880Zlc.LJJIII).remove(valueOf);
        }
        if (c67649Qgn != null) {
            if (i == 0) {
                c67649Qgn.LIZIZ(null);
            } else {
                c67649Qgn.LIZ(C1GE.LIZJ(new Status(i, null)));
            }
        }
    }
}
