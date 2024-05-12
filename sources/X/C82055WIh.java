package X;

import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WIh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82055WIh {
    public final C82054WIg LIZ = new C82054WIg();
    public InterfaceC82086WJm LIZIZ;
    public I3X LIZJ;
    public ShortVideoContext LIZLLL;
    public ActivityC45651qj LJ;
    public boolean LJFF;
    public SafeHandler LJI;
    public List<? extends CharSequence> LJII;

    public final boolean LIZ() {
        ShortVideoContext shortVideoContext = this.LIZLLL;
        if (shortVideoContext != null) {
            if (shortVideoContext.isPhotoMvMode && shortVideoContext.mIsFromDraft) {
                return true;
            }
            return false;
        }
        o.LJIJI("shortVideoContext");
        throw null;
    }

    public static int LIZIZ() {
        int i;
        if (C41013G7t.LIZ()) {
            i = 6;
        } else {
            i = 5;
        }
        return i + 1;
    }
}
