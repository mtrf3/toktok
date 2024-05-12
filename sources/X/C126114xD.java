package X;

import android.content.Context;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.ugc.android.davinciresource.DavinciResource;
import com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS103S0101000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS19S1101000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4xD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126114xD implements InterfaceC126184xK {
    public final C17J LIZ = new C17J();
    public final C125304vu LIZIZ = new C125304vu();
    public InterfaceC126134xF LIZJ;

    @Override // X.InterfaceC126184xK
    public final void LIZJ() {
        this.LIZJ = null;
        this.LIZ.getClass();
        ((InterfaceC126144xG) C172286pU.LJ.getValue()).LIZIZ();
        LJFF();
    }

    @Override // X.InterfaceC126184xK
    public final void clear() {
        this.LIZJ = null;
        this.LIZ.getClass();
        ((InterfaceC126144xG) C172286pU.LJ.getValue()).clear();
        LJFF();
    }

    public final void LJFF() {
        C125254vp c125254vp;
        Iterator<AbstractC125294vt> it = this.LIZIZ.LIZ.iterator();
        while (it.hasNext()) {
            AbstractC125294vt next = it.next();
            if ((next instanceof C125254vp) && (c125254vp = (C125254vp) next) != null) {
                PthreadTimer pthreadTimer = c125254vp.LIZLLL;
                if (pthreadTimer != null) {
                    pthreadTimer.cancel();
                }
                c125254vp.LIZLLL = null;
                MessageCenter.removeListener(c125254vp.LJ);
                c125254vp.LJ = null;
                return;
            }
        }
    }

    @Override // X.InterfaceC126184xK
    public final void LIZ(List<? extends AbstractC125294vt> list) {
        this.LIZIZ.LIZ.clear();
        this.LIZIZ.LIZ.addAll(list);
    }

    @Override // X.InterfaceC126184xK
    public final void LIZIZ(C125184vi c125184vi) {
        this.LIZIZ.LIZ(new C125284vs(EnumC126024x4.REMOVE, c125184vi, null), null, null);
    }

    @Override // X.InterfaceC126184xK
    public final void LJ(final C125184vi c125184vi, InterfaceC126134xF interfaceC126134xF) {
        this.LIZJ = interfaceC126134xF;
        EnumC126954yZ enumC126954yZ = c125184vi.LJLIL.LJFF;
        if (enumC126954yZ != null) {
            if (enumC126954yZ == EnumC126954yZ.COMBINE_GAME_PLAY) {
                C17J.LIZLLL(c125184vi, new InterfaceC172486po() { // from class: X.4xB
                    @Override // X.InterfaceC172486po
                    public final void onProgress(int i) {
                    }

                    @Override // X.InterfaceC172486po
                    public final void onStart() {
                        C2NE.LIZ(new AqS152S0100000_2(C126114xD.this, 1045));
                    }

                    @Override // X.InterfaceC172486po
                    public final void LIZ(NLETimeSpaceNode node) {
                        NLETemplateModel nLETemplateModel;
                        o.LJIIIZ(node, "node");
                        C2NE.LIZ(new AqS152S0100000_2(C126114xD.this, 1046));
                        if (!(node instanceof NLETemplateModel) || (nLETemplateModel = (NLETemplateModel) node) == null) {
                            C2NE.LIZ(new AqS152S0100000_2(C126114xD.this, 1047));
                            return;
                        }
                        C125284vs c125284vs = new C125284vs(EnumC126024x4.APPLY, c125184vi, nLETemplateModel);
                        C126114xD c126114xD = C126114xD.this;
                        c126114xD.LIZIZ.LIZ(c125284vs, new AqS168S0100000_2(c126114xD, 646), new AqS168S0100000_2(C126114xD.this, 647));
                    }

                    @Override // X.InterfaceC172486po
                    public final void onError(int i, String errorMsg) {
                        o.LJIIIZ(errorMsg, "errorMsg");
                        C2NE.LIZ(new AqS19S1101000_2(C126114xD.this, i, errorMsg, 2));
                    }
                });
            } else {
                C17J.LIZLLL(c125184vi, new InterfaceC172486po() { // from class: X.4xC
                    @Override // X.InterfaceC172486po
                    public final void onStart() {
                        C2NE.LIZ(new AqS152S0100000_2(C126114xD.this, 1048));
                    }

                    @Override // X.InterfaceC172486po
                    public final void LIZ(NLETimeSpaceNode node) {
                        NLETemplateModel nLETemplateModel;
                        o.LJIIIZ(node, "node");
                        C2NE.LIZ(new AqS152S0100000_2(C126114xD.this, 1049));
                        if (!(node instanceof NLETemplateModel) || (nLETemplateModel = (NLETemplateModel) node) == null) {
                            C2NE.LIZ(new AqS152S0100000_2(C126114xD.this, 1050));
                            return;
                        }
                        C125284vs c125284vs = new C125284vs(EnumC126024x4.APPLY, c125184vi, nLETemplateModel);
                        C126114xD c126114xD = C126114xD.this;
                        c126114xD.LIZIZ.LIZ(c125284vs, new AqS168S0100000_2(c126114xD, 648), null);
                    }

                    @Override // X.InterfaceC172486po
                    public final void onProgress(int i) {
                        C2NE.LIZ(new AqS103S0101000_2(C126114xD.this, i, 10));
                    }

                    @Override // X.InterfaceC172486po
                    public final void onError(int i, String errorMsg) {
                        o.LJIIIZ(errorMsg, "errorMsg");
                        C2NE.LIZ(new AqS19S1101000_2(C126114xD.this, i, errorMsg, 3));
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC126184xK
    public final void LIZLLL(Context context, C126944yY c126944yY, DAVUnZipFunc dAVUnZipFunc) {
        this.LIZ.getClass();
        if (!C126174xJ.LIZIZ) {
            synchronized (C126174xJ.LIZ) {
                if (!C126174xJ.LIZIZ) {
                    Context LLLLL = C16880lQ.LLLLL(context);
                    o.LJIIIIZZ(LLLLL, "context.applicationContext");
                    C126154xH.LIZ = LLLLL;
                    C172286pU.LIZ(c126944yY);
                    C126174xJ.LIZIZ = true;
                }
            }
        }
        DavinciResource.INSTANCE.setUnZipper(dAVUnZipFunc);
    }
}
