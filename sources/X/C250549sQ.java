package X;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.touchpoint.core.inapppush.InAppPushViewModel;
import com.bytedance.touchpoint.core.model.Control;
import com.bytedance.touchpoint.core.model.InAppPush;
import com.bytedance.touchpoint.core.viewmodel.BaseTouchPointDataVM;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9sQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C250549sQ extends AbstractC244999jT {
    public static final C5H3 LJLJLJ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C250639sZ.LJLIL);
    public final List<InAppPush> LJLIL = new ArrayList();
    public final List<InAppPush> LJLILLLLZI = new ArrayList();
    public final List<InAppPush> LJLJI = new ArrayList();
    public final List<InAppPush> LJLJJI = new ArrayList();
    public boolean LJLJJL;
    public final boolean LJLJJLL;
    public final C214378bB LJLJL;

    public C250549sQ() {
        boolean z;
        C246049lA c246049lA = C246049lA.LJLILLLLZI;
        C214378bB c214378bB = new C214378bB(C65352Pkq.LIZ(InAppPushViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C250599sV.INSTANCE, null, null);
        this.LJLJL = c214378bB;
        C8YN.LJII(this, (AssemViewModel) c214378bB.getValue(), new TBT() { // from class: X.9Ot
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Long.valueOf(((C236009Oa) obj).LJLIL);
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 339), 4);
        C8YN.LJII(this, (AssemViewModel) c214378bB.getValue(), new TBT() { // from class: X.9P7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C236009Oa) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 340), 4);
        C250609sW c250609sW = (C250609sW) C95J.LIZ(6);
        if (c250609sW != null) {
            z = c250609sW.LIZJ();
        } else {
            z = false;
        }
        this.LJLJJLL = z;
    }

    @Override // X.AbstractC244999jT
    public final BaseTouchPointDataVM LJJ() {
        return (BaseTouchPointDataVM) this.LJLJL.getValue();
    }

    public final boolean LJJI() {
        C250209rs LIZ;
        if ((!this.LJLJJLL && ViewOnClickListenerC250559sR.LJLL) || this.LJLJJL || (LIZ = C95J.LIZ(6)) == null || !LIZ.LIZ()) {
            return false;
        }
        return true;
    }

    public final void LJJIFFI() {
        ((ArrayList) this.LJLIL).clear();
        ((ArrayList) this.LJLILLLLZI).clear();
        ((ArrayList) this.LJLJI).clear();
        ((ArrayList) this.LJLJJI).clear();
    }

    public final void LJJIIJ(InAppPush inAppPush) {
        Activity LJII;
        o.LJIIIZ(inAppPush, "inAppPush");
        try {
            int i = 0;
            String str = "";
            if (LJJI()) {
                AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
                if (abstractC247499nV != null && (LJII = abstractC247499nV.LJII()) != null) {
                    LJJIII(LJII, inAppPush);
                    return;
                }
                ((ArrayList) this.LJLJJI).add(inAppPush);
                Control control = inAppPush.control;
                if (control != null) {
                    i = control.type;
                }
                String str2 = inAppPush.inAppPushName;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = inAppPush.taskIds;
                if (str3 != null) {
                    str = str3;
                }
                C247519nX.LIZJ(i, str2, str, "not_cold_launch");
                return;
            }
            ((ArrayList) this.LJLJJI).add(inAppPush);
            Control control2 = inAppPush.control;
            if (control2 != null) {
                i = control2.type;
            }
            String str4 = inAppPush.inAppPushName;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = inAppPush.taskIds;
            if (str5 != null) {
                str = str5;
            }
            C247519nX.LIZJ(i, str4, str, "occupied");
        } catch (Exception unused) {
        }
    }

    public final void LJJII(int i, String taskId) {
        List<InAppPush> list;
        int i2;
        String str;
        o.LJIIIZ(taskId, "taskId");
        if (i == 6) {
            list = this.LJLILLLLZI;
        } else {
            list = this.LJLJI;
        }
        if (list != null && !list.isEmpty() && 0 == 0) {
            for (InAppPush inAppPush : list) {
                Control control = inAppPush.control;
                if (control != null) {
                    str = control.taskName;
                } else {
                    str = null;
                }
                if (o.LJ(str, taskId)) {
                    LJJIIJ(inAppPush);
                    return;
                }
            }
        }
        if (i == 6) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        C247519nX.LIZJ(i2, "", "", "key_not_match");
    }

    public final void LJJIII(Activity activity, InAppPush inAppPush) {
        View view;
        Integer num;
        String str;
        Integer num2;
        String str2;
        if (this.LJLJJLL) {
            C250609sW c250609sW = (C250609sW) C95J.LIZ(6);
            if (c250609sW != null) {
                c250609sW.LIZLLL(inAppPush);
                return;
            }
            return;
        }
        o.LJIIIZ(inAppPush, "inAppPush");
        ViewOnClickListenerC250559sR viewOnClickListenerC250559sR = new ViewOnClickListenerC250559sR(activity, inAppPush);
        C250779sn c250779sn = viewOnClickListenerC250559sR.LJLJJLL;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c250779sn.LJLJI, "translationY", c250779sn.LJLJI.getTranslationY(), 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
        if (viewOnClickListenerC250559sR.LJLJLJ.isFinishing() || viewOnClickListenerC250559sR.isShowing()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = viewOnClickListenerC250559sR.LJLIL;
        viewOnClickListenerC250559sR.LJLJI = currentTimeMillis + j;
        viewOnClickListenerC250559sR.LJLJJLL.postDelayed(viewOnClickListenerC250559sR.LJLJJI, j);
        if (viewOnClickListenerC250559sR.LJLJJL.getParent() != null) {
            ViewParent parent = viewOnClickListenerC250559sR.LJLJJL.getParent();
            if (parent != null) {
                C16880lQ.LJLLL(viewOnClickListenerC250559sR.LJLJJL, (ViewGroup) parent);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        try {
            Window window = viewOnClickListenerC250559sR.LJLJLJ.getWindow();
            if (window != null) {
                view = window.getDecorView();
            } else {
                view = null;
            }
            C16880lQ.LLJLLL(viewOnClickListenerC250559sR, view, -KL2.LJIIL(viewOnClickListenerC250559sR.LIZJ()));
            InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
            if (interfaceC247459nR != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Control control = viewOnClickListenerC250559sR.LJLJLLL.control;
                if (control != null) {
                    num2 = Integer.valueOf(control.type);
                } else {
                    num2 = null;
                }
                linkedHashMap.put("type", String.valueOf(num2));
                String str3 = viewOnClickListenerC250559sR.LJLJLLL.inAppPushName;
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                linkedHashMap.put("name", str3);
                String str5 = viewOnClickListenerC250559sR.LJLJLLL.taskIds;
                if (str5 != null) {
                    str4 = str5;
                }
                linkedHashMap.put("task_id", str4);
                AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
                if (abstractC247499nV != null) {
                    str2 = abstractC247499nV.LJIIJ();
                } else {
                    str2 = null;
                }
                linkedHashMap.put("region", str2);
                interfaceC247459nR.LIZIZ("inapp_push_show", linkedHashMap);
            }
            String str6 = viewOnClickListenerC250559sR.LJLJLLL.LIZIZ;
            if (str6 != null && str6.length() != 0) {
                C247519nX c247519nX = C247519nX.LIZ;
                int i = viewOnClickListenerC250559sR.LJLJLLL.LIZ;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Control control2 = viewOnClickListenerC250559sR.LJLJLLL.control;
                if (control2 != null) {
                    num = Integer.valueOf(control2.type);
                } else {
                    num = null;
                }
                linkedHashMap2.put("sub_type", String.valueOf(num));
                Control control3 = viewOnClickListenerC250559sR.LJLJLLL.control;
                if (control3 != null) {
                    str = control3.taskName;
                } else {
                    str = null;
                }
                linkedHashMap2.put("task_key", str);
                C247519nX.LJIIL(c247519nX, i, linkedHashMap2, null, null, 60);
            }
            InterfaceC247459nR interfaceC247459nR2 = C95J.LIZ;
            if (interfaceC247459nR2 != null) {
                interfaceC247459nR2.LJ(null, true);
            }
            ViewOnClickListenerC250559sR.LJLL = true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
