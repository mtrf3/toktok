package com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model;

import X.C91810a0c;
import X.EnumC92072a4q;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PinSetRouteArg implements IRouteArg {
    public final List<PinRule> pinRuleList;
    public final EnumC92072a4q pinSetMode;
    public final String previousPageId;
    public static final Parcelable.Creator<PinSetRouteArg> CREATOR = new C91810a0c();
    public static final int $stable = 8;

    public static PinSetRouteArg __fromBundle(Bundle bundle) {
        int i;
        EnumC92072a4q enumC92072a4q;
        List list;
        String str = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("KEY_SET_MODE")) {
            enumC92072a4q = (EnumC92072a4q) RouteParser.INSTANCE.parse(bundle.get("KEY_SET_MODE"), EnumC92072a4q.class);
            i = 0;
        } else {
            i = 1;
            enumC92072a4q = null;
        }
        if (bundle.containsKey("KEY_PIN_RULE_LIST")) {
            list = (List) RouteParser.INSTANCE.parse(bundle.get("KEY_PIN_RULE_LIST"), List.class);
        } else {
            i += 2;
            list = null;
        }
        if (bundle.containsKey("previous_page_id")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("previous_page_id"), String.class);
        } else {
            i += 4;
        }
        return new PinSetRouteArg(enumC92072a4q, list, str, i, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.pinSetMode.name());
        List<PinRule> list = this.pinRuleList;
        out.writeInt(list.size());
        Iterator<PinRule> it = list.iterator();
        while (it.hasNext()) {
            out.writeSerializable(it.next());
        }
        out.writeString(this.previousPageId);
    }

    public final List<PinRule> getPinRuleList() {
        return this.pinRuleList;
    }

    public final EnumC92072a4q getPinSetMode() {
        return this.pinSetMode;
    }

    public final String getPreviousPageId() {
        return this.previousPageId;
    }

    public PinSetRouteArg(EnumC92072a4q pinSetMode, List<PinRule> pinRuleList, String previousPageId) {
        o.LJIIIZ(pinSetMode, "pinSetMode");
        o.LJIIIZ(pinRuleList, "pinRuleList");
        o.LJIIIZ(previousPageId, "previousPageId");
        this.pinSetMode = pinSetMode;
        this.pinRuleList = pinRuleList;
        this.previousPageId = previousPageId;
    }

    public /* synthetic */ PinSetRouteArg(EnumC92072a4q enumC92072a4q, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC92072a4q, (i & 2) != 0 ? new ArrayList() : list, str);
    }
}
