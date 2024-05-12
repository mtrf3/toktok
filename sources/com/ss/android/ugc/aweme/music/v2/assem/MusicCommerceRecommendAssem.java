package com.ss.android.ugc.aweme.music.v2.assem;

import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C2K0;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.EV9;
import X.InterfaceC55235Lm3;
import X.InterfaceC65350Pko;
import X.N4R;
import X.OGU;
import X.OGV;
import X.TBT;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicCommerceRecommendViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MusicCommerceRecommendAssem extends DynamicAssem implements N4R, CommerceRecommendAbility {
    public static final /* synthetic */ int LJLLLL = 0;
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 262));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 263));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 260));
    public final C214298b3 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;

    public MusicCommerceRecommendAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicDetailViewModel.class);
        this.LJLLILLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 265), OGU.INSTANCE, null);
        this.LJLLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 266));
        this.LJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 261));
    }

    @Override // X.N4R
    public final void LLFII() {
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.CommerceRecommendAbility
    public final OGV VQ() {
        return (OGV) this.LJLLL.getValue();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        E3(viewStub);
        super.onCreateView();
    }

    @Override // X.N4R
    public final void LLILLL(MusicModel music) {
        o.LJIIIZ(music, "music");
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL == null) {
            return;
        }
        MusicCommerceRecommendViewModel musicCommerceRecommendViewModel = (MusicCommerceRecommendViewModel) ViewModelProviders.of(LIZLLL).get(MusicCommerceRecommendViewModel.class);
        music.getMusicId();
        musicCommerceRecommendViewModel.getClass();
        musicCommerceRecommendViewModel.LJLJI = music.getMusic();
        musicCommerceRecommendViewModel.LJLILLLLZI = true;
        ShootAbility shootAbility = (ShootAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), ShootAbility.class, null);
        if (shootAbility != null) {
            shootAbility.mj();
        }
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        assembleChildren();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL == null) {
            return;
        }
        InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
        C2K0 LIZ = C55096Ljo.LIZ(LIZJ, CommerceRecommendAbility.class, null);
        if (LIZ == null) {
            C55096Ljo.LJIIJJI(LIZJ, this, CommerceRecommendAbility.class, null);
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
                Object newProxyInstance = Proxy.newProxyInstance(CommerceRecommendAbility.class.getClassLoader(), new Class[]{CommerceRecommendAbility.class}, ev9);
                if (newProxyInstance != null) {
                    C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, CommerceRecommendAbility.class, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.music.v2.assem.CommerceRecommendAbility");
                }
            }
        }
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLLILLLL.getValue(), new TBT() { // from class: X.OGX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C187447Xg) obj).LJLIL;
            }
        }, null, null, new AqS160S0100000_10(this, 264), new AqS141S0200000_10((MusicCommerceRecommendViewModel) ViewModelProviders.of(LIZLLL).get(MusicCommerceRecommendViewModel.class), this, 16), 6, null);
    }
}
