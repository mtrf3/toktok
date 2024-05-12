package com.ss.android.ugc.aweme.friendstab.service;

import X.C35585Dxt;
import X.InterfaceC53995LHb;
import X.InterfaceC54017LHx;
import X.LHX;
import X.LIV;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Set;

/* loaded from: classes10.dex */
public interface ISocial2TabRedDotService {
    C35585Dxt getRedDotMetadataBeforeEnteringTab();

    String getRedDotRequestId();

    LIV getSocialTabNoticeData();

    int numberCountByTag(String str);

    void onAwemeRead(int i, Aweme aweme);

    Set<String> originalNumberDotList();

    LHX redDotAsListener();

    InterfaceC54017LHx redDotInterface();

    InterfaceC53995LHb redDotLogic();

    void visitSocial2Tab(String str);
}
