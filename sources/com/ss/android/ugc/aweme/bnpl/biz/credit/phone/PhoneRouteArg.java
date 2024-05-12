package com.ss.android.ugc.aweme.bnpl.biz.credit.phone;

import X.C91803a0V;
import X.F9E;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.bnpl.network.model.PhoneRule;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PhoneRouteArg extends F9E implements IRouteArg {
    public final ArrayList<PhoneRule> checkRules;
    public final String countryCode;
    public final String previousPageId;
    public static final Parcelable.Creator<PhoneRouteArg> CREATOR = new C91803a0V();
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PhoneRouteArg(String countryCode, String previousPageId) {
        this(countryCode, null, previousPageId, 2, 0 == true ? 1 : 0);
        o.LJIIIZ(countryCode, "countryCode");
        o.LJIIIZ(previousPageId, "previousPageId");
    }

    public static PhoneRouteArg __fromBundle(Bundle bundle) {
        int i;
        String str;
        ArrayList arrayList;
        String str2 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("phone_country_code")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("phone_country_code"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("phone_check_rules")) {
            arrayList = (ArrayList) RouteParser.INSTANCE.parse(bundle.get("phone_check_rules"), ArrayList.class);
        } else {
            i += 2;
            arrayList = null;
        }
        if (bundle.containsKey("previous_page_id")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("previous_page_id"), String.class);
        } else {
            i += 4;
        }
        return new PhoneRouteArg(str, arrayList, str2, i, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhoneRouteArg copy$default(PhoneRouteArg phoneRouteArg, String str, ArrayList arrayList, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phoneRouteArg.countryCode;
        }
        if ((i & 2) != 0) {
            arrayList = phoneRouteArg.checkRules;
        }
        if ((i & 4) != 0) {
            str2 = phoneRouteArg.previousPageId;
        }
        return phoneRouteArg.copy(str, arrayList, str2);
    }

    public final PhoneRouteArg copy(String countryCode, ArrayList<PhoneRule> checkRules, String previousPageId) {
        o.LJIIIZ(countryCode, "countryCode");
        o.LJIIIZ(checkRules, "checkRules");
        o.LJIIIZ(previousPageId, "previousPageId");
        return new PhoneRouteArg(countryCode, checkRules, previousPageId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.countryCode, this.checkRules, this.previousPageId};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.countryCode);
        ArrayList<PhoneRule> arrayList = this.checkRules;
        out.writeInt(arrayList.size());
        Iterator<PhoneRule> it = arrayList.iterator();
        while (it.hasNext()) {
            out.writeParcelable(it.next(), i);
        }
        out.writeString(this.previousPageId);
    }

    public final ArrayList<PhoneRule> getCheckRules() {
        return this.checkRules;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getPreviousPageId() {
        return this.previousPageId;
    }

    public PhoneRouteArg(String countryCode, ArrayList<PhoneRule> checkRules, String previousPageId) {
        o.LJIIIZ(countryCode, "countryCode");
        o.LJIIIZ(checkRules, "checkRules");
        o.LJIIIZ(previousPageId, "previousPageId");
        this.countryCode = countryCode;
        this.checkRules = checkRules;
        this.previousPageId = previousPageId;
    }

    public /* synthetic */ PhoneRouteArg(String str, ArrayList arrayList, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new ArrayList() : arrayList, str2);
    }
}
