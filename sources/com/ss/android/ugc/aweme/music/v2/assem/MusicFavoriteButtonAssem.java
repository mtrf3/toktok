package com.ss.android.ugc.aweme.music.v2.assem;

import X.AnonymousClass030;
import X.AnonymousClass391;
import X.C110614Vt;
import X.C139825eE;
import X.C142425iQ;
import X.C16880lQ;
import X.C188727au;
import X.C1A7;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C26338AVi;
import X.C2K0;
import X.C36922EeM;
import X.C55096Ljo;
import X.C55230Lly;
import X.C61328O5c;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72194SVa;
import X.C72195SVb;
import X.C73411SrX;
import X.C78926UyI;
import X.C9BE;
import X.EV9;
import X.FMX;
import X.InterfaceC55235Lm3;
import X.InterfaceC82683Wch;
import X.SVL;
import X.SVX;
import X.SVZ;
import X.SY4;
import X.TBT;
import X.WHL;
import Y.ACListenerS18S1300000_12;
import Y.ACListenerS46S0200000_12;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility;
import com.ss.android.ugc.aweme.music.ab.MusicCollectUiStyleConfig;
import com.ss.android.ugc.aweme.music.model.TikTokMusicCollectInfo;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicCollectViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.prefab.FavoriteButtonAssem;
import com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MusicFavoriteButtonAssem extends FavoriteButtonAssem {
    public static final /* synthetic */ int LJZL = 0;
    public final C214298b3 LJLLI;
    public final C214298b3 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public C73411SrX LJZI;

    public MusicFavoriteButtonAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicCollectViewModel.class);
        this.LJLLI = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 785), C72194SVa.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(MusicDetailViewModel.class);
        this.LJLLILLLL = C78926UyI.LJ(this, LIZ2, c9be, new AqS162S0100000_12(LIZ2, 786), C72195SVb.INSTANCE, null);
        this.LJLLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 782));
        this.LJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 783));
        this.LJLLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 784));
        this.LJLLLLLL = C221108m2.LIZIZ(new SVZ(this));
    }

    public final String M3() {
        return (String) this.LJLLJ.getValue();
    }

    public final MusicCollectViewModel N3() {
        return (MusicCollectViewModel) this.LJLLI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.prefab.FavoriteButtonAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL == null) {
            return;
        }
        InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
        MusicCollectViewModel N3 = N3();
        C2K0 LIZ = C55096Ljo.LIZ(LIZJ, FavoriteAbility.class, null);
        if (LIZ == null) {
            C55096Ljo.LJIIJJI(LIZJ, N3, FavoriteAbility.class, null);
        } else {
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                if (invocationHandler instanceof EV9) {
                    ((EV9) invocationHandler).LIZ.add(N3);
                } else {
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                }
            } catch (IllegalArgumentException unused) {
                EV9 ev9 = new EV9();
                ev9.LIZ.add(N3);
                ev9.LIZ.add(LIZ);
                Object newProxyInstance = Proxy.newProxyInstance(FavoriteAbility.class.getClassLoader(), new Class[]{FavoriteAbility.class}, ev9);
                if (newProxyInstance != null) {
                    C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, FavoriteAbility.class, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility");
                }
            }
        }
        SY4 L3 = L3();
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = C61328O5c.LIZJ(6);
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        L3.setBackground(c110614Vt.LIZ(context));
        if (o.LJ(String.valueOf(getConfig().LJ.get("have_margin")), "true")) {
            C26338AVi.LJI(L3(), 0, AnonymousClass391.LIZJ(16), 0, AnonymousClass391.LIZJ(8), false, 16);
        }
        C16880lQ.LJJIZ(L3(), new ACListenerS46S0200000_12(this, LIZLLL, 13));
        final Context context2 = getContext();
        if (context2 != null) {
            SVX.LIZ.getClass();
            if (!((MusicCollectUiStyleConfig) SVX.LIZJ.getValue()).removeGuideTips && C1A7.LJIILJJIL().LIZJ("is_need_show_collect_guide", true)) {
                x3().postDelayed(new Runnable() { // from class: com.ss.android.ugc.aweme.music.v2.assem.MusicFavoriteButtonAssem$tryToShowCollectGuidePopup$1
                    public final void LIZ() {
                        if (MusicFavoriteButtonAssem.this._isViewValid) {
                            try {
                                C139825eE c139825eE = new C139825eE(context2);
                                c139825eE.LJI(WHL.TOP);
                                c139825eE.LIZIZ(MusicFavoriteButtonAssem.this.x3());
                                c139825eE.LJIIJJI(R.string.ig0);
                                final InterfaceC82683Wch LIZJ2 = c139825eE.LIZJ();
                                LIZJ2.show();
                                Fragment LIZLLL2 = C212428Vi.LIZLLL(MusicFavoriteButtonAssem.this);
                                if (LIZLLL2 != null) {
                                    InterfaceC55235Lm3 LIZJ3 = C55230Lly.LIZJ(LIZLLL2, null);
                                    PageHeaderScrollAbility pageHeaderScrollAbility = new PageHeaderScrollAbility() { // from class: com.ss.android.ugc.aweme.music.v2.assem.MusicFavoriteButtonAssem$tryToShowCollectGuidePopup$1.1
                                        @Override // com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility
                                        public final void SQ(int i) {
                                            InterfaceC82683Wch.this.dismiss();
                                        }
                                    };
                                    C2K0 LIZ2 = C55096Ljo.LIZ(LIZJ3, PageHeaderScrollAbility.class, null);
                                    if (LIZ2 == null) {
                                        C55096Ljo.LJIIJJI(LIZJ3, pageHeaderScrollAbility, PageHeaderScrollAbility.class, null);
                                        return;
                                    }
                                    try {
                                        InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(LIZ2);
                                        if (invocationHandler2 instanceof EV9) {
                                            ((EV9) invocationHandler2).LIZ.add(pageHeaderScrollAbility);
                                            return;
                                        }
                                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                                    } catch (IllegalArgumentException unused2) {
                                        EV9 ev92 = new EV9();
                                        ev92.LIZ.add(pageHeaderScrollAbility);
                                        ev92.LIZ.add(LIZ2);
                                        Object newProxyInstance2 = Proxy.newProxyInstance(PageHeaderScrollAbility.class.getClassLoader(), new Class[]{PageHeaderScrollAbility.class}, ev92);
                                        if (newProxyInstance2 != null) {
                                            C55096Ljo.LJIIJJI(LIZJ3, (PageHeaderScrollAbility) newProxyInstance2, PageHeaderScrollAbility.class, null);
                                            return;
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility");
                                    }
                                }
                            } catch (Exception e) {
                                C36922EeM.LIZ(e);
                            }
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ2;
                        try {
                            LIZ();
                        } finally {
                            if (LIZ2) {
                            }
                        }
                    }
                }, 300L);
                C1A7.LJIILJJIL().LJI("is_need_show_collect_guide", false);
                SVL.LIZIZ("1", "core", M3(), N3().LJLIL);
            }
        }
        AssemViewModel.asyncSubscribe$default(N3(), new TBT() { // from class: X.8SP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8SO) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS169S0100000_3(this, 274), null, new AqS178S0100000_12(this, 239), 8, null);
    }

    public final void O3(Context context, TikTokMusicCollectInfo tikTokMusicCollectInfo, String str) {
        View LIZLLL = AnonymousClass030.LIZLLL(context, R.layout.bux, null, false, "from(context).inflate(R.…rite_to_ttm, null, false)");
        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(tikTokMusicCollectInfo.getDeepLink()), "track_id");
        if (queryParameter == null) {
            queryParameter = "";
        }
        C16880lQ.LJIIJ(new ACListenerS18S1300000_12(context, tikTokMusicCollectInfo, this, queryParameter, 0), LIZLLL);
        C142425iQ c142425iQ = new C142425iQ(context);
        c142425iQ.LJI(WHL.BOTTOM);
        c142425iQ.LIZIZ(x3());
        c142425iQ.LIZ.LJIJ = LIZLLL;
        c142425iQ.LJIIJ(null, true);
        c142425iQ.LJIIIZ(R.attr.d5);
        c142425iQ.LIZJ().show();
        C1A7.LJIILJJIL().LJI(str, false);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "single_song");
        c188727au.LJIIIZ("music_id", N3().LJLIL);
        c188727au.LJIIIZ("group_id", M3());
        c188727au.LJIIIZ("process_id", (String) this.LJLLLL.getValue());
        c188727au.LJIIIZ("resso_track_id", queryParameter);
        c188727au.LJIIIZ("anchor_type", "ttm");
        FMX.LJIIL("favorite_sync_toast_show", c188727au.LIZ);
        SVL.LIZIZ("3", "music", M3(), N3().LJLIL);
    }
}
