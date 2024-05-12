package com.bytedance.touchpoint.core.redpacketpendant.manager;

import X.AbstractC247499nV;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C184077Kh;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C245559kN;
import X.C246049lA;
import X.C247509nW;
import X.C247669nm;
import X.C248039oN;
import X.C248059oP;
import X.C248069oQ;
import X.C248079oR;
import X.C248089oS;
import X.C248099oT;
import X.C248109oU;
import X.C249969rU;
import X.C2MW;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C72818Shy;
import X.C78926UyI;
import X.C7MY;
import X.C95J;
import X.C95U;
import X.C9OS;
import X.DialogC248149oY;
import X.InterfaceC248189oc;
import X.KL2;
import X.ORZ;
import X.Q8U;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.model.DynamicDialog;
import com.bytedance.touchpoint.core.model.RedPacketPendant;
import com.bytedance.touchpoint.core.model.Title;
import com.bytedance.touchpoint.core.redpacketpendant.RedPacketPendantViewModel;
import com.bytedance.touchpoint.core.redpacketpendant.manager.RedPacketPendantManager;
import com.bytedance.touchpoint.core.viewmodel.BaseTouchPointDataVM;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS170S0100000_4;
import ujb.o;

/* loaded from: classes5.dex */
public final class RedPacketPendantManager extends AbsPendantManager {
    public static final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C248099oT.LJLIL);
    public C248039oN LJLJJI;
    public boolean LJLJJL;
    public DialogC248149oY LJLJJLL;
    public boolean LJLJL;

    public final void LJJIJ() {
        DialogC248149oY dialogC248149oY;
        this.LJLJI = null;
        this.LJLJL = false;
        DialogC248149oY dialogC248149oY2 = this.LJLJJLL;
        if ((dialogC248149oY2 == null || !dialogC248149oY2.isShowing()) && (dialogC248149oY = this.LJLJJLL) != null) {
            C72818Shy.LJII("referral_popup_closed", dialogC248149oY);
            C72818Shy.LJII("referral_popup_present_page", dialogC248149oY);
            C72818Shy.LJII("referral_popup_click", dialogC248149oY);
            C72818Shy.LJII("referral_popup_resource_load_failed", dialogC248149oY);
        }
        DialogC248149oY dialogC248149oY3 = this.LJLJJLL;
        if (dialogC248149oY3 != null) {
            dialogC248149oY3.LJLJJI = true;
        }
        LJJIJIIJI();
        C248109oU.LJLZ.getClass();
        C9OS.LIZ().LJLLLL = null;
    }

    @Override // com.bytedance.touchpoint.core.redpacketpendant.manager.AbsPendantManager, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC244999jT
    public final BaseTouchPointDataVM LJJ() {
        C246049lA c246049lA = C246049lA.LJLILLLLZI;
        return (BaseTouchPointDataVM) new C214378bB(C65352Pkq.LIZ(RedPacketPendantViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C248059oP.INSTANCE, null, null).getValue();
    }

    @Override // com.bytedance.touchpoint.core.redpacketpendant.manager.AbsPendantManager
    public final boolean LJJIFFI() {
        int i;
        if (!this.LJLJL) {
            return false;
        }
        C248109oU.LJLZ.getClass();
        C248109oU LIZ = C9OS.LIZ();
        RedPacketPendant redPacketPendant = (RedPacketPendant) this.LJLJI;
        LIZ.getClass();
        if (redPacketPendant != null && (C247509nW.LIZIZ() || LIZ.LJLIL.getLong("countdown_finish_date", 0L) != C245559kN.LIZ())) {
            Integer num = redPacketPendant.disappearCountDown;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            ActivityTask activityTask = (ActivityTask) ORZ.LJLLLLLL(0, LIZ.LJLJJI);
            if (activityTask != null) {
                activityTask.time = i;
            }
            if (!LIZ.LJIJJLI() || i - LIZ.LJLILLLLZI > 0) {
                C249969rU c249969rU = (C249969rU) C95J.LIZ(1);
                if (c249969rU != null) {
                    c249969rU.LIZLLL();
                }
                return true;
            }
        }
        return false;
    }

    public final void LJJIIJZLJL() {
        Context context;
        ViewParent viewParent;
        long j;
        int i;
        int LIZIZ;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            if (this.LJLJJI == null) {
                this.LJLJJI = new C248039oN(context);
            }
            C248039oN c248039oN = this.LJLJJI;
            ViewGroup.LayoutParams layoutParams2 = null;
            if (c248039oN != null) {
                viewParent = c248039oN.getParent();
            } else {
                viewParent = null;
            }
            if (!(viewParent instanceof ViewGroup)) {
                viewParent = null;
            }
            ViewGroup viewGroup2 = (ViewGroup) viewParent;
            if (viewGroup2 != null) {
                C16880lQ.LJLLL(this.LJLJJI, viewGroup2);
            }
            ViewGroup viewGroup3 = this.LJLIL;
            if (((viewGroup3 instanceof FrameLayout) || (viewGroup3 instanceof RelativeLayout)) && viewGroup3 != null) {
                viewGroup3.addView(this.LJLJJI);
            }
            C248039oN c248039oN2 = this.LJLJJI;
            if (c248039oN2 != null && (layoutParams = c248039oN2.getLayoutParams()) != null) {
                layoutParams.height = -2;
                layoutParams.width = -2;
                layoutParams2 = layoutParams;
            }
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (C248069oQ.LIZ(context)) {
                    LIZIZ = C7MY.LIZIZ(228);
                } else {
                    LIZIZ = C7MY.LIZIZ(218);
                }
                marginLayoutParams.topMargin = KL2.LJIIL(context) + LIZIZ;
            }
            C248039oN c248039oN3 = this.LJLJJI;
            if (c248039oN3 != null) {
                c248039oN3.setLayoutParams(layoutParams2);
            }
            C248039oN c248039oN4 = this.LJLJJI;
            if (c248039oN4 != null) {
                c248039oN4.LIZ((RedPacketPendant) this.LJLJI, new AqS170S0100000_4(this, 1107));
            }
            C248109oU.LJLZ.getClass();
            C9OS.LIZ().LJLLLL = this;
            C248109oU LIZ = C9OS.LIZ();
            RedPacketPendant redPacketPendant = (RedPacketPendant) this.LJLJI;
            LIZ.getClass();
            if (redPacketPendant != null) {
                Integer num = redPacketPendant.disappearCountDown;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                ActivityTask activityTask = (ActivityTask) ORZ.LJLLLLLL(0, LIZ.LJLJJI);
                if (activityTask != null) {
                    activityTask.time = i;
                }
                if (LIZ.LJIJJLI()) {
                    j = i - LIZ.LJLILLLLZI;
                    LJJIIZI(j);
                }
            }
            j = 0;
            LJJIIZI(j);
        }
    }

    public final boolean LJJIIZ() {
        C248039oN c248039oN = this.LJLJJI;
        if (c248039oN != null && c248039oN.getParent() != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.touchpoint.core.redpacketpendant.manager.AbsPendantManager
    public final void LJJIIJ() {
        ActivityC45651qj LIZLLL;
        final RedPacketPendant redPacketPendant;
        LJJIJ();
        C95U LIZLLL2 = C2MW.LIZ().LIZLLL(30);
        this.LJLJI = LIZLLL2;
        if (LIZLLL2 == null) {
            return;
        }
        AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
        String str = null;
        if (abstractC247499nV != null && (LIZLLL = abstractC247499nV.LIZLLL()) != null && (redPacketPendant = (RedPacketPendant) this.LJLJI) != null) {
            StringBuilder LIZ = X1D.LIZ();
            DynamicDialog dynamicDialog = redPacketPendant.popup;
            if (dynamicDialog != null) {
                str = dynamicDialog.jsSource;
            }
            LIZ.append(str);
            LIZ.append("&data=");
            LIZ.append(URLEncoder.encode(redPacketPendant.LJI));
            LIZ.append("&touchpointId=");
            LIZ.append(Integer.valueOf(redPacketPendant.LIZ).intValue());
            C248079oR c248079oR = new C248079oR(X1D.LIZIZ(LIZ), "", false);
            c248079oR.LIZ = new InterfaceC248189oc() { // from class: X.9oM
                @Override // X.InterfaceC248189oc
                public final void onDismiss() {
                }

                @Override // X.InterfaceC248189oc
                public final void LIZ() {
                    Integer num;
                    int i;
                    Integer num2;
                    RedPacketPendantManager redPacketPendantManager = RedPacketPendantManager.this;
                    redPacketPendantManager.LJLJL = true;
                    if (redPacketPendantManager.LJJI()) {
                        RedPacketPendantManager.this.LJJIIJZLJL();
                    }
                    RedPacketPendant redPacketPendant2 = redPacketPendant;
                    if (redPacketPendant2 != null) {
                        num = Integer.valueOf(redPacketPendant2.LIZ);
                    } else {
                        num = null;
                    }
                    int intValue = num.intValue();
                    RedPacketPendant redPacketPendant3 = redPacketPendant;
                    if (redPacketPendant3 != null && (num2 = redPacketPendant3.LIZJ) != null) {
                        i = num2.intValue();
                    } else {
                        i = -1;
                    }
                    C247749nu.LIZ(1, intValue, i, "");
                }

                @Override // X.InterfaceC248189oc
                public final void LIZIZ() {
                    RedPacketPendantManager.this.LJJIJ();
                }

                @Override // X.InterfaceC248189oc
                public final void onShow() {
                    String str2;
                    C247519nX c247519nX = C247519nX.LIZ;
                    int i = redPacketPendant.LIZ;
                    LinkedHashMap LIZ2 = C0JU.LIZ("sub_type", "2");
                    LIZ2.put("notification_name", redPacketPendant.notificationName);
                    DynamicDialog dynamicDialog2 = redPacketPendant.popup;
                    if (dynamicDialog2 != null) {
                        str2 = dynamicDialog2.popName;
                    } else {
                        str2 = null;
                    }
                    LIZ2.put("pop_name", str2);
                    C247519nX.LJIIL(c247519nX, i, LIZ2, null, null, 60);
                }

                @Override // X.InterfaceC248189oc
                public final void LIZJ(String str2) {
                    Integer num;
                    int i;
                    Integer num2;
                    RedPacketPendant redPacketPendant2 = redPacketPendant;
                    if (redPacketPendant2 != null) {
                        num = Integer.valueOf(redPacketPendant2.LIZ);
                    } else {
                        num = null;
                    }
                    int intValue = num.intValue();
                    RedPacketPendant redPacketPendant3 = redPacketPendant;
                    if (redPacketPendant3 != null && (num2 = redPacketPendant3.LIZJ) != null) {
                        i = num2.intValue();
                    } else {
                        i = -1;
                    }
                    C247749nu.LIZ(0, intValue, i, "");
                }

                @Override // X.InterfaceC248189oc
                public final void onClick(String str2) {
                    String str3;
                    C247519nX c247519nX = C247519nX.LIZ;
                    int i = redPacketPendant.LIZ;
                    LinkedHashMap LIZIZ = JF1.LIZIZ("sub_type", "2", "click_position", str2);
                    LIZIZ.put("notification_name", redPacketPendant.notificationName);
                    DynamicDialog dynamicDialog2 = redPacketPendant.popup;
                    if (dynamicDialog2 != null) {
                        str3 = dynamicDialog2.popName;
                    } else {
                        str3 = null;
                    }
                    LIZIZ.put("pop_name", str3);
                    C247519nX.LJIIIZ(c247519nX, i, LIZIZ, null, null, 28);
                }
            };
            this.LJLJJLL = new DialogC248149oY(LIZLLL, new C248089oS(c248079oR));
        }
    }

    public final void LJJIJIIJI() {
        if (LJJIIZ()) {
            C248039oN c248039oN = this.LJLJJI;
            if (c248039oN != null) {
                c248039oN.getBottomTextView().setVisibility(8);
                c248039oN.setOnClickListener(new ViewOnClickListenerC13880ga(null));
                ViewParent parent = c248039oN.getParent();
                if (!(parent instanceof ViewGroup)) {
                    parent = null;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup != null) {
                    C16880lQ.LJLLL(c248039oN, viewGroup);
                }
            }
            this.LJLJJI = null;
            this.LJLJJL = false;
            C247669nm.LIZ().LJJI().LJJIII(false);
        }
    }

    @Override // com.bytedance.touchpoint.core.redpacketpendant.manager.AbsPendantManager
    public final void LJJII() {
        LJJIJ();
    }

    @Override // com.bytedance.touchpoint.core.redpacketpendant.manager.AbsPendantManager
    public final void LJJIII() {
        LJJIJ();
    }

    public final void LJJIIZI(long j) {
        String str;
        Title title;
        String str2;
        long j2 = 60;
        String LIZIZ = Q8U.LIZIZ(new Object[]{Long.valueOf(j / j2), Long.valueOf(j % j2)}, 2, "%02d:%02d", "java.lang.String.format(format, *args)");
        C248039oN c248039oN = this.LJLJJI;
        if (c248039oN != null) {
            RedPacketPendant redPacketPendant = (RedPacketPendant) this.LJLJI;
            if (redPacketPendant != null && (title = redPacketPendant.bottomText) != null && (str2 = title.text) != null) {
                str = o.LJJJJZ(str2, "{countdown}", LIZIZ, false);
            } else {
                str = "";
            }
            c248039oN.setBottomText(str);
        }
        if (j == 0) {
            LJJIJ();
        }
    }
}
