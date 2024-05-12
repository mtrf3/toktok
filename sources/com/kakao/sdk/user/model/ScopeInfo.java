package com.kakao.sdk.user.model;

import X.C16880lQ;
import X.C1NE;
import X.C279017q;
import X.C279117r;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ScopeInfo implements Parcelable {
    public static final Parcelable.Creator<ScopeInfo> CREATOR = new Creator();
    public final long id;
    public final List<Scope> scopes;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScopeInfo copy$default(ScopeInfo scopeInfo, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = scopeInfo.id;
        }
        if ((i & 2) != 0) {
            list = scopeInfo.scopes;
        }
        return scopeInfo.copy(j, list);
    }

    public final ScopeInfo copy(long j, List<Scope> list) {
        return new ScopeInfo(j, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScopeInfo)) {
            return false;
        }
        ScopeInfo scopeInfo = (ScopeInfo) obj;
        return this.id == scopeInfo.id && o.LJ(this.scopes, scopeInfo.scopes);
    }

    public int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.id) * 31;
        List<Scope> list = this.scopes;
        return LLJIJIL + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ScopeInfo(id=");
        LIZ.append(this.id);
        LIZ.append(", scopes=");
        return C1NE.LIZIZ(LIZ, this.scopes, ')', LIZ);
    }

    public final long getId() {
        return this.id;
    }

    public final List<Scope> getScopes() {
        return this.scopes;
    }

    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<ScopeInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScopeInfo[] newArray(int i) {
            return new ScopeInfo[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScopeInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            o.LJIIIZ(parcel, "parcel");
            long readLong = parcel.readLong();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = C279117r.LIZIZ(Scope.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new ScopeInfo(readLong, arrayList);
        }
    }

    public ScopeInfo(long j, List<Scope> list) {
        this.id = j;
        this.scopes = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.id);
        List<Scope> list = this.scopes;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            ((Scope) LIZIZ.next()).writeToParcel(out, i);
        }
    }
}
