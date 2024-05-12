package X;

import Y.ACListenerS38S0200000_3;
import Y.AObserverS71S0100000_3;
import Y.IDCListenerS157S0100000_3;
import Y.IDCListenerS47S0200000_3;
import Y.IDTListenerS113S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeCommentViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeFavoriteViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeShareViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.7tQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200207tQ implements InterfaceC86642XzS, KPL, InterfaceC174146sU, InterfaceC72642tA<C50420Jqa>, InterfaceC203737z7 {
    public final C200847uS LJLIL;
    public final PostDiggViewModel LJLILLLLZI;
    public final PostModeFavoriteViewModel LJLJI;
    public final PostModeShareViewModel LJLJJI;
    public boolean LJLJJL;
    public C62906OmU LJLJJLL;
    public boolean LJLJL;
    public final C86641XzR LJLJLJ;
    public C187197Wh LJLJLLL;
    public C7AY LJLL;

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

    @Override // X.InterfaceC174146sU
    public final void x() {
    }

    @Override // X.InterfaceC86642XzS
    public final void B0() {
        View view;
        Fragment fragment = this.LJLIL.LIZ;
        if (fragment != null && (view = fragment.getView()) != null) {
            this.LJLJI.iv0(view, this);
        }
    }

    public final void LIZJ() {
        Aweme aweme;
        C187197Wh c187197Wh;
        C200847uS c200847uS = this.LJLIL;
        if (c200847uS == null || (aweme = c200847uS.LIZJ) == null) {
            return;
        }
        if ((aweme.getStatus() != null && !aweme.getStatus().isPrivate()) || this.LJLJJL || (c187197Wh = this.LJLJLLL) == null) {
            return;
        }
        c187197Wh.LJJIII(aweme);
        if (C78996UzQ.LJJIIZI(aweme) && this.LJLJJLL == null) {
            C62905OmT c62905OmT = new C62905OmT(this.LJLIL.LIZIZ);
            c62905OmT.LIZ(R.string.pau);
            c62905OmT.LJIIIIZZ(R.string.cg_, new IDCListenerS157S0100000_3(aweme, 1), false);
            c62905OmT.LJIIJJI(R.string.hp2, new IDCListenerS47S0200000_3(this, aweme, 4), false);
            c62905OmT.LIZJ(new AqS169S0100000_3(this, 650));
            this.LJLJJLL = new C62906OmU(c62905OmT);
        }
        C62906OmU c62906OmU = this.LJLJJLL;
        if (c62906OmU != null) {
            c62906OmU.LIZLLL();
        }
        this.LJLJJL = true;
    }

    @Override // X.InterfaceC86642XzS
    public final void LJJZZIII() {
        this.LJLILLLLZI.kv0(new AqS185S0100000_3(this, 152));
    }

    @Override // X.InterfaceC86642XzS
    public final void LJLJJL() {
        if (C80S.LJFF(this.LJLIL.LIZJ)) {
            LIZJ();
            return;
        }
        if (C184387Lm.LJI(this.LJLIL.LIZJ)) {
            C200847uS c200847uS = this.LJLIL;
            this.LJLIL.LJII.kv0(C184387Lm.LIZLLL(c200847uS.LIZIZ, c200847uS.LIZJ).toString());
        }
        this.LJLIL.LJII.LJLJJL.setValue(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC86642XzS
    public final void Z2() {
        if (this.LJLJL) {
            return;
        }
        this.LJLJL = true;
        C200847uS c200847uS = this.LJLIL;
        Fragment fragment = c200847uS.LIZ;
        if (fragment != null) {
            this.LJLJJI.gv0(c200847uS.LIZIZ, fragment, new InterfaceC72642tA<C50420Jqa>(this) { // from class: X.7Lg
                public final WeakReference<C200207tQ> LJLIL;

                {
                    o.LJIIIZ(this, "postModeActionBarComponent");
                    this.LJLIL = new WeakReference<>(this);
                }

                @Override // X.InterfaceC72642tA
                public final void onInternalEvent(C50420Jqa c50420Jqa) {
                    C50420Jqa c50420Jqa2 = c50420Jqa;
                    C200207tQ c200207tQ = this.LJLIL.get();
                    if (c200207tQ != null) {
                        c200207tQ.onInternalEvent(c50420Jqa2);
                    }
                }
            }, this.LJLIL.LJI);
            this.LJLIL.LJII.jv0(true);
        }
    }

    @Override // X.InterfaceC86642XzS
    public final void c() {
        Aweme aweme = this.LJLIL.LIZJ;
        if (aweme != null) {
            this.LJLJLJ.LJJZZI(aweme.isCollected());
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.LJLIL.LIZIZ.getLifecycle();
        o.LJIIIIZZ(lifecycle, "postModeModel.activityContext.lifecycle");
        return lifecycle;
    }

    @Override // X.InterfaceC203737z7
    public final void ix() {
        if (!C52535Kjb.LIZ()) {
            this.LJLJI.jv0();
        }
        this.LJLJLJ.LJJZ();
    }

    @Override // X.InterfaceC72642tA
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final void onInternalEvent(C50420Jqa c50420Jqa) {
        String str;
        String str2;
        Aweme aweme;
        Aweme aweme2;
        this.LJLJL = false;
        this.LJLIL.LJII.jv0(false);
        if (c50420Jqa == null) {
            return;
        }
        int i = c50420Jqa.LJLIL;
        if (i != 1) {
            if (i != 55) {
                if (i != 56) {
                    return;
                }
                Object obj = c50420Jqa.LJLILLLLZI;
                if (!(obj instanceof Aweme) || (aweme2 = (Aweme) obj) == null) {
                    return;
                }
                C200847uS c200847uS = this.LJLIL;
                C200217tR.LIZ(aweme2, c200847uS.LIZIZ, c200847uS);
                return;
            }
            Object obj2 = c50420Jqa.LJLILLLLZI;
            if (!(obj2 instanceof Aweme) || (aweme = (Aweme) obj2) == null) {
                return;
            }
            ActivityC45651qj activity = this.LJLIL.LIZIZ;
            o.LJIIIZ(activity, "activity");
            MixFeedService.LJJIJIIJIL().LJIIIIZZ(new C56832Kx(aweme, activity, activity));
            return;
        }
        Aweme aweme3 = this.LJLIL.LIZJ;
        if (aweme3 == null) {
            return;
        }
        ShareDependService.LIZ.getClass();
        ShareDependService LIZ = C44498HdG.LIZ();
        C200847uS c200847uS2 = this.LJLIL;
        PostModeDetailParams postModeDetailParams = c200847uS2.LJI;
        String str3 = "";
        if (postModeDetailParams == null || (str = postModeDetailParams.eventType) == null) {
            str = "";
        }
        ActivityC45651qj activityC45651qj = c200847uS2.LIZIZ;
        String str4 = c50420Jqa.LJLLL;
        if (str4 == null) {
            str4 = "";
        }
        if (postModeDetailParams != null && (str2 = postModeDetailParams.eventType) != null) {
            str3 = str2;
        }
        OQA.LIZJ(LIZ, aweme3, str, activityC45651qj, str4, str3, "graphic_detail", 128);
    }

    @Override // X.InterfaceC203737z7
    public final void aB(Exception exc) {
        C36922EeM.LJFF(exc);
        this.LJLJLJ.LJJZZI(false);
        this.LJLJLJ.LJJZ();
    }

    @Override // X.InterfaceC203737z7
    public final void gd(String str) {
        C26045AKb c26045AKb = new C26045AKb(this.LJLIL.LIZIZ);
        c26045AKb.LJIIIZ(str);
        c26045AKb.LJIIJ();
    }

    @Override // X.InterfaceC174146sU
    public final void q(C175216uD c175216uD) {
        String str;
        String str2;
        String str3;
        C7AY c7ay = c175216uD.LIZLLL;
        this.LJLL = c7ay;
        C224748ru c224748ru = (C224748ru) this.LJLJLJ.findViewById(R.id.hyw);
        Aweme aweme = this.LJLIL.LIZJ;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C200847uS c200847uS = this.LJLIL;
        PostModeDetailParams postModeDetailParams = c200847uS.LJI;
        if (postModeDetailParams != null) {
            str2 = postModeDetailParams.eventType;
        } else {
            str2 = null;
        }
        EnumC177736yH enumC177736yH = EnumC177736yH.POST_MODE;
        Aweme aweme2 = c200847uS.LIZJ;
        if (aweme2 != null) {
            str3 = aweme2.getAuthorUid();
        } else {
            str3 = null;
        }
        c7ay.LIZIZ(new C177056xB((View) null, c224748ru, (TuxIconView) null, (TuxIconView) null, (TuxIconView) null, (TextView) null, str, str2, false, enumC177736yH, str3));
        if (a.LJ().LJ(3)) {
            this.LJLJLJ.findViewById(R.id.hyw).setEnabled(false);
            this.LJLJLJ.findViewById(R.id.hyo).setEnabled(false);
        } else if (C184387Lm.LJI(this.LJLIL.LIZJ)) {
            LIZIZ(new AqS153S0100000_3(this, 1463), true);
        } else if (C80S.LJFF(this.LJLIL.LIZJ)) {
            LIZIZ(new AqS153S0100000_3(this, 1464), false);
        }
        this.LJLIL.LJII.LLIIIL.observe(this, new AObserverS71S0100000_3(this, 35));
        C187197Wh c187197Wh = new C187197Wh(this.LJLIL.LIZIZ);
        this.LJLJLLL = c187197Wh;
        c187197Wh.LJJ(new AF9());
        LIZIZ(C200317tb.LJLIL, false);
    }

    public final void LIZIZ(InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        View findViewById;
        C86641XzR c86641XzR = this.LJLJLJ;
        if (c86641XzR == null || (findViewById = c86641XzR.findViewById(R.id.hyw)) == null) {
            return;
        }
        C16880lQ.LJIIJ(new ACListenerS38S0200000_3(this, interfaceC65784Pro, 58), findViewById);
        if (z) {
            findViewById.setOnTouchListener(new IDTListenerS113S0100000_3(interfaceC65784Pro, 16));
        }
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    public C200207tQ(C200847uS c200847uS, PostDiggViewModel diggVM, PostModeCommentViewModel commentVM, PostModeFavoriteViewModel favoriteVM, PostModeShareViewModel postModeShareViewModel) {
        ViewGroup viewGroup;
        o.LJIIIZ(diggVM, "diggVM");
        o.LJIIIZ(commentVM, "commentVM");
        o.LJIIIZ(favoriteVM, "favoriteVM");
        this.LJLIL = c200847uS;
        this.LJLILLLLZI = diggVM;
        this.LJLJI = favoriteVM;
        this.LJLJJI = postModeShareViewModel;
        C86641XzR c86641XzR = new C86641XzR(c200847uS.LIZIZ, this);
        this.LJLJLJ = c86641XzR;
        ViewGroup viewGroup2 = c200847uS.LIZLLL;
        if (viewGroup2 != null && (viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.bju)) != null) {
            viewGroup.addView(c86641XzR);
        }
        C8YN.LJII(this, diggVM, new TBT() { // from class: X.7ti
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C200367tg) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(this, 155), 6);
        diggVM.LJLJJL.LIZIZ(PostDiggViewModel.LJLLI[0], c200847uS.LIZIZ);
        Aweme aweme = c200847uS.LIZJ;
        diggVM.LJLJLJ = aweme;
        diggVM.setState(new AqS134S0200000_3(diggVM, aweme, 203));
        commentVM.LJLILLLLZI.LIZIZ(PostModeCommentViewModel.LJLJI[0], c200847uS.LIZIZ);
        commentVM.LJLIL = c200847uS.LIZJ;
        commentVM.gv0(null);
        MutableLiveData mutableLiveData = c200847uS.LJII.LJZI;
        if (mutableLiveData != null) {
            mutableLiveData.observe(c200847uS.LIZIZ, new AObserverS71S0100000_3(this, 37));
        }
        C8YN.LJII(this, commentVM, new TBT() { // from class: X.7Oc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C185047Oa) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(this, 156), 6);
        favoriteVM.LJLJJL.LIZIZ(PostModeFavoriteViewModel.LJLL[0], c200847uS.LIZIZ);
        PostModeDetailParams postModeDetailParams = c200847uS.LJI;
        favoriteVM.LJLJL = postModeDetailParams != null ? postModeDetailParams.eventType : null;
        Aweme aweme2 = c200847uS.LIZJ;
        if (aweme2 != null) {
            favoriteVM.LJLIL = aweme2;
            favoriteVM.setState(new AqS134S0200000_3(favoriteVM, aweme2, 204));
        }
        C8YN.LJII(this, favoriteVM, new TBT() { // from class: X.87h
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C2061387d) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(this, 157), 6);
        C8YN.LJII(this, favoriteVM, new TBT() { // from class: X.87e
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C2061387d) obj).LJLJI);
            }
        }, null, new AqS185S0100000_3(this, 159), 6);
        postModeShareViewModel.LJLIL = c200847uS.LIZJ;
        postModeShareViewModel.setState(new AqS169S0100000_3(postModeShareViewModel, 715));
        C8YN.LJII(this, postModeShareViewModel, new TBT() { // from class: X.7tZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C200227tS) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(this, 154), 6);
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
