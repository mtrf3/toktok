package com.ss.android.ugc.aweme.service;

import X.C56475MEl;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;

/* loaded from: classes4.dex */
public interface INowUserPublishService {
    void LIZ(LifecycleOwner lifecycleOwner, C56475MEl c56475MEl);

    int LIZIZ(Collection<? extends Aweme> collection, InterfaceC88472Yns<? super Aweme, Boolean> interfaceC88472Yns);

    void LIZJ(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns);

    void LIZLLL(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns);

    void LJ(Aweme aweme, Aweme aweme2);

    void LJFF(Aweme aweme, String str);
}
