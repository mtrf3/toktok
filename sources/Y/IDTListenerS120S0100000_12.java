package Y;

import X.C116454hd;
import X.C27949Ay1;
import X.C31561Ca5;
import X.C56K;
import X.C71360RzY;
import X.C71361RzZ;
import X.C71365Rzd;
import X.C71366Rze;
import X.C73046Sle;
import X.C73053Sll;
import X.C73063Slv;
import X.C83547Wqd;
import X.IPW;
import X.IPX;
import X.IPZ;
import X.IQ9;
import X.InterfaceC65784Pro;
import X.ORZ;
import X.OSZ;
import X.S0V;
import X.T5T;
import X.TCM;
import X.TCP;
import X.TM8;
import X.W5G;
import X.XKQ;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.EditText;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.BillboardV2Fragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplayVideoPlayerDialogFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDTListenerS120S0100000_12 implements View.OnTouchListener {
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
            default:
                return false;
        }
    }

    public IDTListenerS120S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(IDTListenerS120S0100000_12 iDTListenerS120S0100000_12, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
                ((TCP) iDTListenerS120S0100000_12.l0).getIconImgView().startAnimation(TCM.LJFF());
                return false;
            }
            ((TCP) iDTListenerS120S0100000_12.l0).getIconImgView().startAnimation(TCM.LJFF());
            return false;
        }
        W5G iconImgView = ((TCP) iDTListenerS120S0100000_12.l0).getIconImgView();
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100L);
        animationSet.setFillAfter(true);
        animationSet.addAnimation(scaleAnimation);
        iconImgView.startAnimation(animationSet);
        return false;
    }

    public static final boolean onTouch$1(IDTListenerS120S0100000_12 iDTListenerS120S0100000_12, View view, MotionEvent motionEvent) {
        ImageListViewModel wl = ((BillboardV2Fragment) iDTListenerS120S0100000_12.l0).wl();
        wl.getClass();
        try {
            XKQ xkq = wl.LJLJL;
            if (xkq != null) {
                xkq.LIZIZ(null);
                return true;
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static final boolean onTouch$10(IDTListenerS120S0100000_12 iDTListenerS120S0100000_12, View view, MotionEvent motionEvent) {
        ((InterfaceC65784Pro) iDTListenerS120S0100000_12.l0).invoke();
        return false;
    }

    public static final boolean onTouch$11(IDTListenerS120S0100000_12 iDTListenerS120S0100000_12, View view, MotionEvent motionEvent) {
        T5T t5t = (T5T) iDTListenerS120S0100000_12.l0;
        if (t5t != null) {
            t5t.clearFocus();
            KeyboardUtils.LIZIZ(t5t);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$12(IDTListenerS120S0100000_12 iDTListenerS120S0100000_12, View view, MotionEvent motionEvent) {
        Integer num;
        IPW ipw = null;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                ((C73046Sle) iDTListenerS120S0100000_12.l0).LIZLLL();
            } else if (num != null && (num.intValue() == 1 || num.intValue() == 3)) {
                IQ9 player = ((C73046Sle) iDTListenerS120S0100000_12.l0).getPlayer();
                if (player != null) {
                    ipw = player.LJIILL;
                }
                if (ipw == IPW.PLAYER_START) {
                    ((C73046Sle) iDTListenerS120S0100000_12.l0).LIZIZ(3000L);
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$13(IDTListenerS120S0100000_12 iDTListenerS120S0100000_12, View view, MotionEvent motionEvent) {
        Integer num;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null && num.intValue() != 0 && num != null && (num.intValue() == 1 || num.intValue() == 3)) {
            if (!((C73046Sle) iDTListenerS120S0100000_12.l0).getNeedShowMask()) {
                ((C73046Sle) iDTListenerS120S0100000_12.l0).LJFF();
            } else {
                ((C73046Sle) iDTListenerS120S0100000_12.l0).LIZIZ(0L);
            }
        }
        return false;
    }

    public static final boolean onTouch$14(IDTListenerS120S0100000_12 iDTListenerS120S0100000_12, View view, MotionEvent motionEvent) {
        Integer num;
        C73063Slv this$0 = (C73063Slv) iDTListenerS120S0100000_12.l0;
        o.LJIIIZ(this$0, "this$0");
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                this$0.LJ();
            } else if (num != null && ((num.intValue() == 1 || num.intValue() == 3) && IPZ.LIZ == IPX.PLAYER_START)) {
                this$0.LIZIZ(3000L);
            }
        }
        return false;
    }

    public static final boolean onTouch$2(IDTListenerS120S0100000_12 iDTListenerS120S0100000_12, View view, MotionEvent event) {
        o.LJIIIIZZ(event, "event");
        if (event.getAction() == 1) {
            TM8 tm8 = (TM8) iDTListenerS120S0100000_12.l0;
            if (!tm8.LJII) {
                tm8.LJII = true;
                tm8.LJIILL.setVisibility(0);
                tm8.LIZIZ().loadData();
                EditText editText = tm8.LIZIZ;
                C83547Wqd c83547Wqd = null;
                if (editText != null) {
                    editText.post(new ARunnableS48S0100000_12(tm8, 64));
                    if (tm8.LJIJ) {
                        C31561Ca5 c31561Ca5 = tm8.LJ;
                        if (c31561Ca5 != null) {
                            c31561Ca5.LIZ(true);
                        } else {
                            o.LJIJI("showHideAnim");
                            throw null;
                        }
                    }
                    Activity activity = tm8.LJIILLIIL;
                    if (activity != null) {
                        c83547Wqd = new C83547Wqd(activity, null);
                    }
                    tm8.LJIIJJI = c83547Wqd;
                    if (c83547Wqd != null) {
                        c83547Wqd.LIZIZ(tm8.LJIIL);
                    }
                    tm8.LJI.onNext(Boolean.TRUE);
                } else {
                    o.LJIJI("searchEditView");
                    throw null;
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$3(IDTListenerS120S0100000_12 iDTListenerS120S0100000_12, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                float x = motionEvent.getX();
                float f = ((C56K) iDTListenerS120S0100000_12.l0).element;
                if (x - f <= 0.0f || f == 0.0f) {
                    C27949Ay1.LJIIZILJ("more");
                } else {
                    C27949Ay1.LJIIZILJ("less");
                }
                ((C56K) iDTListenerS120S0100000_12.l0).element = motionEvent.getX();
            }
        } else {
            ((C56K) iDTListenerS120S0100000_12.l0).element = motionEvent.getX();
        }
        return false;
    }

    public static final boolean onTouch$4(IDTListenerS120S0100000_12 iDTListenerS120S0100000_12, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((SkuPanelFragment) iDTListenerS120S0100000_12.l0).vl().iw0(false);
        }
        return false;
    }

    public static final boolean onTouch$5(IDTListenerS120S0100000_12 iDTListenerS120S0100000_12, View view, MotionEvent motionEvent) {
        Integer num;
        C116454hd c116454hd;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null && num.intValue() != 0 && num != null && ((num.intValue() == 1 || num.intValue() == 3) && (c116454hd = ((LiveReplayVideoPlayerDialogFragment) iDTListenerS120S0100000_12.l0).LJLJJL) != null)) {
            c116454hd.performClick();
        }
        return false;
    }

    public static final boolean onTouch$6(IDTListenerS120S0100000_12 iDTListenerS120S0100000_12, View view, MotionEvent motionEvent) {
        Integer num;
        boolean z;
        String str;
        String str2;
        String str3 = null;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            C71365Rzd c71365Rzd = (C71365Rzd) iDTListenerS120S0100000_12.l0;
            int i = c71365Rzd.LJLLLL;
            Aweme aweme = c71365Rzd.LJLIL.getAweme();
            int LJI = C71366Rze.LJI(ORZ.LLJILJILJ(((C71365Rzd) iDTListenerS120S0100000_12.l0).LJLJI));
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            OSZ[] oszArr = new OSZ[12];
            oszArr[0] = new OSZ("page_name", "video");
            if (z) {
                str = "more";
            } else {
                str = "less";
            }
            oszArr[1] = new OSZ("glide_type", str);
            if (aweme != null) {
                str2 = aweme.getGroupId();
            } else {
                str2 = null;
            }
            oszArr[2] = new OSZ("list_source_content_id", str2);
            oszArr[3] = new OSZ("list_name", "video_shopping_list");
            oszArr[4] = new OSZ("follow_status", S0V.LIZ(aweme));
            if (aweme != null) {
                str3 = aweme.getAuthorUid();
            }
            oszArr[5] = new OSZ("author_id", str3);
            String str4 = "video_multi_anchor";
            oszArr[6] = new OSZ("enter_list_form", "video_multi_anchor");
            String LJIIJ = C71360RzY.LJIIJ(aweme, true);
            if (LJIIJ != null) {
                str4 = LJIIJ;
            }
            oszArr[7] = new OSZ("entrance_form", str4);
            C71361RzZ.LIZ.getClass();
            oszArr[8] = new OSZ("pure_ecommerce", Integer.valueOf(C71361RzZ.LJJJIL(aweme) ? 1 : 0));
            oszArr[9] = new OSZ("is_add_maybe_you_like", 0);
            oszArr[10] = new OSZ("video_shopping_list_style", 0);
            oszArr[11] = new OSZ("product_source", Integer.valueOf(LJI));
            b.LJJIJIIJIL("tiktokec_glide_page", oszArr);
            ((C71365Rzd) iDTListenerS120S0100000_12.l0).LJLLLL = 0;
        }
        return false;
    }

    public static final boolean onTouch$7(IDTListenerS120S0100000_12 iDTListenerS120S0100000_12, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                float x = motionEvent.getX();
                float f = ((C56K) iDTListenerS120S0100000_12.l0).element;
                if (x - f <= 0.0f || f == 0.0f) {
                    C27949Ay1.LJIIZILJ("more");
                } else {
                    C27949Ay1.LJIIZILJ("less");
                }
                ((C56K) iDTListenerS120S0100000_12.l0).element = motionEvent.getX();
            }
        } else {
            ((C56K) iDTListenerS120S0100000_12.l0).element = motionEvent.getX();
        }
        return false;
    }

    public static final boolean onTouch$8(IDTListenerS120S0100000_12 iDTListenerS120S0100000_12, View view, MotionEvent motionEvent) {
        Integer num;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                ((C73053Sll) iDTListenerS120S0100000_12.l0).LJ();
            } else if (num != null && ((num.intValue() == 1 || num.intValue() == 3) && IPZ.LIZ == IPX.PLAYER_START && ((C73053Sll) iDTListenerS120S0100000_12.l0).getNeedHide())) {
                ((C73053Sll) iDTListenerS120S0100000_12.l0).LIZIZ(3000L);
            }
        }
        return false;
    }

    public static final boolean onTouch$9(IDTListenerS120S0100000_12 iDTListenerS120S0100000_12, View view, MotionEvent motionEvent) {
        Integer num;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null && num.intValue() != 0 && num != null && (num.intValue() == 1 || num.intValue() == 3)) {
            if (!((C73053Sll) iDTListenerS120S0100000_12.l0).getNeedShowMask()) {
                ((C73053Sll) iDTListenerS120S0100000_12.l0).LJ();
            } else if (((C73053Sll) iDTListenerS120S0100000_12.l0).getNeedHide()) {
                ((C73053Sll) iDTListenerS120S0100000_12.l0).LIZIZ(0L);
            }
        }
        return false;
    }
}
