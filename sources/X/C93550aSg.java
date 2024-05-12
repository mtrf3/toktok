package X;

import java.util.HashMap;

/* renamed from: X.aSg, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C93550aSg {
    public final String LIZ;
    public final EnumC93552aSi LIZIZ;
    public final String LIZJ;
    public String[] LIZLLL;
    public final java.util.Map<String, String> LJ = new HashMap();

    public C93550aSg(String str, EnumC93552aSi enumC93552aSi) {
        if (str != null) {
            if (enumC93552aSi != null) {
                this.LIZ = str;
                this.LIZIZ = enumC93552aSi;
                this.LIZJ = "https://www.tiktok.com/third-party-oauth-redirect/music/spotify";
                return;
            }
            throw new IllegalArgumentException("Response type can't be null");
        }
        throw new IllegalArgumentException("Client ID can't be null");
    }
}
