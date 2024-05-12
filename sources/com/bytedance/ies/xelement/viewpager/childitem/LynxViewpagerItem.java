package com.bytedance.ies.xelement.viewpager.childitem;

import X.C49615Jdb;
import X.OWR;
import X.VNA;
import X.VNL;
import X.VNU;
import X.VPD;
import X.VRK;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.UIGroup;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LynxViewpagerItem extends UIGroup<VRK> {
    public String LJLIL;
    public OWR LJLILLLLZI;
    public boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxViewpagerItem(VNU context) {
        super(context);
        o.LJIIJ(context, "context");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new VRK(context);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, VNA> map) {
        super.setEvents(map);
        if (map != null) {
            this.LJLJI = map.containsKey("attach");
        }
    }

    @VPD(name = "tag")
    public final void setTag(String tag) {
        o.LJIIJ(tag, "tag");
        this.LJLIL = tag;
        OWR owr = this.LJLILLLLZI;
        if (owr != null) {
            owr.LIZ(tag);
        }
    }

    public final void LJIJJLI(int i, boolean z) {
        if (!this.LJLJI) {
            return;
        }
        VNU lynxContext = this.mContext;
        o.LJFF(lynxContext, "lynxContext");
        VNL vnl = lynxContext.LJLJJL;
        C49615Jdb c49615Jdb = new C49615Jdb(getSign(), "attach");
        c49615Jdb.LIZJ(Boolean.valueOf(z), "attach");
        c49615Jdb.LIZJ(String.valueOf(this.LJLIL), "tag");
        c49615Jdb.LIZJ(Integer.valueOf(i), "index");
        vnl.LIZIZ(c49615Jdb);
    }
}
