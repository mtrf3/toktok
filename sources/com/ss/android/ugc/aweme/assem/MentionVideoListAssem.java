package com.ss.android.ugc.aweme.assem;

import X.C214298b3;
import X.C221108m2;
import X.C227108vi;
import X.C47704Ins;
import X.C55749LuL;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C73305Spp;
import X.C78926UyI;
import X.C9BE;
import X.C9QW;
import X.SRC;
import X.SRD;
import X.SRE;
import X.SRG;
import X.SRI;
import X.SYL;
import X.T3D;
import androidx.fragment.app.Fragment;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.cell.MentionVideoFooterCell;
import com.ss.android.ugc.aweme.viewmodel.BaseVideoListVM;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MentionVideoListAssem extends UIListContentAssem<BaseVideoListVM<SRI, C9QW, Long>> implements SRG {
    public T3D LJLIL;
    public final C55749LuL LJLILLLLZI;
    public Fragment LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C214298b3 LJLJJLL;

    public MentionVideoListAssem() {
        new LinkedHashMap();
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LJ(this, SRE.class, null), checkSupervisorPrepared());
        this.LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 95));
        this.LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 96));
        this.LJLJJLL = C78926UyI.LJ(this, C65352Pkq.LIZ(BaseVideoListVM.class), C9BE.LIZ, new AqS162S0100000_12(this, 97), SRC.INSTANCE, new AqS162S0100000_12(this, 98));
    }

    public final C73305Spp C3() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: E3, reason: merged with bridge method [inline-methods] */
    public final BaseVideoListVM<SRI, C9QW, Long> A3() {
        return (BaseVideoListVM) this.LJLJJLL.getValue();
    }

    public final void F3() {
        T3D t3d = this.LJLIL;
        if (t3d != null) {
            t3d.LIZIZ();
        }
        this.LJLIL = null;
    }

    @Override // X.SRG
    public final C227108vi LJJJIL() {
        return new C227108vi(v3(), new SRD(this));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZ = 5;
        c57939MoZ.LIZIZ = true;
        c57939MoZ.LIZJ = MentionVideoFooterCell.class;
        return c57939MoZ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        F3();
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.assem.MentionVideoListAssem.onViewCreated(android.view.View):void");
    }
}
