package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1;

import X.C0NB;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C28507BGt;
import X.C30868C9o;
import X.C48459J0d;
import X.C74951TbH;
import X.C75559Tl5;
import X.InterfaceC24140x8;
import X.InterfaceC30442Bx8;
import X.InterfaceC75138TeI;
import Y.ACListenerS33S0100000_13;
import Y.ARunnableS49S0100000_13;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class GuestMediaManagePanel extends PreviewDialogFragment {
    public static final /* synthetic */ int LJLJJI = 0;
    public GuestMediaManageFragment LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @InterfaceC75138TeI(name = "MULTI_GUEST_DATA_HOLDER")
    public final MultiGuestDataHolder multiGuestDataHolder;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.PreviewDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.PreviewDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.PreviewDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public GuestMediaManagePanel() {
        C75559Tl5.LIZIZ.LJ(this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cze);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJIIL = new ColorDrawable(0);
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -1;
        c28507BGt.LJ = true;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        View view;
        GuestMediaManageFragment guestMediaManageFragment = this.LJLILLLLZI;
        if (guestMediaManageFragment != null) {
            C0NB.LJIIIZ(GuestMediaManageFragment.LLJZ, "onDialogDismissOrBackPressed");
            View view2 = guestMediaManageFragment.LJLJJL;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            C74951TbH.LJI();
            InterfaceC24140x8 interfaceC24140x8 = guestMediaManageFragment.LJLJJI;
            if (interfaceC24140x8 != null && guestMediaManageFragment.LLJILJIL != null && guestMediaManageFragment.LLILL) {
                C74951TbH.LJ(guestMediaManageFragment.LLJ, guestMediaManageFragment.LLILLJJLI, guestMediaManageFragment.LLILLIZIL, guestMediaManageFragment.LLIIZ, interfaceC24140x8.getAttachedComposerManager());
            }
            guestMediaManageFragment.LLJILLL = true;
        }
        GuestMediaManageFragment guestMediaManageFragment2 = this.LJLILLLLZI;
        if (guestMediaManageFragment2 != null && (view = guestMediaManageFragment2.LJLJJL) != null) {
            view.post(new ARunnableS49S0100000_13(this, 44));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        dismiss();
        return true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        MultiGuestDataHolder multiGuestDataHolder = this.multiGuestDataHolder;
        if (multiGuestDataHolder == null) {
            return;
        }
        multiGuestDataHolder.LJIIIZ = false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        MultiGuestDataHolder multiGuestDataHolder = this.multiGuestDataHolder;
        if (multiGuestDataHolder == null) {
            return;
        }
        multiGuestDataHolder.LJIIIZ = true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        getDialogParams().LJI = 0.0f;
        C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 38), _$_findCachedViewById(R.id.hej));
        GuestMediaManageFragment guestMediaManageFragment = this.LJLILLLLZI;
        if (guestMediaManageFragment != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
            LIZ.LJIIIIZZ(R.id.dm7, 1, guestMediaManageFragment, null);
            LIZ.LJIILJJIL();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager manager, String str) {
        o.LJIIIZ(manager, "manager");
        GuestMediaManageFragment guestMediaManageFragment = this.LJLILLLLZI;
        if (guestMediaManageFragment != null && !guestMediaManageFragment.isAdded()) {
            try {
                super.show(manager, str);
                C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.q0;
                if (o.LJ(c48459J0d.LIZJ(), Boolean.FALSE)) {
                    C30868C9o.LIZJ(R.string.nfi);
                    c48459J0d.LIZ(Boolean.TRUE);
                }
            } catch (Exception unused) {
            }
        }
    }
}
