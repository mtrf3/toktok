package X;

import com.ss.android.ugc.aweme.audiorecord.Point;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.5D4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5D4 extends F9E {
    public final /* synthetic */ int LJLIL = 1;
    public final String LJLILLLLZI;
    public final Serializable LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        switch (this.LJLIL) {
            case 0:
                return new Object[]{this.LJLILLLLZI, this.LJLJI};
            default:
                return new Object[]{this.LJLJI, this.LJLILLLLZI};
        }
    }

    public C5D4(String bgResource, String coverUrl) {
        o.LJIIIZ(bgResource, "bgResource");
        o.LJIIIZ(coverUrl, "coverUrl");
        this.LJLILLLLZI = bgResource;
        this.LJLJI = coverUrl;
    }

    public C5D4(Point point, String path) {
        o.LJIIIZ(path, "path");
        this.LJLJI = point;
        this.LJLILLLLZI = path;
    }
}
