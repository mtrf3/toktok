package com.ss.android.ugc.aweme.services.specialplus;

import android.content.Context;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes10.dex */
public interface ISpecialPlusService {
    String getEffectId();

    String getEffectVideoPlusEffectId();

    String getEffectVideoPlusTab();

    String getIconType();

    int getMaxTransformationsLimit();

    long getQuickPromoPlusDebutTime();

    String getResourceType();

    List<String> getSpecialPlusEffectList();

    String getSpecialPlusTips();

    HashMap<String, Integer> getTransformationsCountMap(String str);

    int getTransformationsLimitPerEffect();

    void initCallBack();

    boolean isEffectVideoPlusEnabled();

    boolean isEffectVideoPlusShowed();

    boolean isEffectVideoPlusUnlimitedTransformations();

    boolean isNeedShowSpecialPlusDirect();

    boolean isQuickPromoPlusEnabled();

    boolean isTransformationLimitHit(String str, String str2);

    void preDownloadSuperEntranceRes(Context context);

    void setEffectVideoPlusEffectId(String str);

    void setEffectVideoPlusShowed(boolean z);

    void setEffectVideoPlusTab(String str);

    void setLastTransformationDate(long j);

    void setQuickPromoPlusDebutTime(long j);

    void setSpecialPlusClicked();

    void setSpecialPlusShowed();

    void setSpecialPlusState(boolean z);

    void setTransformationsCountMap(HashMap<String, Integer> hashMap, String str);

    boolean shouldResetTransformationsMap();

    boolean shouldShowSpecialPlus();
}
