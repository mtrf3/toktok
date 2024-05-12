package com.bytedance.android.livesdk.postrechargeretention;

import X.C06070Lr;
import X.C32753CtJ;
import X.C32855Cux;
import X.C76854UEg;
import X.CN1;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPostRechargeRetentionSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.IDqS430S0100000_5;

/* loaded from: classes6.dex */
public final class PostRechargeRetentionViewModel extends ViewModel {
    public DataChannel LJLIL;
    public final int LJLILLLLZI;
    public String LJLJI;
    public boolean LJLJJI;
    public Gift LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public boolean LJLJLJ;
    public C32855Cux LJLJLLL;
    public long LJLL;
    public long LJLLI;
    public int LJLLILLLL;
    public C32753CtJ LJLLJ;
    public long LJLLL;
    public String LJLLLL;
    public User LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public final NextLiveData<Boolean> LJZI;
    public final NextLiveData LJZL;
    public final Keva LL;
    public final long LLD;
    public final long LLF;

    public final C76854UEg gv0() {
        long j;
        int i;
        Gift gift;
        Gift gift2;
        String str = this.LJLJI;
        int i2 = this.LJLLILLLL;
        C32855Cux c32855Cux = this.LJLJLLL;
        long j2 = 0;
        if (c32855Cux != null) {
            j = c32855Cux.LIZJ;
        } else {
            j = 0;
        }
        if (c32855Cux != null && (gift2 = c32855Cux.LIZ) != null) {
            j2 = gift2.id;
        }
        if (c32855Cux != null && (gift = c32855Cux.LIZ) != null) {
            i = gift.diamondCount;
        } else {
            i = 0;
        }
        return new C76854UEg(str, i2, j, j2, i, new IDqS430S0100000_5(this, 1));
    }

    public final void iv0() {
        Gift gift = this.LJLJJL;
        if (gift != null) {
            this.LJLJLLL = new C32855Cux(gift, this.LJLJJLL, gift.diamondCount - this.LJLLI);
            this.LJZI.setValue(Boolean.TRUE);
        }
    }

    public PostRechargeRetentionViewModel() {
        LiveGiftPostRechargeRetentionSetting liveGiftPostRechargeRetentionSetting = LiveGiftPostRechargeRetentionSetting.INSTANCE;
        this.LJLILLLLZI = liveGiftPostRechargeRetentionSetting.getRetentionType();
        this.LJLJI = "";
        this.LJLJJLL = -1L;
        NextLiveData<Boolean> nextLiveData = new NextLiveData<>(Boolean.FALSE);
        this.LJZI = nextLiveData;
        this.LJZL = nextLiveData;
        this.LL = Keva.getRepo("post_recharge_retention");
        this.LLD = liveGiftPostRechargeRetentionSetting.getMaxSheetCloseCount();
        this.LLF = liveGiftPostRechargeRetentionSetting.getPopupCooldown();
    }

    public final void hv0(long j, String str, Long l) {
        String str2 = str;
        this.LJLJJI = true;
        IGiftService iGiftService = (IGiftService) CN1.LIZ(IGiftService.class);
        if (str2 == null) {
            str2 = this.LJLLLL;
        }
        iGiftService.openGiftDialog("gift", new C06070Lr(str2, l, Long.valueOf(j), Boolean.valueOf(this.LJLZ), Boolean.valueOf(this.LJZ), this.LJLLLLLL));
    }
}
