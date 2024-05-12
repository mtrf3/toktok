package X;

import com.bytedance.keva.Keva;

/* renamed from: X.6WH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6WH {
    public static final Keva LIZ = Keva.getRepo("cc_template_info");

    public static void LIZ(int i, String str, String str2) {
        StringBuilder LIZLLL = C06540Nm.LIZLLL("CCTemplateInfoKeva store ; templateId : ", str, " ; musicId : ", str2, " ; musicStartTime : ");
        LIZLLL.append(i);
        H7B.LJ(X1D.LIZIZ(LIZLLL));
        Keva keva = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("music_id_");
        LIZ2.append(str);
        keva.storeString(X1D.LIZIZ(LIZ2), str2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("music_start_time_");
        LIZ3.append(str);
        keva.storeInt(X1D.LIZIZ(LIZ3), i);
    }
}
