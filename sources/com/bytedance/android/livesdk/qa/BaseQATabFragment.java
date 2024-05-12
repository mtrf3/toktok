package com.bytedance.android.livesdk.qa;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C28422BDm;
import X.C28863BUl;
import X.C29S;
import X.C32537Cpp;
import X.C3C5;
import X.C51029K0z;
import X.C76800UCe;
import X.C90903hW;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public abstract class BaseQATabFragment extends BaseFragment {
    public DataChannel LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public String LJLJJI = "";
    public final String LJLJJL = "qa_list";

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Boolean, O] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C28422BDm.class)).LIZ = Boolean.TRUE;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        String str;
        User user;
        UserAttr userAttr;
        Boolean bool;
        super.onCreate(bundle);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        this.LJLIL = LJIILIIL;
        boolean z2 = false;
        if (LJIILIIL != null && (bool = (Boolean) LJIILIIL.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLILLLLZI = z;
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null && (user = (User) dataChannel.kv0(RoomUserChannel.class)) != null && (userAttr = user.getUserAttr()) != null) {
            z2 = userAttr.isAdmin;
        }
        this.LJLJI = z2;
        DataChannel dataChannel2 = this.LJLIL;
        if (dataChannel2 == null || (str = (String) dataChannel2.kv0(C28863BUl.class)) == null) {
            str = "";
        }
        this.LJLJJI = str;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d00, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
