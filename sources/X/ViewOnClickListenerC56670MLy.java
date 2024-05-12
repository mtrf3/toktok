package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.homepage.api.data.InboxFollowGuideViewModel;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.jvm.internal.o;

/* renamed from: X.MLy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC56670MLy implements View.OnClickListener {
    public final /* synthetic */ C56671MLz LJLIL;
    public final /* synthetic */ Fragment LJLILLLLZI;

    public ViewOnClickListenerC56670MLy(C56671MLz c56671MLz, Fragment fragment) {
        this.LJLIL = c56671MLz;
        this.LJLILLLLZI = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        HomeTabAbility homeTabAbility;
        MutableLiveData<Boolean> mutableLiveData;
        MainActivityScope LJJLIIIJJI;
        this.LJLIL.LJZI = false;
        ActivityC45651qj mo49getActivity = this.LJLILLLLZI.mo49getActivity();
        String str = null;
        if (mo49getActivity != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(mo49getActivity)) != null) {
            homeTabAbility = C87277YNd.LJIL(LJJLIIIJJI);
            if (homeTabAbility != null) {
                str = homeTabAbility.QW();
            }
        } else {
            homeTabAbility = null;
        }
        if (o.LJ(str, "Following")) {
            InboxFollowGuideViewModel inboxFollowGuideViewModel = this.LJLIL.LJZ;
            if (inboxFollowGuideViewModel != null && (mutableLiveData = inboxFollowGuideViewModel.LJLJI) != null) {
                mutableLiveData.setValue(Boolean.TRUE);
            }
            if (homeTabAbility != null) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("isSmoothScroll", true);
                homeTabAbility.lZ(bundle, "Following");
            }
        } else if (homeTabAbility != null) {
            homeTabAbility.b3(new C56669MLx(homeTabAbility, this.LJLIL));
            homeTabAbility.na(new MM1(homeTabAbility, this.LJLIL));
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("isSmoothScroll", true);
            homeTabAbility.lZ(bundle2, "For You");
        }
        this.LJLIL.P().pv0(this.LJLIL.N());
        this.LJLIL.getClass();
        C56671MLz.g0();
        this.LJLIL.c0("view");
    }
}
