package com.ss.android.ugc.aweme.music.v2.assem;

import X.AnonymousClass391;
import X.AnonymousClass636;
import X.C187477Xj;
import X.C187487Xk;
import X.C212428Vi;
import X.C214298b3;
import X.C2K0;
import X.C32151Nz;
import X.C55096Ljo;
import X.C55230Lly;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78897Uxp;
import X.C78926UyI;
import X.C9BE;
import X.EV9;
import X.FFL;
import X.InterfaceC55235Lm3;
import X.O6R;
import X.TBT;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.music.ab.MusicDetailRedesignV2Experiment;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicPlayViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MusicCoverAssem extends DynamicAssem implements MusicPlayAbility {
    public View LJLJLLL;
    public View LJLL;
    public View LJLLI;
    public final C214298b3 LJLLILLLL;
    public final C214298b3 LJLLJ;

    public MusicCoverAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicDetailViewModel.class);
        this.LJLLILLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 541), C187477Xj.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(MusicPlayViewModel.class);
        this.LJLLJ = C78926UyI.LJ(this, LIZ2, c9be, new AqS153S0100000_3(LIZ2, 542), C187487Xk.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.bup;
    }

    public final MusicPlayViewModel L3() {
        return (MusicPlayViewModel) this.LJLLJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.MusicPlayAbility
    public final void LLLLLL() {
        L3().LLLLLL();
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        L3().LLLLLL();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Bundle bundle;
        o.LJIIIZ(view, "view");
        assembleChildren();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
            C2K0 LIZ = C55096Ljo.LIZ(LIZJ, MusicPlayAbility.class, null);
            if (LIZ == null) {
                C55096Ljo.LJIIJJI(LIZJ, this, MusicPlayAbility.class, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                    if (invocationHandler instanceof EV9) {
                        ((EV9) invocationHandler).LIZ.add(this);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException unused) {
                    EV9 ev9 = new EV9();
                    ev9.LIZ.add(this);
                    ev9.LIZ.add(LIZ);
                    Object newProxyInstance = Proxy.newProxyInstance(MusicPlayAbility.class.getClassLoader(), new Class[]{MusicPlayAbility.class}, ev9);
                    if (newProxyInstance != null) {
                        C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, MusicPlayAbility.class, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.music.v2.assem.MusicPlayAbility");
                    }
                }
            }
        }
        MusicPlayViewModel L3 = L3();
        Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
        if (LIZLLL2 != null) {
            bundle = LIZLLL2.getArguments();
        } else {
            bundle = null;
        }
        L3.LJLIL = bundle;
        L3().LJLILLLLZI = C212428Vi.LIZ(this);
        View findViewById = view.findViewById(R.id.gte);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.music_play_iv)");
        this.LJLJLLL = findViewById;
        C78897Uxp.LJJJJLI(findViewById, null);
        View findViewById2 = view.findViewById(R.id.gtp);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.music_stop_iv)");
        this.LJLL = findViewById2;
        C78897Uxp.LJJJJLI(findViewById2, null);
        MusicDetailRedesignV2Experiment.LIZ.getClass();
        FFL LJIIIZ = FFL.LJIIIZ();
        MusicDetailRedesignV2Experiment.RedesignFeature redesignFeature = MusicDetailRedesignV2Experiment.LIZIZ;
        LJIIIZ.getClass();
        MusicDetailRedesignV2Experiment.RedesignFeature redesignFeature2 = (MusicDetailRedesignV2Experiment.RedesignFeature) FFL.LJIJ(true, "music_detail_redesign_v2", 31744, MusicDetailRedesignV2Experiment.RedesignFeature.class, redesignFeature);
        if (redesignFeature2 == null || redesignFeature2.enlargePlayBtn) {
            View view2 = this.LJLJLLL;
            if (view2 != null) {
                AnonymousClass636.LJIIZILJ(view2, AnonymousClass391.LIZJ(28), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28))));
                View view3 = this.LJLL;
                if (view3 != null) {
                    AnonymousClass636.LJIIZILJ(view3, AnonymousClass391.LIZJ(28), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28))));
                } else {
                    o.LJIJI("musicStop");
                    throw null;
                }
            } else {
                o.LJIJI("musicPlay");
                throw null;
            }
        }
        View findViewById3 = view.findViewById(R.id.gt9);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.music_loading_iv)");
        this.LJLLI = findViewById3;
        AssemViewModel.asyncSubscribe$default(this.LJLLILLLL.getValue(), new TBT() { // from class: X.7Xi
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C187447Xg) obj).LJLIL;
            }
        }, null, null, null, new AqS169S0100000_3(this, 273), 14, null);
    }
}
