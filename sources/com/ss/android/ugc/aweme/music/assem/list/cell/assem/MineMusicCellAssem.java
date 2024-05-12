package com.ss.android.ugc.aweme.music.assem.list.cell.assem;

import X.AbstractC019505v;
import X.C03660Ck;
import X.C04270Et;
import X.C16880lQ;
import X.C17N;
import X.C188727au;
import X.C2068389v;
import X.C214348b8;
import X.C221108m2;
import X.C240639cR;
import X.C240719cZ;
import X.C240999d1;
import X.C241009d2;
import X.C241019d3;
import X.C241029d4;
import X.C241039d5;
import X.C241059d7;
import X.C241089dA;
import X.C241099dB;
import X.C241109dC;
import X.C241729eC;
import X.C26045AKb;
import X.C32151Nz;
import X.C44384HbQ;
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
import X.C78688UuS;
import X.C78765Uvh;
import X.C78939UyV;
import X.C7MY;
import X.C7Y9;
import X.C7YF;
import X.C8FC;
import X.C8HV;
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
import X.OUP;
import X.RBX;
import X.T5P;
import X.T5Q;
import X.TBT;
import X.W5F;
import X.W5U;
import X.Z8A;
import Y.ACListenerS24S0100000_4;
import Y.ACListenerS39S0200000_4;
import Y.IDLListenerS191S0100000_3;
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
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.assem.list.cell.assem.MineMusicCellAssem;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.vm.MusicCellViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class MineMusicCellAssem extends ReusedUIContentAssem<MineMusicCellAssem> implements C8XO<C240719cZ> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public final InterfaceC115514g7 LLD;
    public final InterfaceC115514g7 LLF;
    public final InterfaceC115514g7 LLFF;
    public final C62822Ol8 LLFFF;
    public EnumC241749eE LLFII;
    public final Map<Integer, View> LLFZ = new LinkedHashMap();
    public final C73318Sq2 LJZL = new C73318Sq2();
    public final C55749LuL LL = new C55749LuL(C47704Ins.LIZJ(this, OriginMusicArg.class, null), checkSupervisorPrepared());

    static {
        TBT tbt = new TBT(MineMusicCellAssem.class, "cellViewModel", "getCellViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicCellViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(MineMusicCellAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0, c65351Pkp), C61845OOz.LIZJ(MineMusicCellAssem.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0, c65351Pkp)};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        C8YN.LJII(this, a4(), new TBT() { // from class: X.9d6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C240949cw) obj).LJLIL);
            }
        }, null, C241039d5.LJLIL, 6);
        C8YN.LJII(this, a4(), new TBT() { // from class: X.9d9
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240949cw) obj).LJLILLLLZI;
            }
        }, null, C241059d7.LJLIL, 6);
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFZ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = getContainerView().findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public MineMusicCellAssem() {
        C240999d1 c240999d1 = C240999d1.LIZ;
        C241019d3 c241019d3 = C241019d3.LJLIL;
        C241009d2 c241009d2 = C241009d2.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicCellViewModel.class);
        this.LLD = C214348b8.LIZ(this, LIZ, c240999d1, new AqS154S0100000_4(LIZ, 423), null, C241089dA.INSTANCE, c241019d3, c241009d2);
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 421);
        C65776Prg LIZ2 = C65352Pkq.LIZ(OriginMusicListViewModel.class);
        this.LLF = C214348b8.LIZ(this, LIZ2, c9be, new AqS154S0100000_4(LIZ2, 424), aqS154S0100000_4, C241099dB.INSTANCE, null, null);
        AqS154S0100000_4 aqS154S0100000_42 = new AqS154S0100000_4(this, 422);
        C65776Prg LIZ3 = C65352Pkq.LIZ(MusicPlayViewModel.class);
        this.LLFF = C214348b8.LIZ(this, LIZ3, c9be, new AqS154S0100000_4(LIZ3, 425), aqS154S0100000_42, C241109dC.INSTANCE, null, null);
        this.LLFFF = C221108m2.LIZIZ(new AqS154S0100000_4(this, 420));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        this.LJZL.dispose();
    }

    public final MusicCellViewModel a4() {
        return (MusicCellViewModel) this.LLD.LIZ(this, LLI[0]);
    }

    public final MusicPlayViewModel b4() {
        return (MusicPlayViewModel) this.LLFF.LIZ(this, LLI[2]);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C240719cZ c240719cZ) {
        String str;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
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
        C16880lQ.LJJJLIIL((T5P) containerView.findViewById(R.id.f75), new ACListenerS24S0100000_4(this, 240));
        ((TextView) containerView.findViewById(R.id.mpy)).setText(containerView.getContext().getString(R.string.jdo, Integer.valueOf(musicModel.getUserCount())));
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
        C16880lQ.LJJJ((TuxIconView) containerView.findViewById(R.id.f7d), new ACListenerS24S0100000_4(this, 241));
        C16880lQ.LJJJ((TuxIconView) containerView.findViewById(R.id.f7_), new ACListenerS39S0200000_4(this, musicModel, 72));
        C16880lQ.LJJJ((TuxIconView) containerView.findViewById(R.id.dfq), new ACListenerS39S0200000_4(this, musicModel, 73));
        EnumC240399c3 enumC240399c3 = item.LJLILLLLZI.LJLIL;
        MusicModel musicModel2 = item.LJLIL;
        View containerView2 = getContainerView();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MusicService.LJJLIIIJJI().LJJIJLIJ(musicModel2.getPresenterDuration()));
        if (C7Y9.LIZ() && enumC240399c3 == EnumC240399c3.PINNED && !((C240719cZ) C51029K0z.LJIILLIIL(this)).LJLILLLLZI.LJLILLLLZI) {
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
            HashMap LIZJ = C03660Ck.LIZJ("enter_from", "personal_homepage");
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
        C240639cR c240639cR = item.LJLILLLLZI;
        EnumC240399c3 enumC240399c32 = c240639cR.LJLIL;
        boolean z3 = c240639cR.LJLILLLLZI;
        if (z3) {
            View findViewById2 = getContainerView().findViewById(R.id.f7d);
            if (findViewById2 != null) {
                C17N.LJJIIJZLJL(findViewById2);
            }
        } else {
            View findViewById3 = getContainerView().findViewById(R.id.f7d);
            if (findViewById3 != null) {
                C17N.LJJLIIIJJI(findViewById3);
            }
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZIZ = C7MY.LIZIZ(20);
            c2068389v.LIZJ = C7MY.LIZIZ(20);
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
        }
        View findViewById4 = getContainerView().findViewById(R.id.mdz);
        if (findViewById4 != null) {
            if (enumC240399c32 == EnumC240399c3.PINNED && !C7Y9.LIZ() && !z3) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            findViewById4.setVisibility(i4);
        }
        if (z2) {
            OUP.LJJJJLI(getContainerView().findViewById(R.id.mdz), Float.valueOf(C32151Nz.LJIIZILJ(4)), null, null, 30);
        }
        g4(C44384HbQ.LLILLJJLI(item.LJLIL.getPinnedVideoStatus()));
        if (item.LJLILLLLZI.LJLILLLLZI) {
            User user = ((OriginMusicArg) this.LL.getValue()).getUser();
            if (user != null && (nickname = user.getNickname()) != null) {
                str2 = nickname;
            }
            String string = getContainerView().getContext().getString(R.string.i27, str2);
            o.LJIIIIZZ(string, "containerView.context.ge…nd_newSectionTitle, name)");
            ((TextView) getContainerView().findViewById(R.id.m8h)).setText(string);
            W5F LJII = W5U.LJII(C78939UyV.LJ(C78688UuS.LJJ(((OriginMusicArg) this.LL.getValue()).getUser())));
            LJII.LJIIJJI = R.drawable.b7n;
            LJII.LJJIJIIJIL = true;
            LJII.LJJIIJ = (SmartImageView) getContainerView().findViewById(R.id.abh);
            C16880lQ.LLJJJ(LJII);
            getContainerView().findViewById(R.id.e5e).setBackgroundResource(R.drawable.bwj);
            MusicModel musicModel3 = ((C240719cZ) C51029K0z.LJIILLIIL(this)).LJLIL;
            if (!TextUtils.isEmpty(musicModel3.getPicPremium())) {
                picBig = musicModel3.getPicPremium();
            } else {
                if (!TextUtils.isEmpty(musicModel3.getPicBig())) {
                    picBig = musicModel3.getPicBig();
                }
                getContainerView().findViewById(R.id.g3r).getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS191S0100000_3(this, 7));
                getContainerView().findViewById(R.id.g3r).setVisibility(0);
                getContainerView().findViewById(R.id.e5e).setVisibility(0);
            }
            if (picBig != null) {
                W5U.LJIIIIZZ(picBig).LJIIIZ((C8HV) this.LLFFF.getValue());
            }
            getContainerView().findViewById(R.id.g3r).getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS191S0100000_3(this, 7));
            getContainerView().findViewById(R.id.g3r).setVisibility(0);
            getContainerView().findViewById(R.id.e5e).setVisibility(0);
        } else {
            getContainerView().findViewById(R.id.g3r).setVisibility(8);
            getContainerView().findViewById(R.id.e5e).setVisibility(8);
        }
        String musicId2 = item.LJLIL.getMusicId();
        MusicModel musicModel4 = b4().LJLJJI;
        if (musicModel4 != null) {
            str3 = musicModel4.getMusicId();
        }
        if (!o.LJ(musicId2, str3)) {
            Z3(EnumC241749eE.DEFAULT);
            return;
        }
        EnumC241749eE enumC241749eE = b4().LJLJJL;
        if (enumC241749eE == null) {
            return;
        }
        Z3(enumC241749eE);
    }

    public final void Z3(EnumC241749eE enumC241749eE) {
        if (this.LLFII == enumC241749eE) {
            return;
        }
        this.LLFII = enumC241749eE;
        if (C99W.LIZ) {
            OUP.LJJJJLI(getContainerView().findViewById(R.id.gr_), Float.valueOf(C32151Nz.LJIIZILJ(8)), null, null, 30);
        }
        View containerView = getContainerView();
        int i = C241729eC.LIZ[enumC241749eE.ordinal()];
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

    public final void c4(boolean z) {
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser != null && curUser.isAccuratePrivateAccount()) {
            C26045AKb c26045AKb = new C26045AKb(getContainerView());
            c26045AKb.LJIIIIZZ(R.string.gcx);
            c26045AKb.LJIIJ();
        } else {
            if (z) {
                b4().lv0((C240719cZ) C51029K0z.LJIILLIIL(this), C51029K0z.LJIIZILJ(this), true);
                return;
            }
            MusicPlayViewModel b4 = b4();
            MusicModel musicModel = ((C240719cZ) C51029K0z.LJIILLIIL(this)).LJLIL;
            b4.getClass();
            MusicPlayViewModel.kv0(musicModel);
        }
    }

    public final void e4(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("button_name", str);
        String userId = ((OriginMusicArg) this.LL.getValue()).getUserId();
        if (userId == null) {
            userId = "";
        }
        c188727au.LJIIIZ("to_user_id", userId);
        c188727au.LIZLLL(((C240719cZ) C51029K0z.LJIILLIIL(this)).LJLILLLLZI.LJLILLLLZI ? 1 : 0, "highlight");
        FMX.LJIIL("new_song_click", c188727au.LIZ);
    }

    public final void g4(EnumC240989d0 enumC240989d0) {
        if (!Z8A.LIZIZ.enableShowFeatureVideoEntrance()) {
            return;
        }
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = C7MY.LIZIZ(20);
        c2068389v.LIZJ = C7MY.LIZIZ(20);
        c2068389v.LIZ = R.raw.icon_featured_video;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        ((TuxIconView) _$_findCachedViewById(R.id.f7_)).setTuxIcon(c2068389v);
        if (enumC240989d0 == EnumC240989d0.NOT_ALLOWED_SHOWN) {
            ((ImageView) _$_findCachedViewById(R.id.f7_)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.dfq)).setVisibility(8);
        } else {
            if (enumC240989d0 == EnumC240989d0.HAS_PINNED) {
                ((ImageView) _$_findCachedViewById(R.id.dfq)).setVisibility(8);
            } else {
                ((ImageView) _$_findCachedViewById(R.id.dfq)).setVisibility(0);
            }
            ((ImageView) _$_findCachedViewById(R.id.f7_)).setVisibility(0);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C16880lQ.LJIJ((RelativeLayout) view.findViewById(R.id.gr_), new ACListenerS39S0200000_4(view, this, 19));
        C16880lQ.LJIIZILJ((LinearLayout) view.findViewById(R.id.g6q), new ACListenerS24S0100000_4(this, 72));
        C16880lQ.LJJJ((TuxIconView) view.findViewById(R.id.gru), new ACListenerS24S0100000_4(this, 73));
        ((T5P) view.findViewById(R.id.f75)).setOnStateChangeListener(new T5Q() { // from class: X.9d8
            @Override // X.T5Q
            public final void LIZ() {
            }

            @Override // X.T5Q
            public final void LIZIZ(int i) {
                if (i == 1) {
                    MineMusicCellAssem.this.a4().setState(C240979cz.LJLIL);
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
        C8YN.LJIIJ(this, b4(), new TBT() { // from class: X.9cm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240839cl) obj).LJLIL;
            }
        }, new TBT() { // from class: X.9cp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240839cl) obj).LJLILLLLZI;
            }
        }, null, C241029d4.LJLIL, 12);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.gru);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_lines_horizontal_decrease_alt;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        tuxIconView.setTuxIcon(c2068389v);
        C16880lQ.LJJJJI((TuxTextView) view.findViewById(R.id.m5x), new ACListenerS24S0100000_4(this, 74));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C240719cZ c240719cZ) {
    }
}
