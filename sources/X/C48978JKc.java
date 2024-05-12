package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem;

/* renamed from: X.JKc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48978JKc implements JIB {
    public final /* synthetic */ SearchCardVideoPlayerAssem LIZ;

    @Override // X.JIB
    public final /* synthetic */ Fragment LIZ() {
        return null;
    }

    @Override // X.JIB
    public final /* synthetic */ InterfaceC47667InH LIZJ() {
        return null;
    }

    @Override // X.JIB
    public final boolean LIZIZ() {
        Fragment LJIIIZ = C55096Ljo.LJIIIZ(this.LIZ);
        if (LJIIIZ == null || !LJIIIZ.getUserVisibleHint()) {
            return false;
        }
        return true;
    }

    @Override // X.JIB
    public final Context getContext() {
        return this.LIZ.Y3().getContext();
    }

    @Override // X.JIB
    public final String getIdentifier() {
        InterfaceC48979JKd interfaceC48979JKd = (InterfaceC48979JKd) this.LIZ.LLIIII.getValue();
        if (interfaceC48979JKd != null) {
            return interfaceC48979JKd.getIdentifier();
        }
        return null;
    }

    @Override // X.JIB
    public final boolean isActive() {
        return this.LIZ.LJLLL;
    }

    public C48978JKc(SearchCardVideoPlayerAssem searchCardVideoPlayerAssem) {
        this.LIZ = searchCardVideoPlayerAssem;
    }
}
