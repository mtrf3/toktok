package com.ss.android.ugc.aweme.challenge.ui;

import X.ProgressDialogC43241Gy5;
import X.T6Y;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.detail.AbstractDetailFragment;
import java.util.List;

/* loaded from: classes13.dex */
public abstract class BaseDetailFragment extends AbstractDetailFragment implements WeakHandler.IHandler {
    public List<Integer> mFragmentTypes;
    public ProgressDialogC43241Gy5 mLoadingDialog;
    public WeakHandler mWeakHandler = new WeakHandler(this);

    public String getLabel() {
        return "";
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public void onPreVideoRecord(Intent intent) {
    }

    private void dismissProgressDialog() {
        ProgressDialogC43241Gy5 progressDialogC43241Gy5 = this.mLoadingDialog;
        if (progressDialogC43241Gy5 != null && progressDialogC43241Gy5.isShowing()) {
            this.mLoadingDialog.dismiss();
        }
        this.mLoadingDialog = null;
    }

    public void hideStartRecord() {
        T6Y t6y = this.mAnimator;
        if (t6y != null) {
            t6y.LIZ();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        dismissProgressDialog();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.mWeakHandler.removeCallbacksAndMessages(null);
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
