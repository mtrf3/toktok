package X;

import Y.ACListenerS27S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.CommerceToolsTcmServiceImpl;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.SaveLocalHelper;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G7M extends AbstractC143775kb implements G7O {
    public final VideoPublishViewModel LJLIL;
    public View LJLILLLLZI;
    public RecyclerView LJLJI;
    public GAW LJLJJI;
    public G75 LJLJJL;
    public G75 LJLJJLL;
    public VideoTrendingTopic LJLJL;
    public C40871j1<Boolean> LJLJLJ;
    public List<? extends G63> LJLJLLL;
    public C235119Kp LJLL;
    public final C62822Ol8 LJLLI;

    public final void LLJILJIL() {
        GAW gaw = this.LJLJJI;
        if (gaw != null) {
            gaw.notifyDataSetChanged();
        }
    }

    @Override // X.WM7
    public final void onResume() {
        CommerceToolsTcmModel commerceToolsTcmModel;
        super.onResume();
        Bundle bundle = this.mArguments;
        if (bundle != null && bundle.getBoolean("key_enable_sponsor")) {
            Bundle bundle2 = this.mArguments;
            if (bundle2 == null || (commerceToolsTcmModel = (CommerceToolsTcmModel) bundle2.getParcelable("key_tcm_model")) == null) {
                commerceToolsTcmModel = new CommerceToolsTcmModel(false, null, null, null, null, null, null, null, false, false, false, null, 0, false, 16383, null);
            }
            InterfaceC41034G8o LIZIZ = C59367NRr.LIZIZ(InterfaceC41201GEz.class);
            if (LIZIZ != null) {
                if (((InterfaceC41201GEz) LIZIZ).vz(commerceToolsTcmModel.getBrandedContentSwitch())) {
                    G75 g75 = this.LJLJJL;
                    if (g75 != null) {
                        g75.setLabelText("");
                    }
                    GAW gaw = this.LJLJJI;
                    if (gaw != null) {
                        gaw.LJLLLLLL();
                        return;
                    }
                    return;
                }
                G75 g752 = this.LJLJJL;
                if (g752 != null) {
                    g752.setLabelText("");
                }
                GAW gaw2 = this.LJLJJI;
                if (gaw2 == null) {
                    return;
                }
                gaw2.LJLLLLLL();
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        C145995oB c145995oB = new C145995oB();
        Bundle bundle = this.mArguments;
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("key_multi_photo_mode", false);
        }
        c145995oB.LIZ(SaveLocalHelper.LIZ(z) ? 1 : 0, "auto_save_status");
        FMX.LJIIL("close_more_option_page", c145995oB.LIZ);
    }

    public G7M(VideoPublishViewModel publishViewModel) {
        o.LJIIIZ(publishViewModel, "publishViewModel");
        this.LJLIL = publishViewModel;
        this.LJLJLLL = C61878OQg.INSTANCE;
        this.LJLLI = C221108m2.LIZIZ(C40989G6v.LJLIL);
        disableSceneRestore();
    }

    public final void LLJILJILJ(NavigationScene navigationScene) {
        C42663Gol c42663Gol = new C42663Gol();
        c42663Gol.LIZJ = new WN4(R.anim.x, R.anim.n, navigationScene.requireActivity());
        navigationScene.LLJJJJ(this, c42663Gol.LIZ());
        C145995oB c145995oB = new C145995oB();
        Bundle bundle = this.mArguments;
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("key_multi_photo_mode", false);
        }
        c145995oB.LIZ(SaveLocalHelper.LIZ(z) ? 1 : 0, "auto_save_status");
        FMX.LJIIL("enter_more_option_page", c145995oB.LIZ);
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        CommerceToolsTcmModel commerceToolsTcmModel;
        Integer num;
        String str;
        String str2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        String str3 = null;
        if (bundle2 != null) {
            obj = C16880lQ.LLJJIII(bundle2, "key_trending_topic");
        } else {
            obj = null;
        }
        this.LJLJL = (VideoTrendingTopic) obj;
        this.LJLJI = (RecyclerView) view.findViewById(R.id.a3t);
        this.LJLJLJ = this.LJLIL.LJLJL;
        if (((Boolean) this.LJLLI.getValue()).booleanValue()) {
            C235119Kp c235119Kp = new C235119Kp();
            this.LJLL = c235119Kp;
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark;
            LIZJ.LIZLLL = true;
            LIZJ.LIZIZ(new AqS157S0100000_7(this, 606));
            c235119Kp.LIZIZ(LIZJ);
            C9KF c9kf = new C9KF();
            String string = getString(R.string.qv);
            o.LJIIIIZZ(string, "getString(R.string.Publish_setting)");
            c9kf.LIZJ = string;
            c235119Kp.LIZJ = c9kf;
            C252709vu c252709vu = (C252709vu) this.mView.findViewById(R.id.gwg);
            if (c252709vu != null) {
                C235119Kp c235119Kp2 = this.LJLL;
                if (c235119Kp2 != null) {
                    c252709vu.setNavActions(c235119Kp2);
                    c252709vu.LJIILJJIL(true);
                } else {
                    o.LJIJI("navActions");
                    throw null;
                }
            }
        } else {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "rootView.context");
            view.setPadding(0, C63081OpJ.LJJJJLI(context), 0, 0);
            View findViewById = view.findViewById(R.id.f0j);
            this.LJLILLLLZI = findViewById;
            if (findViewById != null) {
                C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 131), findViewById);
            }
        }
        if (!G6X.LIZIZ()) {
            G75 g75 = (G75) view.findViewById(R.id.ass);
            this.LJLJJL = g75;
            if (g75 != null) {
                g75.setVisibility(8);
            }
            G75 g752 = this.LJLJJL;
            if (g752 != null) {
                g752.setSubtitleVisibility(8);
            }
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                z = bundle3.getBoolean("key_enable_sponsor");
            } else {
                z = false;
            }
            Bundle bundle4 = this.mArguments;
            if (bundle4 != null) {
                z2 = bundle4.getBoolean("key_general_music");
            } else {
                z2 = false;
            }
            Bundle bundle5 = this.mArguments;
            if (bundle5 != null) {
                z3 = bundle5.getBoolean("key_commerce_music");
            } else {
                z3 = false;
            }
            Bundle bundle6 = this.mArguments;
            if (bundle6 != null) {
                i = bundle6.getInt("key_aweme_type");
            } else {
                i = -1;
            }
            Bundle bundle7 = this.mArguments;
            if (bundle7 == null || (commerceToolsTcmModel = (CommerceToolsTcmModel) bundle7.getParcelable("key_tcm_model")) == null) {
                commerceToolsTcmModel = new CommerceToolsTcmModel(false, null, null, null, null, null, null, null, false, false, false, null, 0, false, 16383, null);
            }
            if (z) {
                G75 g753 = this.LJLJJL;
                if (g753 != null) {
                    g753.setVisibility(0);
                }
                G75 g754 = this.LJLJJL;
                if (g754 != null) {
                    g754.setLeftTuxIcon(R.raw.icon_film_star);
                }
                if (!CommerceToolsTcmServiceImpl.LJIJJ().LJIIJ()) {
                    G75 g755 = this.LJLJJL;
                    if (g755 != null) {
                        g755.setTitle(R.string.c43);
                    }
                    G75 g756 = this.LJLJJL;
                    if (g756 != null) {
                        g756.setSubtitle(requireSceneContext().getString(R.string.i7r));
                    }
                    G75 g757 = this.LJLJJL;
                    if (g757 != null) {
                        g757.setSubtitleVisibility(0);
                    }
                } else {
                    G75 g758 = this.LJLJJL;
                    if (g758 != null) {
                        g758.setTitle(R.string.s4r);
                    }
                }
                FMX.onEventV3("tcm_bctoggle_show");
                G75 g759 = this.LJLJJL;
                if (g759 != null) {
                    g759.setOnClickListener(new ViewOnClickListenerC13880ga(new G62(this, z2, commerceToolsTcmModel, z3, i)));
                }
            }
        }
        if (!((Boolean) this.LJLLI.getValue()).booleanValue() && !G6X.LIZ() && !C40981G6n.LIZ() && VideoTrendingTopicServiceImpl.LIZLLL().LIZJ()) {
            Bundle bundle8 = this.mArguments;
            if (bundle8 != null) {
                num = Integer.valueOf(bundle8.getInt("key_trending_topic_status", GBY.UNKOWN.getValue()));
            } else {
                num = null;
            }
            int value = GBY.ENABLED.getValue();
            if (num != null && num.intValue() == value) {
                G75 g7510 = (G75) view.findViewById(R.id.n9d);
                this.LJLJJLL = g7510;
                if (g7510 != null) {
                    g7510.setVisibility(0);
                }
                G75 g7511 = this.LJLJJLL;
                if (g7511 != null) {
                    g7511.setLeftTuxIcon(R.raw.icon_fire_3);
                }
                G75 g7512 = this.LJLJJLL;
                if (g7512 != null) {
                    g7512.setTitle(getString(R.string.sk3));
                }
                G75 g7513 = this.LJLJJLL;
                if (g7513 != null) {
                    g7513.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS27S0100000_7(this, 130)));
                }
                C44423Hc3 currentUser = C44172HVg.LJIJ.getCurrentUser();
                if (currentUser == null || (str = currentUser.getUid()) == null) {
                    str = "";
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "video_post_page");
                Bundle bundle9 = this.mArguments;
                if (bundle9 != null) {
                    str2 = C42090GfW.LIZJ(bundle9);
                } else {
                    str2 = null;
                }
                c188727au.LJIIIZ("creation_id", str2);
                c188727au.LJIIIZ("creator_id", str);
                Bundle bundle10 = this.mArguments;
                if (bundle10 != null) {
                    str3 = C42090GfW.LJI(bundle10, null);
                }
                c188727au.LJIIIZ("shoot_way", str3);
                c188727au.LJIIIZ("show_position", "more_options");
                FMX.LJIIL("trends_post_link_show", c188727au.LIZ);
            }
        }
        List<G63> list = this.LJLIL.LJLJJLL;
        this.LJLJLLL = list;
        if (list.isEmpty()) {
            RecyclerView recyclerView = this.LJLJI;
            if (recyclerView == null) {
                return;
            }
            recyclerView.setVisibility(8);
            return;
        }
        RecyclerView recyclerView2 = this.LJLJI;
        if (recyclerView2 != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView2.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            recyclerView2.setLayoutParams(layoutParams);
        }
        RecyclerView recyclerView3 = this.LJLJI;
        if (recyclerView3 != null) {
            requireSceneContext();
            recyclerView3.setLayoutManager(new LinearLayoutManager());
        }
        GAW gaw = new GAW(this.LJLJLLL);
        this.LJLJJI = gaw;
        RecyclerView recyclerView4 = this.LJLJI;
        if (recyclerView4 == null) {
            return;
        }
        recyclerView4.setAdapter(gaw);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        int i;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (((Boolean) this.LJLLI.getValue()).booleanValue()) {
            i = R.layout.bkx;
        } else {
            i = R.layout.bln;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, i, container, false);
        C16880lQ.LJIIJ(G7N.LJLIL, LLLLIILL);
        return LLLLIILL;
    }
}
