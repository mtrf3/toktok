package X;

import Y.AfS10S0310000_12;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bef.effectsdk.message.MessageCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.NaviContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.views.IDlS19S0200000_12;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.navi.core.EffectDependencyLoader;
import com.ss.android.ugc.gamora.recorder.navi.service.NaviVideoCreationService;
import com.ss.android.ugc.gamora.recorder.navi.view.NaviAvatarListViewModel;
import com.ss.android.ugc.gamora.recorder.navi.view.NaviAvatarListViewState;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SgA, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72706SgA extends TK4 {
    public final ActivityC45651qj LJLJI;
    public final InterfaceC83624Wrs LJLJJI;
    public final InterfaceC84497XEf LJLJJL;
    public final InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public LinearLayout LJLJL;
    public ConstraintLayout LJLJLJ;
    public final C72707SgB LJLJLLL;
    public C71500S4i LJLL;
    public FrameLayout LJLLI;
    public final boolean LJLLILLLL;

    @Override // X.TGM
    public final void LIZJ(IDK state) {
        o.LJIIIZ(state, "state");
    }

    @Override // X.TGM
    public final void LJI() {
    }

    @Override // X.TGM
    public final void LJII(IDK state) {
        o.LJIIIZ(state, "state");
    }

    @Override // X.InterfaceC87276YNc
    public final void LIZIZ() {
        String str;
        C29701Eo c29701Eo;
        View view = this.LJLILLLLZI;
        if ((view instanceof C29701Eo) && (c29701Eo = (C29701Eo) view) != null) {
            c29701Eo.cancelAnimation();
        }
        C72707SgB c72707SgB = this.LJLJLLL;
        int avatarCountSelf = c72707SgB.LJI.Hv0(c72707SgB.LJFF).getAvatarCountSelf();
        int avatarCountCandidate = c72707SgB.LJI.Hv0(c72707SgB.LJFF).getAvatarCountCandidate();
        String LJI = c72707SgB.LIZLLL.LJI();
        o.LJIIIIZZ(LJI, "shortVideoContext.creationId");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZLLL("enter_from", "tiktok_avatar_effect_intro_show");
        c145995oB.LIZLLL("enter_method", "click");
        c145995oB.LIZLLL("creation_id", LJI);
        if (avatarCountSelf != 0) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LIZLLL("tiktok_avatar_flag", str);
        c145995oB.LIZ(avatarCountSelf, "user_avatar_count");
        c145995oB.LIZ(avatarCountCandidate, "candidate_avatar_count");
        GXR.LIZ("click_avatar_thumbnail", c145995oB.LIZ);
    }

    @Override // X.InterfaceC87276YNc
    public final void LJ() {
        C29701Eo c29701Eo;
        View view = this.LJLILLLLZI;
        if ((view instanceof C29701Eo) && (c29701Eo = (C29701Eo) view) != null) {
            c29701Eo.playAnimation();
        }
    }

    @Override // X.InterfaceC87276YNc
    public final View LJFF() {
        View view = this.LJLILLLLZI;
        if (view != null) {
            o.LJI(view);
            return view;
        }
        C29701Eo c29701Eo = new C29701Eo(this.LJLJI, null, 0);
        c29701Eo.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c29701Eo.setAnimationFromUrl("https://p16-amd-va.tiktokcdn.com/obj/musically-maliva-obj/avatar_rotation.json");
        c29701Eo.setRepeatCount(-1);
        this.LJLILLLLZI = c29701Eo;
        return c29701Eo;
    }

    @Override // X.ESP
    public final void LJIIJJI() {
        C71500S4i c71500S4i = this.LJLL;
        if (c71500S4i != null) {
            c71500S4i.setVisibility(8);
        }
        FrameLayout frameLayout = this.LJLLI;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        C72707SgB c72707SgB = this.LJLJLLL;
        c72707SgB.LJIIIZ = false;
        c72707SgB.LIZLLL.naviContext = new NaviContext(0);
        C72708SgC c72708SgC = c72707SgB.LJII;
        if (c72708SgC != null && !c72708SgC.LJI) {
            C73411SrX c73411SrX = c72708SgC.LJIIIZ;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            c72708SgC.LJIIIZ = null;
            EffectDependencyLoader effectDependencyLoader = c72708SgC.LJFF;
            if (effectDependencyLoader != null) {
                effectDependencyLoader.LJLJJL = true;
                MessageCenter.removeListener(effectDependencyLoader);
                ((LinkedHashMap) effectDependencyLoader.LJLJJI).clear();
                effectDependencyLoader.LJLJI.clear();
            }
            c72708SgC.LJI = true;
        }
        c72707SgB.LJII = null;
        InterfaceC92693kP interfaceC92693kP = c72707SgB.LJIIIIZZ;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        c72707SgB.LJIIIIZZ = null;
        C36400EQi c36400EQi = c72707SgB.LJIILJJIL;
        if (c36400EQi != null) {
            MessageCenter.removeListener(c36400EQi);
        }
    }

    public final ViewGroup LJIILIIL() {
        if (!this.LJLLILLLL) {
            return null;
        }
        if (this.LJLLI == null) {
            this.LJLLI = new FrameLayout(this.LJLJI);
            C16880lQ.LLLLIILL(this.LJLJI.getLayoutInflater(), R.layout.bvw, this.LJLLI, true);
            FrameLayout frameLayout = this.LJLLI;
            o.LJI(frameLayout);
            C16880lQ.LJIILJJIL(frameLayout, new IDlS19S0200000_12(this, frameLayout, 4));
            FrameLayout frameLayout2 = this.LJLLI;
            o.LJI(frameLayout2);
            frameLayout2.setVisibility(8);
        }
        return this.LJLLI;
    }

    public final C71500S4i LJIILJJIL() {
        if (this.LJLL == null) {
            C71500S4i c71500S4i = new C71500S4i(this.LJLJI);
            C72707SgB avatarListPresenter = this.LJLJLLL;
            o.LJIIIZ(avatarListPresenter, "avatarListPresenter");
            c71500S4i.LJLJL = avatarListPresenter;
            c71500S4i.setVisibility(8);
            this.LJLL = c71500S4i;
        }
        C71500S4i c71500S4i2 = this.LJLL;
        o.LJI(c71500S4i2);
        return c71500S4i2;
    }

    @Override // X.TGT
    public final boolean LLIIIJ() {
        C71500S4i c71500S4i = this.LJLL;
        if (c71500S4i == null) {
            return false;
        }
        o.LJI(c71500S4i);
        if (c71500S4i.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.TGT
    public final void LLIIIL() {
        C71500S4i c71500S4i = this.LJLL;
        if (c71500S4i != null) {
            c71500S4i.setVisibility(8);
        }
        FrameLayout frameLayout = this.LJLLI;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    @Override // X.TGT
    public final void LLIIIZ() {
        C71500S4i c71500S4i = this.LJLL;
        if (c71500S4i != null) {
            c71500S4i.setVisibility(0);
        }
        FrameLayout frameLayout = this.LJLLI;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(0);
    }

    @Override // X.InterfaceC87276YNc
    public final View LJIIIIZZ() {
        return this.LJLL;
    }

    @Override // X.TGM
    public final void LIZ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        this.LJLJL = (LinearLayout) stickerView.findViewById(R.id.g4a);
        this.LJLJLJ = (ConstraintLayout) stickerView.findViewById(R.id.kgf);
        LinearLayout linearLayout = this.LJLJL;
        if (linearLayout != null) {
            linearLayout.addView(LJIILJJIL());
        }
        ViewGroup LJIILIIL = LJIILIIL();
        if (LJIILIIL != null) {
            ConstraintLayout constraintLayout = this.LJLJLJ;
            if (constraintLayout != null) {
                constraintLayout.addView(LJIILIIL, 0);
            }
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            LJIILIIL.setId(View.generateViewId());
            anonymousClass064.LJII(this.LJLJLJ);
            anonymousClass064.LJ(LJIILIIL.getId());
            anonymousClass064.LJIIIIZZ(LJIILIIL.getId(), 4, 0, 4);
            anonymousClass064.LIZIZ(this.LJLJLJ);
        }
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        return ID0.LJIIIIZZ(session.LIZ);
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        InterfaceC92693kP Kv0;
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        ViewGroup LJIILIIL = LJIILIIL();
        if (LJIILIIL != null) {
            LJIILIIL.setVisibility(0);
        }
        LJIILJJIL().setVisibility(0);
        C72707SgB c72707SgB = this.LJLJLLL;
        Effect effect = session.LIZ;
        c72707SgB.getClass();
        o.LJIIIZ(effect, "effect");
        c72707SgB.LJIIJ = V3N.LJIJ(effect.getSdkExtra(), "has_avatar_head", true);
        NaviAvatarListViewModel naviAvatarListViewModel = c72707SgB.LJI;
        LifecycleOwner lifecycleOwner = c72707SgB.LJFF;
        naviAvatarListViewModel.getClass();
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        NaviAvatarListViewState Hv0 = naviAvatarListViewModel.Hv0(lifecycleOwner);
        List<RTP> avatarList = Hv0.getAvatarList();
        boolean isEditDone = Hv0.isEditDone();
        naviAvatarListViewModel.setStateImmediate(C71505S4n.LJLIL);
        C36394EQc c36394EQc = naviAvatarListViewModel.LJLJJLL;
        NaviVideoCreationService naviVideoCreationService = c36394EQc.LIZ;
        int LIZ = OOP.LIZ();
        String str = C36398EQg.LIZ;
        AbstractC73672Svk.LJJLL(naviVideoCreationService.getNaviList(0, LIZ, str), c36394EQc.LIZ.getCandidateList(true, 1, str), new RTT(c36394EQc)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS10S0310000_12(avatarList, isEditDone, naviAvatarListViewModel, Hv0, 2), new InterfaceC64592gB() { // from class: X.9Fu
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
        if (c72707SgB.LJIIIIZZ == null) {
            Kv0 = c72707SgB.LJI.Kv0(c72707SgB.LJFF, new TBT() { // from class: X.S4m
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((NaviAvatarListViewState) obj).getAvatarList();
                }
            }, new C73165SnZ(), new AqS178S0100000_12(c72707SgB, 734));
            c72707SgB.LJIIIIZZ = Kv0;
        }
        C36400EQi c36400EQi = new C36400EQi();
        c72707SgB.LJIILJJIL = c36400EQi;
        MessageCenter.addListener(c36400EQi);
        C72703Sg7 c72703Sg7 = new C72703Sg7(c72707SgB.LIZIZ);
        InterfaceC84497XEf interfaceC84497XEf = c72707SgB.LIZJ;
        C36400EQi c36400EQi2 = c72707SgB.LJIILJJIL;
        o.LJI(c36400EQi2);
        C36396EQe c36396EQe = new C36396EQe(interfaceC84497XEf, c72703Sg7, c36400EQi2);
        c36396EQe.LJLJI.LIZIZ(c36396EQe);
        c36396EQe.LJLJJL = new C73318Sq2();
    }

    public C72706SgA(C29S activity, InterfaceC83624Wrs cameraView, InterfaceC84497XEf interfaceC84497XEf, ShortVideoContext shortVideoContext, AqS157S0100000_7 aqS157S0100000_7, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(cameraView, "cameraView");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLJI = activity;
        this.LJLJJI = cameraView;
        this.LJLJJL = interfaceC84497XEf;
        this.LJLJJLL = aqS157S0100000_7;
        this.LJLJLLL = new C72707SgB(activity, cameraView, interfaceC84497XEf, shortVideoContext, aqS157S0100000_7, lifecycleOwner);
        this.LJLLILLLL = e1.LIZ(31744, "studio_avatar_edit_button_enable", true, true);
    }
}
