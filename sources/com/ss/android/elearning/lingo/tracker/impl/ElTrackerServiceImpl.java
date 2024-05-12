package com.ss.android.elearning.lingo.tracker.impl;

import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.elearning.lingo.tracker.ElTrackerService;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ElTrackerServiceImpl implements ElTrackerService {
    @Override // com.ss.android.elearning.lingo.tracker.ElTrackerService
    public final void LIZ(String str, JSONObject jSONObject) {
        AppLogNewUtils.onEventV3(str, jSONObject);
    }
}
