package com.ss.android.ugc.aweme.player.sdk.api;

import X.C47191Ifb;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public interface IPortraitService {
    public static final C47191Ifb LIZ = new C47191Ifb();

    void addGroupConfig(String str, List<String> list);

    Map<String, String> getGroupPortraits(String str);

    String getPortrait(String str);
}
