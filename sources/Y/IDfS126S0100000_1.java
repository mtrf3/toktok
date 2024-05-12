package Y;

import X.AbstractC1039846g;
import X.C0A2;
import X.C1039546d;
import X.C1039946h;
import X.C106074Eh;
import X.C106084Ei;
import X.C106184Es;
import X.C107624Kg;
import X.C108904Pe;
import X.C1C9;
import X.C1GE;
import X.C33M;
import X.C34L;
import X.C34N;
import X.C3CK;
import X.C3CM;
import X.C3H6;
import X.C3XR;
import X.C47261Igj;
import X.C49710Jf8;
import X.C57962Mow;
import X.C68322mC;
import X.C71042qa;
import X.C71082qe;
import X.C76800UCe;
import X.C78880UxY;
import X.C80033Cd;
import X.C80343Di;
import X.C86323a8;
import X.C86353aB;
import X.C87933cj;
import X.C94103mg;
import X.C98453th;
import X.EXV;
import X.EnumC106114El;
import X.EnumC107604Ke;
import X.EnumC58928NAu;
import X.InterfaceC57784Mm4;
import X.InterfaceC64672gJ;
import X.InterfaceC65462ha;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import X.JBR;
import X.ORZ;
import X.OSZ;
import X.SY4;
import X.V1M;
import X.X1D;
import X.XKO;
import X.XKX;
import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.casting.ui.casting.CastingPanelComponent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.base.EventReceiver;
import com.ss.android.ugc.aweme.im.sdk.chat.experiment.SuggestedReplyExperiment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarButtonConf;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarConf;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.ui.ActionBarComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheet;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.SuggestedReplyViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data.SuggestedReply;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchDefaultVM;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopFeedFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS26S0210000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDfS126S0100000_1 implements InterfaceC64672gJ {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC64672gJ
    public final Object emit(List<? extends C3H6> list, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        switch (this.$t) {
            case 0:
                return emit$0(this, list, interfaceC67352kd);
            case 1:
                return emit$1(this, list, interfaceC67352kd);
            case 2:
                return emit$2(this, list, interfaceC67352kd);
            case 3:
                return emit$3(this, list, interfaceC67352kd);
            case 4:
                return emit$4(this, list, interfaceC67352kd);
            case 5:
                return emit$5(this, list, interfaceC67352kd);
            case 6:
                return emit$6(this, list, interfaceC67352kd);
            case 7:
                return emit$7(this, list, interfaceC67352kd);
            case 8:
                return emit$8(this, list, interfaceC67352kd);
            case 9:
                return emit$9(this, list, interfaceC67352kd);
            case 10:
                return emit$10(this, list, interfaceC67352kd);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return emit$11(this, list, interfaceC67352kd);
            case 12:
                return emit$12(this, list, interfaceC67352kd);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return emit$13(this, list, interfaceC67352kd);
            case 14:
                return emit$14(this, list, interfaceC67352kd);
            case 15:
                return emit$15(this, list, interfaceC67352kd);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return emit$16(this, list, interfaceC67352kd);
            case 17:
                return emit$17(this, list, interfaceC67352kd);
            case 18:
                return emit$18(this, list, interfaceC67352kd);
            case 19:
                return emit$19(this, list, interfaceC67352kd);
            case 20:
                return emit$20(this, list, interfaceC67352kd);
            case 21:
                return emit$21(this, list, interfaceC67352kd);
            case 22:
                return emit$22(this, list, interfaceC67352kd);
            case 23:
                return emit$23(this, list, interfaceC67352kd);
            case 24:
                return emit$24(this, list, interfaceC67352kd);
            case 25:
                return emit$25(this, list, interfaceC67352kd);
            case 26:
                return emit$26(this, list, interfaceC67352kd);
            case 27:
                return emit$27(this, list, interfaceC67352kd);
            case 28:
                return emit$28(this, list, interfaceC67352kd);
            case 29:
                return emit$29(this, list, interfaceC67352kd);
            case 30:
                return emit$30(this, list, interfaceC67352kd);
            case 31:
                return emit$31(this, list, interfaceC67352kd);
            default:
                return null;
        }
    }

    public IDfS126S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object emit$0(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        List list = (List) obj;
        if (C1GE.LJIILIIL(list)) {
            ((C3XR) iDfS126S0100000_1.l0).LJI.submitList(list);
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$1(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        OSZ osz = (OSZ) obj;
        ((C3XR) iDfS126S0100000_1.l0).LIZJ.LIZIZ((String) osz.getFirst(), (String) osz.getSecond());
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$10(Y.IDfS126S0100000_1 r5, java.lang.Object r6, X.InterfaceC67352kd r7) {
        /*
            boolean r0 = r7 instanceof X.C3FA
            if (r0 == 0) goto L3e
            r4 = r7
            X.3FA r4 = (X.C3FA) r4
            int r2 = r4.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r4.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLILLLLZI
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L44
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r1 = r5.l0
            X.2gJ r1 = (X.InterfaceC64672gJ) r1
            r0 = r6
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L20
            r4.LJLILLLLZI = r2
            java.lang.Object r0 = r1.emit(r6, r4)
            if (r0 != r3) goto L20
            return r3
        L3e:
            X.3FA r4 = new X.3FA
            r4.<init>(r5, r7)
            goto L12
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS126S0100000_1.emit$10(Y.IDfS126S0100000_1, java.lang.Object, X.2kd):java.lang.Object");
    }

    public static final Object emit$11(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns;
        EventReceiver eventReceiver = (EventReceiver) iDfS126S0100000_1.l0;
        if (!eventReceiver.LJLJJL && ((interfaceC88472Yns = eventReceiver.LJLJI.get(new Integer(obj.hashCode()))) != null || (interfaceC88472Yns = ((EventReceiver) iDfS126S0100000_1.l0).LJLJI.get(new Integer(obj.getClass().hashCode()))) != null)) {
            interfaceC88472Yns.invoke(obj);
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$12(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C71082qe c71082qe;
        C34L c34l;
        if (((Boolean) obj).booleanValue() && (c71082qe = C71042qa.LIZIZ) != null && (c34l = c71082qe.LIZJ) != null) {
            C34N listener = (C34N) iDfS126S0100000_1.l0;
            o.LJIIIZ(listener, "listener");
            c34l.LJIIIZ.add(new WeakReference<>(listener));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$13(Y.IDfS126S0100000_1 r5, java.lang.Object r6, X.InterfaceC67352kd r7) {
        /*
            boolean r0 = r7 instanceof X.C3FF
            if (r0 == 0) goto L37
            r4 = r7
            X.3FF r4 = (X.C3FF) r4
            int r2 = r4.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r4.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLILLLLZI
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L3d
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r1 = r5.l0
            X.2gJ r1 = (X.InterfaceC64672gJ) r1
            boolean r0 = r6 instanceof X.C59702Vy
            if (r0 == 0) goto L20
            r4.LJLILLLLZI = r2
            java.lang.Object r0 = r1.emit(r6, r4)
            if (r0 != r3) goto L20
            return r3
        L37:
            X.3FF r4 = new X.3FF
            r4.<init>(r5, r7)
            goto L12
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS126S0100000_1.emit$13(Y.IDfS126S0100000_1, java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$14(Y.IDfS126S0100000_1 r7, java.lang.Object r8, X.InterfaceC67352kd r9) {
        /*
            boolean r0 = r9 instanceof X.C73172u1
            if (r0 == 0) goto Lb8
            r4 = r9
            X.2u1 r4 = (X.C73172u1) r4
            int r2 = r4.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb8
            int r2 = r2 - r1
            r4.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLILLLLZI
            r5 = 1
            if (r0 == 0) goto L23
            if (r0 != r5) goto Lbf
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r6 = r7.l0
            X.2gJ r6 = (X.InterfaceC64672gJ) r6
            X.2Vy r8 = (X.C59702Vy) r8
            java.util.List<com.ss.android.ugc.aweme.im.sdk.common.data.model.SuggestedStickerStruct> r0 = r8.LIZ
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r9 = r0.iterator()
        L37:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r8 = r9.next()
            com.ss.android.ugc.aweme.im.sdk.common.data.model.SuggestedStickerStruct r8 = (com.ss.android.ugc.aweme.im.sdk.common.data.model.SuggestedStickerStruct) r8
            java.lang.Integer r2 = r8.getStickerType()
            X.2u6 r0 = X.EnumC73222u6.STATIC
            int r1 = r0.getType()
            if (r2 != 0) goto La0
        L50:
            java.lang.Integer r2 = r8.getStickerType()
            X.2u6 r0 = X.EnumC73222u6.ANIMATED
            int r1 = r0.getType()
            if (r2 != 0) goto La7
        L5c:
            r0 = 0
        L5d:
            if (r0 == 0) goto L6e
            com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker r0 = r8.getSetSticker()
            if (r0 == 0) goto L37
            X.2u2 r1 = new X.2u2
            r1.<init>(r0)
        L6a:
            r7.add(r1)
            goto L37
        L6e:
            java.lang.Integer r2 = r8.getStickerType()
            X.2u6 r0 = X.EnumC73222u6.VIDEO_STICKER_STATIC
            int r1 = r0.getType()
            if (r2 != 0) goto L87
        L7a:
            java.lang.Integer r2 = r8.getStickerType()
            X.2u6 r0 = X.EnumC73222u6.VIDEO_STICKER_ANIMATED
            int r1 = r0.getType()
            if (r2 != 0) goto L8e
            goto L37
        L87:
            int r0 = r2.intValue()
            if (r0 == r1) goto L94
            goto L7a
        L8e:
            int r0 = r2.intValue()
            if (r0 != r1) goto L37
        L94:
            com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker r0 = r8.getVideoSticker()
            if (r0 == 0) goto L37
            X.2u3 r1 = new X.2u3
            r1.<init>(r0)
            goto L6a
        La0:
            int r0 = r2.intValue()
            if (r0 == r1) goto Lad
            goto L50
        La7:
            int r0 = r2.intValue()
            if (r0 != r1) goto L5c
        Lad:
            r0 = 1
            goto L5d
        Laf:
            r4.LJLILLLLZI = r5
            java.lang.Object r0 = r6.emit(r7, r4)
            if (r0 != r3) goto L20
            return r3
        Lb8:
            X.2u1 r4 = new X.2u1
            r4.<init>(r7, r9)
            goto L12
        Lbf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS126S0100000_1.emit$14(Y.IDfS126S0100000_1, java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$15(Y.IDfS126S0100000_1 r6, java.lang.Object r7, X.InterfaceC67352kd r8) {
        /*
            boolean r0 = r8 instanceof X.C3FB
            if (r0 == 0) goto L55
            r5 = r8
            X.3FB r5 = (X.C3FB) r5
            int r2 = r5.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L55
            int r2 = r2 - r1
            r5.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLILLLLZI
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L5b
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r2 = r6.l0
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            java.util.List r7 = (java.util.List) r7
            int r1 = r7.size()
            int r0 = X.C73022tm.LJFF()
            if (r1 >= r0) goto L41
            X.OQg r7 = X.C61878OQg.INSTANCE
        L38:
            r5.LJLILLLLZI = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            if (r0 != r4) goto L20
            return r4
        L41:
            int r1 = r7.size()
            int r0 = X.C73022tm.LJFF()
            if (r1 <= r0) goto L38
            int r1 = X.C73022tm.LJFF()
            r0 = 0
            java.util.List r7 = r7.subList(r0, r1)
            goto L38
        L55:
            X.3FB r5 = new X.3FB
            r5.<init>(r6, r8)
            goto L12
        L5b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS126S0100000_1.emit$15(Y.IDfS126S0100000_1, java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$16(Y.IDfS126S0100000_1 r5, java.lang.Object r6, X.InterfaceC67352kd r7) {
        /*
            boolean r0 = r7 instanceof X.C3FC
            if (r0 == 0) goto L41
            r4 = r7
            X.3FC r4 = (X.C3FC) r4
            int r2 = r4.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r4.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLILLLLZI
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L47
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r1 = r5.l0
            X.2gJ r1 = (X.InterfaceC64672gJ) r1
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            if (r0 <= r2) goto L38
            X.2u5 r0 = X.C73212u5.LIZ
            java.util.List r6 = X.ORZ.LLIIJI(r0, r6)
        L38:
            r4.LJLILLLLZI = r2
            java.lang.Object r0 = r1.emit(r6, r4)
            if (r0 != r3) goto L20
            return r3
        L41:
            X.3FC r4 = new X.3FC
            r4.<init>(r5, r7)
            goto L12
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS126S0100000_1.emit$16(Y.IDfS126S0100000_1, java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$17(Y.IDfS126S0100000_1 r7, java.lang.Object r8, X.InterfaceC67352kd r9) {
        /*
            boolean r0 = r9 instanceof X.C83833Qt
            if (r0 == 0) goto L48
            r6 = r9
            X.3Qt r6 = (X.C83833Qt) r6
            int r2 = r6.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r6.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLILLLLZI
            r4 = 1
            if (r0 == 0) goto L23
            if (r0 != r4) goto L4e
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r3 = r7.l0
            X.2gJ r3 = (X.InterfaceC64672gJ) r3
            X.3Nu r8 = (X.C83063Nu) r8
            X.3FK r0 = X.C3FK.LIZ
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = r8.LIZ
            r0.getClass()
            r0 = 0
            java.util.List r2 = X.C3FK.LIZJ(r0, r1)
            boolean r1 = r8.LIZIZ
            X.3Nu r0 = new X.3Nu
            r0.<init>(r2, r1)
            r6.LJLILLLLZI = r4
            java.lang.Object r0 = r3.emit(r0, r6)
            if (r0 != r5) goto L20
            return r5
        L48:
            X.3Qt r6 = new X.3Qt
            r6.<init>(r7, r9)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS126S0100000_1.emit$17(Y.IDfS126S0100000_1, java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$18(Y.IDfS126S0100000_1 r8, java.lang.Object r9, X.InterfaceC67352kd r10) {
        /*
            boolean r0 = r10 instanceof X.C83843Qu
            if (r0 == 0) goto L71
            r4 = r10
            X.3Qu r4 = (X.C83843Qu) r4
            int r2 = r4.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r4.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLILLLLZI
            r5 = 1
            if (r0 == 0) goto L23
            if (r0 != r5) goto L77
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r6 = r8.l0
            X.2gJ r6 = (X.InterfaceC64672gJ) r6
            X.3Nu r9 = (X.C83063Nu) r9
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMContact> r0 = r9.LIZ
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r0.iterator()
        L37:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r2 = r7.next()
            r1 = r2
            com.ss.android.ugc.aweme.im.service.model.IMContact r1 = (com.ss.android.ugc.aweme.im.service.model.IMContact) r1
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.service.model.IMUser
            if (r0 == 0) goto L59
            com.ss.android.ugc.aweme.im.service.model.IMUser r1 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r1
            int r1 = r1.getInternalShareHoldoutVersion()
            X.3R9 r0 = X.C82563Lw.LJLJJLL
            boolean r0 = r0.LJIIZILJ
            boolean r0 = X.C83873Qx.LIZ(r1, r0)
            if (r0 == 0) goto L59
            goto L37
        L59:
            r8.add(r2)
            goto L37
        L5d:
            java.util.List r2 = X.ORZ.LLJILJILJ(r8)
            boolean r1 = r9.LIZIZ
            X.3Nu r0 = new X.3Nu
            r0.<init>(r2, r1)
            r4.LJLILLLLZI = r5
            java.lang.Object r0 = r6.emit(r0, r4)
            if (r0 != r3) goto L20
            return r3
        L71:
            X.3Qu r4 = new X.3Qu
            r4.<init>(r8, r10)
            goto L12
        L77:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS126S0100000_1.emit$18(Y.IDfS126S0100000_1, java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$19(Y.IDfS126S0100000_1 r7, java.lang.Object r8, X.InterfaceC67352kd r9) {
        /*
            boolean r0 = r9 instanceof X.C83853Qv
            if (r0 == 0) goto L4f
            r6 = r9
            X.3Qv r6 = (X.C83853Qv) r6
            int r2 = r6.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r6.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLILLLLZI
            r4 = 1
            if (r0 == 0) goto L23
            if (r0 != r4) goto L55
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r3 = r7.l0
            X.2gJ r3 = (X.InterfaceC64672gJ) r3
            X.3Nu r8 = (X.C83063Nu) r8
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMContact> r0 = r8.LIZ
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L45
            X.3MU r1 = X.C82563Lw.LJLJI
            X.3MU r0 = X.C3MU.LOADED
            if (r1 == r0) goto L45
            X.3Qy r2 = X.C83883Qy.LIZ
        L3c:
            r6.LJLILLLLZI = r4
            java.lang.Object r0 = r3.emit(r2, r6)
            if (r0 != r5) goto L20
            return r5
        L45:
            X.3Qr r2 = new X.3Qr
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = r8.LIZ
            boolean r0 = r8.LIZIZ
            r2.<init>(r1, r0)
            goto L3c
        L4f:
            X.3Qv r6 = new X.3Qv
            r6.<init>(r7, r9)
            goto L12
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS126S0100000_1.emit$19(Y.IDfS126S0100000_1, java.lang.Object, X.2kd):java.lang.Object");
    }

    public static final Object emit$2(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        ((C3XR) iDfS126S0100000_1.l0).LIZJ.LIZ((String) obj);
        return C76800UCe.LIZ;
    }

    public static final Object emit$20(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C33M c33m = (C33M) obj;
        boolean z = c33m.LIZ;
        List<InterfaceC57784Mm4> list = c33m.LIZIZ;
        C87933cj c87933cj = c33m.LIZJ;
        C98453th c98453th = (C98453th) ((IMSearchDefaultVM) iDfS126S0100000_1.l0).LJLILLLLZI.getValue();
        StringBuilder LJI = JBR.LJI("shouldScrollToTop ", z, " defaultContentList size ");
        LJI.append(list.size());
        c98453th.LJFF(X1D.LIZIZ(LJI));
        ((IMSearchDefaultVM) iDfS126S0100000_1.l0).setState(new AqS26S0210000_1(z, (boolean) list, (List<? extends InterfaceC57784Mm4>) c87933cj, (C87933cj) 4));
        return C76800UCe.LIZ;
    }

    public static final Object emit$21(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C86323a8 c86323a8 = (C86323a8) obj;
        String str = c86323a8.LJLIL;
        List<Object> list = c86323a8.LJLILLLLZI;
        long j = c86323a8.LJLJI;
        ((IMSearchVM) iDfS126S0100000_1.l0).setState(new C86353aB(c86323a8.LJLJJI, j, str, list));
        return C76800UCe.LIZ;
    }

    public static final Object emit$22(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        Object LJIIL = V1M.LJIIL(interfaceC67352kd, (InterfaceC65462ha) obj, (InterfaceC64672gJ) iDfS126S0100000_1.l0);
        if (LJIIL == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJIIL;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object emit$23(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        ((C68322mC) iDfS126S0100000_1.l0).element = obj;
        throw new C3CM(iDfS126S0100000_1);
    }

    public static final Object emit$24(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C3CK c3ck = (C3CK) iDfS126S0100000_1.l0;
        if (obj == null) {
            obj = C94103mg.LIZ;
        }
        Object LJIIIZ = c3ck.LJIIIZ(obj, interfaceC67352kd);
        if (LJIIIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJIIIZ;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object emit$25(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C68322mC c68322mC = (C68322mC) iDfS126S0100000_1.l0;
        if (c68322mC.element == C94103mg.LIZ) {
            c68322mC.element = obj;
            return C76800UCe.LIZ;
        }
        "Flow has more than one element".toString();
        throw new IllegalArgumentException("Flow has more than one element");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.3BS, T] */
    public static final Object emit$26(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C68322mC c68322mC = (C68322mC) iDfS126S0100000_1.l0;
        T t = c68322mC.element;
        ?? r0 = C94103mg.LIZ;
        if (t == r0) {
            c68322mC.element = obj;
            return C76800UCe.LIZ;
        }
        c68322mC.element = r0;
        throw new C3CM(iDfS126S0100000_1);
    }

    public static final Object emit$27(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        List<ActionBarButtonConf> actionBarButtonConf;
        AbstractC1039846g abstractC1039846g = (AbstractC1039846g) obj;
        if (abstractC1039846g instanceof C1039546d) {
            List<SuggestedReply> suggestedReplyList = ((C1039546d) abstractC1039846g).LIZ;
            C106074Eh c106074Eh = new C106074Eh(((ActionBarComponent) iDfS126S0100000_1.l0).LIZIZ());
            o.LJIIIZ(suggestedReplyList, "suggestedReplyList");
            String LIZJ = C106184Es.LIZJ();
            ActionBarConf actionBarConf = (ActionBarConf) ((LinkedHashMap) C106184Es.LIZ).get(LIZJ);
            if (actionBarConf != null && (actionBarButtonConf = actionBarConf.getActionBarButtonConf()) != null) {
                List LLJILJILJ = ORZ.LLJILJILJ(actionBarButtonConf);
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) LLJILJILJ).iterator();
                int i = 0;
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i + 1;
                    if (i >= 0) {
                        ActionBarButtonConf actionBarButtonConf2 = (ActionBarButtonConf) next;
                        Integer type = actionBarButtonConf2.getType();
                        int value = EnumC106114El.NORMAL_EMOJI.getValue();
                        if (type == null || type.intValue() != value) {
                            Integer type2 = actionBarButtonConf2.getType();
                            int value2 = EnumC106114El.SUGGESTED_REPLY.getValue();
                            if (type2 != null) {
                                if (type2.intValue() != value2) {
                                }
                            }
                            i = i3;
                        }
                        if (i2 == suggestedReplyList.size()) {
                            arrayList.add(Integer.valueOf(i));
                        } else {
                            String uri = new Uri.Builder().scheme("aweme").authority("im").appendPath("action_bar").appendPath("text").appendQueryParameter("conversation_id", "CONVERSATION_ID").appendQueryParameter("text", C78880UxY.LJJJJI((SuggestedReply) ListProtector.get(suggestedReplyList, i2))).build().toString();
                            o.LJIIIIZZ(uri, "Builder()\n              …      .build().toString()");
                            ListProtector.set(LLJILJILJ, i, new ActionBarButtonConf(Integer.valueOf(EnumC106114El.SUGGESTED_REPLY.getValue()), uri, C78880UxY.LJJJJI((SuggestedReply) ListProtector.get(suggestedReplyList, i2)), null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 524280, null));
                            i2++;
                        }
                        i = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ListProtector.remove(LLJILJILJ, ((Number) it2.next()).intValue());
                }
                C106184Es.LIZ.put(LIZJ, ActionBarConf.copy$default(actionBarConf, LLJILJILJ, null, null, 6, null));
                c106074Eh.invoke();
            }
            if (SuggestedReplyExperiment.LIZLLL()) {
                ((ActionBarComponent) iDfS126S0100000_1.l0).LJLJLJ.getValue().getClass();
            } else if (SuggestedReplyExperiment.LIZJ()) {
                SuggestedReplyViewModel suggestedReplyViewModel = (SuggestedReplyViewModel) ((ActionBarComponent) iDfS126S0100000_1.l0).LJLJLJ.getValue();
                suggestedReplyViewModel.LJLIL.LIZIZ(suggestedReplyViewModel.LJLJJL);
            }
        } else if (abstractC1039846g instanceof C1039946h) {
            C106084Ei c106084Ei = new C106084Ei(((ActionBarComponent) iDfS126S0100000_1.l0).LIZIZ());
            C106184Es.LIZ.remove(C106184Es.LIZJ());
            c106084Ei.invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$28(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C80033Cd c80033Cd = (C80033Cd) obj;
        C49710Jf8 c49710Jf8 = ((TopFeedFragment) iDfS126S0100000_1.l0).LLJZ;
        if (c49710Jf8 != null) {
            int i = c80033Cd.LJLIL;
            C0A2 layoutManager = c49710Jf8.getLayoutManager();
            if (layoutManager != null) {
                final Context context = c49710Jf8.getContext();
                final int i2 = -1;
                C1C9 c1c9 = new C1C9(context) { // from class: X.3Wf
                    @Override // X.C1C9
                    public final int LJIILIIL() {
                        return i2;
                    }

                    @Override // X.C1C9
                    public final int LJIILJJIL() {
                        return i2;
                    }
                };
                c1c9.LIZ = i;
                layoutManager.LLIIIILZ(c1c9);
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("searchRecyclerView");
        throw null;
    }

    public static final Object emit$29(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        ((InterfaceC88472Yns) iDfS126S0100000_1.l0).invoke(obj);
        return C76800UCe.LIZ;
    }

    public static final Object emit$3(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        ((C3XR) iDfS126S0100000_1.l0).LIZIZ(null);
        return C76800UCe.LIZ;
    }

    public static final Object emit$30(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        int i = C107624Kg.LIZ[((EnumC107604Ke) obj).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    SY4 sy4 = ((C108904Pe) iDfS126S0100000_1.l0).LJLJJI;
                    sy4.setButtonVariant(5);
                    sy4.setText(R.string.cp9);
                }
            } else {
                SY4 sy42 = ((C108904Pe) iDfS126S0100000_1.l0).LJLJJI;
                sy42.setButtonVariant(5);
                sy42.setText(R.string.tdh);
            }
        } else {
            SY4 sy43 = ((C108904Pe) iDfS126S0100000_1.l0).LJLJJI;
            sy43.setButtonVariant(0);
            sy43.setText(R.string.qic);
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$31(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        ((C57962Mow) iDfS126S0100000_1.l0).LJJIFFI();
        return C76800UCe.LIZ;
    }

    public static final Object emit$4(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        ((C3XR) iDfS126S0100000_1.l0).LJFF();
        return C76800UCe.LIZ;
    }

    public static final Object emit$5(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        XKO channel = ((C3CK) iDfS126S0100000_1.l0).getChannel();
        if (obj == null) {
            obj = C94103mg.LIZ;
        }
        Object LJIIIZ = channel.LJIIIZ(obj, interfaceC67352kd);
        if (LJIIIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJIIIZ;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$6(Y.IDfS126S0100000_1 r9, java.lang.Object r10, X.InterfaceC67352kd r11) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS126S0100000_1.emit$6(Y.IDfS126S0100000_1, java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$7(Y.IDfS126S0100000_1 r6, java.lang.Object r7, X.InterfaceC67352kd r8) {
        /*
            boolean r0 = r8 instanceof X.C71102qg
            if (r0 == 0) goto L4c
            r5 = r8
            X.2qg r5 = (X.C71102qg) r5
            int r2 = r5.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r5.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLILLLLZI
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L52
            boolean r2 = r5.LJLJJL
            Y.IDfS126S0100000_1 r6 = r5.LJLJJI
            X.C141335gf.LIZJ(r1)
        L24:
            if (r2 == 0) goto L2c
            java.lang.Object r0 = r6.l0
            X.2qe r0 = (X.C71082qe) r0
            X.C71042qa.LIZIZ = r0
        L2c:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2f:
            X.C141335gf.LIZJ(r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r2 = r7.booleanValue()
            X.XLM r1 = X.C71042qa.LIZJ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r5.LJLJJI = r6
            r5.LJLJJL = r2
            r5.LJLILLLLZI = r3
            r1.setValue(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != r4) goto L24
            return r4
        L4c:
            X.2qg r5 = new X.2qg
            r5.<init>(r6, r8)
            goto L12
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS126S0100000_1.emit$7(Y.IDfS126S0100000_1, java.lang.Object, X.2kd):java.lang.Object");
    }

    public static final Object emit$8(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        if (((Boolean) obj).booleanValue()) {
            ((CastingPanelComponent) iDfS126S0100000_1.l0).init();
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$9(IDfS126S0100000_1 iDfS126S0100000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        Object LJI = XKX.LJI(EXV.LIZ, new C80343Di((IMReactionListSheet) iDfS126S0100000_1.l0, (OSZ) obj, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }
}
