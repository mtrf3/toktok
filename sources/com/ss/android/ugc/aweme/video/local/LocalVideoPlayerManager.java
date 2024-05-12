package com.ss.android.ugc.aweme.video.local;

import X.C09650Zl;
import X.C10I;
import X.C10K;
import X.C16880lQ;
import X.C33724DLk;
import X.C47647Imx;
import X.C47651In1;
import X.C78596Usy;
import X.DPB;
import X.EF7;
import X.EIT;
import X.F9J;
import X.FFL;
import X.HG3;
import X.InterfaceC47650In0;
import X.RBX;
import Y.ACallableS6S2000000_8;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import defpackage.e1;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public class LocalVideoPlayerManager implements GenericLifecycleObserver {
    public static LocalVideoPlayerManager LJLJI;
    public static volatile Boolean LJLJJI;
    public final C47651In1 LJLIL = new C47651In1();
    public final AtomicBoolean LJLILLLLZI = new AtomicBoolean(false);

    public static Map LJII() {
        try {
            String string = F9J.LIZIZ(EF7.LIZIZ(), 0, "aweme_local_video").getString("extra_data", null);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return (Map) C09650Zl.LIZIZ.LJII(string, new C47647Imx().getType());
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    static {
        C16880lQ.LJLLJ(LocalVideoPlayerManager.class);
        LJLJJI = null;
    }

    public static LocalVideoPlayerManager LIZLLL() {
        if (LJLJI == null) {
            synchronized (LocalVideoPlayerManager.class) {
                if (LJLJI == null) {
                    LJLJI = new LocalVideoPlayerManager();
                }
            }
        }
        return LJLJI;
    }

    public static boolean LJ() {
        if (C78596Usy.LJJIJL(C33724DLk.LJLIL, DPB.LIZJ())) {
            Boolean bool = LJLJJI;
            if (bool != null) {
                return bool.booleanValue();
            }
            synchronized (LocalVideoPlayerManager.class) {
                Boolean bool2 = LJLJJI;
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                FFL.LJIIIZ().getClass();
                Boolean valueOf = Boolean.valueOf(FFL.LJ(31744, "is_local_video_play_enable", true, true));
                LJLJJI = valueOf;
                return valueOf.booleanValue();
            }
        }
        return e1.LIZ(31744, "is_local_video_play_enable", true, true);
    }

    public final void LIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        if (!LJ()) {
            return;
        }
        if (!this.LJLILLLLZI.get()) {
            if (C78596Usy.LJJIJL(C33724DLk.LJLIL, DPB.LIZJ())) {
                synchronized (this) {
                    if (!this.LJLILLLLZI.get()) {
                        Map LJII = LJII();
                        if (this.LJLILLLLZI.compareAndSet(false, true) && LJII != null && !LJII.isEmpty()) {
                            this.LJLIL.LJFF(LJII.values());
                        }
                    }
                }
            } else {
                Map LJII2 = LJII();
                synchronized (this) {
                    if (this.LJLILLLLZI.compareAndSet(false, true) && LJII2 != null && !LJII2.isEmpty()) {
                        this.LJLIL.LJFF(LJII2.values());
                    }
                }
            }
        }
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            EIT.LIZ("default").LIZIZ(System.currentTimeMillis() - currentTimeMillis, "LocalVideoPlayerManager:ensureRestoreDataState");
        }
    }

    public final void LJFF() {
        try {
            LIZ();
            SharedPreferences LIZIZ = F9J.LIZIZ(EF7.LIZIZ(), 0, "aweme_local_video");
            LIZIZ.edit().putString("extra_data", C09650Zl.LIZIZ.LJIILL(this.LJLIL.LIZ)).apply();
        } catch (Throwable unused) {
        }
    }

    public final String LIZIZ(VideoUrlModel videoUrlModel) {
        String LIZJ = LIZJ(videoUrlModel.getSourceId());
        if (TextUtils.isEmpty(LIZJ)) {
            return LIZJ;
        }
        LocalVideoUrlModel LIZIZ = this.LJLIL.LIZIZ(videoUrlModel.getSourceId());
        if (LIZIZ == null) {
            return LIZJ;
        }
        String uri = LIZIZ.getUri();
        String uri2 = videoUrlModel.getUri();
        if (uri != null && uri2 != null && !TextUtils.equals(uri.split("_")[0], uri2.split("_")[0])) {
            this.LJLIL.LJI(LIZIZ.getSourceId());
            return null;
        }
        return LIZJ;
    }

    public final String LIZJ(String str) {
        LocalVideoUrlModel LIZIZ;
        LIZ();
        if (TextUtils.isEmpty(str) || !LJ() || (LIZIZ = this.LJLIL.LIZIZ(str)) == null || !TextUtils.equals(LIZIZ.authorId, ((RBX) HG3.LJIILL()).getCurUserId())) {
            return null;
        }
        LocalVideoUrlModel LIZIZ2 = this.LJLIL.LIZIZ(str);
        this.LJLIL.getClass();
        boolean LIZLLL = C47651In1.LIZLLL(LIZIZ2);
        if (LIZLLL) {
            this.LJLIL.LJI(str);
            if (!(!LIZLLL)) {
                return null;
            }
        }
        LocalVideoUrlModel LIZIZ3 = this.LJLIL.LIZIZ(str);
        if (LIZIZ3 == null) {
            return "";
        }
        return LIZIZ3.localPath;
    }

    public final void LJI(Aweme aweme, String str) {
        int i;
        if (!LJ() || aweme == null) {
            return;
        }
        LIZ();
        String aid = aweme.getAid();
        String authorUid = aweme.getAuthorUid();
        boolean isVr = aweme.isVr();
        Video video = aweme.getVideo();
        LocalVideoUrlModel localVideoUrlModel = new LocalVideoUrlModel(aid);
        localVideoUrlModel.authorId = authorUid;
        localVideoUrlModel.setVr(isVr);
        if (video != null) {
            localVideoUrlModel.setDuration(video.getDuration());
            localVideoUrlModel.setWidth(video.getWidth());
            localVideoUrlModel.setHeight(video.getHeight());
            if (video.getProperPlayAddr() != null) {
                localVideoUrlModel.setUri(video.getProperPlayAddr().getUri());
                if (video.getPlayAddrBytevc1() != null) {
                    if (video.getPlayAddrBytevc1() != null) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    localVideoUrlModel.setCodecType(i);
                }
            }
        }
        localVideoUrlModel.localPath = str;
        this.LJLIL.LJ(localVideoUrlModel);
        LJFF();
    }

    public final boolean LJIIIIZZ(String str, final String str2, final InterfaceC47650In0 interfaceC47650In0) {
        String LIZJ = LIZJ(str);
        boolean z = !TextUtils.isEmpty(LIZJ);
        if (z) {
            C10K.LIZJ(new ACallableS6S2000000_8(LIZJ, str2, 1)).LJ(new C10I() { // from class: X.Imz
                @Override // X.C10I
                public final Object then(C10K c10k) {
                    InterfaceC47650In0 interfaceC47650In02 = InterfaceC47650In0.this;
                    String str3 = str2;
                    if (c10k.LJIILJJIL()) {
                        interfaceC47650In02.onFailed();
                        return null;
                    }
                    interfaceC47650In02.onSuccess(str3);
                    return null;
                }
            }, C10K.LJIIIIZZ, null);
        }
        return z;
    }
}
