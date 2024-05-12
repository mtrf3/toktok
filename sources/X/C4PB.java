package X;

import Y.AObserverS69S0100000_1;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4PB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4PB extends C108824Ow {
    public C1AH LLD;
    public C71799SFv LLF;
    public RecyclerView LLFF;
    public C252709vu LLFFF;
    public final C62822Ol8 LLFII;
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public final long LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public final java.util.Map<Integer, View> LLIIIILZ;

    @Override // X.C108824Ow
    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIIILZ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C108824Ow
    public final void LJI() {
    }

    @Override // X.C108824Ow
    public final void LJIIIIZZ() {
    }

    private final C9KF getEmptyNavBarTitle() {
        return (C9KF) this.LLFII.getValue();
    }

    private final C9KF getNavBarTitle() {
        return (C9KF) this.LLFZ.getValue();
    }

    private final float getVerticalTransition() {
        return ((Number) this.LLI.getValue()).floatValue();
    }

    public final void LJIIJ() {
        C1AH c1ah = this.LLD;
        if (c1ah != null) {
            c1ah.setVisibility(0);
            C252709vu c252709vu = this.LLFFF;
            if (c252709vu != null) {
                c252709vu.LJIILLIIL(getEmptyNavBarTitle());
            }
            C71799SFv c71799SFv = this.LLF;
            if (c71799SFv != null) {
                ObjectAnimator.ofFloat(c71799SFv, "alpha", 0.0f, 1.0f).setDuration(this.LLIFFJFJJ).start();
                RecyclerView recyclerView = this.LLFF;
                if (recyclerView != null) {
                    ObjectAnimator.ofFloat(recyclerView, "translationY", -getVerticalTransition(), 0.0f).setDuration(this.LLIFFJFJJ).start();
                    return;
                } else {
                    o.LJIJI("recyclerView");
                    throw null;
                }
            }
            o.LJIJI("avatar");
            throw null;
        }
        o.LJIJI("aigcAvatarGroup");
        throw null;
    }

    public final void LJIIJJI() {
        if (!this.LLII) {
            if (!this.LLIIII) {
                ViewGroup viewGroup = this.LLFF;
                if (viewGroup != null) {
                    while (viewGroup.getParent() != null && (viewGroup.getParent() instanceof ViewGroup) && viewGroup.getId() != R.id.g1y) {
                        ViewParent parent = viewGroup.getParent();
                        o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                        viewGroup = (ViewGroup) parent;
                        viewGroup.setClipChildren(false);
                        viewGroup.setClipToPadding(false);
                    }
                    this.LLIIII = true;
                } else {
                    o.LJIJI("recyclerView");
                    throw null;
                }
            }
            C71799SFv c71799SFv = this.LLF;
            if (c71799SFv != null) {
                ObjectAnimator.ofFloat(c71799SFv, "alpha", 1.0f, 0.0f).setDuration(this.LLIFFJFJJ).start();
                RecyclerView recyclerView = this.LLFF;
                if (recyclerView != null) {
                    ObjectAnimator.ofFloat(recyclerView, "translationY", getVerticalTransition(), 0.0f).setDuration(this.LLIFFJFJJ).start();
                } else {
                    o.LJIJI("recyclerView");
                    throw null;
                }
            } else {
                o.LJIJI("avatar");
                throw null;
            }
        }
        C1AH c1ah = this.LLD;
        if (c1ah != null) {
            c1ah.setVisibility(8);
            C252709vu c252709vu = this.LLFFF;
            if (c252709vu != null) {
                c252709vu.LJIILLIIL(getNavBarTitle());
                return;
            }
            return;
        }
        o.LJIJI("aigcAvatarGroup");
        throw null;
    }

    @Override // X.C108824Ow
    public final void LIZIZ() {
        super.LIZIZ();
        getViewModel().LJLJLLL.observe(getHostFragment(), new AObserverS69S0100000_1(this, 158));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4PB(C25600zU context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LLIIIILZ = new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(C4PD.LJLIL);
        this.LLFZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1059));
        this.LLI = C221108m2.LIZIZ(C4PE.LJLIL);
        this.LLIFFJFJJ = 180L;
    }

    @Override // X.C108824Ow
    public final void LJII(Context context) {
        o.LJIIIZ(context, "context");
        View.inflate(context, R.layout.b_1, this);
    }

    public static void LJIIL(C71799SFv c71799SFv, Bundle bundle) {
        String remoteUrl = bundle.getString("image_url", "");
        o.LJIIIIZZ(remoteUrl, "remoteUrl");
        if (remoteUrl.length() > 0) {
            C71799SFv.LJIIJ(c71799SFv, remoteUrl, null, false, new C81929WDl("share_panel_ai_avatar", false, null, null, null, 62), 62);
        }
    }

    @Override // X.C108824Ow
    public final void LJIIIZ(SharePackage sharePackage, List channelList, Fragment hostFragment, EnumC62492Ofo style, InterfaceC108744Oo interfaceC108744Oo, C4P8 hostPanelPanelCallback, String str) {
        C252709vu c252709vu;
        o.LJIIIZ(channelList, "channelList");
        o.LJIIIZ(hostFragment, "hostFragment");
        o.LJIIIZ(style, "style");
        o.LJIIIZ(hostPanelPanelCallback, "hostPanelPanelCallback");
        super.LJIIIZ(sharePackage, channelList, hostFragment, style, interfaceC108744Oo, hostPanelPanelCallback, str);
        View view = hostFragment.getView();
        if (view != null && (c252709vu = (C252709vu) view.findViewById(R.id.lbe)) != null) {
            c252709vu.LJIILLIIL(getEmptyNavBarTitle());
        } else {
            c252709vu = null;
        }
        this.LLFFF = c252709vu;
        View findViewById = findViewById(R.id.zd);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.agic_avatar_group)");
        this.LLD = (C1AH) findViewById;
        View findViewById2 = findViewById(R.id.zk);
        final C71799SFv setUp$lambda$1 = (C71799SFv) findViewById2;
        o.LJIIIIZZ(setUp$lambda$1, "setUp$lambda$1");
        final Bundle bundle = sharePackage.extras;
        String aivatarPath = bundle.getString("uncrop_avatar_path", "");
        o.LJIIIIZZ(aivatarPath, "aivatarPath");
        if (aivatarPath.length() > 0) {
            android.net.Uri uri = android.net.Uri.fromFile(new File(aivatarPath));
            W5U.LIZJ().LJI(uri);
            o.LJIIIIZZ(uri, "uri");
            C71799SFv.LJIIJ(setUp$lambda$1, uri, null, false, new AbstractC72439Sbr() { // from class: X.4PC
                @Override // X.InterfaceC70769Rq1
                public final void U0(android.net.Uri uri2, View view2, C2047581v c2047581v, Animatable animatable) {
                }

                @Override // X.InterfaceC70769Rq1
                public final void s2(android.net.Uri uri2, View view2, Throwable th) {
                    o.LJIIIZ(uri2, "uri");
                    C4PB c4pb = C4PB.this;
                    C71799SFv c71799SFv = setUp$lambda$1;
                    Bundle bundle2 = bundle;
                    c4pb.getClass();
                    C4PB.LJIIL(c71799SFv, bundle2);
                }
            }, 62);
        } else {
            LJIIL(setUp$lambda$1, bundle);
        }
        o.LJIIIIZZ(findViewById2, "findViewById<TuxAvatarVi…Package.extras)\n        }");
        this.LLF = (C71799SFv) findViewById2;
        View findViewById3 = findViewById(R.id.j_j);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.rv_share_panel_avatar)");
        this.LLFF = (RecyclerView) findViewById3;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("action_type", "show");
        onEventV3.LIZIZ("ai_avatar_save_finish_page", c1hq);
    }
}
