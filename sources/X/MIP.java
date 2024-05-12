package X;

import Y.ACallableS0S1101100_9;
import Y.ARunnableS14S0101000_10;
import android.os.Handler;
import android.os.Message;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.experiment.EffectDetailVideoListExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.prop.api.StickerPropApi;
import com.ss.android.ugc.aweme.prop.model.StickerPropAwemeList;
import com.ss.android.ugc.aweme.services.RetrofitService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MIP extends AbstractC51036K1g<Aweme, StickerPropAwemeList> {
    public static int LJLJLJ;
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final StickerPropApi LJLJI = (StickerPropApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(StickerPropApi.class);
    public long LJLJJI = -1;
    public String LJLJJL = "";
    public int LJLJJLL = -1;
    public boolean LJLJL = false;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        T t = this.mData;
        if (t == 0) {
            return null;
        }
        return ((StickerPropAwemeList) t).items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isDataEmpty() {
        T t = this.mData;
        if ((t != 0 && ((StickerPropAwemeList) t).hasMore == 1) || !C79004UzY.LJJIFFI(getItems())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t == 0 || ((StickerPropAwemeList) t).hasMore != 1) {
            return false;
        }
        return true;
    }

    public MIP() {
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length >= 3) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC51036K1g
    public final boolean deleteItem(Aweme aweme) {
        return C78996UzQ.LJIIIIZZ(getItems(), aweme, this.mNotifyListeners);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.ss.android.ugc.aweme.prop.model.StickerPropAwemeList, T] */
    @Override // X.C8BS
    public final void handleData(Object obj) {
        boolean z;
        ?? r9 = (StickerPropAwemeList) obj;
        AVExternalServiceImpl.LIZ().provideAVPerformance().step("tool_performance_effect_shoot_same", "Grid Videos API Response");
        int i = 0;
        if (this.LJLJJI == 0) {
            MIQ.LIZ(false);
        }
        if (this.LJLJL && this.LJLJJI == 0 && r9 != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLIL);
            LIZ.append(this.LJLJJL);
            LIZ.append(this.LJLJJI);
            LIZ.append(this.LJLJJLL);
            String key = X1D.LIZIZ(LIZ);
            o.LJIIIZ(key, "key");
            MIQ.LIZJ.LIZJ(key, new MIT(r9, System.currentTimeMillis() + MIQ.LIZ));
        }
        this.LJLJL = false;
        if (r9 != 0 && (!C79004UzY.LJJIFFI(r9.items) || r9.hasMore == 1)) {
            z = false;
        } else {
            z = true;
        }
        this.mIsNewDataEmpty = z;
        if (!z) {
            List<Aweme> list = r9.items;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Aweme R1 = AwemeService.LIZ().R1((Aweme) ListProtector.get(r9.items, i2));
                    R1.setIsTop(((Aweme) ListProtector.get(r9.items, i2)).getIsTop());
                    IRequestIdService LJ = RequestIdService.LJ();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(R1.getAid());
                    LIZ2.append(this.LJLIL + 10000);
                    LJ.LIZJ(i2, X1D.LIZIZ(LIZ2), r9.requestId);
                    ListProtector.set(r9.items, i2, R1);
                    LogPbBean logPbBean = r9.logPb;
                    if (logPbBean != null) {
                        C3A5.LIZ.LJFF(r9.requestId, logPbBean);
                    }
                }
                C7HV.LIZIZ.LIZJ(r9.items, C7KB.OTHERS);
            }
            int i3 = this.mListQueryType;
            if (i3 != 1) {
                if (i3 == 4) {
                    if (r9.items != null) {
                        if (C79004UzY.LJJIFFI(((StickerPropAwemeList) this.mData).items)) {
                            ((StickerPropAwemeList) this.mData).items = r9.items;
                        } else {
                            C56544MHc.LIZ(((StickerPropAwemeList) this.mData).items, r9.items, new G5T(i));
                        }
                    }
                    StickerPropAwemeList stickerPropAwemeList = (StickerPropAwemeList) this.mData;
                    stickerPropAwemeList.cursor = r9.cursor;
                    stickerPropAwemeList.hasMore = r9.hasMore & stickerPropAwemeList.hasMore;
                }
            } else {
                this.mData = r9;
            }
        } else {
            T t = this.mData;
            if (t != 0) {
                ((StickerPropAwemeList) t).hasMore = 0;
            }
        }
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS14S0101000_10(5, this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... objArr) {
        long j;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((StickerPropAwemeList) this.mData).cursor;
        }
        LJIIIZ(20, ((Integer) objArr[2]).intValue(), j, str);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... objArr) {
        C62822Ol8 c62822Ol8 = EffectDetailVideoListExperiment.LIZIZ;
        if (((EffectDetailVideoListExperiment.EffectDetailVideoListExperimentConfig) c62822Ol8.getValue()).on) {
            LJIIIZ(((EffectDetailVideoListExperiment.EffectDetailVideoListExperimentConfig) c62822Ol8.getValue()).count, ((Integer) objArr[2]).intValue(), 0L, (String) objArr[1]);
        } else {
            LJIIIZ(20, ((Integer) objArr[2]).intValue(), 0L, (String) objArr[1]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.prop.model.StickerPropAwemeList, T] */
    @Override // X.AbstractC51036K1g
    public final void setItems(List<Aweme> list) {
        if (this.mData == 0) {
            this.mData = new StickerPropAwemeList();
        }
        T t = this.mData;
        ((StickerPropAwemeList) t).hasMore = 1;
        ((StickerPropAwemeList) t).items = list;
    }

    public MIP(String str, int i) {
        this.LJLILLLLZI = str;
        this.LJLIL = i;
    }

    public final void LJIIIZ(int i, int i2, long j, String str) {
        if (AV1.LJIIJJI()) {
            return;
        }
        if (j == 0) {
            MIQ.LIZIZ(false);
        }
        this.LJLJJL = str;
        this.LJLJJI = j;
        this.LJLJJLL = i;
        if (C52945KqD.LIZ() && j == 0) {
            StringBuilder LIZ = X1D.LIZ();
            V10.LJFF(LIZ, this.LJLIL, str, j);
            LIZ.append(i);
            String key = X1D.LIZIZ(LIZ);
            o.LJIIIZ(key, "key");
            try {
                MIT LIZIZ = MIQ.LIZJ.LIZIZ(key);
                if (LIZIZ != null && LIZIZ.LIZIZ >= System.currentTimeMillis()) {
                    AVExternalServiceImpl.LIZ().provideAVPerformance().step("tool_performance_prop_list_shoot_same", "Hit Cache");
                    StickerPropAwemeList stickerPropAwemeList = LIZIZ.LIZ;
                    if (stickerPropAwemeList != null) {
                        this.LJLJL = false;
                        Message obtainMessage = this.mHandler.obtainMessage(0);
                        obtainMessage.obj = stickerPropAwemeList;
                        obtainMessage.sendToTarget();
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS0S1101100_9(this, str, j, i, 2), 0);
    }
}
