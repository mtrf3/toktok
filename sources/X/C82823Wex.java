package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Wex, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82823Wex {
    public final C82622Wbi LIZ;
    public final ShortVideoContext LIZIZ;
    public final I0N LIZJ;
    public final InterfaceC46131I8p LIZLLL;
    public final I27 LJ;
    public final WRQ LJFF;
    public final I9W LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final C29S LJIIIZ;
    public final I19 LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final C82824Wey LJIIL;
    public final C82825Wez LJIILIIL;
    public final C82832Wf6 LJIILJJIL;

    public final void LIZJ() {
        EnumC82835Wf9 enumC82835Wf9;
        EnumC82835Wf9 enumC82835Wf92;
        InterfaceC46131I8p interfaceC46131I8p;
        InterfaceC46131I8p interfaceC46131I8p2 = this.LIZLLL;
        EnumC82835Wf9 enumC82835Wf93 = null;
        if (interfaceC46131I8p2 != null) {
            enumC82835Wf9 = interfaceC46131I8p2.qJ();
        } else {
            enumC82835Wf9 = null;
        }
        EnumC82835Wf9 enumC82835Wf94 = EnumC82835Wf9.REUSE_SOUND;
        if (enumC82835Wf9 == enumC82835Wf94) {
            I19 i19 = this.LJIIJ;
            if (i19.LIZLLL && i19.LIZIZ != null) {
                this.LIZLLL.kb0(enumC82835Wf94);
                this.LIZLLL.IN(true);
                return;
            } else {
                I27 i27 = this.LJ;
                if (i27 == null) {
                    return;
                }
                i27.setUiLoadingMusic(false);
                return;
            }
        }
        InterfaceC46131I8p interfaceC46131I8p3 = this.LIZLLL;
        if (interfaceC46131I8p3 != null) {
            enumC82835Wf92 = interfaceC46131I8p3.qJ();
        } else {
            enumC82835Wf92 = null;
        }
        EnumC82835Wf9 enumC82835Wf95 = EnumC82835Wf9.REUSE_EFFECT;
        if (enumC82835Wf92 == enumC82835Wf95) {
            I19 i192 = this.LJIIJ;
            if (i192.LJ && i192.LIZ != null) {
                this.LIZLLL.kb0(enumC82835Wf95);
                this.LIZLLL.IN(true);
                return;
            } else {
                this.LIZLLL.aX(false);
                return;
            }
        }
        I19 i193 = this.LJIIJ;
        if (!i193.LJ || !i193.LIZLLL) {
            return;
        }
        Effect effect = i193.LIZ;
        if (effect != null && i193.LIZIZ != null) {
            InterfaceC46131I8p interfaceC46131I8p4 = this.LIZLLL;
            if (interfaceC46131I8p4 != null) {
                interfaceC46131I8p4.kb0(EnumC82835Wf9.REUSE_SOUND_AND_EFFECT);
            }
        } else if (i193.LIZIZ != null) {
            InterfaceC46131I8p interfaceC46131I8p5 = this.LIZLLL;
            if (interfaceC46131I8p5 != null) {
                interfaceC46131I8p5.kb0(enumC82835Wf94);
            }
        } else if (effect != null) {
            InterfaceC46131I8p interfaceC46131I8p6 = this.LIZLLL;
            if (interfaceC46131I8p6 != null) {
                interfaceC46131I8p6.kb0(enumC82835Wf95);
            }
        } else {
            InterfaceC46131I8p interfaceC46131I8p7 = this.LIZLLL;
            if (interfaceC46131I8p7 != null) {
                interfaceC46131I8p7.kb0(EnumC82835Wf9.REUSE_NONE);
            }
            InterfaceC46131I8p interfaceC46131I8p8 = this.LIZLLL;
            if (interfaceC46131I8p8 != null) {
                interfaceC46131I8p8.aX(false);
            }
            I27 i272 = this.LJ;
            if (i272 != null) {
                i272.setUiLoadingMusic(false);
            }
        }
        InterfaceC46131I8p interfaceC46131I8p9 = this.LIZLLL;
        if (interfaceC46131I8p9 != null) {
            enumC82835Wf93 = interfaceC46131I8p9.ye();
        }
        if (enumC82835Wf93 == EnumC82835Wf9.REUSE_NONE || (interfaceC46131I8p = this.LIZLLL) == null) {
            return;
        }
        interfaceC46131I8p.IN(true);
    }

    public final void LIZIZ(String str) {
        String str2;
        if (str != null) {
            C82824Wey c82824Wey = this.LJIIL;
            I0N i0n = this.LIZJ;
            List LJJIJ = C47261Igj.LJJIJ(str);
            HashMap hashMap = new HashMap();
            String str3 = this.LIZIZ.creativeModel.recordEffectModel.stickerFrom;
            if (str3 != null && str3.length() > 0) {
                hashMap.put(WM7.SCENE_SERVICE, str3);
            }
            Object LJLLLLLL = ORZ.LJLLLLLL(0, (List) this.LIZ.LJ(ArrayList.class, "gradleKey"));
            if ((LJLLLLLL instanceof String) && (str2 = (String) LJLLLLLL) != null && str2.length() > 0) {
                hashMap.put("grade_key", str2);
            }
            C82398WVm.LIZIZ(i0n, LJJIJ, hashMap, new C82838WfC(c82824Wey));
        }
    }

    public final void LIZ(AVMusic aVMusic, String str) {
        this.LJII = false;
        I27 i27 = this.LJ;
        if (i27 != null) {
            i27.onChooseMusicDone(false, "previous_video_reuse", aVMusic, str);
        }
        I27 i272 = this.LJ;
        if (i272 != null) {
            i272.handleChooseMusic(C145385nC.LIZ(Boolean.FALSE, "previous_video_reuse", aVMusic, str, null, 0L, 0L, 112));
        }
        I9T.LJI(aVMusic, false, this.LIZIZ.creativeModel.musicBuzModel);
        AVMusic aVMusic2 = this.LJIIJ.LIZIZ;
        if (aVMusic2 != null) {
            this.LIZIZ.cameraComponentModel.mMusicStart = aVMusic2.getMusicBeginTime();
        }
        I27 i273 = this.LJ;
        if (i273 != null) {
            i273.changeCancelMusicBtnVisible(true);
        }
    }

    public C82823Wex(C82622Wbi diContainer, ShortVideoContext shortVideoContext, I0N stickerApiComponent, C82822Wew c82822Wew, I27 i27, WRQ wrq, I9W stickerCoreApi) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(stickerApiComponent, "stickerApiComponent");
        o.LJIIIZ(stickerCoreApi, "stickerCoreApi");
        this.LIZ = diContainer;
        this.LIZIZ = shortVideoContext;
        this.LIZJ = stickerApiComponent;
        this.LIZLLL = c82822Wew;
        this.LJ = i27;
        this.LJFF = wrq;
        this.LJI = stickerCoreApi;
        this.LJIIIZ = (C29S) diContainer.LJ(C29S.class, null);
        this.LJIIJ = new I19(0);
        this.LJIIJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 893));
        this.LJIIL = new C82824Wey(this);
        this.LJIILIIL = new C82825Wez(this);
        this.LJIILJJIL = new C82832Wf6(this);
    }
}
