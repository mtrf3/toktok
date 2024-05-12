package com.ss.android.ugc.aweme.im.message.template.component;

import X.C63685Oz3;
import X.C69646RVa;
import X.F9E;
import X.RUA;
import X.RUB;
import X.RUD;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BaseResponseComponent extends F9E implements BaseComponent {
    public static final Parcelable.Creator<BaseResponseComponent> CREATOR = new C69646RVa();
    public final List<String> contentMenus;
    public final Map<String, String> extras;
    public final long minVersion;
    public final TTLComponent ttlComponent;

    public BaseResponseComponent() {
        this(0L, 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.ttlComponent, this.contentMenus, Long.valueOf(this.minVersion), this.extras};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.ttlComponent.writeToParcel(out, i);
        out.writeStringList(this.contentMenus);
        out.writeLong(this.minVersion);
        Map<String, String> map = this.extras;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    public final RUB L() {
        RUD rud = new RUD();
        TTLComponent tTLComponent = this.ttlComponent;
        tTLComponent.getClass();
        RUA rua = new RUA();
        rua.LIZLLL = Long.valueOf(tTLComponent.expiredAt);
        rud.LIZLLL = rua.build();
        List<String> list = this.contentMenus;
        C63685Oz3.LIZ(list);
        rud.LJ = list;
        rud.LJFF = Long.valueOf(this.minVersion);
        Map<String, String> map = this.extras;
        C63685Oz3.LIZIZ(map);
        rud.LJI = map;
        return rud.build();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BaseResponseComponent(long r7, int r9) {
        /*
            r6 = this;
            r3 = r7
            r0 = r9 & 1
            r5 = 0
            if (r0 == 0) goto L27
            com.ss.android.ugc.aweme.im.message.template.component.TTLComponent r1 = new com.ss.android.ugc.aweme.im.message.template.component.TTLComponent
            r0 = 0
            r1.<init>(r0)
        Lc:
            r0 = r9 & 2
            if (r0 == 0) goto L25
            X.OQg r2 = X.C61878OQg.INSTANCE
        L12:
            r0 = r9 & 4
            if (r0 == 0) goto L18
            r3 = 0
        L18:
            r0 = r9 & 8
            if (r0 == 0) goto L20
            X.3mF r5 = X.C113554cx.LJJJLIIL()
        L20:
            r0 = r6
            r0.<init>(r1, r2, r3, r5)
            return
        L25:
            r2 = r5
            goto L12
        L27:
            r1 = r5
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent.<init>(long, int):void");
    }

    public BaseResponseComponent(TTLComponent ttlComponent, List<String> contentMenus, long j, Map<String, String> extras) {
        o.LJIIIZ(ttlComponent, "ttlComponent");
        o.LJIIIZ(contentMenus, "contentMenus");
        o.LJIIIZ(extras, "extras");
        this.ttlComponent = ttlComponent;
        this.contentMenus = contentMenus;
        this.minVersion = j;
        this.extras = extras;
    }
}
