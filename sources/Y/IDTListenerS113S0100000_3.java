package Y;

import X.AnonymousClass708;
import X.C16880lQ;
import X.C177336xd;
import X.C177916yZ;
import X.C1788770h;
import X.C200107tG;
import X.C34K;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C8CH;
import X.EF7;
import X.InterfaceC228208xU;
import X.InterfaceC65784Pro;
import android.animation.AnimatorSet;
import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommonCommentKeyboard;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardInputV2Assem;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageDiggAssem;
import com.ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell;
import com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.old.PoiDetailContentHeaderBaseAssem;
import com.ss.android.ugc.aweme.poi.map.assem.PoiStaticMapAssem;
import com.ss.android.ugc.now.interaction.assem.NowFakeCommentInputAssem;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDTListenerS113S0100000_3 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            case 9:
                return onTouch$9(this, view, motionEvent);
            case 10:
                return onTouch$10(this, view, motionEvent);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return onTouch$11(this, view, motionEvent);
            case 12:
                return onTouch$12(this, view, motionEvent);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return onTouch$13(this, view, motionEvent);
            case 14:
                return onTouch$14(this, view, motionEvent);
            case 15:
                return onTouch$15(this, view, motionEvent);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return onTouch$16(this, view, motionEvent);
            case 17:
                return onTouch$17(this, view, motionEvent);
            case 18:
                return onTouch$18(this, view, motionEvent);
            case 19:
                return onTouch$19(this, view, motionEvent);
            case 20:
                return onTouch$20(this, view, motionEvent);
            case 21:
                return onTouch$21(this, view, motionEvent);
            case 22:
                return onTouch$22(this, view, motionEvent);
            case 23:
                return onTouch$23(this, view, motionEvent);
            default:
                return false;
        }
    }

    public IDTListenerS113S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            C34K c34k = new C34K();
            c34k.element = true;
            CommonCommentKeyboard commonCommentKeyboard = (CommonCommentKeyboard) iDTListenerS113S0100000_3.l0;
            commonCommentKeyboard.withState(commonCommentKeyboard.I3(), new AqS134S0200000_3((CommonCommentKeyboard) iDTListenerS113S0100000_3.l0, c34k, 35));
            return c34k.element;
        }
        return false;
    }

    public static final boolean onTouch$1(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        boolean LJ = o.LJ(((KeyboardInputV2Assem) iDTListenerS113S0100000_3.l0).K3().gv0(), C177916yZ.LIZ);
        if (motionEvent.getAction() == 1) {
            C177336xd I3 = ((KeyboardInputV2Assem) iDTListenerS113S0100000_3.l0).I3();
            if (I3 != null) {
                I3.LJLJJI = 1;
            }
            view.performClick();
        }
        return LJ;
    }

    public static final boolean onTouch$10(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        PoiDetailContentHeaderBaseAssem poiDetailContentHeaderBaseAssem = (PoiDetailContentHeaderBaseAssem) iDTListenerS113S0100000_3.l0;
        o.LJIIIIZZ(view, "view");
        o.LJIIIIZZ(motionEvent, "motionEvent");
        poiDetailContentHeaderBaseAssem.M3(motionEvent, view);
        return false;
    }

    public static final boolean onTouch$11(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        PoiDetailContentHeaderBaseAssem poiDetailContentHeaderBaseAssem = (PoiDetailContentHeaderBaseAssem) iDTListenerS113S0100000_3.l0;
        o.LJIIIIZZ(view, "view");
        o.LJIIIIZZ(motionEvent, "motionEvent");
        poiDetailContentHeaderBaseAssem.M3(motionEvent, view);
        return false;
    }

    public static final boolean onTouch$12(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        PoiDetailContentHeaderBaseAssem poiDetailContentHeaderBaseAssem = (PoiDetailContentHeaderBaseAssem) iDTListenerS113S0100000_3.l0;
        o.LJIIIIZZ(view, "view");
        o.LJIIIIZZ(motionEvent, "motionEvent");
        poiDetailContentHeaderBaseAssem.M3(motionEvent, view);
        return false;
    }

    public static final boolean onTouch$13(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        return ((GestureDetector) ((PoiStaticMapAssem) iDTListenerS113S0100000_3.l0).LJLILLLLZI.getValue()).onTouchEvent(motionEvent);
    }

    public static final boolean onTouch$14(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        TextView textView = (TextView) view;
        if (motionEvent.getAction() == 1) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = textView.getScrollX() + totalPaddingLeft;
            int scrollY = textView.getScrollY() + totalPaddingTop;
            Layout layout = textView.getLayout();
            if (layout == null) {
                return false;
            }
            int LLLLLLL = C16880lQ.LLLLLLL(layout, layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((SpannableString) iDTListenerS113S0100000_3.l0).getSpans(LLLLLLL, LLLLLLL, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                clickableSpanArr[0].onClick(textView);
            }
        }
        return true;
    }

    public static final boolean onTouch$15(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = (GestureDetector) iDTListenerS113S0100000_3.l0;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
            return true;
        }
        return true;
    }

    public static final boolean onTouch$16(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((InterfaceC65784Pro) iDTListenerS113S0100000_3.l0).invoke();
            view.performClick();
            return true;
        }
        return true;
    }

    public static final boolean onTouch$17(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = ((C200107tG) iDTListenerS113S0100000_3.l0).LJLJJI;
        if (gestureDetector != null) {
            return gestureDetector.onTouchEvent(motionEvent);
        }
        return false;
    }

    public static final boolean onTouch$18(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && (((NowFakeCommentInputAssem) iDTListenerS113S0100000_3.l0).H3().isFocused() || ((NowFakeCommentInputAssem) iDTListenerS113S0100000_3.l0).H3().isFocusable() || ((NowFakeCommentInputAssem) iDTListenerS113S0100000_3.l0).H3().isFocusableInTouchMode())) {
            ((NowFakeCommentInputAssem) iDTListenerS113S0100000_3.l0).H3().setFocusable(false);
            ((NowFakeCommentInputAssem) iDTListenerS113S0100000_3.l0).H3().setFocusableInTouchMode(false);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
            } else {
                ((NowFakeCommentInputAssem) iDTListenerS113S0100000_3.l0).K3().jv0(((NowFakeCommentInputAssem) iDTListenerS113S0100000_3.l0).LJZ, "click_input_box");
                C1788770h.LIZ(System.currentTimeMillis(), "click_input_box");
            }
        }
        return true;
    }

    public static final boolean onTouch$19(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = ((FullPageDiggAssem) iDTListenerS113S0100000_3.l0).LJLJJL;
        if (gestureDetector != null) {
            return gestureDetector.onTouchEvent(motionEvent);
        }
        return false;
    }

    public static final boolean onTouch$2(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    AnonymousClass708 anonymousClass708 = (AnonymousClass708) iDTListenerS113S0100000_3.l0;
                    if (anonymousClass708.LJZ) {
                        anonymousClass708.LJII();
                    }
                }
            } else {
                AnonymousClass708 anonymousClass7082 = (AnonymousClass708) iDTListenerS113S0100000_3.l0;
                if (anonymousClass7082.LJZ) {
                    anonymousClass7082.LJZ = false;
                    if (!anonymousClass7082.LJLZ) {
                        anonymousClass7082.LIZLLL();
                    }
                }
            }
        } else {
            AnonymousClass708 anonymousClass7083 = (AnonymousClass708) iDTListenerS113S0100000_3.l0;
            if (!anonymousClass7083.LJLZ && !anonymousClass7083.LLIFFJFJJ.LJLJI) {
                anonymousClass7083.LJZ = true;
                Comment comment = anonymousClass7083.LJLJI;
                if (comment != null && comment.isUserDigged()) {
                    AnimatorSet animatorSet = ((AnonymousClass708) iDTListenerS113S0100000_3.l0).LJZI;
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                } else {
                    AnimatorSet animatorSet2 = ((AnonymousClass708) iDTListenerS113S0100000_3.l0).LJZL;
                    if (animatorSet2 != null) {
                        animatorSet2.start();
                    }
                }
            }
        }
        return true;
    }

    public static final boolean onTouch$20(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((InterfaceC65784Pro) iDTListenerS113S0100000_3.l0).invoke();
            view.performClick();
            return true;
        }
        return true;
    }

    public static final boolean onTouch$21(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ((InterfaceC228208xU) C8CH.LIZIZ((MixFeedOrderCell) iDTListenerS113S0100000_3.l0, C65352Pkq.LIZ(InterfaceC228208xU.class))).LJLI((MixFeedOrderCell) iDTListenerS113S0100000_3.l0);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$22(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3 = (PoiDetailContentHeaderBaseAssemV3) iDTListenerS113S0100000_3.l0;
        o.LJIIIIZZ(view, "view");
        o.LJIIIIZZ(motionEvent, "motionEvent");
        poiDetailContentHeaderBaseAssemV3.N3(motionEvent, view);
        return false;
    }

    public static final boolean onTouch$23(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        PoiDetailContentHeaderBaseAssem poiDetailContentHeaderBaseAssem = (PoiDetailContentHeaderBaseAssem) iDTListenerS113S0100000_3.l0;
        o.LJIIIIZZ(view, "view");
        o.LJIIIIZZ(motionEvent, "motionEvent");
        poiDetailContentHeaderBaseAssem.M3(motionEvent, view);
        return false;
    }

    public static final boolean onTouch$3(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    AnonymousClass708 anonymousClass708 = (AnonymousClass708) iDTListenerS113S0100000_3.l0;
                    if (anonymousClass708.LLFF) {
                        anonymousClass708.LJI();
                    }
                }
            } else {
                AnonymousClass708 anonymousClass7082 = (AnonymousClass708) iDTListenerS113S0100000_3.l0;
                if (anonymousClass7082.LLFF) {
                    anonymousClass7082.LLFF = false;
                    if (!anonymousClass7082.LLF) {
                        anonymousClass7082.LIZJ();
                    }
                }
            }
        } else {
            AnonymousClass708 anonymousClass7083 = (AnonymousClass708) iDTListenerS113S0100000_3.l0;
            if (!anonymousClass7083.LLF && !anonymousClass7083.LLIFFJFJJ.LJLJI) {
                anonymousClass7083.LLFF = true;
                Comment comment = anonymousClass7083.LJLJI;
                if (comment != null && comment.isUserBuried()) {
                    AnimatorSet animatorSet = ((AnonymousClass708) iDTListenerS113S0100000_3.l0).LLFFF;
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                } else {
                    AnimatorSet animatorSet2 = ((AnonymousClass708) iDTListenerS113S0100000_3.l0).LLFII;
                    if (animatorSet2 != null) {
                        animatorSet2.start();
                    }
                }
            }
        }
        return true;
    }

    public static final boolean onTouch$4(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        Aweme aweme;
        Integer valueOf;
        VideoDescVM r4 = ((VideoDescAssem) iDTListenerS113S0100000_3.l0).r4();
        VideoItemParams gv0 = r4.gv0();
        boolean z = true;
        if (gv0 == null || (aweme = gv0.getAweme()) == null || !C63081OpJ.LJZL(aweme) || motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null) {
            return false;
        }
        if (valueOf.intValue() == 0) {
            r4.LLFZ = motionEvent.getX();
            r4.LLI = motionEvent.getY();
            return false;
        }
        if (valueOf.intValue() != 1) {
            return false;
        }
        float hypot = (float) Math.hypot(motionEvent.getX() - r4.LLFZ, motionEvent.getY() - r4.LLI);
        Context context = r4.getContext();
        if (context == null) {
            context = EF7.LIZIZ();
        }
        if (hypot <= ViewConfiguration.get(context).getScaledTouchSlop()) {
            z = false;
        }
        return z;
    }

    public static final boolean onTouch$5(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ((InterfaceC228208xU) C8CH.LIZIZ((MixFeedManageCell) iDTListenerS113S0100000_3.l0, C65352Pkq.LIZ(InterfaceC228208xU.class))).LJLI((MixFeedManageCell) iDTListenerS113S0100000_3.l0);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$6(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        Integer num;
        if (((PoiCollectStatusBaseAssem) iDTListenerS113S0100000_3.l0).LJLL) {
            if (motionEvent != null) {
                num = Integer.valueOf(motionEvent.getAction());
                if (num != null) {
                    if (num.intValue() == 0) {
                        ((PoiCollectStatusBaseAssem) iDTListenerS113S0100000_3.l0).L3().setAlpha(0.7f);
                        return false;
                    }
                    if (num.intValue() == 2) {
                        ((PoiCollectStatusBaseAssem) iDTListenerS113S0100000_3.l0).L3().setAlpha(0.7f);
                        return false;
                    }
                }
            } else {
                num = null;
            }
            if (num == null || num.intValue() != 1) {
                ((PoiCollectStatusBaseAssem) iDTListenerS113S0100000_3.l0).L3().setAlpha(1.0f);
                return false;
            }
            ((PoiCollectStatusBaseAssem) iDTListenerS113S0100000_3.l0).L3().setAlpha(1.0f);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$7(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3 = (PoiDetailContentHeaderBaseAssemV3) iDTListenerS113S0100000_3.l0;
        o.LJIIIIZZ(view, "view");
        o.LJIIIIZZ(motionEvent, "motionEvent");
        poiDetailContentHeaderBaseAssemV3.N3(motionEvent, view);
        return false;
    }

    public static final boolean onTouch$8(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3 = (PoiDetailContentHeaderBaseAssemV3) iDTListenerS113S0100000_3.l0;
        o.LJIIIIZZ(view, "view");
        o.LJIIIIZZ(motionEvent, "motionEvent");
        poiDetailContentHeaderBaseAssemV3.N3(motionEvent, view);
        return false;
    }

    public static final boolean onTouch$9(IDTListenerS113S0100000_3 iDTListenerS113S0100000_3, View view, MotionEvent motionEvent) {
        PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3 = (PoiDetailContentHeaderBaseAssemV3) iDTListenerS113S0100000_3.l0;
        o.LJIIIIZZ(view, "view");
        o.LJIIIIZZ(motionEvent, "motionEvent");
        poiDetailContentHeaderBaseAssemV3.N3(motionEvent, view);
        return false;
    }
}
