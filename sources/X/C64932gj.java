package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.2gj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64932gj extends AbstractC65781Prl implements InterfaceC65784Pro<LruCache<String, User>> {
    public static final C64932gj LJLIL = new C64932gj();

    public C64932gj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LruCache<String, User> invoke() {
        return new LruCache<>(5);
    }
}
