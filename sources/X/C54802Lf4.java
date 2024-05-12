package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.story.model.StoryBulletListResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.Lf4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54802Lf4 extends AbstractC65781Prl implements InterfaceC65784Pro<C7FY> {
    public static final C54802Lf4 LJLIL = new C54802Lf4();

    public C54802Lf4() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7FY] */
    @Override // X.InterfaceC65784Pro
    public final C7FY invoke() {
        return new InterfaceC182707Fa() { // from class: X.7FY
            @Override // X.InterfaceC182707Fa
            public final C189517cB LIZ(android.net.Uri uri) {
                o.LJIIIZ(uri, "uri");
                return null;
            }

            @Override // X.InterfaceC182707Fa
            public final C189517cB LIZIZ(Intent intent) {
                return null;
            }

            @Override // X.InterfaceC182707Fa
            public final AbstractC73672Svk LIZJ(long j, String aid) {
                o.LJIIIZ(aid, "aid");
                return AbstractC73672Svk.LJJIJIL(new StoryBulletListResponse(0L, false, 0L, C61878OQg.INSTANCE));
            }
        };
    }
}
