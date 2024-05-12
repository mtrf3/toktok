package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.5PB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5PB extends AbstractC29891Fh<InterfaceC147345qM> implements InterfaceC147345qM, InterfaceC135635Tz, InterfaceC124494ub, Handler.Callback {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLLILLLL;
    public final InterfaceC115514g7 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public int LJLJJLL;
    public AtomicInteger LJLJL;
    public final C5H3 LJLJLJ;
    public final C5H3 LJLJLLL;
    public final C82622Wbi LJLL;
    public final InterfaceC88471Ynr<AbstractC142705is, Runnable, C76800UCe> LJLLI;

    static {
        TBT tbt = new TBT(C5PB.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLILLLL = new InterfaceC74236TBo[]{tbt};
    }

    private final Handler LJJLIIIJILLIZJL() {
        return (Handler) this.LJLJJL.getValue();
    }

    private final InterfaceC143655kP LJJLIIIJJI() {
        return (InterfaceC143655kP) this.LJLIL.LIZ(this, LJLLILLLL[0]);
    }

    @Override // X.AbstractC29891Fh
    /* renamed from: LJJLIIIIJ, reason: merged with bridge method [inline-methods] */
    public InterfaceC147345qM getApiComponent() {
        return (InterfaceC147345qM) this.LJLJLJ.getValue();
    }

    public final C124454uX LJJLIIIJJIZ() {
        return (C124454uX) this.LJLJI.getValue();
    }

    public final HandlerThread LJJLIIIJLLLLLLLZ() {
        return (HandlerThread) this.LJLJJI.getValue();
    }

    public final MutableLiveData<Integer> LJJLIIJ() {
        return (MutableLiveData) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC147345qM
    public LiveData<Integer> da0() {
        return (LiveData) this.LJLJLLL.getValue();
    }

    private final void LJJLI() {
        C43045Guv.LIZLLL(new AqS152S0100000_2(this, 146), 0L);
    }

    @Override // X.InterfaceC124494ub
    public void LJIILJJIL() {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
        this.LJLJL.incrementAndGet();
        LJJLIIJ().setValue(3);
        C5MG WS = LJJLIIIJJI().WS();
        if (WS != null && (vEEditorAutoStartStopArbiter = WS.LJFF) != null) {
            vEEditorAutoStartStopArbiter.LJLJLJ = false;
        }
        LJJLIIIJJI().Mo0();
    }

    private final void LJJLJ() {
        InterfaceC153045zY interfaceC153045zY;
        C124454uX LJJLIIIJJIZ = LJJLIIIJJIZ();
        C5MG WS = LJJLIIIJJI().WS();
        if (WS != null) {
            interfaceC153045zY = WS.LJJ();
        } else {
            interfaceC153045zY = null;
        }
        EnumC124444uW action = EnumC124444uW.AUDIO_FADEOUT;
        LJJLIIIJJIZ.getClass();
        o.LJIIIZ(action, "action");
        C124454uX.LJ = interfaceC153045zY;
        C124454uX.LIZ = action;
        C124454uX.LIZIZ().clear();
        C124454uX.LIZJ(EnumC124504uc.INITIALIZED);
        C124454uX.LJ(this.LJLJJLL);
        if (C124454uX.LJFF == EnumC124504uc.UNINITIALIZED || C124454uX.LJFF == EnumC124504uc.IDLE) {
            return;
        }
        EnumC124444uW enumC124444uW = C124454uX.LIZ;
        if (enumC124444uW != null) {
            if (enumC124444uW != action) {
                return;
            }
            int i = C124464uY.LIZIZ[C124454uX.LJFF.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    C124454uX.LIZIZ().add(this);
                    return;
                } else {
                    LJJIIJZLJL();
                    LJIILJJIL();
                    return;
                }
            }
            LJJIIJZLJL();
            C124454uX.LIZIZ().add(this);
            return;
        }
        o.LJIJI("playerAction");
        throw null;
    }

    @Override // X.InterfaceC124494ub
    public void LJJIIJZLJL() {
        long j;
        C5MG WS = LJJLIIIJJI().WS();
        long j2 = 0;
        if (WS != null) {
            InterfaceC153045zY LJJ = WS.LJJ();
            int duration = LJJ.getDuration() - LJJ.LJZL();
            int i = this.LJLJJLL;
            if (duration > i) {
                duration = i;
            }
            j = duration;
        } else {
            j = 0;
        }
        Handler LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        Message obtain = Message.obtain(LJJLIIIJILLIZJL(), 3);
        obtain.arg1 = this.LJLJL.get();
        if (j >= 0) {
            j2 = j;
        }
        LJJLIIIJILLIZJL.sendMessageDelayed(obtain, j2);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        this.LJLJL.set(0);
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        LJJLIIIJLLLLLLLZ().quitSafely();
        LJJLIIIJJIZ().getClass();
        EnumC124504uc enumC124504uc = C124454uX.LJFF;
        EnumC124504uc enumC124504uc2 = EnumC124504uc.UNINITIALIZED;
        if (enumC124504uc != enumC124504uc2) {
            C124454uX.LJ = null;
            C124454uX.LIZIZ().clear();
        }
        C124454uX.LIZJ(enumC124504uc2);
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        Integer value = LJJLIIJ().getValue();
        if (value != null) {
            if (value.intValue() == 1) {
                LJJLI();
                C5MG WS = LJJLIIIJJI().WS();
                if (WS != null) {
                    WS.LJJIII(true);
                }
                LJJLIIIJJI().PS(false);
            } else if (value.intValue() == 3 && LJJLIIIJJI().pi()) {
                C5MG WS2 = LJJLIIIJJI().WS();
                if (WS2 != null) {
                    WS2.LJJIII(true);
                }
                LJJLIIIJJI().PS(false);
            }
        }
        LJJLIIJ().setValue(0);
        LJJLIIIJJIZ().getClass();
        C124454uX.LIZJ(EnumC124504uc.IDLE);
        super.onResume();
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    @Override // X.InterfaceC147345qM
    public void VF(Integer num) {
        int i;
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudioFadeout || AudioFadeoutComponent startAudioFadeout, certificateNum: ");
        LIZ.append(this.LJLJL);
        LIZLLL.d(X1D.LIZIZ(LIZ));
        LJJLIIIJJI().S50();
        C5MG WS = LJJLIIIJJI().WS();
        if (WS != null && (vEEditorAutoStartStopArbiter = WS.LJFF) != null) {
            vEEditorAutoStartStopArbiter.LJLJLJ = true;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = 1000;
        }
        this.LJLJJLL = i;
        LJJLIIIJILLIZJL().sendMessage(Message.obtain(LJJLIIIJILLIZJL(), 1));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i != 1) {
            if (i != 3 || msg.arg1 != this.LJLJL.get()) {
                return false;
            }
            LJJLI();
            return false;
        }
        LJJLJ();
        LJJLIIJ().postValue(1);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5PB(C82622Wbi diContainer, InterfaceC88471Ynr<? super AbstractC142705is, ? super Runnable, C76800UCe> callback) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(callback, "callback");
        this.LJLL = diContainer;
        this.LJLLI = callback;
        this.LJLIL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(C5PC.LJLIL);
        this.LJLJI = C221108m2.LIZIZ(C5PE.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(C5PD.LJLIL);
        this.LJLJJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 144));
        this.LJLJL = new AtomicInteger(0);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 143));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 145));
    }

    public /* synthetic */ C5PB(C82622Wbi c82622Wbi, InterfaceC88471Ynr interfaceC88471Ynr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c82622Wbi, (i & 2) != 0 ? C5PG.LIZ : interfaceC88471Ynr);
    }
}
