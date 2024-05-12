package kotlin.jvm.internal;

import X.AbstractC029409q;
import X.AbstractC65781Prl;
import X.AnonymousClass030;
import X.AnonymousClass476;
import X.C105454Bx;
import X.C109774Sn;
import X.C110754Wh;
import X.C111214Yb;
import X.C117984k6;
import X.C117994k7;
import X.C1799074g;
import X.C17N;
import X.C188727au;
import X.C235399Lr;
import X.C26045AKb;
import X.C36L;
import X.C3UY;
import X.C3VM;
import X.C43882HKc;
import X.C4AJ;
import X.C4E8;
import X.C4N7;
import X.C4N8;
import X.C4T1;
import X.C4T3;
import X.C4T4;
import X.C4TQ;
import X.C4TU;
import X.C61878OQg;
import X.C6BK;
import X.C76800UCe;
import X.C78685UuP;
import X.C80763Ey;
import X.C81573Ib;
import X.C84283Sm;
import X.C84803Um;
import X.C95593p5;
import X.C97343ru;
import X.C97383ry;
import X.EnumC97443s4;
import X.FMX;
import X.InterfaceC105124Aq;
import X.InterfaceC1798974f;
import X.InterfaceC88473Ynt;
import X.ORZ;
import X.OXG;
import X.RunnableC117154il;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.speech.speechengine.SpeechEngine;
import com.bytedance.speech.speechengine.SpeechEngineGenerator;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.audio.copyrightdetect.AudioCopyrightDetectAPI;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckRequest;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.feed.assem.review.VideoReviewStatusVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatRoomPanelAssem;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.assems.MessageRequestDeleteAllBtnAssem;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.assems.MessageRequestEditBtnsAssem;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.assems.MessageRequestEmptyAssem;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.assems.MessageRequestListAssem;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.assems.MessageRequestNoticeAssem;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDqS426S0100000_1 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case 9:
                return invoke$9(this, obj, obj2, obj3);
            case 10:
                return invoke$10(this, obj, obj2, obj3);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case 12:
                return invoke$12(this, obj, obj2, obj3);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj, obj2, obj3);
            case 14:
                return invoke$14(this, obj, obj2, obj3);
            case 15:
                return invoke$15(this, obj, obj2, obj3);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS426S0100000_1(AnonymousClass476 anonymousClass476, int i) {
        super(3);
        this.$t = i;
        this.l0 = anonymousClass476;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS426S0100000_1(C4AJ c4aj, int i) {
        super(3);
        this.$t = i;
        this.l0 = c4aj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS426S0100000_1(C4N7 c4n7, int i) {
        super(3);
        this.$t = i;
        this.l0 = c4n7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS426S0100000_1(C4N8 c4n8, C4N8<T> c4n82) {
        super(3);
        this.$t = c4n82;
        this.l0 = c4n8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS426S0100000_1(RunnableC117154il runnableC117154il, int i) {
        super(3);
        this.$t = i;
        this.l0 = runnableC117154il;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS426S0100000_1(C117994k7 c117994k7, int i) {
        super(3);
        this.$t = i;
        this.l0 = c117994k7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS426S0100000_1(VideoReviewStatusVM videoReviewStatusVM, int i) {
        super(3);
        this.$t = i;
        this.l0 = videoReviewStatusVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS426S0100000_1(InputView inputView, int i) {
        super(3);
        this.$t = i;
        this.l0 = inputView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS426S0100000_1(ChatRoomPanelAssem chatRoomPanelAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = chatRoomPanelAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS426S0100000_1(MessageRequestDeleteAllBtnAssem messageRequestDeleteAllBtnAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = messageRequestDeleteAllBtnAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS426S0100000_1(MessageRequestEditBtnsAssem messageRequestEditBtnsAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = messageRequestEditBtnsAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS426S0100000_1(MessageRequestEmptyAssem messageRequestEmptyAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = messageRequestEmptyAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS426S0100000_1(MessageRequestListAssem messageRequestListAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = messageRequestListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS426S0100000_1(MessageRequestNoticeAssem messageRequestNoticeAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = messageRequestNoticeAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS426S0100000_1(IDqS426S0100000_1 iDqS426S0100000_1, int i) {
        super(3);
        this.$t = i;
        this.l0 = iDqS426S0100000_1;
    }

    public static final Object invoke$0(IDqS426S0100000_1 iDqS426S0100000_1, Object obj, Object obj2, Object obj3) {
        C105454Bx emoji = (C105454Bx) obj2;
        ((Number) obj3).intValue();
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(emoji, "emoji");
        ((InterfaceC105124Aq) ((InputView) iDqS426S0100000_1.l0).LJLL.getValue()).LLLZLZ(emoji);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS426S0100000_1 iDqS426S0100000_1, Object obj, Object obj2, Object obj3) {
        C105454Bx emoji = (C105454Bx) obj2;
        ((Number) obj3).intValue();
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(emoji, "emoji");
        ((ChatRoomPanelAssem) iDqS426S0100000_1.l0).LJLJL.LLLZLZ(emoji);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS426S0100000_1 iDqS426S0100000_1, Object obj, Object obj2, Object obj3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("send error: ");
        LIZ.append(obj3);
        C111214Yb.LIZ("PhotoMsgSender", X1D.LIZIZ(LIZ));
        C117984k6.LIZ(false, (C117994k7) iDqS426S0100000_1.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(IDqS426S0100000_1 iDqS426S0100000_1, Object obj, Object obj2, Object obj3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("send error: ");
        LIZ.append(obj3);
        C111214Yb.LIZ("VideoMsgSender", X1D.LIZIZ(LIZ));
        C117984k6.LIZ(false, (C117994k7) iDqS426S0100000_1.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(IDqS426S0100000_1 iDqS426S0100000_1, Object obj, Object obj2, Object obj3) {
        final String scene = (String) obj;
        final int intValue = ((Number) obj2).intValue();
        final int intValue2 = ((Number) obj3).intValue();
        o.LJIIIZ(scene, "scene");
        AnonymousClass476 anonymousClass476 = (AnonymousClass476) iDqS426S0100000_1.l0;
        C84803Um c84803Um = anonymousClass476.LLIZ;
        if (c84803Um != null) {
            ((C3VM) anonymousClass476.LLIZLLLIL.getValue()).LIZ(c84803Um, new C3UY(scene, intValue, intValue2) { // from class: X.307
                public final String LIZLLL;
                public final int LJ;
                public final int LJFF;

                public final Object[] LIZ() {
                    return new Object[]{this.LIZLLL, Integer.valueOf(this.LJ), Integer.valueOf(this.LJFF)};
                }

                public final boolean equals(Object obj4) {
                    if (this == obj4) {
                        return true;
                    }
                    if (obj4 instanceof AnonymousClass307) {
                        return C78966Uyw.LJIIIZ(((AnonymousClass307) obj4).LIZ(), LIZ());
                    }
                    return false;
                }

                public final int hashCode() {
                    return Objects.hash(LIZ());
                }

                public final String toString() {
                    return C78966Uyw.LJJJLL("MsgResourceLoadEventBody:%s,%s,%s", LIZ());
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(C113554cx.LJJL(new OSZ(WM7.SCENE_SERVICE, scene), new OSZ("status", Integer.valueOf(intValue)), new OSZ("error_code", Integer.valueOf(intValue2))), null, null, 6);
                    o.LJIIIZ(scene, "scene");
                    this.LIZLLL = scene;
                    this.LJ = intValue;
                    this.LJFF = intValue2;
                }
            });
        }
        ((AnonymousClass476) iDqS426S0100000_1.l0).LLIZ = null;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(IDqS426S0100000_1 iDqS426S0100000_1, Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        View view = (View) obj3;
        o.LJIIIZ(view, "view");
        C4N7 c4n7 = (C4N7) ((C4N8) iDqS426S0100000_1.l0);
        SharePackage sharePackage = c4n7.LJLJJLL;
        if (sharePackage != null) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            BaseSharePackage.LJII(sharePackage, context, view, new AqS8S0202000_1((C4N8) iDqS426S0100000_1.l0, (C4N8<Object>) intValue, intValue2, (int) view, (View) 1), 2);
        } else {
            IDqS426S0100000_1 iDqS426S0100000_12 = c4n7.LJLLLLLL;
            if (iDqS426S0100000_12 != null) {
                iDqS426S0100000_12.invoke(Integer.valueOf(intValue), Integer.valueOf(intValue2), view);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(IDqS426S0100000_1 iDqS426S0100000_1, Object obj, Object obj2, Object obj3) {
        IMContact item;
        IMUser LIZ;
        boolean z;
        String str;
        int disabledOnSharePanelReasonCode;
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        View view = (View) obj3;
        o.LJIIIZ(view, "view");
        if (intValue == 0 || intValue == 1 || intValue == 2) {
            C4N7 c4n7 = (C4N7) iDqS426S0100000_1.l0;
            if (!c4n7.LJLLJ && (item = c4n7.getItem(intValue2)) != null && !c4n7.LJZ(item)) {
                if (!(item instanceof IMConversation) && (LIZ = C81573Ib.LIZ(item)) != null) {
                    String uid = LIZ.getUid();
                    String LIZ2 = C80763Ey.LIZ(false);
                    LIZ2.toString();
                    if (!o.LJ(uid, LIZ2) && LIZ.getFollowStatus() != 2) {
                        String str2 = c4n7.LJLJJLL.itemType;
                        if (o.LJ(str2, "pic")) {
                            AnonymousClass030.LJ(view, R.string.h7r);
                        } else if (o.LJ(str2, "gif")) {
                            AnonymousClass030.LJ(view, R.string.h5o);
                        }
                    }
                }
                boolean z2 = item instanceof IMUser;
                if (!z2 || (disabledOnSharePanelReasonCode = ((IMUser) item).getDisabledOnSharePanelReasonCode()) == 0 || disabledOnSharePanelReasonCode != 1) {
                    List<IMContact> value = c4n7.LJLJL.LJLJLLL.getValue();
                    if (value == null) {
                        value = C61878OQg.INSTANCE;
                    }
                    if (z2 && C36L.LIZJ((IMUser) item)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!value.contains(item)) {
                        if (z) {
                            c4n7.LJLLLL = true;
                        }
                        if (c4n7.LJLLILLLL) {
                            int LIZ3 = C95593p5.LIZ();
                            C84283Sm c84283Sm = C84283Sm.LIZ;
                            int size = value.size();
                            boolean z3 = c4n7.LJLLLL;
                            c84283Sm.getClass();
                            if (z3) {
                                size--;
                            }
                            if (size >= C95593p5.LIZ() - 1) {
                                C26045AKb c26045AKb = new C26045AKb(view);
                                c26045AKb.LJIIIZ(C84283Sm.LIZIZ(LIZ3));
                                c26045AKb.LJIIJ();
                            } else {
                                c4n7.LJLZ(intValue2, item);
                            }
                        } else {
                            int i = c4n7.LJLJJLL.extras.getInt("forward_limit", 15);
                            if (value.size() >= i) {
                                String quantityString = view.getContext().getResources().getQuantityString(R.plurals.dh, i, Integer.valueOf(i));
                                o.LJIIIIZZ(quantityString, "view.context.resources.g…                        )");
                                C26045AKb c26045AKb2 = new C26045AKb(view);
                                c26045AKb2.LJIIIZ(quantityString);
                                c26045AKb2.LJIIJ();
                            } else {
                                c4n7.LJLZ(intValue2, item);
                            }
                        }
                    } else {
                        if (z) {
                            c4n7.LJLLLL = false;
                        }
                        c4n7.LJLZ(intValue2, item);
                    }
                    if (z2 && C78685UuP.LJJJZ(c4n7.LJLJJLL.extras.getString("is_private_profile"))) {
                        IMUser iMUser = (IMUser) item;
                        C235399Lr c235399Lr = new C235399Lr("share_person");
                        C1799074g c1799074g = InterfaceC1798974f.LIZ;
                        c235399Lr.LJ("platform", "chat_list", c1799074g);
                        c235399Lr.LJ("target_id", iMUser.getUid(), c1799074g);
                        if (C36L.LIZJ(iMUser)) {
                            str = "personal_homepage";
                        } else {
                            str = "others_homepage";
                        }
                        c235399Lr.LJ("enter_from", str, c1799074g);
                        c235399Lr.LJ("is_private_profile", c4n7.LJLJJLL.extras.getString("is_private_profile"), c1799074g);
                        c235399Lr.LJIILIIL();
                    }
                } else {
                    AnonymousClass030.LJ(view, R.string.j6x);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(IDqS426S0100000_1 iDqS426S0100000_1, Object obj, Object obj2, Object obj3) {
        ((C4AJ) iDqS426S0100000_1.l0).p0(false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(IDqS426S0100000_1 iDqS426S0100000_1, Object obj, Object obj2, Object obj3) {
        ((C4AJ) iDqS426S0100000_1.l0).p0(false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS426S0100000_1 iDqS426S0100000_1, Object obj, Object obj2, Object pageMode) {
        UIAssem selectSubscribe = (UIAssem) obj;
        List list = (List) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(list, "list");
        o.LJIIIZ(pageMode, "pageMode");
        View containerView = selectSubscribe.getContainerView();
        ((MessageRequestDeleteAllBtnAssem) iDqS426S0100000_1.l0).getClass();
        int i = 0;
        if ((C4T4.LIZ() != 0 && C4T4.LIZ() != 1) || !o.LJ(pageMode, C4T3.LIZ) || !(!list.isEmpty())) {
            i = 8;
        }
        containerView.setVisibility(i);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS426S0100000_1 iDqS426S0100000_1, Object selectSubscribe, Object obj, Object pageMode) {
        List list = (List) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(list, "list");
        o.LJIIIZ(pageMode, "pageMode");
        ((MessageRequestEditBtnsAssem) iDqS426S0100000_1.l0).getClass();
        boolean z = true;
        if (C4T4.LIZ() >= 2 && o.LJ(pageMode, C4T1.LIZ) && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C97383ry) it.next()).LJLIL) {
                    MessageRequestEditBtnsAssem messageRequestEditBtnsAssem = (MessageRequestEditBtnsAssem) iDqS426S0100000_1.l0;
                    C17N.LJJLIIIJJI(messageRequestEditBtnsAssem.getContainerView());
                    if (!list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (!((C97383ry) it2.next()).LJLIL) {
                                z = false;
                                break;
                            }
                        }
                    }
                    if (z) {
                        Object value = messageRequestEditBtnsAssem.LJLJJI.getValue();
                        o.LJIIIIZZ(value, "<get-deleteBtn>(...)");
                        ((TextView) value).setText(C97343ru.LJFF(R.string.oc));
                        Object value2 = messageRequestEditBtnsAssem.LJLJJL.getValue();
                        o.LJIIIIZZ(value2, "<get-markAsReadBtn>(...)");
                        ((TextView) value2).setText(C97343ru.LJFF(R.string.og));
                    } else {
                        Object value3 = messageRequestEditBtnsAssem.LJLJJI.getValue();
                        o.LJIIIIZZ(value3, "<get-deleteBtn>(...)");
                        ((TextView) value3).setText(C97343ru.LJFF(R.string.oo));
                        Object value4 = messageRequestEditBtnsAssem.LJLJJL.getValue();
                        o.LJIIIIZZ(value4, "<get-markAsReadBtn>(...)");
                        ((TextView) value4).setText(C97343ru.LJFF(R.string.op));
                    }
                    return C76800UCe.LIZ;
                }
            }
        }
        C17N.LJJIIJZLJL(((MessageRequestEditBtnsAssem) iDqS426S0100000_1.l0).getContainerView());
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r1 != 3) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.IDqS426S0100000_1 r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS426S0100000_1.invoke$4(kotlin.jvm.internal.IDqS426S0100000_1, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(IDqS426S0100000_1 iDqS426S0100000_1, Object selectSubscribe, Object obj, Object obj2) {
        List list = (List) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(list, "list");
        if (booleanValue) {
            ((MessageRequestListAssem) iDqS426S0100000_1.l0).v3().setData(ORZ.LLJILJILJ(list));
            ((AbstractC029409q) ((MessageRequestListAssem) iDqS426S0100000_1.l0).LJLJJL.getValue()).notifyDataSetChanged();
            if (list.isEmpty()) {
                ((MessageRequestListAssem) iDqS426S0100000_1.l0).x3().nv0(C4TQ.LIZ);
            } else {
                ((MessageRequestListAssem) iDqS426S0100000_1.l0).x3().nv0(C4TU.LIZ);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS426S0100000_1 iDqS426S0100000_1, Object obj, Object list, Object pageMode) {
        int i;
        C110754Wh c110754Wh;
        EnumC97443s4 enumC97443s4;
        UIAssem selectSubscribe = (UIAssem) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(list, "list");
        o.LJIIIZ(pageMode, "pageMode");
        View containerView = selectSubscribe.getContainerView();
        C109774Sn c109774Sn = (C109774Sn) ((MessageRequestNoticeAssem) iDqS426S0100000_1.l0).LJLILLLLZI.getValue();
        if (c109774Sn == null || (enumC97443s4 = c109774Sn.LJLIL) == null || enumC97443s4 != EnumC97443s4.FILTERED || !o.LJ(pageMode, C4T3.LIZ)) {
            i = 8;
        } else {
            i = 0;
        }
        containerView.setVisibility(i);
        if (selectSubscribe.getContainerView().getVisibility() == 0) {
            View containerView2 = selectSubscribe.getContainerView();
            if ((containerView2 instanceof C110754Wh) && (c110754Wh = (C110754Wh) containerView2) != null) {
                c110754Wh.LIZIZ();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS426S0100000_1 iDqS426S0100000_1, Object obj, Object obj2, Object obj3) {
        Object obj4;
        PreCheckResult preCheckResult;
        int i;
        C4E8 checkProcess = (C4E8) obj;
        byte[] bArr = (byte[]) obj3;
        o.LJIIIZ(checkProcess, "checkProcess");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pickFingerPrint : ");
        LIZ.append(checkProcess.name());
        LIZ.append(' ');
        LIZ.append(obj2);
        LIZ.append(' ');
        if (bArr != null) {
            obj4 = Integer.valueOf(bArr.length);
        } else {
            obj4 = null;
        }
        LIZ.append(obj4);
        X1D.LIZIZ(LIZ);
        boolean z = true;
        if (checkProcess == C4E8.FINGER_END) {
            if (!o.LJ(obj2, Boolean.TRUE) || bArr == null) {
                RunnableC117154il runnableC117154il = (RunnableC117154il) iDqS426S0100000_1.l0;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Fail stage : ");
                LIZ2.append(checkProcess.name());
                runnableC117154il.LIZIZ(1, -200, X1D.LIZIZ(LIZ2), null);
                C6BK c6bk = new C6BK();
                c6bk.LIZ.put("stage", 1);
                c6bk.LIZ.put("result", -200);
                C43882HKc.LIZLLL(-200, "creative_tool_audio_copyright_detect", c6bk.LJ(), true);
                ((RunnableC117154il) iDqS426S0100000_1.l0).LJLJJL.invoke();
                return C76800UCe.LIZ;
            }
            HashMap<Integer, PreCheckResult> hashMap = new HashMap<>();
            RunnableC117154il runnableC117154il2 = (RunnableC117154il) iDqS426S0100000_1.l0;
            Iterator<Integer> it = runnableC117154il2.LJLJJI.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                String creationId = runnableC117154il2.LJLJI;
                AudioCopyrightDetectAPI audioCopyrightDetectAPI = new AudioCopyrightDetectAPI();
                o.LJIIIZ(creationId, "creationId");
                try {
                    String LIZ3 = OXG.LIZ(bArr);
                    if (LIZ3 == null) {
                        LIZ3 = "";
                    }
                    preCheckResult = ((AudioCopyrightDetectAPI.MusicCheckApi) audioCopyrightDetectAPI.LIZ.getValue()).preCheck(new PreCheckRequest(creationId, intValue, LIZ3)).execute().LIZIZ;
                } catch (Exception e) {
                    e.getMessage();
                    e.getMessage();
                    preCheckResult = null;
                }
                if (preCheckResult != null && preCheckResult.status_code == 0) {
                    C6BK c6bk2 = new C6BK();
                    c6bk2.LIZ.put("stage", Integer.valueOf(z ? 1 : 0));
                    c6bk2.LIZ.put("result", 0);
                    C43882HKc.LIZLLL(0, "creative_tool_audio_copyright_detect", c6bk2.LJ(), z);
                    hashMap.put(Integer.valueOf(intValue), preCheckResult);
                }
                C6BK c6bk3 = new C6BK();
                c6bk3.LIZ.put("stage", Integer.valueOf(z ? 1 : 0));
                c6bk3.LIZ.put("result", -300);
                if (preCheckResult != null) {
                    i = preCheckResult.error_code;
                } else {
                    i = 0;
                }
                c6bk3.LIZ.put("err_code", Integer.valueOf(i));
                z = true;
                C43882HKc.LIZLLL(-300, "creative_tool_audio_copyright_detect", c6bk3.LJ(), true);
                hashMap.put(Integer.valueOf(intValue), preCheckResult);
            }
            if (hashMap.isEmpty()) {
                ((RunnableC117154il) iDqS426S0100000_1.l0).LIZIZ(z ? 1 : 0, -300, "", null);
            } else {
                ((RunnableC117154il) iDqS426S0100000_1.l0).LIZIZ(2, 103, "", hashMap);
            }
        } else if (checkProcess == C4E8.FINGER_ERROR) {
            C6BK c6bk4 = new C6BK();
            c6bk4.LIZ.put("stage", 1);
            c6bk4.LIZ.put("result", -200);
            C43882HKc.LIZLLL(-200, "creative_tool_audio_copyright_detect", c6bk4.LJ(), true);
            ((RunnableC117154il) iDqS426S0100000_1.l0).LJLJJL.invoke();
            ((RunnableC117154il) iDqS426S0100000_1.l0).LIZIZ(1, -200, "", null);
        }
        ((RunnableC117154il) iDqS426S0100000_1.l0).LJLJJL.invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS426S0100000_1 iDqS426S0100000_1, Object p, Object obj, Object obj2) {
        int i;
        byte[] bArr = (byte[]) obj2;
        o.LJIIIZ(p, "p");
        InterfaceC88473Ynt interfaceC88473Ynt = (InterfaceC88473Ynt) iDqS426S0100000_1.l0;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(p, obj, bArr);
        }
        if (p == C4E8.AUDIO_END) {
            InterfaceC88473Ynt interfaceC88473Ynt2 = (InterfaceC88473Ynt) iDqS426S0100000_1.l0;
            SpeechEngine speechEngineGenerator = SpeechEngineGenerator.getInstance();
            long createEngine = speechEngineGenerator.createEngine();
            speechEngineGenerator.setOptionString(createEngine, "log_level", "TRACE");
            speechEngineGenerator.setOptionString(createEngine, "engine_name", "afp");
            if (speechEngineGenerator.initEngine(createEngine) != 0 && interfaceC88473Ynt2 != null) {
                interfaceC88473Ynt2.invoke(C4E8.FINGER_START, Boolean.FALSE, null);
            }
            speechEngineGenerator.resetEngine(createEngine);
            boolean z = false;
            if (bArr != null) {
                i = bArr.length;
            } else {
                i = 0;
            }
            int i2 = i / LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
            for (int i3 = 0; i3 < i2; i3++) {
                byte[] bArr2 = new byte[LiveBroadcastUploadVideoImageHeightSetting.DEFAULT];
                System.arraycopy(bArr, i3 * LiveBroadcastUploadVideoImageHeightSetting.DEFAULT, bArr2, 0, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT);
                speechEngineGenerator.feedAudio(createEngine, bArr2, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT);
            }
            o.LJI(bArr);
            byte[] bArr3 = new byte[bArr.length];
            int fetchResult = speechEngineGenerator.fetchResult(createEngine, bArr3);
            byte[] bArr4 = new byte[fetchResult];
            System.arraycopy(bArr3, 0, bArr4, 0, fetchResult);
            if (interfaceC88473Ynt2 != null) {
                C4E8 c4e8 = C4E8.FINGER_END;
                if (fetchResult >= 0) {
                    z = true;
                }
                interfaceC88473Ynt2.invoke(c4e8, Boolean.valueOf(z), bArr4);
            }
            speechEngineGenerator.destroyEngine(createEngine);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(IDqS426S0100000_1 iDqS426S0100000_1, Object obj, Object obj2, Object obj3) {
        String str;
        View view = (View) obj;
        String url = (String) obj2;
        ((Boolean) obj3).booleanValue();
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        VideoReviewStatusVM videoReviewStatusVM = (VideoReviewStatusVM) iDqS426S0100000_1.l0;
        videoReviewStatusVM.getClass();
        VideoItemParams gv0 = videoReviewStatusVM.gv0();
        if (gv0 != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "personal_homepage");
            Aweme aweme = gv0.getAweme();
            if (aweme == null || (str = aweme.getFromGroupId()) == null) {
                str = "";
            }
            c188727au.LJIIIZ("group_id", str);
            FMX.LJIIL("enter_appeal", c188727au.LIZ);
            if (!TextUtils.isEmpty(url)) {
                SmartRoute buildRoute = SmartRouter.buildRoute(view.getContext(), "aweme://webview/");
                buildRoute.withParam(UriProtector.parse(url));
                buildRoute.open();
            }
        }
        return C76800UCe.LIZ;
    }
}
