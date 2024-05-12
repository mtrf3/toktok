package X;

import Y.AfS61S0200000_12;
import Y.AfS64S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TM3 extends UserVisibleHintGroupScene {
    public ViewGroup LJLIL;
    public C74496TLo LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public ShortVideoContext LJLJJL;
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(TOG.LJLIL);
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1060));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1061));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1062));
    public final C73318Sq2 LJLL = new C73318Sq2();

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C74496TLo c74496TLo = this.LJLILLLLZI;
        if (c74496TLo != null) {
            c74496TLo.loadData();
        } else {
            o.LJIJI("giphyListView");
            throw null;
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.LJLJJL = (ShortVideoContext) bundle2.getParcelable("key_short_video_context");
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        Activity activity;
        Drawable LIZ;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.azc, container, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) LLLLIILL;
        this.LJLIL = viewGroup;
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "mRootView.context");
        ViewGroup viewGroup2 = this.LJLIL;
        if (viewGroup2 != null) {
            View findViewById = viewGroup2.findViewById(R.id.ds5);
            o.LJIIIIZZ(findViewById, "mRootView.findViewById(R.id.gif_list_container)");
            ViewGroup viewGroup3 = (ViewGroup) findViewById;
            ViewGroup viewGroup4 = this.LJLIL;
            if (viewGroup4 != null) {
                View findViewById2 = viewGroup4.findViewById(R.id.ds6);
                o.LJIIIIZZ(findViewById2, "mRootView.findViewById(R.id.gif_search_container)");
                ViewGroup viewGroup5 = (ViewGroup) findViewById2;
                TLK tlk = (TLK) this.LJLJLJ.getValue();
                TLD tld = (TLD) this.LJLJLLL.getValue();
                ViewGroup viewGroup6 = this.LJLIL;
                if (viewGroup6 != null) {
                    C74496TLo c74496TLo = new C74496TLo(context, this, tlk, tld, viewGroup6, 2, false, false, null, TLE.LJLIL);
                    c74496TLo.LJIILIIL();
                    this.LJLILLLLZI = c74496TLo;
                    AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(this, 1063);
                    ViewGroup viewGroup7 = this.LJLIL;
                    if (viewGroup7 != null) {
                        Context context2 = viewGroup7.getContext();
                        if (context2 instanceof Activity) {
                            activity = (Activity) context2;
                        } else {
                            activity = null;
                        }
                        TM8 tm8 = new TM8(viewGroup5, aqS162S0100000_12, viewGroup3, activity, getString(R.string.gro), false, C58B.LIZ());
                        tm8.LJ(true);
                        View view = tm8.LJIIIIZZ;
                        if (view != null) {
                            this.LJLJJI = view;
                            C26338AVi.LJ(view, 0, Integer.valueOf((int) KL2.LIZJ(this.mActivity, -3.0f)), 0, 0, false);
                            View view2 = this.LJLJJI;
                            if (view2 != null) {
                                TextView textView = (TextView) view2.findViewById(R.id.mip);
                                Activity activity2 = this.mActivity;
                                if (activity2 != null) {
                                    View view3 = this.LJLJJI;
                                    if (view3 != null) {
                                        ((C170736mz) view3.findViewById(R.id.f_e)).setBackground(C20110qd.LIZ(activity2, R.drawable.b3q));
                                        View view4 = this.LJLJJI;
                                        if (view4 != null) {
                                            view4.findViewById(R.id.avg).setBackground(C20110qd.LIZ(activity2, R.drawable.b3p));
                                            textView.setHintTextColor(C04330Ez.LIZIZ(activity2, R.color.cu));
                                            textView.setTextColor(C04330Ez.LIZIZ(activity2, R.color.ck));
                                            C26338AVi.LJI(textView, Integer.valueOf((int) KL2.LIZJ(activity2, 42.0f)), null, Integer.valueOf((int) KL2.LIZJ(activity2, 30.0f)), null, false, 26);
                                            View view5 = this.LJLJJI;
                                            if (view5 != null) {
                                                View findViewById3 = view5.findViewById(R.id.j5r);
                                                if (C58B.LIZ()) {
                                                    C110614Vt c110614Vt = new C110614Vt();
                                                    c110614Vt.LIZIZ = Integer.valueOf(R.attr.cj);
                                                    c110614Vt.LIZJ = C61328O5c.LIZJ(8);
                                                    LIZ = c110614Vt.LIZ(context);
                                                } else {
                                                    LIZ = C20110qd.LIZ(activity2, R.drawable.av0);
                                                }
                                                findViewById3.setBackground(LIZ);
                                            } else {
                                                o.LJIJI("searchContent");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("searchContent");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("searchContent");
                                        throw null;
                                    }
                                }
                                C74496TLo c74496TLo2 = this.LJLILLLLZI;
                                if (c74496TLo2 != null) {
                                    View LJFF = c74496TLo2.LJFF();
                                    this.LJLJI = LJFF;
                                    if (LJFF != null) {
                                        LJFF.findViewById(R.id.kie).setVerticalFadingEdgeEnabled(false);
                                        View view6 = this.LJLJI;
                                        if (view6 != null) {
                                            viewGroup3.addView(view6);
                                            C73318Sq2 c73318Sq2 = this.LJLL;
                                            C74496TLo c74496TLo3 = this.LJLILLLLZI;
                                            if (c74496TLo3 != null) {
                                                C73893SzJ c73893SzJ = c74496TLo3.LJJJJIZL;
                                                C73426Srm LIZ2 = IA2.LIZ(c73893SzJ, c73893SzJ);
                                                AfS64S0100000_12 afS64S0100000_12 = new AfS64S0100000_12(this, 99);
                                                C73982T1u c73982T1u = C73982T1u.LJLIL;
                                                c73318Sq2.LIZ(LIZ2.LJJJLIIL(afS64S0100000_12, c73982T1u));
                                                C73318Sq2 c73318Sq22 = this.LJLL;
                                                C74496TLo c74496TLo4 = this.LJLILLLLZI;
                                                if (c74496TLo4 != null) {
                                                    c73318Sq22.LIZ(c74496TLo4.LJIJJLI().LJJJLIIL(new AfS61S0200000_12(this, context, 9), c73982T1u));
                                                    C73318Sq2 c73318Sq23 = this.LJLL;
                                                    C74496TLo c74496TLo5 = this.LJLILLLLZI;
                                                    if (c74496TLo5 != null) {
                                                        c73318Sq23.LIZ(c74496TLo5.LJIJJ().LJJJLIIL(new AfS64S0100000_12(context, 100), c73982T1u));
                                                        ViewGroup viewGroup8 = this.LJLIL;
                                                        if (viewGroup8 != null) {
                                                            return viewGroup8;
                                                        }
                                                        o.LJIJI("mRootView");
                                                        throw null;
                                                    }
                                                    o.LJIJI("giphyListView");
                                                    throw null;
                                                }
                                                o.LJIJI("giphyListView");
                                                throw null;
                                            }
                                            o.LJIJI("giphyListView");
                                            throw null;
                                        }
                                        o.LJIJI("gifContent");
                                        throw null;
                                    }
                                    o.LJIJI("gifContent");
                                    throw null;
                                }
                                o.LJIJI("giphyListView");
                                throw null;
                            }
                            o.LJIJI("searchContent");
                            throw null;
                        }
                        o.LJIJI("content");
                        throw null;
                    }
                    o.LJIJI("mRootView");
                    throw null;
                }
                o.LJIJI("mRootView");
                throw null;
            }
            o.LJIJI("mRootView");
            throw null;
        }
        o.LJIJI("mRootView");
        throw null;
    }
}
