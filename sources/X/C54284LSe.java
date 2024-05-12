package X;

import com.bytedance.keva.Keva;

/* renamed from: X.LSe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54284LSe implements MFL {
    public static final C54284LSe LIZ = new C54284LSe();
    public static final Keva LIZIZ = Keva.getRepo("STORY_ARCHIVE_GUIDE_REPO");

    @Override // X.MFL
    public final boolean LIZ() {
        C53578L1a.LIZ.getClass();
        if (!C53578L1a.LIZ()) {
            return false;
        }
        Keva keva = LIZIZ;
        if (!keva.contains("STORY_ARCHIVE_GUIDE")) {
            return true;
        }
        return keva.getBoolean("STORY_ARCHIVE_GUIDE", false);
    }
}
