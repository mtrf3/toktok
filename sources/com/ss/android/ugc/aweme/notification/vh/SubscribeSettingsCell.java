package com.ss.android.ugc.aweme.notification.vh;

import X.ARV;
import X.C1DI;
import X.C221108m2;
import X.C57113MbF;
import X.C57114MbG;
import X.C62822Ol8;
import X.C73318Sq2;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS29S0100000_9;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SubscribeSettingsCell extends PowerCell<C57113MbF> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C57114MbG.LJLIL);
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;
    public ARV LJLJJI;
    public C57113MbF LJLJJL;
    public int LJLJJLL;
    public int LJLJL;

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onDestroy() {
        super.onDestroy();
        ((C73318Sq2) this.LJLIL.getValue()).LIZLLL();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C57113MbF c57113MbF) {
        int i;
        String str;
        C57113MbF item = c57113MbF;
        o.LJIIIZ(item, "item");
        super.onBindItemView(item);
        this.LJLJJL = item;
        Integer num = item.LJLIL;
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        this.LJLJJLL = i;
        C57113MbF c57113MbF2 = this.LJLJJL;
        if (c57113MbF2 != null) {
            Integer num2 = c57113MbF2.LJLILLLLZI;
            if (num2 != null) {
                i2 = num2.intValue();
            }
            this.LJLJL = i2;
            TuxTextView tuxTextView = this.LJLILLLLZI;
            if (tuxTextView != null) {
                C57113MbF c57113MbF3 = this.LJLJJL;
                if (c57113MbF3 != null) {
                    tuxTextView.setText(c57113MbF3.LJLJI);
                    ARV arv = this.LJLJJI;
                    if (arv != null) {
                        C57113MbF c57113MbF4 = this.LJLJJL;
                        if (c57113MbF4 != null) {
                            Boolean bool = c57113MbF4.LJLJJLL;
                            Boolean bool2 = Boolean.TRUE;
                            arv.setChecked(!o.LJ(bool, bool2));
                            TuxTextView tuxTextView2 = this.LJLJI;
                            if (tuxTextView2 != null) {
                                C57113MbF c57113MbF5 = this.LJLJJL;
                                if (c57113MbF5 != null) {
                                    if (!o.LJ(c57113MbF5.LJLJJLL, bool2)) {
                                        C57113MbF c57113MbF6 = this.LJLJJL;
                                        if (c57113MbF6 != null) {
                                            str = c57113MbF6.LJLJJI;
                                        } else {
                                            o.LJIJI("settingItem");
                                            throw null;
                                        }
                                    } else {
                                        C57113MbF c57113MbF7 = this.LJLJJL;
                                        if (c57113MbF7 != null) {
                                            str = c57113MbF7.LJLJJL;
                                        } else {
                                            o.LJIJI("settingItem");
                                            throw null;
                                        }
                                    }
                                    tuxTextView2.setText(str);
                                    ARV arv2 = this.LJLJJI;
                                    if (arv2 != null) {
                                        arv2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS29S0100000_9(this, 43)));
                                        return;
                                    } else {
                                        o.LJIJI("subscribeSettingSwitch");
                                        throw null;
                                    }
                                }
                                o.LJIJI("settingItem");
                                throw null;
                            }
                            o.LJIJI("subscribeSettingDesc");
                            throw null;
                        }
                        o.LJIJI("settingItem");
                        throw null;
                    }
                    o.LJIJI("subscribeSettingSwitch");
                    throw null;
                }
                o.LJIJI("settingItem");
                throw null;
            }
            o.LJIJI("subscribeSettingTitle");
            throw null;
        }
        o.LJIJI("settingItem");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZ = C1DI.LIZ(viewGroup, "parent", R.layout.sp, viewGroup, false, "view");
        View findViewById = LIZ.findViewById(R.id.h5y);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.notification_text)");
        this.LJLILLLLZI = (TuxTextView) findViewById;
        View findViewById2 = LIZ.findViewById(R.id.h52);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.notification_hint)");
        this.LJLJI = (TuxTextView) findViewById2;
        View findViewById3 = LIZ.findViewById(R.id.h5w);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.notification_switch)");
        this.LJLJJI = (ARV) findViewById3;
        return LIZ;
    }
}
