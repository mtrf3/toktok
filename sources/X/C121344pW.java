package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import kotlin.jvm.internal.o;

/* renamed from: X.4pW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121344pW {
    public static boolean LIZ(NLETrack nLETrack) {
        EnumC123864ta LJIIZILJ = nLETrack.LJIIZILJ();
        EnumC123864ta enumC123864ta = EnumC123864ta.EFFECT;
        if (LJIIZILJ == enumC123864ta || nLETrack.LJII() == enumC123864ta) {
            return true;
        }
        String LJJI = C77357UXp.LJJI(nLETrack);
        if (o.LJ(LJJI, EnumC121564ps.INFO.name()) || o.LJ(LJJI, EnumC121564ps.IMAGE.name()) || o.LJ(LJJI, EnumC121564ps.TEXT.name())) {
            return true;
        }
        return false;
    }
}
