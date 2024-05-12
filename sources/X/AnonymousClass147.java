package X;

import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* renamed from: X.147, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass147 {
    public static LiveCore LIZIZ;
    public static boolean LIZJ;
    public static Method LJ;
    public static AnonymousClass145 LJFF;
    public static C38591fL LJI;
    public static final AnonymousClass147 LIZ = new AnonymousClass147();
    public static boolean LIZLLL = true;
    public static final ArrayList<AnonymousClass144> LJII = new ArrayList<>();

    public static final void LIZIZ() {
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("end cur focus, audioRecordingCallback: ");
            LIZ2.append(LJFF);
            C0NB.LJIIIZ("AudioRecordFocusManager", X1D.LIZIZ(LIZ2));
        }
        if (Build.VERSION.SDK_INT > 28) {
            AnonymousClass145 anonymousClass145 = LJFF;
            if (anonymousClass145 != null) {
                try {
                    LiveCore liveCore = LIZIZ;
                    if (liveCore != null) {
                        liveCore.unRegisterAudioRecordingCallback(anonymousClass145);
                    }
                } catch (IllegalArgumentException e) {
                    C0NB.LJI("AudioRecordFocusManager", e);
                }
            }
            LJFF = null;
            LJ = null;
            LIZJ = false;
        }
        LJII.clear();
        LJI = null;
    }

    public static final void LIZJ() {
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("pause focus, audioRecordingCallback: ");
            LIZ2.append(LJFF);
            C0NB.LJIIIZ("AudioRecordFocusManager", X1D.LIZIZ(LIZ2));
        }
        if (Build.VERSION.SDK_INT > 28) {
            AnonymousClass145 anonymousClass145 = LJFF;
            if (anonymousClass145 != null) {
                try {
                    LiveCore liveCore = LIZIZ;
                    if (liveCore != null) {
                        liveCore.unRegisterAudioRecordingCallback(anonymousClass145);
                    }
                } catch (IllegalArgumentException e) {
                    C0NB.LJI("AudioRecordFocusManager", e);
                }
            }
            LJFF = null;
            LIZJ = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.145] */
    public static void LIZLLL() {
        if (Build.VERSION.SDK_INT >= 28) {
            LJFF = new AudioManager.AudioRecordingCallback() { // from class: X.145
                public static Object LIZ(Object obj, Method method, Object[] objArr) {
                    C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "5621585002206625562"));
                    return LIZJ2.LIZ ? LIZJ2.LIZIZ : method.invoke(obj, objArr);
                }

                @Override // android.media.AudioManager.AudioRecordingCallback
                public final void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
                    Object obj;
                    if (list != null && list.size() == 1) {
                        try {
                            if (AnonymousClass147.LJ == null) {
                                AnonymousClass147.LJ = AudioRecordingConfiguration.class.getMethod("isClientSilenced", new Class[0]);
                            }
                            Method method = AnonymousClass147.LJ;
                            if (method != null) {
                                obj = LIZ(ListProtector.get(list, 0), method, new Object[0]);
                            } else {
                                obj = null;
                            }
                            o.LJII(obj, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean z = !((Boolean) obj).booleanValue();
                            if (C30922CBq.LIZIZ) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("onRecordingConfigChanged focus:");
                                LIZ2.append(z);
                                LIZ2.append(", isRunning: ");
                                LIZ2.append(AnonymousClass147.LIZJ);
                                C0NB.LJIIIZ("AudioRecordFocusManager", X1D.LIZIZ(LIZ2));
                            }
                            if (AnonymousClass147.LIZJ && z != AnonymousClass147.LIZLLL) {
                                if (z) {
                                    Iterator<AnonymousClass144> it = AnonymousClass147.LJII.iterator();
                                    while (it.hasNext()) {
                                        it.next().LIZ();
                                    }
                                } else if (!z) {
                                    Iterator<AnonymousClass144> it2 = AnonymousClass147.LJII.iterator();
                                    while (it2.hasNext()) {
                                        it2.next().LIZIZ();
                                    }
                                }
                            }
                            AnonymousClass147.LIZLLL = z;
                        } catch (NoSuchMethodException e) {
                            C0NB.LJI("AudioRecordFocusManager", e);
                        } catch (SecurityException e2) {
                            C0NB.LJI("AudioRecordFocusManager", e2);
                        }
                    }
                }
            };
        }
        LiveCore liveCore = LIZIZ;
        if (liveCore != null) {
            liveCore.registerAudioRecordingCallback(new Executor() { // from class: X.146
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }, LJFF, C78857UxB.LJJIIJ(1476788233, "bpea-game_audio_recording_callback"));
        }
    }

    public static final void LJ() {
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("resume focus, audioRecordingCallback: ");
            LIZ2.append(LJFF);
            C0NB.LJIIIZ("AudioRecordFocusManager", X1D.LIZIZ(LIZ2));
        }
        if (Build.VERSION.SDK_INT > 28 && LJFF == null) {
            LIZJ = true;
            LIZLLL();
        }
    }

    public static final void LIZ(LiveCore liveCore) {
        if (Build.VERSION.SDK_INT > 28) {
            LIZIZ = liveCore;
            if (liveCore != null) {
                liveCore.switchAudioMode(6);
            }
        }
    }
}
