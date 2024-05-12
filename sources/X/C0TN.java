package X;

import com.bytedance.android.livesdk.live.model.VolumeDetectConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveVolumeDetectSetting;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.0TN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0TN {
    public static VolumeDetectConfig LIZIZ;
    public static boolean LIZJ;
    public static volatile int LJFF;
    public static C73411SrX LJI;
    public static C73411SrX LJII;
    public static C73411SrX LJIIIIZZ;
    public static C73411SrX LJIIIZ;
    public static final C0TN LIZ = new C0TN();
    public static boolean LIZLLL = true;
    public static volatile int LJ = -1;

    static {
        VolumeDetectConfig config = LiveVolumeDetectSetting.INSTANCE.getValue();
        o.LJIIIZ(config, "config");
        LIZIZ = config;
        AnonymousClass144 anonymousClass144 = new AnonymousClass144() { // from class: X.1MK
            @Override // X.AnonymousClass144
            public final void LIZ() {
                C0TN.LIZ();
            }

            @Override // X.AnonymousClass144
            public final void LIZIZ() {
                C0TN.LIZIZ();
            }
        };
        ArrayList<AnonymousClass144> arrayList = AnonymousClass147.LJII;
        if (!arrayList.contains(anonymousClass144)) {
            arrayList.add(anonymousClass144);
        }
        C31026CFq.LIZ.LIZLLL(new CG0() { // from class: X.1ML
            @Override // X.CG0
            public final void LIZ() {
                C0TN.LIZ();
            }

            @Override // X.CG0
            public final void LIZIZ() {
                C0TN.LIZIZ();
            }
        });
    }

    public static final void LIZ() {
        if (!LIZJ) {
            return;
        }
        C73411SrX c73411SrX = LJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        LJI = (C73411SrX) C73943T0h.LIZ().LJ(C1MT.class).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new InterfaceC64592gB() { // from class: X.1MM
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                obj.getClass();
                C0TN.LJ = 0;
            }
        });
        C73411SrX c73411SrX2 = LJII;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        if (LIZIZ != null) {
            LJII = (C73411SrX) new C73620Suu(AbstractC73672Svk.LJJLIIIJLJLI(r0.getDetectIntervalSeconds(), TimeUnit.SECONDS)).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.1MN
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    if (C0TN.LJ == -1) {
                        return;
                    }
                    int i = C0TN.LJ;
                    VolumeDetectConfig volumeDetectConfig = C0TN.LIZIZ;
                    if (volumeDetectConfig != null) {
                        if (i >= volumeDetectConfig.getVolumeThreshold()) {
                            C73943T0h.LIZ().LIZIZ(new F9E(C0TN.LJ) { // from class: X.1MJ
                                public final int LJLIL;

                                @Override // X.F9E
                                public final Object[] getObjects() {
                                    return new Object[]{Integer.valueOf(this.LJLIL)};
                                }

                                {
                                    this.LJLIL = r1;
                                }
                            });
                            C0TN.LJFF = 0;
                            return;
                        }
                        C0TN.LJFF++;
                        int i2 = C0TN.LJFF;
                        VolumeDetectConfig volumeDetectConfig2 = C0TN.LIZIZ;
                        if (volumeDetectConfig2 != null) {
                            if (i2 < volumeDetectConfig2.getCountThreshold() || !C0TN.LIZLLL) {
                                return;
                            }
                            C0TN.LIZLLL = false;
                            if (C0TN.LIZIZ != null) {
                                C0TN.LJIIIZ = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(r0.getPausePromptDurationMinutes(), TimeUnit.MINUTES).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.1MP
                                    @Override // X.InterfaceC64592gB
                                    public final void accept(Object obj2) {
                                        C0TN.LIZLLL = true;
                                    }
                                }, new InterfaceC64592gB() { // from class: X.1MQ
                                    @Override // X.InterfaceC64592gB
                                    public final void accept(Object t) {
                                        o.LJIIIZ(t, "t");
                                    }
                                });
                                C73943T0h.LIZ().LIZIZ(new F9E(C0TN.LJ) { // from class: X.1MI
                                    public final int LJLIL;

                                    @Override // X.F9E
                                    public final Object[] getObjects() {
                                        return new Object[]{Integer.valueOf(this.LJLIL)};
                                    }

                                    {
                                        this.LJLIL = r1;
                                    }
                                });
                                C0TN.LJFF = 0;
                                return;
                            }
                            o.LJIJI("config");
                            throw null;
                        }
                        o.LJIJI("config");
                        throw null;
                    }
                    o.LJIJI("config");
                    throw null;
                }
            }, new InterfaceC64592gB() { // from class: X.1MO
                @Override // X.InterfaceC64592gB
                public final void accept(Object t) {
                    o.LJIIIZ(t, "t");
                }
            });
        } else {
            o.LJIJI("config");
            throw null;
        }
    }

    public static final void LIZIZ() {
        C73411SrX c73411SrX = LJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        LJI = null;
        C73411SrX c73411SrX2 = LJII;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        LJII = null;
        LJFF = 0;
    }
}
