package com.ss.android.ugc.aweme.comment.gift.model;

import X.AbstractC36908Ee8;
import X.AbstractC73672Svk;
import X.C178526zY;
import X.C188727au;
import X.C221108m2;
import X.C32287Cln;
import X.C32420Cnw;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73536StY;
import X.C73969T1h;
import X.C78934UyQ;
import X.C7W8;
import X.C7W9;
import X.C7WA;
import X.C7WB;
import X.C7WC;
import X.C7WD;
import X.EFJ;
import X.FMX;
import X.InterfaceC32356Cmu;
import X.InterfaceC32418Cnu;
import X.PU1;
import X.PU2;
import X.T16;
import Y.AfS55S0100000_3;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.gift.api.GiftListApi;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.io.File;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class GiftViewModel extends ViewModel {
    public static final /* synthetic */ int LJLZ = 0;
    public Long LJLLJ;
    public boolean LJLLLL;
    public Aweme LJLLLLLL;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C7WC.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C7WB.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C7W8.LJLIL);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C7W9.LJLIL);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C7WA.LJLIL);
    public String LJLJJLL = "";
    public String LJLJL = "";
    public String LJLJLJ = "";
    public String LJLJLLL = "";
    public Integer LJLL = 0;
    public String LJLLI = "";
    public String LJLLILLLL = "";
    public final MutableLiveData<Integer> LJLLL = new MutableLiveData<>();

    public final MutableLiveData<Long> iv0() {
        return (MutableLiveData) this.LJLJJI.getValue();
    }

    public final MutableLiveData<GiftStruct> jv0() {
        return (MutableLiveData) this.LJLILLLLZI.getValue();
    }

    public final MutableLiveData<HashMap<Long, String>> kv0() {
        return (MutableLiveData) this.LJLJI.getValue();
    }

    public final MutableLiveData<GiftResponse> lv0() {
        return (MutableLiveData) this.LJLIL.getValue();
    }

    public final void nv0() {
        String str = this.LJLLILLLL;
        if (str == null || str.length() == 0) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLJJLL);
        c188727au.LJIIIZ("group_id", this.LJLJL);
        c188727au.LJIIIZ("author_id", this.LJLJLJ);
        c188727au.LIZLLL(C178526zY.LIZ(this.LJLLLLLL), "is_follow");
        c188727au.LIZLLL(C178526zY.LIZ(this.LJLLLLLL), "is_like");
        c188727au.LJIIIZ("enter_method", this.LJLLILLLL);
        c188727au.LJFF(this.LJLL, "is_success");
        c188727au.LJIIIZ("error_code", this.LJLLI);
        FMX.LJIIL("show_gift_panel_result", c188727au.LIZ);
    }

    public final void gv0(final long j, UrlModel urlModel) {
        List<String> urlList;
        String[] strArr;
        if (urlModel == null || TextUtils.isEmpty(urlModel.getFileHash()) || (urlList = urlModel.getUrlList()) == null || urlList.isEmpty()) {
            return;
        }
        String str = null;
        if (!(!false)) {
            return;
        }
        List<String> urlList2 = urlModel.getUrlList();
        if (urlList2 != null) {
            strArr = (String[]) urlList2.toArray(new String[0]);
        } else {
            strArr = null;
        }
        C32420Cnw c32420Cnw = new C32420Cnw(j, strArr, urlModel.getFileHash());
        PU1 pu1 = PU1.LIZ;
        PU2 pu2 = new PU2() { // from class: X.7W7
            @Override // X.PU2
            public final void LIZ(long j2) {
            }

            @Override // X.PU2
            public final void LIZIZ(C32425Co1 t) {
                o.LJIIIZ(t, "t");
            }

            @Override // X.PU2
            public final void onProgress(int i) {
            }

            @Override // X.PU2
            public final void LIZLLL(long j2, String path) {
                o.LJIIIZ(path, "path");
                HashMap<Long, String> value = GiftViewModel.this.kv0().getValue();
                if (value != null) {
                    if (value.containsKey(Long.valueOf(j)) && ujb.o.LJJJJIZL(value.get(Long.valueOf(j)), path, false)) {
                        return;
                    }
                } else {
                    value = new HashMap<>();
                }
                value.put(Long.valueOf(j), path);
                GiftViewModel.this.kv0().postValue(value);
            }
        };
        PU1.LIZLLL();
        C32287Cln c32287Cln = PU1.LJII;
        if (c32287Cln != null) {
            InterfaceC32418Cnu interfaceC32418Cnu = c32287Cln.LIZ;
            if (interfaceC32418Cnu != null) {
                str = interfaceC32418Cnu.LIZIZ(c32420Cnw);
            }
            if (new File(i0.LJFF(C78934UyQ.LJ(str), ".fetched")).exists()) {
                pu2.LIZLLL(c32420Cnw.LIZIZ, PU1.LJ(c32420Cnw));
                return;
            }
        }
        String id = c32420Cnw.LIZ;
        HashMap hashMap = (HashMap) PU1.LIZIZ;
        if (hashMap.containsKey(id)) {
            if (c32420Cnw.LJI) {
                Object obj = hashMap.get(id);
                o.LJI(obj);
                C32420Cnw c32420Cnw2 = ((C7WD) obj).LIZ;
                if (c32420Cnw2 != null) {
                    ArrayDeque arrayDeque = (ArrayDeque) PU1.LIZLLL;
                    if (arrayDeque.contains(c32420Cnw2)) {
                        arrayDeque.remove(c32420Cnw2);
                    }
                }
                c32420Cnw.LIZIZ();
                ((ArrayDeque) PU1.LIZLLL).addFirst(c32420Cnw);
            }
            Object obj2 = hashMap.get(id);
            o.LJI(obj2);
            ((CopyOnWriteArrayList) ((C7WD) obj2).LIZIZ).add(pu2);
            return;
        }
        C7WD c7wd = new C7WD(c32420Cnw);
        ((CopyOnWriteArrayList) c7wd.LIZIZ).add(pu2);
        o.LJIIIIZZ(id, "id");
        hashMap.put(id, c7wd);
        c32420Cnw.LIZIZ();
        if (c32420Cnw.LJI) {
            ((ArrayDeque) PU1.LIZLLL).addFirst(c32420Cnw);
        } else {
            ((ArrayDeque) PU1.LIZLLL).add(c32420Cnw);
        }
        pu1.LJFF();
    }

    public final void hv0(String awemeId, String authorId) {
        AbstractC73672Svk<GiftResponse> abstractC73672Svk;
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(authorId, "authorId");
        lv0().getValue();
        try {
            if (GiftListApi.LIZ == null) {
                IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
                String API_URL_PREFIX_SI = EFJ.LIZJ;
                o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
                GiftListApi.LIZ = (GiftListApi.FetchGiftListApi) LIZLLL.create(API_URL_PREFIX_SI).create(GiftListApi.FetchGiftListApi.class);
            }
            GiftListApi.FetchGiftListApi fetchGiftListApi = GiftListApi.LIZ;
            o.LJI(fetchGiftListApi);
            abstractC73672Svk = fetchGiftListApi.getGiftList(awemeId, authorId, 0);
        } catch (ExecutionException e) {
            AbstractC36908Ee8.getCompatibleException(e);
            abstractC73672Svk = C73536StY.LJLIL;
            o.LJIIIIZZ(abstractC73672Svk, "empty()");
        }
        new C73318Sq2().LIZ(abstractC73672Svk.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS55S0100000_3(this, 80), new AfS55S0100000_3(this, 81)));
    }

    public final void mv0(Integer num, Long l, Long l2) {
        Long value = iv0().getValue();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLJJLL);
        c188727au.LJIIIZ("group_id", this.LJLJL);
        c188727au.LJIIIZ("author_id", this.LJLJLJ);
        c188727au.LJFF(l, "product_id");
        c188727au.LJFF(num, "is_success");
        c188727au.LJFF(l2, "previous_balance");
        c188727au.LJFF(value, "new_balance");
        FMX.LJIIL("confirm_coin_recharge", c188727au.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.72o] */
    public final void ov0(final int i, final long j, final Context context, final String coinSyncType) {
        o.LJIIIZ(coinSyncType, "coinSyncType");
        final Long value = iv0().getValue();
        iv0().setValue(Long.MIN_VALUE);
        LiveOuterService.LJJJLL().LJJIJIL().LJJIL(new InterfaceC32356Cmu() { // from class: X.72o
            @Override // X.InterfaceC32356Cmu
            public final void LIZ(long j2) {
                GiftViewModel.this.iv0().setValue(Long.valueOf(j2));
                if (o.LJ(coinSyncType, "from_recharge")) {
                    GiftViewModel.this.mv0(Integer.valueOf(i), Long.valueOf(j), value);
                }
            }

            @Override // X.InterfaceC32356Cmu
            public final void LIZIZ(Throwable e) {
                o.LJIIIZ(e, "e");
                GiftViewModel.this.iv0().setValue(Long.MIN_VALUE);
                C188727au c188727au = new C188727au();
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                c188727au.LJIIIZ("failure_reason", message);
                c188727au.LJIIIZ("enter_from", GiftViewModel.this.LJLJJLL);
                FMX.LJIIL("refresh_coin_balance_fail", c188727au.LIZ);
                if (o.LJ(coinSyncType, "from_recharge")) {
                    GiftViewModel.this.mv0(Integer.valueOf(i), Long.valueOf(j), value);
                }
                if (context != null) {
                    C5S1 c5s1 = new C5S1(context);
                    c5s1.LIZJ(R.string.tpc);
                    c5s1.LJ();
                }
            }
        });
    }
}
