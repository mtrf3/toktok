package com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings;

import X.C16880lQ;
import X.C1C8;
import X.C49615Jdb;
import X.C79655VNz;
import X.EF7;
import X.V8R;
import X.VNU;
import X.VPD;
import X.VV3;
import X.VV5;
import androidx.recyclerview.widget.RecyclerView;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.behavior.ui.list.UIList;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxDragListUIView extends UIList {
    public boolean LLIILZL;
    public VV5 LLIIZ;
    public C1C8 LLIL;
    public int LLILII;
    public int LLILIL;
    public final V8R LLILL;
    public final VV3 LLILLIZIL;

    @Override // com.lynx.tasm.behavior.ui.list.UIList, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        JavaOnlyMap platformInfo;
        super.onPropsUpdated();
        C79655VNz c79655VNz = this.LJLIL;
        int sign = getSign();
        TemplateAssembler templateAssembler = (TemplateAssembler) c79655VNz.LIZ;
        if (templateAssembler != null) {
            platformInfo = templateAssembler.LIZLLL(sign);
        } else {
            platformInfo = null;
        }
        o.LJIIIIZZ(platformInfo, "platformInfo");
        platformInfo.getMap("diffResult");
        VV5 vv5 = this.LLIIZ;
        if (vv5 != null) {
            vv5.LJIILLIIL();
        }
    }

    public LynxDragListUIView(VNU vnu) {
        super(vnu);
        this.LLILII = 100;
        this.LLILIL = -1;
        this.LLILL = new V8R(this, C16880lQ.LLJJJJ());
        this.LLILLIZIL = new VV3(this);
    }

    @VPD(defaultBoolean = false, name = "drag-enable")
    public final void setDragEnable(boolean z) {
        if (this.LLIILZL != z) {
            this.LLIILZL = z;
            if (z) {
                VV5 vv5 = new VV5(this);
                C1C8 c1c8 = new C1C8(vv5);
                c1c8.LJII((RecyclerView) this.mView);
                ((RecyclerView) this.mView).LJIIJ(this.LLILLIZIL);
                this.LLIIZ = vv5;
                this.LLIL = c1c8;
                return;
            }
            this.LLIIZ = null;
            C1C8 c1c82 = this.LLIL;
            if (c1c82 != null) {
                c1c82.LJII(null);
            }
            ((RecyclerView) this.mView).LJJLJLI(this.LLILLIZIL);
            this.LLIL = null;
            this.LLILL.removeCallbacksAndMessages(null);
        }
    }

    @VPD(defaultInt = -1, name = "drag-slide-speed")
    public final void setDragSlideSpeed(int i) {
        int i2 = -1;
        if (i != -1) {
            i2 = (int) ((EF7.LIZIZ().getResources().getDisplayMetrics().density * i) + 0.5f);
        }
        if (this.LLILIL != i2) {
            this.LLILIL = i2;
        }
    }

    @VPD(defaultInt = 100, name = "drag-trigger-duration")
    public final void setDragTriggerDuration(int i) {
        if (this.LLILII != i) {
            this.LLILII = i;
        }
    }

    public final void LJJIII(int i, String str) {
        C49615Jdb c49615Jdb = new C49615Jdb(getSign(), "dragstatechange");
        c49615Jdb.LIZJ(str, "state");
        c49615Jdb.LIZJ(Integer.valueOf(i), "position");
        this.mContext.LJLJJL.LIZIZ(c49615Jdb);
    }
}
