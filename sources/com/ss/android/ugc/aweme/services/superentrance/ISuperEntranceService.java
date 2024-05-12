package com.ss.android.ugc.aweme.services.superentrance;

import android.content.Context;
import java.util.List;

/* loaded from: classes5.dex */
public interface ISuperEntranceService {
    List<String> getSuperEntranceEffectList();

    boolean isNeedShowSuperEntranceTabDirect();

    boolean isSuperEntranceResReady();

    void preDownloadSuperEntranceRes(Context context);

    void setShowedSuperEntranceTab();

    void setSuperEntranceRecordClicked(Context context, boolean z);

    boolean shouldShowSuperEntranceRecord(Context context);

    boolean shouldStartSuperEntrance(Context context);
}
