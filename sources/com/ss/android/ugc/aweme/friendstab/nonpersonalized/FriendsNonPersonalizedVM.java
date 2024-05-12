package com.ss.android.ugc.aweme.friendstab.nonpersonalized;

import X.C35644Dyq;
import X.C35971E9v;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl;

/* loaded from: classes7.dex */
public final class FriendsNonPersonalizedVM extends AssemViewModel<C35644Dyq> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C35644Dyq defaultState() {
        boolean booleanValue;
        if (!C35971E9v.LIZ()) {
            booleanValue = false;
        } else {
            Boolean bool = (Boolean) ComplianceBusinessServiceImpl.LJJJJIZL().LJFF().getValue();
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            booleanValue = bool.booleanValue();
        }
        return new C35644Dyq(Boolean.valueOf(booleanValue));
    }
}
