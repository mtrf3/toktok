package com.ss.android.ugc.aweme.profile.effect;

import X.C70839Rr9;
import X.X1D;
import com.bytedance.jedi.arch.ext.list.ICommonListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class EffectProfileState implements ICommonListState<NewFaceStickerBean> {
    public final ListState substate;
    public final String userId;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectProfileState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EffectProfileState copy$default(EffectProfileState effectProfileState, String str, ListState listState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = effectProfileState.userId;
        }
        if ((i & 2) != 0) {
            listState = effectProfileState.getSubstate();
        }
        return effectProfileState.copy(str, listState);
    }

    public final ListState component2() {
        return getSubstate();
    }

    public final EffectProfileState copy(String str, ListState substate) {
        o.LJIIIZ(substate, "substate");
        return new EffectProfileState(str, substate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectProfileState)) {
            return false;
        }
        EffectProfileState effectProfileState = (EffectProfileState) obj;
        return o.LJ(this.userId, effectProfileState.userId) && o.LJ(getSubstate(), effectProfileState.getSubstate());
    }

    public int hashCode() {
        String str = this.userId;
        return getSubstate().hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectProfileState(userId=");
        LIZ.append(this.userId);
        LIZ.append(", substate=");
        LIZ.append(getSubstate());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getUserId() {
        return this.userId;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public ListState getSubstate() {
        return this.substate;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public EffectProfileState newSubstate(ListState sub) {
        o.LJIIIZ(sub, "sub");
        return copy$default(this, null, sub, 1, null);
    }

    public EffectProfileState(String str, ListState substate) {
        o.LJIIIZ(substate, "substate");
        this.userId = str;
        this.substate = substate;
    }

    public /* synthetic */ EffectProfileState(String str, ListState listState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new ListState(new C70839Rr9(3), null, null, null, null, 30, null) : listState);
    }
}
