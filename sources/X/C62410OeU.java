package X;

import android.content.Context;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import kotlin.jvm.internal.o;

/* renamed from: X.OeU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62410OeU {
    public static void LIZ(String channelKey, boolean z, Context context, Challenge challenge) {
        o.LJIIIZ(channelKey, "channelKey");
        o.LJIIIZ(context, "context");
        if (!z) {
            return;
        }
        C8BR c8br = new C8BR();
        c8br.LJJ(new C43169Gwv());
        C62683Oit c62683Oit = new C62683Oit();
        c62683Oit.LIZ = challenge.getCid();
        c62683Oit.LIZIZ = 1;
        c62683Oit.LJI = 3;
        c62683Oit.LJII = channelKey;
        c8br.LJIILL(c62683Oit.LIZ());
    }
}
