package X;

import com.ss.android.ugc.aweme.bnpl.biz.entry.BNPLEntryAssem;
import com.zhiliaoapp.musically.R;

/* renamed from: X.a6V, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92175a6V implements InterfaceC73307Spr {
    public final /* synthetic */ BNPLEntryAssem LIZ;

    @Override // X.InterfaceC73307Spr
    public final void hide() {
        ((C223338pd) this.LIZ._$_findCachedViewById(R.id.luw)).setVisibility(8);
        ((C223338pd) this.LIZ._$_findCachedViewById(R.id.luw)).LIZJ();
    }

    @Override // X.InterfaceC73307Spr
    public final void show() {
        ((C223338pd) this.LIZ._$_findCachedViewById(R.id.luw)).setVisibility(0);
        ((C223338pd) this.LIZ._$_findCachedViewById(R.id.luw)).LIZIZ();
    }

    public C92175a6V(BNPLEntryAssem bNPLEntryAssem) {
        this.LIZ = bNPLEntryAssem;
    }
}
