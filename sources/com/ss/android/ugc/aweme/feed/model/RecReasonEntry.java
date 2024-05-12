package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class RecReasonEntry extends F9E implements Serializable {

    @InterfaceC65349Pkn("desc")
    public String desc;

    @InterfaceC65349Pkn("rec_type")
    public int type;

    public RecReasonEntry() {
    }

    public static /* synthetic */ RecReasonEntry copy$default(RecReasonEntry recReasonEntry, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = recReasonEntry.type;
        }
        if ((i2 & 2) != 0) {
            str = recReasonEntry.desc;
        }
        return recReasonEntry.copy(i, str);
    }

    public final RecReasonEntry copy(int i, String desc) {
        o.LJIIIZ(desc, "desc");
        return new RecReasonEntry(i, desc);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.type), this.desc};
    }

    public final String getDesc() {
        return this.desc;
    }

    public final int getType() {
        return this.type;
    }

    public RecReasonEntry(int i, String desc) {
        o.LJIIIZ(desc, "desc");
        this.type = i;
        this.desc = desc;
    }
}
