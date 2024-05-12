package X;

import Y.IDDListenerS140S0100000;
import Y.IDcS169S0100000;
import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.room.CopyRightDialogShowOrDismissEvent;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0NP */
/* loaded from: classes.dex */
public final class C0NP {
    public static final AtomicInteger LIZ = new AtomicInteger(100);

    public static /* synthetic */ void LIZIZ(PunishEventInfo punishEventInfo, String str, String str2, boolean z, PerceptionDialogInfo perceptionDialogInfo) {
        LIZ(punishEventInfo, str, str2, z, false, perceptionDialogInfo);
    }

    public static final void LIZ(PunishEventInfo punishEventInfo, String action, String clickType, boolean z, boolean z2, PerceptionDialogInfo perceptionDialogInfo) {
        String str;
        String str2;
        String str3;
        String str4;
        LiveMode streamType;
        o.LJIIIZ(action, "action");
        o.LJIIIZ(clickType, "clickType");
        BZI LIZIZ = C0N3.LIZIZ("livesdk_violation_popup", action, "action_type");
        if (z) {
            str = "anchor";
        } else {
            str = "user";
        }
        LIZIZ.LJIJJ(str, "user_type");
        if (z) {
            str2 = "live";
        } else if (z2) {
            str2 = "apply_guest";
        } else {
            str2 = "guest";
        }
        LIZIZ.LJIJJ(str2, "scene_type");
        LIZIZ.LJIJJ(punishEventInfo.punishId, "record_id");
        LIZIZ.LJIJJ(punishEventInfo.punishType, "violation_type");
        LIZIZ.LJIJJ(punishEventInfo.punishReason, "violation_reason");
        C07250Qf.LIZJ(punishEventInfo.violationUid, LIZIZ, "violation_anchor_id", clickType, "click_tab");
        LIZIZ.LJIJJ(punishEventInfo.duration, "period");
        String str5 = null;
        if (perceptionDialogInfo != null) {
            str3 = perceptionDialogInfo.violationDetailUrl;
        } else {
            str3 = null;
        }
        if (!TextUtils.isEmpty(str3)) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZIZ.LJIJJ(str4, "is_detail_button");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && (streamType = room.getStreamType()) != null) {
            str5 = C28509BGv.LIZ(streamType);
        }
        LIZIZ.LJIJJ(str5, "live_type");
        LIZIZ.LJJIIJZLJL();
    }

    public static void LIZLLL(PerceptionDialogInfo perceptionDialogInfo, Context context, LifecycleOwner lifecycleOwner, InterfaceC74834TYo interfaceC74834TYo, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr interfaceC88471Ynr2, int i) {
        InterfaceC88471Ynr<Context, PerceptionDialogInfo, C76800UCe> interfaceC88471Ynr3;
        InterfaceC88471Ynr interfaceC88471Ynr4 = interfaceC88471Ynr;
        if ((i & 8) != 0) {
            interfaceC88471Ynr4 = new InterfaceC88471Ynr<Context, PerceptionDialogInfo, C76800UCe>() { // from class: X.1jc
                @Override // X.InterfaceC88471Ynr
                public final C76800UCe invoke(Context context2, PerceptionDialogInfo perceptionDialogInfo2) {
                    Context context3 = context2;
                    PerceptionDialogInfo perceptionDialogInfo3 = perceptionDialogInfo2;
                    o.LJIIIZ(context3, "context");
                    o.LJIIIZ(perceptionDialogInfo3, "perceptionDialogInfo");
                    String str = perceptionDialogInfo3.violationDetailUrl;
                    if (str == null || str.length() == 0) {
                        C0NB.LJIIL("UserViolation", "handle perception detail click failed, violationDetailUrl is null or empty");
                    } else {
                        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context3, perceptionDialogInfo3.violationDetailUrl);
                    }
                    return C76800UCe.LIZ;
                }
            };
        }
        InterfaceC88471Ynr interfaceC88471Ynr5 = null;
        if ((i & 16) != 0) {
            interfaceC88471Ynr3 = new InterfaceC88471Ynr<Context, PerceptionDialogInfo, C76800UCe>() { // from class: X.1jd
                @Override // X.InterfaceC88471Ynr
                public final C76800UCe invoke(Context context2, PerceptionDialogInfo perceptionDialogInfo2) {
                    o.LJIIIZ(context2, "context");
                    o.LJIIIZ(perceptionDialogInfo2, "perceptionDialogInfo");
                    return C76800UCe.LIZ;
                }
            };
        } else {
            interfaceC88471Ynr3 = null;
        }
        if ((i & 32) == 0) {
            interfaceC88471Ynr5 = interfaceC88471Ynr2;
        }
        LIZJ(perceptionDialogInfo, context, lifecycleOwner, interfaceC74834TYo, interfaceC88471Ynr4, interfaceC88471Ynr3, interfaceC88471Ynr5, null);
    }

    public static final void LIZJ(final PerceptionDialogInfo perceptionDialogInfo, final Context context, final LifecycleOwner lifecycleOwner, final InterfaceC74834TYo interfaceC74834TYo, final InterfaceC88471Ynr<? super Context, ? super PerceptionDialogInfo, C76800UCe> clickAction, final InterfaceC88471Ynr<? super Context, ? super PerceptionDialogInfo, C76800UCe> secondaryClickAction, final InterfaceC88471Ynr<? super String, ? super String, C76800UCe> interfaceC88471Ynr, final DataChannel dataChannel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(clickAction, "clickAction");
        o.LJIIIZ(secondaryClickAction, "secondaryClickAction");
        if (interfaceC74834TYo != null) {
            interfaceC74834TYo.addToShow(LIZ.getAndDecrement(), lifecycleOwner, new Observer() { // from class: X.1Hx
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v0 */
                /* JADX WARN: Type inference failed for: r15v1, types: [int, boolean] */
                /* JADX WARN: Type inference failed for: r15v2, types: [int, boolean] */
                /* JADX WARN: Type inference failed for: r15v4 */
                /* JADX WARN: Type inference failed for: r15v5 */
                /* JADX WARN: Type inference failed for: r15v6 */
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Spannable spannable;
                    int i;
                    Spannable spannable2;
                    CharSequence charSequence;
                    Spannable spannable3;
                    int i2;
                    C47071t1 c47071t1;
                    int i3;
                    Text text;
                    String str;
                    Text text2;
                    String str2;
                    Text text3;
                    String str3;
                    Text text4;
                    Text text5;
                    final Context context2 = context;
                    final PerceptionDialogInfo perceptionDialogInfo2 = perceptionDialogInfo;
                    final InterfaceC88471Ynr<Context, PerceptionDialogInfo, C76800UCe> interfaceC88471Ynr2 = clickAction;
                    final InterfaceC88471Ynr<Context, PerceptionDialogInfo, C76800UCe> interfaceC88471Ynr3 = secondaryClickAction;
                    final InterfaceC88471Ynr<String, String, C76800UCe> interfaceC88471Ynr4 = interfaceC88471Ynr;
                    int i4 = 0;
                    if (perceptionDialogInfo2 != null && context2 != null) {
                        Spannable spannable4 = CXJ.LIZ;
                        if (perceptionDialogInfo2 != null && perceptionDialogInfo2.title != null && 1 != 0) {
                            if (perceptionDialogInfo2 != null) {
                                text4 = perceptionDialogInfo2.title;
                                text5 = perceptionDialogInfo2.title;
                            } else {
                                text4 = null;
                                text5 = null;
                            }
                            o.LJI(text5);
                            Spannable LJFF = CXJ.LJFF(text4, text5.defaultPattern);
                            o.LJI(context2);
                            LJFF.setSpan(new ForegroundColorSpan(C04330Ez.LIZIZ(context2, R.color.ck)), 0, LJFF.length(), 18);
                            i = 18;
                            spannable = spannable4;
                            C23010vJ.LIZJ(context2, LJFF, 0, LJFF.length(), 33, 1, 700);
                            spannable4 = LJFF;
                        } else {
                            spannable = spannable4;
                            i = 18;
                        }
                        if (perceptionDialogInfo2 != null && perceptionDialogInfo2.subTitle != null) {
                            if (perceptionDialogInfo2 != null) {
                                text3 = perceptionDialogInfo2.subTitle;
                                Text text6 = perceptionDialogInfo2.subTitle;
                                if (text6 != null) {
                                    str3 = text6.defaultPattern;
                                    spannable2 = CXJ.LJFF(text3, str3);
                                    context2 = context2;
                                    i4 = 0;
                                    C23010vJ.LJI(context2, spannable2, 0, spannable2.length(), 33, 3);
                                }
                            } else {
                                text3 = null;
                            }
                            str3 = null;
                            spannable2 = CXJ.LJFF(text3, str3);
                            context2 = context2;
                            i4 = 0;
                            C23010vJ.LJI(context2, spannable2, 0, spannable2.length(), 33, 3);
                        } else {
                            spannable2 = spannable;
                        }
                        if (perceptionDialogInfo2 != null && perceptionDialogInfo2.adviceActionText != null) {
                            if (perceptionDialogInfo2 != null) {
                                text2 = perceptionDialogInfo2.adviceActionText;
                                Text text7 = perceptionDialogInfo2.adviceActionText;
                                if (text7 != null) {
                                    str2 = text7.defaultPattern;
                                    Spannable LJFF2 = CXJ.LJFF(text2, str2);
                                    o.LJI(context2);
                                    LJFF2.setSpan(new ForegroundColorSpan(C04330Ez.LIZIZ(context2, R.color.bc)), i4, LJFF2.length(), i);
                                    C23010vJ.LIZJ(context2, LJFF2, i4, LJFF2.length(), 33, 3, 600);
                                    charSequence = LJFF2;
                                }
                            } else {
                                text2 = null;
                            }
                            str2 = null;
                            Spannable LJFF22 = CXJ.LJFF(text2, str2);
                            o.LJI(context2);
                            LJFF22.setSpan(new ForegroundColorSpan(C04330Ez.LIZIZ(context2, R.color.bc)), i4, LJFF22.length(), i);
                            C23010vJ.LIZJ(context2, LJFF22, i4, LJFF22.length(), 33, 3, 600);
                            charSequence = LJFF22;
                        } else {
                            charSequence = spannable;
                        }
                        o.LJI(context2);
                        int LIZIZ = C04330Ez.LIZIZ(context2, R.color.cq);
                        if (perceptionDialogInfo2 != null && perceptionDialogInfo2.defaultActionText != null) {
                            if (perceptionDialogInfo2 != null) {
                                text = perceptionDialogInfo2.defaultActionText;
                                Text text8 = perceptionDialogInfo2.defaultActionText;
                                if (text8 != null) {
                                    str = text8.defaultPattern;
                                    Spannable LJFF3 = CXJ.LJFF(text, str);
                                    LJFF3.setSpan(new ForegroundColorSpan(LIZIZ), i4, LJFF3.length(), i);
                                    C23010vJ.LIZJ(context2, LJFF3, i4, LJFF3.length(), 33, 3, LiveChatShowDelayForHotLiveSetting.DEFAULT);
                                    spannable3 = LJFF3;
                                }
                            } else {
                                text = null;
                            }
                            str = null;
                            Spannable LJFF32 = CXJ.LJFF(text, str);
                            LJFF32.setSpan(new ForegroundColorSpan(LIZIZ), i4, LJFF32.length(), i);
                            C23010vJ.LIZJ(context2, LJFF32, i4, LJFF32.length(), 33, 3, LiveChatShowDelayForHotLiveSetting.DEFAULT);
                            spannable3 = LJFF32;
                        } else {
                            spannable3 = spannable;
                        }
                        if (!o.LJ(charSequence, spannable) && !o.LJ(spannable3, spannable)) {
                            C47071t1 c47071t12 = new C47071t1(context2);
                            if (!o.LJ(spannable4, spannable)) {
                                c47071t12.LIZJ = spannable4;
                            }
                            c47071t12.LJII(spannable2);
                            c47071t12.LJIILJJIL(charSequence, new C0K7() { // from class: X.1Hv
                                @Override // X.C0K7
                                public final void LJIILLIIL(LiveDialog liveDialog) {
                                    liveDialog.dismiss();
                                    interfaceC88471Ynr2.invoke(context2, perceptionDialogInfo2);
                                    InterfaceC88471Ynr<String, String, C76800UCe> interfaceC88471Ynr5 = interfaceC88471Ynr4;
                                    if (interfaceC88471Ynr5 != null) {
                                        interfaceC88471Ynr5.invoke("click", "suggest_tab");
                                    }
                                }
                            });
                            c47071t12.LJIILL(spannable3, new C0K7() { // from class: X.1Hw
                                @Override // X.C0K7
                                public final void LJIILLIIL(LiveDialog liveDialog) {
                                    liveDialog.dismiss();
                                    InterfaceC88471Ynr<String, String, C76800UCe> interfaceC88471Ynr5 = interfaceC88471Ynr4;
                                    if (interfaceC88471Ynr5 != null) {
                                        interfaceC88471Ynr5.invoke("click", "default_tab");
                                    }
                                    interfaceC88471Ynr3.invoke(context2, perceptionDialogInfo2);
                                }
                            });
                            c47071t12.LJIILJJIL = i4;
                            c47071t1 = c47071t12;
                            i2 = i4;
                        } else if (o.LJ(charSequence, spannable) && !o.LJ(spannable3, spannable)) {
                            spannable3.setSpan(new ForegroundColorSpan(C04330Ez.LIZIZ(context2, R.color.ck)), i4, spannable3.length(), 18);
                            Context context3 = context2;
                            ?? r15 = i4;
                            C23010vJ.LIZJ(context3, spannable3, r15, spannable3.length(), 33, 3, 600);
                            C47071t1 c47071t13 = new C47071t1(context3);
                            c47071t13.LJII(spannable2);
                            if (!o.LJ(spannable4, spannable)) {
                                c47071t13.LIZJ = spannable4;
                            }
                            c47071t13.LJIIJ(spannable3, new IDcS169S0100000(interfaceC88471Ynr4, 17));
                            c47071t13.LJIILJJIL = r15;
                            c47071t1 = c47071t13;
                            i2 = r15;
                        }
                        PerceptionDialogInfo perceptionDialogInfo3 = perceptionDialogInfo;
                        DataChannel dataChannel2 = dataChannel;
                        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                        InterfaceC74834TYo interfaceC74834TYo2 = interfaceC74834TYo;
                        InterfaceC88471Ynr<String, String, C76800UCe> interfaceC88471Ynr5 = interfaceC88471Ynr;
                        long j = perceptionDialogInfo3.iconType;
                        if (j == 1) {
                            i3 = R.drawable.cyk;
                        } else if (j == 2) {
                            i3 = R.drawable.cyg;
                        } else if (j == 4) {
                            i3 = R.drawable.cyh;
                        } else {
                            i3 = R.drawable.cyf;
                        }
                        c47071t1.LJ(i3);
                        c47071t1.LJIIZILJ = new IDDListenerS140S0100000(interfaceC74834TYo2, 2);
                        LiveDialog LIZ2 = c47071t1.LIZ();
                        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ2, new Object[i2], "void", new C65300Pk0(i2, "()V", "-3553017592297975023")).LIZ) {
                            LIZ2.show();
                        }
                        if (perceptionDialogInfo3.scene == 7 && dataChannel2 != null) {
                            dataChannel2.lv0(lifecycleOwner2, CopyRightDialogShowOrDismissEvent.class, new IDqS416S0100000(LIZ2, 102));
                        }
                        interfaceC74834TYo2.addDialogToManager(LIZ2);
                        if (interfaceC88471Ynr5 == null) {
                            return;
                        }
                        interfaceC88471Ynr5.invoke("show", "");
                        return;
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("show perception dialog failed.. ");
                    LIZ3.append(perceptionDialogInfo);
                    C0NB.LJIIL("UserViolation", X1D.LIZIZ(LIZ3));
                }
            });
        }
    }
}
