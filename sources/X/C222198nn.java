package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.8nn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C222198nn {
    public static void LIZ(Aweme aweme, InterfaceC88472Yns block) {
        o.LJIIIZ(block, "block");
        if (aweme != null && !aweme.isSharedStoryVisible()) {
            block.invoke(aweme);
        }
    }
}