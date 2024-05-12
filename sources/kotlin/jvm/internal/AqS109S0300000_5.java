package kotlin.jvm.internal;

import X.AbstractC32698CsQ;
import X.AbstractC34571Xh;
import X.AbstractC65781Prl;
import X.BZW;
import X.C06900Ow;
import X.C0NB;
import X.C19030ot;
import X.C1DH;
import X.C28882BVe;
import X.C29306Beo;
import X.C30896CAq;
import X.C32477Cor;
import X.C32500CpE;
import X.C32502CpG;
import X.C32507CpL;
import X.C32515CpT;
import X.C76800UCe;
import X.EnumC12540eQ;
import X.InterfaceC30237Btp;
import X.InterfaceC30442Bx8;
import X.InterfaceC88472Yns;
import X.X1D;
import Y.ARunnableS16S0300000_5;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.model.LatestBanRecordInfo;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import com.bytedance.android.livesdk.qa.QuestionEx;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public class AqS109S0300000_5 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r1.size() > 1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AqS109S0300000_5 r9, java.lang.Object r10) {
        /*
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r6 = r10.booleanValue()
            java.lang.Object r0 = r9.l0
            X.CpL r0 = (X.C32507CpL) r0
            com.bytedance.android.livesdk.model.Gift r5 = r0.LJII
            if (r5 != 0) goto L11
        Le:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L11:
            java.util.List<com.bytedance.android.livesdk.gift.model.GiftColorInfo> r1 = r0.LIZLLL
            if (r1 == 0) goto L8a
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r0 = r1.isEmpty()
            r3 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L8a
            int r0 = r1.size()
            if (r0 <= r3) goto L8a
        L26:
            r7 = 0
            r1 = -1
            if (r3 == 0) goto L84
            java.lang.Object r0 = r9.l1
            X.CsQ r0 = (X.AbstractC32698CsQ) r0
            if (r0 == 0) goto L82
            long r3 = r0.LJIIL
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
        L37:
            X.Cp6 r8 = new X.Cp6
            if (r0 == 0) goto L3f
            long r1 = r0.longValue()
        L3f:
            r8.<init>(r5, r1)
        L42:
            java.lang.Object r2 = r9.l2
            X.CpE r2 = (X.C32500CpE) r2
            if (r6 == 0) goto L7f
            X.Cp5 r10 = X.EnumC32491Cp5.BANNER_FIRST_TIME_GIFT_BOX
        L4a:
            r6 = 0
            X.CqV r1 = r2.LJLJLJ
            boolean r0 = r1 instanceof X.C32676Cs4
            if (r0 == 0) goto L58
            r0 = r1
            X.Cs4 r0 = (X.C32676Cs4) r0
            if (r0 == 0) goto L58
            java.util.List<? extends com.bytedance.android.livesdk.model.Gift> r7 = r0.LJLLLL
        L58:
            boolean r0 = r1 instanceof X.C32676Cs4
            if (r0 == 0) goto L79
            X.Cs4 r1 = (X.C32676Cs4) r1
            if (r1 == 0) goto L79
            java.util.ArrayList<com.bytedance.android.livesdk.gift.model.GiftPage> r9 = r1.LLILLJJLI
            if (r9 == 0) goto L79
        L64:
            X.Cp2 r5 = new X.Cp2
            r5.<init>(r6, r7, r8, r9, r10)
            com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel r0 = r2.LJJIIJ()
            if (r0 == 0) goto Le
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r0.LJLIL
            if (r1 == 0) goto Le
            java.lang.Class<com.bytedance.android.livesdk.BoxGiftPageEvent> r0 = com.bytedance.android.livesdk.BoxGiftPageEvent.class
            r1.qv0(r0, r5)
            goto Le
        L79:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            goto L64
        L7f:
            X.Cp5 r10 = X.EnumC32491Cp5.BANNER
            goto L4a
        L82:
            r0 = r7
            goto L37
        L84:
            X.Cp6 r8 = new X.Cp6
            r8.<init>(r5, r1)
            goto L42
        L8a:
            r3 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS109S0300000_5.invoke$0(kotlin.jvm.internal.AqS109S0300000_5, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AqS109S0300000_5 aqS109S0300000_5, Object obj) {
        ((GameLinkGuestPresenter) aqS109S0300000_5.l0).popUpSuspendedDialog((LatestBanRecordInfo) obj, (Context) aqS109S0300000_5.l1, (LifecycleOwner) aqS109S0300000_5.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS109S0300000_5 aqS109S0300000_5, Object obj) {
        C28882BVe c28882BVe = (C28882BVe) aqS109S0300000_5.l0;
        new Exception();
        C19030ot c19030ot = (C19030ot) aqS109S0300000_5.l1;
        AbstractC34571Xh abstractC34571Xh = (AbstractC34571Xh) aqS109S0300000_5.l2;
        c28882BVe.getClass();
        c28882BVe.LJIIIZ = new ARunnableS16S0300000_5(c28882BVe, c19030ot, abstractC34571Xh, 11);
        c28882BVe.LJI.postValue(C06900Ow.LIZ());
        c28882BVe.LJFF.postValue(C06900Ow.LIZ());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS109S0300000_5 aqS109S0300000_5, Object obj) {
        Room LJIILL;
        EnumC12540eQ enumC12540eQ = (EnumC12540eQ) obj;
        o.LJIIIZ(enumC12540eQ, "switch");
        ((BZW) aqS109S0300000_5.l0).LJLJJL = enumC12540eQ;
        boolean z = false;
        if (enumC12540eQ == EnumC12540eQ.OFF && (LJIILL = C1DH.LJIILL((DataChannel) aqS109S0300000_5.l1)) != null && LJIILL.cppVersion == 1) {
            ((InterfaceC30237Btp) aqS109S0300000_5.l2).setAlpha(0.34f);
        } else {
            View view = ((BZW) aqS109S0300000_5.l0).LJLILLLLZI;
            if (!LiveRedDotOfflineEnableSetting.INSTANCE.getValue()) {
                Boolean LIZJ = InterfaceC30442Bx8.LLLLIIL.LIZJ();
                o.LJIIIIZZ(LIZJ, "LIVE_VOICE_EFFECT_RED_DOT_SHOW.value");
                if (LIZJ.booleanValue()) {
                    z = true;
                }
            }
            C29306Beo.LJJLIIIJJI(view, z);
            ((InterfaceC30237Btp) aqS109S0300000_5.l2).setAlpha(1.0f);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS109S0300000_5 aqS109S0300000_5, Object obj) {
        Long l = (Long) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateGiftGoalLabelIfNeeded onDelete ");
        LIZ.append(l);
        C0NB.LJIIIZ("LiveGoalUtils", X1D.LIZIZ(LIZ));
        C32502CpG.LJFF((RecyclerView) aqS109S0300000_5.l0, (DataChannel) aqS109S0300000_5.l1, l, (InterfaceC88472Yns) aqS109S0300000_5.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS109S0300000_5 aqS109S0300000_5, Object obj) {
        Long l;
        C32477Cor it = (C32477Cor) obj;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateGiftGoalLabelIfNeeded onChange ");
        C32515CpT c32515CpT = it.LIZ;
        Long l2 = null;
        if (c32515CpT != null) {
            l = Long.valueOf(c32515CpT.LJLIL);
        } else {
            l = null;
        }
        LIZ.append(l);
        C0NB.LJIIIZ("LiveGoalUtils", X1D.LIZIZ(LIZ));
        RecyclerView recyclerView = (RecyclerView) aqS109S0300000_5.l0;
        DataChannel dataChannel = (DataChannel) aqS109S0300000_5.l1;
        C32515CpT c32515CpT2 = it.LIZ;
        if (c32515CpT2 != null) {
            l2 = Long.valueOf(c32515CpT2.LJLIL);
        }
        C32502CpG.LJFF(recyclerView, dataChannel, l2, (InterfaceC88472Yns) aqS109S0300000_5.l2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS109S0300000_5(C28882BVe c28882BVe, C28882BVe c28882BVe2, C19030ot<Long> c19030ot, AbstractC34571Xh<QuestionEx> abstractC34571Xh) {
        super(1);
        this.$t = abstractC34571Xh;
        this.l0 = c28882BVe;
        this.l1 = c28882BVe2;
        this.l2 = c19030ot;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS109S0300000_5(BZW bzw, DataChannel dataChannel, InterfaceC30237Btp interfaceC30237Btp, int i) {
        super(1);
        this.$t = i;
        this.l0 = bzw;
        this.l1 = dataChannel;
        this.l2 = interfaceC30237Btp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS109S0300000_5(C32507CpL c32507CpL, C32507CpL c32507CpL2, AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ, C32500CpE c32500CpE) {
        super(1);
        this.$t = c32500CpE;
        this.l0 = c32507CpL;
        this.l1 = c32507CpL2;
        this.l2 = abstractC32698CsQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS109S0300000_5(RecyclerView recyclerView, RecyclerView recyclerView2, DataChannel dataChannel, InterfaceC88472Yns<? super Long, Integer> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.l0 = recyclerView;
        this.l1 = recyclerView2;
        this.l2 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS109S0300000_5(GameLinkGuestPresenter gameLinkGuestPresenter, Context context, LifecycleOwner lifecycleOwner, int i) {
        super(1);
        this.$t = i;
        this.l0 = gameLinkGuestPresenter;
        this.l1 = context;
        this.l2 = lifecycleOwner;
    }
}
