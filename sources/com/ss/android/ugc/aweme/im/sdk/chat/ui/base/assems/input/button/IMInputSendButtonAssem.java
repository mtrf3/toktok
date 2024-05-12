package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button;

import X.C105644Cq;
import X.C16880lQ;
import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.TBT;
import Y.ACListenerS21S0100000_1;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.ChatRoomInputVM;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IMInputSendButtonAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public TuxIconView LJLILLLLZI;

    public void A3() {
    }

    public IMInputSendButtonAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ChatRoomInputVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 376), C105644Cq.INSTANCE, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C3(boolean r8) {
        /*
            r7 = this;
            com.bytedance.tux.icon.TuxIconView r6 = r7.LJLILLLLZI
            if (r6 == 0) goto L33
            boolean r5 = r6.isActivated()
            r6.setActivated(r8)
            if (r8 == 0) goto L3f
            android.content.Context r1 = r7.getContext()
            if (r1 == 0) goto L3f
            r0 = 2130968670(0x7f04005e, float:1.7546E38)
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r1)
            if (r0 == 0) goto L3f
            int r4 = r0.intValue()
        L20:
            r3 = 2130968641(0x7f040041, float:1.7545941E38)
        L23:
            android.graphics.drawable.Drawable r2 = r6.getBackground()
            if (r2 != 0) goto L34
        L29:
            r6.setTintColorRes(r3)
            if (r8 == 0) goto L33
            if (r5 != 0) goto L33
            X.C105624Co.LIZ(r6)
        L33:
            return
        L34:
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_OVER
            r1.<init>(r4, r0)
            r2.setColorFilter(r1)
            goto L29
        L3f:
            r4 = 0
            if (r8 == 0) goto L43
            goto L20
        L43:
            r3 = 2130968612(0x7f040024, float:1.7545883E38)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.IMInputSendButtonAssem.C3(boolean):void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        TuxIconView tuxIconView;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (view instanceof TuxIconView) {
            tuxIconView = (TuxIconView) view;
        } else {
            tuxIconView = null;
        }
        this.LJLILLLLZI = tuxIconView;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(0);
        }
        TuxIconView tuxIconView2 = this.LJLILLLLZI;
        if (tuxIconView2 != null) {
            C16880lQ.LJJJ(tuxIconView2, new ACListenerS21S0100000_1(this, 72));
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.4Cp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C105044Ai) obj).LJLILLLLZI;
            }
        }, null, new AqS183S0100000_1(this, 19), 6);
    }

    public final boolean v3(String str) {
        String str2;
        int i;
        boolean z;
        if (str != null) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (o.LJIIJJI(str.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i2++;
                    }
                } else {
                    if (!z) {
                        break;
                    }
                    length--;
                }
            }
            str2 = str.subSequence(i2, length + 1).toString();
        } else {
            str2 = null;
        }
        return TextUtils.isEmpty(str2);
    }

    public void x3(String str) {
        C3(!v3(str));
    }
}
