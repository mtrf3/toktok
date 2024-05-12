package com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker;

import X.ActivityC45651qj;
import X.C0IB;
import X.C165706es;
import X.C16880lQ;
import X.C169546l4;
import X.C221108m2;
import X.C29S;
import X.C32I;
import X.C34365DeD;
import X.C34366DeE;
import X.C44383HbP;
import X.C44687HgJ;
import X.C44946HkU;
import X.C46208IBo;
import X.C47261Igj;
import X.C53785L8z;
import X.C61878OQg;
import X.C62822Ol8;
import X.C74275TDb;
import X.C74577TOr;
import X.C76800UCe;
import X.C77275UUl;
import X.C77413UZt;
import X.C78886Uxe;
import X.C79260V8u;
import X.C83477WpV;
import X.C83483Wpb;
import X.C83484Wpc;
import X.C83487Wpf;
import X.C83489Wph;
import X.C83492Wpk;
import X.C83493Wpl;
import X.C83515Wq7;
import X.C83516Wq8;
import X.C83520WqC;
import X.C83521WqD;
import X.C83532WqO;
import X.C83534WqQ;
import X.CountDownTimerC83512Wq4;
import X.E8X;
import X.ERS;
import X.EnumC72807Shn;
import X.EnumC79463VGp;
import X.EnumC83497Wpp;
import X.GG4;
import X.IB3;
import X.IB6;
import X.IBL;
import X.IBQ;
import X.IBV;
import X.ID0;
import X.IDK;
import X.InterfaceC144185lG;
import X.InterfaceC45001HlN;
import X.InterfaceC45540Hu4;
import X.InterfaceC65784Pro;
import X.InterfaceC73997T2j;
import X.InterfaceC81397Vx3;
import X.InterfaceC83485Wpd;
import X.InterfaceC83500Wps;
import X.InterfaceC83513Wq5;
import X.InterfaceC83514Wq6;
import X.InterfaceC83517Wq9;
import X.InterfaceC83518WqA;
import X.InterfaceC83524WqG;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.ORZ;
import X.T4E;
import X.T4Q;
import X.TEZ;
import X.TK4;
import X.W5F;
import X.W5U;
import X.WM7;
import X.X1D;
import Y.AObserverS82S0100000_14;
import Y.IDDListenerS153S0100000_14;
import Y.IDHandlerS24S0100000_14;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.IDqS432S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class UploadPicStickerARPresenter extends TK4 implements GenericLifecycleObserver, InterfaceC81397Vx3 {
    public static boolean LLJJIJIIJIL;
    public final ViewModelProvider LJLJI;
    public IB6 LJLJJI;
    public C46208IBo LJLJJL;
    public C83484Wpc LJLJJLL;
    public Effect LJLJL;
    public C83489Wph LJLJLJ;
    public C83483Wpb LJLJLLL;
    public final ArrayList<String> LJLL;
    public boolean LJLLI;
    public String LJLLILLLL;
    public long LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public C44946HkU LJLLLLLL;
    public final List<IB3> LJLZ;
    public int LJZ;
    public int LJZI;
    public boolean LJZL;
    public boolean LL;
    public final List<C83489Wph> LLD;
    public EnumC83497Wpp LLF;
    public int LLFF;
    public int LLFFF;
    public String LLFII;
    public String LLFZ;
    public boolean LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final LifecycleOwner LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final ActivityC45651qj LLIIIJ;
    public final InterfaceC45540Hu4 LLIIIL;
    public final InterfaceC83513Wq5 LLIIIZ;
    public final InterfaceC83518WqA LLIIJI;
    public final InterfaceC45001HlN LLIIJLIL;
    public final InterfaceC83514Wq6 LLIIL;
    public final InterfaceC88472Yns<List<IB3>, C76800UCe> LLIILII;
    public final InterfaceC88472Yns<List<String>, C76800UCe> LLIILZL;
    public final InterfaceC88471Ynr<Long, String, C76800UCe> LLIIZ;
    public final boolean LLIL;
    public final InterfaceC88473Ynt<Effect, Handler, DialogInterface.OnDismissListener, Dialog> LLILII;
    public final C0IB<Boolean> LLILIL;
    public final InterfaceC88473Ynt<Effect, List<IB3>, List<IB3>, C76800UCe> LLILL;
    public final InterfaceC88474Ynu<Effect, String, String, Boolean, C76800UCe> LLILLIZIL;
    public final InterfaceC88473Ynt<Effect, String, IB3, C76800UCe> LLILLJJLI;
    public final InterfaceC83485Wpd LLILLL;
    public final TEZ LLILZ;
    public final InterfaceC83524WqG LLILZIL;
    public final InterfaceC65784Pro<Boolean> LLILZLL;
    public final ArrayList<IB3> LLIZ;
    public final boolean LLIZLLLIL;
    public final InterfaceC65784Pro<Boolean> LLJ;
    public final InterfaceC73997T2j LLJI;
    public final InterfaceC88472Yns<Effect, Boolean> LLJIJIL;
    public final InterfaceC88472Yns<Effect, C44946HkU> LLJILJIL;
    public final boolean LLJILJILJ;
    public final InterfaceC65784Pro<Boolean> LLJILLL;
    public final boolean LLJJ;
    public final InterfaceC65784Pro<String> LLJJI;
    public final boolean LLJJIII;
    public final InterfaceC65784Pro<C76800UCe> LLJJIJI;

    public UploadPicStickerARPresenter() {
        throw null;
    }

    @Override // X.InterfaceC87276YNc
    public final void LJ() {
    }

    @Override // X.TGM
    public final void LJI() {
    }

    @Override // X.ESP
    public final void LJIIJJI() {
        this.LJLLL = false;
        C83483Wpb c83483Wpb = this.LJLJLLL;
        if (c83483Wpb != null) {
            c83483Wpb.LIZLLL();
            c83483Wpb.LJIIIIZZ(null, true);
        }
        LJIJ();
    }

    public final C83492Wpk LJJ() {
        return (C83492Wpk) this.LLII.getValue();
    }

    public final C83493Wpl LJJI() {
        return (C83493Wpl) this.LLIFFJFJJ.getValue();
    }

    @Override // X.TGT
    public final void LLIIIL() {
        this.LJLLL = false;
        C83483Wpb c83483Wpb = this.LJLJLLL;
        if (c83483Wpb != null) {
            c83483Wpb.LIZLLL();
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    @Override // X.InterfaceC87276YNc
    public final void LIZIZ() {
        InterfaceC83485Wpd interfaceC83485Wpd = this.LLILLL;
        if (interfaceC83485Wpd != null) {
            interfaceC83485Wpd.LJJIIZ();
        }
    }

    @Override // X.InterfaceC87276YNc
    public final View LJFF() {
        View view = this.LJLILLLLZI;
        if (view != null) {
            return view;
        }
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.b0c, this.LLIIIJ.getLayoutInflater(), null);
        SmartImageView smartImageView = (SmartImageView) LLLZIIL.findViewById(R.id.ebm);
        W5F LJIIIIZZ = W5U.LJIIIIZZ("https://p16-amd-va.tiktokcdn.com/obj/musically-maliva-obj/ic_dynamic_greenscreen.png");
        LJIIIIZZ.LJIJJ = EnumC72807Shn.FIT_CENTER;
        LJIIIIZZ.LJJIIJ = smartImageView;
        C16880lQ.LLJJJ(LJIIIIZZ);
        this.LJLILLLLZI = LLLZIIL;
        return LLLZIIL;
    }

    @Override // X.InterfaceC87276YNc
    public final View LJIIIIZZ() {
        C83483Wpb c83483Wpb = this.LJLJLLL;
        if (c83483Wpb != null) {
            return c83483Wpb.LJIIJJI;
        }
        return null;
    }

    public final void LJIILIIL() {
        if (!this.LLD.isEmpty()) {
            Iterator it = ((ArrayList) this.LLD).iterator();
            while (it.hasNext()) {
                C83489Wph c83489Wph = (C83489Wph) it.next();
                C83483Wpb c83483Wpb = this.LJLJLLL;
                if (c83483Wpb != null) {
                    c83483Wpb.LIZ(c83489Wph);
                }
            }
            ((ArrayList) this.LLD).clear();
        }
    }

    public final void LJIJI() {
        C83489Wph c83489Wph = this.LJLJLJ;
        if (c83489Wph != null) {
            Integer valueOf = Integer.valueOf(c83489Wph.LJI);
            String str = "";
            if (valueOf != null) {
                if (valueOf.intValue() == 1) {
                    InterfaceC88474Ynu<Effect, String, String, Boolean, C76800UCe> interfaceC88474Ynu = this.LLILLIZIL;
                    Effect effect = this.LJLJL;
                    String LIZ = c83489Wph.LIZ();
                    if (LIZ == null) {
                        LIZ = "";
                    }
                    interfaceC88474Ynu.invoke(effect, LIZ, "", Boolean.FALSE);
                } else if (valueOf.intValue() == 3) {
                    InterfaceC88473Ynt<Effect, String, IB3, C76800UCe> interfaceC88473Ynt = this.LLILLJJLI;
                    Effect effect2 = this.LJLJL;
                    String LIZ2 = c83489Wph.LIZ();
                    if (LIZ2 != null) {
                        str = LIZ2;
                    }
                    interfaceC88473Ynt.invoke(effect2, str, new IB3("", 3, 0L, 56));
                }
            }
            this.LLFZ = "default";
        }
    }

    public final void LJJIIZ() {
        C44946HkU c44946HkU = this.LJLLLLLL;
        if (c44946HkU != null && c44946HkU.LJLJI) {
            C83484Wpc c83484Wpc = this.LJLJJLL;
            if (c83484Wpc != null) {
                c83484Wpc.LIZ(this.LJLJLLL, true);
                return;
            }
            return;
        }
        C83484Wpc c83484Wpc2 = this.LJLJJLL;
        if (c83484Wpc2 == null) {
            return;
        }
        c83484Wpc2.LIZ(this.LJLJLLL, false);
    }

    public final void LJJIIZI() {
        String str;
        int i;
        Boolean bool;
        C83483Wpb c83483Wpb = this.LJLJLLL;
        if (c83483Wpb != null) {
            this.LJLLL = true;
            C44946HkU c44946HkU = this.LJLLLLLL;
            String str2 = null;
            if (c44946HkU != null) {
                InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LLILZLL;
                if (interfaceC65784Pro != null) {
                    bool = interfaceC65784Pro.invoke();
                } else {
                    bool = null;
                }
                c44946HkU.LJLJJLL = bool;
            }
            boolean z = LLJJIJIIJIL;
            C44946HkU c44946HkU2 = this.LJLLLLLL;
            Effect effect = this.LJLJL;
            if (effect != null) {
                str2 = effect.getEffectId();
            }
            c83483Wpb.LJIIJJI(z, c44946HkU2, str2);
            C83493Wpl LJJI = LJJI();
            LJJI.LIZIZ();
            LJJI.LIZ = "pic";
            Effect effect2 = this.LJLJL;
            if (effect2 == null || (str = effect2.getEffectId()) == null) {
                str = "";
            }
            LJJI.LJIIIIZZ = str;
            LJJI.LIZIZ = System.currentTimeMillis();
            InterfaceC83485Wpd interfaceC83485Wpd = this.LLILLL;
            if (interfaceC83485Wpd != null) {
                i = interfaceC83485Wpd.LJJ();
            } else {
                i = -1;
            }
            LJJI.LJFF = i;
            if (C77413UZt.LJIILL(this.LJLL)) {
                LJJ().LIZ();
                LJJI().LJII = false;
                return;
            }
            LJJI().LJII = true;
            LJJI().LIZJ = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.LJLL);
            LJJIJ(arrayList);
        }
    }

    @Override // X.TGT
    public final void LLIIIZ() {
        C83483Wpb c83483Wpb;
        if (o.LJ(this.LLILZ.LLJJIJIIJIL(), this.LJLJL) && (c83483Wpb = this.LJLJLLL) != null) {
            this.LJLLL = true;
            C83483Wpb.LJIIL(c83483Wpb, LLJJIJIIJIL, this.LJLLLLLL, 4);
            if (C77413UZt.LJIILL(this.LJLL)) {
                LJJ().LIZ();
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.LJLL);
            LJJIJ(arrayList);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        C83483Wpb c83483Wpb = this.LJLJLLL;
        if (c83483Wpb != null) {
            c83483Wpb.LJIIIIZZ = true;
            c83483Wpb.LJII.dismiss();
        }
    }

    public final void LJIJ() {
        InterfaceC88473Ynt<Effect, List<IB3>, List<IB3>, C76800UCe> interfaceC88473Ynt;
        String effectId;
        C83492Wpk LJJ = LJJ();
        Effect effect = this.LJLJL;
        if (effect != null && (effectId = effect.getEffectId()) != null) {
            CastLongProtector.parseLong(effectId);
        }
        LJJ.LJII.LIZIZ();
        InterfaceC83500Wps interfaceC83500Wps = LJJ.LIZLLL;
        if (interfaceC83500Wps != null) {
            interfaceC83500Wps.LIZ();
        }
        LJJ().LJFF = null;
        LJIJI();
        if ((!((ArrayList) this.LJLZ).isEmpty()) && (interfaceC88473Ynt = this.LLILL) != null) {
            interfaceC88473Ynt.invoke(this.LJLJL, ORZ.LLJI(this.LJLZ), C61878OQg.INSTANCE);
        }
        this.LJLLI = false;
        this.LL = false;
        C83483Wpb c83483Wpb = this.LJLJLLL;
        if (c83483Wpb != null) {
            c83483Wpb.LJFF();
            c83483Wpb.LIZIZ();
        }
        this.LJLJLJ = null;
        this.LJLJL = null;
        InterfaceC83514Wq6 interfaceC83514Wq6 = this.LLIIL;
        if (interfaceC83514Wq6 != null) {
            interfaceC83514Wq6.LIZIZ();
        }
        ((ArrayList) this.LJLZ).clear();
        this.LLFZ = "default";
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        LJIJ();
        this.LJLL.clear();
        C83492Wpk LJJ = LJJ();
        LJJ.LIZIZ.quitSafely();
        IDHandlerS24S0100000_14 iDHandlerS24S0100000_14 = LJJ.LIZJ;
        Object obj = null;
        if (iDHandlerS24S0100000_14 != null) {
            iDHandlerS24S0100000_14.removeCallbacksAndMessages(null);
        }
        C79260V8u.LIZIZ = true;
        InterfaceC45540Hu4 interfaceC45540Hu4 = this.LLIIIL;
        if (interfaceC45540Hu4 == null) {
            Object obj2 = this.LLIIIJ;
            if (obj2 instanceof InterfaceC45540Hu4) {
                obj = obj2;
            }
            interfaceC45540Hu4 = (InterfaceC45540Hu4) obj;
            if (interfaceC45540Hu4 == null) {
                return;
            }
        }
        interfaceC45540Hu4.unRegisterActivityResultListener((InterfaceC144185lG) this.LLIIIILZ.getValue());
    }

    @Override // X.TGT
    public final boolean LLIIIJ() {
        return this.LJLLL;
    }

    public static IB3 LJIL(C83489Wph c83489Wph) {
        String str;
        if (c83489Wph != null && (str = c83489Wph.LIZIZ) != null) {
            int i = c83489Wph.LJI;
            String str2 = "";
            if (i != 1) {
                if (i == 3) {
                    String str3 = c83489Wph.LIZ;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    String str4 = c83489Wph.LJII;
                    if (str4 == null) {
                        str4 = "GIPHY";
                    }
                    String str5 = c83489Wph.LJIIIIZZ;
                    if (str5 == null) {
                        str5 = "media_tray";
                    }
                    return new IB3(3, str, str2, 0L, str4, str5);
                }
            } else {
                String str6 = c83489Wph.LIZ;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = c83489Wph.LJII;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = c83489Wph.LJIIIIZZ;
                if (str8 == null) {
                    str8 = "unknown";
                }
                return new IB3(1, str, str6, 0L, str7, str8);
            }
        }
        return null;
    }

    @Override // X.TGM
    public final void LIZ(View stickerView) {
        int i;
        boolean z;
        o.LJIIIZ(stickerView, "stickerView");
        ViewStubCompat viewStubCompat = (ViewStubCompat) stickerView.findViewById(R.id.kn2);
        if (viewStubCompat != null) {
            if (this.LLJILJILJ) {
                i = R.layout.dr3;
            } else {
                i = R.layout.dr2;
            }
            viewStubCompat.setLayoutResource(i);
            View LIZ = viewStubCompat.LIZ();
            if (LIZ != null) {
                View findViewById = stickerView.findViewById(R.id.flu);
                View findViewById2 = stickerView.findViewById(R.id.mbh);
                this.LLILZ.LJJIFFI();
                if (this.LLIZLLLIL) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJLJLLL = new C83483Wpb(LIZ, findViewById, findViewById2, z, LIZ.findViewById(R.id.df1), stickerView.findViewById(R.id.df1), LIZ.findViewById(R.id.df2), stickerView.findViewById(R.id.df2), (ViewGroup) stickerView.findViewById(R.id.g4a), this.LLJ, this.LLJILLL, this.LLIZLLLIL, this.LLIIIJ, this.LLILLL, new C83487Wpf(this, stickerView), this.LLJILJILJ, null, 131088);
                LJJIIZ();
            }
        }
        Effect effect = this.LJLJL;
        if (effect != null) {
            LJJII(effect);
        }
    }

    @Override // X.TGM
    public final void LIZJ(IDK state) {
        InterfaceC83485Wpd interfaceC83485Wpd;
        o.LJIIIZ(state, "state");
        boolean z = true;
        LLJJIJIIJIL = true;
        if (state == IDK.AFTER_ANIMATE && this.LJLJL != null) {
            if (this.LJLLL) {
                String invoke = this.LLJJI.invoke();
                C83483Wpb c83483Wpb = this.LJLJLLL;
                if (c83483Wpb != null && invoke.length() > 0) {
                    c83483Wpb.LJII(invoke);
                }
                C83483Wpb c83483Wpb2 = this.LJLJLLL;
                if (c83483Wpb2 != null) {
                    Effect effect = this.LJLJL;
                    o.LJI(effect);
                    String effectId = effect.getEffectId();
                    if (c83483Wpb2.LJIIJJI.getVisibility() == 0 && (interfaceC83485Wpd = c83483Wpb2.LJJIFFI) != null) {
                        if (c83483Wpb2.LJ.getVisibility() != 0) {
                            z = false;
                        }
                        interfaceC83485Wpd.LJJII(effectId, z);
                        return;
                    }
                    return;
                }
                return;
            }
            LJJIIZI();
        }
    }

    @Override // X.TGM
    public final void LJII(IDK state) {
        o.LJIIIZ(state, "state");
        LLJJIJIIJIL = false;
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        boolean z;
        C44946HkU LIZ;
        o.LJIIIZ(session, "session");
        if (C78886Uxe.LJJIJL(session.LIZ)) {
            return false;
        }
        Effect sticker = session.LIZ;
        o.LJIIIZ(sticker, "sticker");
        if (ID0.LJIILL(sticker)) {
            return false;
        }
        if (this.LLJIJIL.invoke(session.LIZ).booleanValue()) {
            LIZ = this.LLJILJIL.invoke(session.LIZ);
        } else {
            Effect effect = session.LIZ;
            if (this.LLILL != null) {
                z = true;
            } else {
                z = false;
            }
            LIZ = C79260V8u.LIZ(effect, z);
        }
        this.LJLLLLLL = LIZ;
        if (LIZ == null) {
            return false;
        }
        return LIZ.LJLILLLLZI;
    }

    public final void LJIILJJIL(IB3 ib3) {
        String LIZ;
        String str = null;
        if (ib3 != null) {
            str = ib3.LJLILLLLZI;
        }
        if (C44687HgJ.LIZIZ(str) && this.LJLJLJ != null) {
            InterfaceC83518WqA interfaceC83518WqA = this.LLIIJI;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            interfaceC83518WqA.LIZIZ(str);
            InterfaceC88473Ynt<Effect, String, IB3, C76800UCe> interfaceC88473Ynt = this.LLILLJJLI;
            Effect effect = this.LJLJL;
            C83489Wph c83489Wph = this.LJLJLJ;
            if (c83489Wph != null && (LIZ = c83489Wph.LIZ()) != null) {
                str2 = LIZ;
            }
            o.LJI(ib3);
            interfaceC88473Ynt.invoke(effect, str2, ib3);
            C83483Wpb c83483Wpb = this.LJLJLLL;
            if (c83483Wpb != null) {
                C83477WpV c83477WpV = c83483Wpb.LJI;
                c83477WpV.LJLLLLLL();
                c83477WpV.notifyDataSetChanged();
                View LIZJ = c83483Wpb.LIZJ();
                if (LIZJ != null) {
                    LIZJ.setAlpha(0.4f);
                }
                C46208IBo c46208IBo = this.LJLJJL;
                if (c46208IBo != null) {
                    c46208IBo.LIZ();
                }
            }
            this.LLFZ = "gif_mode";
            this.LJLLLL = false;
        }
    }

    public final void LJIILL(IB3 ib3) {
        String str;
        String str2;
        if (ib3 != null) {
            String str3 = ib3.LJLILLLLZI;
            if (C44687HgJ.LIZIZ(str3) && this.LJLJLJ != null) {
                String str4 = "";
                if (!ID0.LJIIIIZZ(this.LJLJL)) {
                    InterfaceC83518WqA interfaceC83518WqA = this.LLIIJI;
                    if (str3 == null) {
                        str2 = "";
                    } else {
                        str2 = str3;
                    }
                    interfaceC83518WqA.LIZIZ(str2);
                }
                InterfaceC88474Ynu<Effect, String, String, Boolean, C76800UCe> interfaceC88474Ynu = this.LLILLIZIL;
                Effect effect = this.LJLJL;
                C83489Wph c83489Wph = this.LJLJLJ;
                if (c83489Wph == null || (str = c83489Wph.LIZ()) == null) {
                    str = "";
                }
                if (str3 != null) {
                    str4 = str3;
                }
                interfaceC88474Ynu.invoke(effect, str, str4, Boolean.FALSE);
                InterfaceC88472Yns<List<String>, C76800UCe> interfaceC88472Yns = this.LLIILZL;
                if (interfaceC88472Yns != null) {
                    o.LJI(str3);
                    interfaceC88472Yns.invoke(C47261Igj.LJJIJ(str3));
                    this.LL = true;
                }
                ArrayList arrayList = (ArrayList) this.LJLZ;
                arrayList.clear();
                arrayList.add(ib3);
                this.LLFZ = "single_image";
                this.LJLLLL = true;
                InterfaceC88472Yns<List<IB3>, C76800UCe> interfaceC88472Yns2 = this.LLIILII;
                if (interfaceC88472Yns2 != null) {
                    interfaceC88472Yns2.invoke(this.LJLZ);
                }
            }
        }
    }

    public final void LJIILLIIL(List<IB3> list) {
        C83489Wph c83489Wph = this.LJLJLJ;
        if (c83489Wph != null) {
            this.LLIIJI.LIZIZ("");
            int i = 0;
            for (IB3 ib3 : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    IB3 ib32 = ib3;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(c83489Wph.LIZ());
                    LIZ.append(i2);
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    ib32.getClass();
                    o.LJIIIZ(LIZIZ, "<set-?>");
                    ib32.LJLIL = LIZIZ;
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            InterfaceC88473Ynt<Effect, List<IB3>, List<IB3>, C76800UCe> interfaceC88473Ynt = this.LLILL;
            if (interfaceC88473Ynt != null) {
                interfaceC88473Ynt.invoke(this.LJLJL, ORZ.LLJI(this.LJLZ), list);
            }
            InterfaceC88472Yns<List<String>, C76800UCe> interfaceC88472Yns = this.LLIILZL;
            if (interfaceC88472Yns != null) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                Iterator<IB3> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().LJLILLLLZI);
                }
                interfaceC88472Yns.invoke(arrayList);
                this.LL = true;
            }
            ArrayList arrayList2 = (ArrayList) this.LJLZ;
            arrayList2.clear();
            arrayList2.addAll(list);
            this.LLFZ = "multi_images";
            this.LJLLLL = true;
            InterfaceC88472Yns<List<IB3>, C76800UCe> interfaceC88472Yns2 = this.LLIILII;
            if (interfaceC88472Yns2 != null) {
                interfaceC88472Yns2.invoke(this.LJLZ);
            }
        }
    }

    public final void LJIIZILJ(List<IB3> list) {
        boolean z;
        int i;
        Object obj;
        this.LJLJLJ = LJIJJLI((IB3) ORZ.LJLLJ(list));
        C44946HkU c44946HkU = this.LJLLLLLL;
        if (c44946HkU != null && c44946HkU.LJLJI) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (z) {
            if (!list.isEmpty()) {
                int i2 = ((IB3) ORZ.LJLLJ(list)).LJLJJI;
                if (i2 != 1) {
                    if (i2 != 3) {
                        return;
                    }
                    LJJIIJZLJL((IB3) ORZ.LJLLJ(list));
                    return;
                }
                LJIILLIIL(list);
                C83483Wpb c83483Wpb = this.LJLJLLL;
                if (c83483Wpb != null) {
                    C83477WpV c83477WpV = c83483Wpb.LJI;
                    c83477WpV.LJLLLLLL();
                    for (IB3 ib3 : list) {
                        Iterator it = ((ArrayList) c83477WpV.LJLJJI).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (o.LJ(((C83489Wph) obj).LIZIZ, ib3.LJLILLLLZI)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        C83489Wph c83489Wph = (C83489Wph) obj;
                        if (c83489Wph == null) {
                            c83489Wph = new C83489Wph(ib3.LJLILLLLZI, "");
                            ListProtector.add(c83477WpV.LJLJJI, 0, c83489Wph);
                        }
                        int size = c83477WpV.LJLJJL.size() + 1;
                        c83477WpV.LJLJJL.put(c83489Wph, Integer.valueOf(size));
                        c83489Wph.LJIIIZ = size;
                    }
                    c83477WpV.notifyDataSetChanged();
                    int size2 = c83477WpV.LJLJJL.size();
                    C44946HkU c44946HkU2 = c83483Wpb.LIZ;
                    if (c44946HkU2 != null) {
                        i = c44946HkU2.LJLJJI;
                    } else {
                        i = 0;
                    }
                    if (size2 >= i) {
                        View LIZJ = c83483Wpb.LIZJ();
                        if (LIZJ != null) {
                            LIZJ.setAlpha(1.0f);
                        }
                    } else {
                        View LIZJ2 = c83483Wpb.LIZJ();
                        if (LIZJ2 != null) {
                            LIZJ2.setAlpha(0.4f);
                        }
                    }
                }
                this.LLFF = list.size();
                this.LLFFF = 0;
                LJJIIJ(false);
                return;
            }
            return;
        }
        if (!(!list.isEmpty())) {
            return;
        }
        int i3 = ((IB3) ORZ.LJLLJ(list)).LJLJJI;
        if (i3 != 1) {
            if (i3 != 3) {
                return;
            }
            LJJIIJZLJL((IB3) ORZ.LJLLJ(list));
            return;
        }
        IB3 ib32 = (IB3) ORZ.LJLLJ(list);
        LJIILL(ib32);
        C83483Wpb c83483Wpb2 = this.LJLJLLL;
        if (c83483Wpb2 != null) {
            c83483Wpb2.LJIILIIL();
            if (ib32 != null) {
                str = ib32.LJLILLLLZI;
            }
            c83483Wpb2.LJII(str);
        }
        this.LLFF = 1;
        this.LLFFF = 0;
        LJJIIJ(false);
    }

    public final C83489Wph LJIJJLI(IB3 ib3) {
        Integer num;
        C83489Wph c83489Wph;
        String effectId;
        String effectId2;
        if (ib3 != null) {
            num = Integer.valueOf(ib3.LJLJJI);
        } else {
            num = null;
        }
        String str = "";
        if (num == null) {
            return null;
        }
        if (num.intValue() == 1) {
            c83489Wph = new C83489Wph(ib3.LJLILLLLZI, "");
            c83489Wph.LJI = 1;
            c83489Wph.LJII = ib3.LJLJJLL;
            c83489Wph.LJIIIIZZ = ib3.LJLJL;
            c83489Wph.LIZ = ib3.LJLJJL;
            Effect effect = this.LJLJL;
            if (effect != null && (effectId2 = effect.getEffectId()) != null) {
                str = effectId2;
            }
            c83489Wph.LIZLLL = str;
            Effect effect2 = this.LJLJL;
            if (effect2 != null) {
                LJIJJ(effect2, c83489Wph, null);
            }
        } else {
            if (num.intValue() != 3) {
                return null;
            }
            c83489Wph = new C83489Wph(ib3.LJLILLLLZI, "");
            c83489Wph.LJI = 3;
            c83489Wph.LJII = ib3.LJLJJLL;
            c83489Wph.LJIIIIZZ = ib3.LJLJL;
            c83489Wph.LIZ = ib3.LJLJJL;
            Effect effect3 = this.LJLJL;
            if (effect3 != null && (effectId = effect3.getEffectId()) != null) {
                str = effectId;
            }
            c83489Wph.LIZLLL = str;
            Effect effect4 = this.LJLJL;
            if (effect4 != null) {
                LJIJJ(effect4, c83489Wph, null);
            }
        }
        return c83489Wph;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0101, code lost:
    
        if (r1 != null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(int r7) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter.LJJIFFI(int):void");
    }

    public final void LJJII(Effect effect) {
        Boolean bool;
        C83483Wpb c83483Wpb = this.LJLJLLL;
        if (c83483Wpb != null) {
            c83483Wpb.LJIIIIZZ(this.LJLJL, false);
        }
        InterfaceC88473Ynt<Effect, Handler, DialogInterface.OnDismissListener, Dialog> interfaceC88473Ynt = this.LLILII;
        if (interfaceC88473Ynt != null) {
            if (this.LLIIIJ.isFinishing()) {
                bool = Boolean.FALSE;
            } else {
                IDHandlerS24S0100000_14 iDHandlerS24S0100000_14 = LJJ().LIZJ;
                o.LJI(iDHandlerS24S0100000_14);
                Dialog invoke = interfaceC88473Ynt.invoke(effect, iDHandlerS24S0100000_14, new IDDListenerS153S0100000_14(this, 0));
                if (invoke != null && !this.LLIIIJ.isFinishing()) {
                    try {
                        C16880lQ.LIZ(invoke);
                        bool = Boolean.TRUE;
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                bool = Boolean.FALSE;
            }
            if (bool != null) {
                if (bool.booleanValue()) {
                    C83483Wpb c83483Wpb2 = this.LJLJLLL;
                    if (c83483Wpb2 != null) {
                        c83483Wpb2.LIZLLL();
                        return;
                    }
                    return;
                }
                LJJIIZI();
                return;
            }
        }
        LJJIIZI();
    }

    public final boolean LJJIII(Effect effect) {
        Effect effect2;
        if (effect == null || (effect2 = this.LJLJL) == null) {
            return false;
        }
        return o.LJ(effect2.getEffectId(), effect.getEffectId());
    }

    public final void LJJIIJ(boolean z) {
        if (z) {
            Effect effect = this.LJLJL;
            if (effect != null) {
                String name = this.LLF.name();
                Locale locale = Locale.getDefault();
                o.LJIIIIZZ(locale, "Locale.getDefault()");
                if (name != null) {
                    String lowerCase = name.toLowerCase(locale);
                    o.LJIIIIZZ(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    IBL ibl = new IBL(effect, lowerCase, this.LLFII, "", "");
                    IB6 ib6 = this.LJLJJI;
                    if (ib6 != null) {
                        ib6.LIZ(ibl);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
        } else {
            Effect effect2 = this.LJLJL;
            if (effect2 != null) {
                String name2 = this.LLF.name();
                Locale locale2 = Locale.getDefault();
                o.LJIIIIZZ(locale2, "Locale.getDefault()");
                if (name2 != null) {
                    String lowerCase2 = name2.toLowerCase(locale2);
                    o.LJIIIIZZ(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                    IBL ibl2 = new IBL(effect2, lowerCase2, this.LLFII, String.valueOf(this.LLFF), String.valueOf(this.LLFFF));
                    IB6 ib62 = this.LJLJJI;
                    if (ib62 != null) {
                        ib62.LIZIZ(ibl2);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
        this.LLF = EnumC83497Wpp.DEFAULT;
        this.LLFF = 0;
        this.LLFFF = 0;
    }

    public final void LJJIIJZLJL(IB3 ib3) {
        String str;
        String str2;
        LJIILJJIL(ib3);
        C83483Wpb c83483Wpb = this.LJLJLLL;
        String str3 = null;
        if (c83483Wpb != null) {
            c83483Wpb.LJIILIIL();
            if (ib3 != null) {
                str2 = ib3.LJLILLLLZI;
            } else {
                str2 = null;
            }
            c83483Wpb.LJII(str2);
        }
        InterfaceC83485Wpd interfaceC83485Wpd = this.LLILLL;
        if (interfaceC83485Wpd != null) {
            C83489Wph c83489Wph = this.LJLJLJ;
            if (c83489Wph != null) {
                str = c83489Wph.LIZ;
                str3 = c83489Wph.LIZLLL;
            } else {
                str = null;
            }
            interfaceC83485Wpd.LJJIFFI(str, str3, "giphy_tab");
        }
        this.LLFF = 0;
        this.LLFFF = 1;
        LJJIIJ(false);
    }

    public final void LJJIJ(List<String> list) {
        C83489Wph c83489Wph;
        int i;
        InterfaceC83485Wpd interfaceC83485Wpd;
        int i2;
        IB3 ib3;
        Integer valueOf;
        String LIZ;
        String LIZ2;
        C83483Wpb c83483Wpb;
        if (this.LJLLI || list.isEmpty() || (c83489Wph = this.LJLJLJ) == null) {
            return;
        }
        String str = null;
        if (c83489Wph.LJ.getPl().getAlg().isEmpty() || !C77275UUl.LJIIIIZZ(2, 3, 0).contains(Integer.valueOf(c83489Wph.LJ.getPl().getAlbumFilter()))) {
            if (this.LLJJ && (c83483Wpb = this.LJLJLLL) != null) {
                c83483Wpb.LIZIZ();
            }
            C83483Wpb c83483Wpb2 = this.LJLJLLL;
            if (c83483Wpb2 != null && ((ArrayList) c83483Wpb2.LJI.LJLJJI).size() == 0 && !C77413UZt.LJIILL(this.LJLL)) {
                int size = this.LJLL.size();
                ArrayList<IB3> arrayList = this.LLIZ;
                if (arrayList != null) {
                    i2 = arrayList.size();
                } else {
                    i2 = 0;
                }
                ArrayList arrayList2 = new ArrayList(size + i2);
                ArrayList<IB3> arrayList3 = this.LLIZ;
                String str2 = "";
                if (arrayList3 != null) {
                    Iterator<IB3> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        IB3 next = it.next();
                        C83489Wph c83489Wph2 = new C83489Wph(next.LJLILLLLZI, "");
                        c83489Wph2.LJI = 3;
                        c83489Wph2.LIZ = next.LJLJJL;
                        c83489Wph2.LJII = next.LJLJJLL;
                        arrayList2.add(c83489Wph2);
                    }
                }
                Iterator<String> it2 = this.LJLL.iterator();
                while (it2.hasNext()) {
                    String path = it2.next();
                    o.LJIIIIZZ(path, "path");
                    arrayList2.add(new C83489Wph(path, ""));
                }
                C83483Wpb c83483Wpb3 = this.LJLJLLL;
                if (c83483Wpb3 != null) {
                    c83483Wpb3.LJIIIZ(arrayList2);
                }
                if (C77413UZt.LJJ(this.LLIZ)) {
                    this.LLFII = "giphy";
                    ArrayList<IB3> arrayList4 = this.LLIZ;
                    if (arrayList4 != null) {
                        ib3 = (IB3) ORZ.LJLLJ(arrayList4);
                    } else {
                        ib3 = null;
                    }
                    C83483Wpb c83483Wpb4 = this.LJLJLLL;
                    if (c83483Wpb4 != null) {
                        if (ib3 != null) {
                            str = ib3.LJLILLLLZI;
                        }
                        c83483Wpb4.LJII(str);
                    }
                    this.LJLJLJ = LJIJJLI(ib3);
                    if (ib3 != null && (valueOf = Integer.valueOf(ib3.LJLJJI)) != null) {
                        if (valueOf.intValue() == 1) {
                            InterfaceC88474Ynu<Effect, String, String, Boolean, C76800UCe> interfaceC88474Ynu = this.LLILLIZIL;
                            Effect effect = this.LJLJL;
                            C83489Wph c83489Wph3 = this.LJLJLJ;
                            if (c83489Wph3 != null && (LIZ2 = c83489Wph3.LIZ()) != null) {
                                str2 = LIZ2;
                            }
                            interfaceC88474Ynu.invoke(effect, str2, ib3.LJLILLLLZI, Boolean.FALSE);
                            this.LLFZ = "single_image";
                        } else if (valueOf.intValue() == 3) {
                            InterfaceC88473Ynt<Effect, String, IB3, C76800UCe> interfaceC88473Ynt = this.LLILLJJLI;
                            Effect effect2 = this.LJLJL;
                            C83489Wph c83489Wph4 = this.LJLJLJ;
                            if (c83489Wph4 != null && (LIZ = c83489Wph4.LIZ()) != null) {
                                str2 = LIZ;
                            }
                            interfaceC88473Ynt.invoke(effect2, str2, ib3);
                            this.LLFZ = "gif_mode";
                        }
                    }
                }
            }
            this.LJLLI = true;
            C83483Wpb c83483Wpb5 = this.LJLJLLL;
            if (c83483Wpb5 != null) {
                c83483Wpb5.LJFF();
            }
            String invoke = this.LLJJI.invoke();
            C83483Wpb c83483Wpb6 = this.LJLJLLL;
            if (c83483Wpb6 != null && invoke.length() > 0) {
                c83483Wpb6.LJII(invoke);
            }
            C83493Wpl LJJI = LJJI();
            LJJI.LJIIJ = false;
            C83483Wpb c83483Wpb7 = this.LJLJLLL;
            if (c83483Wpb7 != null) {
                i = ((ArrayList) c83483Wpb7.LJI.LJLJJI).size();
            } else {
                i = -1;
            }
            LJJI.LJI = i;
            LJJI.LIZLLL = System.currentTimeMillis();
            if (LJJI.LIZJ() && (interfaceC83485Wpd = this.LLILLL) != null) {
                interfaceC83485Wpd.LJIJ(LJJI.LIZ());
            }
            LJJI.LIZIZ();
            return;
        }
        LJJI().LJIIJ = true;
        C83483Wpb c83483Wpb8 = this.LJLJLLL;
        if (c83483Wpb8 != null) {
            C83477WpV c83477WpV = c83483Wpb8.LJI;
            C169546l4 c169546l4 = c83477WpV.LJLJLLL;
            if (c169546l4 != null) {
                ObjectAnimator objectAnimator = c169546l4.LJLIL;
                if (objectAnimator != null) {
                    objectAnimator.start();
                }
                View itemView = c169546l4.itemView;
                o.LJIIIIZZ(itemView, "itemView");
                ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
                View itemView2 = c169546l4.itemView;
                o.LJIIIIZZ(itemView2, "itemView");
                Context context = itemView2.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                layoutParams.height = (int) C74275TDb.LIZIZ(context, 50.0f);
                View itemView3 = c169546l4.itemView;
                o.LJIIIIZZ(itemView3, "itemView");
                Context context2 = itemView3.getContext();
                o.LJIIIIZZ(context2, "itemView.context");
                layoutParams.width = (int) C74275TDb.LIZIZ(context2, 50.0f);
                View itemView4 = c169546l4.itemView;
                o.LJIIIIZZ(itemView4, "itemView");
                itemView4.setLayoutParams(layoutParams);
                View itemView5 = c169546l4.itemView;
                o.LJIIIIZZ(itemView5, "itemView");
                itemView5.setVisibility(0);
            }
            c83477WpV.notifyDataSetChanged();
        }
        C83492Wpk LJJ = LJJ();
        LJJ.getClass();
        if (list.isEmpty() || c83489Wph.LJ.getPl().getAlg().isEmpty()) {
            InterfaceC83500Wps interfaceC83500Wps = LJJ.LIZLLL;
            if (interfaceC83500Wps == null) {
                return;
            }
            interfaceC83500Wps.LIZLLL();
            return;
        }
        LJJ.LJFF = null;
        IDHandlerS24S0100000_14 iDHandlerS24S0100000_14 = LJJ.LIZJ;
        if (iDHandlerS24S0100000_14 != null) {
            iDHandlerS24S0100000_14.removeCallbacksAndMessages(null);
        }
        IDHandlerS24S0100000_14 iDHandlerS24S0100000_142 = LJJ.LIZ;
        if (iDHandlerS24S0100000_142 != null) {
            iDHandlerS24S0100000_142.removeCallbacksAndMessages(null);
            LJJ.LJFF = (String) ORZ.LLFF(list);
            LJJ.LJ = c83489Wph.LIZLLL;
            Message message = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("img_list", (ArrayList) list);
            bundle.putParcelable("effect_sdk_extra", c83489Wph.LJ);
            o.LJIIIIZZ(message, "message");
            message.setData(bundle);
            message.what = 1004;
            IDHandlerS24S0100000_14 iDHandlerS24S0100000_143 = LJJ.LIZ;
            if (iDHandlerS24S0100000_143 != null) {
                iDHandlerS24S0100000_143.sendMessage(message);
                return;
            } else {
                o.LJIJI("workHandler");
                throw null;
            }
        }
        o.LJIJI("workHandler");
        throw null;
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        C83515Wq7.LIZ = new AqS161S0200000_14(this, session, 20);
        CountDownTimerC83512Wq4 countDownTimerC83512Wq4 = C83515Wq7.LIZIZ;
        countDownTimerC83512Wq4.cancel();
        countDownTimerC83512Wq4.start();
        this.LJLLL = true;
    }

    public final void LJIJJ(Effect effect, C83489Wph c83489Wph, Bundle bundle) {
        String string;
        String extra;
        if (!(!C77413UZt.LJIILL(c83489Wph.LJ.getPl().getAlg()))) {
            if (effect != null) {
                c83489Wph.LIZIZ(effect.getSdkExtra());
            }
            C79260V8u.LIZJ = c83489Wph.LJ.getPl().getGuide();
            C79260V8u.LIZIZ = c83489Wph.LJ.getPl().getLoading();
        }
        String str = null;
        if (effect != null) {
            str = effect.getEffectId();
        }
        c83489Wph.LIZLLL = str;
        if (effect != null && (extra = effect.getExtra()) != null) {
            try {
                c83489Wph.LJIILJJIL = new JSONObject(extra).optString("effect_algorithm_hint");
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (bundle != null && (string = bundle.getString("green_screen_kit_image_path")) != null) {
            c83489Wph.LIZIZ = string;
            this.LLI = true;
        }
    }

    @Override // X.InterfaceC81397Vx3
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        boolean z;
        C44946HkU c44946HkU = this.LJLLLLLL;
        if (c44946HkU != null && c44946HkU.LJLJI) {
            z = true;
        } else {
            z = false;
        }
        if ((i == 31 || i == 30) && !z) {
            LiveData liveData = (LiveData) ((UploadPicStickerMessageModule) this.LJLJI.get(UploadPicStickerMessageModule.class)).LJLIL.getValue();
            o.LJI(str);
            liveData.postValue(new C83516Wq8(i, str));
        }
        if (this.LLIL && i == 41) {
            o.LJI(str);
            C83516Wq8 c83516Wq8 = new C83516Wq8(i, str);
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optString("interface").equals("media_picker")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("body");
                o.LJIIIIZZ(optJSONObject, "jsonObj.optJSONObject(KEY_BODY)");
                String optString = optJSONObject.optString("command");
                o.LJIIIIZZ(optString, "body.optString(KEY_COMMAND)");
                String optString2 = optJSONObject.optString("style");
                o.LJIIIIZZ(optString2, "body.optString(KEY_STYLE)");
                if (optString.equals(GG4.SHOW.getValue()) && optString2.equals(EnumC79463VGp.ALBUM.getValue())) {
                    LJJIFFI(10001);
                    ((LiveData) ((UploadPicStickerMessageModule) this.LJLJI.get(UploadPicStickerMessageModule.class)).LJLIL.getValue()).postValue(c83516Wq8);
                }
            }
        }
    }

    public UploadPicStickerARPresenter(C29S activity, InterfaceC45540Hu4 interfaceC45540Hu4, C83534WqQ c83534WqQ, InterfaceC83518WqA uploadPicStickerListener, InterfaceC83517Wq9 interfaceC83517Wq9, InterfaceC45001HlN interfaceC45001HlN, IBV ibv, AqS173S0100000_7 aqS173S0100000_7, InterfaceC88471Ynr interfaceC88471Ynr, boolean z, IDqS432S0100000_7 iDqS432S0100000_7, IDqS432S0100000_7 iDqS432S0100000_72, InterfaceC88474Ynu interfaceC88474Ynu, InterfaceC88473Ynt doAnimateGiphyGifToPreview, C74577TOr c74577TOr, LiveData urlPrefixLiveData, TEZ stickerDataManager, InterfaceC83524WqG interfaceC83524WqG, ArrayList arrayList, T4E t4e, C44383HbP c44383HbP, IBQ ibq, boolean z2, AqS157S0100000_7 aqS157S0100000_7, boolean z3, WM7 wm7, AqS157S0100000_7 aqS157S0100000_72, int i, int i2) {
        C34365DeD isShowStickerComplianceTips;
        C34366DeE needSetParentBackGround;
        LifecycleOwner lifecycleOwner;
        ViewModelProvider of;
        IBV ibv2 = ibv;
        InterfaceC88471Ynr interfaceC88471Ynr2 = interfaceC88471Ynr;
        AqS173S0100000_7 aqS173S0100000_72 = aqS173S0100000_7;
        boolean z4 = z;
        InterfaceC88472Yns<Effect, Boolean> isTemplateEffect = c44383HbP;
        ArrayList arrayList2 = arrayList;
        InterfaceC83524WqG interfaceC83524WqG2 = interfaceC83524WqG;
        IDqS432S0100000_7 iDqS432S0100000_73 = iDqS432S0100000_7;
        AqS157S0100000_7 aqS157S0100000_73 = aqS157S0100000_72;
        T4E t4e2 = t4e;
        boolean z5 = z2;
        IDqS432S0100000_7 iDqS432S0100000_74 = iDqS432S0100000_72;
        InterfaceC88472Yns<Effect, C44946HkU> templateGetSdkInfo = ibq;
        InterfaceC65784Pro<String> curGreenScreenMaterialPath = aqS157S0100000_7;
        boolean z6 = z3;
        WM7 wm72 = wm7;
        InterfaceC45540Hu4 interfaceC45540Hu42 = (i & 2) != 0 ? null : interfaceC45540Hu4;
        ibv2 = (i & 64) != 0 ? null : ibv2;
        aqS173S0100000_72 = (i & 256) != 0 ? null : aqS173S0100000_72;
        interfaceC88471Ynr2 = (i & 512) != 0 ? null : interfaceC88471Ynr2;
        z4 = (i & 1024) != 0 ? false : z4;
        iDqS432S0100000_73 = (i & 2048) != 0 ? null : iDqS432S0100000_73;
        iDqS432S0100000_74 = (i & FileUtils.BUFFER_SIZE) != 0 ? null : iDqS432S0100000_74;
        interfaceC83524WqG2 = (524288 & i) != 0 ? null : interfaceC83524WqG2;
        arrayList2 = (2097152 & i) != 0 ? null : arrayList2;
        if ((8388608 & i) != 0) {
            isShowStickerComplianceTips = C34365DeD.LJLIL;
        } else {
            isShowStickerComplianceTips = null;
        }
        t4e2 = (16777216 & i) != 0 ? null : t4e2;
        isTemplateEffect = (33554432 & i) != 0 ? E8X.LJLIL : isTemplateEffect;
        templateGetSdkInfo = (67108864 & i) != 0 ? C83532WqO.LJLIL : templateGetSdkInfo;
        z5 = (134217728 & i) != 0 ? false : z5;
        if ((268435456 & i) != 0) {
            needSetParentBackGround = C34366DeE.LJLIL;
        } else {
            needSetParentBackGround = null;
        }
        curGreenScreenMaterialPath = (1073741824 & i) != 0 ? C83521WqD.LJLIL : curGreenScreenMaterialPath;
        z6 = (i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? false : z6;
        wm72 = (i2 & 1) != 0 ? null : wm72;
        aqS157S0100000_73 = (i2 & 2) != 0 ? null : aqS157S0100000_73;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uploadPicStickerListener, "uploadPicStickerListener");
        o.LJIIIZ(doAnimateGiphyGifToPreview, "doAnimateGiphyGifToPreview");
        o.LJIIIZ(urlPrefixLiveData, "urlPrefixLiveData");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(isShowStickerComplianceTips, "isShowStickerComplianceTips");
        o.LJIIIZ(isTemplateEffect, "isTemplateEffect");
        o.LJIIIZ(templateGetSdkInfo, "templateGetSdkInfo");
        o.LJIIIZ(needSetParentBackGround, "needSetParentBackGround");
        o.LJIIIZ(curGreenScreenMaterialPath, "curGreenScreenMaterialPath");
        this.LLIIIJ = activity;
        this.LLIIIL = interfaceC45540Hu42;
        this.LLIIIZ = c83534WqQ;
        this.LLIIJI = uploadPicStickerListener;
        this.LLIIJLIL = interfaceC45001HlN;
        this.LLIIL = ibv2;
        this.LLIILII = null;
        this.LLIILZL = aqS173S0100000_72;
        this.LLIIZ = interfaceC88471Ynr2;
        this.LLIL = z4;
        this.LLILII = iDqS432S0100000_73;
        this.LLILIL = null;
        this.LLILL = iDqS432S0100000_74;
        this.LLILLIZIL = interfaceC88474Ynu;
        this.LLILLJJLI = doAnimateGiphyGifToPreview;
        this.LLILLL = c74577TOr;
        this.LLILZ = stickerDataManager;
        this.LLILZIL = interfaceC83524WqG2;
        this.LLILZLL = null;
        this.LLIZ = arrayList2;
        this.LLIZLLLIL = false;
        this.LLJ = isShowStickerComplianceTips;
        this.LLJI = t4e2;
        this.LLJIJIL = isTemplateEffect;
        this.LLJILJIL = templateGetSdkInfo;
        this.LLJILJILJ = z5;
        this.LLJILLL = needSetParentBackGround;
        this.LLJJ = false;
        this.LLJJI = curGreenScreenMaterialPath;
        this.LLJJIII = z6;
        this.LLJJIJI = aqS157S0100000_73;
        this.LJLJLJ = new C83489Wph();
        this.LJLL = new ArrayList<>();
        this.LJLLJ = System.currentTimeMillis();
        this.LJLZ = new ArrayList();
        this.LJZ = 2;
        this.LJZI = 5;
        this.LJZL = true;
        this.LLD = new ArrayList();
        this.LLF = EnumC83497Wpp.DEFAULT;
        this.LLFII = "";
        this.LLFZ = "default";
        this.LLIFFJFJJ = C221108m2.LIZIZ(C83520WqC.LJLIL);
        this.LLII = C221108m2.LIZIZ(new AqS164S0100000_14(this, 386));
        if (wm72 != null) {
            lifecycleOwner = wm72;
        } else {
            lifecycleOwner = activity;
        }
        this.LLIIII = lifecycleOwner;
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 385));
        lifecycleOwner.getLifecycle().addObserver(this);
        if (wm72 != null) {
            of = C165706es.LJIIIIZZ(wm72, null, null, 6);
        } else {
            of = ViewModelProviders.of(activity);
            o.LJIIIIZZ(of, "ViewModelProviders.of(activity)");
        }
        this.LJLJI = of;
        ViewModel viewModel = of.get(UploadPicStickerMessageModule.class);
        o.LJIIIIZZ(viewModel, "viewModelProvider.get(Up…essageModule::class.java)");
        UploadPicStickerMessageModule uploadPicStickerMessageModule = (UploadPicStickerMessageModule) viewModel;
        uploadPicStickerMessageModule.gv0().observe(lifecycleOwner, new AObserverS82S0100000_14(this, 63));
        if (C79260V8u.LIZIZ) {
            ((LiveData) uploadPicStickerMessageModule.LJLIL.getValue()).observe(lifecycleOwner, new AObserverS82S0100000_14(this, 64));
        }
        urlPrefixLiveData.observe(lifecycleOwner, C53785L8z.LJLIL);
    }
}
