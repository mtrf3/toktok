package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.MXf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56963MXf extends AbstractC65781Prl implements InterfaceC65784Pro<LruCache<String, Aweme>> {
    public static final C56963MXf LJLIL = new C56963MXf();

    public C56963MXf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LruCache<String, Aweme> invoke() {
        return new LruCache<>(5);
    }
}
