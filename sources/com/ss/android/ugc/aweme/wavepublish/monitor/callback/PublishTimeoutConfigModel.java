package com.ss.android.ugc.aweme.wavepublish.monitor.callback;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PublishTimeoutConfigModel {

    @InterfaceC65349Pkn("nodes")
    public final List<PublishNodeTimeout> nodes;

    /* JADX WARN: Multi-variable type inference failed */
    public PublishTimeoutConfigModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PublishTimeoutConfigModel copy$default(PublishTimeoutConfigModel publishTimeoutConfigModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = publishTimeoutConfigModel.nodes;
        }
        return publishTimeoutConfigModel.copy(list);
    }

    public final PublishTimeoutConfigModel copy(List<PublishNodeTimeout> list) {
        return new PublishTimeoutConfigModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PublishTimeoutConfigModel) && o.LJ(this.nodes, ((PublishTimeoutConfigModel) obj).nodes);
    }

    public int hashCode() {
        List<PublishNodeTimeout> list = this.nodes;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PublishTimeoutConfigModel(nodes=");
        return C1NE.LIZIZ(LIZ, this.nodes, ')', LIZ);
    }

    public final List<PublishNodeTimeout> getNodes() {
        return this.nodes;
    }

    public PublishTimeoutConfigModel(List<PublishNodeTimeout> list) {
        this.nodes = list;
    }

    public /* synthetic */ PublishTimeoutConfigModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
