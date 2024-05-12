package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.OfL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62463OfL extends F9E {
    public final EnumC62419Oed LJLIL;
    public final String LJLILLLLZI;
    public String LJLJI;
    public final Aweme LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C62463OfL(EnumC62419Oed silentShareChannel, Aweme aweme) {
        o.LJIIIZ(silentShareChannel, "silentShareChannel");
        this.LJLIL = silentShareChannel;
        this.LJLILLLLZI = "";
        this.LJLJI = "";
        this.LJLJJI = aweme;
    }
}
