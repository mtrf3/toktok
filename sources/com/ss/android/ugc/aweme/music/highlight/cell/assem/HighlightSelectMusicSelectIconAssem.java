package com.ss.android.ugc.aweme.music.highlight.cell.assem;

import X.C16880lQ;
import X.C214298b3;
import X.C240639cR;
import X.C240649cS;
import X.C240719cZ;
import X.C63044Ooi;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C78983UzD;
import X.C8XO;
import X.C9BE;
import android.view.View;
import com.ss.android.ugc.aweme.music.highlight.HighlightSelectListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import q03.IDaS484S0100000_4;

/* loaded from: classes5.dex */
public final class HighlightSelectMusicSelectIconAssem extends Hilt_HighlightSelectMusicSelectIconAssem implements C8XO {
    public C63044Ooi LLFII;
    public final C214298b3 LLFZ;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c6d;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public HighlightSelectMusicSelectIconAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 457);
        C65776Prg LIZ = C65352Pkq.LIZ(HighlightSelectListViewModel.class);
        this.LLFZ = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 458), C240649cS.INSTANCE, aqS154S0100000_4);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(Object obj) {
        C240719cZ item = (C240719cZ) obj;
        o.LJIIIZ(item, "item");
        C240639cR c240639cR = item.LJLILLLLZI;
        boolean z = c240639cR.LJLJI;
        boolean z2 = c240639cR.LJLJLJ;
        if (z) {
            C78983UzD.LJJIL(Y3());
            return;
        }
        C78983UzD.LJJLIIIJL(Y3());
        C63044Ooi c63044Ooi = this.LLFII;
        if (c63044Ooi == null) {
            return;
        }
        c63044Ooi.setChecked(z2);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(Object obj) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C63044Ooi c63044Ooi = (C63044Ooi) view.findViewById(R.id.ilr);
        if (c63044Ooi != null) {
            C16880lQ.LJIIJ(new IDaS484S0100000_4(this, 9), c63044Ooi);
        } else {
            c63044Ooi = null;
        }
        this.LLFII = c63044Ooi;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(Object obj) {
    }
}
