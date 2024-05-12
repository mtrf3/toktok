package com.ss.ugc.android.editor.components.base.api;

import X.ActivityC45651qj;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes3.dex */
public interface IVideoCoverService extends IService {
    void editCoverImage(ActivityC45651qj activityC45651qj, String str, boolean z);

    void startVideoCoverActivity(NLEEditor nLEEditor, ActivityC45651qj activityC45651qj, String str);
}
