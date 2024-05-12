package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MallRacunTabInfo {

    @InterfaceC65349Pkn("fallback_scene")
    public final String fallbackScene;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final String scene;

    @InterfaceC65349Pkn("tab_name")
    public final String tabName;

    @InterfaceC65349Pkn("tab_type")
    public final Integer tabType;

    public static /* synthetic */ MallRacunTabInfo copy$default(MallRacunTabInfo mallRacunTabInfo, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mallRacunTabInfo.tabName;
        }
        if ((i & 2) != 0) {
            str2 = mallRacunTabInfo.scene;
        }
        if ((i & 4) != 0) {
            str3 = mallRacunTabInfo.fallbackScene;
        }
        if ((i & 8) != 0) {
            num = mallRacunTabInfo.tabType;
        }
        return mallRacunTabInfo.copy(str, str2, str3, num);
    }

    public final MallRacunTabInfo copy(String str, String str2, String str3, Integer num) {
        return new MallRacunTabInfo(str, str2, str3, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallRacunTabInfo)) {
            return false;
        }
        MallRacunTabInfo mallRacunTabInfo = (MallRacunTabInfo) obj;
        return o.LJ(this.tabName, mallRacunTabInfo.tabName) && o.LJ(this.scene, mallRacunTabInfo.scene) && o.LJ(this.fallbackScene, mallRacunTabInfo.fallbackScene) && o.LJ(this.tabType, mallRacunTabInfo.tabType);
    }

    public int hashCode() {
        String str = this.tabName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.scene;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fallbackScene;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.tabType;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MallRacunTabInfo(tabName=");
        LIZ.append(this.tabName);
        LIZ.append(", scene=");
        LIZ.append(this.scene);
        LIZ.append(", fallbackScene=");
        LIZ.append(this.fallbackScene);
        LIZ.append(", tabType=");
        return s0.LIZJ(LIZ, this.tabType, ')', LIZ);
    }

    public final String getFallbackScene() {
        return this.fallbackScene;
    }

    public final String getScene() {
        return this.scene;
    }

    public final String getTabName() {
        return this.tabName;
    }

    public final Integer getTabType() {
        return this.tabType;
    }

    public MallRacunTabInfo(String str, String str2, String str3, Integer num) {
        this.tabName = str;
        this.scene = str2;
        this.fallbackScene = str3;
        this.tabType = num;
    }
}
