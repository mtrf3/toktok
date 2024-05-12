package com.ss.android.ugc.aweme.live.livehostimpl;

import X.BOV;
import X.C15380j0;
import X.C35971E9v;
import X.C62895OmJ;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdkapi.host.IHostPersonalized;
import com.zhiliaoapp.musically.R;
import yq4.a;

/* loaded from: classes11.dex */
public final class LiveHostPersonalized implements IHostPersonalized {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPersonalized
    public final boolean Mi0() {
        return C35971E9v.LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPersonalized
    public final LiveData<Boolean> ag0() {
        return a.LJFF().LJFF();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPersonalized
    public final String qY(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return C15380j0.LJIILJJIL(R.string.itr);
                    }
                    return C15380j0.LJIILJJIL(R.string.itq);
                }
                return C15380j0.LJIILJJIL(R.string.p4i);
            }
            return C15380j0.LJIILJJIL(R.string.itt);
        }
        return C15380j0.LJIILJJIL(R.string.its);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPersonalized
    public final Fragment bc0(boolean z, BOV bov) {
        return a.LJFF().LJIILJJIL(z, new C62895OmJ(bov));
    }
}
