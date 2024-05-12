package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LkJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55127LkJ {
    public final Aweme LIZ;
    public final List<Aweme> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public C55127LkJ(Aweme aweme, Context context, List items, String str, String str2) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(items, "items");
        this.LIZ = aweme;
        this.LIZIZ = items;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
