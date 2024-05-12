package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.stickercreation.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C214738bl;
import X.C29S;
import X.C3C5;
import X.C41209GFh;
import X.C4HE;
import X.C4IJ;
import X.C65352Pkq;
import X.C71745SDt;
import X.C76800UCe;
import X.C90903hW;
import X.DialogC25756A8y;
import X.InterfaceC61213O0r;
import X.LFH;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.stickercreation.viewmodel.VideoStickerCreationViewModel;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes2.dex */
public final class VideoCreationTailFragment extends BaseFragment {
    public static final /* synthetic */ int LJZI = 0;
    public Integer LJLILLLLZI;
    public Integer LJLJI;
    public String LJLJJI;
    public Long LJLJJL;
    public Boolean LJLJJLL;
    public Boolean LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public Integer LJLL;
    public VideoSticker LJLLI;
    public ArrayList<String> LJLLJ;
    public DialogC25756A8y LJLLL;
    public C4IJ LJLLLL;
    public PthreadTimer LJLLLLLL;
    public Integer LJLZ;
    public final Map<Integer, View> LJZ = new LinkedHashMap();
    public final C214738bl LJLIL = C71745SDt.LIZ(this, C65352Pkq.LIZ(VideoStickerCreationViewModel.class), new AqS151S0100000_1((Fragment) this, 276), new AqS151S0100000_1(this, 277));
    public final long LJLLILLLL = SystemClock.elapsedRealtime();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZ).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZ;
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final VideoStickerCreationViewModel vl() {
        return (VideoStickerCreationViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Integer num;
        Window window;
        if (C4HE.LIZ() && (num = this.LJLZ) != null) {
            int intValue = num.intValue();
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
                window.setSoftInputMode(intValue);
            }
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        PthreadTimer pthreadTimer = this.LJLLLLLL;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ArrayList<String> arrayList;
        Window window;
        Window window2;
        WindowManager.LayoutParams attributes;
        Window window3;
        ActivityC45651qj mo49getActivity;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Integer num = null;
        if (arguments != null) {
            arrayList = arguments.getStringArrayList("sticker_texts");
        } else {
            arrayList = null;
        }
        this.LJLLJ = arrayList;
        if (LFH.LIZIZ.LIZLLL().LJIJ().LIZLLL() == 0 && (mo49getActivity = mo49getActivity()) != null) {
            mo49getActivity.setRequestedOrientation(1);
        }
        fragmentConfiguration(C41209GFh.LJLIL);
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null && (window3 = mo49getActivity2.getWindow()) != null) {
            window3.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            window3.setNavigationBarColor(-16777216);
        }
        if (C4HE.LIZ()) {
            ActivityC45651qj mo49getActivity3 = mo49getActivity();
            if (mo49getActivity3 != null && (window2 = mo49getActivity3.getWindow()) != null && (attributes = window2.getAttributes()) != null) {
                num = Integer.valueOf(attributes.softInputMode);
            }
            this.LJLZ = num;
            ActivityC45651qj mo49getActivity4 = mo49getActivity();
            if (mo49getActivity4 != null && (window = mo49getActivity4.getWindow()) != null) {
                window.setSoftInputMode(48);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x030c  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 1514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.stickercreation.fragment.VideoCreationTailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Object obj;
        int i;
        Intent intent;
        Bundle LLJJIJI;
        o.LJIIIZ(inflater, "inflater");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        C29S c29s = null;
        if (mo49getActivity != null && (intent = mo49getActivity.getIntent()) != null && (LLJJIJI = C16880lQ.LLJJIJI(intent)) != null) {
            obj = C16880lQ.LLJJIII(LLJJIJI, "page_type");
        } else {
            obj = null;
        }
        if (o.LJ(obj, "complete_video_sticker_page")) {
            i = R.layout.b1r;
        } else {
            i = R.layout.b1q;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater.cloneInContext(new ContextThemeWrapper(mo49getActivity(), R.style.uw)), i, viewGroup, false);
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 instanceof C29S) {
                    c29s = (C29S) mo49getActivity2;
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
