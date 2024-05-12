package X;

import com.ss.android.ugc.aweme.inbox.cache.PreloadManager;

/* loaded from: classes7.dex */
public final class ENM<T> implements InterfaceC64592gB {
    public static final ENM<T> LJLIL = new ENM<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        PreloadManager.LIZIZ.set(false);
        C221018lt.LIZJ("PreloadManager", "requestCache error", (Throwable) obj);
    }
}
