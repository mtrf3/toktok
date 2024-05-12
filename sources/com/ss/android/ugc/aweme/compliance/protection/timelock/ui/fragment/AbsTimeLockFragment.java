package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.fragment;

import X.C16880lQ;
import X.SY4;
import X.T5T;
import X.ViewOnFocusChangeListenerC76933UHh;
import Y.ACListenerS33S0100000_13;
import Y.ARunnableS49S0100000_13;
import Y.IDObjectS184S0100000_13;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public abstract class AbsTimeLockFragment extends AmeBaseFragment {
    public T5T LJLIL;
    public SY4 LJLILLLLZI;

    public abstract void vl(String str);

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        T5T t5t = (T5T) view.findViewById(R.id.cpz);
        this.LJLIL = t5t;
        t5t.setTextSize(36.0f);
        T5T t5t2 = this.LJLIL;
        t5t2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC76933UHh(this, t5t2, t5t2.getOnFocusChangeListener()));
        t5t2.post(new ARunnableS49S0100000_13(t5t2, 129));
        SY4 sy4 = (SY4) view.findViewById(R.id.gq9);
        this.LJLILLLLZI = sy4;
        sy4.setVisibility(0);
        this.LJLILLLLZI.setAlpha(0.5f);
        C16880lQ.LJJIZ(this.LJLILLLLZI, new ACListenerS33S0100000_13(this, 100));
        this.LJLIL.addTextChangedListener(new IDObjectS184S0100000_13(this, 1));
    }
}
