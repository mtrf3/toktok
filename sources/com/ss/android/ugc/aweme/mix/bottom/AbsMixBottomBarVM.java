package com.ss.android.ugc.aweme.mix.bottom;

import X.C229678zr;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes4.dex */
public abstract class AbsMixBottomBarVM extends AssemViewModel<C229678zr> {
    public abstract boolean gv0(String str, String str2);

    public abstract void hv0(Context context, Aweme aweme, String str, boolean z);

    public abstract void iv0(Aweme aweme);

    public abstract void jv0(Context context);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C229678zr defaultState() {
        return new C229678zr(0);
    }
}
