package com.ss.ugc.android.editor.components.base.texteditor;

import X.ActivityC45651qj;
import X.XRU;
import X.XRV;
import X.XRW;
import com.bytedance.news.common.service.manager.IService;
import com.ss.ugc.android.editor.components.base.texteditor.bean.FontData;

/* loaded from: classes16.dex */
public interface IDTStyleTextEditor extends IService {
    /* synthetic */ void hide();

    <V extends XRW> void init(ActivityC45651qj activityC45651qj, V v, XRV xrv);

    /* synthetic */ void show();

    void show(String str, int i, FontData fontData, XRU xru);
}
