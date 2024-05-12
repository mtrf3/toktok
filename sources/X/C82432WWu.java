package X;

import Y.ACListenerS31S0101000_14;
import Y.ACallableS83S0101000_12;
import Y.AObserverS77S0200000_14;
import Y.ARunnableS50S0100000_14;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.sticker.model.CommerceSticker;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import com.ss.android.ugc.aweme.sticker.types.game.GameResultViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.WWu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82432WWu implements WX2 {
    public final InterfaceC83624Wrs LIZ;
    public final InterfaceC82434WWw LIZIZ;
    public final C72869Sin LIZJ;
    public final C29S LIZLLL;
    public Effect LJ;
    public boolean LJFF;
    public long LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public final ViewModelProvider LJIIJ;
    public final WX4 LJIIJJI;
    public final WX5 LJIIL;
    public final InterfaceC45540Hu4 LJIILIIL;
    public final C82433WWv LJIILJJIL;
    public final java.util.Map<String, CommerceSticker> LJIILL;

    @Override // X.WX2
    public final void LIZIZ() {
        this.LJFF = false;
        this.LIZIZ.LJ();
    }

    public final ShortVideoContext LIZLLL() {
        return ((ShortVideoContextViewModel) this.LJIIJ.get(ShortVideoContextViewModel.class)).LJLIL;
    }

    @Override // X.WX2
    public final void onDestroy() {
        this.LJIILIIL.unRegisterActivityOnKeyDownListener(this.LJIILJJIL);
    }

    @Override // X.WX2
    public final void startPlay() {
        if (this.LIZ.LLZLLLL()) {
            return;
        }
        ((C82435WWx) this.LJIIL).LIZ.nr0(true, false);
        this.LJFF = true;
        if (this.LJI == 0) {
            this.LJI = LIZLLL().cameraComponentModel.mMaxDuration;
        }
        this.LIZIZ.LIZIZ();
        ShortVideoContext LIZLLL = LIZLLL();
        if (!LIZLLL.isStory) {
            LIZLLL.cameraComponentModel.mMaxDuration = 2147483647L;
        }
        CameraComponentModel cameraComponentModel = LIZLLL.cameraComponentModel;
        cameraComponentModel.recordMode = 1;
        if (cameraComponentModel.gameDuetResource != null) {
            this.LIZ.LJJIJL(4103, r0.gameScore, 0L, "");
        }
        TextView textView = this.LIZJ.LIZLLL;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.LJIIJJI.getClass();
        SharedPreferences.Editor edit = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        edit.putInt("record_mode", 1);
        WX6.LIZ(edit);
        C82435WWx c82435WWx = (C82435WWx) this.LJIIL;
        c82435WWx.LIZ.Ah0(new HYN(EnumC82528WaC.NORMAL));
        c82435WWx.LIZ.r10(new C44237HXt(1));
    }

    public final void LIZJ(String str) {
        if (this.LJI > 0) {
            LIZLLL().cameraComponentModel.mMaxDuration = this.LJI;
            this.LJI = 0L;
        }
        if (this.LJIIIIZZ) {
            return;
        }
        ((C82435WWx) this.LJIIL).LIZ.nr0(true, false);
        TextView textView = this.LIZJ.LIZLLL;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C72869Sin c72869Sin = this.LIZJ;
        View view = c72869Sin.LIZIZ;
        if (view != null) {
            view.setVisibility(8);
            C16880lQ.LJLLLL(c72869Sin.LIZIZ, c72869Sin.LIZJ);
        }
        this.LJII = false;
        ((GameResultViewModel) this.LJIIJ.get(GameResultViewModel.class)).LJLILLLLZI = false;
        C82398WVm.LJI(((C82436WWy) this.LJIIJJI).LIZIZ, null);
        LIZLLL().cameraComponentModel.recordMode = 0;
        if (LIZLLL().cameraComponentModel.mWorkspace.getMusicPath() != null) {
            this.LIZ.LLZL(true);
            this.LIZ.pauseEffectAudio(true);
            this.LIZ.w4(true);
            this.LIZ.LLZZJLIL(LIZLLL().cameraComponentModel.LJI(), LIZLLL().cameraComponentModel.mTotalRecordingTime, LIZLLL().cameraComponentModel.mWorkspace.getMusicPath(), false, false);
        } else {
            this.LIZ.LLZL(false);
        }
        this.LIZ.A9(true);
        if (LIZLLL().cameraComponentModel.gameDuetResource != null) {
            ShortVideoContext shortVideoContext = LIZLLL();
            o.LJIIIZ(shortVideoContext, "shortVideoContext");
            H8V.LIZ(str, shortVideoContext);
            ((C82435WWx) this.LJIIL).LIZ.Ti0(false);
        } else {
            this.LIZIZ.LIZLLL(this.LJ);
        }
        this.LJ = null;
    }

    public final void LJ(String str) {
        if (this.LJIIIIZZ) {
            if (this.LJI > 0) {
                LIZLLL().cameraComponentModel.mMaxDuration = this.LJI;
                this.LJI = 0L;
                return;
            }
            return;
        }
        this.LJFF = false;
        C82435WWx c82435WWx = (C82435WWx) this.LJIIL;
        I3X i3x = c82435WWx.LIZ;
        I9L i9l = new I9L("quit game");
        i9l.LIZ = 6;
        i9l.LJ = new ARunnableS50S0100000_14(c82435WWx, 237);
        i3x.Ec0(i9l);
        LIZLLL().cameraComponentModel.recordMode = 0;
        int i = this.LJIIIZ;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.LIZIZ.LIZ(this.LJ);
            return;
        }
        LIZJ(str);
    }

    @Override // X.WX2
    public final void LIZ(int i, final Effect effect, String str) {
        this.LJIIIZ = i;
        this.LJ = effect;
        this.LIZIZ.LIZJ(effect);
        this.LJII = true;
        this.LJIIIIZZ = false;
        ((GameResultViewModel) this.LJIIJ.get(GameResultViewModel.class)).LJLILLLLZI = true;
        C72869Sin c72869Sin = this.LIZJ;
        if (c72869Sin.LIZIZ == null) {
            FrameLayout parent = c72869Sin.LIZJ;
            o.LJIIIZ(parent, "parent");
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.bnl, parent, false);
            o.LJIIIIZZ(LLLLIILL, "from(parent.context).inf…game_play, parent, false)");
            c72869Sin.LIZIZ = LLLLIILL;
            C16880lQ.LJIILLIIL((ImageView) LLLLIILL.findViewById(R.id.eju), new ACListenerS31S0101000_14(2, c72869Sin, 3));
        }
        c72869Sin.LIZJ.removeAllViews();
        c72869Sin.LIZJ.addView(c72869Sin.LIZIZ);
        View view = c72869Sin.LIZIZ;
        if (view != null) {
            view.setVisibility(0);
        }
        final C72869Sin c72869Sin2 = this.LIZJ;
        if (!C44172HVg.LJIJ.isChildrenMode() && effect != null && effect.isBusiness()) {
            if (((HashMap) this.LJIILL).containsKey(effect.getEffectId())) {
                if (((HashMap) this.LJIILL).get(effect.getEffectId()) != null && !this.LJFF) {
                    c72869Sin2.LIZ(((CommerceSticker) ((HashMap) this.LJIILL).get(effect.getEffectId())).getScreenDesc());
                }
            }
            final String effectId = effect.getEffectId();
            C10K.LIZJ(new ACallableS83S0101000_12(1, effectId, 1)).LJ(new C10I() { // from class: X.Sih
                @Override // X.C10I
                public final Object then(C10K c10k) {
                    C82432WWu c82432WWu = C82432WWu.this;
                    Effect effect2 = effect;
                    String str2 = effectId;
                    C72869Sin c72869Sin3 = c72869Sin2;
                    c82432WWu.getClass();
                    if (!TextUtils.equals(effect2.getEffectId(), str2) || c10k.LJIIL() || c10k.LJIILJJIL()) {
                        return null;
                    }
                    try {
                        CommerceSticker commerceSticker = ((NewFaceStickerBean) ListProtector.get(((NewFaceStickerListBean) c10k.LJIIJJI()).mStickers, 0)).commerceSticker;
                        ((HashMap) c82432WWu.LJIILL).put(str2, commerceSticker);
                        if (c82432WWu.LJFF) {
                            return null;
                        }
                        c72869Sin3.LIZ(commerceSticker.getScreenDesc());
                        return null;
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                        return null;
                    }
                }
            }, C10K.LJIIIIZZ, null);
        }
        this.LIZ.LLZL(false);
        this.LIZ.pauseEffectAudio(false);
        this.LIZ.w4(false);
        this.LIZ.LLZZJLIL(0L, 0L, "", false, false);
        this.LIZ.A9(false);
        if (!this.LJFF) {
            HashMap hashMap = new HashMap();
            hashMap.put("prop_id", effect.getEffectId());
            hashMap.put("shoot_way", LIZLLL().shootWay);
            hashMap.put("creation_id", LIZLLL().LJI());
            C60903NvH.LJIIJJI().LJJIIZI().LIZIZ("enter_prop_game_page", hashMap);
        }
        if (this.LJ == null) {
            return;
        }
        VJH LIZ = VJG.LIZ(this.LIZLLL, "VideoRecord");
        int i2 = LIZ.LIZ.getInt(this.LJ.getEffectId(), 0);
        this.LIZ.LJJIJL(46, 1L, i2, str);
        String effectId2 = this.LJ.getEffectId();
        int i3 = i2 + 1;
        if (LIZ.LIZIZ == null) {
            LIZ.LIZIZ = LIZ.LIZ.edit();
        }
        LIZ.LIZIZ.putInt(effectId2, i3).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.5HC, X.WWv] */
    public C82432WWu(C29S c29s, InterfaceC45540Hu4 interfaceC45540Hu4, InterfaceC82086WJm interfaceC82086WJm, C72869Sin c72869Sin, C82436WWy c82436WWy, C82435WWx c82435WWx, InterfaceC82434WWw interfaceC82434WWw, C82622Wbi c82622Wbi) {
        ?? r1 = new C5HC() { // from class: X.WWv
            @Override // X.C5HC
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                C82432WWu c82432WWu = C82432WWu.this;
                if (!c82432WWu.LJII || i != 4) {
                    return false;
                }
                if (c82432WWu.LJFF) {
                    c82432WWu.LJ("system_back_button");
                } else {
                    c82432WWu.LIZJ("system_back_button");
                }
                return true;
            }
        };
        this.LJIILJJIL = r1;
        this.LJIILL = new HashMap();
        this.LIZ = interfaceC82086WJm.e8();
        this.LIZIZ = interfaceC82434WWw;
        this.LIZLLL = c29s;
        this.LJIIJJI = c82436WWy;
        this.LJIIL = c82435WWx;
        this.LJIILIIL = interfaceC45540Hu4;
        interfaceC45540Hu4.registerActivityOnKeyDownListener(r1);
        this.LIZJ = c72869Sin;
        c72869Sin.LIZ = new WX0(this);
        ViewModelProvider viewModelProvider = (ViewModelProvider) c82622Wbi.LJ(ViewModelProvider.class, null);
        this.LJIIJ = viewModelProvider;
        GameResultViewModel gameResultViewModel = (GameResultViewModel) viewModelProvider.get(GameResultViewModel.class);
        if (gameResultViewModel.LJLIL == null) {
            gameResultViewModel.LJLIL = new MutableLiveData<>();
        }
        gameResultViewModel.LJLIL.observe((LifecycleOwner) c82622Wbi.LJ(LifecycleOwner.class, null), new AObserverS77S0200000_14(this, c82435WWx, 3));
    }
}
