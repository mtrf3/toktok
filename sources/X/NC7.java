package X;

import Y.ARunnableS7S1300000_10;
import Y.ARunnableS9S1200000_10;
import android.content.Context;
import android.hardware.SensorManager;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentRelationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NC7 implements IAnoleManager, InterfaceC58979NCt {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final AnoleModel LIZJ;
    public final NCA LIZLLL;
    public final INV LJ;
    public final java.util.Map<String, List<NC9>> LJFF;
    public final java.util.Map<String, NC9> LJI;
    public final C62822Ol8 LJII;
    public final C47585Ilx LJIIIIZZ;

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final void LIZ() {
        C242549fW.LIZ("prerender");
        Iterator<NC9> it = this.LJI.values().iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final void LIZIZ() {
        C242549fW.LIZ("hostDidDisappear");
        SensorManager sensorManager = (SensorManager) this.LJII.getValue();
        C47585Ilx c47585Ilx = this.LJIIIIZZ;
        o.LJIIIZ(sensorManager, "sensorManager");
        if (c47585Ilx != null && !new C03880Dg(2).LIZJ(100701, "android/hardware/SensorManager", "unregisterListener", sensorManager, new Object[]{c47585Ilx}, "void", new C65300Pk0(false, "(Landroid/hardware/SensorEventListener;)V", "968503684613557618")).LIZ) {
            sensorManager.unregisterListener(c47585Ilx);
        }
        Iterator<NC9> it = this.LJI.values().iterator();
        while (it.hasNext()) {
            it.next().LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final void LIZJ() {
        C242549fW.LIZ("unmount");
        Iterator<NC9> it = this.LJI.values().iterator();
        while (it.hasNext()) {
            it.next().LIZJ();
        }
    }

    @Override // X.InterfaceC58979NCt
    public final NDG LIZLLL() {
        return this.LIZLLL.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final void LJFF() {
        C242549fW.LIZ("hostWillAppear");
        Iterator<NC9> it = this.LJI.values().iterator();
        while (it.hasNext()) {
            it.next().LJFF();
        }
        O6R.LJJI(this, new NCP());
        Object sensorManager = this.LJII.getValue();
        o.LJIIIZ(sensorManager, "sensorManager");
    }

    @Override // X.InterfaceC58979NCt
    public final NBS LJI() {
        return this.LIZLLL.LJI();
    }

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final void clear() {
        C242549fW.LIZ("releaseCache");
        Iterator<NC9> it = this.LJI.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
    }

    @Override // X.InterfaceC58979NCt
    public final C58958NBy LJII(String slotID) {
        o.LJIIIZ(slotID, "slotID");
        return this.LIZLLL.LJII(slotID);
    }

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final void LJIIIZ(AbstractC58939NBf event) {
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleEvent = ");
        LIZ.append(event.getClass());
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        if (event instanceof NBU) {
            NBU nbu = (NBU) event;
            if (nbu instanceof NBR) {
                C242549fW.LIZ("playerDidReady");
                java.util.Map<String, AnoleComponentRelationModel> componentRelations = this.LIZJ.getComponentRelations();
                if (componentRelations != null) {
                    for (Map.Entry<String, AnoleComponentRelationModel> entry : componentRelations.entrySet()) {
                        String key = entry.getKey();
                        AnoleComponentRelationModel value = entry.getValue();
                        List<AnoleComponentAppearModel> showModels = value.getShowModels();
                        if (showModels != null) {
                            ArrayList arrayList = new ArrayList();
                            for (AnoleComponentAppearModel anoleComponentAppearModel : showModels) {
                                if (o.LJ(anoleComponentAppearModel.getType(), NCT.PLAY_PROGRESS.getType())) {
                                    arrayList.add(anoleComponentAppearModel);
                                }
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                AnoleComponentAppearModel anoleComponentAppearModel2 = (AnoleComponentAppearModel) it.next();
                                Double playProgress = anoleComponentAppearModel2.getPlayProgress();
                                if (playProgress != null) {
                                    double doubleValue = playProgress.doubleValue();
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append(key);
                                    LIZ2.append('-');
                                    LIZ2.append(doubleValue);
                                    LIZ2.append("-show");
                                    String LIZIZ = X1D.LIZIZ(LIZ2);
                                    boolean LJ = this.LIZLLL.LJ(new ARunnableS7S1300000_10(anoleComponentAppearModel2, value, this, key, 6), (int) doubleValue, LIZIZ);
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append("registerPlayProgressObserverForShow is success = ");
                                    LIZ3.append(LJ);
                                    C242549fW.LIZ(X1D.LIZIZ(LIZ3));
                                }
                            }
                        }
                        List<AnoleComponentAppearModel> hideModels = value.getHideModels();
                        if (hideModels != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (AnoleComponentAppearModel anoleComponentAppearModel3 : hideModels) {
                                if (o.LJ(anoleComponentAppearModel3.getType(), NCT.PLAY_PROGRESS.getType())) {
                                    arrayList2.add(anoleComponentAppearModel3);
                                }
                            }
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                AnoleComponentAppearModel anoleComponentAppearModel4 = (AnoleComponentAppearModel) it2.next();
                                Double playProgress2 = anoleComponentAppearModel4.getPlayProgress();
                                if (playProgress2 != null) {
                                    double doubleValue2 = playProgress2.doubleValue();
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append(key);
                                    LIZ4.append('-');
                                    LIZ4.append(doubleValue2);
                                    LIZ4.append("-hide");
                                    String LIZIZ2 = X1D.LIZIZ(LIZ4);
                                    boolean LJ2 = this.LIZLLL.LJ(new ARunnableS9S1200000_10(anoleComponentAppearModel4, this, key, 7), (int) doubleValue2, LIZIZ2);
                                    StringBuilder LIZ5 = X1D.LIZ();
                                    LIZ5.append("registerPlayProgressObserverForHide is success = ");
                                    LIZ5.append(LJ2);
                                    C242549fW.LIZ(X1D.LIZIZ(LIZ5));
                                }
                            }
                        }
                    }
                }
                C78983UzD.LJJJJZ(this, C58961NCb.LIZ);
                O6R.LJJI(this, new NCW());
                C78983UzD.LJJJJZ(this, C58968NCi.LIZ);
                return;
            }
            if (nbu instanceof NBQ) {
                O6R.LJJI(this, new NCV());
                C78983UzD.LJJJJZ(this, C58967NCh.LIZ);
                return;
            }
            if (nbu instanceof NBP) {
                O6R.LJJI(this, new NCS());
                C78983UzD.LJJJJZ(this, C58965NCf.LIZ);
                return;
            }
            if (nbu instanceof NBO) {
                O6R.LJJI(this, new NCR());
                C78983UzD.LJJJJZ(this, C58964NCe.LIZ);
                return;
            } else if (nbu instanceof DK8) {
                O6R.LJJI(this, new NCB());
                C78983UzD.LJJJJZ(this, new NCL());
                return;
            } else {
                if (nbu instanceof NBV) {
                    O6R.LJJI(this, new NCU());
                    C78983UzD.LJJJJZ(this, C58966NCg.LIZ);
                    return;
                }
                return;
            }
        }
        if (o.LJ(event, C58946NBm.LIZ)) {
            O6R.LJJI(this, new NCQ());
            C78983UzD.LJJJJZ(this, C58960NCa.LIZ);
            return;
        }
        if (o.LJ(event, C58943NBj.LIZ)) {
            O6R.LJJI(this, new NCN());
            C78983UzD.LJJJJZ(this, NCY.LIZ);
            return;
        }
        if (o.LJ(event, C58937NBd.LIZ)) {
            O6R.LJJI(this, new NCX());
            C78983UzD.LJJJJZ(this, C58963NCd.LIZ);
        } else if (o.LJ(event, C58944NBk.LIZ)) {
            O6R.LJJI(this, new NCO());
            C78983UzD.LJJJJZ(this, NCZ.LIZ);
        } else if (!o.LJ(event, C58935NBb.LIZ) && (event instanceof C58945NBl)) {
            C78983UzD.LJJJJZ(this, new NCJ(((C58945NBl) event).LIZ));
        }
    }

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final void LJIIJ(String slotID) {
        o.LJIIIZ(slotID, "slotID");
        C242549fW.LIZ("unmount(slotID: String)");
        List list = (List) ((LinkedHashMap) this.LJFF).get(slotID);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((NC9) it.next()).LIZJ();
            }
        }
    }

    @Override // X.InterfaceC58979NCt
    public final void LJIIIIZZ(NC2 event, NC9 component) {
        AnoleComponentRelationModel anoleComponentRelationModel;
        AnoleComponentRelationModel anoleComponentRelationModel2;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(component, "component");
        String type = component.J0().getType();
        if (event instanceof NC0) {
            String componentType = ((NC0) event).LIZ;
            o.LJIIIZ(componentType, "componentType");
            java.util.Map<String, AnoleComponentRelationModel> componentRelations = this.LIZJ.getComponentRelations();
            if (componentRelations == null || (anoleComponentRelationModel2 = componentRelations.get(componentType)) == null) {
                return;
            }
            O6R.LJJII(this, componentType, new NCM(), anoleComponentRelationModel2);
            return;
        }
        if (event instanceof NC1) {
            String componentType2 = ((NC1) event).LIZ;
            o.LJIIIZ(componentType2, "componentType");
            java.util.Map<String, AnoleComponentRelationModel> componentRelations2 = this.LIZJ.getComponentRelations();
            if (componentRelations2 == null || (anoleComponentRelationModel = componentRelations2.get(componentType2)) == null) {
                return;
            }
            O6R.LJJIFFI(this, componentType2, new NCM(), anoleComponentRelationModel);
            return;
        }
        if (event instanceof NC4) {
            O6R.LJJI(this, new NCG(type));
            this.LIZLLL.LJIIJ(NBL.LIZ, component);
            return;
        }
        if (event instanceof NC3) {
            O6R.LJJI(this, new NCF(type));
            this.LIZLLL.LJIIJ(C58949NBp.LIZ, component);
            return;
        }
        if (event instanceof C58957NBx) {
            O6R.LJJI(this, new NCH(type));
            this.LIZLLL.LJIIJ(new NBT(((C58957NBx) event).LIZ), component);
            return;
        }
        if (!(event instanceof C59252Uf)) {
            if (event instanceof C58955NBv) {
                C58955NBv c58955NBv = (C58955NBv) event;
                O6R.LJJI(this, new NCD(type, c58955NBv.LIZ));
                this.LIZLLL.LJIIJ(new C58951NBr(c58955NBv.LIZ, c58955NBv.LIZIZ), component);
                return;
            } else {
                if (!(event instanceof C58956NBw)) {
                    return;
                }
                this.LIZLLL.LJIIJ(new C58947NBn(((C58956NBw) event).LIZ, ((LinkedHashMap) this.LJFF).keySet()), component);
                return;
            }
        }
        new NCE(type);
        throw null;
    }

    @Override // X.InterfaceC58979NCt
    public final boolean LJ(Runnable runnable, int i, String token) {
        o.LJIIIZ(token, "token");
        return this.LIZLLL.LJ(runnable, i, token);
    }

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final void mount(ViewGroup viewGroup, String slotID, InterfaceC58980NCu interfaceC58980NCu) {
        o.LJIIIZ(slotID, "slotID");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mount, slotID: ");
        LIZ.append(slotID);
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        List list = (List) ((LinkedHashMap) this.LJFF).get(slotID);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((NC9) it.next()).K0(viewGroup, interfaceC58980NCu);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NC7(android.content.Context r10, com.ss.android.ugc.aweme.feed.model.Aweme r11, com.ss.android.ugc.aweme.commercialize.model.AnoleModel r12, X.NCA r13, X.INV r14) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NC7.<init>(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.commercialize.model.AnoleModel, X.NCA, X.INV):void");
    }
}
