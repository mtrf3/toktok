package X;

import android.view.View;
import com.ss.android.ugc.aweme.inbox.skylight.SkylightLiveMediaCell;
import kotlin.jvm.internal.o;

/* renamed from: X.Le1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54737Le1 implements InterfaceC32188CkC {
    public final /* synthetic */ SkylightLiveMediaCell LJLIL;

    @Override // X.InterfaceC32188CkC
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC32188CkC
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.InterfaceC32188CkC
    public final void LJI(String s) {
        o.LJIIIZ(s, "s");
    }

    @Override // X.InterfaceC32188CkC
    public final void LJII(C28272B7s c28272B7s) {
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIIIZZ(String s) {
        o.LJIIIZ(s, "s");
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIJ(int i, int i2, View view) {
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIJJI(String str) {
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIL(String s) {
        o.LJIIIZ(s, "s");
    }

    @Override // X.InterfaceC32188CkC
    public final void LLLZL() {
        this.LJLIL.P().setVisibility(8);
        this.LJLIL.LJLJLLL = System.currentTimeMillis();
    }

    public C54737Le1(SkylightLiveMediaCell skylightLiveMediaCell) {
        this.LJLIL = skylightLiveMediaCell;
    }

    @Override // X.InterfaceC32188CkC
    public final void LIZJ(EnumC79342VBy message, Object obj) {
        o.LJIIIZ(message, "message");
        message.ordinal();
    }
}
