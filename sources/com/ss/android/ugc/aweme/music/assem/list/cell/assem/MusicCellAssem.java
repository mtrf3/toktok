package com.ss.android.ugc.aweme.music.assem.list.cell.assem;

import X.AbstractC019505v;
import X.C03660Ck;
import X.C04270Et;
import X.C16880lQ;
import X.C2068389v;
import X.C214348b8;
import X.C221108m2;
import X.C240639cR;
import X.C240719cZ;
import X.C240999d1;
import X.C241119dD;
import X.C241129dE;
import X.C241139dF;
import X.C241189dK;
import X.C241199dL;
import X.C241739eD;
import X.C242119ep;
import X.C32151Nz;
import X.C47704Ins;
import X.C51029K0z;
import X.C55749LuL;
import X.C61845OOz;
import X.C62822Ol8;
import X.C62846OlW;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73318Sq2;
import X.C77123UOp;
import X.C78688UuS;
import X.C78765Uvh;
import X.C78939UyV;
import X.C7Y9;
import X.C7YF;
import X.C8FC;
import X.C8HL;
import X.C8XO;
import X.C8YN;
import X.C99W;
import X.C9BE;
import X.EnumC240399c3;
import X.EnumC241749eE;
import X.FMX;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.OUP;
import X.T5P;
import X.T5Q;
import X.TBT;
import X.W5F;
import X.W5U;
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
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.assem.list.cell.assem.MusicCellAssem;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.vm.MusicCellViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class MusicCellAssem extends ReusedUIContentAssem<MusicCellAssem> implements C8XO<C240719cZ> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFII;
    public final C55749LuL LJZL;
    public final InterfaceC115514g7 LL;
    public final InterfaceC115514g7 LLD;
    public final C73318Sq2 LLF;
    public EnumC241749eE LLFF;
    public final C62822Ol8 LLFFF;

    static {
        TBT tbt = new TBT(MusicCellAssem.class, "cellViewModel", "getCellViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicCellViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLFII = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(MusicCellAssem.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0, c65351Pkp)};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        C8YN.LJII(this, a4(), new TBT() { // from class: X.9dG
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C240949cw) obj).LJLIL);
            }
        }, null, C8HL.LJLIL, 6);
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public MusicCellAssem() {
        new LinkedHashMap();
        this.LJZL = new C55749LuL(C47704Ins.LIZJ(this, OriginMusicArg.class, null), checkSupervisorPrepared());
        C240999d1 c240999d1 = C240999d1.LIZ;
        C241129dE c241129dE = C241129dE.LJLIL;
        C241139dF c241139dF = C241139dF.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicCellViewModel.class);
        this.LL = C214348b8.LIZ(this, LIZ, c240999d1, new AqS154S0100000_4(LIZ, 428), null, C241189dK.INSTANCE, c241129dE, c241139dF);
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 427);
        C65776Prg LIZ2 = C65352Pkq.LIZ(MusicPlayViewModel.class);
        this.LLD = C214348b8.LIZ(this, LIZ2, c9be, new AqS154S0100000_4(LIZ2, 429), aqS154S0100000_4, C241199dL.INSTANCE, null, null);
        this.LLF = new C73318Sq2();
        this.LLFFF = C221108m2.LIZIZ(new AqS154S0100000_4(this, 426));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        this.LLF.dispose();
    }

    public final MusicCellViewModel a4() {
        return (MusicCellViewModel) this.LL.LIZ(this, LLFII[0]);
    }

    public final MusicPlayViewModel b4() {
        return (MusicPlayViewModel) this.LLD.LIZ(this, LLFII[1]);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C240719cZ c240719cZ) {
        String str;
        boolean z;
        int i;
        int i2;
        String picBig;
        String nickname;
        Object obj;
        MusicReleaseInfo musicReleaseInfo;
        C240719cZ item = c240719cZ;
        o.LJIIIZ(item, "item");
        MusicCellViewModel a4 = a4();
        String musicId = item.LJLIL.getMusicId();
        o.LJIIIIZZ(musicId, "item.musicModel.musicId");
        a4.getClass();
        a4.LJLIL = musicId;
        getContainerView().setBackground(C04270Et.LIZIZ(getContainerView().getContext(), R.drawable.a1s));
        MusicModel musicModel = item.LJLIL;
        String str2 = "";
        if (TextUtils.isEmpty(musicModel.getName())) {
            str = "";
        } else {
            str = musicModel.getName();
        }
        View containerView = getContainerView();
        ((TextView) containerView.findViewById(R.id.mby)).setText(str);
        ((AppCompatTextView) containerView.findViewById(R.id.mby)).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        C16880lQ.LJJJLIIL((T5P) containerView.findViewById(R.id.f75), new ACListenerS24S0100000_4(this, 242));
        ((TextView) containerView.findViewById(R.id.mpy)).setText(containerView.getContext().getString(R.string.jdo, C77123UOp.LJJIIJ(musicModel.getUserCount())));
        boolean z2 = C99W.LIZ;
        String str3 = null;
        if (z2) {
            OUP.LJJJJLI(containerView.findViewById(R.id.gqt), Float.valueOf(C32151Nz.LJIIZILJ(4)), null, null, 30);
        }
        if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
            C78765Uvh.LJIIIZ((C62846OlW) containerView.findViewById(R.id.gqt), musicModel.getPicPremium(), -1, -1);
        } else if (!TextUtils.isEmpty(musicModel.getPicBig())) {
            C78765Uvh.LJIIIZ((C62846OlW) containerView.findViewById(R.id.gqt), musicModel.getPicBig(), -1, -1);
        } else {
            C78765Uvh.LIZ((C62846OlW) containerView.findViewById(R.id.gqt), R.drawable.bxu);
        }
        C240639cR c240639cR = item.LJLILLLLZI;
        EnumC240399c3 enumC240399c3 = c240639cR.LJLIL;
        MusicModel musicModel2 = item.LJLIL;
        boolean z3 = c240639cR.LJLILLLLZI;
        View containerView2 = getContainerView();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MusicService.LJJLIIIJJI().LJJIJLIJ(musicModel2.getPresenterDuration()));
        if (C7Y9.LIZ() && enumC240399c3 == EnumC240399c3.PINNED && !z3) {
            Context context = containerView2.getContext();
            o.LJIIIIZZ(context, "context");
            C7YF c7yf = new C7YF(context, null, 0);
            if (z2) {
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
            if (z2) {
                OUP.LJJJJLI(c7yf2, Float.valueOf(C32151Nz.LJIIZILJ(4)), null, null, 30);
            }
            c7yf2.setFont(72);
            C8FC c8fc2 = new C8FC(c7yf2);
            SpannableString spannableString2 = new SpannableString(" ");
            z = true;
            spannableString2.setSpan(c8fc2, spannableString2.length() - 1, spannableString2.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString2);
        } else {
            z = true;
        }
        MusicReleaseInfo musicReleaseInfo2 = musicModel2.getMusicReleaseInfo();
        if (musicReleaseInfo2 != null && musicReleaseInfo2.isNewReleaseSong() == z) {
            HashMap LIZJ = C03660Ck.LIZJ("enter_from", "others_homepage");
            LIZJ.put("music_id", musicModel2.getMusicId());
            LIZJ.put("group_id", musicModel2.getAwemeId());
            String str4 = "1";
            if (C7Y9.LIZ()) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            LIZJ.put("music_new_show", obj);
            LIZJ.put("location", "music_tab");
            if (!((C240719cZ) C51029K0z.LJIILLIIL(this)).LJLILLLLZI.LJLILLLLZI) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZJ.put("highlight", str4);
            FMX.LJIIL("new_release_show", LIZJ);
        }
        ((TextView) containerView2.findViewById(R.id.m5v)).setText(spannableStringBuilder);
        View findViewById = containerView2.findViewById(R.id.m5v);
        if (musicModel2.getPresenterDuration() > 0) {
            i = 0;
        } else {
            i = 4;
        }
        findViewById.setVisibility(i);
        View findViewById2 = getContainerView().findViewById(R.id.mdz);
        if (findViewById2 != null) {
            if (((C240719cZ) C51029K0z.LJIILLIIL(this)).LJLILLLLZI.LJLIL == EnumC240399c3.PINNED && !C7Y9.LIZ() && !((C240719cZ) C51029K0z.LJIILLIIL(this)).LJLILLLLZI.LJLILLLLZI) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            findViewById2.setVisibility(i2);
        }
        if (z2) {
            OUP.LJJJJLI(getContainerView().findViewById(R.id.mdz), Float.valueOf(C32151Nz.LJIIZILJ(4)), null, null, 30);
        }
        String musicId2 = item.LJLIL.getMusicId();
        MusicModel musicModel3 = b4().LJLJJI;
        if (musicModel3 != null) {
            str3 = musicModel3.getMusicId();
        }
        if (!o.LJ(musicId2, str3)) {
            Z3(EnumC241749eE.DEFAULT);
        } else {
            EnumC241749eE enumC241749eE = b4().LJLJJL;
            if (enumC241749eE != null) {
                Z3(enumC241749eE);
            }
        }
        if (item.LJLILLLLZI.LJLILLLLZI) {
            User user = ((OriginMusicArg) this.LJZL.getValue()).getUser();
            if (user != null && (nickname = user.getNickname()) != null) {
                str2 = nickname;
            }
            String string = getContainerView().getContext().getString(R.string.i27, str2);
            o.LJIIIIZZ(string, "containerView.context.ge…nd_newSectionTitle, name)");
            ((TextView) getContainerView().findViewById(R.id.m8h)).setText(string);
            W5F LJII = W5U.LJII(C78939UyV.LJ(C78688UuS.LJJ(((OriginMusicArg) this.LJZL.getValue()).getUser())));
            LJII.LJIIJJI = R.drawable.b7n;
            LJII.LJJIJIIJIL = true;
            LJII.LJJIIJ = (SmartImageView) getContainerView().findViewById(R.id.abh);
            C16880lQ.LLJJJ(LJII);
            getContainerView().findViewById(R.id.e5e).setBackgroundResource(R.drawable.bwj);
            MusicModel musicModel4 = ((C240719cZ) C51029K0z.LJIILLIIL(this)).LJLIL;
            if (!TextUtils.isEmpty(musicModel4.getPicPremium())) {
                picBig = musicModel4.getPicPremium();
            } else {
                if (!TextUtils.isEmpty(musicModel4.getPicBig())) {
                    picBig = musicModel4.getPicBig();
                }
                getContainerView().findViewById(R.id.g3r).setVisibility(0);
                getContainerView().findViewById(R.id.e5e).setVisibility(0);
                return;
            }
            if (picBig != null) {
                W5U.LJIIIIZZ(picBig).LJIIIZ((C242119ep) this.LLFFF.getValue());
            }
            getContainerView().findViewById(R.id.g3r).setVisibility(0);
            getContainerView().findViewById(R.id.e5e).setVisibility(0);
            return;
        }
        getContainerView().findViewById(R.id.g3r).setVisibility(8);
        getContainerView().findViewById(R.id.e5e).setVisibility(8);
    }

    public final void Z3(EnumC241749eE enumC241749eE) {
        if (this.LLFF == enumC241749eE) {
            return;
        }
        this.LLFF = enumC241749eE;
        if (C99W.LIZ) {
            OUP.LJJJJLI(getContainerView().findViewById(R.id.gr_), Float.valueOf(C32151Nz.LJIIZILJ(8)), null, null, 30);
        }
        View containerView = getContainerView();
        int i = C241739eD.LIZ[enumC241749eE.ordinal()];
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
        containerView.findViewById(R.id.gr_).setVisibility(0);
        ((ImageView) containerView.findViewById(R.id.gqu)).setVisibility(0);
        ((TuxIconView) containerView.findViewById(R.id.gqu)).setIconRes(R.raw.icon_pause_fill1);
        containerView.findViewById(R.id.gqu).clearAnimation();
        MobClick obtain = MobClick.obtain();
        obtain.setEventName("music_play");
        obtain.setLabelName("personal_homepage_list");
        obtain.setValue(((C240719cZ) C51029K0z.LJIILLIIL(this)).LJLIL.getMusicId());
        FMX.onEvent(obtain);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C240719cZ c240719cZ) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C16880lQ.LJIJ((RelativeLayout) view.findViewById(R.id.gr_), new ACListenerS39S0200000_4(view, this, 20));
        C16880lQ.LJIIZILJ((LinearLayout) view.findViewById(R.id.g6q), new ACListenerS24S0100000_4(this, 75));
        C16880lQ.LJJJ((TuxIconView) view.findViewById(R.id.gru), new ACListenerS24S0100000_4(this, 76));
        ((T5P) view.findViewById(R.id.f75)).setOnStateChangeListener(new T5Q() { // from class: X.9dH
            @Override // X.T5Q
            public final void LIZ() {
            }

            @Override // X.T5Q
            public final void LIZIZ(int i) {
                if (i == 1) {
                    MusicCellAssem.this.a4().setState(C240979cz.LJLIL);
                }
            }
        });
        ((ImageView) view.findViewById(R.id.f75)).setVisibility(0);
        ((AbstractC019505v) view.findViewById(R.id.ah4)).setReferencedIds(new int[]{R.id.f75, R.id.f7d, R.id.df6, R.id.f7_, R.id.dfq});
        C8YN.LJIIJ(this, b4(), new TBT() { // from class: X.9dI
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240839cl) obj).LJLIL;
            }
        }, new TBT() { // from class: X.9dJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240839cl) obj).LJLILLLLZI;
            }
        }, null, C241119dD.LJLIL, 12);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.gru);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_lines_horizontal_decrease_alt;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        tuxIconView.setTuxIcon(c2068389v);
        view.findViewById(R.id.m5x).setVisibility(8);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C240719cZ c240719cZ) {
    }
}
