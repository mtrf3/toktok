package X;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.apm.config.SlardarConfigManagerImpl;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentRelationModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class O6R implements InterfaceC48038ItG, InterfaceC73592SuS, C0WM, InterfaceC62573Oh7, InterfaceC46109I7t, InterfaceC60617Nqf, InterfaceC64097PDp, InterfaceC67000QRg {
    public static volatile InterfaceC11200cG LJLILLLLZI;
    public static final O6R LJLIL = new O6R();
    public static final O6R LJLJI = new O6R();

    @Override // X.InterfaceC67000QRg
    public void LIZIZ(int i, String str) {
    }

    @Override // X.InterfaceC67000QRg
    public void LIZJ(int i) {
    }

    @Override // X.InterfaceC67000QRg
    public void LIZLLL(int i, String str) {
    }

    @Override // X.InterfaceC62573Oh7
    public C4P8 LJ() {
        return null;
    }

    @Override // X.InterfaceC67000QRg
    public void LJI(int i) {
    }

    @Override // X.InterfaceC67000QRg
    public void LJII() {
    }

    @Override // X.InterfaceC67000QRg
    public void LJIIIIZZ(String str, boolean z) {
    }

    @Override // X.InterfaceC46109I7t
    public boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC62573Oh7
    public void LJIIJ(boolean z) {
    }

    @Override // X.InterfaceC67000QRg
    public void LJIIL() {
    }

    @Override // X.InterfaceC67000QRg
    public void LJIILL(int i, int i2, String str, String str2) {
    }

    @Override // X.InterfaceC67000QRg
    public void LJIILLIIL() {
    }

    public void LJIJ(Context context) {
        o.LJIIJ(context, "context");
    }

    public void LJIL(C37955Ev1 call, String str, C37945Eur c37945Eur) {
        o.LJIIJ(call, "call");
    }

    public void LJJ(String bridgeName, String str, C37945Eur c37945Eur) {
        o.LJIIJ(bridgeName, "bridgeName");
    }

    public void LJJIII() {
    }

    @Override // X.InterfaceC67000QRg
    public void init() {
    }

    @Override // X.InterfaceC46109I7t
    public boolean isEnabled() {
        return G6L.LIZ();
    }

    public /* synthetic */ O6R() {
    }

    public /* synthetic */ O6R(int i) {
    }

    public static void LJJIIJ(C1QC c1qc) {
        boolean z;
        C0TX.LIZ.LIZJ("Sticker");
        C0TX.LIZLLL("performing sticker process.");
        Iterator<Object> it = c1qc.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            LiveEffect liveEffect = (LiveEffect) it.next();
            if (C1KJ.LIZ.LIZ(liveEffect) || C78880UxY.LJJJJJL(liveEffect)) {
                z = true;
            } else {
                z = false;
            }
            liveEffect.isDownloaded = z;
        }
    }

    public static final int LJJIIJZLJL(double d) {
        if (!Double.isNaN(d)) {
            if (d > 2.147483647E9d) {
                return Integer.MAX_VALUE;
            }
            if (d < -2.147483648E9d) {
                return LiveLayoutPreloadThreadPriority.DEFAULT;
            }
            return (int) Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static final int LJJIIZ(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static final long LJJIJ(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    @Override // X.C0WM
    public List LJIIJJI(EffectChannelResponse effectChannelResponse) {
        ArrayList arrayList;
        List<Effect> allCategoryEffects;
        if (effectChannelResponse != null && (allCategoryEffects = effectChannelResponse.getAllCategoryEffects()) != null) {
            arrayList = new ArrayList(C32I.LJJL(allCategoryEffects, 10));
            Iterator<Effect> it = allCategoryEffects.iterator();
            while (it.hasNext()) {
                arrayList.add(C0LT.LIZIZ(it.next()));
            }
        } else {
            arrayList = new ArrayList();
        }
        return C47261Igj.LJJIJ(new C1QC("livegame", "livegame", arrayList, null, 56));
    }

    @Override // X.InterfaceC64097PDp
    public boolean LJIILJJIL(String str) {
        Boolean bool = O6S.LIZ.LJLIL.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC64097PDp
    public boolean LJIIZILJ(String str) {
        SlardarConfigManagerImpl slardarConfigManagerImpl;
        ApmDelegate apmDelegate = OIO.LIZ;
        if (!apmDelegate.LJLJL || (slardarConfigManagerImpl = apmDelegate.LJLJJLL) == null) {
            return false;
        }
        return slardarConfigManagerImpl.getMetricTypeSwitch(str);
    }

    @Override // X.InterfaceC64097PDp
    public boolean LJJJJJL(String str) {
        Boolean bool = (Boolean) ((ConcurrentHashMap) O6S.LIZ.LJLILLLLZI).get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        SearchMixFeedList it = (SearchMixFeedList) obj;
        o.LJIIIZ(it, "it");
        C49369JZd.LIZ.LIZ(it);
        return it;
    }

    @Override // X.InterfaceC64097PDp
    public boolean getLogTypeSwitch(String str) {
        return OIO.LIZ.LIZJ(str);
    }

    @Override // X.InterfaceC64097PDp
    public boolean getServiceSwitch(String str) {
        SlardarConfigManagerImpl slardarConfigManagerImpl;
        ApmDelegate apmDelegate = OIO.LIZ;
        if (!apmDelegate.LJLJL || (slardarConfigManagerImpl = apmDelegate.LJLJJLL) == null) {
            return false;
        }
        return slardarConfigManagerImpl.getServiceSwitch(str);
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        MotionEvent ev = (MotionEvent) obj;
        o.LJIIIZ(ev, "ev");
        if (ev.getActionMasked() == 1) {
            return true;
        }
        return false;
    }

    public static Object LJIJJLI(String str, Object defaultValue) {
        o.LJIIIZ(defaultValue, "defaultValue");
        if (o.LJ(str, "TTNet_NQE_INFO")) {
            String jSONObject = C65197PiL.LIZ().toString();
            if (jSONObject == null) {
                return defaultValue;
            }
            return jSONObject;
        }
        Object LIZJ = C30922CBq.LIZJ(str, defaultValue);
        o.LJIIIIZZ(LIZJ, "{\n            SettingUti…, defaultValue)\n        }");
        return LIZJ;
    }

    public static final void LJJI(NC7 nc7, QZV qzv) {
        o.LJIIIZ(nc7, "<this>");
        java.util.Map<String, AnoleComponentRelationModel> componentRelations = nc7.LIZJ.getComponentRelations();
        if (componentRelations != null) {
            for (Map.Entry<String, AnoleComponentRelationModel> entry : componentRelations.entrySet()) {
                String key = entry.getKey();
                AnoleComponentRelationModel value = entry.getValue();
                LJJII(nc7, key, qzv, value);
                LJJIFFI(nc7, key, qzv, value);
            }
        }
    }

    @Override // X.InterfaceC64097PDp
    public boolean LJJIIZI(String str, String str2) {
        boolean z;
        PEB peb = O6S.LIZ;
        Boolean bool = (Boolean) ((ConcurrentHashMap) peb.LJLILLLLZI).get(str);
        if (peb.LJLJLJ != null && peb.LJLJLJ.optInt(str2) == 1) {
            z = true;
        } else {
            z = false;
        }
        if ((bool == null || !bool.booleanValue()) && !z) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJI(NC7 nc7, String str, AnoleComponentAppearModel anoleComponentAppearModel) {
        NC9 nc9 = nc7.LJI.get(str);
        if (nc9 == null) {
            return false;
        }
        if (nc9.M0(anoleComponentAppearModel)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(" hide failed because isReachedMaxHideCount");
            C242549fW.LIZ(X1D.LIZIZ(LIZ));
            return false;
        }
        return true;
    }

    public static final void LJJIJIIJI(Assembler assembler, ReusedUISlotAssem reusedUISlotAssem, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(reusedUISlotAssem, "<this>");
        o.LJIIIZ(assembler, "<this>");
        C49358JYs c49358JYs = new C49358JYs();
        interfaceC88472Yns.invoke(c49358JYs);
        InterfaceC49037JMj interfaceC49037JMj = c49358JYs.LIZ;
        if (interfaceC49037JMj != null) {
            assembler.rv0(reusedUISlotAssem, new AqS139S0200000_8(interfaceC49037JMj, c49358JYs, 10));
            InterfaceC87283bg config = interfaceC49037JMj.getConfig();
            if (config != null) {
                assembler.nv0(reusedUISlotAssem, new AqS170S0100000_4(config, 774));
                return;
            }
            return;
        }
        o.LJIJI("type");
        throw null;
    }

    public static final void LJJIJIIJIL(Assembler assembler, ReusedUISlotAssem reusedUISlotAssem, InterfaceC88472Yns init) {
        o.LJIIIZ(reusedUISlotAssem, "<this>");
        o.LJIIIZ(assembler, "<this>");
        o.LJIIIZ(init, "init");
        JMW jmw = new JMW();
        init.invoke(jmw);
        JMX jmx = jmw.LIZ;
        if (jmx != null) {
            assembler.sv0(reusedUISlotAssem, new AqS139S0200000_8(jmx, jmw, 11));
            InterfaceC87283bg config = jmx.getConfig();
            if (config != null) {
                assembler.nv0(reusedUISlotAssem, new AqS170S0100000_4(config, 775));
                return;
            }
            return;
        }
        o.LJIJI("type");
        throw null;
    }

    public static final void LJJIJIL(NC7 nc7, String str, AnoleComponentAppearModel anoleComponentAppearModel) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("type:");
        LIZ.append(str);
        LIZ.append(" showComponent before");
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        NC9 nc9 = nc7.LJI.get(str);
        if (nc9 != null) {
            C242549fW.LIZ("appear check success");
            nc9.N0(anoleComponentAppearModel);
        }
    }

    public static final boolean LJIJJ(NC7 nc7, String str, AnoleComponentAppearModel anoleComponentAppearModel, AnoleComponentRelationModel anoleComponentRelationModel) {
        NC9 nc9 = nc7.LJI.get(str);
        if (nc9 == null) {
            return false;
        }
        if (nc9.P0(anoleComponentAppearModel)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(" show failed because isReachedMaxShowCount");
            C242549fW.LIZ(X1D.LIZIZ(LIZ));
            return false;
        }
        if (!nc7.LIZLLL.LJIIL(nc9.J0().getSlotID(), nc9)) {
            nc9.O0(EnumC35488DwK.BUSINESS_BLOCK);
            return false;
        }
        List<String> dependencies = anoleComponentRelationModel.getDependencies();
        if (dependencies != null) {
            List LLIIIJ = ORZ.LLIIIJ(str, dependencies);
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) LLIIIJ).iterator();
            while (it.hasNext()) {
                NC9 nc92 = nc7.LJI.get(it.next());
                if (nc92 != null) {
                    arrayList.add(nc92);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (!((NC9) it2.next()).isReady().LIZ) {
                        nc9.O0(EnumC35488DwK.DEPENDENCIES_NOT_READY);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final void LJJIFFI(NC7 nc7, String str, QZV qzv, AnoleComponentRelationModel anoleComponentRelationModel) {
        List<AnoleComponentAppearModel> hideModels = anoleComponentRelationModel.getHideModels();
        if (hideModels != null) {
            for (AnoleComponentAppearModel anoleComponentAppearModel : hideModels) {
                if (!qzv.LJIJ(anoleComponentAppearModel)) {
                    StringBuilder LIZIZ = C25620zW.LIZIZ("type:", str, " shouldAppearComponent not hide type = ");
                    LIZIZ.append(anoleComponentAppearModel.getType());
                    C242549fW.LIZ(X1D.LIZIZ(LIZIZ));
                } else if (!LJIJI(nc7, str, anoleComponentAppearModel)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("type:");
                    LIZ.append(str);
                    LIZ.append(" checkHideComponentPreconditions = false");
                    C242549fW.LIZ(X1D.LIZIZ(LIZ));
                } else {
                    NC9 nc9 = nc7.LJI.get(str);
                    if (nc9 != null) {
                        nc9.L0(anoleComponentAppearModel);
                    }
                }
            }
        }
    }

    public static final void LJJII(NC7 nc7, String str, QZV qzv, AnoleComponentRelationModel anoleComponentRelationModel) {
        List<AnoleComponentAppearModel> showModels = anoleComponentRelationModel.getShowModels();
        if (showModels != null) {
            for (AnoleComponentAppearModel anoleComponentAppearModel : showModels) {
                if (!qzv.LJIJ(anoleComponentAppearModel)) {
                    StringBuilder LIZIZ = C25620zW.LIZIZ("type:", str, " shouldAppearComponent not show type = ");
                    LIZIZ.append(anoleComponentAppearModel.getType());
                    C242549fW.LIZ(X1D.LIZIZ(LIZIZ));
                } else if (!LJIJJ(nc7, str, anoleComponentAppearModel, anoleComponentRelationModel)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("type:");
                    LIZ.append(str);
                    LIZ.append(" checkShowComponentPreconditions = false");
                    C242549fW.LIZ(X1D.LIZIZ(LIZ));
                } else {
                    LJJIJIL(nc7, str, anoleComponentAppearModel);
                }
            }
        }
    }
}
