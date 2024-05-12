package X;

import Y.ARunnableS50S0100000_14;
import Y.IDHandlerS21S0100000_8;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import com.mammon.audiosdk.enums.SAMICoreDataType;
import com.mammon.audiosdk.enums.SAMICorePropertyId;
import com.mammon.audiosdk.structures.SAMICoreProperty;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WZc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82492WZc implements InterfaceC135635Tz {
    public static int LJZL;
    public final C82622Wbi LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public volatile TimeSpeedModelExtension LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public HandlerThread LJLLILLLL;
    public IDHandlerS21S0100000_8 LJLLJ;
    public boolean LJLLL;
    public Effect LJLLLL;
    public final C82493WZd LJLLLLLL;
    public InterfaceC88472Yns<? super WZ5, C76800UCe> LJLZ;
    public final C82494WZe LJZ;
    public final C82481WYr LJZI;

    public final void LIZJ() {
        LJI(777, null);
    }

    public final synchronized void LIZLLL() {
        if (this.LJLLL) {
            return;
        }
        this.LJLLL = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("vc_stream_");
        int i = LJZL;
        LJZL = i + 1;
        LIZ.append(i);
        HandlerThread handlerThread = new HandlerThread(X1D.LIZIZ(LIZ));
        this.LJLLILLLL = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.LJLLILLLL;
        if (handlerThread2 != null) {
            this.LJLLJ = new IDHandlerS21S0100000_8(this, handlerThread2.getLooper(), 4);
        } else {
            o.LJIJI("handlerThread");
            throw null;
        }
    }

    public final synchronized void LJFF() {
        if (!this.LJLLL) {
            return;
        }
        this.LJLLL = false;
        HandlerThread handlerThread = this.LJLLILLLL;
        if (handlerThread != null) {
            handlerThread.quit();
        } else {
            o.LJIJI("handlerThread");
            throw null;
        }
    }

    public final void LIZ() {
        if (!this.LJLLL) {
            return;
        }
        this.LJLLI = true;
        C82544WaS.LIZ(new ARunnableS50S0100000_14(this, 155));
    }

    public final C168316j5 LIZIZ() {
        C168316j5 c168316j5;
        Object[] objArr;
        C82493WZd c82493WZd = this.LJLLLLLL;
        synchronized (c82493WZd) {
            try {
                c82493WZd.LJLJI.lock();
                if (!c82493WZd.LJLJL) {
                    c168316j5 = new C168316j5(null, null, null, null, null, null, 511);
                    c82493WZd.LJLJI.unlock();
                } else {
                    System.currentTimeMillis();
                    SAMICoreProperty sAMICoreProperty = new SAMICoreProperty();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("zxzzz_SamiSVC: Get_Input_Data_Save_File START ... , isShootingScene = ");
                    LIZ.append(c82493WZd.LJLLLL);
                    LIZ.append(", isPreviewScene = ");
                    LIZ.append(c82493WZd.LJLLL);
                    LIZ.append(", thread_id = ");
                    LIZ.append(Process.myTid());
                    LIZ.append(", thread_name = ");
                    LIZ.append(C16880lQ.LLLLIIIILLL().getName());
                    H78.LIZJ(X1D.LIZIZ(LIZ));
                    int SAMICoreGetPropertyById = c82493WZd.LJLJJLL.SAMICoreGetPropertyById(SAMICorePropertyId.SAMICorePropertyId_VC_Online_Get_Input_Data_Save_File, sAMICoreProperty);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("zxzzz_SamiSVC: ... Get_Input_Data_Save_File STOP , isShootingScene = ");
                    LIZ2.append(c82493WZd.LJLLLL);
                    LIZ2.append(", isPreviewScene = ");
                    LIZ2.append(c82493WZd.LJLLL);
                    LIZ2.append(", thread_id = ");
                    LIZ2.append(Process.myTid());
                    LIZ2.append(", thread_name = ");
                    LIZ2.append(C16880lQ.LLLLIIIILLL().getName());
                    H78.LIZJ(X1D.LIZIZ(LIZ2));
                    if (SAMICoreGetPropertyById == 0 && sAMICoreProperty.type == SAMICoreDataType.SAMICoreDataType_String && (objArr = sAMICoreProperty.dataObjectArray) != null) {
                        Object obj = objArr[0];
                        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj;
                        if (C78685UuP.LJJJZ(str)) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            CreativeInfo creativeInfo = c82493WZd.LIZ().creativeInfo;
                            o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
                            LIZ3.append(C171196nj.LIZ(creativeInfo));
                            LIZ3.append('/');
                            LIZ3.append(c82493WZd.LJLJLJ);
                            LIZ3.append("_vc_input_audio.pcm");
                            String LIZIZ = X1D.LIZIZ(LIZ3);
                            if (C44687HgJ.LIZLLL(str, LIZIZ)) {
                                String str2 = c82493WZd.LJLJLJ;
                                Effect effect = c82493WZd.LJLL;
                                c168316j5 = new C168316j5("", LIZIZ, str2, effect, effect.getEffect_id(), null, 464);
                            }
                        }
                    }
                    c168316j5 = new C168316j5(null, null, null, null, null, null, 511);
                }
            } finally {
                c82493WZd.LJLJI.unlock();
            }
        }
        return c168316j5;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C82492WZc(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLJI = true;
        this.LJLJJI = -1L;
        this.LJLJJL = -1L;
        this.LJLLLL = new Effect(null, 1, null);
        C82493WZd c82493WZd = new C82493WZd(diContainer);
        c82493WZd.LJLLILLLL = new AqS180S0100000_14(this, 287);
        this.LJLLLLLL = c82493WZd;
        this.LJLZ = C82501WZl.LJLIL;
        this.LJZ = new C82494WZe(diContainer);
        this.LJZI = new C82481WYr();
    }

    public static void LJIIIIZZ(C82492WZc c82492WZc) {
        if (c82492WZc.LJLLI) {
            return;
        }
        c82492WZc.LJLLI = true;
        if (c82492WZc.LJLJI) {
            C82494WZe c82494WZe = c82492WZc.LJZ;
            C82508WZs block = C82508WZs.LJLIL;
            c82494WZe.getClass();
            o.LJIIIZ(block, "block");
            c82494WZe.LJLJJL = block;
            c82492WZc.LJZ.LIZ();
        }
        c82492WZc.LJZI.LIZ = false;
        c82492WZc.LJI(4, null);
        c82492WZc.LJI(6, null);
        c82492WZc.LJI(7, null);
    }

    public final void LJ(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (!this.LJLILLLLZI || this.LJLLI || this.LJLL) {
            return;
        }
        this.LJLL = true;
        this.LJLJJL = System.currentTimeMillis();
        Effect effect = this.LJLLLL;
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJJI;
        o.LJIIIZ(effect, "effect");
        C145995oB LJIIIZ = C82468WYe.LJIIIZ(shortVideoContext);
        LJIIIZ.LIZLLL("effect_id", effect.getEffect_id());
        LJIIIZ.LIZLLL("effect_name", effect.getName());
        LJIIIZ.LIZIZ(currentTimeMillis, "duration");
        FMX.LJIIL("voice_effect_preview_record_end", LJIIIZ.LIZ);
        if (this.LJLJI) {
            C82494WZe c82494WZe = this.LJZ;
            C82500WZk block = C82500WZk.LJLIL;
            c82494WZe.getClass();
            o.LJIIIZ(block, "block");
            c82494WZe.LJLJJL = block;
            this.LJZ.LIZ();
        }
        LJI(5, null);
        LJI(4, null);
    }

    public final void LJI(int i, Object obj) {
        if (!this.LJLLL) {
            return;
        }
        IDHandlerS21S0100000_8 iDHandlerS21S0100000_8 = this.LJLLJ;
        if (iDHandlerS21S0100000_8 != null) {
            Message obtain = Message.obtain();
            obtain.arg1 = i;
            if (obj != null) {
                obtain.obj = obj;
            }
            iDHandlerS21S0100000_8.sendMessage(obtain);
            return;
        }
        o.LJIJI("workerHandler");
        throw null;
    }

    public final void LJII(Effect effect, boolean z) {
        o.LJIIIZ(effect, "effect");
        if (this.LJLILLLLZI || this.LJLLI) {
            return;
        }
        this.LJLILLLLZI = true;
        this.LJLLLL = effect;
        this.LJLJJI = System.currentTimeMillis();
        this.LJLJI = z;
        if (z) {
            C82494WZe c82494WZe = this.LJZ;
            if (!c82494WZe.LJLJI) {
                c82494WZe.LJLJI = true;
                c82494WZe.LJLJJI = true;
                C5T7 c5t7 = (C5T7) c82494WZe.LJLJJLL.getValue();
                c5t7.LIZJ.setRecorderListener((InterfaceC63875P5b) c82494WZe.LJLJL.getValue());
                ((C5T7) c82494WZe.LJLJJLL.getValue()).LIZIZ(0, 5000, C171196nj.LIZIZ);
            }
        }
        LIZLLL();
        LJI(1, null);
        LJI(2, effect);
        if (!this.LJLJI) {
            return;
        }
        C82494WZe c82494WZe2 = this.LJZ;
        AqS180S0100000_14 aqS180S0100000_14 = new AqS180S0100000_14(this, 289);
        c82494WZe2.getClass();
        c82494WZe2.LJLJJL = aqS180S0100000_14;
    }
}
