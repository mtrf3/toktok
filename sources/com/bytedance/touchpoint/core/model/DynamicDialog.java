package com.bytedance.touchpoint.core.model;

import X.C78966Uyw;
import X.C95U;
import X.HH1;
import X.InterfaceC65349Pkn;
import com.bytedance.touchpoint.core.invitecode.InviteCodeResponse;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class DynamicDialog extends C95U {

    @InterfaceC65349Pkn("buttons")
    public final List<InviteCodeResponse.Button> buttons;

    @InterfaceC65349Pkn("extra")
    public Map<String, String> extra;

    @InterfaceC65349Pkn("js_source")
    public String jsSource;

    @InterfaceC65349Pkn("popup_type")
    public String name;

    @InterfaceC65349Pkn("notification_name")
    public String notificationName;

    @InterfaceC65349Pkn("popup_name")
    public String popName;

    @InterfaceC65349Pkn("round")
    public String round;

    @InterfaceC65349Pkn("show_after")
    public Integer showAfter;

    public final Object[] LIZIZ() {
        return new Object[]{this.name, this.popName, this.notificationName, this.round, this.showAfter, this.buttons, this.extra, this.jsSource};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DynamicDialog) {
            return C78966Uyw.LJIIIZ(((DynamicDialog) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("DynamicDialog:%s,%s,%s,%s,%s,%s,%s,%s", LIZIZ());
    }

    public DynamicDialog(String str, String str2, String str3, String str4, Integer num, List<InviteCodeResponse.Button> list, Map<String, String> map, String str5) {
        HH1.LIZ(str, "name", str4, "round", str5, "jsSource");
        this.name = str;
        this.popName = str2;
        this.notificationName = str3;
        this.round = str4;
        this.showAfter = num;
        this.buttons = list;
        this.extra = map;
        this.jsSource = str5;
    }

    public /* synthetic */ DynamicDialog(String str, String str2, String str3, String str4, Integer num, List list, Map map, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", str4, num, list, map, str5);
    }
}
