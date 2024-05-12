package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.model.LogParams;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.m;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Md, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31671Md implements C0WN {
    @Override // X.C0WN
    public final void LJFF(int i, Effect effect) {
    }

    public static final void LIZ() {
        boolean z;
        C31691Mf c31691Mf = C31691Mf.LIZ;
        if (C31691Mf.LIZLLL) {
            if (C31691Mf.LIZLLL() && C31691Mf.LIZIZ()) {
                c31691Mf.LJIILIIL();
                if (C29306Beo.LJJI()) {
                    z = true;
                } else {
                    ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getVideoSizeManager().getClass();
                    z = C30471Bxb.LJFF;
                }
                c31691Mf.LJIJ(z, false, null, null);
                C30326BvG.LIZJ(new Runnable() { // from class: X.0Tz
                    public static void LIZ() {
                        LiveEffect liveEffect;
                        List<? extends LiveEffect> list = C31691Mf.LIZIZ;
                        if (list != null) {
                            Integer LIZJ = InterfaceC30442Bx8.i2.LIZJ();
                            o.LJIIIIZZ(LIZJ, "LIVE_GOAL_EFFECT_POSITION.value");
                            liveEffect = (LiveEffect) ListProtector.get(list, LIZJ.intValue());
                        } else {
                            liveEffect = null;
                        }
                        C31691Mf.LIZ(liveEffect);
                        C31691Mf.LJIILLIIL(false);
                        C48459J0d<m> c48459J0d = InterfaceC30442Bx8.h2;
                        if (c48459J0d.LIZJ().LJJIJLIJ("stream_goal_id")) {
                            LogParams logParams = (LogParams) OUP.LJJIIZI(c48459J0d.LIZJ(), LogParams.class);
                            if (logParams == null) {
                                logParams = new LogParams(null, null, null, null, null, null, 0, null, 0, 0L, 1023, null);
                            }
                            C31701Mg.LIZIZ = logParams;
                            logParams.startTime = C30725C4b.LIZ();
                            c48459J0d.LIZ(new m());
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ;
                        try {
                            LIZ();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                }, null, 300L);
            } else {
                C31691Mf.LJIILJJIL();
            }
            C31691Mf.LIZLLL = false;
        }
    }

    @Override // X.C0WN
    public final void LJI(Effect effect) {
        String str;
        if (effect != null) {
            str = effect.getResourceId();
        } else {
            str = null;
        }
        LiveEffect LJFF = C31691Mf.LJFF(str);
        if (LJFF != null) {
            LJFF.isDownloaded = false;
            LJFF.isDownloading = false;
        }
        C0NB.LIZIZ("LiveGoalEffect", "download resource zip Failed!!!!");
    }

    @Override // X.C0WN
    public final void onStart(Effect effect) {
        String str;
        if (effect != null) {
            str = effect.getResourceId();
        } else {
            str = null;
        }
        LiveEffect LJFF = C31691Mf.LJFF(str);
        if (LJFF != null) {
            LJFF.isDownloaded = false;
            LJFF.isDownloading = true;
        }
    }

    @Override // X.C0WN
    public final void onSuccess(Effect effect) {
        String str;
        if (effect != null) {
            str = effect.getResourceId();
        } else {
            str = null;
        }
        LiveEffect LJFF = C31691Mf.LJFF(str);
        if (LJFF != null) {
            LJFF.isDownloaded = true;
            LJFF.isDownloading = false;
        }
        LIZ();
        C0NB.LIZIZ("LiveGoalEffect", "download resource zip successfully!");
    }
}
