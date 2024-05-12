package X;

import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.AutoBitrateSet;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.GearConfig;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ibj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46951Ibj {
    public static final /* synthetic */ int LIZ = 0;

    public static SimBitRate LIZ(List list, RateSettingsResponse rateSettingsResponse) {
        double d;
        C46966Iby c46966Iby;
        C46968Ic0 c46968Ic0;
        C46950Ibi c46950Ibi;
        C46962Ibu c46962Ibu;
        InterfaceC46926IbK interfaceC46926IbK;
        IYR iyr;
        IYP iyp;
        C46893Ian c46893Ian;
        C46977Ic9 c46977Ic9;
        IYM iym;
        C46950Ibi c46950Ibi2;
        C46962Ibu c46962Ibu2;
        int LIZ2 = C00F.LIZ(31744, -1, "music_bitrate_speed_local", true);
        Object obj = null;
        if (LIZ2 == -1) {
            C47497IkX LJ = C47497IkX.LJ();
            if (LJ == null) {
                return null;
            }
            LIZ2 = (int) LJ.getSpeed();
        }
        if (rateSettingsResponse == null) {
            return null;
        }
        InterfaceC46974Ic6 build = ((InterfaceC46970Ic2) ESN.LIZ("com.ss.android.ugc.aweme.bitrateselector.impl.DTBitrateSelectorServiceImpl")).build();
        GearConfig adaptiveGearGroup = rateSettingsResponse.getAdaptiveGearGroup();
        AutoBitrateSet autoBitrateSetMusic = rateSettingsResponse.getAutoBitrateSetMusic();
        if (autoBitrateSetMusic != null) {
            d = autoBitrateSetMusic.minBitrate;
        } else {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        Pair pair = new Pair(Double.valueOf(d), rateSettingsResponse.getAdaptiveGearGroup().LIZLLL().second);
        if (adaptiveGearGroup == null) {
            c46966Iby = null;
        } else {
            c46966Iby = new C46966Iby(adaptiveGearGroup, pair);
        }
        C46961Ibt c46961Ibt = new C46961Ibt(c46966Iby);
        c46961Ibt.LIZJ = EnumC46965Ibx.SHIFT;
        AutoBitrateSet autoBitrateSetMusic2 = rateSettingsResponse.getAutoBitrateSetMusic();
        if (autoBitrateSetMusic2 == null) {
            c46968Ic0 = null;
        } else {
            c46968Ic0 = new C46968Ic0(autoBitrateSetMusic2);
        }
        c46961Ibt.LIZIZ = c46968Ic0;
        C46960Ibs c46960Ibs = new C46960Ibs(c46961Ibt);
        C46971Ic3 c46971Ic3 = (C46971Ic3) build;
        c46971Ic3.getClass();
        int i = C46964Ibw.LIZ[c46960Ibs.LIZJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                InterfaceC46976Ic8 interfaceC46976Ic8 = c46960Ibs.LIZ;
                if (interfaceC46976Ic8 == null) {
                    c46950Ibi2 = null;
                } else {
                    c46950Ibi2 = new C46950Ibi(interfaceC46976Ic8);
                }
                C46955Ibn c46955Ibn = new C46955Ibn(c46950Ibi2);
                c46955Ibn.LIZIZ = null;
                c46955Ibn.LIZJ = null;
                InterfaceC46975Ic7 interfaceC46975Ic7 = c46960Ibs.LIZIZ;
                if (interfaceC46975Ic7 == null) {
                    c46962Ibu2 = null;
                } else {
                    c46962Ibu2 = new C46962Ibu(interfaceC46975Ic7);
                }
                c46955Ibn.LIZLLL = c46962Ibu2;
                interfaceC46926IbK = c46955Ibn.LIZ();
            } else {
                interfaceC46926IbK = new C46925IbJ();
            }
        } else {
            InterfaceC46976Ic8 interfaceC46976Ic82 = c46960Ibs.LIZ;
            if (interfaceC46976Ic82 == null) {
                c46950Ibi = null;
            } else {
                c46950Ibi = new C46950Ibi(interfaceC46976Ic82);
            }
            C46963Ibv c46963Ibv = new C46963Ibv(c46950Ibi);
            c46963Ibv.LIZIZ = null;
            c46963Ibv.LIZJ = null;
            InterfaceC46975Ic7 interfaceC46975Ic72 = c46960Ibs.LIZIZ;
            if (interfaceC46975Ic72 == null) {
                c46962Ibu = null;
            } else {
                c46962Ibu = new C46962Ibu(interfaceC46975Ic72);
            }
            c46963Ibv.LIZLLL = c46962Ibu;
            C46927IbL c46927IbL = new C46927IbL(c46950Ibi);
            C46953Ibl c46953Ibl = new C46953Ibl(c46950Ibi);
            c46953Ibl.LIZIZ = null;
            c46953Ibl.LIZJ = null;
            c46953Ibl.LIZLLL = c46962Ibu;
            InterfaceC46926IbK LIZ3 = c46953Ibl.LIZ();
            AbstractC46948Ibg abstractC46948Ibg = (AbstractC46948Ibg) LIZ3;
            abstractC46948Ibg.LIZIZ = c46963Ibv.LIZIZ;
            abstractC46948Ibg.LIZJ = c46963Ibv.LIZJ;
            abstractC46948Ibg.LIZLLL = c46963Ibv.LIZLLL;
            c46927IbL.LJ = LIZ3;
            interfaceC46926IbK = c46927IbL;
        }
        c46971Ic3.LIZ = interfaceC46926IbK;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SimBitRate simBitRate = (SimBitRate) it.next();
            if (simBitRate == null) {
                iym = null;
            } else {
                iym = new IYM(simBitRate);
            }
            arrayList.add(iym);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            o.LJIIIIZZ(((InterfaceC46978IcA) next).urlList(), "it.urlList()");
            if (!r1.isEmpty()) {
                arrayList2.add(next);
            }
        }
        C46967Ibz c46967Ibz = new C46967Ibz();
        c46967Ibz.LIZ.put("internet_speed", Integer.valueOf(LIZ2));
        java.util.Map<String, Object> map = c46967Ibz.LIZ;
        InterfaceC46926IbK interfaceC46926IbK2 = (InterfaceC46926IbK) c46971Ic3.LIZ;
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            InterfaceC46978IcA interfaceC46978IcA = (InterfaceC46978IcA) it3.next();
            if (interfaceC46978IcA == null) {
                c46977Ic9 = null;
            } else {
                c46977Ic9 = new C46977Ic9(interfaceC46978IcA);
            }
            arrayList3.add(c46977Ic9);
        }
        IYO LIZIZ = interfaceC46926IbK2.LIZIZ(arrayList3, map);
        if (LIZIZ == null) {
            iyr = null;
        } else {
            iyr = new IYR();
            IYN iyn = LIZIZ.LJLIL;
            if (iyn == null) {
                iyp = null;
            } else {
                iyp = new IYP(iyn);
            }
            iyr.LIZ = iyp;
            iyr.LIZJ = LIZIZ.LJLJI;
            C46892Iam c46892Iam = LIZIZ.LJLILLLLZI;
            if (c46892Iam == null) {
                c46893Ian = null;
            } else {
                c46893Ian = new C46893Ian(c46892Iam.getCode(), c46892Iam.getMessage());
            }
            iyr.LIZIZ = c46893Ian;
        }
        if (iyr.LIZIZ != null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("video_quality", Integer.valueOf(iyr.getQualityType()));
        jSONObject.put("calc_bitrate", Double.valueOf(iyr.LIZJ));
        jSONObject.put("bitrate_set", list);
        jSONObject.put("internet_speed", LIZ2);
        jSONObject.put("enter_from", "single_song");
        FMX.LJIILJJIL("video_play_quality", jSONObject);
        Iterator it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next2 = it4.next();
            SimBitRate simBitRate2 = (SimBitRate) next2;
            if (simBitRate2.getBitRate() == iyr.getBitRate() && o.LJ(simBitRate2.getGearName(), iyr.getGearName())) {
                obj = next2;
                break;
            }
        }
        return (SimBitRate) obj;
    }
}
