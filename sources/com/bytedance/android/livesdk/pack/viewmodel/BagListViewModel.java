package com.bytedance.android.livesdk.pack.viewmodel;

import X.AbstractC32698CsQ;
import X.AbstractC73672Svk;
import X.B83;
import X.C0MT;
import X.C0NB;
import X.C15380j0;
import X.C1FJ;
import X.C221108m2;
import X.C28467BFf;
import X.C29374Bfu;
import X.C30896CAq;
import X.C32658Crm;
import X.C32661Crp;
import X.C32697CsP;
import X.C32726Css;
import X.C32755CtL;
import X.C32762CtS;
import X.C61878OQg;
import X.C62822Ol8;
import X.C65814PsI;
import X.C73318Sq2;
import X.C73969T1h;
import X.C78999UzT;
import X.EnumC32734Ct0;
import X.T16;
import X.X1D;
import Y.AObserverS73S0100000_5;
import Y.ARunnableS41S0100000_5;
import Y.AfS4S0100100_5;
import android.os.Handler;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.pack.api.PackRetrofitApi;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import webcast.api.bag.BagItemListResponse;

/* loaded from: classes6.dex */
public final class BagListViewModel extends ViewModel {
    public DataChannel LJLIL;
    public final MutableLiveData<List<AbstractC32698CsQ<? extends C30896CAq>>> LJLILLLLZI;
    public final MutableLiveData<AbstractC32698CsQ<? extends C30896CAq>> LJLJI;
    public final MutableLiveData<AbstractC32698CsQ<? extends C30896CAq>> LJLJJI;
    public final C73318Sq2 LJLJJL;
    public final MutableLiveData<EnumC32734Ct0> LJLJJLL;
    public final MutableLiveData<Boolean> LJLJL;
    public final MutableLiveData<Boolean> LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final ARunnableS41S0100000_5 LJLL;

    public final Handler kv0() {
        return (Handler) this.LJLJLLL.getValue();
    }

    public BagListViewModel() {
        MutableLiveData<List<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData = new MutableLiveData<>();
        this.LJLILLLLZI = mutableLiveData;
        this.LJLJI = new MutableLiveData<>();
        this.LJLJJI = new MutableLiveData<>();
        this.LJLJJL = new C73318Sq2();
        MutableLiveData<EnumC32734Ct0> mutableLiveData2 = new MutableLiveData<>();
        this.LJLJJLL = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.LJLJL = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        this.LJLJLJ = mutableLiveData4;
        this.LJLJLLL = C221108m2.LIZIZ(C32762CtS.INSTANCE);
        mutableLiveData4.setValue(Boolean.valueOf(C32658Crm.LIZJ()));
        mutableLiveData2.setValue(EnumC32734Ct0.LOADING);
        mutableLiveData.setValue(C61878OQg.INSTANCE);
        mutableLiveData3.observeForever(new AObserverS73S0100000_5(this, 30));
        this.LJLL = new ARunnableS41S0100000_5(this, 170);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        kv0().removeCallbacks(this.LJLL);
        this.LJLJL.setValue(Boolean.FALSE);
        this.LJLJI.setValue(null);
        this.LJLJJI.setValue(null);
        this.LJLILLLLZI.setValue(C61878OQg.INSTANCE);
        this.LJLJJLL.setValue(EnumC32734Ct0.LOADING);
        this.LJLJJL.LIZLLL();
    }

    public static String gv0(long[] jArr) {
        String LJIILL;
        String LJIILL2;
        if (jArr.length != 4) {
            return "";
        }
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        if (j > 0) {
            if (j3 > 0) {
                j2++;
            }
            long j5 = 24;
            long j6 = (j2 / j5) + j;
            long j7 = j2 % j5;
            if (j7 != 0) {
                LJIILL2 = C15380j0.LJIILL(R.string.kej, Long.valueOf(j6), Long.valueOf(j7));
            } else {
                LJIILL2 = C15380j0.LJIILL(R.string.kek, Long.valueOf(j6));
            }
            o.LJIIIIZZ(LJIILL2, "{\n                if (mi…wn_2, days)\n            }");
            return LJIILL2;
        }
        if (j2 > 0) {
            if (j4 > 0) {
                j3++;
            }
            long j8 = 60;
            long j9 = (j3 / j8) + j2;
            long j10 = j3 % j8;
            if (j10 != 0) {
                LJIILL = C15380j0.LJIILL(R.string.kel, Long.valueOf(j9), Long.valueOf(j10));
            } else {
                LJIILL = C15380j0.LJIILL(R.string.kem, Long.valueOf(j9));
            }
            o.LJIIIIZZ(LJIILL, "{\n                if (se…n_4, hours)\n            }");
            return LJIILL;
        }
        if (j3 < 0) {
            return "";
        }
        if (j4 > 0) {
            j3++;
        }
        String LJIILL3 = C15380j0.LJIILL(R.string.ken, Long.valueOf(j3));
        o.LJIIIIZZ(LJIILL3, "{\n                if (se…6, minutes)\n            }");
        return LJIILL3;
    }

    public static long[] jv0(long j, Long l) {
        if (l == null) {
            C0NB.LJ("BagListViewModel", "Expire time is null");
            return new long[]{0, 0, 0, 0};
        }
        long longValue = l.longValue() - j;
        if (longValue > 0) {
            return new long[]{longValue / 86400000, (longValue % 86400000) / 3600000, (longValue % 3600000) / 60000, (longValue % 60000) / 1000};
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("expire time ");
        LIZ.append(l);
        LIZ.append(" ahead of current time ");
        LIZ.append(j);
        C0NB.LJ("BagListViewModel", X1D.LIZIZ(LIZ));
        return new long[]{0, 0, 0, 0};
    }

    public final void lv0(C32726Css c32726Css, boolean z) {
        C32697CsP c32697CsP;
        List<AbstractC32698CsQ<? extends C30896CAq>> value = this.LJLILLLLZI.getValue();
        LinkedList linkedList = new LinkedList();
        if (value != null) {
            for (AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ : value) {
                if ((abstractC32698CsQ instanceof C32726Css) && abstractC32698CsQ != null && (c32697CsP = (C32697CsP) abstractC32698CsQ.LIZIZ) != null) {
                    if (c32726Css.LJIILIIL((C32726Css) abstractC32698CsQ)) {
                        c32697CsP = C32697CsP.LIZ(c32697CsP, 0L, null, 0L, null, null, z, 8191);
                    }
                    C32726Css c32726Css2 = new C32726Css(c32697CsP);
                    c32726Css2.LIZJ = abstractC32698CsQ.LIZJ;
                    linkedList.add(c32726Css2);
                }
            }
        }
        this.LJLILLLLZI.setValue(linkedList);
    }

    public static /* synthetic */ void iv0(BagListViewModel bagListViewModel, int i, long j, long j2) {
        bagListViewModel.hv0(i, j, j2, ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
    }

    public final void hv0(int i, long j, long j2, long j3) {
        StringBuilder LIZLLL = C1FJ.LIZLLL("syncGiftList scene=", i, " roomId=", j);
        C0MT.LIZLLL(LIZLLL, " anchorId=", j2, " userId=");
        LIZLLL.append(j3);
        C0NB.LJIIIZ("BAGS", X1D.LIZIZ(LIZLLL));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C32661Crp.LJI("match_item_list_request", new JSONObject());
        this.LJLJJLL.setValue(EnumC32734Ct0.LOADING);
        C65814PsI.LIZ().getClass();
        AbstractC73672Svk<C28467BFf<BagItemListResponse.Data>> syncItemList = ((PackRetrofitApi) C65814PsI.LIZJ(PackRetrofitApi.class)).syncItemList(i, j, j3, j2);
        if (syncItemList != null) {
            C78999UzT.LJFF(syncItemList.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJIJL(C32755CtL.LJLIL).LJJJLIIL(new AfS4S0100100_5(elapsedRealtime, this, 7), new AfS4S0100100_5(elapsedRealtime, this, 8)), this.LJLJJL);
        }
    }
}
