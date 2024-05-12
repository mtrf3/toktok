package X;

import android.util.LruCache;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;

/* renamed from: X.9Th, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237379Th extends AbstractC65781Prl implements InterfaceC65784Pro<LruCache<String, ProfileUser>> {
    public static final C237379Th LJLIL = new C237379Th();

    public C237379Th() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LruCache<String, ProfileUser> invoke() {
        return new LruCache<>(5);
    }
}
