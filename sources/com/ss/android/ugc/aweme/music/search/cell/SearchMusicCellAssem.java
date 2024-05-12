package com.ss.android.ugc.aweme.music.search.cell;

import X.AbstractC019505v;
import X.C04270Et;
import X.C16880lQ;
import X.C2068389v;
import X.C214348b8;
import X.C240719cZ;
import X.C240729ca;
import X.C240739cb;
import X.C240749cc;
import X.C240799ch;
import X.C240889cq;
import X.C240899cr;
import X.C240929cu;
import X.C240959cx;
import X.C240969cy;
import X.C240999d1;
import X.C241769eG;
import X.C26045AKb;
import X.C32151Nz;
import X.C44384HbQ;
import X.C51029K0z;
import X.C61845OOz;
import X.C62846OlW;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78765Uvh;
import X.C7MY;
import X.C7Y9;
import X.C7YF;
import X.C8FC;
import X.C8XO;
import X.C8YN;
import X.C99W;
import X.C9BE;
import X.EnumC240399c3;
import X.EnumC240989d0;
import X.EnumC241749eE;
import X.FMX;
import X.HG3;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.KL2;
import X.O6R;
import X.OUP;
import X.RBX;
import X.T5P;
import X.T5Q;
import X.TBT;
import X.Z8A;
import Y.ACListenerS24S0100000_4;
import Y.ACListenerS39S0200000_4;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel;
import com.ss.android.ugc.aweme.music.search.cell.SearchMusicCellAssem;
import com.ss.android.ugc.aweme.music.vm.MusicCellViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class SearchMusicCellAssem extends ReusedUISlotAssem<SearchMusicCellAssem> implements C8XO<C240719cZ> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIFFJFJJ;
    public final InterfaceC115514g7 LLFF;
    public final InterfaceC115514g7 LLFFF;
    public final InterfaceC115514g7 LLFII;
    public EnumC241749eE LLFZ;
    public final Map<Integer, View> LLI = new LinkedHashMap();

    static {
        TBT tbt = new TBT(SearchMusicCellAssem.class, "cellViewModel", "getCellViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicCellViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIFFJFJJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(SearchMusicCellAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/search/SearchMusicListViewModel;", 0, c65351Pkp), C61845OOz.LIZJ(SearchMusicCellAssem.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0, c65351Pkp)};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        C8YN.LJIIJ(this, p4(), new TBT() { // from class: X.9cn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240839cl) obj).LJLIL;
            }
        }, new TBT() { // from class: X.9co
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240839cl) obj).LJLILLLLZI;
            }
        }, null, C240799ch.LJLIL, 12);
        C8YN.LJII(this, n4(), new TBT() { // from class: X.9ct
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C240949cw) obj).LJLIL);
            }
        }, null, C240889cq.LJLIL, 6);
        C8YN.LJII(this, n4(), new TBT() { // from class: X.9cv
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240949cw) obj).LJLILLLLZI;
            }
        }, null, C240899cr.LJLIL, 6);
        C8YN.LJII(this, n4(), new TBT() { // from class: X.9cd
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240949cw) obj).LJLJI;
            }
        }, null, C240749cc.LJLIL, 6);
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c5n;
    }

    public final View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this.LLI;
        Integer valueOf = Integer.valueOf(R.id.dfq);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = getContainerView().findViewById(R.id.dfq);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchMusicCellAssem() {
        C240999d1 c240999d1 = C240999d1.LIZ;
        C240959cx c240959cx = C240959cx.LJLIL;
        C240969cy c240969cy = C240969cy.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicCellViewModel.class);
        this.LLFF = C214348b8.LIZ(this, LIZ, c240999d1, new AqS154S0100000_4(LIZ, 473), null, C240929cu.INSTANCE, c240959cx, c240969cy);
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 471);
        C65776Prg LIZ2 = C65352Pkq.LIZ(SearchMusicListViewModel.class);
        this.LLFFF = C214348b8.LIZ(this, LIZ2, c9be, new AqS154S0100000_4(LIZ2, 474), aqS154S0100000_4, C240729ca.INSTANCE, null, null);
        AqS154S0100000_4 aqS154S0100000_42 = new AqS154S0100000_4(this, 472);
        C65776Prg LIZ3 = C65352Pkq.LIZ(MusicPlayViewModel.class);
        this.LLFII = C214348b8.LIZ(this, LIZ3, c9be, new AqS154S0100000_4(LIZ3, 475), aqS154S0100000_42, C240739cb.INSTANCE, null, null);
    }

    public final MusicCellViewModel n4() {
        return (MusicCellViewModel) this.LLFF.LIZ(this, LLIFFJFJJ[0]);
    }

    public final MusicPlayViewModel p4() {
        return (MusicPlayViewModel) this.LLFII.LIZ(this, LLIFFJFJJ[2]);
    }

    @Override // X.C8XO
    public final void F0(C240719cZ c240719cZ) {
        String str;
        int i;
        int i2;
        int i3;
        MusicReleaseInfo musicReleaseInfo;
        C240719cZ item = c240719cZ;
        o.LJIIIZ(item, "item");
        MusicCellViewModel n4 = n4();
        String musicId = item.LJLIL.getMusicId();
        o.LJIIIIZZ(musicId, "item.musicModel.musicId");
        n4.getClass();
        n4.LJLIL = musicId;
        getContainerView().setBackground(C04270Et.LIZIZ(getContainerView().getContext(), R.drawable.a1s));
        MusicModel musicModel = item.LJLIL;
        if (!TextUtils.isEmpty(musicModel.getName())) {
            str = musicModel.getName();
        } else {
            str = "";
        }
        View containerView = getContainerView();
        ((TextView) containerView.findViewById(R.id.mby)).setText(str);
        int i4 = 0;
        ((AppCompatTextView) containerView.findViewById(R.id.mby)).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        C16880lQ.LJJJLIIL((T5P) containerView.findViewById(R.id.f75), new ACListenerS24S0100000_4(this, 219));
        ((TextView) containerView.findViewById(R.id.mpy)).setText(containerView.getContext().getString(R.string.jdo, Integer.valueOf(musicModel.getUserCount())));
        boolean z = C99W.LIZ;
        String str2 = null;
        if (z) {
            OUP.LJJJJLI(containerView.findViewById(R.id.gqt), Float.valueOf(C32151Nz.LJIIZILJ(4)), null, null, 30);
        }
        if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
            C78765Uvh.LJIIIZ((C62846OlW) containerView.findViewById(R.id.gqt), musicModel.getPicPremium(), -1, -1);
        } else if (!TextUtils.isEmpty(musicModel.getPicBig())) {
            C78765Uvh.LJIIIZ((C62846OlW) containerView.findViewById(R.id.gqt), musicModel.getPicBig(), -1, -1);
        } else {
            C78765Uvh.LIZ((C62846OlW) containerView.findViewById(R.id.gqt), R.drawable.bxu);
        }
        C16880lQ.LJJJ((TuxIconView) containerView.findViewById(R.id.f7d), new ACListenerS24S0100000_4(this, 220));
        C16880lQ.LJJJ((TuxIconView) containerView.findViewById(R.id.f7_), new ACListenerS39S0200000_4(this, musicModel, 58));
        C16880lQ.LJJJ((TuxIconView) containerView.findViewById(R.id.dfq), new ACListenerS39S0200000_4(this, musicModel, 59));
        EnumC240399c3 enumC240399c3 = item.LJLILLLLZI.LJLIL;
        MusicModel musicModel2 = item.LJLIL;
        View containerView2 = getContainerView();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MusicService.LJJLIIIJJI().LJJIJLIJ(musicModel2.getPresenterDuration()));
        if (C7Y9.LIZ() && enumC240399c3 == EnumC240399c3.PINNED) {
            Context context = containerView2.getContext();
            o.LJIIIIZZ(context, "context");
            C7YF c7yf = new C7YF(context, null, 0);
            if (z) {
                OUP.LJJJJLI(c7yf, Float.valueOf(C32151Nz.LJIIZILJ(4)), null, null, 30);
            }
            c7yf.setFont(72);
            c7yf.setText(R.string.jiv);
            C8FC c8fc = new C8FC(c7yf);
            SpannableString spannableString = new SpannableString(" ");
            spannableString.setSpan(c8fc, spannableString.length() - 1, spannableString.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        if (C7Y9.LIZ() && (musicReleaseInfo = musicModel2.getMusicReleaseInfo()) != null && musicReleaseInfo.isNewReleaseSong()) {
            Context context2 = containerView2.getContext();
            o.LJIIIIZZ(context2, "context");
            C7YF c7yf2 = new C7YF(context2, null, 0);
            if (z) {
                OUP.LJJJJLI(c7yf2, Float.valueOf(C32151Nz.LJIIZILJ(4)), null, null, 30);
            }
            c7yf2.setFont(72);
            C8FC c8fc2 = new C8FC(c7yf2);
            SpannableString spannableString2 = new SpannableString(" ");
            spannableString2.setSpan(c8fc2, spannableString2.length() - 1, spannableString2.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString2);
        }
        ((TextView) containerView2.findViewById(R.id.m5v)).setText(spannableStringBuilder);
        View findViewById = containerView2.findViewById(R.id.m5v);
        if (musicModel2.getPresenterDuration() > 0) {
            i = 0;
        } else {
            i = 4;
        }
        findViewById.setVisibility(i);
        EnumC240399c3 enumC240399c32 = item.LJLILLLLZI.LJLIL;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        EnumC240399c3 enumC240399c33 = EnumC240399c3.PINNED;
        if (enumC240399c32 == enumC240399c33) {
            i2 = R.raw.icon_pin_fill;
        } else {
            i2 = R.raw.icon_pin;
        }
        c2068389v.LIZ = i2;
        if (enumC240399c32 == enumC240399c33 || enumC240399c32 == EnumC240399c3.ENABLE_PINNED) {
            i3 = R.attr.go;
        } else {
            i3 = R.attr.gp;
        }
        c2068389v.LJ = Integer.valueOf(i3);
        ((TuxIconView) getContainerView().findViewById(R.id.f7d)).setTuxIcon(c2068389v);
        View findViewById2 = getContainerView().findViewById(R.id.mdz);
        if (enumC240399c32 != enumC240399c33 || C7Y9.LIZ()) {
            i4 = 8;
        }
        findViewById2.setVisibility(i4);
        if (z) {
            OUP.LJJJJLI(getContainerView().findViewById(R.id.mdz), Float.valueOf(C32151Nz.LJIIZILJ(4)), null, null, 30);
        }
        r4(C44384HbQ.LLILLJJLI(item.LJLIL.getPinnedVideoStatus()));
        String musicId2 = item.LJLIL.getMusicId();
        MusicModel musicModel3 = p4().LJLJJI;
        if (musicModel3 != null) {
            str2 = musicModel3.getMusicId();
        }
        if (!o.LJ(musicId2, str2)) {
            m4(EnumC241749eE.DEFAULT);
            return;
        }
        EnumC241749eE enumC241749eE = p4().LJLJJL;
        if (enumC241749eE == null) {
            return;
        }
        m4(enumC241749eE);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C240719cZ c240719cZ) {
        return true;
    }

    public final void m4(EnumC241749eE enumC241749eE) {
        if (this.LLFZ == enumC241749eE) {
            return;
        }
        this.LLFZ = enumC241749eE;
        if (C99W.LIZ) {
            OUP.LJJJJLI(getContainerView().findViewById(R.id.gr_), Float.valueOf(C32151Nz.LJIIZILJ(8)), null, null, 30);
        }
        View containerView = getContainerView();
        int i = C241769eG.LIZ[enumC241749eE.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                containerView.findViewById(R.id.gr_).setVisibility(8);
                ((ImageView) containerView.findViewById(R.id.gqu)).setVisibility(0);
                ((TuxIconView) containerView.findViewById(R.id.gqu)).setIconRes(R.raw.icon_color_play);
                containerView.findViewById(R.id.gqu).clearAnimation();
                return;
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(getContainerView().getContext(), R.anim.fc);
            loadAnimation.setInterpolator(new LinearInterpolator());
            ((TuxIconView) getContainerView().findViewById(R.id.gqu)).setIconRes(R.raw.icon_spinner_normal);
            getContainerView().findViewById(R.id.gqu).startAnimation(loadAnimation);
            return;
        }
        ((ImageView) containerView.findViewById(R.id.gqu)).setVisibility(0);
        ((TuxIconView) containerView.findViewById(R.id.gqu)).setIconRes(R.raw.icon_pause_fill1);
        containerView.findViewById(R.id.gqu).clearAnimation();
        MobClick obtain = MobClick.obtain();
        obtain.setEventName("music_play");
        obtain.setLabelName("personal_homepage_list");
        obtain.setValue(((C240719cZ) C51029K0z.LJIILLIIL(this)).LJLIL.getMusicId());
        FMX.onEvent(obtain);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C16880lQ.LJIJ((RelativeLayout) view.findViewById(R.id.gr_), new ACListenerS39S0200000_4(view, this, 21));
        C16880lQ.LJIIZILJ((LinearLayout) view.findViewById(R.id.g6q), new ACListenerS24S0100000_4(this, 86));
        C16880lQ.LJJJ((TuxIconView) view.findViewById(R.id.gru), new ACListenerS24S0100000_4(this, 87));
        ((T5P) view.findViewById(R.id.f75)).setOnStateChangeListener(new T5Q() { // from class: X.9cs
            @Override // X.T5Q
            public final void LIZ() {
            }

            @Override // X.T5Q
            public final void LIZIZ(int i) {
                if (i == 1) {
                    SearchMusicCellAssem.this.n4().setState(C240979cz.LJLIL);
                }
            }
        });
        ((ImageView) view.findViewById(R.id.f75)).setVisibility(8);
        ((ImageView) view.findViewById(R.id.f7d)).setVisibility(0);
        if (Z8A.LIZIZ.enableShowFeatureVideoEntrance()) {
            ((ImageView) view.findViewById(R.id.f7_)).setVisibility(0);
        } else {
            ((ImageView) view.findViewById(R.id.f7_)).setVisibility(8);
        }
        int LIZIZ = C7MY.LIZIZ(10);
        int i = -LIZIZ;
        KL2.LJII((TuxIconView) view.findViewById(R.id.f7d), i, i, LIZIZ, LIZIZ);
        KL2.LJII((TuxIconView) view.findViewById(R.id.f7_), i, i, LIZIZ, LIZIZ);
        ((AbstractC019505v) view.findViewById(R.id.ah4)).setReferencedIds(new int[]{R.id.f75, R.id.f7d, R.id.df6, R.id.f7_, R.id.dfq});
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.gru);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_lines_horizontal_decrease_alt;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        tuxIconView.setTuxIcon(c2068389v);
    }

    public final void q4(boolean z) {
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser != null && curUser.isAccuratePrivateAccount()) {
            C26045AKb c26045AKb = new C26045AKb(getContainerView());
            c26045AKb.LJIIIIZZ(R.string.gcx);
            c26045AKb.LJIIJ();
        } else {
            if (z) {
                p4().lv0((C240719cZ) C51029K0z.LJIILLIIL(this), C51029K0z.LJIIZILJ(this), true);
                return;
            }
            MusicPlayViewModel p4 = p4();
            MusicModel musicModel = ((C240719cZ) C51029K0z.LJIILLIIL(this)).LJLIL;
            p4.getClass();
            MusicPlayViewModel.kv0(musicModel);
        }
    }

    public final void r4(EnumC240989d0 enumC240989d0) {
        if (!Z8A.LIZIZ.enableShowFeatureVideoEntrance()) {
            return;
        }
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = C7MY.LIZIZ(20);
        c2068389v.LIZJ = C7MY.LIZIZ(20);
        c2068389v.LIZ = R.raw.icon_featured_video;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        ((TuxIconView) getContainerView().findViewById(R.id.f7_)).setTuxIcon(c2068389v);
        if (enumC240989d0 == EnumC240989d0.NOT_ALLOWED_SHOWN) {
            ((ImageView) getContainerView().findViewById(R.id.f7_)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.dfq)).setVisibility(8);
        } else {
            if (enumC240989d0 == EnumC240989d0.HAS_PINNED) {
                ((ImageView) _$_findCachedViewById(R.id.dfq)).setVisibility(8);
            } else {
                ((ImageView) _$_findCachedViewById(R.id.dfq)).setVisibility(0);
            }
            ((ImageView) getContainerView().findViewById(R.id.f7_)).setVisibility(0);
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C240719cZ c240719cZ) {
    }
}
