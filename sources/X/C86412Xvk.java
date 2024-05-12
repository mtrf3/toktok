package X;

import android.content.Context;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.ss.android.agilelogger.ALog;
import kotlin.jvm.internal.o;

/* renamed from: X.Xvk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86412Xvk extends AbstractC86411Xvj {
    public final String LIZJ = "XVibrateMethod";

    @Override // X.AbstractC86411Xvj
    public final void LJIIIIZZ(C86415Xvn c86415Xvn, C86410Xvi c86410Xvi, EnumC37847EtH type) {
        EnumC86414Xvm enumC86414Xvm;
        o.LJIIJ(type, "type");
        Context context = (Context) LJII(Context.class);
        if (context == null) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(this.LIZJ, "Context is null");
            c86410Xvi.LIZ(0, "Context is null.");
            return;
        }
        try {
            C86416Xvo c86416Xvo = EnumC86414Xvm.Companion;
            String str = c86415Xvn.LIZIZ;
            c86416Xvo.getClass();
            if (str != null) {
                try {
                    String upperCase = str.toUpperCase();
                    o.LJFF(upperCase, "(this as java.lang.String).toUpperCase()");
                    enumC86414Xvm = EnumC86414Xvm.valueOf(upperCase);
                } catch (Exception unused) {
                    enumC86414Xvm = EnumC86414Xvm.UNKNOWN;
                }
            } else {
                enumC86414Xvm = EnumC86414Xvm.UNKNOWN;
            }
            if (enumC86414Xvm == EnumC86414Xvm.UNKNOWN) {
                c86410Xvi.LIZ(-3, "Illegal style");
                return;
            }
            int amplitude = enumC86414Xvm.getAmplitude();
            long j = c86415Xvn.LIZ;
            Object LLILL = C16880lQ.LLILL(context, "vibrator");
            if (LLILL != null) {
                Vibrator vibrator = (Vibrator) LLILL;
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(j, amplitude), (AudioAttributes) null);
                } else {
                    vibrator.vibrate(j);
                }
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(this.LIZJ, "Vibrate success");
                c86410Xvi.LIZIZ(new C61335O5j());
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type android.os.Vibrator");
        } catch (Exception e) {
            c86410Xvi.LIZ(0, "Can not get vibrate service.");
            ALog.e(this.LIZJ, e);
        }
    }
}
