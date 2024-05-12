package X;

import Y.IDObserverS225S0100000;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.effect.navi.NaviAvatarListPresenter;
import com.bytedance.android.live.effect.navi.NaviAvatarListViewModel;
import com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNaviAvatarAutoCreationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNaviPrefabEffectNameSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1XH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XH implements C0TW {
    public final Fragment LIZ;
    public C23120vU LIZIZ;
    public ViewGroup LIZJ;
    public final NaviAvatarListPresenter LIZLLL;

    @Override // X.C0TW
    public final void LIZ(String panel) {
        o.LJIIIZ(panel, "panel");
    }

    @Override // X.C0TW
    public final void LIZJ(String str) {
    }

    @Override // X.C0TW
    public final void LJII(InterfaceC88471Ynr<? super String, ? super String, Integer> interfaceC88471Ynr) {
    }

    @Override // X.C0TW
    public final void onDestroy() {
    }

    public final C23120vU LJIIIZ() {
        C23120vU c23120vU = this.LIZIZ;
        if (c23120vU == null) {
            Context context = this.LIZ.getContext();
            if (context != null) {
                C23120vU c23120vU2 = new C23120vU(context);
                NaviAvatarListPresenter presenter = this.LIZLLL;
                Fragment fragment = this.LIZ;
                o.LJIIIZ(presenter, "presenter");
                o.LJIIIZ(fragment, "fragment");
                c23120vU2.LJLJJI = presenter;
                presenter.LJLJJL.LJLILLLLZI.observe(fragment, new IDObserverS225S0100000(c23120vU2, 13));
                if (!LiveNaviAvatarAutoCreationSetting.INSTANCE.isExperiment() && DataChannelGlobal.LJLJJI.mv0(BroadcastSceneGlobalChannel.class) != C37.PREVIEW) {
                    C29306Beo.LJI(c23120vU2.LJLIL);
                }
                this.LIZLLL.LJLJJI = c23120vU2;
                this.LIZIZ = c23120vU2;
                return c23120vU2;
            }
            return null;
        }
        return c23120vU;
    }

    @Override // X.C0TW
    public final void LIZLLL() {
        C23120vU LJIIIZ = LJIIIZ();
        if (LJIIIZ != null) {
            C29306Beo.LJI(LJIIIZ);
            NaviAvatarListPresenter naviAvatarListPresenter = LJIIIZ.LJLJJI;
            if (naviAvatarListPresenter != null) {
                naviAvatarListPresenter.LJLJL = false;
                naviAvatarListPresenter.LJLLILLLL = false;
                naviAvatarListPresenter.LJLJLLL = false;
                C18420nu.LIZ = null;
                C18440nw c18440nw = naviAvatarListPresenter.LJLJJLL;
                if (c18440nw != null) {
                    c18440nw.LIZJ();
                }
                naviAvatarListPresenter.LJLJJLL = null;
                naviAvatarListPresenter.LJ();
                return;
            }
            o.LJIJI("presenter");
            throw null;
        }
    }

    @Override // X.C0TW
    public final void LIZIZ(LiveEffect liveEffect) {
        ViewGroup viewGroup = this.LIZJ;
        if (viewGroup != null) {
            LJIIIIZZ(viewGroup);
        }
        if (liveEffect != null) {
            ViewGroup viewGroup2 = this.LIZJ;
            if (viewGroup2 != null) {
                C29306Beo.LJJLJLI(viewGroup2);
            }
            C23120vU LJIIIZ = LJIIIZ();
            if (LJIIIZ != null) {
                C29306Beo.LJJLJLI(LJIIIZ);
                NaviAvatarListPresenter naviAvatarListPresenter = LJIIIZ.LJLJJI;
                if (naviAvatarListPresenter != null) {
                    Effect effect = liveEffect.getEffect();
                    if (effect != null && !C0TZ.LIZ(effect.getSdkExtra(), "has_avatar_head", true) && naviAvatarListPresenter.LJLJJL.LJLJI.getValue() == null) {
                        naviAvatarListPresenter.LJLJLLL = true;
                        NaviAvatarListViewModel naviAvatarListViewModel = naviAvatarListPresenter.LJLJJL;
                        naviAvatarListViewModel.getClass();
                        C1KJ.LIZIZ.checkPanelIsUpdate("navi", new C1KP(new C43441nA(naviAvatarListViewModel, LiveNaviPrefabEffectNameSetting.INSTANCE.getValue())));
                        return;
                    }
                    return;
                }
                o.LJIJI("presenter");
                throw null;
            }
        }
    }

    @Override // X.C0TW
    public final boolean LJFF(LiveEffect liveEffect) {
        return C78880UxY.LJJJZ(liveEffect);
    }

    public final void LJIIIIZZ(ViewGroup viewGroup) {
        ViewParent viewParent;
        if (LJIIIZ() == null) {
            return;
        }
        View view = null;
        try {
            C23120vU LJIIIZ = LJIIIZ();
            if (LJIIIZ != null) {
                viewParent = LJIIIZ.getParent();
            } else {
                viewParent = null;
            }
            o.LJII(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(LJIIIZ(), (ViewGroup) viewParent);
        } catch (Exception unused) {
        }
        View LJIIIZ2 = LJIIIZ();
        if (LJIIIZ2 != null) {
            C29306Beo.LJI(LJIIIZ2);
            LJIIIZ2.setAlpha(1.0f);
            view = LJIIIZ2;
        }
        C018905p c018905p = new C018905p(-1, C15380j0.LIZ(66.0f));
        c018905p.bottomToBottom = viewGroup.getId();
        viewGroup.addView(view, c018905p);
    }

    @Override // X.C0TW
    public final void LJ(LiveEffect liveEffect, String panel) {
        o.LJIIIZ(panel, "panel");
        C23120vU LJIIIZ = LJIIIZ();
        if (LJIIIZ != null) {
            NaviAvatarListPresenter naviAvatarListPresenter = LJIIIZ.LJLJJI;
            if (naviAvatarListPresenter != null) {
                if (naviAvatarListPresenter.LJLJJL.LJLILLLLZI.getValue() != null && (!r0.isEmpty())) {
                    return;
                }
                NaviAvatarListPresenter naviAvatarListPresenter2 = LJIIIZ.LJLJJI;
                if (naviAvatarListPresenter2 != null) {
                    naviAvatarListPresenter2.LJLJJL.gv0();
                    return;
                } else {
                    o.LJIJI("presenter");
                    throw null;
                }
            }
            o.LJIJI("presenter");
            throw null;
        }
    }

    @Override // X.C0TW
    public final void LJI(ViewGroup parent, boolean z) {
        C23120vU LJIIIZ;
        o.LJIIIZ(parent, "parent");
        List<LiveEffect> LIZ = C12890ez.LIZ().LIZ(C0TY.LIZIZ);
        o.LJIIIIZZ(LIZ, "LiveComposerManagerProvi…cker(EffectPanel.STICKER)");
        if (!C78880UxY.LJJJZ((LiveEffect) ORZ.LJLLLL(LIZ))) {
            List<LiveEffect> LIZ2 = C12890ez.LIZ().LIZ(C0TY.LIZJ);
            o.LJIIIIZZ(LIZ2, "LiveComposerManagerProvi…ctPanel.STICKER_INTERACT)");
            if (!C78880UxY.LJJJZ((LiveEffect) ORZ.LJLLLL(LIZ2))) {
                return;
            }
        }
        LJIIIIZZ(parent);
        C23120vU LJIIIZ2 = LJIIIZ();
        if (LJIIIZ2 != null) {
            C29306Beo.LJJLJLI(LJIIIZ2);
            if (z && (LJIIIZ = LJIIIZ()) != null) {
                C29306Beo.LJI(LJIIIZ.LJLIL);
            }
        }
    }

    public C1XH(DataChannel dataChannel, Fragment fragment, InterfaceC08020Te effectWrapper) {
        o.LJIIIZ(effectWrapper, "effectWrapper");
        this.LIZ = fragment;
        this.LIZLLL = new NaviAvatarListPresenter(dataChannel, fragment, effectWrapper);
    }
}
