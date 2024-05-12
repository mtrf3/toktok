package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.KJz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51523KJz extends AbstractC65781Prl implements InterfaceC88472Yns<KJU, Object> {
    public static final C51523KJz LJLIL = new C51523KJz();

    public C51523KJz() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(KJU kju) {
        String aid;
        KJU it = kju;
        o.LJIIIZ(it, "it");
        Aweme aweme = (Aweme) it.LIZJ;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            return "";
        }
        return aid;
    }
}
