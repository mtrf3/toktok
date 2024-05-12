package com.ss.android.ugc.aweme.request_combine.request.p0;

import X.AbstractC73672Svk;
import X.AnonymousClass030;
import X.C06540Nm;
import X.C33850DQg;
import X.C35641Dyn;
import X.C35642Dyo;
import X.C35643Dyp;
import X.C36165EHh;
import X.C46104I7o;
import X.C57964Moy;
import X.C73422Sri;
import X.C73457SsH;
import X.C73565Su1;
import X.C73805Sxt;
import X.C73969T1h;
import X.C78847Ux1;
import X.EFM;
import X.EFN;
import X.EI4;
import X.EI5;
import X.EIC;
import X.EID;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.EnumC36166EHi;
import X.InterfaceC64592gB;
import X.InterfaceC789838c;
import X.T16;
import Y.IDhS65S0200000_1;
import Y.IDxS307S0100000_6;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.request_combine.api.SettingCombineApi;
import com.ss.android.ugc.aweme.request_combine.request.SettingRequestExtraInfoImpl;
import com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FetchCombineSettingRequest implements EFM {
    @Override // X.EEY
    public final String key() {
        return "FetchCombineSettingRequest";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "request_";
    }

    @Override // X.EEY
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return AnonymousClass030.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return AnonymousClass030.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EFM
    public final EFN type() {
        return EFN.P0;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        Integer num;
        C73422Sri LJIJJLI;
        ISettingRequestExtraInfo LIZJ = SettingRequestExtraInfoImpl.LIZJ();
        if (LIZJ != null) {
            LIZJ.LIZ(new EID());
        }
        C36165EHh.LIZ(EnumC36166EHi.FETCH_COMBINE_SETTINGS_REQUEST);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String str : EI5.LIZLLL.keySet()) {
            int i2 = i + 1;
            if (i != 0) {
                sb.append(",");
            }
            sb.append(str);
            i = i2;
        }
        Keva repoFromSp = KevaImpl.getRepoFromSp(context, "setting_repo_sp", 0);
        Object obj = null;
        if (repoFromSp != null) {
            num = Integer.valueOf(repoFromSp.getInt("key_has_local_cache", 0));
        } else {
            num = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("api_list", sb.toString());
        hashMap.put("has_local_cache", String.valueOf(num));
        Iterator LJ = C06540Nm.LJ(EI5.LIZLLL, "mColdLaunchRequests.values");
        while (LJ.hasNext()) {
            Map<String, String> LIZIZ = ((EI4) LJ.next()).LIZIZ(context);
            if (LIZIZ != null) {
                hashMap.putAll(LIZIZ);
            }
        }
        C36165EHh.LIZ(EnumC36166EHi.SETTINGS_COMBINE_API_CREATE);
        SettingCombineApi.LIZ.getClass();
        InterfaceC789838c create = C46104I7o.LJJII().create(EIC.LIZIZ);
        if (create != null) {
            obj = create.create(SettingCombineApi.class);
        }
        o.LJI(obj);
        C73805Sxt LJJIJL = ((SettingCombineApi) obj).request(hashMap).LJJL(T16.LIZ()).LJJIJL(C78847Ux1.LJLIL);
        if (C33850DQg.LIZ() && ((Boolean) C33850DQg.LJII.getValue()).booleanValue()) {
            C73565Su1 LJJIJIL = AbstractC73672Svk.LJJIJIL(Boolean.TRUE);
            long longValue = ((Number) C33850DQg.LIZLLL.getValue()).longValue();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            LJIJJLI = LJJIJL.LJJIII(new C73457SsH(new IDhS65S0200000_1(LJJIJIL.LJIIL(longValue, timeUnit).LJIJJLI(new InterfaceC64592gB() { // from class: X.9ES
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                }
            }), ((AbstractC73672Svk) C33850DQg.LJFF.getValue()).LJJIFFI(C57964Moy.LJLJLLL).LJIIL(((Number) C33850DQg.LJ.getValue()).longValue(), timeUnit).LJIJJLI(new InterfaceC64592gB() { // from class: X.9ER
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                }
            }), 4)), false).LJIL(C35641Dyn.LJLIL).LJIJJLI(C35642Dyo.LJLIL);
        } else {
            LJIJJLI = LJJIJL.LJIJJLI(C35643Dyp.LJLIL);
        }
        LJIJJLI.LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS307S0100000_6(context, 5));
    }
}
