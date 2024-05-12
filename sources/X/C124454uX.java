package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4uX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124454uX {
    public static EnumC124444uW LIZ;
    public static InterfaceC153045zY LJ;
    public static final C124454uX LJI = new C124454uX();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C124484ua.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C122714rj.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C124474uZ.LJLIL);
    public static EnumC124504uc LJFF = EnumC124504uc.UNINITIALIZED;

    public static ArrayList LIZIZ() {
        return (ArrayList) LIZIZ.getValue();
    }

    public static final /* synthetic */ EnumC124444uW LIZ() {
        EnumC124444uW enumC124444uW = LIZ;
        if (enumC124444uW != null) {
            return enumC124444uW;
        }
        o.LJIJI("playerAction");
        throw null;
    }

    public static void LIZLLL() {
        if (LJFF == EnumC124504uc.RUNNING) {
            EnumC124444uW LIZ2 = LIZ();
            EnumC124444uW enumC124444uW = EnumC124444uW.AUDIO_FADEOUT;
            if (LIZ2 == enumC124444uW) {
                LJI.getClass();
                if (LIZ() == enumC124444uW) {
                    C82891Wg3.LIZLLL().d("AudioFadeout || EditToPublishAudioPlayer pause success");
                    InterfaceC153045zY interfaceC153045zY = LJ;
                    if (interfaceC153045zY != null) {
                        C78841Uwv.LJJIIJZLJL("", interfaceC153045zY, C122414rF.LJLIL);
                        interfaceC153045zY.pause();
                    }
                }
                LIZJ(EnumC124504uc.FADEOUT_ENDED);
            }
            if (LIZ() == EnumC124444uW.AUDIO_LOOP) {
                InterfaceC153045zY interfaceC153045zY2 = LJ;
                if (interfaceC153045zY2 != null) {
                    interfaceC153045zY2.pause();
                }
                C124454uX c124454uX = LJI;
                EnumC124504uc enumC124504uc = EnumC124504uc.LOOP_PAUSED;
                c124454uX.getClass();
                LIZJ(enumC124504uc);
                return;
            }
            return;
        }
        C83964WxM.LIZ.LIZ("EditToPublishAudioPlayer pause but do nothing");
    }

    public static void LIZJ(EnumC124504uc enumC124504uc) {
        LJFF = enumC124504uc;
        int i = C124464uY.LIZJ[enumC124504uc.ordinal()];
        if (i != 1) {
            if (i != 2 || LIZ() != EnumC124444uW.AUDIO_FADEOUT) {
                return;
            }
            LJI.getClass();
            Iterator it = LIZIZ().iterator();
            while (it.hasNext()) {
                ((InterfaceC124494ub) it.next()).LJIILJJIL();
            }
            LJI.getClass();
            LIZIZ().clear();
            return;
        }
        if (LIZ() != EnumC124444uW.AUDIO_FADEOUT) {
            return;
        }
        LJI.getClass();
        Iterator it2 = LIZIZ().iterator();
        while (it2.hasNext()) {
            ((InterfaceC124494ub) it2.next()).LJJIIJZLJL();
        }
    }

    public static void LJ(int i) {
        InterfaceC153045zY interfaceC153045zY;
        int i2 = C124464uY.LIZ[LJFF.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                C83964WxM.LIZ.LIZ("EditToPublishAudioPlayer start but do nothing");
                return;
            }
            if (LIZ() == EnumC124444uW.AUDIO_LOOP && (interfaceC153045zY = LJ) != null) {
                interfaceC153045zY.play();
            }
            LIZJ(EnumC124504uc.RUNNING);
            return;
        }
        if (LIZ() == EnumC124444uW.AUDIO_FADEOUT) {
            LJI.getClass();
            InterfaceC153045zY interfaceC153045zY2 = LJ;
            if (interfaceC153045zY2 != null) {
                ((ArrayList) LIZJ.getValue()).clear();
                ((LinkedHashMap) LIZLLL.getValue()).clear();
                int LJZL = interfaceC153045zY2.LJZL();
                int i3 = LJZL + i;
                int duration = interfaceC153045zY2.getDuration();
                if (i3 > duration) {
                    i3 = duration;
                }
                C78841Uwv.LJJIIJZLJL("", interfaceC153045zY2, new C122404rE(LJZL, i3, interfaceC153045zY2, i));
            }
        }
        LIZJ(EnumC124504uc.RUNNING);
    }
}
