package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.models.UserPublishInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.7kA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194467kA {
    public final MutableLiveData<UserPublishInfo> LIZ;
    public final MutableLiveData<C194227jm> LIZIZ;
    public final MutableLiveData<AbstractC194637kR> LIZJ;

    public C194467kA() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C194467kA)) {
            return false;
        }
        C194467kA c194467kA = (C194467kA) obj;
        return o.LJ(this.LIZ, c194467kA.LIZ) && o.LJ(this.LIZIZ, c194467kA.LIZIZ) && o.LJ(this.LIZJ, c194467kA.LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowGlobalStateImpl(publishInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(", diversionInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", nowPostState=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C194467kA(Object obj) {
        MutableLiveData<UserPublishInfo> mutableLiveData = new MutableLiveData<>();
        MutableLiveData<C194227jm> mutableLiveData2 = new MutableLiveData<>(new C194227jm(null, null));
        MutableLiveData<AbstractC194637kR> mutableLiveData3 = new MutableLiveData<>(C194627kQ.LIZ);
        this.LIZ = mutableLiveData;
        this.LIZIZ = mutableLiveData2;
        this.LIZJ = mutableLiveData3;
    }
}
