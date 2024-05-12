package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.group;

import X.AnonymousClass404;
import X.AnonymousClass408;
import X.AnonymousClass409;
import X.C1023940d;
import X.C17N;
import X.C214298b3;
import X.C3WL;
import X.C40F;
import X.C40H;
import X.C40I;
import X.C42Q;
import X.C47704Ins;
import X.C55749LuL;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C89333ez;
import X.C8W0;
import X.C8YN;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.TBT;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatVM;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupChatNoticeAssem extends CommonChatNoticeAssem {
    public final C55749LuL LJLLLLLL;
    public final C55749LuL LJLZ;
    public final C5H3 LJZ;
    public final C5H3 LJZI;
    public final C214298b3 LJZL;
    public final C214298b3 LL;
    public final C5H3 LLD;
    public AnonymousClass404 LLF;
    public final C5H3 LLFF;
    public final C5H3 LLFFF;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.45d, X.404] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeAssem, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        super.I3();
        Object value = this.LLFF.getValue();
        o.LJIIIIZZ(value, "<get-bottomContainerView>(...)");
        final ViewGroup viewGroup = (ViewGroup) value;
        final AnonymousClass408 anonymousClass408 = new AnonymousClass408(this);
        final AnonymousClass409 anonymousClass409 = new AnonymousClass409(this);
        final AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(this, 254);
        final AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(this, 799);
        ?? r1 = new C42Q<C1023940d, C3WL>(viewGroup, anonymousClass408, anonymousClass409, aqS167S0100000_1, aqS151S0100000_1) { // from class: X.404
            public final InterfaceC65784Pro<C76800UCe> LJ;
            public final InterfaceC65784Pro<C76800UCe> LJFF;
            public final InterfaceC88472Yns<C63120Opw, C76800UCe> LJI;
            public final InterfaceC65784Pro<C63120Opw> LJII;

            @Override // X.AbstractC1036945d
            public final void LIZIZ() {
                C3WL c3wl = (C3WL) this.LIZLLL;
                if (c3wl != null) {
                    c3wl.setVisibility(8);
                    c3wl.LJJZ();
                }
                this.LJFF.invoke();
            }

            @Override // X.AbstractC1036945d
            public final Object LJ(C1023940d c1023940d, InterfaceC67352kd<? super C3WY> interfaceC67352kd) {
                C3WL c3wl = (C3WL) this.LIZLLL;
                if (c3wl != null) {
                    C63120Opw invoke = this.LJII.invoke();
                    c3wl.LJJLL(invoke, this.LJI);
                    c3wl.setVisibility(0);
                    C84283Sm.LIZ.getClass();
                    if (o.LJ(C84283Sm.LIZJ(invoke), C3NB.LIZ)) {
                        this.LJ.invoke();
                        return c3wl;
                    }
                    this.LJFF.invoke();
                    return c3wl;
                }
                return null;
            }

            @Override // X.AbstractC1036945d
            public final Object LJFF(C1023940d c1023940d, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
                if (this.LIZ.isDebugMode()) {
                    return Boolean.TRUE;
                }
                if (this.LJII.invoke() == null) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!C84283Sm.LJII(r0));
            }

            {
                C41X c41x = C41X.BLOCK;
                this.LJ = anonymousClass408;
                this.LJFF = anonymousClass409;
                this.LJI = aqS167S0100000_1;
                this.LJII = aqS151S0100000_1;
            }
        };
        ((GroupChatNoticeViewModel) this.LJZL.getValue()).LJLIL.LJIIJJI(r1);
        this.LLF = r1;
        C8YN.LJII(this, (AssemViewModel) this.LL.getValue(), new TBT() { // from class: X.40G
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C40B) obj).LJLJI;
            }
        }, null, new AqS183S0100000_1(this, 73), 6);
        C8YN.LJII(this, (AssemViewModel) this.LL.getValue(), new TBT() { // from class: X.40E
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C40B) obj).LJLILLLLZI);
            }
        }, null, new AqS183S0100000_1(this, 74), 6);
    }

    public GroupChatNoticeAssem() {
        new LinkedHashMap();
        this.LJLLLLLL = new C55749LuL(C47704Ins.LIZJ(this, C40I.class, null), checkSupervisorPrepared());
        this.LJLZ = new C55749LuL(C47704Ins.LIZJ(this, C89333ez.class, null), checkSupervisorPrepared());
        this.LJZ = C17N.LJJIJL(new AqS151S0100000_1(this, 348));
        this.LJZI = C17N.LJJIJL(new AqS151S0100000_1(this, 347));
        C9BE c9be = C9BE.LIZ;
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((C8W0) this, 351);
        C65776Prg LIZ = C65352Pkq.LIZ(GroupChatNoticeViewModel.class);
        this.LJZL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 800), C40H.INSTANCE, aqS151S0100000_1);
        C65776Prg LIZ2 = C65352Pkq.LIZ(GroupChatVM.class);
        this.LL = C78926UyI.LJ(this, LIZ2, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ2, 350), C40F.INSTANCE, null);
        this.LLD = C17N.LJJIJL(new AqS151S0100000_1(this, 346));
        this.LLFF = C17N.LJJIJL(new AqS151S0100000_1(this, 345));
        this.LLFFF = C17N.LJJIJL(new AqS151S0100000_1(this, 349));
    }
}
