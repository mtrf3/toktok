package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS99S0300000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Nhs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60072Nhs extends F9E {
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C60072Nhs(Aweme aweme, String str, String anchorId, AqS99S0300000_10 aqS99S0300000_10) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(anchorId, "anchorId");
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        this.LJLJI = anchorId;
        this.LJLJJI = aqS99S0300000_10;
    }
}
