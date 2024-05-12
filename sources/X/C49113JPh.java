package X;

import Y.ARunnableS44S0100000_8;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JPh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C49113JPh implements InterfaceC49117JPl {
    public final RecyclerView LJLIL;
    public final View LJLILLLLZI;
    public final JGU LJLJI;
    public final JIB LJLJJI;
    public final boolean LJLJJL;
    public boolean LJLJJLL;
    public InterfaceC49115JPj LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public Aweme LJLL;
    public JPT LJLLI;

    @Override // X.InterfaceC48907JHj
    public final void LJIILL() {
    }

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean LLIIII() {
        return true;
    }

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC46334IGk getPreload() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC49137JQf getPriority() {
        return null;
    }

    @Override // X.InterfaceC48907JHj
    public final void pause() {
    }

    @Override // X.InterfaceC48907JHj
    public final void play() {
    }

    public final JIB LIZ() {
        return (JIB) this.LJLJLLL.getValue();
    }

    public C49153JQv LIZIZ() {
        return (C49153JQv) this.LJLJLJ.getValue();
    }

    @Override // X.JR0
    public boolean LJLILLLLZI() {
        if (this.LJLJJL && this.LJLJJLL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLJIL() {
        if (this.LJLJJL) {
            this.LJLJJLL = true;
        }
        C1DH.LJJIJIIJI(new ARunnableS44S0100000_8(this, 109));
        JGU jgu = this.LJLJI;
        if (jgu != null) {
            jgu.LJLLL(this.LJLL);
        }
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLLLJLJLL() {
        if (this.LJLJJL) {
            this.LJLJJLL = false;
        }
        LIZIZ().LJI();
        InterfaceC49115JPj interfaceC49115JPj = this.LJLJL;
        if (interfaceC49115JPj != null) {
            interfaceC49115JPj.pauseAll();
        }
        JGU jgu = this.LJLJI;
        if (jgu != null) {
            jgu.LJJJLZIJ();
        }
    }

    @Override // X.InterfaceC48907JHj
    public final void contextPause() {
        if (this.LJLJJL) {
            this.LJLJJLL = false;
        }
        LIZIZ().LJI();
        InterfaceC49115JPj interfaceC49115JPj = this.LJLJL;
        if (interfaceC49115JPj != null) {
            interfaceC49115JPj.contextPause();
        }
        JGU jgu = this.LJLJI;
        if (jgu != null) {
            jgu.LJJJLZIJ();
        }
    }

    @Override // X.InterfaceC48907JHj
    public final void g9() {
        if (this.LJLJJL) {
            this.LJLJJLL = false;
        }
        LIZIZ().LIZIZ.clear();
        InterfaceC49115JPj interfaceC49115JPj = this.LJLJL;
        if (interfaceC49115JPj != null) {
            interfaceC49115JPj.pauseAll();
        }
        JGU jgu = this.LJLJI;
        if (jgu != null) {
            jgu.LJJJLZIJ();
        }
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        InterfaceC49115JPj interfaceC49115JPj = this.LJLJL;
        if (interfaceC49115JPj != null) {
            return interfaceC49115JPj.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.InterfaceC48907JHj
    public final View LJJIJIL() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.InterfaceC49148JQq
    public final void y(long j) {
        C48905JHh.LIZJ(this, j);
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    public C49113JPh(RecyclerView listView, View view, JGU jgu, JIB jib, boolean z) {
        o.LJIIIZ(listView, "listView");
        this.LJLIL = listView;
        this.LJLILLLLZI = view;
        this.LJLJI = jgu;
        this.LJLJJI = jib;
        this.LJLJJL = z;
        this.LJLJJLL = !z;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 559));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 558));
    }
}
