package Y;

import X.BI8;
import X.C0K5;
import X.C0NB;
import X.C1P;
import X.C1R;
import X.C26045AKb;
import X.C28561BIv;
import X.C30922CBq;
import X.C45804HyK;
import X.InterfaceC64592gB;
import X.JBR;
import X.ORZ;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.game.GameCategoryListFragment;
import com.bytedance.android.livesdk.model.GameTag;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.game.GameTagSearchResult;
import webcast.api.game.SearchTagResponse;

/* loaded from: classes6.dex */
public class AfS22S1300000_5 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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
            default:
                return;
        }
    }

    public static final void accept$0(AfS22S1300000_5 afS22S1300000_5, Object obj) {
        Activity LJIJJ;
        ((C1R) afS22S1300000_5.l1).LJLJJI = false;
        ((DialogInterface) afS22S1300000_5.l2).dismiss();
        Context context = ((C1P) afS22S1300000_5.l3).LJLIL;
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            C1P c1p = (C1P) afS22S1300000_5.l3;
            String str = afS22S1300000_5.s0;
            C26045AKb c26045AKb = new C26045AKb(LJIJJ);
            c26045AKb.LJIIIIZZ(R.string.lk0);
            c26045AKb.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb.LJII(R.attr.e8);
            c26045AKb.LIZ(true);
            c26045AKb.LJIIJ();
            C28561BIv.LIZ(c1p.LJLILLLLZI, str, "appeal_submitted");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS22S1300000_5 afS22S1300000_5, Object obj) {
        List<GameTag> list;
        List<GameTagSearchResult> list2;
        BaseResponse baseResponse = (BaseResponse) obj;
        C0K5 c0k5 = (C0K5) ((GameCategoryListFragment) afS22S1300000_5.l1)._$_findCachedViewById(R.id.dqa);
        if (c0k5 != null) {
            c0k5.LIZLLL();
        }
        SearchTagResponse.ResponseData responseData = (SearchTagResponse.ResponseData) baseResponse.data;
        if (!o.LJ(afS22S1300000_5.s0, ((GameCategoryListFragment) afS22S1300000_5.l1).LJLJL)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("searchContent: ");
            LIZ.append(afS22S1300000_5.s0);
            LIZ.append(", curContent: ");
            JBR.LJIIJ(LIZ, ((GameCategoryListFragment) afS22S1300000_5.l1).LJLJL, LIZ, "GameCategoryListDialog");
            return;
        }
        if (responseData != null && (list2 = responseData.resultList) != null && list2.size() == 0) {
            ((IDObjectS178S0100000_5) afS22S1300000_5.l2).LIZ$0(afS22S1300000_5.s0, (List) afS22S1300000_5.l3);
            return;
        }
        ((IDObjectS178S0100000_5) afS22S1300000_5.l2).LIZIZ$1(false);
        BI8 bi8 = ((GameCategoryListFragment) afS22S1300000_5.l1).LJLIL;
        if (bi8 != null) {
            List<GameTagSearchResult> list3 = responseData.resultList;
            if (list3 != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<GameTagSearchResult> it = list3.iterator();
                while (it.hasNext()) {
                    GameTag gameTag = it.next().tag;
                    if (gameTag != null) {
                        arrayList.add(gameTag);
                    }
                }
                list = ORZ.LLJI(arrayList);
            } else {
                list = null;
            }
            String searchContent = afS22S1300000_5.s0;
            o.LJIIIZ(searchContent, "searchContent");
            bi8.LJLJL = list;
            bi8.LJLJLJ = searchContent;
            bi8.LJLJLLL = true;
            bi8.notifyDataSetChanged();
        }
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("search game tag by server, content: ");
            JBR.LJIIJ(LIZ2, afS22S1300000_5.s0, LIZ2, "GameCategoryListDialog");
        }
        ((GameCategoryListFragment) afS22S1300000_5.l1).LJLJLJ = true;
    }

    public static final void accept$2(AfS22S1300000_5 afS22S1300000_5, Object obj) {
        Throwable th = (Throwable) obj;
        C0K5 c0k5 = (C0K5) ((GameCategoryListFragment) afS22S1300000_5.l1)._$_findCachedViewById(R.id.dqa);
        if (c0k5 != null) {
            c0k5.LIZLLL();
        }
        ((IDObjectS178S0100000_5) afS22S1300000_5.l2).LIZ$0(afS22S1300000_5.s0, (List) afS22S1300000_5.l3);
        C0NB.LJ("GameCategoryListDialog", th.getMessage());
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS22S1300000_5(Y.IDObjectS178S0100000_5 r2, com.bytedance.android.livesdk.game.GameCategoryListFragment r3, java.lang.String r4, java.util.List r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 1: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l1 = r3
            r0.l2 = r2
            r0.l3 = r5
            r0.s0 = r4
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.l1 = r3
            r0.s0 = r4
            r0.l2 = r2
            r0.l3 = r5
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS22S1300000_5.<init>(Y.IDObjectS178S0100000_5, com.bytedance.android.livesdk.game.GameCategoryListFragment, java.lang.String, java.util.List, int):void");
    }

    public AfS22S1300000_5(C1R c1r, LiveDialog liveDialog, C1P c1p, String str, int i) {
        this.$t = i;
        this.l1 = c1r;
        this.l2 = liveDialog;
        this.l3 = c1p;
        this.s0 = str;
    }
}
