package com.ss.android.ugc.aweme.beauty;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BeautifyInfo extends F9E {

    @InterfaceC65349Pkn("id")
    public final String effectId;

    @InterfaceC65349Pkn("tags")
    public final List<BeautifyTag> tags;

    /* JADX WARN: Multi-variable type inference failed */
    public BeautifyInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeautifyInfo copy$default(BeautifyInfo beautifyInfo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beautifyInfo.effectId;
        }
        if ((i & 2) != 0) {
            list = beautifyInfo.tags;
        }
        return beautifyInfo.copy(str, list);
    }

    public final BeautifyInfo copy(String effectId, List<BeautifyTag> tags) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(tags, "tags");
        return new BeautifyInfo(effectId, tags);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.effectId, this.tags};
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final List<BeautifyTag> getTags() {
        return this.tags;
    }

    public BeautifyInfo(String effectId, List<BeautifyTag> tags) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(tags, "tags");
        this.effectId = effectId;
        this.tags = tags;
    }

    public /* synthetic */ BeautifyInfo(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "-1" : str, (i & 2) != 0 ? new ArrayList() : list);
    }
}
