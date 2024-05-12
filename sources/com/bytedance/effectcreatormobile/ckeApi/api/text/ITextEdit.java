package com.bytedance.effectcreatormobile.ckeapi.api.text;

import X.C93490aRi;
import X.EnumC93888aY8;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes34.dex */
public interface ITextEdit extends IService {
    public static final C93490aRi Companion = C93490aRi.LIZ;

    LiveData<EnumC93888aY8> getPageState();

    void openTextEditor(Activity activity, int i, TextModel textModel);

    void openTextEditor(Fragment fragment, int i, TextModel textModel);
}
