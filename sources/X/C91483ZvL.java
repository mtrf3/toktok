package X;

import Y.IDRunnableS88S0100000_29;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import kotlin.jvm.internal.IDqS173S0200000_29;
import kotlin.jvm.internal.o;

/* renamed from: X.ZvL, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91483ZvL implements InterfaceC91459Zux, InterfaceC91291ZsF, InterfaceC91290ZsE, InterfaceC91289ZsD {
    public C91605ZxJ LJLIL;

    @Override // X.InterfaceC91291ZsF
    public final void Kj(EnumC91307ZsV playMode) {
        o.LJIIIZ(playMode, "playMode");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onBufferingUpdate(float f) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlayableChanged(InterfaceC91296ZsK interfaceC91296ZsK) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepare() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepared() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onRenderStart() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onVideoSizeChanged(int i, int i2) {
    }

    public final C91605ZxJ LJIJI() {
        C91605ZxJ c91605ZxJ = this.LJLIL;
        if (c91605ZxJ != null) {
            return c91605ZxJ;
        }
        o.LJIJI("mediaPlayerService");
        throw null;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onCompletion() {
        LJIJJ(new C91299ZsN("PLAY_FROM_AUTO_PLAY_NEXT"));
    }

    @Override // X.InterfaceC91292ZsG
    public final void onAttach() {
        LJIJI().Mu(this);
        LJIJI().LJIILL(this);
        LJIJI().LJLJI.LJLIL.LJII(this);
    }

    @Override // X.InterfaceC91292ZsG
    public final void onDetach() {
        LJIJI().bK(this);
        LJIJI().LJI(this);
        LJIJI().LJLJI.LJLIL.LJIIL(this);
    }

    @Override // X.InterfaceC91291ZsF
    public final void Hz(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
    }

    @Override // X.InterfaceC91290ZsE
    public final boolean LJII(InterfaceC91296ZsK playable) {
        String str;
        o.LJIIIZ(playable, "playable");
        InterfaceC91296ZsK LIZ = LJIJI().LIZ();
        if (LIZ != null) {
            str = LIZ.getId();
        } else {
            str = null;
        }
        if (o.LJ(str, playable.getId())) {
            return true;
        }
        if (LJIJI().LJIJI().startPlaying() || LJIJI().LJIJI().isPauseState()) {
            LJIJI().LJJIFFI(new C91299ZsN("STOP_FROM_PLAYABLE_CHANGE"));
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC91290ZsE
    public final boolean LJIIL(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
        if (LJIJI().LJIJI().startPlaying()) {
            LJIJI().LJJIFFI(new C91299ZsN("STOP_FROM_PLAYABLE_QUEUE_CHANGE"));
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC91290ZsE
    public final boolean LJIILJJIL(EnumC91307ZsV playMode) {
        o.LJIIIZ(playMode, "playMode");
        return false;
    }

    public final void LJIJJ(C91299ZsN c91299ZsN) {
        InterfaceC91296ZsK LIZJ = LJIJI().LIZJ();
        if (LIZJ == null) {
            LJIJI().LJIILLIIL();
        } else {
            LJIJI().LJLILLLLZI.LJIIJJI(c91299ZsN, LIZJ);
            C91287ZsB.LIZ(LJIJI(), c91299ZsN, 2);
        }
    }

    public final void LJIJJLI(C91299ZsN c91299ZsN) {
        InterfaceC91296ZsK LJIIIIZZ = LJIJI().LJIIIIZZ();
        if (LJIIIIZZ == null) {
            return;
        }
        LJIJI().LJLILLLLZI.LJIIJJI(null, LJIIIIZZ);
        C91287ZsB.LIZ(LJIJI(), c91299ZsN, 2);
    }

    @Override // X.InterfaceC91291ZsF
    public final void Y50(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onError(C91304ZsS errorCode) {
        o.LJIIIZ(errorCode, "errorCode");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onLoadStateChanged(EnumC91305ZsT loadingState) {
        o.LJIIIZ(loadingState, "loadingState");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackStateChanged(EnumC91310ZsY currentState) {
        o.LJIIIZ(currentState, "currentState");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackTimeChanged(long j) {
        Long l;
        InterfaceC91296ZsK LIZ = LJIJI().LIZ();
        if (LIZ != null && LIZ.LJIILIIL()) {
            String id = LIZ.getId();
            String LIZIZ = LIZ.LIZIZ();
            if (((Integer) LIZ.LJIILLIIL().second) != null) {
                l = Long.valueOf(r0.intValue());
            } else {
                l = null;
            }
            if (j >= l.longValue()) {
                if (LJIJI().LJIJJLI() > 0) {
                    ExpiredPlayableManager.INSTANCE.writeExpiredPreviewPlayable$music_dsp_release(id, LIZIZ);
                }
                C1DH.LJJIJIIJI(new IDRunnableS88S0100000_29(this, 4));
            }
        }
    }

    @Override // X.InterfaceC91459Zux
    public final void setMediaPlayerService(C91605ZxJ c91605ZxJ) {
        this.LJLIL = c91605ZxJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC91291ZsF
    public final void a50(C91299ZsN c91299ZsN, InterfaceC91296ZsK playable) {
        String str;
        EnumC91310ZsY enumC91310ZsY;
        InterfaceC91298ZsM interfaceC91298ZsM;
        o.LJIIIZ(playable, "playable");
        String id = playable.getId();
        InterfaceC91296ZsK LIZ = LJIJI().LIZ();
        if (LIZ != null) {
            str = LIZ.getId();
        } else {
            str = null;
        }
        if (o.LJ(id, str)) {
            C91480ZvI c91480ZvI = LJIJI().LJLJI;
            C91330Zss c91330Zss = c91480ZvI.LJLILLLLZI;
            C91333Zsv c91333Zsv = c91480ZvI.LJLJI;
            c91333Zsv.getClass();
            C68322mC c68322mC = new C68322mC();
            c68322mC.element = playable;
            c91333Zsv.LJLIL.LIZIZ(new IDqS173S0200000_29(c68322mC, (C68322mC<InterfaceC91296ZsK>) playable, (InterfaceC91296ZsK) 3));
            InterfaceC91296ZsK interfaceC91296ZsK = (InterfaceC91296ZsK) c68322mC.element;
            c91330Zss.LJLJJL = 0;
            c91330Zss.LJLJJLL = false;
            c91330Zss.LJLJJI = null;
            if (c91330Zss.LJII()) {
                int i = c91330Zss.LJIIL().LIZIZ().LIZ.LJIIL;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                enumC91310ZsY = EnumC91310ZsY.PLAYBACK_STATE_STOPPED;
                            } else {
                                enumC91310ZsY = EnumC91310ZsY.PLAYBACK_STATE_ERROR;
                            }
                        } else {
                            enumC91310ZsY = EnumC91310ZsY.PLAYBACK_STATE_PAUSED;
                        }
                    } else {
                        enumC91310ZsY = EnumC91310ZsY.PLAYBACK_STATE_PLAYING;
                    }
                } else {
                    enumC91310ZsY = EnumC91310ZsY.PLAYBACK_STATE_STOPPED;
                }
            } else {
                enumC91310ZsY = EnumC91310ZsY.PLAYBACK_STATE_STOPPED;
            }
            if (enumC91310ZsY != EnumC91310ZsY.PLAYBACK_STATE_STOPPED) {
                c91330Zss.LJIILJJIL();
            }
            c91330Zss.LJLIL.onPlayableChanged(interfaceC91296ZsK);
            if (interfaceC91296ZsK != null) {
                interfaceC91298ZsM = interfaceC91296ZsK.LIZ();
            } else {
                interfaceC91298ZsM = null;
            }
            if (interfaceC91298ZsM instanceof C91469Zv7) {
                if (interfaceC91296ZsK != null) {
                    InterfaceC91298ZsM LIZ2 = interfaceC91296ZsK.LIZ();
                    o.LJII(LIZ2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.dsp.playerservice.entity.VideoModelPlayerDataSource");
                    C91469Zv7 c91469Zv7 = (C91469Zv7) LIZ2;
                    c91330Zss.LJIIL().LIZLLL();
                    c91330Zss.LJIIL().LJI(c91469Zv7.LIZ.getUrlPlayerInfo(), c91469Zv7.LIZ.getAuthorization(), c91469Zv7.LIZ.getVideoModel());
                }
            } else if (interfaceC91298ZsM instanceof C91468Zv6) {
                C91468Zv6 c91468Zv6 = (C91468Zv6) interfaceC91298ZsM;
                c91330Zss.LJIIL().LJ(c91468Zv6.LIZ, c91468Zv6.LIZIZ, c91468Zv6.LJ, c91468Zv6.LJFF);
            } else if (interfaceC91298ZsM instanceof C91465Zv3) {
                C91465Zv3 c91465Zv3 = (C91465Zv3) interfaceC91298ZsM;
                c91330Zss.LJIIL().LJ(c91465Zv3.LIZ, c91465Zv3.LIZIZ, c91465Zv3.LIZJ, c91465Zv3.LIZLLL);
            } else if (!(interfaceC91298ZsM instanceof C91466Zv4)) {
                if (interfaceC91298ZsM == null) {
                    c91330Zss.LJLIL.onError(C91304ZsS.LIZLLL);
                } else {
                    c91330Zss.LJLIL.onError(C91304ZsS.LIZJ);
                }
            } else {
                C91061ZoX LJIIL = c91330Zss.LJIIL();
                interfaceC91298ZsM.getClass();
                LJIIL.getClass();
                o.LJIIIZ(null, "fd");
                throw null;
            }
            c91330Zss.LJLJJI = interfaceC91296ZsK;
        }
    }

    @Override // X.InterfaceC91289ZsD
    public final void onSeekStateChanged(EnumC91311ZsZ seekState, long j) {
        o.LJIIIZ(seekState, "seekState");
    }
}
