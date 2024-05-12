package com.ss.android.ugc.feed.platform.cell.interact.info;

import X.C200667uA;
import X.C200677uB;
import X.C221108m2;
import X.C3C8;
import X.C51029K0z;
import X.C55096Ljo;
import X.C62822Ol8;
import X.C8VR;
import X.InterfaceC200587u2;
import X.InterfaceC65350Pko;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UpvoteVideoTrigger extends BaseCellTriggerComponent<UpvoteVideoTrigger> {
    public static final /* synthetic */ int LLFF = 0;
    public final C62822Ol8 LLF;

    public UpvoteVideoTrigger() {
        new LinkedHashMap();
        this.LLF = C221108m2.LIZIZ(C200667uA.LJLIL);
    }

    public final InterfaceC200587u2 l4() {
        return (InterfaceC200587u2) this.LLF.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LJ = l4().LJ();
        if (LJ != null) {
            return LJ;
        }
        throw new IllegalStateException("UpvoteVideoTrigger should have correct type");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(Object obj) {
        F0((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        super.F0(item);
        InteractAreaAttachAbility interactAreaAttachAbility = (InteractAreaAttachAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), InteractInfoAreaAttachAbility.class, null);
        if (interactAreaAttachAbility != null) {
            interactAreaAttachAbility.Sn(this, C200677uB.LJLIL);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, "others_homepage") != false) goto L18;
     */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k4(com.ss.android.ugc.aweme.feed.model.VideoItemParams r8) {
        /*
            r7 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r5 = r8.baseFeedPageParams
            X.7u2 r0 = r7.l4()
            X.Pko r0 = r0.LJ()
            r6 = 0
            if (r0 != 0) goto L13
            return r6
        L13:
            X.Ol8 r0 = X.C200687uC.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L2e
            X.7u2 r1 = r7.l4()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.getAweme()
            boolean r0 = r1.LIZLLL(r0, r5)
        L2d:
            return r0
        L2e:
            r4 = 0
            if (r5 == 0) goto L73
            java.lang.String r1 = r5.eventType
        L33:
            java.lang.String r0 = "personal_homepage"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L47
            if (r5 == 0) goto L71
            java.lang.String r1 = r5.eventType
        L3f:
            java.lang.String r0 = "others_homepage"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L56
        L47:
            X.M89 r0 = r5.param
            java.lang.String r1 = r0.getFrom()
            java.lang.String r0 = "REPOSTED_LIST_ENTRANCE"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L56
            r6 = 1
        L56:
            X.7u2 r3 = r7.l4()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r8.getAweme()
            if (r5 == 0) goto L6f
            java.lang.String r1 = r5.eventType
            java.lang.String r4 = X.C183877Jn.LIZ(r5)
        L66:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            boolean r0 = r3.LIZ(r2, r1, r4, r0)
            goto L2d
        L6f:
            r1 = r4
            goto L66
        L71:
            r1 = r4
            goto L3f
        L73:
            r1 = r4
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.info.UpvoteVideoTrigger.k4(com.ss.android.ugc.aweme.feed.model.VideoItemParams):boolean");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (l4().LJ() != null) {
            C8VR.LIZ(this, new AqS169S0100000_3(this, 581));
            InterfaceC200587u2 l4 = l4();
            InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4 = e4();
            BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).baseFeedPageParams;
            if (baseFeedPageParams != null) {
                str = baseFeedPageParams.eventType;
            } else {
                str = null;
            }
            l4.LIZIZ(this, e4, str);
        }
    }
}
