package com.kakao.sdk.common.json;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.TypeAdapter;
import java.util.Date;

/* loaded from: classes12.dex */
public final class KakaoIntDateTypeAdapter extends TypeAdapter<Date> {
    @Override // com.google.gson.TypeAdapter
    public Date read(C65385PlN c65385PlN) {
        EnumC65386PlO LJJIJIL;
        EnumC65386PlO LJJIJIL2;
        if (c65385PlN == null) {
            LJJIJIL = null;
        } else {
            LJJIJIL = c65385PlN.LJJIJIL();
        }
        if (LJJIJIL == EnumC65386PlO.NULL) {
            c65385PlN.LJJIIJ();
            return null;
        }
        if (c65385PlN == null) {
            LJJIJIL2 = null;
        } else {
            LJJIJIL2 = c65385PlN.LJJIJIL();
        }
        if (LJJIJIL2 != EnumC65386PlO.NUMBER) {
            return null;
        }
        return new Date(c65385PlN.LJIJJ() * 1000);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(C65403Plf c65403Plf, Date date) {
        if (date == null) {
            if (c65403Plf == null) {
                return;
            }
            c65403Plf.LJIIJJI();
        } else {
            if (c65403Plf == null) {
                return;
            }
            c65403Plf.LJIJ(date.getTime() / 1000);
        }
    }
}
