package com.ss.android.ugc.aweme.notification.view;

import X.C06490Nh;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C57175McF;
import X.C62822Ol8;
import X.C71897SJp;
import X.FMX;
import X.OSZ;
import X.X1D;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notification.vm.GuideUserSwitchVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class GuideOutPushSwitchCell extends PowerCell<C57175McF> implements View.OnClickListener {
    public C71897SJp LJLIL;
    public TuxTextView LJLILLLLZI;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 474));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C57175McF c57175McF) {
        C57175McF item = c57175McF;
        o.LJIIIZ(item, "item");
        super.onBindItemView(item);
        TuxTextView tuxTextView = this.LJLILLLLZI;
        if (tuxTextView != null) {
            tuxTextView.setText(item.LJLILLLLZI);
        } else {
            o.LJIJI("settingTitle");
            throw null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        String str;
        String str2;
        GuideUserSwitchVM guideUserSwitchVM;
        o.LJIIIZ(v, "v");
        if (v instanceof C71897SJp) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("guide_outpush click ");
            C57175McF item = getItem();
            if (item != null) {
                str = item.LJLILLLLZI;
            } else {
                str = null;
            }
            LIZ.append(str);
            LIZ.append(" checkbox");
            X1D.LIZIZ(LIZ);
            C57175McF item2 = getItem();
            if (item2 != null) {
                String str3 = item2.LJLJI;
                if (str3 != null && (guideUserSwitchVM = (GuideUserSwitchVM) this.LJLJI.getValue()) != null) {
                    guideUserSwitchVM.LJLIL.postValue(new OSZ<>(str3, Boolean.valueOf(((CompoundButton) v).isChecked())));
                }
                C188727au c188727au = new C188727au();
                c188727au.LJI("enter_from", item2.LJLIL.enterFrom);
                c188727au.LJI("enter_method", item2.LJLIL.enterMethod);
                c188727au.LJI("trigger", item2.LJLIL.trigger);
                String str4 = item2.LJLJI;
                if (str4 != null) {
                    switch (str4.hashCode()) {
                        case -2081740044:
                            if (str4.equals("digg_push")) {
                                c188727au.LJI("sub_type", "likes");
                                break;
                            }
                            break;
                        case 795516154:
                            if (str4.equals("comment_push")) {
                                c188727au.LJI("sub_type", "comments");
                                break;
                            }
                            break;
                        case 1596510952:
                            if (str4.equals("follow_push")) {
                                c188727au.LJI("sub_type", "new_followers");
                                break;
                            }
                            break;
                        case 2009230415:
                            if (str4.equals("mention_push")) {
                                c188727au.LJI("sub_type", "mentions");
                                break;
                            }
                            break;
                    }
                }
                if (((CompoundButton) v).isChecked()) {
                    str2 = "on";
                } else {
                    str2 = "off";
                }
                c188727au.LJI("to_status", str2);
                FMX.LJIIL("click_push_permission", c188727au.LIZ);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.rw, viewGroup, false);
        View findViewById = LIZIZ.findViewById(R.id.lbt);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.toggle_switch)");
        this.LJLIL = (C71897SJp) findViewById;
        View findViewById2 = LIZIZ.findViewById(R.id.kxs);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.switch_title)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        C71897SJp c71897SJp = this.LJLIL;
        if (c71897SJp != null) {
            C16880lQ.LJJJI(c71897SJp, this);
            C71897SJp c71897SJp2 = this.LJLIL;
            if (c71897SJp2 != null) {
                c71897SJp2.setVisibility(0);
                return LIZIZ;
            }
            o.LJIJI("settingToggle");
            throw null;
        }
        o.LJIJI("settingToggle");
        throw null;
    }
}
