package com.bytedance.pia.core.bridge.methods;

import X.C37394Ely;
import X.C37399Em3;
import X.C37400Em4;
import X.C37403Em7;
import X.C37449Emr;
import X.C37499Enf;
import X.EnumC37404Em8;
import X.InterfaceC37405Em9;
import X.InterfaceC37408EmC;
import X.InterfaceC65349Pkn;
import com.bytedance.pia.core.bridge.methods.SettingGet;
import com.bytedance.pia.core.setting.Config;
import com.bytedance.pia.core.setting.Settings;
import java.util.Map;

/* loaded from: classes7.dex */
public final class SettingGet implements InterfaceC37405Em9<Void, Result> {
    public static final C37403Em7<Void, Result> LIZ = new C37403Em7<>("pia.internal.setting.get", EnumC37404Em8.All, new InterfaceC37408EmC() { // from class: X.Em2
        @Override // X.InterfaceC37408EmC
        public final Object create() {
            return new SettingGet();
        }

        @Override // X.InterfaceC37408EmC
        public final Object LIZ(Object obj) {
            return create();
        }
    });

    /* loaded from: classes7.dex */
    public static class Result {

        @InterfaceC65349Pkn("base")
        public Map<String, Boolean> base;

        @InterfaceC65349Pkn("feature")
        public Map<String, Boolean> feature;

        @InterfaceC65349Pkn("pageSetting")
        public Config pageSetting;

        public Result(Map<String, Boolean> map, Map<String, Boolean> map2, Config config) {
            this.base = map;
            this.feature = map2;
            this.pageSetting = config;
        }
    }

    @Override // X.InterfaceC37405Em9
    public final void LIZ(C37449Emr c37449Emr, Object obj, C37399Em3 c37399Em3, C37400Em4 c37400Em4) {
        try {
            c37399Em3.accept(new Result((Map) Settings.LIZ().LIZ.getValue(), (Map) Settings.LIZ().LIZIZ.getValue(), ((C37499Enf) c37449Emr.LIZIZ).LIZJ));
        } catch (Throwable th) {
            c37400Em4.accept(new C37394Ely(th.toString()));
        }
    }
}
