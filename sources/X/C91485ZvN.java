package X;

import Y.IDfS125S0200000_29;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ZvN, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91485ZvN implements InterfaceC91459Zux, InterfaceC91291ZsF, InterfaceC91289ZsD, InterfaceC91288ZsC {
    public C91605ZxJ LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C91575Zwp.LJLIL);
    public final C73318Sq2 LJLJI = new C73318Sq2();

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptPause(C91299ZsN c91299ZsN) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptPlay(C91299ZsN c91299ZsN, InterfaceC91296ZsK interfaceC91296ZsK) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptResume(C91299ZsN c91299ZsN) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptSeek(long j) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptSetStartPlayTime(int i) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptStop(C91299ZsN c91299ZsN) {
        return false;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onBufferingUpdate(float f) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onCompletion() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlayableChanged(InterfaceC91296ZsK interfaceC91296ZsK) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackTimeChanged(long j) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepare() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepared() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onVideoSizeChanged(int i, int i2) {
    }

    public final C91605ZxJ LJII() {
        C91605ZxJ c91605ZxJ = this.LJLIL;
        if (c91605ZxJ != null) {
            return c91605ZxJ;
        }
        o.LJIJI("mediaPlayerService");
        throw null;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onRenderStart() {
        List<InterfaceC91296ZsK> LJIIIZ = LJII().LJIIIZ(null);
        ActivityStack.isAppBackGround();
        int i = 3;
        if (3 > LJIIIZ.size()) {
            i = LJIIIZ.size();
        }
        List<InterfaceC91296ZsK> subList = LJIIIZ.subList(0, i);
        if (subList.isEmpty()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("preload start ");
        LIZ.append(subList.size());
        X1D.LIZIZ(LIZ);
        for (InterfaceC91296ZsK interfaceC91296ZsK : subList) {
            if (interfaceC91296ZsK.LIZLLL()) {
                if (!interfaceC91296ZsK.LJIIIIZZ().getDspMusic().getPlayInfo().isExpire()) {
                    C91149Zpx.LIZIZ(interfaceC91296ZsK.LJIIIIZZ().getDspMusic().getPlayInfo(), null);
                } else {
                    C78999UzT.LJFF(C91074Zok.LIZ(interfaceC91296ZsK).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new IDfS125S0200000_29(this, interfaceC91296ZsK, 1), C91365ZtR.LJLIL), this.LJLJI);
                }
            } else {
                String key = C91149Zpx.LIZ(interfaceC91296ZsK);
                String originUrl = interfaceC91296ZsK.LJIILJJIL();
                o.LJIIIZ(key, "key");
                o.LJIIIZ(originUrl, "originUrl");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("key:");
                LIZ2.append(key);
                LIZ2.append(" start");
                X1D.LIZIZ(LIZ2);
                DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
                C47729IoH LJJII = dataLoaderHelper.LJJII(key);
                if (LJJII != null && LJJII.LIZIZ > 0) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("The key(");
                    LIZ3.append(key);
                    LIZ3.append(") already preloaded. preloadSize:");
                    LIZ3.append(C91149Zpx.LIZJ(Long.valueOf(LJJII.LIZIZ)));
                    LIZ3.append(", mediaSize:");
                    LIZ3.append(C91149Zpx.LIZJ(Long.valueOf(LJJII.LIZ)));
                    LIZ3.append(", filePath:");
                    LIZ3.append(LJJII.LIZJ);
                    X1D.LIZIZ(LIZ3);
                } else {
                    C47396Iiu c47396Iiu = new C47396Iiu(819200L, key, null, new String[]{originUrl});
                    c47396Iiu.LJIIIIZZ = new C91363ZtP(key);
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("preload, url:");
                    LIZ4.append(originUrl);
                    LIZ4.append(", key:");
                    LIZ4.append(key);
                    LIZ4.append(", size:");
                    LIZ4.append(819200L);
                    X1D.LIZIZ(LIZ4);
                    dataLoaderHelper.LJIILLIIL(c47396Iiu);
                }
            }
        }
    }

    @Override // X.InterfaceC91292ZsG
    public final void onAttach() {
        LJII().Mu(this);
        LJII().LJLJI.LJLIL.LJII(this);
        LJII().LJLJI.LJLJI.LJII(this);
    }

    @Override // X.InterfaceC91292ZsG
    public final void onDetach() {
        LJII().bK(this);
        LJII().LJLJI.LJLIL.LJIIL(this);
        LJII().LJLJI.LJLJI.LJIIL(this);
        this.LJLJI.dispose();
    }

    @Override // X.InterfaceC91291ZsF
    public final void Hz(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
    }

    @Override // X.InterfaceC91291ZsF
    public final void Kj(EnumC91307ZsV playMode) {
        o.LJIIIZ(playMode, "playMode");
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

    @Override // X.InterfaceC91288ZsC
    public final InterfaceC91296ZsK processPlayable(InterfaceC91296ZsK interfaceC91296ZsK) {
        boolean z;
        EnumC91153Zq1 enumC91153Zq1;
        InterfaceC91296ZsK LIZ = LJII().LIZ();
        if (LIZ == null) {
            return interfaceC91296ZsK;
        }
        InterfaceC91298ZsM interfaceC91298ZsM = null;
        if (interfaceC91296ZsK != null) {
            interfaceC91298ZsM = interfaceC91296ZsK.LIZ();
        }
        if (interfaceC91298ZsM instanceof C91468Zv6) {
            String key = C91149Zpx.LIZ(LIZ);
            this.LJLILLLLZI.getValue().getClass();
            o.LJIIIZ(key, "key");
            C47729IoH LJJII = C47148Ieu.LIZ.LJJII(key);
            if (LJJII != null) {
                long j = LJJII.LIZ;
                if (j > 0 && LJJII.LIZIZ == j) {
                    z = true;
                } else {
                    z = false;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Find preloaded resource associated with special key(");
                LIZ2.append(key);
                LIZ2.append("), detail is {");
                LIZ2.append(LJJII.LIZJ);
                LIZ2.append(", ");
                LIZ2.append(LJJII.LIZ);
                LIZ2.append(", ");
                LIZ2.append(LJJII.LIZIZ);
                LIZ2.append(", isComplete: ");
                LIZ2.append(z);
                LIZ2.append('}');
                X1D.LIZIZ(LIZ2);
                String str = LJJII.LIZJ;
                o.LJIIIIZZ(str, "cacheInfo.mLocalFilePath");
                if (z) {
                    enumC91153Zq1 = EnumC91153Zq1.FULL_PRELOADED;
                } else {
                    enumC91153Zq1 = EnumC91153Zq1.FRAGMENT_PRELOADED;
                }
                C91370ZtW c91370ZtW = new C91370ZtW(key, str, enumC91153Zq1);
                if (c91370ZtW.LJLILLLLZI.length() > 0 && new File(c91370ZtW.LJLILLLLZI).exists() && new File(c91370ZtW.LJLILLLLZI).length() > 0) {
                    C91468Zv6 c91468Zv6 = (C91468Zv6) interfaceC91298ZsM;
                    interfaceC91296ZsK.LIZJ(new C91465Zv3(c91468Zv6.LIZ, key, c91468Zv6.LJ, c91468Zv6.LJFF));
                }
            }
        }
        return interfaceC91296ZsK;
    }

    @Override // X.InterfaceC91459Zux
    public final void setMediaPlayerService(C91605ZxJ c91605ZxJ) {
        this.LJLIL = c91605ZxJ;
    }

    @Override // X.InterfaceC91291ZsF
    public final void a50(C91299ZsN c91299ZsN, InterfaceC91296ZsK playable) {
        o.LJIIIZ(playable, "playable");
        this.LJLILLLLZI.getValue().getClass();
        TTVideoEngineLog.d("TTVideoEngine", "<preload> cancel all preload task outside");
        C47148Ieu.LIZ.LJIJJ();
    }

    @Override // X.InterfaceC91289ZsD
    public final void onSeekStateChanged(EnumC91311ZsZ seekState, long j) {
        o.LJIIIZ(seekState, "seekState");
    }
}
