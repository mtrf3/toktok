package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterNativeSetting;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;

/* loaded from: classes6.dex */
public final class CKQ implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ CKO LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ CKR LJLJJL;

    public CKQ(int i, CKO cko, int i2, int i3, CKR ckr) {
        this.LJLIL = i;
        this.LJLILLLLZI = cko;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = ckr;
    }

    public final void LIZ() {
        LiveCore.Builder builder;
        int i = this.LJLIL;
        if (i != 2) {
            if (i != 3) {
                boolean z = true;
                if (i != 11) {
                    if (i != 13) {
                        if (i != 15) {
                            if (i != 30) {
                                if (i != 32) {
                                    if (i != 38) {
                                        if (i != 101) {
                                            return;
                                        }
                                        if (LiveCenterNativeSetting.INSTANCE.useNative() && this.LJLJJI == this.LJLJJL.LJLIL) {
                                            return;
                                        }
                                        CKR ckr = this.LJLJJL;
                                        int i2 = this.LJLJJI;
                                        ckr.LJLIL = i2;
                                        InterfaceC21030s7 interfaceC21030s7 = this.LJLILLLLZI.LJII;
                                        if (interfaceC21030s7 == null) {
                                            return;
                                        }
                                        interfaceC21030s7.xj(i2);
                                        return;
                                    }
                                    LiveCore liveCore = this.LJLILLLLZI.LJ;
                                    if (liveCore == null || (builder = liveCore.getBuilder()) == null) {
                                        return;
                                    }
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append("Update video resolution success! : capWidth: ");
                                    LIZ.append(builder.getVideoCaptureWidth());
                                    LIZ.append(", capHeight: ");
                                    LIZ.append(builder.getVideoCaptureHeight());
                                    LIZ.append("; clipWidth: ");
                                    LIZ.append(builder.getCaptureAdaptedWidth());
                                    LIZ.append(", clipHeight: ");
                                    LIZ.append(builder.getCaptureAdaptedHeight());
                                    LIZ.append("; ");
                                    C0NB.LIZIZ("CapAndClipResolutionOpt", X1D.LIZIZ(LIZ));
                                    return;
                                }
                                InterfaceC21030s7 interfaceC21030s72 = this.LJLILLLLZI.LJII;
                                if (interfaceC21030s72 == null) {
                                    return;
                                }
                                if (this.LJLJI == 0) {
                                    z = false;
                                }
                                interfaceC21030s72.ha(z);
                                return;
                            }
                            InterfaceC21030s7 interfaceC21030s73 = this.LJLILLLLZI.LJII;
                            if (interfaceC21030s73 == null) {
                                return;
                            }
                            interfaceC21030s73.z0();
                            return;
                        }
                        CKO cko = this.LJLILLLLZI;
                        cko.LJIIJ = true;
                        InterfaceC21030s7 interfaceC21030s74 = cko.LJII;
                        if (interfaceC21030s74 == null) {
                            return;
                        }
                        interfaceC21030s74.Wk();
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    CKO cko2 = this.LJLILLLLZI;
                    if (currentTimeMillis - cko2.LJIIJJI <= 5000) {
                        return;
                    }
                    cko2.LJIIJJI = System.currentTimeMillis();
                    InterfaceC21030s7 interfaceC21030s75 = this.LJLILLLLZI.LJII;
                    if (interfaceC21030s75 == null) {
                        return;
                    }
                    interfaceC21030s75.bh();
                    return;
                }
                CKO cko3 = this.LJLILLLLZI;
                if (cko3.LJIIJ) {
                    cko3.LJIIJ = false;
                    InterfaceC21030s7 interfaceC21030s76 = cko3.LJII;
                    if (interfaceC21030s76 != null) {
                        interfaceC21030s76.tl();
                    }
                } else {
                    InterfaceC21030s7 interfaceC21030s77 = cko3.LJII;
                    if (interfaceC21030s77 != null) {
                        interfaceC21030s77.t8();
                    }
                }
                CKO cko4 = this.LJLILLLLZI;
                if (!cko4.LJIIZILJ) {
                    cko4.LJIIZILJ = true;
                    InterfaceC21030s7 interfaceC21030s78 = cko4.LJII;
                    if (interfaceC21030s78 != null) {
                        interfaceC21030s78.x();
                    }
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                CKO cko5 = this.LJLILLLLZI;
                if (currentTimeMillis2 - cko5.LJIIJJI <= 5000) {
                    return;
                }
                cko5.LJIIJJI = System.currentTimeMillis();
                InterfaceC21030s7 interfaceC21030s79 = this.LJLILLLLZI.LJII;
                if (interfaceC21030s79 == null) {
                    return;
                }
                interfaceC21030s79.bh();
                return;
            }
            CKO cko6 = this.LJLILLLLZI;
            int i3 = cko6.LJIIIIZZ;
            if (i3 == -1) {
                return;
            }
            int i4 = this.LJLJI;
            cko6.LJIIL.removeCallbacksAndMessages(null);
            InterfaceC21030s7 interfaceC21030s710 = cko6.LJII;
            if (interfaceC21030s710 != null) {
                interfaceC21030s710.G(i3, i4, "");
            }
            this.LJLILLLLZI.LJIIIIZZ = -1;
            return;
        }
        InterfaceC21030s7 interfaceC21030s711 = this.LJLILLLLZI.LJII;
        if (interfaceC21030s711 == null) {
            return;
        }
        interfaceC21030s711.m7();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
