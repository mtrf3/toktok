package com.ss.android.ugc.aweme.music.ui.viewmodel;

import X.C70839Rr9;
import X.X1D;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.ICommonListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MusicAwemeListState implements ICommonListState<Object> {
    public boolean isNeedControl;
    public final String musicId;
    public int outBound;
    public final ListState substate;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MusicAwemeListState() {
        /*
            r7 = this;
            r1 = 0
            r2 = 0
            r5 = 15
            r0 = r7
            r3 = r2
            r4 = r1
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.viewmodel.MusicAwemeListState.<init>():void");
    }

    public static /* synthetic */ MusicAwemeListState copy$default(MusicAwemeListState musicAwemeListState, String str, int i, boolean z, ListState listState, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = musicAwemeListState.musicId;
        }
        if ((i2 & 2) != 0) {
            i = musicAwemeListState.outBound;
        }
        if ((i2 & 4) != 0) {
            z = musicAwemeListState.isNeedControl;
        }
        if ((i2 & 8) != 0) {
            listState = musicAwemeListState.getSubstate();
        }
        return musicAwemeListState.copy(str, i, z, listState);
    }

    public final ListState component4() {
        return getSubstate();
    }

    public final MusicAwemeListState copy(String musicId, int i, boolean z, ListState substate) {
        o.LJIIIZ(musicId, "musicId");
        o.LJIIIZ(substate, "substate");
        return new MusicAwemeListState(musicId, i, z, substate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicAwemeListState)) {
            return false;
        }
        MusicAwemeListState musicAwemeListState = (MusicAwemeListState) obj;
        return o.LJ(this.musicId, musicAwemeListState.musicId) && this.outBound == musicAwemeListState.outBound && this.isNeedControl == musicAwemeListState.isNeedControl && o.LJ(getSubstate(), musicAwemeListState.getSubstate());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.musicId.hashCode() * 31) + this.outBound) * 31;
        boolean z = this.isNeedControl;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return getSubstate().hashCode() + ((hashCode + i) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicAwemeListState(musicId=");
        LIZ.append(this.musicId);
        LIZ.append(", outBound=");
        LIZ.append(this.outBound);
        LIZ.append(", isNeedControl=");
        LIZ.append(this.isNeedControl);
        LIZ.append(", substate=");
        LIZ.append(getSubstate());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final int getOutBound() {
        return this.outBound;
    }

    public final boolean isNeedControl() {
        return this.isNeedControl;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public ListState getSubstate() {
        return this.substate;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public NestedState<ListState> newSubstate(ListState sub) {
        o.LJIIIZ(sub, "sub");
        return copy$default(this, null, 0, false, sub, 7, null);
    }

    public final void setNeedControl(boolean z) {
        this.isNeedControl = z;
    }

    public final void setOutBound(int i) {
        this.outBound = i;
    }

    public MusicAwemeListState(String musicId, int i, boolean z, ListState substate) {
        o.LJIIIZ(musicId, "musicId");
        o.LJIIIZ(substate, "substate");
        this.musicId = musicId;
        this.outBound = i;
        this.isNeedControl = z;
        this.substate = substate;
    }

    public /* synthetic */ MusicAwemeListState(String str, int i, boolean z, ListState listState, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? new ListState(new C70839Rr9(2), null, null, null, null, 30, null) : listState);
    }
}
