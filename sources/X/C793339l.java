package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.39l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C793339l {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme aweme) {
        if (aweme == null || aweme.getVideo() == null) {
            return false;
        }
        if (aweme.getAuthor() == null && !C59251NNf.LIZIZ(3, aweme)) {
            return false;
        }
        return true;
    }
}
