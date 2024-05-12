package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.choosemusic.settings.CommercialMusicPageInfo;

/* renamed from: X.2Q6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2Q6 {
    public static final CommercialMusicPageInfo LIZ = new CommercialMusicPageInfo(null, 1, null);

    public static String LIZ() {
        CommercialMusicPageInfo commercialMusicPageInfo = LIZ;
        try {
            commercialMusicPageInfo = (CommercialMusicPageInfo) SettingsManager.LIZLLL().LJIIIIZZ("tt_commercial_music_info", CommercialMusicPageInfo.class, commercialMusicPageInfo);
        } catch (Throwable unused) {
        }
        if (commercialMusicPageInfo != null) {
            return commercialMusicPageInfo.commercialMusicSchema;
        }
        return null;
    }
}
