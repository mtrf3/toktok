package com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist;

import X.AI8;
import X.AIF;
import X.C188727au;
import X.C1FL;
import X.C221108m2;
import X.C238309Ww;
import X.C243989hq;
import X.C243999hr;
import X.C32151Nz;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C78688UuS;
import X.FMX;
import X.InterfaceC244219iD;
import X.InterfaceC74236TBo;
import X.O6R;
import X.SFS;
import X.TBT;
import Y.IDTListenerS114S0100000_4;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileAdvancedFeaturesCell extends PowerCell<C243999hr> implements InterfaceC244219iD {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJLL;
    public AI8 LJLIL;
    public Context LJLILLLLZI;
    public boolean LJLJJI;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 666));
    public final C243989hq LJLJJL = new C243989hq(this);

    static {
        TBT tbt = new TBT(ProfileAdvancedFeaturesCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/profile/editprofile/advancedfeatures/powerlist/IProfileCreatorCellControl;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJLL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC244219iD
    public final void LJIJI() {
        this.LJLJJI = false;
        this.itemView.setBackgroundColor(0);
        C243999hr item = getItem();
        int i = item != null ? item.LJLIL : 0;
        int adapterPosition = getAdapterPosition();
        String LJJIL = C78688UuS.LJJIL(i);
        if (TextUtils.isEmpty(LJJIL)) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("target", LJJIL);
        c188727au.LIZLLL(adapterPosition, "change_to");
        FMX.LJIIL("change_creator_tools_order", c188727au.LIZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
    }

    @Override // X.InterfaceC244219iD
    public final void LJIIJJI() {
        Integer num = (Integer) this.LJLJI.getValue();
        if (num != null) {
            this.itemView.setBackgroundColor(num.intValue());
        }
    }

    @Override // X.InterfaceC244219iD
    public final boolean LJJJJJL() {
        return this.LJLJJI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        if (r0 == null) goto L33;
     */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C243999hr r6) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.ProfileAdvancedFeaturesCell.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        boolean z;
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        this.LJLILLLLZI = context;
        boolean z2 = false;
        View LIZIZ = C1FL.LIZIZ(parent, R.layout.c3p, parent, false, "view");
        View findViewById = LIZIZ.findViewById(R.id.y9);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.advaned_features)");
        AI8 ai8 = (AI8) findViewById;
        this.LJLIL = ai8;
        Context context2 = this.LJLILLLLZI;
        if (context2 != null) {
            AIF aif = new AIF(context2, null);
            Context context3 = this.LJLILLLLZI;
            if (context3 != null) {
                TuxIconView tuxIconView = new TuxIconView(context3, null, 0, 6, null);
                tuxIconView.setIconRes(R.raw.icon_3_lines_horizontal);
                tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
                tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
                tuxIconView.setTintColorRes(R.attr.gp);
                tuxIconView.setOnTouchListener(new IDTListenerS114S0100000_4(this, 11));
                aif.LJIIL(tuxIconView);
                aif.LJIILL(false);
                ai8.setAccessory(aif);
                int LIZ = C238309Ww.LIZ();
                if (LIZ == 2 || LIZ == 4) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    AI8 ai82 = this.LJLIL;
                    if (ai82 != null) {
                        SFS.LJJIIJZLJL(ai82);
                        SFS.LJJIJ(ai82, R.raw.icon_3_lines_horizontal_2, R.attr.gx, 16, true);
                        SFS.LJJIJIIJIL(ai82, 41, R.attr.go);
                    } else {
                        o.LJIJI("advancedFeaturesCell");
                        throw null;
                    }
                } else {
                    int LIZ2 = C238309Ww.LIZ();
                    if (LIZ2 == 1 || LIZ2 == 3) {
                        z2 = true;
                    }
                    if (z2) {
                        AI8 ai83 = this.LJLIL;
                        if (ai83 != null) {
                            SFS.LJJIIJZLJL(ai83);
                            SFS.LJJIJ(ai83, R.raw.icon_3_lines_horizontal, R.attr.gx, 20, true);
                            SFS.LJJIJIIJIL(ai83, 102, R.attr.go);
                        } else {
                            o.LJIJI("advancedFeaturesCell");
                            throw null;
                        }
                    } else {
                        AI8 ai84 = this.LJLIL;
                        if (ai84 != null) {
                            SFS.LJJIJIIJIL(ai84, 102, R.attr.go);
                        } else {
                            o.LJIJI("advancedFeaturesCell");
                            throw null;
                        }
                    }
                }
                return LIZIZ;
            }
            o.LJIJI("parentContext");
            throw null;
        }
        o.LJIJI("parentContext");
        throw null;
    }
}
