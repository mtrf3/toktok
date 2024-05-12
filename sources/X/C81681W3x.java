package X;

import com.ss.android.ugc.aweme.nows.cache.NowMediaCacheDatabase;

/* renamed from: X.W3x, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81681W3x extends C1CF<C81677W3t> {
    @Override // X.C0BI
    public final String LIZIZ() {
        return "DELETE FROM `now_media_cache` WHERE `aid` = ?";
    }

    public C81681W3x(NowMediaCacheDatabase nowMediaCacheDatabase) {
        super(nowMediaCacheDatabase);
    }

    @Override // X.C1CF
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C81677W3t c81677W3t) {
        String str = c81677W3t.LIZ;
        if (str == null) {
            interfaceC37591dj.LLLLLLJ(1);
        } else {
            interfaceC37591dj.LJJII(1, str);
        }
    }
}
