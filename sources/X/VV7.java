package X;

import com.ss.android.ugc.aweme.nows.cache.NowSelfAwemeDatabase;

/* loaded from: classes15.dex */
public final class VV7 extends AbstractC65781Prl implements InterfaceC65784Pro<NowSelfAwemeDatabase> {
    public static final VV7 LJLIL = new VV7();

    public VV7() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Ba, com.ss.android.ugc.aweme.nows.cache.NowSelfAwemeDatabase] */
    @Override // X.InterfaceC65784Pro
    public final NowSelfAwemeDatabase invoke() {
        return C0BV.LIZ(EF7.LIZIZ(), NowSelfAwemeDatabase.class, "now_self_aweme_cache.db").LIZIZ();
    }
}
