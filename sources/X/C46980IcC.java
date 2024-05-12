package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig;
import com.ss.android.ugc.aweme.simkit.impl.bitrateselector.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IcC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46980IcC {
    public final InterfaceC46992IcO LIZ;

    public C46980IcC() {
        InterfaceC46984IcG interfaceC46984IcG;
        if (C1DG.LIZ().getConfig().getDimensionPickConfig().getVersion() != 2) {
            interfaceC46984IcG = (InterfaceC46984IcG) ESN.LIZ("com.ss.android.ugc.aweme.playerkit.configpickerimpl.ConfigPickerService");
        } else {
            interfaceC46984IcG = (InterfaceC46984IcG) ESN.LIZ("com.ss.android.ugc.aweme.playerkit.configpickerimplv2.ConfigPickerService");
        }
        this.LIZ = interfaceC46984IcG.LIZIZ();
    }

    public final List LIZ(String str, List list) {
        System.currentTimeMillis();
        if (list == null || list.size() == 0) {
            C46664ITc c46664ITc = C46664ITc.LJIJ;
            synchronized (c46664ITc) {
                if (!TextUtils.isEmpty(str)) {
                    c46664ITc.LJIIJ.put(str, new C46665ITd(list, list));
                }
            }
        } else {
            IDimensionBitrateFilterConfig dimensionBitrateFilterConfig = C1DG.LIZ().getConfig().getDimensionBitrateFilterConfig();
            if (dimensionBitrateFilterConfig == null || !dimensionBitrateFilterConfig.enable()) {
                C46664ITc.LJIJ.LJIILL(str, list, list);
            } else {
                VHN config = dimensionBitrateFilterConfig.config();
                config.LJFF = str;
                config.LJIIIIZZ = C46664ITc.LJIJ.LJIIIZ(str);
                List LIZ = this.LIZ.LIZ(config, new C47061IdV().getType());
                if (list.size() == 0) {
                    list = new ArrayList();
                } else if (LIZ != null && LIZ.size() != 0) {
                    List arrayList = new ArrayList(list);
                    Iterator it = LIZ.iterator();
                    loop0: while (true) {
                        list = arrayList;
                        while (it.hasNext()) {
                            arrayList = ((Filter) it.next()).filter(list);
                            if (!arrayList.isEmpty()) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.currentTimeMillis();
        return list;
    }
}
