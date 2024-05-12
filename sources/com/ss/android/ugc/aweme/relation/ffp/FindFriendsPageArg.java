package com.ss.android.ugc.aweme.relation.ffp;

import X.KMR;
import X.KMX;
import X.KMY;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class FindFriendsPageArg implements IRouteArg {
    public final boolean darkMode;
    public final int newMafCount;
    public final boolean newSuggestArea;
    public final KMR pageStyle;
    public final String previousPage;
    public final String recUserSharedKey;
    public final int transitionType;
    public static final KMY Companion = new KMY();
    public static final Parcelable.Creator<FindFriendsPageArg> CREATOR = new KMX();

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FindFriendsPageArg() {
        /*
            r10 = this;
            r1 = 0
            r3 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r0 = r10
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r1
            r7 = r1
            r9 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg.<init>():void");
    }

    public static FindFriendsPageArg __fromBundle(Bundle bundle) {
        Boolean bool;
        Integer num;
        String str;
        KMR kmr;
        String str2;
        Integer num2;
        Boolean bool2 = null;
        if (bundle == null) {
            return null;
        }
        int i = 1;
        if (bundle.containsKey("key_dark_mode")) {
            bool = (Boolean) RouteParser.INSTANCE.parse(bundle.get("key_dark_mode"), Boolean.class);
            if (bool != null) {
                i = 0;
            }
        } else {
            bool = null;
        }
        if (bundle.containsKey("key_transition_type")) {
            num = (Integer) RouteParser.INSTANCE.parse(bundle.get("key_transition_type"), Integer.class);
            if (num == null) {
                i += 2;
            }
        } else {
            i += 2;
            num = null;
        }
        if (bundle.containsKey("key_prev_page")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("key_prev_page"), String.class);
        } else {
            i += 4;
            str = null;
        }
        if (bundle.containsKey("key_page_style")) {
            kmr = (KMR) RouteParser.INSTANCE.parse(bundle.get("key_page_style"), KMR.class);
        } else {
            i += 8;
            kmr = null;
        }
        if (bundle.containsKey("rec_user_source_shared_key")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("rec_user_source_shared_key"), String.class);
        } else {
            i += 16;
            str2 = null;
        }
        if (bundle.containsKey("key_maf_count")) {
            num2 = (Integer) RouteParser.INSTANCE.parse(bundle.get("key_maf_count"), Integer.class);
            if (num2 == null) {
                i += 32;
            }
        } else {
            i += 32;
            num2 = null;
        }
        if (!bundle.containsKey("key_new_suggest_area") || (bool2 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("key_new_suggest_area"), Boolean.class)) == null) {
            i += 64;
        }
        return new FindFriendsPageArg(bool != null ? bool.booleanValue() : false, num != null ? num.intValue() : 0, str, kmr, str2, num2 != null ? num2.intValue() : 0, bool2 != null ? bool2.booleanValue() : false, i, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.darkMode ? 1 : 0);
        out.writeInt(this.transitionType);
        out.writeString(this.previousPage);
        out.writeString(this.pageStyle.name());
        out.writeString(this.recUserSharedKey);
        out.writeInt(this.newMafCount);
        out.writeInt(this.newSuggestArea ? 1 : 0);
    }

    public final boolean getDarkMode() {
        return this.darkMode;
    }

    public final int getNewMafCount() {
        return this.newMafCount;
    }

    public final boolean getNewSuggestArea() {
        return this.newSuggestArea;
    }

    public final KMR getPageStyle() {
        return this.pageStyle;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getRecUserSharedKey() {
        return this.recUserSharedKey;
    }

    public final int getTransitionType() {
        return this.transitionType;
    }

    public FindFriendsPageArg(boolean z, int i, String previousPage, KMR pageStyle, String str, int i2, boolean z2) {
        o.LJIIIZ(previousPage, "previousPage");
        o.LJIIIZ(pageStyle, "pageStyle");
        this.darkMode = z;
        this.transitionType = i;
        this.previousPage = previousPage;
        this.pageStyle = pageStyle;
        this.recUserSharedKey = str;
        this.newMafCount = i2;
        this.newSuggestArea = z2;
    }

    public /* synthetic */ FindFriendsPageArg(boolean z, int i, String str, KMR kmr, String str2, int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? KMR.DEFAULT : kmr, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? false : z2);
    }
}
