package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.AbstractC65781Prl;
import X.C1JI;
import X.C1ZD;
import X.EnumC21450sn;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PIViewModel$modalBottomSheetState$2 extends AbstractC65781Prl implements InterfaceC65784Pro<C1ZD> {
    public static final PIViewModel$modalBottomSheetState$2 INSTANCE = new PIViewModel$modalBottomSheetState$2();

    public PIViewModel$modalBottomSheetState$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final C1ZD invoke() {
        return new C1ZD(EnumC21450sn.Hidden, C1JI.LJJIJIIJIL(LiveMaxRetainAlogMessageSizeSetting.DEFAULT, 0, null, 6), AnonymousClass1.INSTANCE);
    }

    /* renamed from: com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$modalBottomSheetState$2$1, reason: invalid class name */
    /* loaded from: classes20.dex */
    public final class AnonymousClass1 extends AbstractC65781Prl implements InterfaceC88472Yns<EnumC21450sn, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.InterfaceC88472Yns
        public final Boolean invoke(EnumC21450sn value) {
            boolean z;
            o.LJIIIZ(value, "value");
            if (value != EnumC21450sn.HalfExpanded) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }
}
