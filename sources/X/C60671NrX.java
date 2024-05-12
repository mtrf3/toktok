package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NrX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60671NrX extends AbstractC60673NrZ {
    public final C60737Nsb LJLIL;
    public final AbstractC60673NrZ LJLILLLLZI;

    @Override // X.AbstractC60673NrZ
    public final void LJJJIL() {
        String monitorId = this.LJLIL.containerId;
        o.LJIIJ(monitorId, "monitorId");
        OFH.LIZLLL.getClass();
        OFH.LJII(monitorId);
        C39836FkG.LJII.getClass();
        C39836FkG LIZ = C38262Ezy.LIZ();
        String containerId = this.LJLIL.containerId;
        LIZ.getClass();
        o.LJIIJ(containerId, "containerId");
        LIZ.LIZJ.remove(containerId);
        AbstractC60673NrZ abstractC60673NrZ = this.LJLILLLLZI;
        if (abstractC60673NrZ != null) {
            abstractC60673NrZ.onDestroy();
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJL() {
        AbstractC60673NrZ abstractC60673NrZ = this.LJLILLLLZI;
        if (abstractC60673NrZ != null) {
            abstractC60673NrZ.LJJJJL();
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void onDestroy() {
        String monitorId = this.LJLIL.containerId;
        o.LJIIJ(monitorId, "monitorId");
        OFH.LIZLLL.getClass();
        OFH.LJII(monitorId);
        C39836FkG.LJII.getClass();
        C39836FkG LIZ = C38262Ezy.LIZ();
        String containerId = this.LJLIL.containerId;
        LIZ.getClass();
        o.LJIIJ(containerId, "containerId");
        InterfaceC39861Fkf interfaceC39861Fkf = LIZ.LIZJ.get(containerId);
        if (interfaceC39861Fkf != null) {
            interfaceC39861Fkf.release();
        }
        AbstractC60673NrZ abstractC60673NrZ = this.LJLILLLLZI;
        if (abstractC60673NrZ != null) {
            abstractC60673NrZ.onDestroy();
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLL() {
        FD5.LIZJ(System.currentTimeMillis(), this.LJLIL.containerId, "prepare_component_start");
        this.LJLIL.LIZIZ(C60728NsS.class);
        AbstractC60673NrZ abstractC60673NrZ = this.LJLILLLLZI;
        if (abstractC60673NrZ != null) {
            abstractC60673NrZ.LJJJJLL();
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIJ(view, "view");
        AbstractC60673NrZ abstractC60673NrZ = this.LJLILLLLZI;
        if (abstractC60673NrZ != null) {
            abstractC60673NrZ.LJJJJJ(view);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLI(InterfaceC60761Nsz interfaceC60761Nsz) {
        FD5.LIZJ(System.currentTimeMillis(), this.LJLIL.containerId, "prepare_component_end");
        this.LJLIL.LIZIZ(C60728NsS.class);
        AbstractC60673NrZ abstractC60673NrZ = this.LJLILLLLZI;
        if (abstractC60673NrZ != null) {
            abstractC60673NrZ.LJJJJLI(interfaceC60761Nsz);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJZ(EnumC39924Flg kitType) {
        o.LJIIJ(kitType, "kitType");
        AbstractC60673NrZ abstractC60673NrZ = this.LJLILLLLZI;
        if (abstractC60673NrZ != null) {
            abstractC60673NrZ.LJJJJZ(kitType);
        }
    }

    public C60671NrX(C60737Nsb hybridContext, C60791NtT c60791NtT) {
        o.LJIIJ(hybridContext, "hybridContext");
        this.LJLIL = hybridContext;
        this.LJLILLLLZI = c60791NtT;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJ(InterfaceC60761Nsz view, String url) {
        o.LJIIJ(view, "view");
        o.LJIIJ(url, "url");
        AbstractC60673NrZ abstractC60673NrZ = this.LJLILLLLZI;
        if (abstractC60673NrZ != null) {
            abstractC60673NrZ.LJJJJ(view, url);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIJ(view, "view");
        o.LJIIJ(url, "url");
        AbstractC60673NrZ abstractC60673NrZ = this.LJLILLLLZI;
        if (abstractC60673NrZ != null) {
            abstractC60673NrZ.LJJJJJL(view, url);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIJ(view, "view");
        o.LJIIJ(url, "url");
        AbstractC60673NrZ abstractC60673NrZ = this.LJLILLLLZI;
        if (abstractC60673NrZ != null) {
            abstractC60673NrZ.LJJJJI(view, url, str);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        o.LJIIJ(view, "view");
        o.LJIIJ(url, "url");
        AbstractC60673NrZ abstractC60673NrZ = this.LJLILLLLZI;
        if (abstractC60673NrZ != null) {
            abstractC60673NrZ.LJJJJIZL(view, url, c60704Ns4);
        }
    }
}
