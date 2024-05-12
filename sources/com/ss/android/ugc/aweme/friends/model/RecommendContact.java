package com.ss.android.ugc.aweme.friends.model;

import X.X1D;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RecommendContact extends User {
    public final Integer type;

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendContact() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RecommendContact copy$default(RecommendContact recommendContact, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = recommendContact.type;
        }
        return recommendContact.copy(num);
    }

    public final RecommendContact copy(Integer num) {
        return new RecommendContact(num);
    }

    @Override // com.ss.android.ugc.aweme.profile.model.User
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendContact) && o.LJ(this.type, ((RecommendContact) obj).type);
    }

    @Override // com.ss.android.ugc.aweme.profile.model.User
    public int hashCode() {
        Integer num = this.type;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendContact(type=");
        return s0.LIZJ(LIZ, this.type, ')', LIZ);
    }

    public final Integer getType() {
        return this.type;
    }

    public RecommendContact(Integer num) {
        this.type = num;
    }

    public /* synthetic */ RecommendContact(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num);
    }
}
