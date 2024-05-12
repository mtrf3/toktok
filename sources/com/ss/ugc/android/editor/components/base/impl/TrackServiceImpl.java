package com.ss.ugc.android.editor.components.base.impl;

import X.C1284452i;
import X.C51E;
import com.ss.ugc.android.editor.components.base.api.ITrackService;

/* loaded from: classes3.dex */
public final class TrackServiceImpl implements ITrackService {
    public C51E trackPanelApiComponent;

    @Override // com.ss.ugc.android.editor.components.base.api.ITrackService
    public void onDestroy() {
        this.trackPanelApiComponent = null;
    }

    @Override // com.ss.ugc.android.editor.components.base.api.ITrackService
    public C1284452i getMultiTrackController() {
        C51E c51e = this.trackPanelApiComponent;
        if (c51e != null) {
            return c51e.getMultiTrackController();
        }
        return null;
    }

    @Override // com.ss.ugc.android.editor.components.base.api.ITrackService
    public void init(C51E c51e) {
        this.trackPanelApiComponent = c51e;
    }
}
