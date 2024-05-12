package com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.view;

import X.C105134Ar;
import X.C110614Vt;
import X.C111154Xv;
import X.C111164Xw;
import X.C16880lQ;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C33Q;
import X.C3C8;
import X.C44H;
import X.C4BS;
import X.C4D6;
import X.C4D7;
import X.C4D8;
import X.C4DR;
import X.C4E5;
import X.C4EF;
import X.C4EQ;
import X.C4Y9;
import X.C4YG;
import X.C56412MCa;
import X.C57082Lw;
import X.C57702Og;
import X.C61328O5c;
import X.C63078OpG;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78555UsJ;
import X.C78685UuP;
import X.C78926UyI;
import X.C79234V7u;
import X.C8VV;
import X.C8YN;
import X.C8YZ;
import X.C96963rI;
import X.C97273rn;
import X.C97313rr;
import X.C99033ud;
import X.C99883w0;
import X.C9BD;
import X.C9BE;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC65350Pko;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBT;
import X.TBW;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS36S0200000_1;
import Y.AObserverS69S0100000_1;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.voice2text.vm.TakoSpeechViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.AqS120S0300000_1;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS164S0200000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.AqS90S0300000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TakoInputView extends InputView implements KPL {
    public static final /* synthetic */ int LLJJ = 0;
    public final WeakReference<Fragment> LLIZLLLIL;
    public final View LLJ;
    public TuxIconView LLJI;
    public TuxIconView LLJIJIL;
    public TakoSpeechViewModel LLJILJIL;
    public C111164Xw LLJILJILJ;
    public C4EF LLJILLL;

    public TakoInputView() {
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView
    public final boolean LJIL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView
    public final boolean LJJ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView
    public final boolean LJJI() {
        return false;
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView, com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public /* bridge */ /* synthetic */ void onResume() {
        C105134Ar.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView, com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public /* bridge */ /* synthetic */ void onStop() {
        C105134Ar.LIZLLL(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJ() {
        /*
            r6 = this;
            X.3ud r5 = r6.LJLZ
            X.4Xw r4 = r6.LLJILJILJ
            r3 = 0
            if (r4 == 0) goto L2c
            X.4EQ r0 = r4.LIZIZ
        L9:
            X.4EQ r2 = X.C4EQ.DEFAULT_INPUT
            java.lang.String r1 = "input"
            if (r0 == r2) goto L17
            if (r4 == 0) goto L13
            X.4EQ r3 = r4.LIZIZ
        L13:
            X.4EQ r0 = X.C4EQ.INPUTTING
            if (r3 != r0) goto L2a
        L17:
            java.lang.String r0 = "not_switch"
        L19:
            X.C4D6.LIZ(r5, r1, r0)
            X.4Xw r1 = r6.LLJILJILJ
            if (r1 == 0) goto L24
            r0 = 0
            r1.LJ(r2, r0)
        L24:
            X.C63078OpG.LJLIL = r2
            r6.LJIIZILJ()
            return
        L2a:
            r0 = r1
            goto L19
        L2c:
            r0 = r3
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.view.TakoInputView.LJJJJ():void");
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.LJZI.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
        return lifecycle;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView, com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    public final void onPause() {
        if (((Boolean) C4Y9.LIZIZ.getValue()).booleanValue()) {
            TakoSpeechViewModel takoSpeechViewModel = this.LLJILJIL;
            if (takoSpeechViewModel != null && takoSpeechViewModel.getState().LJLIL) {
                C4D6.LIZIZ(this.LJLZ, "passive");
            }
            TakoSpeechViewModel takoSpeechViewModel2 = this.LLJILJIL;
            if (takoSpeechViewModel2 != null) {
                takoSpeechViewModel2.kv0();
            }
        }
        if (C4Y9.LIZ()) {
            C4EF c4ef = this.LLJILLL;
            if (c4ef != null) {
                c4ef.LIZ(false);
            }
            C4EF c4ef2 = this.LLJILLL;
            if (c4ef2 != null) {
                c4ef2.setState(C4E5.INITIATE);
            }
        }
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void LJIILIIL() {
        String str;
        Editable text;
        if (C44H.LIZ()) {
            C4YG c4yg = this.LJLILLLLZI;
            if (c4yg != null && (text = c4yg.getText()) != null) {
                str = text.toString();
            } else {
                str = null;
            }
            if (!LJIJJLI(str)) {
                C97313rr LJIIIIZZ = C96963rI.LJIIIIZZ();
                Map LIZJ = C99883w0.LIZJ(this.LJLZ);
                LJIIIIZZ.getClass();
                C97313rr.LIZ(LIZJ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView
    public final int LJJIFFI() {
        if (C4Y9.LIZ()) {
            return R.layout.b7i;
        }
        if (C4Y9.LIZIZ()) {
            return R.layout.b7k;
        }
        return R.layout.b7j;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView, com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    public final boolean onBackPressed() {
        String str;
        C96963rI.LIZIZ().getClass();
        if (C97273rn.LIZ()) {
            String enterFromForMob = this.LJLZ.getEnterFromForMob();
            String enterMethod = this.LJLZ.getEnterMethod();
            String groupId = this.LJLZ.getGroupId();
            String conversationId = this.LJLZ.getConversationId();
            String searchId = this.LJLZ.getSearchId();
            if (((Number) C4DR.LIZ.getValue()).intValue() == 1) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            C99883w0.LJFF(enterFromForMob, enterMethod, groupId, conversationId, searchId, "slide_right", str);
        }
        return super.onBackPressed();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView, X.InterfaceC105124Aq
    public final void vb() {
        C78555UsJ.LJJJJ();
        super.vb();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView, com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final C4BS LIZLLL(C4BS c4bs) {
        c4bs.LJ.LJFF = false;
        return c4bs;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView, com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void LJII(ViewGroup viewGroup) {
        C214298b3 c214298b3;
        TuxIconView tuxIconView;
        C111164Xw c111164Xw;
        C214298b3 c214298b32;
        super.LJII(viewGroup);
        if (((Boolean) C4Y9.LIZIZ.getValue()).booleanValue()) {
            TuxIconView tuxIconView2 = this.LJLJI;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(8);
            }
            this.LJLJI = null;
            this.LLJI = (TuxIconView) viewGroup.findViewById(R.id.gil);
            View inputArea = viewGroup.findViewById(R.id.eok);
            if (C4Y9.LIZIZ()) {
                Fragment LJIIIZ = C79234V7u.LJIIIZ(this.LJLLLLLL);
                if (LJIIIZ != null) {
                    C9BE c9be = C9BE.LIZ;
                    C65776Prg LIZ = C65352Pkq.LIZ(TakoSpeechViewModel.class);
                    AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 773);
                    C4D7 c4d7 = C4D7.INSTANCE;
                    if (o.LJ(c9be, C9BD.LIZ)) {
                        c214298b32 = new C214298b3(aqS151S0100000_1, C214528bQ.LJLIL, C78926UyI.LJJII(LJIIIZ, true), C78926UyI.LJJIIJZLJL(LJIIIZ, true), C184077Kh.LJLIL, C78926UyI.LJJ(LJIIIZ, true), C78926UyI.LJIILLIIL(LJIIIZ, true), c4d7, LIZ);
                    } else if (c9be == null || o.LJ(c9be, c9be)) {
                        c214298b32 = new C214298b3(aqS151S0100000_1, C214528bQ.LJLIL, C78926UyI.LJJII(LJIIIZ, false), C78926UyI.LJJIIJZLJL(LJIIIZ, false), C184077Kh.LJLIL, C78926UyI.LJJ(LJIIIZ, false), C78926UyI.LJIILLIIL(LJIIIZ, false), c4d7, LIZ);
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    this.LLJILJIL = (TakoSpeechViewModel) c214298b32.getValue();
                    C8VV.LIZ(LJIIIZ, false, new AqS132S0200000_1(LJIIIZ, this, 38));
                }
                TuxIconView tuxIconView3 = this.LLJI;
                if (tuxIconView3 != null) {
                    tuxIconView3.setVisibility(0);
                    C16880lQ.LJJJ(tuxIconView3, new ACListenerS36S0200000_1(this, tuxIconView3, 14));
                }
                TuxIconView tuxIconView4 = (TuxIconView) this.LJLLLLLL.findViewById(R.id.fe1);
                C16880lQ.LJJJ(tuxIconView4, new ACListenerS21S0100000_1(this, 126));
                this.LLJIJIL = tuxIconView4;
            } else {
                TuxIconView tuxIconView5 = this.LLJI;
                if (tuxIconView5 != null) {
                    C16880lQ.LJJJ(tuxIconView5, new ACListenerS21S0100000_1(this, 130));
                }
                C4EF c4ef = (C4EF) this.LJLLLLLL.findViewById(R.id.e8f);
                c4ef.setKeyboardEntranceClickCallback(new AqS151S0100000_1(this, 775));
                c4ef.setSessionInfo(this.LJLZ);
                this.LLJILLL = c4ef;
                Fragment LJIIIZ2 = C79234V7u.LJIIIZ(this.LJLLLLLL);
                if (LJIIIZ2 != null) {
                    C9BE c9be2 = C9BE.LIZ;
                    C65776Prg LIZ2 = C65352Pkq.LIZ(TakoSpeechViewModel.class);
                    AqS151S0100000_1 aqS151S0100000_12 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ2, 776);
                    C4D8 c4d8 = C4D8.INSTANCE;
                    if (o.LJ(c9be2, C9BD.LIZ)) {
                        c214298b3 = new C214298b3(aqS151S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(LJIIIZ2, true), C78926UyI.LJJIIJZLJL(LJIIIZ2, true), C184077Kh.LJLIL, C78926UyI.LJJ(LJIIIZ2, true), C78926UyI.LJIILLIIL(LJIIIZ2, true), c4d8, LIZ2);
                    } else if (c9be2 == null || o.LJ(c9be2, c9be2)) {
                        c214298b3 = new C214298b3(aqS151S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(LJIIIZ2, false), C78926UyI.LJJIIJZLJL(LJIIIZ2, false), C184077Kh.LJLIL, C78926UyI.LJJ(LJIIIZ2, false), C78926UyI.LJIILLIIL(LJIIIZ2, false), c4d8, LIZ2);
                    } else {
                        throw new IllegalArgumentException("Do not support this scope here.");
                    }
                    TakoSpeechViewModel takoSpeechViewModel = (TakoSpeechViewModel) c214298b3.getValue();
                    c4ef.setOnStartSpeechCallback(new AqS151S0100000_1(takoSpeechViewModel, 774));
                    c4ef.setOnSendCallback(new AqS148S0200000_1(c4ef, takoSpeechViewModel, 26));
                    c4ef.setOnCancelCallback(new AqS90S0300000_1(this, c4ef, takoSpeechViewModel, 2));
                    C8YN.LJII(this, takoSpeechViewModel, new TBT() { // from class: X.4DC
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C105934Dt) obj).LJLILLLLZI;
                        }
                    }, C213688a4.LIZLLL(), new AqS120S0300000_1(this, c4ef, takoSpeechViewModel, 2), 4);
                    C8YN.LJII(this, takoSpeechViewModel, new TBT() { // from class: X.4D9
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C105934Dt) obj).LJLJI;
                        }
                    }, C213688a4.LIZLLL(), new AqS164S0200000_1(c4ef, this, 12), 4);
                    C8YN.LJII(this, takoSpeechViewModel, new TBT() { // from class: X.4Ds
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C105934Dt) obj).LJLJJL;
                        }
                    }, C213688a4.LIZLLL(), new AqS183S0100000_1(c4ef, 51), 4);
                    this.LLJILJIL = takoSpeechViewModel;
                }
            }
            ViewGroup viewGroup2 = this.LLIFFJFJJ;
            if (viewGroup2 != null) {
                View view = this.LJLJJI;
                if (view == null || (tuxIconView = this.LLJI) == null) {
                    return;
                }
                TuxIconView tuxIconView6 = this.LLJIJIL;
                C4YG c4yg = this.LJLILLLLZI;
                if (c4yg == null) {
                    return;
                }
                o.LJIIIIZZ(inputArea, "inputArea");
                this.LLJILJILJ = new C111164Xw(new C111154Xv(viewGroup2, view, tuxIconView, tuxIconView6, c4yg, inputArea, this.LLJILLL));
                if (C4Y9.LIZ()) {
                    C4EQ c4eq = C63078OpG.LJLIL;
                    C4EQ c4eq2 = C4EQ.DEFAULT_INPUT;
                    if (c4eq == c4eq2 && (c111164Xw = this.LLJILJILJ) != null) {
                        c111164Xw.LJ(c4eq2, false);
                        return;
                    }
                    return;
                }
                return;
            }
            o.LJIJI("chatContainer");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView
    public final void LJIJI(boolean z) {
        int i;
        TuxIconView tuxIconView;
        if (C4Y9.LIZ()) {
            View view = this.LJLJJI;
            if (view != null) {
                view.setActivated(z);
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZJ = C61328O5c.LIZJ(16);
                if (z) {
                    i = R.attr.bu;
                } else {
                    i = R.attr.ld;
                }
                c110614Vt.LIZIZ = Integer.valueOf(i);
                Context context = view.getContext();
                o.LJIIIIZZ(context, "context");
                view.setBackground(c110614Vt.LIZ(context));
                View view2 = this.LJLJJI;
                if ((view2 instanceof TuxIconView) && (tuxIconView = (TuxIconView) view2) != null) {
                    tuxIconView.setTintColorRes(R.attr.dj);
                    return;
                }
                return;
            }
            return;
        }
        super.LJIJI(z);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView, com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        C111164Xw c111164Xw;
        View view;
        if (this.LLILIL || C44H.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        this.LLILIL = z;
        if (((Boolean) C4Y9.LIZIZ.getValue()).booleanValue()) {
            if (!C78685UuP.LJJJZ(String.valueOf(editable)) || ((view = this.LJLJJI) != null && view.getVisibility() == 0)) {
                View view2 = this.LJLJJI;
                if ((view2 == null || view2.getVisibility() != 8) && String.valueOf(editable).length() == 0 && (c111164Xw = this.LLJILJILJ) != null) {
                    c111164Xw.LJ(C4EQ.DEFAULT_INPUT, C4Y9.LIZIZ());
                }
            } else {
                C111164Xw c111164Xw2 = this.LLJILJILJ;
                if (c111164Xw2 != null) {
                    c111164Xw2.LJ(C4EQ.INPUTTING, C4Y9.LIZIZ());
                }
            }
        }
        super.afterTextChanged(editable);
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    public TakoInputView(ViewGroup viewGroup, C99033ud c99033ud, WeakReference weakReference, LifecycleOwner lifecycleOwner, boolean z) {
        super(viewGroup, c99033ud, weakReference, lifecycleOwner, z, null);
        this.LLIZLLLIL = weakReference;
        this.LLJ = null;
        C221108m2.LIZIZ(new AqS148S0200000_1(this, c99033ud, 25));
        C44H.LIZIZ(lifecycleOwner, new AObserverS69S0100000_1(this, 65));
        AObserverS69S0100000_1 aObserverS69S0100000_1 = new AObserverS69S0100000_1(this, 66);
        C57702Og c57702Og = C57082Lw.LIZ;
        c57702Og.LIZIZ("#LocateFinishWhenEnterEvent").observe(lifecycleOwner, aObserverS69S0100000_1);
        c57702Og.LIZIZ("#DismissBotInputPanelEvent").observe(lifecycleOwner, new AObserverS69S0100000_1(this, 67));
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
