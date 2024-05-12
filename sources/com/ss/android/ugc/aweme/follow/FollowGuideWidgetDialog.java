package com.ss.android.ugc.aweme.follow;

import X.BZI;
import X.C0C3;
import X.C118024kA;
import X.C15380j0;
import X.C15490jB;
import X.C16880lQ;
import X.C28507BGt;
import X.C28787BRn;
import X.C29701Eo;
import X.C30868C9o;
import X.C47121t6;
import X.C55902Lwo;
import X.CFX;
import X.InterfaceC30442Bx8;
import Y.ARunnableS45S0100000_9;
import android.app.Dialog;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.follow.widget.FollowBigWidgetProvider;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import n.b;

/* loaded from: classes10.dex */
public final class FollowGuideWidgetDialog extends LiveDialogFragment implements View.OnClickListener, C0C3 {
    public static final /* synthetic */ int LJLZ = 0;
    public LiveIconView LJLIL;
    public C47121t6 LJLILLLLZI;
    public C47121t6 LJLJI;
    public C47121t6 LJLJJI;
    public ViewPager LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public C118024kA LJLLI;
    public int LJLLILLLL;
    public long LJLLLL;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();
    public final List<C29701Eo> LJLL = new ArrayList();
    public String LJLLJ = "";
    public String LJLLL = "close";

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final void Al() {
        View view = this.LJLJL;
        if (view != null) {
            view.setBackground(C15380j0.LJI(R.drawable.bpf));
            View view2 = this.LJLJLJ;
            if (view2 != null) {
                view2.setBackground(C15380j0.LJI(R.drawable.bpf));
                View view3 = this.LJLJLLL;
                if (view3 != null) {
                    view3.setBackground(C15380j0.LJI(R.drawable.bpf));
                    C47121t6 c47121t6 = this.LJLJJI;
                    if (c47121t6 != null) {
                        c47121t6.setBackground(C15380j0.LJI(R.drawable.bpc));
                        C47121t6 c47121t62 = this.LJLJJI;
                        if (c47121t62 != null) {
                            c47121t62.setTextColor(b.LIZIZ(R.attr.go, getContext()));
                            int i = this.LJLLILLLL;
                            if (i != 0) {
                                if (i != 1) {
                                    if (i != 2) {
                                        return;
                                    }
                                    View view4 = this.LJLJLLL;
                                    if (view4 != null) {
                                        view4.setBackground(C15380j0.LJI(R.drawable.bpe));
                                        C47121t6 c47121t63 = this.LJLJI;
                                        if (c47121t63 != null) {
                                            c47121t63.setText(getString(R.string.lzt));
                                            C47121t6 c47121t64 = this.LJLJJI;
                                            if (c47121t64 != null) {
                                                c47121t64.setBackground(C15380j0.LJI(R.drawable.agz));
                                                C47121t6 c47121t65 = this.LJLJJI;
                                                if (c47121t65 != null) {
                                                    c47121t65.setTextColor(b.LIZIZ(R.attr.cr, getContext()));
                                                    C47121t6 c47121t66 = this.LJLJJI;
                                                    if (c47121t66 != null) {
                                                        c47121t66.setText(getString(R.string.o7i));
                                                        wl();
                                                        xl();
                                                        return;
                                                    }
                                                    o.LJIJI("tvGotButton");
                                                    throw null;
                                                }
                                                o.LJIJI("tvGotButton");
                                                throw null;
                                            }
                                            o.LJIJI("tvGotButton");
                                            throw null;
                                        }
                                        o.LJIJI("tvDesc");
                                        throw null;
                                    }
                                    o.LJIJI("tvPoint3");
                                    throw null;
                                }
                                View view5 = this.LJLJLJ;
                                if (view5 != null) {
                                    view5.setBackground(C15380j0.LJI(R.drawable.bpe));
                                    C47121t6 c47121t67 = this.LJLJI;
                                    if (c47121t67 != null) {
                                        c47121t67.setText(getString(R.string.lzs));
                                        C47121t6 c47121t68 = this.LJLJJI;
                                        if (c47121t68 != null) {
                                            c47121t68.setText(getString(R.string.o7j));
                                            wl();
                                            xl();
                                            return;
                                        }
                                        o.LJIJI("tvGotButton");
                                        throw null;
                                    }
                                    o.LJIJI("tvDesc");
                                    throw null;
                                }
                                o.LJIJI("tvPoint2");
                                throw null;
                            }
                            View view6 = this.LJLJL;
                            if (view6 != null) {
                                view6.setBackground(C15380j0.LJI(R.drawable.bpe));
                                if (C55902Lwo.LIZ(getContext())) {
                                    C47121t6 c47121t69 = this.LJLJI;
                                    if (c47121t69 != null) {
                                        c47121t69.setText(getString(R.string.ka5));
                                        C47121t6 c47121t610 = this.LJLJJI;
                                        if (c47121t610 != null) {
                                            c47121t610.setBackground(C15380j0.LJI(R.drawable.agz));
                                            C47121t6 c47121t611 = this.LJLJJI;
                                            if (c47121t611 != null) {
                                                c47121t611.setTextColor(b.LIZIZ(R.attr.cr, getContext()));
                                                C47121t6 c47121t612 = this.LJLJJI;
                                                if (c47121t612 != null) {
                                                    c47121t612.setText(getString(R.string.o7i));
                                                } else {
                                                    o.LJIJI("tvGotButton");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("tvGotButton");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("tvGotButton");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("tvDesc");
                                        throw null;
                                    }
                                } else {
                                    C47121t6 c47121t613 = this.LJLJI;
                                    if (c47121t613 != null) {
                                        c47121t613.setText(getString(R.string.lzr));
                                        C47121t6 c47121t614 = this.LJLJJI;
                                        if (c47121t614 != null) {
                                            c47121t614.setText(getString(R.string.o7j));
                                        } else {
                                            o.LJIJI("tvGotButton");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("tvDesc");
                                        throw null;
                                    }
                                }
                                wl();
                                xl();
                                return;
                            }
                            o.LJIJI("tvPoint1");
                            throw null;
                        }
                        o.LJIJI("tvGotButton");
                        throw null;
                    }
                    o.LJIJI("tvGotButton");
                    throw null;
                }
                o.LJIJI("tvPoint3");
                throw null;
            }
            o.LJIJI("tvPoint2");
            throw null;
        }
        o.LJIJI("tvPoint1");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.bpa);
        c28507BGt.LIZIZ = 0;
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIIZ = -1;
        c28507BGt.LJIIJ = -2;
        return c28507BGt;
    }

    public final void wl() {
        long j;
        if (((ArrayList) this.LJLL).isEmpty() || this.LJLLILLLL > ((ArrayList) this.LJLL).size()) {
            return;
        }
        C29701Eo c29701Eo = (C29701Eo) ListProtector.get(this.LJLL, this.LJLLILLLL);
        if (C55902Lwo.LIZ(getContext())) {
            j = 300;
        } else {
            j = 0;
        }
        c29701Eo.postDelayed(new ARunnableS45S0100000_9((Object) c29701Eo, 45), j);
    }

    public final void xl() {
        BZI LIZ = C28787BRn.LIZ("livesdk_widget_tutorial_popup_show");
        LIZ.LJIJJ(this.LJLLJ, "from_position");
        LIZ.LJIJJ(Integer.valueOf(this.LJLLILLLL + 1), "page");
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Dialog dialog;
        super.onDestroyView();
        if (isShowing() && (dialog = getDialog()) != null) {
            dialog.dismiss();
        }
        _$_clearFindViewByIdCache();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf;
        Context context;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null) {
            return;
        }
        if (valueOf.intValue() == R.id.c__) {
            this.LJLLL = "close";
            dismiss();
            return;
        }
        if (valueOf.intValue() != R.id.m7n || this.LJLJJL == null) {
            return;
        }
        if (this.LJLLILLLL < 2 && !C55902Lwo.LIZ(getContext())) {
            int i = this.LJLLILLLL + 1;
            this.LJLLILLLL = i;
            ViewPager viewPager = this.LJLJJL;
            if (viewPager != null) {
                viewPager.setCurrentItem(i);
                return;
            } else {
                o.LJIJI("guideViewPager");
                throw null;
            }
        }
        if (C55902Lwo.LIZIZ() == 1 && (context = getContext()) != null && Build.VERSION.SDK_INT >= 26) {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            ComponentName componentName = new ComponentName(context, (Class<?>) FollowBigWidgetProvider.class);
            if (appWidgetManager.isRequestPinAppWidgetSupported()) {
                appWidgetManager.requestPinAppWidget(componentName, null, null);
            }
        }
        if (getContext() != null) {
            Boolean LIZJ = InterfaceC30442Bx8.W1.LIZJ();
            o.LJIIIIZZ(LIZJ, "FOLLOW_WIDGET_IS_ADDED.value");
            if (LIZJ.booleanValue()) {
                C30868C9o.LIZJ(R.string.lzv);
            }
        }
        this.LJLLL = "set widget";
        dismiss();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        String str;
        Context context;
        o.LJIIIZ(dialog, "dialog");
        String str2 = this.LJLLL;
        if (System.currentTimeMillis() - this.LJLLLL >= 1000) {
            this.LJLLLL = System.currentTimeMillis();
            BZI LIZ = C28787BRn.LIZ("livesdk_widget_tutorial_popup_click");
            LIZ.LJIJJ(this.LJLLJ, "from_position");
            LIZ.LJIJJ(str2, "click_type");
            if (1 == C55902Lwo.LIZIZ() && (context = getContext()) != null) {
                if (C55902Lwo.LJI(context, false).length == 0) {
                    str = "small";
                } else if (C55902Lwo.LJI(context, true).length == 0) {
                    str = "medium";
                }
                LIZ.LJIJJ(str, "widget_type");
                LIZ.LJIJJ(Integer.valueOf(this.LJLLILLLL + 1), "page");
                LIZ.LJJIIJZLJL();
            }
            str = "";
            LIZ.LJIJJ(str, "widget_type");
            LIZ.LJIJJ(Integer.valueOf(this.LJLLILLLL + 1), "page");
            LIZ.LJJIIJZLJL();
        }
        super.onDismiss(dialog);
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        if (!((ArrayList) this.LJLL).isEmpty()) {
            Iterator it = ((ArrayList) this.LJLL).iterator();
            while (it.hasNext()) {
                C29701Eo c29701Eo = (C29701Eo) it.next();
                c29701Eo.cancelAnimation();
                c29701Eo.clearAnimation();
            }
        }
        this.LJLLILLLL = i;
        Al();
    }

    public final void vl(String str) {
        C29701Eo c29701Eo = new C29701Eo(getContext());
        c29701Eo.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c29701Eo.setRepeatCount(-1);
        C15490jB.LJIIIIZZ(c29701Eo, CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_outside_demand_1"), str);
        ((ArrayList) this.LJLL).add(c29701Eo);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.c__);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.dialog_icon)");
        this.LJLIL = (LiveIconView) findViewById;
        View findViewById2 = view.findViewById(R.id.m5d);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.tv_dialog_title_tv)");
        this.LJLILLLLZI = (C47121t6) findViewById2;
        View findViewById3 = view.findViewById(R.id.m4s);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.tv_desc_tv)");
        this.LJLJI = (C47121t6) findViewById3;
        View findViewById4 = view.findViewById(R.id.m7n);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.tv_got_button)");
        this.LJLJJI = (C47121t6) findViewById4;
        View findViewById5 = view.findViewById(R.id.e1p);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.guide_view_pager)");
        this.LJLJJL = (ViewPager) findViewById5;
        View findViewById6 = view.findViewById(R.id.e14);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.guide_point_container)");
        this.LJLJJLL = findViewById6;
        View findViewById7 = view.findViewById(R.id.nb8);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.view_point_index_1)");
        this.LJLJL = findViewById7;
        View findViewById8 = view.findViewById(R.id.nb9);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.view_point_index_2)");
        this.LJLJLJ = findViewById8;
        View findViewById9 = view.findViewById(R.id.nb_);
        o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.view_point_index_3)");
        this.LJLJLLL = findViewById9;
        C47121t6 c47121t6 = this.LJLILLLLZI;
        if (c47121t6 != null) {
            c47121t6.setText(getString(R.string.mdj));
            C47121t6 c47121t62 = this.LJLJJI;
            if (c47121t62 != null) {
                c47121t62.setText(getString(R.string.o7i));
                Bundle arguments = getArguments();
                String str = "";
                if (arguments != null && (string = arguments.getString("from_position", "")) != null) {
                    str = string;
                }
                this.LJLLJ = str;
                LiveIconView liveIconView = this.LJLIL;
                if (liveIconView != null) {
                    C16880lQ.LJJII(liveIconView, this);
                    C47121t6 c47121t63 = this.LJLJJI;
                    if (c47121t63 != null) {
                        C16880lQ.LJJIIZ(c47121t63, this);
                        C118024kA c118024kA = new C118024kA();
                        this.LJLLI = c118024kA;
                        ViewPager viewPager = this.LJLJJL;
                        if (viewPager != null) {
                            viewPager.setAdapter(c118024kA);
                            ViewPager viewPager2 = this.LJLJJL;
                            if (viewPager2 != null) {
                                viewPager2.addOnPageChangeListener(this);
                                ((ArrayList) this.LJLL).clear();
                                if (C55902Lwo.LIZ(getContext())) {
                                    View view2 = this.LJLJJLL;
                                    if (view2 != null) {
                                        view2.setVisibility(8);
                                        vl("ttlive_load_follow_guide.zip");
                                    } else {
                                        o.LJIJI("guidePointContainer");
                                        throw null;
                                    }
                                } else {
                                    View view3 = this.LJLJJLL;
                                    if (view3 != null) {
                                        view3.setVisibility(0);
                                        int i = 0;
                                        loop0: while (true) {
                                            vl("live_following_widget_step1_light.zip");
                                            while (true) {
                                                i++;
                                                if (i >= 3) {
                                                    break loop0;
                                                }
                                                if (i != 0) {
                                                    if (i != 1) {
                                                        vl("ttlive_load_follow_guide.zip");
                                                    } else {
                                                        vl("live_following_widget_step2_light.zip");
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        o.LJIJI("guidePointContainer");
                                        throw null;
                                    }
                                }
                                C118024kA c118024kA2 = this.LJLLI;
                                if (c118024kA2 != null) {
                                    List<C29701Eo> datas = this.LJLL;
                                    o.LJIIIZ(datas, "datas");
                                    c118024kA2.LJLILLLLZI = datas;
                                    c118024kA2.notifyDataSetChanged();
                                    this.LJLLILLLL = 0;
                                    Al();
                                    return;
                                }
                                o.LJIJI("adapter");
                                throw null;
                            }
                            o.LJIJI("guideViewPager");
                            throw null;
                        }
                        o.LJIJI("guideViewPager");
                        throw null;
                    }
                    o.LJIJI("tvGotButton");
                    throw null;
                }
                o.LJIJI("iconClose");
                throw null;
            }
            o.LJIJI("tvGotButton");
            throw null;
        }
        o.LJIJI("tvTitle");
        throw null;
    }
}
