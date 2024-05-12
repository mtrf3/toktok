package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.GbL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41831GbL extends F9E {
    public final Context LJLIL;
    public final Aweme LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL};
    }

    public C41831GbL(Context context, Aweme aweme, String eventType, String pastMemoryKey, String enterMethod, int i) {
        pastMemoryKey = (i & 8) != 0 ? "" : pastMemoryKey;
        enterMethod = (i & 16) != 0 ? "" : enterMethod;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(pastMemoryKey, "pastMemoryKey");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLIL = context;
        this.LJLILLLLZI = aweme;
        this.LJLJI = eventType;
        this.LJLJJI = pastMemoryKey;
        this.LJLJJL = enterMethod;
    }
}
