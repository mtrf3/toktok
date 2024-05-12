package com.bytedance.ies.ugc.aweme.commercialize.scene.api.main;

import X.InterfaceC48872JGa;
import X.JGV;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes10.dex */
public interface IMainAdScene extends InterfaceC48872JGa {
    @Override // X.InterfaceC48872JGa
    /* synthetic */ void init(JGV jgv);

    void onCreate();

    void onDestroy();

    void onPause();

    void onResume();

    void onVideoPageChangeEvent(Aweme aweme, boolean z);
}
