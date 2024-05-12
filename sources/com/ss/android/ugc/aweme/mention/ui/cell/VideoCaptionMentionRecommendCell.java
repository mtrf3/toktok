package com.ss.android.ugc.aweme.mention.ui.cell;

import X.C1DI;
import X.C214298b3;
import X.C218008h2;
import X.C218168hI;
import X.C218178hJ;
import X.C218188hK;
import X.C218198hL;
import X.C218208hM;
import X.C218218hN;
import X.C218228hO;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.YE1;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionRecommendViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoCaptionMentionRecommendCell extends PowerCell<C218008h2> {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    public VideoCaptionMentionRecommendCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoCaptionMentionRecommendViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 471);
        C218198hL c218198hL = C218198hL.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C218178hJ.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 472), new AqS153S0100000_3((InterfaceC93923mO) this, 473), C218228hO.INSTANCE, c218198hL, new AqS153S0100000_3((InterfaceC93923mO) this, 474), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C218188hK.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 475), new AqS153S0100000_3((InterfaceC93923mO) this, 466), C218218hN.INSTANCE, c218198hL, new AqS153S0100000_3((InterfaceC93923mO) this, 467), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C218168hI.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 468), new AqS153S0100000_3((InterfaceC93923mO) this, 469), new AqS153S0100000_3((InterfaceC93923mO) this, 470), c218198hL, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221108m2.LIZIZ(C218208hM.LJLIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x016e, code lost:
    
        if (android.text.TextUtils.equals(r2, r13) == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C218008h2 r18) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mention.ui.cell.VideoCaptionMentionRecommendCell.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bsl, viewGroup, false, "from(parent.context)\n   …list_item, parent, false)");
    }
}
