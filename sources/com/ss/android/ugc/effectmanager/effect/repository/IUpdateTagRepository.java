package com.ss.android.ugc.effectmanager.effect.repository;

import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;

/* loaded from: classes16.dex */
public interface IUpdateTagRepository {
    String isTagUpdated(String str, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener);

    String updateTag(String str, String str2, IUpdateTagListener iUpdateTagListener);
}
