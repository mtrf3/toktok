package com.ss.ugc.android.editor.components.base.api;

import X.ActivityC45651qj;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes3.dex */
public interface ITemplateService extends IService {
    void boostTemplateInfoFragment(ActivityC45651qj activityC45651qj, int i);

    /* synthetic */ void boostTemplateSettingFragment(ActivityC45651qj activityC45651qj);

    void enableTemplateSettingTipDialog(ActivityC45651qj activityC45651qj, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2);

    String getTemplateId(ActivityC45651qj activityC45651qj);

    void initTemplate(ActivityC45651qj activityC45651qj, int i);

    boolean isEnteredTemplateSetting(ActivityC45651qj activityC45651qj);

    void startTemplateActivity(ActivityC45651qj activityC45651qj, NLEEditor nLEEditor);
}
