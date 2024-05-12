package com.bytedance.android.livesdk.adminsetting;

import X.ActivityC45651qj;
import X.C05170If;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C23010vJ;
import X.C29S;
import X.C2A7;
import X.C3C5;
import X.C47121t6;
import X.C5H3;
import X.C76800UCe;
import X.C78996UzQ;
import X.C90903hW;
import X.InterfaceC65784Pro;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveFilterCommentApproveFragment extends BaseFragment {
    public static final /* synthetic */ int LJLJJL = 0;
    public InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public ChatMessage LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C5H3 LJLIL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 98));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        User user;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJJII((LiveIconView) _$_findCachedViewById(R.id.eb1), new ACListenerS25S0100000_5(this, 63));
        C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.axi), new ACListenerS25S0100000_5(this, 64));
        C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.b0e), new ACListenerS25S0100000_5(this, 65));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ChatMessage chatMessage = this.LJLJI;
        String str = null;
        if (chatMessage != null) {
            user = chatMessage.userInfo;
        } else {
            user = null;
        }
        String LIZ = C05170If.LIZ(user);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZ);
        LIZ2.append(": ");
        spannableStringBuilder.append((CharSequence) X1D.LIZIZ(LIZ2));
        C23010vJ.LJFF(spannableStringBuilder, 0, LIZ.length() + 1, 33, 700);
        ChatMessage chatMessage2 = this.LJLJI;
        if (chatMessage2 != null) {
            str = chatMessage2.content;
        }
        spannableStringBuilder.append((CharSequence) str);
        ((TextView) _$_findCachedViewById(R.id.gao)).setText(spannableStringBuilder);
        if (((Boolean) this.LJLIL.getValue()).booleanValue()) {
            ((TextView) _$_findCachedViewById(R.id.gap)).setText(getResources().getText(R.string.kam));
            C16880lQ.LJJIIZ((C47121t6) _$_findCachedViewById(R.id.gap), new ACListenerS25S0100000_5(this, 66));
        } else {
            ((TextView) _$_findCachedViewById(R.id.gap)).setText(getResources().getText(R.string.kaj));
            C16880lQ.LJJIIZ((C47121t6) _$_findCachedViewById(R.id.gap), new ACListenerS25S0100000_5(this, 67));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cws, viewGroup, false);
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
