package com.ss.ugc.android.editor.components.base.api;

import X.C52T;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes3.dex */
public interface IConsoleBarService extends IService {
    C52T getConsoleBar();

    void init(C52T c52t);

    void onDestroy();
}
