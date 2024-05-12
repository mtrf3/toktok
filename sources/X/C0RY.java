package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.0RY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RY {
    public static C31824CeK LIZ(LiveEffect liveEffect, String urlPrefix) {
        o.LJIIIZ(urlPrefix, "urlPrefix");
        String str = liveEffect.quiz;
        EnumC31874Cf8 enumC31874Cf8 = EnumC31874Cf8.STICKER;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("quiz/");
        LIZ.append(liveEffect.getResourceId());
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LJFF = C72972SkS.LJFF(urlPrefix, '/');
        LJFF.append(liveEffect.quiz);
        return new C31824CeK(str, enumC31874Cf8, LIZIZ, null, X1D.LIZIZ(LJFF), null, false, 0, false, 1000);
    }
}
