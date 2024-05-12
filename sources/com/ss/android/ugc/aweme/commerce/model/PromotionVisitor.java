package com.ss.android.ugc.aweme.commerce.model;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PromotionVisitor extends F9E implements Serializable {

    @InterfaceC65349Pkn("avatar")
    public List<? extends UrlModel> avatars;

    @InterfaceC65349Pkn("count")
    public long count;

    public PromotionVisitor() {
        this(null, 0L, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromotionVisitor copy$default(PromotionVisitor promotionVisitor, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = promotionVisitor.avatars;
        }
        if ((i & 2) != 0) {
            j = promotionVisitor.count;
        }
        return promotionVisitor.copy(list, j);
    }

    public final PromotionVisitor copy(List<? extends UrlModel> avatars, long j) {
        o.LJIIIZ(avatars, "avatars");
        return new PromotionVisitor(avatars, j);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.avatars, Long.valueOf(this.count)};
    }

    public final List<UrlModel> getAvatars() {
        return this.avatars;
    }

    public final long getCount() {
        return this.count;
    }

    public final void setAvatars(List<? extends UrlModel> list) {
        o.LJIIIZ(list, "<set-?>");
        this.avatars = list;
    }

    public final void setCount(long j) {
        this.count = j;
    }

    public PromotionVisitor(List<? extends UrlModel> avatars, long j) {
        o.LJIIIZ(avatars, "avatars");
        this.avatars = avatars;
        this.count = j;
    }

    public PromotionVisitor(List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? 0L : j);
    }
}
