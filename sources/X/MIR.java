package X;

import Y.ACallableS36S1100000_9;
import Y.ACallableS45S0201000_9;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MIR extends C8BS<NewFaceStickerListBean> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ MIV LJLILLLLZI;

    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length == 2) {
            return true;
        }
        return false;
    }

    @Override // X.C8BS
    public final void handleData(NewFaceStickerListBean newFaceStickerListBean) {
        NewFaceStickerListBean newFaceStickerListBean2 = newFaceStickerListBean;
        super.handleData(newFaceStickerListBean2);
        MIQ.LIZ(true);
        MIV miv = this.LJLILLLLZI;
        if (miv.LJLJL && newFaceStickerListBean2 != null) {
            String key = miv.LJLJLJ;
            if (this.LJLIL) {
                key = key + 1;
            }
            o.LJIIIZ(key, "key");
            if (C52945KqD.LIZ()) {
                MIQ.LIZIZ.LIZJ(key, new MIS(newFaceStickerListBean2, System.currentTimeMillis() + MIQ.LIZ));
            }
        }
        this.LJLILLLLZI.LJLJL = false;
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        MIV miv = this.LJLILLLLZI;
        WeakHandler weakHandler = this.mHandler;
        String str = (String) objArr[0];
        ((Integer) objArr[1]).intValue();
        boolean z = this.LJLIL;
        miv.getClass();
        if (!AV1.LJIIJJI()) {
            MIQ.LIZIZ(true);
            miv.LJLJLJ = str;
            FRW.LIZ("sd_start_activity_to_request_net_duration");
            if (C52945KqD.LIZ()) {
                String key = miv.LJLJLJ;
                if (z) {
                    key = KMP.LJ(key, 1);
                }
                o.LJIIIZ(key, "key");
                try {
                    MIS LIZIZ = MIQ.LIZIZ.LIZIZ(key);
                    if (LIZIZ != null && LIZIZ.LIZIZ >= System.currentTimeMillis()) {
                        AVExternalServiceImpl.LIZ().provideAVPerformance().step("tool_performance_prop_detail_shoot_same", "Hit Cache");
                        NewFaceStickerListBean newFaceStickerListBean = LIZIZ.LIZ;
                        if (newFaceStickerListBean != null) {
                            Message obtainMessage = weakHandler.obtainMessage(0);
                            obtainMessage.obj = newFaceStickerListBean;
                            obtainMessage.sendToTarget();
                            miv.LJLJL = false;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            miv.LJLJL = true;
            if (z) {
                FGR.LIZIZ().LIZ(weakHandler, new ACallableS36S1100000_9(miv, str, 1), 0);
            } else {
                FGR.LIZIZ().LIZ(weakHandler, new ACallableS45S0201000_9(1, miv, str, 0), 0);
            }
        }
        return true;
    }

    public MIR(MIV miv, boolean z) {
        this.LJLILLLLZI = miv;
        this.LJLIL = z;
    }
}
