package com.ss.android.ugc.aweme.watch.history.ui;

import X.C06490Nh;
import X.C16880lQ;
import X.C188067Zq;
import X.C188077Zr;
import X.C188087Zs;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C78926UyI;
import X.RBY;
import Y.ACListenerS23S0100000_3;
import Y.IDCListenerS296S0100000_3;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.watch.history.core.WatchHistoryListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class WatchHistoryItemCell extends PowerCell<C188067Zq> {
    public final C214378bB LJLILLLLZI;
    public final IAccountUserService LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1232));

    public WatchHistoryItemCell() {
        C188087Zs c188087Zs = C188087Zs.LJLIL;
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 1231);
        this.LJLILLLLZI = new C214378bB(C65352Pkq.LIZ(WatchHistoryListViewModel.class), c188087Zs, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), aqS153S0100000_3, C188077Zr.INSTANCE, null, null);
        RBY LJFF = AccountService.LJIJ().LJFF();
        o.LJIIIIZZ(LJFF, "get().getService(IAccoun…class.java).userService()");
        this.LJLJI = LJFF;
    }

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view == null) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            View findViewById = itemView.findViewById(i);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C188067Zq r9) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.watch.history.ui.WatchHistoryItemCell.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.du3, viewGroup, false);
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 181), LIZIZ);
        LIZIZ.setOnLongClickListener(new IDCListenerS296S0100000_3(this, 5));
        Drawable easeInOutGradientDrawable = ProfileServiceImpl.LIZ().getEaseInOutGradientDrawable(1.0f, 0, true);
        if (easeInOutGradientDrawable != null) {
            LIZIZ.findViewById(R.id.n66).setBackground(easeInOutGradientDrawable);
        }
        return LIZIZ;
    }
}
