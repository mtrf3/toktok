package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Ne, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31941Ne extends F9E {
    public final List<LiveEffect> LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI)};
    }

    public /* synthetic */ C31941Ne(List list, String str, int i) {
        this(list, false, false, (i & 2) != 0 ? "" : str);
    }

    public C31941Ne(List list, boolean z, boolean z2, String key) {
        o.LJIIIZ(list, "list");
        o.LJIIIZ(key, "key");
        this.LJLIL = list;
        this.LJLILLLLZI = key;
        this.LJLJI = z;
        this.LJLJJI = z2;
    }
}
