package com.bytedance.ies.xelement.picker;

import X.F5B;
import X.InterfaceC58352MvE;
import X.VNA;
import X.VNU;
import X.VPD;
import X.VRK;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS48S0200000_14;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxPickerView extends UISimpleView<VRK> {
    public String LJLIL;
    public boolean LJLILLLLZI;
    public F5B LJLJI;
    public F5B LJLJJI;
    public F5B LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public String LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public final InterfaceC58352MvE LJZL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxPickerView(VNU context) {
        super(context);
        o.LJIIJ(context, "context");
        this.LJLIL = "selector";
        this.LJZL = null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        o.LJIIJ(context, "context");
        VRK vrk = new VRK(context);
        vrk.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS48S0200000_14(this, context, 6)));
        return vrk;
    }

    @VPD(name = "cancel-color")
    public final void setCancelColor(String str) {
        this.LJLLJ = str;
    }

    @VPD(name = "cancel-string")
    public final void setCancelString(String str) {
        this.LJLLI = str;
    }

    @VPD(name = "confirm-color")
    public final void setConfirmColor(String str) {
        this.LJLLILLLL = str;
    }

    @VPD(name = "confirm-string")
    public final void setConfirmString(String str) {
        this.LJLL = str;
    }

    @VPD(name = "disabled")
    public final void setDisabled(Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
            this.LJLILLLLZI = bool.booleanValue();
        }
    }

    @VPD(name = "end")
    public final void setEnd(String str) {
        this.LJLJL = str;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, ? extends VNA> map) {
        super.setEvents(map);
        if (map != null) {
            this.LJLZ = map.containsKey("cancel");
            this.LJZ = map.containsKey("change");
            this.LJZI = map.containsKey("columnchange");
        }
    }

    @VPD(name = "fields")
    public final void setFields(String str) {
        this.LJLJLJ = str;
    }

    @VPD(name = "mode")
    public final void setMode(String mode) {
        o.LJIIJ(mode, "mode");
        this.LJLIL = mode;
    }

    @VPD(name = "range")
    public final void setRange(F5B f5b) {
        this.LJLJJI = f5b;
    }

    @VPD(name = "range-key")
    public final void setRangeKey(F5B f5b) {
        this.LJLJJL = f5b;
    }

    @VPD(name = "separator")
    public final void setSeparator(String str) {
        this.LJLJLLL = str;
    }

    @VPD(name = "start")
    public final void setStart(String str) {
        this.LJLJJLL = str;
    }

    @VPD(name = "title")
    public final void setTitle(String str) {
        this.LJLLL = str;
    }

    @VPD(name = "title-color")
    public final void setTitleColor(String str) {
        this.LJLLLL = str;
    }

    @VPD(name = "title-font-size")
    public final void setTitleFontSize(String str) {
        this.LJLLLLLL = str;
    }

    @VPD(name = "value")
    public final void setValue(F5B f5b) {
        this.LJLJI = f5b;
    }
}
