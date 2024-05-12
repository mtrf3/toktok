package X;

import android.content.Context;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.GzG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43314GzG {
    public static final String LIZ = C31461Li.LIZJ("share_to_story_effect_id", "2283488", "getInstance().getStringV…tyleResource::class.java)");
    public static volatile Effect LIZIZ;

    public static String LIZ(InterfaceC88473Ynt interfaceC88473Ynt) {
        String str;
        Context LLLLJI = C16880lQ.LLLLJI(C60903NvH.LJ);
        o.LJIIIIZZ(LLLLJI, "getApplication().applicationContext");
        InterfaceC84498XEg LIZ2 = C84488XDw.LIZ(LLLLJI, null);
        if (LIZIZ != null) {
            Effect effect = LIZIZ;
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            String str2 = LIZ;
            if (o.LJ(str, str2) && LIZ2.LJJIJLIJ(LIZIZ)) {
                if (interfaceC88473Ynt != null) {
                    interfaceC88473Ynt.invoke(str2, LIZIZ, null);
                }
                return LIZ;
            }
        }
        String str3 = LIZ;
        if (str3 == null || str3.length() == 0) {
            if (interfaceC88473Ynt != null) {
                interfaceC88473Ynt.invoke(str3, LIZIZ, null);
            }
        } else {
            LIZ2.LJIIZILJ(str3, new C43313GzF(interfaceC88473Ynt));
        }
        return LIZ;
    }
}
