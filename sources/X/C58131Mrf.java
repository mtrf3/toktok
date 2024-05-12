package X;

import com.ss.android.ugc.musicprovider.IMusicProviderConfig;
import com.ss.android.ugc.musicprovider.MusicProviderConfigProxy;

/* renamed from: X.Mrf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58131Mrf implements IMusicProviderConfig {
    public static final C58131Mrf LIZIZ = new C58131Mrf();
    public final /* synthetic */ IMusicProviderConfig LIZ;

    @Override // com.ss.android.ugc.musicprovider.IMusicProviderConfig
    public final String getDownloadDir() {
        return this.LIZ.getDownloadDir();
    }

    public C58131Mrf() {
        IMusicProviderConfig iMusicProviderConfig;
        Object LIZ = C58096Mr6.LIZ(IMusicProviderConfig.class, false);
        if (LIZ != null) {
            iMusicProviderConfig = (IMusicProviderConfig) LIZ;
        } else {
            if (C58096Mr6.J8 == null) {
                synchronized (IMusicProviderConfig.class) {
                    if (C58096Mr6.J8 == null) {
                        C58096Mr6.J8 = new MusicProviderConfigProxy();
                    }
                }
            }
            iMusicProviderConfig = C58096Mr6.J8;
        }
        this.LIZ = iMusicProviderConfig;
    }
}
