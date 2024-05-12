package com.ss.android.ugc.aweme.nows.feed.ui.guide;

import X.C113554cx;
import X.C16880lQ;
import X.C197697pN;
import X.C198707r0;
import X.C2067089i;
import X.C2068389v;
import X.C210188Ms;
import X.C247519nX;
import X.C2MW;
import X.C37179EiV;
import X.C56331M8x;
import X.C7MK;
import X.EnumC198137q5;
import X.EnumC198697qz;
import X.HG3;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.RBX;
import X.X1D;
import Y.ACListenerS38S0200000_3;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.touchpoint.core.model.InviteBanner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS26S1000000_1;
import kotlin.jvm.internal.AqS8S2000000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowShareModuleCell extends PowerCell<C197697pN> {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        o.LJIIIIZZ(curUser, "userService().curUser");
        UrlModel avatarThumb = curUser.getAvatarThumb();
        if (avatarThumb != null) {
            AqS150S0200000_3 aqS150S0200000_3 = new AqS150S0200000_3(this, avatarThumb, 42);
            if (C210188Ms.LIZLLL()) {
                C37179EiV.LJFF.post(new ARunnableS39S0100000_3((InterfaceC65784Pro) aqS150S0200000_3, 209));
            } else {
                aqS150S0200000_3.invoke();
            }
        }
        ((TextView) this.itemView.findViewById(R.id.mzt)).setText(C56331M8x.LIZIZ(curUser, true, true));
        TextView textView = (TextView) this.itemView.findViewById(R.id.jtl);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('@');
        LIZ.append(curUser.getUniqueId());
        textView.setText(X1D.LIZIZ(LIZ));
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_n_sharelink;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        ((TuxIconView) this.itemView.findViewById(R.id.jtc)).setTuxIcon(c2068389v);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.jt8);
        o.LJIIIIZZ(tuxTextView, "itemView.share_desc");
        C2067089i.LIZ(R.string.j33, tuxTextView);
        C16880lQ.LJIL((ConstraintLayout) this.itemView.findViewById(R.id.jte), new ACListenerS38S0200000_3(this, curUser, 41));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        EnumC198697qz enumC198697qz;
        EnumC198697qz enumC198697qz2;
        String str;
        String str2;
        EnumC198137q5 enumC198137q5;
        EnumC198697qz enumC198697qz3;
        EnumC198697qz enumC198697qz4;
        String str3;
        Integer num;
        super.onViewAttachedToWindow();
        C197697pN item = getItem();
        EnumC198697qz enumC198697qz5 = null;
        if (item != null) {
            enumC198697qz = item.LJLIL;
        } else {
            enumC198697qz = null;
        }
        if (enumC198697qz == EnumC198697qz.HOMEPAGE_NOW) {
            InviteBanner inviteBanner = (InviteBanner) C2MW.LIZ().LIZLLL(21);
            ISpecActService LJJJIL = SpecActServiceImpl.LJJJIL();
            if (LJJJIL != null) {
                OSZ[] oszArr = new OSZ[3];
                if (inviteBanner != null) {
                    str3 = inviteBanner.notificationId;
                } else {
                    str3 = null;
                }
                oszArr[0] = new OSZ("notification_id", str3);
                oszArr[1] = new OSZ("classification", "now_tab_banner");
                if (inviteBanner != null) {
                    num = Integer.valueOf(inviteBanner.count);
                } else {
                    num = null;
                }
                oszArr[2] = new OSZ("count", String.valueOf(num));
                LJJJIL.LJIJJLI(C113554cx.LJJLIIIIJ(oszArr));
            }
            if (inviteBanner != null) {
                C247519nX.LJIIL(C247519nX.LIZ, inviteBanner.LIZ, C113554cx.LJJLIIIIJ(new OSZ("activity_name", inviteBanner.notificationName)), null, null, 60);
            }
        }
        C197697pN item2 = getItem();
        if (item2 == null || (enumC198697qz2 = item2.LJLIL) == null) {
            enumC198697qz2 = EnumC198697qz.FFP;
        }
        EnumC198697qz enumC198697qz6 = EnumC198697qz.FFP;
        String str4 = "now_find_friends_page";
        if (enumC198697qz2 == enumC198697qz6) {
            str = "now_find_friends_page";
        } else {
            str = "homepage_now";
        }
        int i = C198707r0.LIZ[enumC198697qz2.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                str2 = "";
            } else {
                str2 = "onboarding";
            }
        } else {
            str2 = "top_button";
        }
        C7MK.LJII("invite_button_show", new AqS8S2000000_3(str, str2, 3));
        C197697pN item3 = getItem();
        if (item3 == null || (enumC198137q5 = item3.LJLILLLLZI) == null) {
            enumC198137q5 = EnumC198137q5.NO_EVENT;
        }
        if (enumC198137q5 != EnumC198137q5.NO_EVENT) {
            C197697pN item4 = getItem();
            if (item4 != null) {
                enumC198697qz3 = item4.LJLIL;
            } else {
                enumC198697qz3 = null;
            }
            if (enumC198697qz3 != enumC198697qz6) {
                C197697pN item5 = getItem();
                if (item5 != null) {
                    enumC198697qz5 = item5.LJLIL;
                }
                if (enumC198697qz5 != EnumC198697qz.HOMEPAGE_NOW_TOP) {
                    return;
                }
            }
            C197697pN item6 = getItem();
            if (item6 == null || (enumC198697qz4 = item6.LJLIL) == null) {
                enumC198697qz4 = enumC198697qz6;
            }
            if (enumC198697qz4 != enumC198697qz6) {
                str4 = "homepage_now";
            }
            C7MK.LJII("qr_code_icon", new AqS26S1000000_1(str4, 9));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x053f, code lost:
    
        if (r10.size() <= 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0541, code lost:
    
        r3.setColors(X.ORZ.LLJ(r11), X.ORZ.LLIZ(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x054c, code lost:
    
        r3.setGradientType(0);
        r3.setOrientation(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0553, code lost:
    
        r3.setColors(X.ORZ.LLJ(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0529, code lost:
    
        r7 = android.graphics.drawable.GradientDrawable.Orientation.TR_BL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x052c, code lost:
    
        r7 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x052f, code lost:
    
        r7 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0532, code lost:
    
        r7 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x04cd, code lost:
    
        r10 = r6.locations;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x04cf, code lost:
    
        if (r10 != null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x04c7, code lost:
    
        if (r2 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x04cb, code lost:
    
        if (r6 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x04d1, code lost:
    
        r10 = X.C61878OQg.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x04d3, code lost:
    
        r3 = new android.graphics.drawable.GradientDrawable();
        r3.setCornerRadius(X.C32151Nz.LJIIZILJ(12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x04e3, code lost:
    
        if (r11 != 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x04e5, code lost:
    
        r3.setColor(L(r37, (java.lang.String) X.ORZ.LJLLLL(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x04f2, code lost:
    
        r5.setBackground(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x04f6, code lost:
    
        if (r11 == 1) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x04f9, code lost:
    
        if (r11 == 2) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x04fb, code lost:
    
        if (r11 == 3) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x04fe, code lost:
    
        if (r11 == 4) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0500, code lost:
    
        r7 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0502, code lost:
    
        r11 = new java.util.ArrayList(X.C32I.LJJL(r2, 10));
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0515, code lost:
    
        if (r2.hasNext() == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0517, code lost:
    
        r11.add(java.lang.Integer.valueOf(L(r37, (java.lang.String) r2.next())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0539, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L117;
     */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C197697pN r38) {
        /*
            Method dump skipped, instructions count: 1421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.feed.ui.guide.NowShareModuleCell.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        return C210188Ms.LIZIZ(context, R.layout.byi, parent, false, null);
    }

    public static int L(NowShareModuleCell nowShareModuleCell, String str) {
        int parseColor;
        nowShareModuleCell.getClass();
        if (str != null) {
            try {
                if (!ujb.o.LJJJLIIL(str, "#", false)) {
                    parseColor = CastIntegerProtector.parseInt(str);
                } else {
                    parseColor = Color.parseColor(str);
                }
                return parseColor;
            } catch (Throwable unused) {
            }
        }
        return -1;
    }
}
