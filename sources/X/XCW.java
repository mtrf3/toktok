package X;

import Y.ARunnableS51S0100000_15;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XCW extends XCZ {
    public final C46141rW<Effect> LJI;
    public final C46141rW<Effect> LJII;
    public final C46141rW<String> LJIIIIZZ;
    public final C46141rW<Effect> LJIIIZ;
    public final C46141rW<OSZ<Effect, C84418XBe>> LJIIJ;
    public final XCG LJIIJJI;
    public final List<Effect> LJIIL;
    public final String LJIILIIL;
    public final XEU LJIILJJIL;

    @Override // X.XCZ
    public final void LIZJ() {
    }

    @Override // X.XCZ
    public final void LIZ() {
        if (this.LJII.isEmpty()) {
            XCZ.LJFF(new AqS162S0200000_15(this, new ArrayList(), 36));
        } else {
            LJI();
        }
    }

    public final void LJI() {
        C84418XBe c84418XBe;
        OSZ<Effect, C84418XBe> osz;
        Effect remove;
        if (!this.LJII.isEmpty()) {
            if (this.LJIIIIZZ.size() < 5) {
                int size = 5 - this.LJIIIIZZ.size();
                int i = 0;
                while (i <= size && (!this.LJII.isEmpty())) {
                    C30941Ji c30941Ji = C84452XCm.LIZ;
                    c30941Ji.LIZIZ();
                    try {
                        C46141rW<Effect> c46141rW = this.LJII;
                        if ((!c46141rW.isEmpty()) && (remove = c46141rW.remove(0)) != null) {
                            LJII(remove);
                            i++;
                        }
                    } finally {
                        c30941Ji.LIZLLL();
                    }
                }
                return;
            }
            return;
        }
        if (this.LJIIJ.size() + this.LJIIIZ.size() == this.LJI.size()) {
            if (this.LJIIIZ.size() == this.LJI.size()) {
                List<Effect> downloadedEffectList = this.LJIIL;
                o.LJIIJ(downloadedEffectList, "downloadedEffectList");
                XCZ.LJFF(new AqS162S0200000_15(this, downloadedEffectList, 36));
                return;
            }
            C46141rW<OSZ<Effect, C84418XBe>> c46141rW2 = this.LJIIJ;
            ArrayList arrayList = new ArrayList(C32I.LJJL(c46141rW2, 10));
            Iterator<OSZ<Effect, C84418XBe>> it = c46141rW2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getFirst());
            }
            C46141rW<OSZ<Effect, C84418XBe>> c46141rW3 = this.LJIIJ;
            if (!(!c46141rW3.isEmpty()) || (osz = c46141rW3.get(0)) == null || (c84418XBe = osz.getSecond()) == null) {
                c84418XBe = new C84418XBe(10002);
            }
            if (!(!arrayList.isEmpty())) {
                return;
            }
            C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, c84418XBe, 34), 64));
        }
    }

    public final void LJII(Effect effect) {
        this.LJIIIIZZ.add(effect.getId());
        String LIZ = C84410XAw.LIZ();
        this.LJIIJJI.LJJJ.LIZIZ(LIZ, new C84445XCf(this));
        XCL xcl = new XCL(effect, this.LJIIJJI, LIZ, this.LJIILJJIL);
        XCX xcx = this.LJIIJJI.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(xcl);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public XCW(XCG effectConfig, List<? extends Effect> effectList, String taskFlag, XEU xeu) {
        super(taskFlag, effectConfig.LJJJ);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(effectList, "effectList");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJIIJJI = effectConfig;
        this.LJIIL = effectList;
        this.LJIILIIL = taskFlag;
        this.LJIILJJIL = xeu;
        this.LJI = new C46141rW<>(true);
        this.LJII = new C46141rW<>(true);
        this.LJIIIIZZ = new C46141rW<>(true);
        this.LJIIIZ = new C46141rW<>(true);
        this.LJIIJ = new C46141rW<>(true);
        HashSet hashSet = new HashSet();
        for (Effect effect : effectList) {
            String LJIL = C78966Uyw.LJIL(effect);
            if (!hashSet.contains(LJIL)) {
                this.LJI.add(effect);
                hashSet.add(LJIL);
            }
        }
        this.LJII.addAll(this.LJI);
    }
}
