package com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui;

import X.C214298b3;
import X.C221108m2;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C78926UyI;
import X.C8YN;
import X.C94562aj0;
import X.C94563aj1;
import X.C94564aj2;
import X.C94565aj3;
import X.C9XN;
import X.SYL;
import X.TBT;
import android.view.View;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.cell.MusicDspAwemeCell;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.cell.MusicDspCreateNewPlaylistCell;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.cell.MusicDspPlaylistCell;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.cell.MusicDspSheetAuthTitleCell;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.viewmodel.MusicDspSheetViewModel;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.IDqS446S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class MusicDspSheetAssem extends UIListContentAssem<MusicDspSheetViewModel> {
    public WrapGridLayoutManager LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C214298b3 LJLJJI;

    public MusicDspSheetAssem() {
        new LinkedHashMap();
        this.LJLILLLLZI = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 64));
        this.LJLJI = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 62));
        C9XN c9xn = C9XN.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicDspSheetViewModel.class);
        this.LJLJJI = C78926UyI.LJ(this, LIZ, c9xn, new IDqS423S0100000_42(LIZ, 63), C94565aj3.INSTANCE, null);
    }

    public final C73305Spp C3() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: E3, reason: merged with bridge method [inline-methods] */
    public final MusicDspSheetViewModel A3() {
        return (MusicDspSheetViewModel) this.LJLJJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = true;
        c57939MoZ.LIZ = 3;
        return c57939MoZ;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        SYL v3 = v3();
        v3.LLLF.LJZL(MusicDspSheetAuthTitleCell.class, MusicDspAwemeCell.class, MusicDspPlaylistCell.class, MusicDspCreateNewPlaylistCell.class);
        v3.setItemAnimator(null);
        getContainerView().getContext();
        this.LJLIL = new WrapGridLayoutManager(1, 1, false);
        v3().setLayoutManager(this.LJLIL);
        super.onViewCreated(view);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.apq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C94952apI) obj).LJLIL;
            }
        }, null, new IDqS446S0100000_42(this, 0), 6);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.apr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C94952apI) obj).LJLILLLLZI;
            }
        }, null, C94562aj0.LJLIL, 6);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.aps
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C94952apI) obj).LJLJJI;
            }
        }, null, C94563aj1.LJLIL, 6);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.apt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C94952apI) obj).LJLJI;
            }
        }, null, C94564aj2.LJLIL, 6);
    }
}
