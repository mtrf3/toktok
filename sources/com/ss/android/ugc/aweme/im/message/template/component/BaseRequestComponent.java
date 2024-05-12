package com.ss.android.ugc.aweme.im.message.template.component;

import X.C221108m2;
import X.C5H3;
import X.C62861Oll;
import X.C63685Oz3;
import X.C69619RTz;
import X.C69649RVd;
import X.C69650RVe;
import X.F9E;
import X.RU2;
import X.RU3;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BaseRequestComponent extends F9E implements BaseComponent {
    public final QueryDataComponent queryData;
    public static final C69650RVe Companion = new C69650RVe();
    public static final Parcelable.Creator<BaseRequestComponent> CREATOR = new C62861Oll();
    public static final C5H3<BaseRequestComponent> EMPTY_BASE_REQUEST$delegate = C221108m2.LIZIZ(C69649RVd.LJLIL);

    public BaseRequestComponent() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.queryData};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.queryData.writeToParcel(out, i);
    }

    public final RU2 L() {
        RU3 ru3 = new RU3();
        QueryDataComponent queryDataComponent = this.queryData;
        queryDataComponent.getClass();
        C69619RTz c69619RTz = new C69619RTz();
        c69619RTz.LIZLLL = queryDataComponent.resourceID;
        Map<String, String> map = queryDataComponent.extras;
        C63685Oz3.LIZIZ(map);
        c69619RTz.LJ = map;
        ru3.LIZLLL = c69619RTz.build();
        return ru3.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ BaseRequestComponent(int i) {
        this(new QueryDataComponent(null, 0 == true ? 1 : 0, 3));
    }

    public BaseRequestComponent(QueryDataComponent queryData) {
        o.LJIIIZ(queryData, "queryData");
        this.queryData = queryData;
    }
}
