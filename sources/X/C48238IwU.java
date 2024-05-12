package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.IwU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48238IwU extends AbstractC65781Prl implements InterfaceC88472Yns<Aweme, CharSequence> {
    public static final C48238IwU LJLIL = new C48238IwU();

    public C48238IwU() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(Aweme aweme) {
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "it.aid");
        return aid;
    }
}
