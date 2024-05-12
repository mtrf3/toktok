package com.ss.android.ugc.aweme.commercialize.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AdLynxEntryData implements Serializable {

    @InterfaceC65349Pkn("entry_type")
    public int entryType;

    @InterfaceC65349Pkn("gecko_channel")
    public List<String> geckoChannel;

    @InterfaceC65349Pkn("lynx_scheme")
    public String lynxScheme;

    /* JADX WARN: Multi-variable type inference failed */
    public AdLynxEntryData() {
        this(0, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdLynxEntryData copy$default(AdLynxEntryData adLynxEntryData, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = adLynxEntryData.entryType;
        }
        if ((i2 & 2) != 0) {
            str = adLynxEntryData.lynxScheme;
        }
        if ((i2 & 4) != 0) {
            list = adLynxEntryData.geckoChannel;
        }
        return adLynxEntryData.copy(i, str, list);
    }

    public final AdLynxEntryData copy(int i, String str, List<String> list) {
        return new AdLynxEntryData(i, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdLynxEntryData)) {
            return false;
        }
        AdLynxEntryData adLynxEntryData = (AdLynxEntryData) obj;
        return this.entryType == adLynxEntryData.entryType && o.LJ(this.lynxScheme, adLynxEntryData.lynxScheme) && o.LJ(this.geckoChannel, adLynxEntryData.geckoChannel);
    }

    public int hashCode() {
        int i = this.entryType * 31;
        String str = this.lynxScheme;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.geckoChannel;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdLynxEntryData(entryType=");
        LIZ.append(this.entryType);
        LIZ.append(", lynxScheme=");
        LIZ.append(this.lynxScheme);
        LIZ.append(", geckoChannel=");
        return C1NE.LIZIZ(LIZ, this.geckoChannel, ')', LIZ);
    }

    public final int getEntryType() {
        return this.entryType;
    }

    public final List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public final String getLynxScheme() {
        return this.lynxScheme;
    }

    public final void setEntryType(int i) {
        this.entryType = i;
    }

    public final void setGeckoChannel(List<String> list) {
        this.geckoChannel = list;
    }

    public final void setLynxScheme(String str) {
        this.lynxScheme = str;
    }

    public AdLynxEntryData(int i, String str, List<String> list) {
        this.entryType = i;
        this.lynxScheme = str;
        this.geckoChannel = list;
    }

    public /* synthetic */ AdLynxEntryData(int i, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : list);
    }
}
