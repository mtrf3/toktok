package com.ss.android.ugc.aweme.im.sdk.share.sendto;

import X.C113154cJ;
import X.C47261Igj;
import X.EnumC113164cK;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.List;

/* loaded from: classes2.dex */
public final class SendToViewModel extends ViewModel {
    public C113154cJ LJLIL;
    public final MutableLiveData<EnumC113164cK> LJLILLLLZI;
    public final MutableLiveData LJLJI;
    public String LJLJJI;
    public final List<Integer> LJLJJL;

    public SendToViewModel() {
        MutableLiveData<EnumC113164cK> mutableLiveData = new MutableLiveData<>();
        this.LJLILLLLZI = mutableLiveData;
        this.LJLJI = mutableLiveData;
        this.LJLJJL = C47261Igj.LJJIJIIJI(1801, 1802, 1804, 1803, 1805);
    }
}
