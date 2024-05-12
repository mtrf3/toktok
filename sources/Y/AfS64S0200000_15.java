package Y;

import X.C0NB;
import X.C1JD;
import X.C32I;
import X.C36241EKf;
import X.C36910EeA;
import X.C61878OQg;
import X.C64797Pbt;
import X.C68322mC;
import X.C69084R9k;
import X.C69093R9t;
import X.C74088T5w;
import X.C78495UrL;
import X.C84754XOc;
import X.C86497Xx7;
import X.C86754Y3a;
import X.C86762Y3i;
import X.C87247YLz;
import X.EJ6;
import X.EnumC69113RAn;
import X.EnumC86511XxL;
import X.G58;
import X.ILV;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC69056R8i;
import X.InterfaceC86733Y2f;
import X.InterfaceC92693kP;
import X.RC2;
import X.X1D;
import X.XF2;
import X.XM8;
import X.XM9;
import X.XMB;
import X.XS7;
import X.Y4W;
import X.YMC;
import X.YME;
import X.YMF;
import X.YMH;
import android.app.Activity;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSmsVerificationResultEvent;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSubmitSmsCodeEvent;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class AfS64S0200000_15 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                accept$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                accept$11(this, obj);
                return;
            case 12:
                accept$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                accept$13(this, obj);
                return;
            case 14:
                accept$14(this, obj);
                return;
            case 15:
                accept$15(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS64S0200000_15 afS64S0200000_15, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C1JD.LJJ(((C69084R9k) th).getErrorCode(), ((InterfaceC69056R8i) afS64S0200000_15.l0).q9().LJJLIIIJJI(), "change_bind_phone_click", "phone", ((InterfaceC69056R8i) afS64S0200000_15.l0).Hg());
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((InterfaceC69056R8i) afS64S0200000_15.l0).q9().LJJLIIIJJI());
        clientSmsVerificationResultEvent.LJII(((InterfaceC69056R8i) afS64S0200000_15.l0).q9().LJJLIIIJLLLLLLLZ());
        clientSmsVerificationResultEvent.LJIIIZ(Y4W.FAILURE.getValue());
        clientSmsVerificationResultEvent.LJIIJ(C69093R9t.LJIJ((EnumC69113RAn) afS64S0200000_15.l1));
        clientSmsVerificationResultEvent.LJIIIIZZ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJFF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS64S0200000_15 afS64S0200000_15, Object obj) {
        C74088T5w c74088T5w = (C74088T5w) ((PhoneSignUpFragment) afS64S0200000_15.l0)._$_findCachedViewById(R.id.hnn);
        if (c74088T5w != null) {
            c74088T5w.LIZ(true);
        }
        String enterMethod = ((PhoneSignUpFragment) afS64S0200000_15.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        RC2.LIZ(0, enterMethod, (String) ((C68322mC) afS64S0200000_15.l1).element);
    }

    public static final void accept$10(AfS64S0200000_15 afS64S0200000_15, Object obj) {
        XM9<YME, ? extends Exception> xm8;
        C36910EeA c36910EeA = ((C64797Pbt) obj).LIZ;
        if (c36910EeA.LIZJ()) {
            TypedInput typedInput = c36910EeA.LJ;
            o.LJII(typedInput, "null cannot be cast to non-null type com.bytedance.retrofit2.mime.TypedByteArray");
            byte[] bytes = ((TypedByteArray) typedInput).getBytes();
            List<EJ6> list = c36910EeA.LIZLLL;
            if (list == null) {
                list = C61878OQg.INSTANCE;
            }
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (EJ6 ej6 : list) {
                arrayList.add(new C87247YLz(ej6.LIZ, ej6.LIZIZ));
            }
            YMH ymh = new YMH();
            int i = c36910EeA.LIZIZ;
            YME yme = ymh.LIZ;
            yme.LIZ = i;
            yme.LIZIZ = c36910EeA.LIZJ;
            yme.LIZJ = arrayList;
            yme.LIZLLL = bytes;
            xm8 = new XMB<>(yme);
        } else {
            ((YMC) afS64S0200000_15.l0).getClass();
            String LIZ = YMC.LIZ(c36910EeA);
            String str = ((YMC) afS64S0200000_15.l0).LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("http post response failed, code: ");
            LIZ2.append(c36910EeA.LIZIZ);
            LIZ2.append(". logId: ");
            LIZ2.append(LIZ);
            C0NB.LJ(str, X1D.LIZIZ(LIZ2));
            xm8 = new XM8<>(new Exception("response failed"));
        }
        ((YMF) afS64S0200000_15.l1).LIZ(xm8);
    }

    public static final void accept$11(AfS64S0200000_15 afS64S0200000_15, Object obj) {
        if (obj == ((WeakReference) afS64S0200000_15.l0).get()) {
            ((C84754XOc) afS64S0200000_15.l1).LIZIZ(7);
            C84754XOc c84754XOc = (C84754XOc) afS64S0200000_15.l1;
            Iterator it = ((ArrayList) c84754XOc.LIZLLL).iterator();
            while (it.hasNext()) {
                InterfaceC92693kP interfaceC92693kP = (InterfaceC92693kP) it.next();
                if (interfaceC92693kP.isDisposed()) {
                    interfaceC92693kP.dispose();
                }
            }
            ((List) G58.LIZ.getValue()).remove(c84754XOc);
            ((ArrayList) c84754XOc.LIZ).clear();
        }
    }

    public static final void accept$12(AfS64S0200000_15 afS64S0200000_15, Object obj) {
        Activity activity;
        C78495UrL c78495UrL = (C78495UrL) obj;
        if (c78495UrL != null) {
            if (c78495UrL.LIZIZ) {
                C84754XOc c84754XOc = (C84754XOc) afS64S0200000_15.l0;
                if (!c84754XOc.LIZJ) {
                    c84754XOc.LIZIZ = true;
                }
                if (c78495UrL.LIZ == ((WeakReference) afS64S0200000_15.l1).get()) {
                    ((C84754XOc) afS64S0200000_15.l0).LIZIZ(5);
                    return;
                }
                return;
            }
            activity = c78495UrL.LIZ;
        } else {
            activity = null;
        }
        if (activity != ((WeakReference) afS64S0200000_15.l1).get()) {
            return;
        }
        ((C84754XOc) afS64S0200000_15.l0).LIZIZ(1);
    }

    public static final void accept$13(AfS64S0200000_15 afS64S0200000_15, Object obj) {
        if (obj == ((WeakReference) afS64S0200000_15.l0).get()) {
            C84754XOc c84754XOc = (C84754XOc) afS64S0200000_15.l1;
            c84754XOc.LIZJ = false;
            if (c84754XOc.LIZIZ) {
                c84754XOc.LIZIZ = false;
            } else {
                c84754XOc.LIZIZ(2);
            }
        }
    }

    public static final void accept$14(AfS64S0200000_15 afS64S0200000_15, Object obj) {
        if (obj == ((WeakReference) afS64S0200000_15.l0).get()) {
            C84754XOc c84754XOc = (C84754XOc) afS64S0200000_15.l1;
            c84754XOc.LIZJ = true;
            if (!c84754XOc.LIZIZ) {
                c84754XOc.LIZIZ(6);
            }
        }
    }

    public static final void accept$15(AfS64S0200000_15 afS64S0200000_15, Object obj) {
        Boolean it = (Boolean) obj;
        o.LJIIIIZZ(it, "it");
        if (it.booleanValue()) {
            XF2 xf2 = (XF2) ((IDObjectS389S0100000_15) afS64S0200000_15.l0).l0;
            xf2.LIZ.LJJJJLI(xf2.LIZIZ, false, xf2.LIZLLL, xf2.LIZJ);
            return;
        }
        ((XF2) ((IDObjectS389S0100000_15) afS64S0200000_15.l0).l0).LIZJ.onSuccess((EffectChannelResponse) afS64S0200000_15.l1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS64S0200000_15 afS64S0200000_15, Object obj) {
        int i;
        C36241EKf c36241EKf;
        Throwable th = (Throwable) obj;
        if ((th instanceof C36241EKf) && (c36241EKf = (C36241EKf) th) != null) {
            i = c36241EKf.getErrorCode();
        } else {
            i = -1;
        }
        Integer valueOf = Integer.valueOf(i);
        String enterMethod = ((PhoneSignUpFragment) afS64S0200000_15.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        RC2.LIZ(valueOf, enterMethod, (String) ((C68322mC) afS64S0200000_15.l1).element);
        ((PhoneSignUpFragment) afS64S0200000_15.l0).Ql();
    }

    public static final void accept$3(AfS64S0200000_15 afS64S0200000_15, Object obj) {
        if (((BaseResponse) obj).status_code == 0 && ((InnerPushMessage) afS64S0200000_15.l0).getHasAvoidanceWaited() && ((EnumC86511XxL) afS64S0200000_15.l1) != EnumC86511XxL.WAIT) {
            C86497Xx7.LJII(((InnerPushMessage) afS64S0200000_15.l0).getId(), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$4(AfS64S0200000_15 afS64S0200000_15, Object obj) {
        ((C68322mC) afS64S0200000_15.l0).element = obj;
        ((InterfaceC65784Pro) afS64S0200000_15.l1).invoke();
    }

    public static final void accept$5(AfS64S0200000_15 afS64S0200000_15, Object obj) {
        Boolean result = (Boolean) obj;
        o.LJIIIIZZ(result, "result");
        if (result.booleanValue()) {
            ((InterfaceC86733Y2f) afS64S0200000_15.l0).LIZ(ILV.SUCCESS);
            ((TranslationStatusViewModel) afS64S0200000_15.l1).onEvent(C86754Y3a.LIZIZ);
        } else {
            ((InterfaceC86733Y2f) afS64S0200000_15.l0).LIZ(ILV.FAILURE);
            ((TranslationStatusViewModel) afS64S0200000_15.l1).onEvent(C86762Y3i.LIZIZ);
        }
    }

    public static final void accept$6(AfS64S0200000_15 afS64S0200000_15, Object obj) {
        ((Throwable) obj).getMessage();
        ((InterfaceC86733Y2f) afS64S0200000_15.l1).LIZ(ILV.FAILURE);
        ((TranslationStatusViewModel) afS64S0200000_15.l0).onEvent(C86762Y3i.LIZIZ);
    }

    public static final void accept$7(AfS64S0200000_15 afS64S0200000_15, Object obj) {
        ((XS7) afS64S0200000_15.l0).LJIILL((NLEModel) afS64S0200000_15.l1);
    }

    public static final void accept$8(AfS64S0200000_15 afS64S0200000_15, Object obj) {
        ((XS7) afS64S0200000_15.l0).LJIILL((NLEModel) afS64S0200000_15.l1);
    }

    public static final void accept$9(AfS64S0200000_15 afS64S0200000_15, Object obj) {
        XM9<YME, ? extends Exception> xm8;
        C36910EeA c36910EeA = ((C64797Pbt) obj).LIZ;
        if (c36910EeA.LIZJ()) {
            TypedInput typedInput = c36910EeA.LJ;
            o.LJII(typedInput, "null cannot be cast to non-null type com.bytedance.retrofit2.mime.TypedByteArray");
            byte[] bytes = ((TypedByteArray) typedInput).getBytes();
            List<EJ6> list = c36910EeA.LIZLLL;
            if (list == null) {
                list = C61878OQg.INSTANCE;
            }
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (EJ6 ej6 : list) {
                arrayList.add(new C87247YLz(ej6.LIZ, ej6.LIZIZ));
            }
            YMH ymh = new YMH();
            int i = c36910EeA.LIZIZ;
            YME yme = ymh.LIZ;
            yme.LIZ = i;
            yme.LIZIZ = c36910EeA.LIZJ;
            yme.LIZJ = arrayList;
            yme.LIZLLL = bytes;
            xm8 = new XMB<>(yme);
        } else {
            ((YMC) afS64S0200000_15.l0).getClass();
            String LIZ = YMC.LIZ(c36910EeA);
            String str = ((YMC) afS64S0200000_15.l0).LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("http post response failed, code: ");
            LIZ2.append(c36910EeA.LIZIZ);
            LIZ2.append(". logId: ");
            LIZ2.append(LIZ);
            C0NB.LJ(str, X1D.LIZIZ(LIZ2));
            xm8 = new XM8<>(new Exception("response failed"));
        }
        ((YMF) afS64S0200000_15.l1).LIZ(xm8);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS64S0200000_15(X.C84754XOc r2, java.lang.ref.WeakReference r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 11: goto Le;
                case 12: goto L5;
                case 13: goto Le;
                case 14: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS64S0200000_15.<init>(X.XOc, java.lang.ref.WeakReference, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS64S0200000_15(X.InterfaceC86733Y2f r2, com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 5: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS64S0200000_15.<init>(X.Y2f, com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel, int):void");
    }

    public AfS64S0200000_15(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
