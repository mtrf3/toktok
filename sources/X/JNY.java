package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JNY implements InterfaceC49148JQq {
    public final View LJLIL;
    public SearchServiceCenter$AutoPlayAbility LJLILLLLZI;
    public final JNX LJLJI = new JNX(this);

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean LLIIII() {
        Context LIZIZ;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        View view = this.LJLIL;
        if (view == null || (LIZIZ = view.getContext()) == null) {
            LIZIZ = EF7.LIZIZ();
        }
        if (!J1C.LIZLLL(LIZIZ) || (searchServiceCenter$AutoPlayAbility = this.LJLILLLLZI) == null || !searchServiceCenter$AutoPlayAbility.LLIIII()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC46334IGk getPreload() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = this.LJLILLLLZI;
        if (searchServiceCenter$AutoPlayAbility != null) {
            searchServiceCenter$AutoPlayAbility.Wc();
        }
    }

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        View detectView;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = this.LJLILLLLZI;
        if (searchServiceCenter$AutoPlayAbility == null || (detectView = searchServiceCenter$AutoPlayAbility.getDetectView()) == null) {
            return this.LJLIL;
        }
        return detectView;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = this.LJLILLLLZI;
        if (searchServiceCenter$AutoPlayAbility != null) {
            return searchServiceCenter$AutoPlayAbility.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC49137JQf getPriority() {
        return this.LJLJI;
    }

    public JNY(View view) {
        this.LJLIL = view;
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = this.LJLILLLLZI;
        if (searchServiceCenter$AutoPlayAbility != null) {
            searchServiceCenter$AutoPlayAbility.x4(listener);
        }
    }

    @Override // X.InterfaceC49148JQq
    public final void y(long j) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = this.LJLILLLLZI;
        if (searchServiceCenter$AutoPlayAbility != null) {
            searchServiceCenter$AutoPlayAbility.kV();
        }
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = this.LJLILLLLZI;
        if (searchServiceCenter$AutoPlayAbility != null) {
            searchServiceCenter$AutoPlayAbility.z8(listener);
        }
    }
}
