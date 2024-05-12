package X;

import Y.ARunnableS51S0100000_15;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS197S0100000_15;
import ujb.o;
import ujb.s;

/* renamed from: X.XCt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84459XCt extends XCZ {
    public static final C30941Ji LJIIIZ = new C30941Ji(0);
    public static final C40601ia<String, ArrayList<InterfaceC84461XCv>> LJIIJ = new C40601ia<>(false);
    public final XCG LJI;
    public final ProviderEffect LJII;
    public final String LJIIIIZZ;

    @Override // X.XCZ
    public final void LIZ() {
        XDM xdm = XDM.LIZ;
        ProviderEffect providerEffect = this.LJII;
        xdm.getClass();
        String LIZLLL = XDM.LIZLLL(providerEffect);
        String str = "";
        if (LIZLLL == null) {
            LIZLLL = "";
        }
        if (o.LJJJJJL(LIZLLL)) {
            C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, new C84418XBe(10015), 53), 64));
            return;
        }
        if (o.LJJJJJL(this.LJII.getId())) {
            C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, new C84418XBe(10014), 53), 64));
            return;
        }
        XDR LIZ = this.LJI.LJJJ.LIZ(this.LJIIIIZZ);
        if (LIZ != null) {
            C30941Ji c30941Ji = LJIIIZ;
            c30941Ji.LIZIZ();
            try {
                C40601ia<String, ArrayList<InterfaceC84461XCv>> c40601ia = LJIIJ;
                if (c40601ia.containsKey(this.LJII.getId())) {
                    ArrayList arrayList = c40601ia.get(this.LJII.getId());
                    if (arrayList != null) {
                        arrayList.add(LIZ);
                    }
                    this.LJI.LJJJ.LIZJ(this.LJIIIIZZ);
                    return;
                }
                c40601ia.put(this.LJII.getId(), new ArrayList<>());
                c30941Ji.LIZLLL();
                if (C107244Iu.LIZIZ(this.LJII.getPath())) {
                    int LJJLIIJ = s.LJJLIIJ(LIZLLL, "/", 6);
                    int LJJLIIJ2 = s.LJJLIIJ(LIZLLL, ".", 6);
                    if (1 <= LJJLIIJ && LJJLIIJ2 > LJJLIIJ) {
                        str = LIZLLL.substring(LJJLIIJ2, LIZLLL.length());
                        kotlin.jvm.internal.o.LJFF(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    this.LJII.setPath(this.LJI.LJIIIIZZ + C10820be.LIZ + this.LJII.getId() + str);
                }
                try {
                    String path = this.LJII.getPath();
                    if (path != null) {
                        ProviderEffect LJI = LJI(LIZLLL, path);
                        if (LJI != null) {
                            C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, LJI, 57), 64));
                            return;
                        } else {
                            C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, new C84418XBe(10002), 53), 64));
                            return;
                        }
                    }
                    kotlin.jvm.internal.o.LJIIZILJ();
                    throw null;
                } catch (Exception e) {
                    C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, new C84418XBe(e), 53), 64));
                    return;
                }
            } finally {
                c30941Ji.LIZLLL();
            }
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.ss.ugc.effectplatform.listener.IDownloadProviderEffectProgressListener");
    }

    @Override // X.XCZ
    public final void LIZJ() {
        C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS165S0100000_15(this, 722), 64));
    }

    public final ProviderEffect LJI(String str, String str2) {
        VNB fetchFromNetwork;
        if (!C10820be.LJ(this.LJI.LJIIIIZZ)) {
            C10820be.LJIIJJI(this.LJI.LJIIIIZZ);
        }
        String LIZ = XBM.LIZ(str2);
        if (LIZ == null) {
            return null;
        }
        if (C10820be.LJ(LIZ)) {
            C10820be.LJIILL(LIZ);
        }
        XD6 xd6 = new XD6(str, null, XD7.GET, null, null, 186);
        X62 x62 = (X62) this.LJI.LJIJI.LIZ;
        if (x62 != null && (fetchFromNetwork = x62.fetchFromNetwork(xd6)) != null) {
            C84426XBm c84426XBm = new C84426XBm(fetchFromNetwork.LIZJ);
            XBM.LIZIZ(c84426XBm, C10820be.LJIIL(LIZ, false), fetchFromNetwork.LIZLLL, new AqS197S0100000_15(this, 41));
            c84426XBm.close();
            XBM.LJIIIIZZ(LIZ, str2, false);
            return this.LJII;
        }
        throw new C84434XBu(-2, "net response returned empty response!");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84459XCt(XCG effectConfig, ProviderEffect effect, String taskFlag) {
        super(taskFlag, null);
        kotlin.jvm.internal.o.LJIIJ(effectConfig, "effectConfig");
        kotlin.jvm.internal.o.LJIIJ(effect, "effect");
        kotlin.jvm.internal.o.LJIIJ(taskFlag, "taskFlag");
        this.LJI = effectConfig;
        this.LJII = effect;
        this.LJIIIIZZ = taskFlag;
    }
}
