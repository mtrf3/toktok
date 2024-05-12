package X;

import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JGo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48886JGo implements InterfaceC48945JIv {
    public final C48887JGp LJLIL;
    public final JIB LJLILLLLZI;
    public final View LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;

    @Override // X.InterfaceC48908JHk
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

    public final C48883JGl LIZ() {
        return (C48883JGl) this.LJLJJI.getValue();
    }

    @Override // X.InterfaceC48945JIv
    public final C48912JHo LLLIIII() {
        return (C48912JHo) this.LJLJJL.getValue();
    }

    @Override // X.InterfaceC48945JIv
    public final C48881JGj v() {
        return (C48881JGj) this.LJLJJLL.getValue();
    }

    @Override // X.InterfaceC48908JHk
    public final void LLLLLJLJLL() {
        LIZ().LLLLLJLJLL();
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.InterfaceC48908JHk
    public final void contextPause() {
        LIZ().contextPause();
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        return LIZ().isPlaying();
    }

    @Override // X.InterfaceC48908JHk
    public final void onDestroy() {
        LIZ().onDestroy();
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    @Override // X.InterfaceC48908JHk
    public final void LLLLII(long j) {
        LIZ().LLLLII(j);
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

    public C48886JGo(C48887JGp c48887JGp, ImageView imageView, JIB mContainerStatusProvider, C49153JQv scrollManager, JGU mPlayVideoObserver, View itemView) {
        o.LJIIIZ(mContainerStatusProvider, "mContainerStatusProvider");
        o.LJIIIZ(scrollManager, "scrollManager");
        o.LJIIIZ(mPlayVideoObserver, "mPlayVideoObserver");
        o.LJIIIZ(itemView, "itemView");
        this.LJLIL = c48887JGp;
        this.LJLILLLLZI = mContainerStatusProvider;
        this.LJLJI = itemView;
        this.LJLJJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 557));
        this.LJLJJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 556));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 555));
        if (c48887JGp != null) {
            JGI core = c48887JGp.getCore();
            if (core != null) {
                core.setFillHeight(false);
            }
            c48887JGp.setMScrollStateObserver(LLLIIII());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(c48887JGp.hashCode());
            LIZ.append(" new stateObserver ");
            AbstractC49155JQx mScrollStateObserver = c48887JGp.getMScrollStateObserver();
            LIZ.append(mScrollStateObserver != null ? mScrollStateObserver.hashCode() : 0);
            X1D.LIZIZ(LIZ);
            c48887JGp.setMScrollStateManager(scrollManager);
            C48881JGj dataProvider = c48887JGp.getDataProvider();
            if (dataProvider != null) {
                dataProvider.LJI = mPlayVideoObserver;
            }
            C48881JGj dataProvider2 = c48887JGp.getDataProvider();
            if (dataProvider2 != null) {
                dataProvider2.LJII = mContainerStatusProvider;
            }
            C48881JGj dataProvider3 = c48887JGp.getDataProvider();
            if (dataProvider3 != null) {
                dataProvider3.LIZ = itemView;
            }
            C48881JGj dataProvider4 = c48887JGp.getDataProvider();
            if (dataProvider4 != null) {
                dataProvider4.LJIIJ = LIZ();
            }
            C48881JGj dataProvider5 = c48887JGp.getDataProvider();
            if (dataProvider5 != null) {
                dataProvider5.LJIILLIIL = "general_search";
            }
            c48887JGp.setMCoverView(imageView);
        }
    }
}
