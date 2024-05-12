package com.ss.android.ugc.aweme.music.assem;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C2068389v;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C240719cZ;
import X.C240769ce;
import X.C240779cf;
import X.C241719eB;
import X.C26338AVi;
import X.C32151Nz;
import X.C47704Ins;
import X.C55749LuL;
import X.C5H3;
import X.C62846OlW;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78765Uvh;
import X.C78926UyI;
import X.C78983UzD;
import X.C8YN;
import X.C99W;
import X.C9BE;
import X.EnumC241749eE;
import X.InterfaceC242159et;
import X.OUP;
import X.SY4;
import X.TBT;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.IDqS429S0100000_4;
import kotlin.jvm.internal.o;
import q03.IDaS484S0100000_4;

/* loaded from: classes5.dex */
public final class MusicMiniBarAssem extends UIContentAssem implements InterfaceC242159et {
    public C62846OlW LJLIL;
    public TuxIconView LJLILLLLZI;
    public TuxTextView LJLJI;
    public TuxTextView LJLJJI;
    public SY4 LJLJJL;
    public EnumC241749eE LJLJJLL;
    public C240719cZ LJLJL;
    public final C214298b3 LJLJLLL;
    public final C214298b3 LJLL;
    public final C5H3 LJLLI;
    public Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final C55749LuL LJLJLJ = new C55749LuL(C47704Ins.LIZJ(this, OriginMusicArg.class, null), checkSupervisorPrepared());

    public void _$_clearFindViewByIdCache() {
        this.LJLLILLLL.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLILLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC242159et, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public MusicMiniBarAssem() {
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 407);
        C65776Prg LIZ = C65352Pkq.LIZ(MusicPlayViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 409), C240779cf.INSTANCE, aqS154S0100000_4);
        AqS154S0100000_4 aqS154S0100000_42 = new AqS154S0100000_4(this, 406);
        C65776Prg LIZ2 = C65352Pkq.LIZ(OriginMusicListViewModel.class);
        this.LJLL = C78926UyI.LJ(this, LIZ2, c9be, new AqS154S0100000_4(LIZ2, 410), C240769ce.INSTANCE, aqS154S0100000_42);
        this.LJLLI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 408));
    }

    private final int F3() {
        return ((Number) this.LJLLI.getValue()).intValue();
    }

    public final OriginMusicArg A3() {
        return (OriginMusicArg) this.LJLJLJ.getValue();
    }

    public final OriginMusicListViewModel C3() {
        return (OriginMusicListViewModel) this.LJLL.getValue();
    }

    public final MusicPlayViewModel E3() {
        return (MusicPlayViewModel) this.LJLJLLL.getValue();
    }

    @Override // X.InterfaceC242159et
    public void Re() {
        View findViewById;
        C78983UzD.LJJIL(getContainerView());
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (findViewById = LIZ.findViewById(R.id.gu0)) != null) {
            findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), A3().getBottomBarHeight());
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLIL = (C62846OlW) view.findViewById(R.id.gtt);
        this.LJLILLLLZI = (TuxIconView) view.findViewById(R.id.gtu);
        this.LJLJI = (TuxTextView) view.findViewById(R.id.gtv);
        this.LJLJJI = (TuxTextView) view.findViewById(R.id.gtx);
        SY4 sy4 = (SY4) view.findViewById(R.id.gty);
        if (sy4 != null) {
            C16880lQ.LJIIJ(new IDaS484S0100000_4(this, 1), sy4);
        } else {
            sy4 = null;
        }
        this.LJLJJL = sy4;
        C62846OlW c62846OlW = this.LJLIL;
        if (c62846OlW != null) {
            C16880lQ.LJIIJ(new IDaS484S0100000_4(this, 2), c62846OlW);
        }
        View containerView = getContainerView();
        Re();
        C26338AVi.LJI(containerView, null, null, null, Integer.valueOf(A3().getBottomBarHeight()), false, 23);
        C16880lQ.LJIIJ(new IDaS484S0100000_4(this, 3), containerView);
        C8YN.LJIIJ(this, E3(), new TBT() { // from class: X.9ci
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240839cl) obj).LJLIL;
            }
        }, new TBT() { // from class: X.9cj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240839cl) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new IDqS429S0100000_4(this, 5), 8);
        C8YN.LJII(this, C3(), new TBT() { // from class: X.9bt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C239829b8 c239829b8 = (C239829b8) obj;
                c239829b8.getClass();
                return C208708Ha.LIZ(c239829b8);
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 110), 4);
    }

    public final void v3(C240719cZ c240719cZ) {
        String str;
        if (o.LJ(this.LJLJL, c240719cZ)) {
            return;
        }
        this.LJLJL = c240719cZ;
        MusicModel musicModel = c240719cZ.LJLIL;
        C62846OlW c62846OlW = this.LJLIL;
        if (c62846OlW != null) {
            if (C99W.LIZ) {
                OUP.LJJJJLI(c62846OlW, Float.valueOf(C32151Nz.LJIIZILJ(4)), null, null, 30);
            }
            if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
                C78765Uvh.LJIIIZ(c62846OlW, musicModel.getPicPremium(), -1, -1);
            } else if (!TextUtils.isEmpty(musicModel.getPicBig())) {
                C78765Uvh.LJIIIZ(c62846OlW, musicModel.getPicBig(), -1, -1);
            } else {
                C78765Uvh.LIZ(c62846OlW, R.drawable.bxu);
            }
        }
        TuxTextView tuxTextView = this.LJLJI;
        if (tuxTextView != null) {
            if (!TextUtils.isEmpty(musicModel.getName())) {
                str = musicModel.getName();
            } else {
                str = "";
            }
            tuxTextView.setText(str);
            tuxTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        TuxTextView tuxTextView2 = this.LJLJJI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(MusicService.LJJLIIIJJI().LJJIJLIJ(musicModel.getPresenterDuration()));
        }
    }

    public final void x3(EnumC241749eE enumC241749eE) {
        if (this.LJLJJLL == enumC241749eE) {
            return;
        }
        this.LJLJJLL = enumC241749eE;
        TuxIconView tuxIconView = this.LJLILLLLZI;
        if (tuxIconView != null) {
            int i = C241719eB.LIZ[enumC241749eE.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    tuxIconView.setVisibility(0);
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_color_play;
                    c2068389v.LJ = Integer.valueOf(R.attr.dj);
                    tuxIconView.setTuxIcon(c2068389v);
                    tuxIconView.clearAnimation();
                    return;
                }
                Animation loadAnimation = AnimationUtils.loadAnimation(getContainerView().getContext(), R.anim.fc);
                loadAnimation.setInterpolator(new LinearInterpolator());
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = R.raw.icon_spinner_normal;
                c2068389v2.LJ = Integer.valueOf(R.attr.dj);
                tuxIconView.setTuxIcon(c2068389v2);
                tuxIconView.startAnimation(loadAnimation);
                return;
            }
            tuxIconView.setVisibility(0);
            C2068389v c2068389v3 = new C2068389v();
            c2068389v3.LIZ = R.raw.icon_pause_fill1;
            c2068389v3.LJ = Integer.valueOf(R.attr.dj);
            tuxIconView.setTuxIcon(c2068389v3);
            tuxIconView.clearAnimation();
        }
    }

    @Override // X.InterfaceC242159et
    public void N0(int i, float f, int i2) {
        float f2;
        float f3;
        if (i == 0) {
            View containerView = getContainerView();
            Context context = getContext();
            if (context != null && C26338AVi.LIZJ(context)) {
                f3 = F3() * f;
            } else {
                f3 = -(F3() * f);
            }
            containerView.setTranslationX(f3);
            return;
        }
        View containerView2 = getContainerView();
        Context context2 = getContext();
        if (context2 != null && C26338AVi.LIZJ(context2)) {
            f2 = F3();
        } else {
            f2 = -F3();
        }
        containerView2.setTranslationX(f2);
    }
}
