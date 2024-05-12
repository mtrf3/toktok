package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.AutoBitrateSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.IcB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46979IcB implements InterfaceC46926IbK {
    public final InterfaceC46926IbK LIZ;
    public final IY3 LIZIZ;
    public final InterfaceC46993IcP LIZJ;
    public final C47261Igj LIZLLL;
    public final J7I LJ = new J7I();
    public IY3 LJFF;

    @Override // X.InterfaceC46926IbK
    public final void LIZ(IY3 iy3) {
    }

    public C46979IcB(InterfaceC46926IbK interfaceC46926IbK, AutoBitrateSet autoBitrateSet) {
        InterfaceC46984IcG interfaceC46984IcG;
        this.LIZ = interfaceC46926IbK;
        this.LIZIZ = autoBitrateSet;
        if (C1DG.LIZ().getConfig().getDimensionPickConfig().getVersion() != 2) {
            interfaceC46984IcG = (InterfaceC46984IcG) ESN.LIZ("com.ss.android.ugc.aweme.playerkit.configpickerimpl.ConfigPickerService");
        } else {
            interfaceC46984IcG = (InterfaceC46984IcG) ESN.LIZ("com.ss.android.ugc.aweme.playerkit.configpickerimplv2.ConfigPickerService");
        }
        this.LIZJ = interfaceC46984IcG.LIZ();
        this.LIZLLL = new C47261Igj();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7, types: [X.IY3] */
    /* JADX WARN: Type inference failed for: r6v8, types: [X.IY3] */
    @Override // X.InterfaceC46926IbK
    public final IYO LIZIZ(List<? extends IYN> list, java.util.Map<String, Object> map) {
        AutoBitrateSet autoBitrateSet;
        if (map.containsKey("KEY_DISABLE_DYNAMIC")) {
            if (!map.containsKey("internet_speed")) {
                map.put("internet_speed", Integer.valueOf((int) C1DG.LIZ().LJI().LJI()));
            }
            this.LIZ.LIZ(this.LIZIZ);
            return this.LIZ.LIZIZ(list, map);
        }
        System.currentTimeMillis();
        String str = (String) map.get("source_id");
        Object obj = map.get("KEY_AUTO_BITRATE_SET");
        IYO iyo = null;
        if (obj instanceof IY3) {
            autoBitrateSet = (IY3) obj;
        } else {
            IDimensionBitrateCurveConfig dimensionBitrateCurveConfig = C1DG.LIZ().getConfig().getDimensionBitrateCurveConfig();
            if (dimensionBitrateCurveConfig != null && dimensionBitrateCurveConfig.enable()) {
                VHN config = dimensionBitrateCurveConfig.config();
                config.LJFF = str;
                C46664ITc c46664ITc = C46664ITc.LJIJ;
                config.LJIIIIZZ = c46664ITc.LJIIIZ(str);
                AutoBitrateSet autoBitrateSet2 = (AutoBitrateSet) this.LIZJ.LIZ(config, AutoBitrateSet.class);
                IWO.LIZ().LIZJ();
                if (autoBitrateSet2 == null) {
                    c46664ITc.LJIJI(str, null);
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("");
                    LIZ.append(autoBitrateSet2.firstParam);
                    LIZ.append(autoBitrateSet2.secondParam);
                    LIZ.append(autoBitrateSet2.thirdParam);
                    LIZ.append(autoBitrateSet2.fourthParam);
                    LIZ.append(autoBitrateSet2.minBitrate);
                    c46664ITc.LJIJI(str, X1D.LIZIZ(LIZ));
                    autoBitrateSet = autoBitrateSet2;
                }
            }
            autoBitrateSet = null;
        }
        System.currentTimeMillis();
        AutoBitrateSet autoBitrateSet3 = autoBitrateSet;
        if (autoBitrateSet == null) {
            autoBitrateSet3 = this.LIZIZ;
        }
        this.LJFF = autoBitrateSet3;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = true;
        if (C47149Iev.LIZ.LJIIL == 1) {
            z = C47147Iet.LIZ.LJII();
        }
        if (IZ8.LJJII() && z) {
            map.put("bitrate_curve", this.LJFF);
            this.LIZLLL.getClass();
            try {
                C47156If2 LJIIJJI = C47261Igj.LJIIJJI(map);
                if (LJIIJJI != null) {
                    java.util.Map LJIIJ = C47261Igj.LJIIJ(map);
                    C47606ImI.LJIIJ(((Integer) map.get("select_type")).intValue(), LJIIJJI, LJIIJ);
                    iyo = C47261Igj.LJJIL(list, LJIIJ);
                }
            } catch (Exception unused) {
            }
        } else {
            this.LIZ.LIZ(this.LJFF);
            iyo = this.LIZ.LIZIZ(list, map);
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        boolean LJJII = IZ8.LJJII();
        Object value = IZ8.LJJIJ.getValue();
        o.LJIIIIZZ(value, "<get-enableNativeSelectDiffReport>(...)");
        boolean booleanValue = ((Boolean) value).booleanValue();
        Object value2 = IZ8.LJJIJIIJI.getValue();
        o.LJIIIIZZ(value2, "<get-enableNativeSelectFallback>(...)");
        boolean booleanValue2 = ((Boolean) value2).booleanValue();
        IYQ LIZ2 = IYQ.LIZ(iyo);
        if (LIZ2 != null) {
            LIZ2.LJLJLLL = currentTimeMillis2 - currentTimeMillis;
            if (LJJII && booleanValue) {
                this.LIZ.LIZ(this.LJFF);
                if (!map.containsKey("internet_speed")) {
                    map.put("internet_speed", Integer.valueOf((int) C1DG.LIZ().LJI().LJI()));
                }
                IYO LIZIZ = this.LIZ.LIZIZ(list, map);
                this.LJ.getClass();
                String LJ = J7I.LJ(list, map, LIZIZ, iyo);
                LIZ2.LJLL = LJ;
                if (!TextUtils.isEmpty(LJ) && !TextUtils.equals(LIZ2.LJLL, "same")) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(LIZ2.LJLL);
                    LIZ3.append("&change_reason=");
                    LIZ3.append(LIZ2.LJLJL);
                    LIZ2.LJLL = X1D.LIZIZ(LIZ3);
                }
            }
        } else if (LJJII && (booleanValue || booleanValue2)) {
            this.LIZ.LIZ(this.LJFF);
            if (!map.containsKey("internet_speed")) {
                map.put("internet_speed", Integer.valueOf((int) C1DG.LIZ().LJI().LJI()));
            }
            IYO LIZIZ2 = this.LIZ.LIZIZ(list, map);
            LIZ2 = IYQ.LIZ(LIZIZ2);
            if (LIZ2 != null) {
                LIZ2.LJLJLLL = currentTimeMillis2 - currentTimeMillis;
                if (booleanValue) {
                    this.LJ.getClass();
                    String LJ2 = J7I.LJ(list, map, LIZIZ2, iyo);
                    LIZ2.LJLL = LJ2;
                    if (!TextUtils.isEmpty(LJ2) && !TextUtils.equals(LIZ2.LJLL, "same")) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append(LIZ2.LJLL);
                        LIZ4.append("&change_reason=");
                        LIZ4.append(LIZ2.LJLJL);
                        LIZ2.LJLL = X1D.LIZIZ(LIZ4);
                    }
                }
            }
        }
        return LIZ2;
    }
}
