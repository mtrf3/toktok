package com.ss.android.ugc.aweme.nows.archive.assem;

import X.C141335gf;
import X.C214298b3;
import X.C221108m2;
import X.C36922EeM;
import X.C3C5;
import X.C47704Ins;
import X.C55749LuL;
import X.C57939MoZ;
import X.C62552ct;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C76800UCe;
import X.C78926UyI;
import X.C7GZ;
import X.C7M2;
import X.C7M3;
import X.C9BE;
import X.InterfaceC57784Mm4;
import X.SYL;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.nows.archive.ui.NowArchiveCalendarCell;
import com.ss.android.ugc.aweme.nows.archive.viewmodel.NowArchiveCalendarListViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowArchiveCalendarListAssem extends UIListContentAssem<NowArchiveCalendarListViewModel> {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C55749LuL LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public int LJLJJLL;

    public NowArchiveCalendarListAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(NowArchiveCalendarListViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 562), C7M3.INSTANCE, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 560));
        this.LJLJI = new C55749LuL(C47704Ins.LIZJ(this, C7M2.class, "now_calendar_hierarchy_data_key"), checkSupervisorPrepared());
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 563));
        this.LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 559));
    }

    public final C73305Spp C3() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: E3, reason: merged with bridge method [inline-methods] */
    public final NowArchiveCalendarListViewModel A3() {
        return (NowArchiveCalendarListViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZ = 3;
        c57939MoZ.LIZIZ = true;
        c57939MoZ.LJI = "now_archive_list";
        return c57939MoZ;
    }

    @Override // X.C8W0
    public final void onResume() {
        Object LIZ;
        super.onResume();
        Map<Integer, C62552ct> map = C7GZ.LIZJ;
        if (!map.isEmpty()) {
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                try {
                    v3().getState().LJIILL(((Number) entry.getKey()).intValue(), (InterfaceC57784Mm4) entry.getValue());
                    LIZ = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
                if (m10exceptionOrNullimpl != null) {
                    C36922EeM.LJFF(m10exceptionOrNullimpl);
                }
            }
            ((LinkedHashMap) C7GZ.LIZJ).clear();
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        v3().LLLF.LJZL(NowArchiveCalendarCell.class);
        v3().setItemAnimator(null);
        NowArchiveCalendarListViewModel A3 = A3();
        String str = ((C7M2) this.LJLJI.getValue()).LJLIL;
        A3.getClass();
        o.LJIIIZ(str, "<set-?>");
        A3.LJLIL = str;
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.7M4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C182307Dm c182307Dm = (C182307Dm) obj;
                c182307Dm.getClass();
                return C208708Ha.LIZLLL(c182307Dm);
            }
        }, null, new AqS169S0100000_3(this, 283), new AqS153S0100000_3(this, 561), new AqS169S0100000_3(this, 284), 2, null);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.7M5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C182307Dm c182307Dm = (C182307Dm) obj;
                c182307Dm.getClass();
                return C208708Ha.LIZIZ(c182307Dm);
            }
        }, null, null, null, new AqS169S0100000_3(this, 285), 14, null);
    }
}
