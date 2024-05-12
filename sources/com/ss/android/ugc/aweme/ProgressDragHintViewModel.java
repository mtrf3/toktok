package com.ss.android.ugc.aweme;

import X.C232719Bj;
import X.C9BH;
import X.C9BX;
import X.C9BY;
import X.EnumC232679Bf;
import X.InterfaceC232729Bk;
import X.InterfaceC232739Bl;
import X.InterfaceC56460MDw;
import X.ORZ;
import X.X1D;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS55S0201000_4;
import kotlin.jvm.internal.AqS94S0101000_4;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ProgressDragHintViewModel extends AssemViewModel<C9BX> implements InterfaceC232729Bk, InterfaceC56460MDw {
    public boolean LJLJJI;
    public WeakReference<InterfaceC232739Bl> LJLIL = new WeakReference<>(null);
    public List<Utterance> LJLILLLLZI = new ArrayList();
    public final HashSet<String> LJLJI = new HashSet<>();
    public C232719Bj LJLJJL = new C232719Bj(false, 7);

    @Override // X.InterfaceC232729Bk
    public final void L60() {
        setState(C9BY.LJLIL);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C9BX defaultState() {
        return new C9BX(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLIL.clear();
    }

    public static C9BH lv0(String str) {
        if (str != null && str.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i = JSONObjectProtectorUtils.getInt(jSONObject, "duration");
                int i2 = JSONObjectProtectorUtils.getInt(jSONObject, "pts");
                String captionText = JSONObjectProtectorUtils.getString(jSONObject, "content");
                o.LJIIIIZZ(captionText, "captionText");
                return new C9BH(i2, i + i2, captionText);
            } catch (JSONException e) {
                e.getMessage();
            }
        }
        return null;
    }

    @Override // X.InterfaceC56460MDw
    public final void Jl0(int i) {
        withState(new AqS94S0101000_4(this, i, 1));
    }

    @Override // X.InterfaceC232729Bk
    public final void Lj(EnumC232679Bf captionSource) {
        o.LJIIIZ(captionSource, "captionSource");
        setState(new AqS170S0100000_4(captionSource, 141));
    }

    @Override // X.InterfaceC232729Bk
    public final void bd0(List<Utterance> list) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("slot creator caption data; data size: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        this.LJLILLLLZI = list;
    }

    @Override // X.InterfaceC56460MDw
    public final void dR(int i) {
        withState(new AqS94S0101000_4(this, i, 2));
    }

    public final void gv0(C9BH c9bh) {
        if (c9bh != null) {
            c9bh.toString();
            if (c9bh.LJLJI.length() > 0) {
                this.LJLJI.add(c9bh.toString());
            }
        }
    }

    public static boolean hv0(C9BX c9bx, int i) {
        C9BH c9bh = c9bx.LJLILLLLZI;
        if (c9bh != null) {
            int i2 = c9bh.LJLIL;
            if (i <= c9bh.LJLILLLLZI && i2 <= i) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC56460MDw
    public final void YP(int i, AqS140S0200000_9 aqS140S0200000_9) {
        withState(new AqS55S0201000_4(this, i, aqS140S0200000_9, 1));
    }

    public final boolean iv0(C9BX c9bx, int i) {
        String str;
        boolean z = false;
        if (!this.LJLJJI) {
            return false;
        }
        if (hv0(c9bx, i)) {
            return true;
        }
        InterfaceC232739Bl interfaceC232739Bl = this.LJLIL.get();
        String str2 = null;
        if (interfaceC232739Bl != null) {
            str2 = interfaceC232739Bl.LIZLLL(i);
        }
        C9BH lv0 = lv0(str2);
        if (lv0 == null || (str = lv0.LJLJI) == null || str.length() == 0) {
            z = true;
        }
        return !z;
    }

    public final boolean jv0(C9BX c9bx, int i) {
        List<Utterance> list = this.LJLILLLLZI;
        if (list == null || !this.LJLJJI) {
            return false;
        }
        if (!hv0(c9bx, i) && kv0(0, list.size(), i) == null) {
            return false;
        }
        return true;
    }

    public final Utterance kv0(int i, int i2, int i3) {
        Utterance utterance;
        if (i > i2) {
            return null;
        }
        int i4 = (i + i2) / 2;
        List<Utterance> list = this.LJLILLLLZI;
        if (list == null || (utterance = (Utterance) ORZ.LJLLLLLL(i4, list)) == null) {
            return null;
        }
        long j = i3;
        if (j >= utterance.getStartTime() && j <= utterance.getEndTime()) {
            return utterance;
        }
        if (j < utterance.getStartTime()) {
            return kv0(i, i4 - 1, i3);
        }
        return kv0(i4 + 1, i2, i3);
    }
}
