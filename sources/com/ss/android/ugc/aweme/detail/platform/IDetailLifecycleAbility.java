package com.ss.android.ugc.aweme.detail.platform;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import kotlin.jvm.internal.AqS159S0100000_9;

/* loaded from: classes10.dex */
public interface IDetailLifecycleAbility extends IDetailBaseAbility {
    boolean oZ(AqS159S0100000_9 aqS159S0100000_9);

    void onAttach(Activity activity);

    View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    void onDestroy();

    void onDestroyView();

    void onPause();

    void onResume();

    void onViewCreated(View view, Bundle bundle);

    void setUserVisibleHint(boolean z);
}
