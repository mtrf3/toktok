package com.ss.android.ugc.tiktok.addyours.ui.table;

import X.C218768iG;
import X.C55480Lq0;
import X.C71799SFv;
import X.C71897SJp;
import X.C78613UtF;
import X.C78939UyV;
import X.C90063gA;
import X.XKX;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddYoursInviteCellAssem extends InvitableCellAssem<AddYoursInviteCellAssem> {
    public C71799SFv LLFZ;
    public TuxTextView LLI;
    public TuxTextView LLIFFJFJJ;
    public TuxTextView LLII;
    public C71897SJp LLIIII;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.gl;
    }

    public AddYoursInviteCellAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.table.InvitableCellAssem
    public final void p4() {
        C71897SJp c71897SJp = this.LLIIII;
        if (c71897SJp != null) {
            c71897SJp.toggle();
        } else {
            o.LJIJI("checkBox");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.table.InvitableCellAssem, X.C8XO
    public final /* bridge */ /* synthetic */ void F0(Object obj) {
        F0((C218768iG) obj);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.table.InvitableCellAssem
    /* renamed from: m4 */
    public final void F0(C218768iG item) {
        Object avatarUrl;
        int i;
        o.LJIIIZ(item, "item");
        super.F0(item);
        C55480Lq0.LIZIZ.LIZ(249372162, true);
        C71799SFv c71799SFv = this.LLFZ;
        if (c71799SFv != null) {
            c71799SFv.setImageURI((Uri) null);
            UrlModel avatarModel = item.LJLIL.getAvatarModel();
            if (avatarModel != null) {
                avatarUrl = C78939UyV.LJ(avatarModel);
            } else {
                avatarUrl = item.LJLIL.getAvatarUrl();
            }
            C71799SFv c71799SFv2 = this.LLFZ;
            if (c71799SFv2 != null) {
                if (avatarUrl != null) {
                    XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C78613UtF.LIZ, null, new C90063gA(c71799SFv2, avatarUrl, null), 2);
                }
                TuxTextView tuxTextView = this.LLI;
                if (tuxTextView != null) {
                    tuxTextView.setText(item.LJLIL.getUserName());
                    TuxTextView tuxTextView2 = this.LLII;
                    if (tuxTextView2 != null) {
                        int i2 = 8;
                        if (item.LJLIL.isMuf()) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        tuxTextView2.setVisibility(i);
                        TuxTextView tuxTextView3 = this.LLIFFJFJJ;
                        if (tuxTextView3 != null) {
                            if (item.LJLIL.getInvited()) {
                                i2 = 0;
                            }
                            tuxTextView3.setVisibility(i2);
                            return;
                        }
                        o.LJIJI("invitedLabel");
                        throw null;
                    }
                    o.LJIJI("mufLabel");
                    throw null;
                }
                o.LJIJI("userName");
                throw null;
            }
            o.LJIJI("avatarView");
            throw null;
        }
        o.LJIJI("avatarView");
        throw null;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.table.InvitableCellAssem
    public final void n4(boolean z) {
        C71897SJp c71897SJp = this.LLIIII;
        if (c71897SJp != null) {
            c71897SJp.setChecked(z);
        } else {
            o.LJIJI("checkBox");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.table.InvitableCellAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.abh);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.avatar)");
        this.LLFZ = (C71799SFv) findViewById;
        View findViewById2 = view.findViewById(R.id.mzt);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.user_name)");
        this.LLI = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.b_d);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.check_box)");
        this.LLIIII = (C71897SJp) findViewById3;
        View findViewById4 = view.findViewById(R.id.ff8);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.label_invited)");
        this.LLIFFJFJJ = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.ff9);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.label_muf)");
        this.LLII = (TuxTextView) findViewById5;
        C71897SJp c71897SJp = this.LLIIII;
        if (c71897SJp != null) {
            c71897SJp.setInterceptToggleListener(new AqS153S0100000_3(this, 1452));
            C71799SFv c71799SFv = this.LLFZ;
            if (c71799SFv != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    c71799SFv.setForeground(new StateListDrawable());
                    return;
                }
                return;
            }
            o.LJIJI("avatarView");
            throw null;
        }
        o.LJIJI("checkBox");
        throw null;
    }
}
