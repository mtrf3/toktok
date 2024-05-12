package com.ss.android.ugc.aweme.brdatagift.settingandexp;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BemobiGifrSettingsParams extends F9E {

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("mccmnc_list")
    public final ArrayList<String> mccMncList;

    /* JADX WARN: Multi-variable type inference failed */
    public BemobiGifrSettingsParams() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BemobiGifrSettingsParams copy$default(BemobiGifrSettingsParams bemobiGifrSettingsParams, boolean z, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bemobiGifrSettingsParams.enable;
        }
        if ((i & 2) != 0) {
            arrayList = bemobiGifrSettingsParams.mccMncList;
        }
        return bemobiGifrSettingsParams.copy(z, arrayList);
    }

    public final BemobiGifrSettingsParams copy(boolean z, ArrayList<String> mccMncList) {
        o.LJIIIZ(mccMncList, "mccMncList");
        return new BemobiGifrSettingsParams(z, mccMncList);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), this.mccMncList};
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final ArrayList<String> getMccMncList() {
        return this.mccMncList;
    }

    public BemobiGifrSettingsParams(boolean z, ArrayList<String> mccMncList) {
        o.LJIIIZ(mccMncList, "mccMncList");
        this.enable = z;
        this.mccMncList = mccMncList;
    }

    public /* synthetic */ BemobiGifrSettingsParams(boolean z, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new ArrayList() : arrayList);
    }
}
