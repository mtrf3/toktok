package X;

import Y.ACallableS107S0100000_4;
import Y.ARunnableS10S0110000_4;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.bytedance.touchpoint.core.model.Button;
import com.bytedance.touchpoint.core.model.Content;
import com.bytedance.touchpoint.core.model.Control;
import com.bytedance.touchpoint.core.model.InAppPush;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9sR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC250559sR extends PopupWindow implements InterfaceC250789so, View.OnClickListener {
    public static boolean LJLL;
    public static boolean LJLLI;
    public final int LJLIL;
    public boolean LJLILLLLZI;
    public long LJLJI;
    public final ARunnableS10S0110000_4 LJLJJI;
    public final View LJLJJL;
    public final C250779sn LJLJJLL;
    public final View LJLJL;
    public final Activity LJLJLJ;
    public final InAppPush LJLJLLL;

    @Override // X.InterfaceC250789so
    public final void LIZ() {
    }

    @Override // X.InterfaceC250789so
    public final void LIZIZ() {
        Integer num;
        this.LJLILLLLZI = false;
        if (isShowing()) {
            InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
            if (interfaceC247459nR != null) {
                LinkedHashMap LIZ = C0JU.LIZ("button_name", "close");
                Control control = this.LJLJLLL.control;
                String str = null;
                if (control != null) {
                    num = Integer.valueOf(control.type);
                } else {
                    num = null;
                }
                LIZ.put("type", String.valueOf(num));
                String str2 = this.LJLJLLL.inAppPushName;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                LIZ.put("name", str2);
                String str4 = this.LJLJLLL.taskIds;
                if (str4 != null) {
                    str3 = str4;
                }
                LIZ.put("task_id", str3);
                AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
                if (abstractC247499nV != null) {
                    str = abstractC247499nV.LJIIJ();
                }
                LIZ.put("region", str);
                interfaceC247459nR.LIZIZ("inapp_push_click", LIZ);
            }
            LIZLLL(true);
        }
    }

    public final Context LIZJ() {
        Context LJ;
        AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
        if (abstractC247499nV != null && (LJ = abstractC247499nV.LJ()) != null) {
            return LJ;
        }
        View contentView = getContentView();
        o.LJIIIIZZ(contentView, "contentView");
        Context context = contentView.getContext();
        o.LJIIIIZZ(context, "contentView.context");
        return context;
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        LJLL = false;
        C10K.LIZJ(new ACallableS107S0100000_4(this, 0));
        super.dismiss();
    }

    public final void LIZLLL(boolean z) {
        if (isShowing() && !this.LJLILLLLZI) {
            try {
                if (!this.LJLJLJ.isFinishing()) {
                    this.LJLJJLL.LIZ(0.0f, true);
                    dismiss();
                }
            } catch (Exception unused) {
            }
        }
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("isManual", String.valueOf(z));
            interfaceC247459nR.LJ(linkedHashMap, false);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        String str;
        Integer num;
        String str2;
        o.LJIIIZ(v, "v");
        if (v.getId() == R.id.j7n) {
            WeakHashMap<View, Long> weakHashMap = C250619sX.LIZ;
            Long l = weakHashMap.get(v);
            long nanoTime = System.nanoTime() / 1000000;
            if (l == null) {
                weakHashMap.put(v, Long.valueOf(nanoTime));
            } else if (nanoTime - l.longValue() <= 1200) {
                return;
            } else {
                weakHashMap.put(v, Long.valueOf(nanoTime));
            }
            InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
            String str3 = "";
            Integer num2 = null;
            if (interfaceC247459nR != null) {
                LinkedHashMap LIZ = C0JU.LIZ("button_name", "ok");
                Control control = this.LJLJLLL.control;
                if (control != null) {
                    num = Integer.valueOf(control.type);
                } else {
                    num = null;
                }
                LIZ.put("type", String.valueOf(num));
                String str4 = this.LJLJLLL.inAppPushName;
                if (str4 == null) {
                    str4 = "";
                }
                LIZ.put("name", str4);
                String str5 = this.LJLJLLL.taskIds;
                if (str5 == null) {
                    str5 = "";
                }
                LIZ.put("task_id", str5);
                AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
                if (abstractC247499nV != null) {
                    str2 = abstractC247499nV.LJIIJ();
                } else {
                    str2 = null;
                }
                LIZ.put("region", str2);
                interfaceC247459nR.LIZIZ("inapp_push_click", LIZ);
            }
            String str6 = this.LJLJLLL.LIZIZ;
            if (str6 != null && str6.length() != 0) {
                C247519nX c247519nX = C247519nX.LIZ;
                int i = this.LJLJLLL.LIZ;
                LinkedHashMap LIZ2 = C0JU.LIZ("click_position", "ok");
                Control control2 = this.LJLJLLL.control;
                if (control2 != null) {
                    num2 = Integer.valueOf(control2.type);
                }
                LIZ2.put("sub_type", String.valueOf(num2));
                Control control3 = this.LJLJLLL.control;
                if (control3 != null && (str = control3.taskName) != null) {
                    str3 = str;
                }
                LIZ2.put("task_key", str3);
                C247519nX.LJIIIZ(c247519nX, i, LIZ2, null, null, 28);
            }
            LJLLI = true;
            InAppPush inAppPush = this.LJLJLLL;
            String str7 = inAppPush.jumpLink;
            if (str7 != null) {
                C250729si.LIZ(this.LJLJLJ, str7, inAppPush.LIZIZ, inAppPush.LJ, false);
            }
            LIZLLL(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC250559sR(Activity activity, InAppPush inAppPush) {
        super(activity);
        int i;
        Content content;
        String str;
        int i2;
        Content content2;
        Content content3;
        String str2;
        String str3;
        o.LJIIIZ(inAppPush, "inAppPush");
        this.LJLJLJ = activity;
        this.LJLJLLL = inAppPush;
        this.LJLIL = 5000;
        Object LLILL = C16880lQ.LLILL(LIZJ(), "layout_inflater");
        if (LLILL != null) {
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.csx, (LayoutInflater) LLILL, null);
            o.LJIIIIZZ(LLLZIIL, "inflater.inflate(R.layou…_app_push_view_opt, null)");
            this.LJLJJL = LLLZIIL;
            View findViewById = LLLZIIL.findViewById(R.id.ig1);
            o.LJIIIIZZ(findViewById, "contentLayoutView.findViewById(R.id.pull_layout)");
            C250779sn c250779sn = (C250779sn) findViewById;
            this.LJLJJLL = c250779sn;
            View findViewById2 = LLLZIIL.findViewById(R.id.j7n);
            o.LJIIIIZZ(findViewById2, "contentLayoutView.findViewById(R.id.root_layout)");
            this.LJLJL = findViewById2;
            View findViewById3 = LLLZIIL.findViewById(R.id.ebq);
            o.LJIIIIZZ(findViewById3, "contentLayoutView.findViewById(R.id.icon_img)");
            W5G w5g = (W5G) findViewById3;
            View findViewById4 = LLLZIIL.findViewById(R.id.message_tv);
            o.LJIIIIZZ(findViewById4, "contentLayoutView.findViewById(R.id.message_tv)");
            TuxTextView tuxTextView = (TuxTextView) findViewById4;
            View findViewById5 = LLLZIIL.findViewById(R.id.dxj);
            o.LJIIIIZZ(findViewById5, "contentLayoutView.findViewById(R.id.go_tv)");
            TuxTextView tuxTextView2 = (TuxTextView) findViewById5;
            if (inAppPush.bgColor != null) {
                GradientDrawable LIZIZ = T28.LIZIZ(0);
                LIZIZ.setCornerRadius(KL2.LIZJ(activity, 12.0f));
                Context context = findViewById2.getContext();
                o.LJIIIIZZ(context, "rootView.context");
                LIZIZ.setColor(C247489nU.LIZ(R.attr.dj, context));
                findViewById2.setBackground(LIZIZ);
            }
            C16880lQ.LJIIJ(this, findViewById2);
            c250779sn.LJLJI = findViewById2;
            c250779sn.setPullUpListener(this);
            c250779sn.setInternalTouchEventListener(new InterfaceC250629sY() { // from class: X.9sU
                @Override // X.InterfaceC250629sY
                public final void LJIIIIZZ(MotionEvent event) {
                    o.LJIIIIZZ(event, "event");
                    int action = event.getAction();
                    if (action != 0) {
                        if (action != 1) {
                            if (action != 2) {
                                return;
                            }
                            ViewOnClickListenerC250559sR.this.LJLILLLLZI = true;
                            return;
                        }
                        ViewOnClickListenerC250559sR viewOnClickListenerC250559sR = ViewOnClickListenerC250559sR.this;
                        viewOnClickListenerC250559sR.LJLILLLLZI = false;
                        long currentTimeMillis = System.currentTimeMillis();
                        ViewOnClickListenerC250559sR viewOnClickListenerC250559sR2 = ViewOnClickListenerC250559sR.this;
                        long j = viewOnClickListenerC250559sR2.LJLIL;
                        viewOnClickListenerC250559sR.LJLJI = currentTimeMillis + j;
                        ARunnableS10S0110000_4 aRunnableS10S0110000_4 = viewOnClickListenerC250559sR2.LJLJJI;
                        aRunnableS10S0110000_4.z1 = false;
                        viewOnClickListenerC250559sR2.LJLJL.postDelayed(aRunnableS10S0110000_4, j);
                        return;
                    }
                    ViewOnClickListenerC250559sR viewOnClickListenerC250559sR3 = ViewOnClickListenerC250559sR.this;
                    viewOnClickListenerC250559sR3.LJLILLLLZI = true;
                    viewOnClickListenerC250559sR3.LJLJJI.z1 = true;
                }
            });
            Content content4 = inAppPush.content;
            tuxTextView.setText((content4 == null || (str3 = content4.text) == null) ? "" : str3);
            tuxTextView.setTextColor(C247489nU.LIZ(R.attr.go, LIZJ()));
            Content content5 = inAppPush.content;
            if (content5 != null) {
                i = content5.size;
            } else {
                i = 41;
            }
            tuxTextView.setTuxFont(i);
            Button button = inAppPush.button;
            if (button == null || (content = button.content) == null || (str = content.text) == null || str.length() == 0) {
                tuxTextView2.setVisibility(8);
            } else {
                tuxTextView2.setVisibility(0);
                Button button2 = inAppPush.button;
                tuxTextView2.setText((button2 == null || (content3 = button2.content) == null || (str2 = content3.text) == null) ? activity.getString(R.string.eh0) : str2);
                Button button3 = inAppPush.button;
                if (button3 != null && (content2 = button3.content) != null) {
                    i2 = content2.size;
                } else {
                    i2 = 72;
                }
                tuxTextView2.setTuxFont(i2);
                C250609sW c250609sW = (C250609sW) C95J.LIZ(6);
                if (c250609sW != null && c250609sW.LIZIZ()) {
                    Context context2 = tuxTextView2.getContext();
                    o.LJIIIIZZ(context2, "goTv.context");
                    tuxTextView2.setTextColor(C247489nU.LIZ(R.attr.eb, context2));
                    ViewGroup.LayoutParams layoutParams = tuxTextView2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (layoutParams instanceof LinearLayout.LayoutParams ? layoutParams : null);
                    if (marginLayoutParams != null) {
                        marginLayoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
                    }
                    tuxTextView2.setTuxFont(42);
                    tuxTextView2.setBackground(null);
                } else {
                    tuxTextView2.setMinWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(72)));
                    tuxTextView2.getLayoutParams().height = C7MY.LIZIZ(32);
                    tuxTextView2.setPadding(C7MY.LIZIZ(12), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), 0);
                    Context context3 = tuxTextView2.getContext();
                    o.LJIIIIZZ(context3, "goTv.context");
                    tuxTextView2.setTextColor(C247489nU.LIZ(R.attr.dj, context3));
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadius(KL2.LIZJ(activity, 5.0f));
                    Context context4 = tuxTextView2.getContext();
                    o.LJIIIIZZ(context4, "goTv.context");
                    gradientDrawable.setColor(C247489nU.LIZ(R.attr.eb, context4));
                    tuxTextView2.setBackground(gradientDrawable);
                }
            }
            String str4 = inAppPush.icon;
            if (str4 != null && str4.length() != 0) {
                w5g.setImageURI(inAppPush.icon);
            }
            this.LJLJJI = new ARunnableS10S0110000_4(this, 0);
            setBackgroundDrawable(new ColorDrawable(0));
            setContentView(LLLZIIL);
            setWidth(KL2.LJIIJJI(LIZJ()));
            setHeight(-2);
            update();
            setAnimationStyle(R.style.a8m);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
    }
}
