package com.bytedance.android.livesdk.qa;

import X.ActivityC45651qj;
import X.BV1;
import X.C10A;
import X.C141335gf;
import X.C221108m2;
import X.C29306Beo;
import X.C29927Bop;
import X.C29S;
import X.C3C5;
import X.C51029K0z;
import X.C62822Ol8;
import X.C76800UCe;
import X.C78496UrM;
import X.C78856UxA;
import X.C80261Vej;
import X.C90903hW;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.model.message.QuestionMessage;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class QAFragment extends BaseFragment implements OnMessageListener {
    public DataChannel LJLIL;
    public boolean LJLILLLLZI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 260));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 261));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00eb, code lost:
    
        if (r1.question.questionId != 0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Boolean, O] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wl() {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.qa.QAFragment.wl():void");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        IMessageManager iMessageManager;
        super.onDestroy();
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(this);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        this.LJLIL = LJIILIIL;
        this.LJLILLLLZI = BV1.LJIIIZ(LJIILIIL);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        View view;
        if ((iMessage instanceof QuestionMessage) && C29306Beo.LJIIJ(this.LJLIL) && isResumed() && !((C78856UxA) this.LJLJI.getValue()).LIZ()) {
            View view2 = ((C78856UxA) this.LJLJI.getValue()).LJFF;
            if (view2 != null) {
                view = view2.findViewById(R.id.kz4);
            } else {
                view = null;
            }
            C29306Beo.LJJLJLI(view);
        }
    }

    public static C78856UxA vl(QAFragment qAFragment, String str) {
        View findViewById;
        TextView textView;
        C78856UxA newTab = ((C80261Vej) qAFragment._$_findCachedViewById(R.id.kyt)).newTab();
        o.LJIIIIZZ(newTab, "tab_layout.newTab()");
        newTab.LIZJ(R.layout.d03);
        View view = newTab.LJFF;
        if (view != null && (textView = (TextView) view.findViewById(R.id.kyz)) != null) {
            textView.setText(str);
        }
        View view2 = newTab.LJFF;
        if (view2 != null && (findViewById = view2.findViewById(R.id.kz4)) != null) {
            C29306Beo.LJI(findViewById);
        }
        return newTab;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        DataChannel dataChannel;
        o.LJIIIZ(view, "view");
        super.onCreate(bundle);
        wl();
        if (C29306Beo.LJIIJ(this.LJLIL) && (dataChannel = this.LJLIL) != null) {
            dataChannel.lv0(this, AnchorSwitchQuestionEvent.class, new AqS171S0100000_5(this, 678));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.d01, viewGroup, false, "inflater.inflate(R.layou…layout, container, false)");
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LIZIZ;
    }
}
