package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Lsy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55664Lsy implements M2K {
    public final /* synthetic */ Context LJLIL;

    @Override // X.M2J
    public final void release() {
    }

    @Override // X.M2K
    public final C40176Fpk LJIJI() {
        if (!C90193gN.LIZIZ(this.LJLIL)) {
            return new C40176Fpk(0, R.anim.g8);
        }
        return new C40176Fpk(0, R.anim.g7);
    }

    @Override // X.M2K
    public final C40176Fpk LJJJI() {
        if (!C90193gN.LIZIZ(this.LJLIL)) {
            return new C40176Fpk(R.anim.g6, R.anim.eg);
        }
        return new C40176Fpk(R.anim.g5, R.anim.eg);
    }

    public C55664Lsy(Context context) {
        this.LJLIL = context;
    }
}
