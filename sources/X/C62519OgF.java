package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* renamed from: X.OgF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62519OgF {
    public static int LIZ(Aweme aweme) {
        if (aweme == null) {
            return R.attr.gp;
        }
        if (aweme.isCollected()) {
            return R.attr.c6;
        }
        if (C62483Off.LIZJ() == EnumC62492Ofo.VERTICAL) {
            return R.attr.gp;
        }
        return R.attr.gu;
    }
}
