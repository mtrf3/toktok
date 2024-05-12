package com.ss.android.ugc.aweme.following.ui.viewmodel;

import X.C52804Knw;
import X.C52991Kqx;
import X.C53136KtI;
import X.C53836LAy;
import X.C57460Mgq;
import X.C62822Ol8;
import X.C72895SjD;
import X.C72909SjR;
import X.C73805Sxt;
import X.C77275UUl;
import X.EnumC56185M3h;
import X.EnumC72903SjL;
import X.R39;
import X.TBT;
import X.TC4;
import Y.IDhS71S0200000_12;
import android.content.Context;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FollowerRelationViewModel extends JediViewModel<FollowerRelationState> {
    public String LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public Context LJLLI;
    public int LJLLLL;
    public final TC4 LJLJJLL = new TC4();
    public int LJLJL = -1;
    public final Map<String, Boolean> LJLLILLLL = new LinkedHashMap();
    public boolean LJLLJ = true;
    public final ListMiddleware<FollowerRelationState, Object, C72909SjR> LJLLL = new ListMiddleware<>(new AqS178S0100000_12(this, 200), new AqS178S0100000_12(this, 201), C53836LAy.LJLIL, 4);

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final FollowerRelationState kv0() {
        return new FollowerRelationState(null, null, false, null, null, null, 63, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        withState(new AqS178S0100000_12(this, 202));
        this.LJLJJLL.release();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void onStart() {
        super.onStart();
        ListMiddleware<FollowerRelationState, Object, C72909SjR> listMiddleware = this.LJLLL;
        listMiddleware.LJ(new TBT() { // from class: X.SjO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((FollowerRelationState) obj).getListState();
            }
        }, C72895SjD.LJLIL);
        iv0(listMiddleware);
    }

    public final C73805Sxt Hv0(FollowerRelationState followerRelationState) {
        return R39.LIZLLL(this.LJLJJLL, followerRelationState.getUserId(), followerRelationState.getSecUserId(), 0L, 0, Iv0(followerRelationState.isSelf()), C57460Mgq.LIZ(), null, this.LJLJLLL, 128).LJJIJL(new IDhS71S0200000_12(this, followerRelationState, 6));
    }

    public final int Iv0(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (!z) {
            if (C77275UUl.LJIIIIZZ(1, 3).contains(Integer.valueOf(((Number) C52991Kqx.LIZ.getValue()).intValue()))) {
                return EnumC72903SjL.SOURCE_TYPE_BY_MAF_TOP.getValue();
            }
            return EnumC72903SjL.SOURCE_TYPE_BY_CREATE_TIME.getValue();
        }
        if (this.LJLJL > 1000) {
            return EnumC72903SjL.SOURCE_TYPE_BY_CREATE_TIME.getValue();
        }
        if (o.LJ(this.LJLL, "notification_page") && C53136KtI.LIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (o.LJ(this.LJLL, "push")) {
            C62822Ol8 c62822Ol8 = C52804Knw.LIZ;
            if (((Number) c62822Ol8.getValue()).intValue() == 1 || ((Number) c62822Ol8.getValue()).intValue() == 2) {
                z3 = true;
                if (!z2 || z3) {
                    return EnumC72903SjL.SOURCE_TYPE_BY_MAF_FAN_NOTICE.getValue();
                }
                if (!o.LJ(this.LJLL, "notification_page") && !o.LJ(this.LJLL, "push")) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (((Number) C53136KtI.LIZ.getValue()).intValue() == 2 || ((Number) C52804Knw.LIZ.getValue()).intValue() == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z4 && z5) {
                    return EnumC72903SjL.SOURCE_TYPE_BY_LOW_FAN.getValue();
                }
                return EnumC72903SjL.SOURCE_TYPE_BY_CREATE_TIME.getValue();
            }
        }
        z3 = false;
        if (!z2) {
        }
        return EnumC72903SjL.SOURCE_TYPE_BY_MAF_FAN_NOTICE.getValue();
    }

    public final void Jv0(EnumC56185M3h reason) {
        o.LJIIIZ(reason, "reason");
        withState(new AqS178S0100000_12(reason, 203));
    }
}
