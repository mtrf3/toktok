package com.ss.android.ugc.aweme.nows.archive.ui;

import X.C184077Kh;
import X.C1DI;
import X.C214378bB;
import X.C214528bQ;
import X.C62552ct;
import X.C65352Pkq;
import X.C78926UyI;
import X.C7M7;
import X.C7M8;
import Y.ARunnableS22S0200000_3;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.nows.archive.viewmodel.NowArchiveCalendarListViewModel;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowArchiveCalendarCell extends PowerCell<C62552ct> {
    public final C214378bB LJLIL;

    public NowArchiveCalendarCell() {
        C7M8 c7m8 = C7M8.LJLIL;
        this.LJLIL = new C214378bB(C65352Pkq.LIZ(NowArchiveCalendarListViewModel.class), c7m8, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, C7M7.INSTANCE, null, null);
    }

    public static String L(long j) {
        String format = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date(j));
        format.toString();
        return format;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C62552ct c62552ct) {
        C62552ct t = c62552ct;
        o.LJIIIZ(t, "t");
        this.itemView.post(new ARunnableS22S0200000_3(this, t, 32));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bxb, viewGroup, false, "from(parent.context)\n   …ndar_cell, parent, false)");
    }
}
