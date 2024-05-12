package X;

import Y.IDCListenerS135S0100000;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.OnLiveEffectSelectedEvent;
import com.bytedance.android.live.effect.api.OnFilterSelectedEvent;
import com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.BeautyPanelMemoryOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyReverseExperiment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveShowEffectDebugViewSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectDowngradeSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import ujb.o;

/* renamed from: X.1ai, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35721ai implements InterfaceC08010Td {
    public final Context LJLIL;
    public final DataChannel LJLILLLLZI;
    public final View LJLJI;
    public final C76923UGx LJLJJI;
    public final C0K5 LJLJJL;
    public final C94433nD LJLJJLL;
    public final ImageView LJLJL;
    public final C47121t6 LJLJLJ;
    public final ViewGroup LJLJLLL;
    public final ComposerFilterViewModel LJLL;
    public final LiveSmallItemBeautyViewModel LJLLI;
    public final C35701ag LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public final InterfaceC24270xL<?> LJLLLL;
    public final C24280xM LJLLLLLL;
    public final C24290xN LJLZ;

    @Override // X.InterfaceC08010Td
    public final void onDialogBackground() {
    }

    @Override // X.InterfaceC08010Td
    public final void onDialogForeground() {
    }

    @Override // X.InterfaceC08010Td
    public final void LIZ() {
        XKQ xkq;
        C35701ag c35701ag = this.LJLLILLLL;
        c35701ag.LJLLJ = null;
        C37281dE c37281dE = c35701ag.LJLJLJ;
        if (c37281dE != null && (xkq = c37281dE.LJIIIIZZ) != null) {
            xkq.LIZIZ(C62848OlY.LIZ("fragment on destroy", null));
        }
        Iterator<Map.Entry<String, C37281dE>> it = c35701ag.LJLJL.entrySet().iterator();
        while (it.hasNext()) {
            XKQ xkq2 = it.next().getValue().LJIIIIZZ;
            if (xkq2 != null) {
                xkq2.LIZIZ(C62848OlY.LIZ("fragment on destroy", null));
            }
        }
        C1VS c1vs = c35701ag.LJLJLLL;
        if (c1vs != null) {
            c1vs.LJFF = null;
        }
        C33731Ub c33731Ub = c35701ag.LJLL;
        if (c33731Ub != null) {
            c33731Ub.LJ = null;
        }
        c35701ag.LJLLJ = null;
        InterfaceC24270xL<?> interfaceC24270xL = this.LJLLLL;
        if (interfaceC24270xL instanceof C1VK) {
            ((C1VK) interfaceC24270xL).LIZJ = null;
        } else if (interfaceC24270xL instanceof C35711ah) {
            ((C35711ah) interfaceC24270xL).LIZIZ = null;
        }
        interfaceC24270xL.release();
        C24290xN c24290xN = this.LJLZ;
        c24290xN.LIZJ = null;
        C260810q c260810q = c24290xN.LJIILL;
        if (c260810q != null) {
            C29306Beo.LJI(c260810q.LJIIIZ);
        }
    }

    public final void LIZJ() {
        boolean z = false;
        if (LiveBeautyReverseExperiment.INSTANCE.isInExperiment() || LiveEffectDowngradeSetting.INSTANCE.remove()) {
            this.LJLJL.setVisibility(8);
            this.LJLJL.setEnabled(false);
            return;
        }
        String str = this.LJLLL;
        if (str != null && o.LJJJLIIL(str, "beauty", false) && C78880UxY.LJJIIZ() == 0) {
            this.LJLJL.setEnabled(false);
            return;
        }
        ImageView imageView = this.LJLJL;
        List<LiveEffect> LIZ = C12890ez.LIZ().LIZ(C0TY.LIZLLL);
        ArrayList LIZIZ = s1.LIZIZ(LIZ, "LiveComposerManagerProvi….SMALL_ITEM_BEAUTY_PANEL)");
        for (LiveEffect liveEffect : LIZ) {
            if (kotlin.jvm.internal.o.LJ(liveEffect.effectPanelName, this.LJLLJ)) {
                LIZIZ.add(liveEffect);
            }
        }
        if (!LIZIZ.isEmpty()) {
            Iterator it = LIZIZ.iterator();
            while (it.hasNext()) {
                LiveEffect liveEffect2 = (LiveEffect) it.next();
                if (liveEffect2.isExclusive || C12890ez.LIZ().LJIIL(liveEffect2)) {
                    z = true;
                    break;
                }
            }
        }
        imageView.setEnabled(z);
    }

    @Override // X.InterfaceC08010Td
    public final View getView() {
        View rootView = this.LJLJI;
        kotlin.jvm.internal.o.LJIIIIZZ(rootView, "rootView");
        return rootView;
    }

    @Override // X.InterfaceC08010Td
    public final void LIZIZ(DialogFragment fragment) {
        LifecycleCoroutineScope lifecycleScope;
        kotlin.jvm.internal.o.LJIIIZ(fragment, "fragment");
        C0TY.LJFF = C15380j0.LJIILJJIL(R.string.mgx);
        this.LJLLILLLL.LJLLJ = fragment.getViewLifecycleOwner();
        C35701ag c35701ag = this.LJLLILLLL;
        Iterator<Map.Entry<String, C37281dE>> it = c35701ag.LJLJL.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().getClass();
        }
        C1VS c1vs = c35701ag.LJLJLLL;
        if (c1vs != null) {
            c1vs.LJFF = c35701ag.LJLLJ;
            c1vs.LIZIZ();
        }
        C33731Ub c33731Ub = c35701ag.LJLL;
        if (c33731Ub != null) {
            c33731Ub.LJ = c35701ag.LJLLJ;
            c33731Ub.LIZIZ();
        }
        this.LJLJJL.getBackground().setAlpha(255);
        this.LJLJJLL.setAdapter(this.LJLLILLLL);
        this.LJLJJLL.addOnPageChangeListener(new C1CZ() { // from class: X.1nz
            @Override // X.C1CZ, X.C0C3
            public final void onPageSelected(int i) {
                String str;
                C35721ai c35721ai = C35721ai.this;
                c35721ai.LJLLJ = String.valueOf(c35721ai.LJLLILLLL.LJIILIIL(i));
                C35721ai c35721ai2 = C35721ai.this;
                C35701ag c35701ag2 = c35721ai2.LJLLILLLL;
                if (i == ((ArrayList) c35701ag2.LJLJJL).size()) {
                    str = "livefilter";
                } else {
                    str = (String) ListProtector.get(c35701ag2.LJLJJLL, i);
                }
                c35721ai2.LJLLL = str;
                if (kotlin.jvm.internal.o.LJ(C35721ai.this.LJLLJ, C0TY.LJFF)) {
                    C35721ai.this.LJLLLL.LIZIZ();
                    C1KS.LIZ(C35721ai.this.LJLILLLLZI);
                    C29306Beo.LJI(C35721ai.this.LJLJL);
                } else {
                    if (LiveBeautyReverseExperiment.INSTANCE.notInExperiment()) {
                        C35721ai c35721ai3 = C35721ai.this;
                        c35721ai3.LJLZ.LIZLLL(c35721ai3.LJLLJ);
                        C29306Beo.LJJLJLI(C35721ai.this.LJLJL);
                    }
                    String str2 = C35721ai.this.LJLLL;
                    if (str2 != null && o.LJJJLIIL(str2, "beauty", false) && C78880UxY.LJJIIZ() == 0) {
                        C35721ai.this.LJLJL.setEnabled(false);
                    }
                }
                C35721ai c35721ai4 = C35721ai.this;
                c35721ai4.LJLLILLLL.LJLLI = i;
                c35721ai4.LIZJ();
            }
        });
        C16880lQ.LJIILLIIL(this.LJLJL, new IDCListenerS135S0100000(this, 82));
        this.LJLJJL.setErrorClickListener(new C0K4() { // from class: X.1aj
            @Override // X.C0K4
            public final void LIZIZ() {
                C35721ai c35721ai = C35721ai.this;
                c35721ai.getClass();
                if (LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
                    XKX.LIZLLL(ViewModelKt.getViewModelScope(c35721ai.LJLL), null, null, new C2GF(c35721ai, null), 3);
                } else {
                    C15750jb.LIZ.LJIIL(c35721ai.LJLILLLLZI);
                }
                C0TX.LIZ.LIZJ("LiveBeautyFilterDialogFragmentOpt");
                C0TX.LIZLLL = "fetchEffectData";
                C0TX.LIZIZ("try to fetch beauty effect in beauty panel");
                XKX.LIZLLL(ViewModelKt.getViewModelScope(c35721ai.LJLLI), null, null, new C2GG(c35721ai, null), 3);
            }
        });
        this.LJLJJL.LJFF();
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this.LJLLI), null, null, new C2GK(this, null), 3);
        if (CCJ.LIZ(this.LJLIL)) {
            this.LJLJJI.setScaleX(-1.0f);
        }
        C76923UGx c76923UGx = this.LJLJJI;
        int LIZIZ = C259910h.LIZIZ(R.attr.eb, this.LJLIL);
        int LIZIZ2 = C259910h.LIZIZ(R.attr.dm, this.LJLIL);
        int LIZIZ3 = C259910h.LIZIZ(R.attr.cl, this.LJLIL);
        c76923UGx.LJLJL = LIZIZ;
        c76923UGx.LJLJLJ = LIZIZ2;
        c76923UGx.LLIILZL = LIZIZ3;
        c76923UGx.setUpUiColor(false);
        this.LJLJJI.setOnLevelChangeListener(new UH2() { // from class: X.1ny
            @Override // X.UH1
            public final void LIZ(int i) {
                if (kotlin.jvm.internal.o.LJ(C35721ai.this.LJLLJ, C0TY.LJFF)) {
                    C35721ai.this.LJLLLL.LIZ(i);
                } else {
                    C35721ai.this.LJLZ.LJ(i);
                    C35721ai.this.LIZJ();
                }
            }

            @Override // X.UH2, X.UH1
            public final void LIZIZ(int i) {
                if (!kotlin.jvm.internal.o.LJ(C35721ai.this.LJLLJ, C0TY.LJFF)) {
                    C35721ai.this.LJLZ.LJII(false);
                }
            }
        });
        InterfaceC24270xL<?> interfaceC24270xL = this.LJLLLL;
        if (interfaceC24270xL instanceof C1VK) {
            C1VK c1vk = (C1VK) interfaceC24270xL;
            c1vk.LIZJ = fragment;
            c1vk.getClass();
            if (BeautyPanelMemoryOptSetting.INSTANCE.enable()) {
                Fragment fragment2 = c1vk.LIZJ;
                if (fragment2 != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment2)) != null) {
                    XKX.LIZLLL(lifecycleScope, null, null, new C2FA(c1vk, null), 3);
                }
                DataChannel dataChannel = c1vk.LIZIZ;
                if (dataChannel != null) {
                    dataChannel.lv0(c1vk.LIZJ, OnFilterSelectedEvent.class, new IDqS416S0100000(c1vk, 253));
                }
                c1vk.LIZLLL();
            }
        } else if (interfaceC24270xL instanceof C35711ah) {
            C35711ah c35711ah = (C35711ah) interfaceC24270xL;
            c35711ah.LIZIZ = fragment;
            c35711ah.getClass();
            if (BeautyPanelMemoryOptSetting.INSTANCE.enable()) {
                c35711ah.LIZJ();
                c35711ah.LJ();
            }
        }
        C24290xN c24290xN = this.LJLZ;
        c24290xN.LIZJ = fragment;
        c24290xN.LIZJ();
        C260810q c260810q = c24290xN.LJIILL;
        if (c260810q != null && c260810q.LJIILIIL) {
            C29306Beo.LJJLJLI(c260810q.LJIIIZ);
            C88207Yjb.LIZJ(c260810q.LJIIJ);
        }
        this.LJLILLLLZI.lv0(fragment, OnLiveEffectSelectedEvent.class, new IDqS416S0100000(this, 303));
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest() && LiveShowEffectDebugViewSetting.INSTANCE.enable()) {
            C29306Beo.LJJLJLI(this.LJLJLJ);
        } else {
            C29306Beo.LJI(this.LJLJLJ);
        }
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this.LJLLI), null, null, new C2GH(this, null), 3);
        if (LiveEffectDowngradeSetting.INSTANCE.remove() || LiveBeautyReverseExperiment.INSTANCE.isInExperiment()) {
            C1KS.LIZ(this.LJLILLLLZI);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C35721ai(Context context, DataChannel dataChannel) {
        InterfaceC24270xL<?> c35711ah;
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        kotlin.jvm.internal.o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLIL = context;
        this.LJLILLLLZI = dataChannel;
        Fragment fragment = null;
        Object[] objArr = 0;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cy5, C16880lQ.LLZIL(context), null);
        this.LJLJI = LLLZIIL;
        C76923UGx seekBar = (C76923UGx) LLLZIIL.findViewById(R.id.k5p);
        this.LJLJJI = seekBar;
        C80261Vej effectTab = (C80261Vej) LLLZIIL.findViewById(R.id.csv);
        this.LJLJJL = (C0K5) LLLZIIL.findViewById(R.id.cst);
        C94433nD viewPager = (C94433nD) LLLZIIL.findViewById(R.id.cso);
        this.LJLJJLL = viewPager;
        ImageView resetView = (ImageView) LLLZIIL.findViewById(R.id.iyh);
        this.LJLJL = resetView;
        C47121t6 debugView = (C47121t6) LLLZIIL.findViewById(R.id.c4a);
        this.LJLJLJ = debugView;
        ViewGroup viewGroup = (ViewGroup) LLLZIIL.findViewById(R.id.k5s);
        this.LJLJLLL = viewGroup;
        C1VM c1vm = new C1VM(new C1VF(), new C43361n2());
        C30686C2o c30686C2o = C30686C2o.LJLIL;
        ComposerFilterViewModel composerFilterViewModel = (ComposerFilterViewModel) new ViewModelProvider(c30686C2o, c1vm).get(ComposerFilterViewModel.class);
        this.LJLL = composerFilterViewModel;
        LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel = (LiveSmallItemBeautyViewModel) new ViewModelProvider(c30686C2o, new C37301dG(new C44171oL(0))).get(LiveSmallItemBeautyViewModel.class);
        this.LJLLI = liveSmallItemBeautyViewModel;
        C35701ag c35701ag = new C35701ag(context, dataChannel, liveSmallItemBeautyViewModel, composerFilterViewModel);
        this.LJLLILLLL = c35701ag;
        if (LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
            kotlin.jvm.internal.o.LJIIIIZZ(seekBar, "seekBar");
            c35711ah = new C1VK(composerFilterViewModel, dataChannel, null, seekBar, new IDqS420S0100000(this, 169));
        } else {
            kotlin.jvm.internal.o.LJIIIIZZ(seekBar, "seekBar");
            c35711ah = new C35711ah(dataChannel, null, seekBar, new IDqS420S0100000(this, 170));
        }
        this.LJLLLL = c35711ah;
        kotlin.jvm.internal.o.LJIIIIZZ(effectTab, "effectTab");
        kotlin.jvm.internal.o.LJIIIIZZ(viewPager, "viewPager");
        this.LJLLLLLL = new C24280xM(effectTab, viewPager, dataChannel);
        kotlin.jvm.internal.o.LJIIIIZZ(seekBar, "seekBar");
        kotlin.jvm.internal.o.LJIIIIZZ(resetView, "resetView");
        kotlin.jvm.internal.o.LJIIIIZZ(debugView, "debugView");
        this.LJLZ = new C24290xN(liveSmallItemBeautyViewModel, dataChannel, fragment, objArr == true ? 1 : 0, c35701ag, viewGroup, seekBar, resetView, debugView);
    }
}
