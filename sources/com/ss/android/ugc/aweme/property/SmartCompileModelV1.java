package com.ss.android.ugc.aweme.property;

import X.C43588H8u;
import X.InterfaceC65349Pkn;
import X.WM7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class SmartCompileModelV1 extends SmartCompileBaseModel {

    @InterfaceC65349Pkn("hw_compile_setting")
    public final String hwCompileSetting;

    @InterfaceC65349Pkn("sw_compile_setting")
    public final String swCompileSetting;

    public final String getHwCompileSetting() {
        return this.hwCompileSetting;
    }

    public final String getSwCompileSetting() {
        return this.swCompileSetting;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartCompileModelV1(String str, int i, String str2, String str3, String str4) {
        super(str, i, str2);
        C43588H8u.LIZLLL(str, WM7.SCENE_SERVICE, str2, "packageUrl", str3, "swCompileSetting", str4, "hwCompileSetting");
        this.swCompileSetting = str3;
        this.hwCompileSetting = str4;
    }

    public /* synthetic */ SmartCompileModelV1(String str, int i, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) == 0 ? str2 : "", str3, str4);
    }
}
