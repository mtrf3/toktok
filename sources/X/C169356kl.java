package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6kl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169356kl extends F9E {
    public final C08630Vn<Boolean> LJLIL;
    public final C08630Vn<Boolean> LJLILLLLZI;

    public C169356kl() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public /* synthetic */ C169356kl(int i) {
        this(new C08630Vn(Boolean.FALSE), new C08630Vn(Boolean.TRUE));
    }

    public C169356kl(C08630Vn<Boolean> playVideo, C08630Vn<Boolean> cancelAndSaveVisible) {
        o.LJIIIZ(playVideo, "playVideo");
        o.LJIIIZ(cancelAndSaveVisible, "cancelAndSaveVisible");
        this.LJLIL = playVideo;
        this.LJLILLLLZI = cancelAndSaveVisible;
    }

    public static C169356kl L(C169356kl c169356kl, C08630Vn playVideo, C08630Vn cancelAndSaveVisible, int i) {
        if ((i & 1) != 0) {
            playVideo = c169356kl.LJLIL;
        }
        if ((i & 2) != 0) {
            cancelAndSaveVisible = c169356kl.LJLILLLLZI;
        }
        c169356kl.getClass();
        o.LJIIIZ(playVideo, "playVideo");
        o.LJIIIZ(cancelAndSaveVisible, "cancelAndSaveVisible");
        return new C169356kl(playVideo, cancelAndSaveVisible);
    }
}
