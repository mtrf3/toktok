package Y;

import X.A2G;
import X.AbstractC186377Td;
import X.C39326Fc2;
import X.C47261Igj;
import X.C68322mC;
import X.C73318Sq2;
import X.C8ZC;
import X.InterfaceC64592gB;
import X.InterfaceC67352kd;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.favorites.business.FavoriteCountResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService;
import com.ss.android.ugc.aweme.service.unlogindigg.UnLoggedDiggResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS49S0400000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AfS42S0300000_3 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS42S0300000_3 afS42S0300000_3, Object obj) {
        Integer num;
        HashMap<String, Integer> hashMap;
        FavoriteCountResponse favoriteCountResponse = (FavoriteCountResponse) obj;
        List list = (List) afS42S0300000_3.l0;
        final C8ZC c8zc = (C8ZC) afS42S0300000_3.l1;
        final String[] strArr = (String[]) afS42S0300000_3.l2;
        final int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i >= 0) {
                final AbstractC186377Td abstractC186377Td = (AbstractC186377Td) obj2;
                if (favoriteCountResponse == null || (hashMap = favoriteCountResponse.count) == null || (num = hashMap.get(abstractC186377Td.LIZ().LIZLLL)) == null) {
                    num = 0;
                }
                int intValue = num.intValue();
                c8zc.LIZLLL.put(abstractC186377Td.LIZ().LIZJ, Integer.valueOf(intValue));
                MutableLiveData<Integer> mutableLiveData = abstractC186377Td.LJLIL;
                mutableLiveData.setValue(Integer.valueOf(intValue));
                mutableLiveData.observe(c8zc.LIZIZ, new Observer() { // from class: X.8ZB
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj3) {
                        Integer it = (Integer) obj3;
                        C80674VlO LJIIJ = C8ZC.this.LIZ.LJIIJ(i);
                        if (LJIIJ != null) {
                            String[] strArr2 = strArr;
                            int i3 = i;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(strArr2[i3]);
                            LIZ.append(' ');
                            LIZ.append(C77123UOp.LJJIIJ(it.intValue()));
                            LJIIJ.LIZJ = X1D.LIZIZ(LIZ);
                            LJIIJ.LIZIZ();
                        }
                        java.util.Map<String, Integer> map = C8ZC.this.LIZLLL;
                        String str = abstractC186377Td.LIZ().LIZJ;
                        o.LJIIIIZZ(it, "it");
                        map.put(str, it);
                    }
                });
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public static final void accept$1(AfS42S0300000_3 afS42S0300000_3, Object obj) {
        if (((UnLoggedDiggResponse) obj).statusCode == 0) {
            ((IUnLoginDiggService) afS42S0300000_3.l0).LJI();
            C39326Fc2.LIZ("like_sync_result", (Bundle) afS42S0300000_3.l1, 1);
        } else {
            C39326Fc2.LIZ("like_sync_result", (Bundle) afS42S0300000_3.l1, 0);
        }
        ((C73318Sq2) afS42S0300000_3.l2).dispose();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse] */
    public static final void accept$2(AfS42S0300000_3 afS42S0300000_3, Object obj) {
        ?? r3 = (MixVideosResponse) obj;
        MixVideosManageViewModel mixVideosManageViewModel = (MixVideosManageViewModel) afS42S0300000_3.l0;
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS42S0300000_3.l2;
        mixVideosManageViewModel.getVmDispatcher().getState();
        List<? extends Aweme> list = r3.mixVideos;
        mixVideosManageViewModel.LJLJJL = r3.hasMore;
        mixVideosManageViewModel.withState(new AqS49S0400000_3(mixVideosManageViewModel, (MixVideosManageViewModel) interfaceC67352kd, (InterfaceC67352kd<? super A2G<Long>>) r3, (MixVideosResponse) list, (List<? extends Aweme>) 18));
        ((C68322mC) afS42S0300000_3.l1).element = r3;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse] */
    public static final void accept$3(AfS42S0300000_3 afS42S0300000_3, Object obj) {
        ?? r5 = (MixVideosResponse) obj;
        MixVideosManageViewModel mixVideosManageViewModel = (MixVideosManageViewModel) afS42S0300000_3.l0;
        mixVideosManageViewModel.withState(new AqS107S0300000_3((MixVideosResponse) r5, (MixVideosResponse) mixVideosManageViewModel, (MixVideosManageViewModel) afS42S0300000_3.l2, (InterfaceC67352kd<? super A2G<Long>>) 43));
        ((C68322mC) afS42S0300000_3.l1).element = r5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS42S0300000_3(Object obj, MixVideosManageViewModel mixVideosManageViewModel, C68322mC<MixVideosResponse> c68322mC, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        this.$t = interfaceC67352kd;
        this.l0 = obj;
        this.l1 = mixVideosManageViewModel;
        this.l2 = c68322mC;
    }
}
