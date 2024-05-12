package com.bytedance.android.livesdk.feed.viewmodel;

import X.BMB;
import X.BME;
import X.BMM;
import X.BMN;
import X.C08680Vs;
import X.C73969T1h;
import X.InterfaceC28629BLl;
import Y.AfS17S0001000_5;
import Y.AfS35S0101000_3;
import Y.AfS36S0101000_5;
import Y.AfS37S0000000_5;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository;
import com.bytedance.android.livesdk.model.FeedItem;
import java.util.List;

/* loaded from: classes6.dex */
public class BaseFeedDataViewModel extends PagingViewModel<FeedItem> {
    public final BMM LJLZ;
    public final MutableLiveData<Integer> LJZ = new MutableLiveData<>();
    public final MutableLiveData<List<ImageModel>> LJZI = new MutableLiveData<>();
    public final MutableLiveData<BMB> LJZL = new MutableLiveData<>();
    public final MutableLiveData<BMB> LL = new MutableLiveData<>();
    public String LLD;
    public final int LLF;
    public final int LLFF;
    public String LLFFF;
    public FeedDataKey LLFII;
    public final long LLFZ;

    public void kv0() {
    }

    public FeedDataKey iv0() {
        return FeedDataKey.LIZ(this.LLFZ, this.LLFFF, jv0());
    }

    public void start() {
        try {
            hv0(this.LJLZ.lq0(jv0()));
            this.LJLIL.LIZ(this.LJLZ.lG().LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0101000_5(0, this, 49), new AfS17S0001000_5(1, 2)));
            InterfaceC28629BLl interfaceC28629BLl = this.LJLZ;
            if (interfaceC28629BLl instanceof BaseFeedRepository) {
                this.LJLIL.LIZ(((BaseFeedRepository) interfaceC28629BLl).LJLILLLLZI.LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0101000_5(0, this, 50), new AfS37S0000000_5(12)));
                this.LJLIL.LIZ(((BaseFeedRepository) this.LJLZ).LJLJI.LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS35S0101000_3(0, this, 2), new AfS37S0000000_5(12)));
            }
            kv0();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.android.live.core.paging.viewmodel.PagingViewModel
    public final boolean gv0() {
        boolean gv0 = super.gv0();
        if (gv0) {
            this.LJZ.setValue(0);
            C08680Vs.LJIILJJIL.LJIIIZ();
        }
        return gv0;
    }

    public String jv0() {
        return this.LLD;
    }

    public BaseFeedDataViewModel(BMM bmm, BMN bmn) {
        this.LJLZ = bmm;
        if (bmn != null) {
            this.LLD = bmn.url();
            bmn.i7();
            this.LLF = 10;
            this.LLFF = bmn.Ef();
            this.LLFFF = bmn.D8();
            bmn.Yj();
            this.LLFZ = 0L;
            bmm.ZG(new BME(this));
        }
    }
}
