package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.XSm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84868XSm implements XUI {
    public final C84858XSc LIZ;

    @Override // X.XUI
    public final void release() {
        this.LIZ.release();
    }

    @Override // X.XUI
    public final void LIZ(String musicId) {
        o.LJIIIZ(musicId, "musicId");
        this.LIZ.LIZ(musicId);
    }

    @Override // X.XUI
    public final void LIZIZ(int i) {
        this.LIZ.LJ = i;
    }

    public final boolean LIZLLL(MusicModel musicModel, InterfaceC84870XSo listener, boolean z) {
        o.LJIIIZ(musicModel, "musicModel");
        o.LJIIIZ(listener, "listener");
        C84858XSc c84858XSc = this.LIZ;
        c84858XSc.getClass();
        return c84858XSc.LIZJ(musicModel, listener, z, false);
    }

    @Override // X.XUI
    public final boolean LIZJ(MusicModel musicModel, InterfaceC84870XSo listener, boolean z, boolean z2) {
        o.LJIIIZ(musicModel, "musicModel");
        o.LJIIIZ(listener, "listener");
        return this.LIZ.LIZJ(musicModel, listener, z, z2);
    }

    public /* synthetic */ C84868XSm(Context context, boolean z, boolean z2, boolean z3, int i) {
        this(context, (String) null, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? true : z3);
    }

    public C84868XSm(Context context, String str, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(context, "context");
        this.LIZ = new C84858XSc(context, str, z, z2, z3);
    }
}
