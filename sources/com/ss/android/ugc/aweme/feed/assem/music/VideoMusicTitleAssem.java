package com.ss.android.ugc.aweme.feed.assem.music;

import X.AV1;
import X.C16880lQ;
import X.C187437Xf;
import X.C187647Ya;
import X.C1DH;
import X.C2049682q;
import X.C2053083y;
import X.C2059186h;
import X.C2068389v;
import X.C212428Vi;
import X.C213688a4;
import X.C214348b8;
import X.C218518hr;
import X.C221108m2;
import X.C2K0;
import X.C30581Hy;
import X.C32151Nz;
import X.C34561DhN;
import X.C35570Dxe;
import X.C3C8;
import X.C51029K0z;
import X.C52552Kjs;
import X.C52939Kq7;
import X.C53110Kss;
import X.C53208KuS;
import X.C53326KwM;
import X.C54838Lfe;
import X.C54944LhM;
import X.C55096Ljo;
import X.C55723Ltv;
import X.C57188McS;
import X.C5H3;
import X.C61845OOz;
import X.C61878OQg;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72229SWj;
import X.C72231SWl;
import X.C72232SWm;
import X.C72233SWn;
import X.C72235SWp;
import X.C72237SWr;
import X.C72239SWt;
import X.C72240SWu;
import X.C72241SWv;
import X.C72242SWw;
import X.C72253SXh;
import X.C73098SmU;
import X.C76800UCe;
import X.C79057V0z;
import X.C7MY;
import X.C7YY;
import X.C7YZ;
import X.C81155Vt9;
import X.C8D3;
import X.C8MM;
import X.C8ON;
import X.C8PQ;
import X.C8T7;
import X.C8YN;
import X.C9BE;
import X.DTI;
import X.FMX;
import X.InterfaceC115514g7;
import X.InterfaceC55102Lju;
import X.InterfaceC65784Pro;
import X.InterfaceC74236TBo;
import X.O6R;
import X.OUP;
import X.SV4;
import X.SW3;
import X.SW6;
import X.SW8;
import X.SWB;
import X.SWD;
import X.SWF;
import X.SWI;
import X.SX1;
import X.SX4;
import X.SXA;
import X.SXB;
import X.SXC;
import X.SXD;
import X.SXE;
import X.SXN;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import X.Z9N;
import Y.ACListenerS32S0100000_12;
import Y.ARunnableS46S0100000_10;
import Y.ARunnableS48S0100000_12;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.music.artistprofile.VideoMusicCacheDataVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicInfo;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.service.MusicDetailService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS110S0101000_12;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS54S0110000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class VideoMusicTitleAssem extends BaseCellSlotComponent implements InteractInfoMusicTitleAbility, ComponentPriorityProtocol, InterfaceC55102Lju {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLILLJJLI;
    public final C62822Ol8 LLFII;
    public final InterfaceC115514g7 LLFZ;
    public final InterfaceC115514g7 LLI;
    public final InterfaceC115514g7 LLIFFJFJJ;
    public final C5H3 LLII;
    public final C5H3 LLIIII;
    public final C5H3 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public TuxIconView LLIIIL;
    public C81155Vt9 LLIIIZ;
    public TuxTextView LLIIJI;
    public LinearLayout LLIIJLIL;
    public ImageView LLIIL;
    public LinearLayout LLIILII;
    public boolean LLIILZL;
    public boolean LLIIZ;
    public C72232SWm LLIL;
    public boolean LLILII;
    public boolean LLILIL;
    public boolean LLILL;
    public boolean LLILLIZIL;

    static {
        TBT tbt = new TBT(VideoMusicTitleAssem.class, "musicTitleVM", "getMusicTitleVM()Lcom/ss/android/ugc/aweme/feed/assem/music/VideoMusicTitleVM;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLILLJJLI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(VideoMusicTitleAssem.class, "musicBaseVM", "getMusicBaseVM()Lcom/ss/android/ugc/aweme/feed/assem/music/VideoMusicBaseVM;", 0, c65351Pkp), C61845OOz.LIZJ(VideoMusicTitleAssem.class, "videoMusicCacheDataVM", "getVideoMusicCacheDataVM()Lcom/ss/android/ugc/aweme/feed/assem/music/artistprofile/VideoMusicCacheDataVM;", 0, c65351Pkp)};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.adg;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "left_container_music_info";
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 614565913) {
            return null;
        }
        return this;
    }

    public VideoMusicTitleAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS162S0100000_12(this, 566));
        C65776Prg LIZ = C65352Pkq.LIZ(VideoMusicTitleVM.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 343), null, SXA.INSTANCE, null, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(VideoMusicBaseVM.class);
        this.LLI = C214348b8.LIZ(this, LIZ2, null, new AqS153S0100000_3(LIZ2, 344), null, SXN.INSTANCE, null, null);
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ3 = C65352Pkq.LIZ(VideoMusicCacheDataVM.class);
        this.LLIFFJFJJ = C214348b8.LIZ(this, LIZ3, c9be, new AqS153S0100000_3(LIZ3, 345), null, SXB.INSTANCE, null, null);
        this.LLII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), SXC.INSTANCE);
        this.LLIIII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), SXD.INSTANCE);
        this.LLIIIILZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), SXE.INSTANCE);
        this.LLIIIJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 568));
    }

    public final VideoMusicBaseVM A4() {
        return (VideoMusicBaseVM) this.LLI.LIZ(this, LLILLJJLI[1]);
    }

    public final VideoMusicTitleVM C4() {
        return (VideoMusicTitleVM) this.LLFZ.LIZ(this, LLILLJJLI[0]);
    }

    public final VideoMusicCacheDataVM D4() {
        return (VideoMusicCacheDataVM) this.LLIFFJFJJ.LIZ(this, LLILLJJLI[2]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void a4() {
        if (((Boolean) C53110Kss.LIZ.getValue()).booleanValue()) {
            if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
                C35570Dxe.LIZJ(this.LLIIIZ);
                C81155Vt9 c81155Vt9 = this.LLIIIZ;
                if (c81155Vt9 != null) {
                    c81155Vt9.LIZ();
                    return;
                }
                return;
            }
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS48S0100000_12(this, 37));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void b4() {
        P4(new AqS162S0100000_12(this, 567));
    }

    public final void r4() {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout linearLayout = this.LLIIJLIL;
        ViewParent viewParent = null;
        if (linearLayout != null) {
            viewParent = linearLayout.getParent();
        }
        if (viewParent instanceof C218518hr) {
            C218518hr c218518hr = (C218518hr) viewParent;
            ViewGroup.LayoutParams layoutParams2 = c218518hr.getLayoutParams();
            if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                int i = layoutParams.bottomMargin;
                Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
                o.LJIIIIZZ(aweme, "item.aweme");
                if (Y4() || a5(aweme) || X4(aweme)) {
                    if (i > 0) {
                        layoutParams.bottomMargin = 0;
                        c218518hr.setLayoutParams(layoutParams);
                        View view = this.LLIIL;
                        if (view != null) {
                            q4(i, view);
                        }
                        View view2 = this.LLIILII;
                        if (view2 != null) {
                            q4(i, view2);
                        }
                        View view3 = this.LLIIIZ;
                        if (view3 != null) {
                            q4(i, view3);
                        }
                        View view4 = this.LLIIJI;
                        if (view4 != null) {
                            q4(i, view4);
                        }
                        View view5 = this.LLIIIL;
                        if (view5 != null) {
                            q4(i, view5);
                        }
                        ImageView imageView = this.LLIIL;
                        if (imageView != null) {
                            C72253SXh.LIZ(imageView, 0, 0, 0, i);
                        }
                        LinearLayout linearLayout2 = this.LLIILII;
                        if (linearLayout2 != null) {
                            C72253SXh.LIZ(linearLayout2, 0, 0, 0, i);
                        }
                        C81155Vt9 c81155Vt9 = this.LLIIIZ;
                        if (c81155Vt9 != null) {
                            C72253SXh.LIZ(c81155Vt9, 0, 0, 0, i);
                        }
                        TuxTextView tuxTextView = this.LLIIJI;
                        if (tuxTextView != null) {
                            C72253SXh.LIZ(tuxTextView, 0, 0, 0, i);
                            return;
                        }
                        return;
                    }
                    return;
                }
                O4(c218518hr, layoutParams);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final void unBind() {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout linearLayout = this.LLIIJLIL;
        ViewParent viewParent = null;
        if (linearLayout != null) {
            viewParent = linearLayout.getParent();
        }
        if (viewParent instanceof C218518hr) {
            C218518hr c218518hr = (C218518hr) viewParent;
            ViewGroup.LayoutParams layoutParams2 = c218518hr.getLayoutParams();
            if (!(layoutParams2 instanceof LinearLayout.LayoutParams) || (layoutParams = (LinearLayout.LayoutParams) layoutParams2) == null) {
                return;
            }
            O4(c218518hr, layoutParams);
        }
    }

    public final VideoEventDispatchViewModel z4() {
        return (VideoEventDispatchViewModel) this.LLIIIILZ.getValue();
    }

    public final MusicInfo B4() {
        return MusicDetailService.LJIJJ().LJIJI(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme());
    }

    public final boolean F4() {
        Aweme aweme;
        Music music;
        if (((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().hasCreationIntention()) {
            Z9N z9n = Z9N.LIZIZ;
            if (z9n.LLILZ().LJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType) && z9n.LLILZ().LIZJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                return true;
            }
        }
        if (C4().mv0()) {
            return true;
        }
        VideoItemParams videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(this);
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        if (!C2049682q.LIZ(aweme)) {
            return false;
        }
        Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme2 == null || (music = aweme2.getMusic()) == null) {
            return true;
        }
        if (music.getMatchedPGCSoundInfo() != null && !E4(music.getMatchedPGCSoundInfo().getMixedTitle())) {
            return false;
        }
        return E4(music.getMusicName());
    }

    public final boolean Y4() {
        if (!C30581Hy.LJIL(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType) || C187437Xf.LIZ() != 0 || B4() == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:199:0x0334, code lost:
    
        if (r5 == null) goto L187;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0212  */
    @Override // com.ss.android.ugc.aweme.feed.assem.music.InteractInfoMusicTitleAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Yp() {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem.Yp():void");
    }

    public final void c5() {
        VideoMusicTitleVM C4 = C4();
        C4.getClass();
        C4.setState(new AqS54S0110000_12(C4, 13));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    public final boolean E4(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str != null) {
            str2 = str.toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(str2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            str2 = null;
        }
        return TextUtils.equals(str2, "null");
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        this.LLILII = false;
        this.LLILIL = false;
        Yp();
        r4();
        Aweme aweme = item.getAweme();
        Context context = getContext();
        VideoMusicCacheDataVM D4 = D4();
        String aid = item.getAweme().getAid();
        if (aid == null) {
            aid = "";
        }
        if (C57188McS.LIZJ(aweme, context, D4.LJLL.get(aid)) || F4()) {
            C79057V0z.LJJJ(getContainerView(), new ARunnableS46S0100000_10(this, 133));
        } else {
            C79057V0z.LJJJ(getContainerView(), new ARunnableS46S0100000_10(this, 134));
            InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLFII.getValue();
            if (interactAreaCommonAbility != null) {
                interactAreaCommonAbility.U00(this, null, null);
            }
        }
        C54944LhM.LJFF(item.getAweme(), item.mEventType);
    }

    public final void G4(View view) {
        MusicInfo B4 = B4();
        if (B4 != null) {
            B4.setClickSource("click_source_music_title");
        }
        VideoMusicBaseVM A4 = A4();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "it.context");
        VideoMusicBaseVM.mv0(A4, context, view.getId(), false, null, this.LLILIL, 28);
    }

    public final void J4(boolean z) {
        String str;
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        HashMap hashMap = new HashMap();
        String str2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType;
        if (str2 == null) {
            str2 = "'";
        }
        hashMap.put("enter_from", str2);
        hashMap.put("music_id", aweme.getMusic().getMid());
        hashMap.put("group_id", aweme.getAid());
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("music_new_show", str);
        hashMap.put("location", "name");
        FMX.LJIIL("new_release_show", hashMap);
    }

    public final void P4(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            interfaceC65784Pro.invoke();
        } else {
            C1DH.LJJIJIIJI(new ARunnableS46S0100000_10((InterfaceC65784Pro) interfaceC65784Pro, 50));
        }
    }

    public final void R4(int i) {
        if (C51029K0z.LJIILLIIL(this) != null) {
            getContainerView();
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
            Context context = getContext();
            VideoMusicCacheDataVM D4 = D4();
            String aid = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getAid();
            if (aid == null) {
                aid = "";
            }
            if (C57188McS.LIZJ(aweme, context, D4.LJLL.get(aid)) || F4()) {
                P4(new AqS162S0100000_12(this, 569));
            } else if (T4((VideoItemParams) C51029K0z.LJIILLIIL(this)) && C57188McS.LIZ()) {
                P4(new AqS162S0100000_12(this, 570));
            } else {
                P4(new AqS110S0101000_12(this, i, 0));
            }
        }
    }

    public final void S4(String str) {
        C2059186h.LIZ(this.LLIIJI, str);
        C81155Vt9 c81155Vt9 = this.LLIIIZ;
        if (c81155Vt9 != null) {
            c81155Vt9.setText(str);
        }
    }

    public final boolean T4(VideoItemParams videoItemParams) {
        if (!C52939Kq7.LIZ()) {
            return false;
        }
        Aweme aweme = videoItemParams.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        if (Y4() || a5(aweme) || X4(aweme)) {
            return false;
        }
        Aweme aweme2 = videoItemParams.getAweme();
        o.LJIIIIZZ(aweme2, "item.aweme");
        if (C30581Hy.LJIL(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType) && !aweme2.isAd() && !C54838Lfe.LJJI(aweme2) && !aweme2.isPhotoMode()) {
            if (SWI.LIZIZ.LJIIL(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getMusic(), ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getAid())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean X4(Aweme aweme) {
        boolean z = this.LLILLIZIL;
        this.LLILLIZIL = false;
        VideoMusicTitleVM C4 = C4();
        C4.getClass();
        if (C53208KuS.LIZ()) {
            Boolean bool = ((C72231SWl) C4.getState()).LJLJL;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }
        return C4.kv0(aweme, z);
    }

    public final boolean a5(Aweme aweme) {
        if (MusicDetailService.LJIJJ().LJIIJ(aweme) && !aweme.isAd() && !C54838Lfe.LJJI(aweme) && !aweme.isPhotoMode() && C30581Hy.LJIL(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType)) {
            return true;
        }
        return false;
    }

    public final void b5(Music music) {
        User user;
        String str;
        Resources resources;
        String str2;
        Resources resources2;
        String str3;
        Resources resources3;
        Aweme aweme;
        String str4;
        Resources resources4;
        String str5;
        String str6;
        Resources resources5;
        String str7;
        Resources resources6;
        Resources resources7;
        String str8;
        Resources resources8;
        String str9;
        Resources resources9;
        Aweme aweme2;
        Aweme aweme3;
        Resources resources10;
        R4(0);
        Yp();
        Integer valueOf = Integer.valueOf(R.attr.dj);
        if (music != null && (music.isOriginMusic() || music.isArtistMusic())) {
            TuxIconView tuxIconView = this.LLIIIL;
            if (tuxIconView != null) {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(14));
                c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(14));
                c2068389v.LIZ = R.raw.icon_music_note_s_alt;
                c2068389v.LJ = valueOf;
                c2068389v.LJFF = true;
                tuxIconView.setTuxIcon(c2068389v);
            }
        } else {
            TuxIconView tuxIconView2 = this.LLIIIL;
            if (tuxIconView2 != null) {
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(14));
                c2068389v2.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(14));
                c2068389v2.LIZ = R.raw.icon_music_note_s_alt;
                c2068389v2.LJ = valueOf;
                c2068389v2.LJFF = true;
                tuxIconView2.setTuxIcon(c2068389v2);
            }
        }
        Aweme aweme4 = null;
        r6 = null;
        String str10 = null;
        if (C4().lv0()) {
            Context context = getContext();
            if (context != null && (resources10 = context.getResources()) != null) {
                str10 = resources10.getString(R.string.phm);
            }
            S4(str10);
        } else {
            VideoItemParams gv0 = C4().gv0();
            if (gv0 != null && (aweme3 = gv0.getAweme()) != null) {
                user = aweme3.getAuthor();
            } else {
                user = null;
            }
            if (C8D3.LIZJ() || C55723Ltv.LIZIZ.LJIJ().LJIJ(C212428Vi.LIZLLL(this))) {
                C81155Vt9 c81155Vt9 = this.LLIIIZ;
                if (c81155Vt9 != null) {
                    c81155Vt9.setTuxFont(51);
                }
                TuxTextView tuxTextView = this.LLIIJI;
                if (tuxTextView != null) {
                    tuxTextView.setTuxFont(51);
                }
            }
            String str11 = "";
            if (music != null) {
                if (music.getMatchedPGCSoundInfo() != null && !TextUtils.isEmpty(music.getMatchedPGCSoundInfo().getMixedTitle())) {
                    S4(music.getMatchedPGCSoundInfo().getMixedTitle());
                } else {
                    if (TextUtils.isEmpty(music.getAuthorName())) {
                        S4(music.getMusicName());
                    } else if (TextUtils.isEmpty(music.getOwnerId())) {
                        if (TextUtils.isEmpty(music.getMusicName()) && TextUtils.isEmpty(music.getAuthorName())) {
                            Context context2 = getContext();
                            if (context2 != null && (resources9 = context2.getResources()) != null) {
                                str9 = resources9.getString(R.string.jdk);
                            } else {
                                str9 = null;
                            }
                            S4(str9);
                        } else {
                            Context context3 = getContext();
                            if (context3 != null && (resources8 = context3.getResources()) != null) {
                                str8 = resources8.getString(R.string.ij4, music.getMusicName(), music.getAuthorName());
                            } else {
                                str8 = null;
                            }
                            S4(str8);
                        }
                    } else {
                        Context context4 = getContext();
                        if (context4 != null && (resources7 = context4.getResources()) != null) {
                            str5 = resources7.getString(R.string.ij4, music.getMusicName(), music.getAuthorName());
                        } else {
                            str5 = null;
                        }
                        S4(str5);
                        if (TextUtils.isEmpty(music.getMusicName())) {
                            Context context5 = getContext();
                            if (context5 != null && (resources5 = context5.getResources()) != null) {
                                Object[] objArr = new Object[2];
                                Context context6 = getContext();
                                if (context6 != null && (resources6 = context6.getResources()) != null) {
                                    str7 = resources6.getString(R.string.ii_);
                                } else {
                                    str7 = null;
                                }
                                objArr[0] = str7;
                                if (!TextUtils.isEmpty(music.getOwnerHandle())) {
                                    str11 = music.getOwnerHandle();
                                }
                                objArr[1] = str11;
                                str6 = resources5.getString(R.string.ij3, objArr);
                            } else {
                                str6 = null;
                            }
                            S4(str6);
                        }
                    }
                    R4(0);
                    VideoItemParams gv02 = C4().gv0();
                    if ((gv02 == null || (aweme2 = gv02.getAweme()) == null || !aweme2.isCanPlay()) && A4().lv0()) {
                        Y3().setVisibility(4);
                    }
                }
            } else {
                if (user != null) {
                    str11 = AV1.LJI(user);
                }
                if (TextUtils.isEmpty(str11)) {
                    Context context7 = getContext();
                    if (context7 != null && (resources3 = context7.getResources()) != null) {
                        str3 = resources3.getString(R.string.jdk);
                    } else {
                        str3 = null;
                    }
                    S4(str3);
                } else {
                    Context context8 = getContext();
                    if (context8 != null && (resources = context8.getResources()) != null) {
                        Object[] objArr2 = new Object[2];
                        Context context9 = getContext();
                        if (context9 != null && (resources2 = context9.getResources()) != null) {
                            str2 = resources2.getString(R.string.ii_);
                        } else {
                            str2 = null;
                        }
                        objArr2[0] = str2;
                        objArr2[1] = str11;
                        str = resources.getString(R.string.ij3, objArr2);
                    } else {
                        str = null;
                    }
                    S4(str);
                }
            }
            VideoItemParams gv03 = C4().gv0();
            if (gv03 != null && (aweme = gv03.getAweme()) != null && aweme.isWithPromotionalMusic()) {
                if (music != null && !TextUtils.isEmpty(music.getMusicName())) {
                    str4 = music.getMusicName();
                } else {
                    Context context10 = getContext();
                    if (context10 != null && (resources4 = context10.getResources()) != null) {
                        str4 = resources4.getString(R.string.phm);
                    } else {
                        str4 = null;
                    }
                }
                S4(str4);
            }
            VideoItemParams gv04 = C4().gv0();
            if (gv04 != null) {
                aweme4 = gv04.getAweme();
            }
            if (C63081OpJ.LJLJLLL(aweme4)) {
                R4(8);
            }
        }
        if (this.LLIL == null) {
            C72232SWm c72232SWm = new C72232SWm();
            this.LLIL = c72232SWm;
            c72232SWm.LIZIZ = this.LLIIIL;
        }
        C72232SWm c72232SWm2 = this.LLIL;
        if (c72232SWm2 != null && C8D3.LIZJ()) {
            c72232SWm2.LIZ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(Object obj) {
        return c2((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        c8mm.LIZ("event_component_clickable", new AqS178S0100000_12(this, 196));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* renamed from: m4 */
    public final boolean c2(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if (!C53326KwM.LIZIZ() && T4(item) && C57188McS.LIZ()) {
            return false;
        }
        return super.c2(item);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxIconView tuxIconView;
        o.LJIIIZ(view, "view");
        R4(0);
        this.LLIIIZ = (C81155Vt9) Y3().findViewById(R.id.gu7);
        this.LLIIJI = (TuxTextView) Y3().findViewById(R.id.gu_);
        TuxIconView tuxIconView2 = (TuxIconView) Y3().findViewById(R.id.gt3);
        this.LLIIIL = tuxIconView2;
        DTI.LJLIL.LJLIL(tuxIconView2);
        this.LLIIJLIL = (LinearLayout) Y3().findViewById(R.id.g4l);
        this.LLIIL = (ImageView) Y3().findViewById(R.id.gqn);
        this.LLIILII = (LinearLayout) Y3().findViewById(R.id.gqe);
        this.LLIILZL = e1.LIZ(31744, "marquee_title_opt", true, false);
        TuxTextView tuxTextView = this.LLIIJI;
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS32S0100000_12(this, 56));
        }
        C81155Vt9 c81155Vt9 = this.LLIIIZ;
        if (c81155Vt9 != null) {
            c81155Vt9.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS32S0100000_12(this, 57)));
        }
        TuxIconView tuxIconView3 = this.LLIIIL;
        if (tuxIconView3 != null) {
            C16880lQ.LJJJ(tuxIconView3, new ACListenerS32S0100000_12(this, 58));
        }
        if (C8PQ.LIZ() && (tuxIconView = this.LLIIIL) != null) {
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C7MY.LIZIZ(14);
                layoutParams.height = C7MY.LIZIZ(14);
                tuxIconView.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        if (!C34561DhN.LIZ()) {
            this.LLIILZL = true;
            TuxTextView tuxTextView2 = this.LLIIJI;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(0);
            }
            C81155Vt9 c81155Vt92 = this.LLIIIZ;
            if (c81155Vt92 != null) {
                c81155Vt92.setVisibility(8);
            }
        }
        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.NbJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), SX1.LJLIL, 4);
        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.8To
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), C72240SWu.LJLIL, 4);
        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.Md5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), C72241SWv.LJLIL, 4);
        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.8Ut
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), C72242SWw.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.OPb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, C213688a4.LJ(), SWF.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.OPd
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, C213688a4.LJ(), SW6.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.8Ij
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLLLL;
            }
        }, null, SV4.LJLIL, 6);
        C8YN.LJII(this, C4(), new TBT() { // from class: X.SXV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C72231SWl) obj).LJLJJI);
            }
        }, null, C72237SWr.LJLIL, 6);
        C8YN.LJII(this, C4(), new TBT() { // from class: X.SXP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C72231SWl) obj).LJLJJL);
            }
        }, null, C72235SWp.LJLIL, 6);
        C8YN.LJII(this, C4(), new TBT() { // from class: X.SXR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C72231SWl) obj).LJLJJLL);
            }
        }, null, C72239SWt.LJLIL, 6);
        C8YN.LJII(this, C4(), new TBT() { // from class: X.SXT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C72231SWl) obj).LJLILLLLZI);
            }
        }, null, SX4.LJLIL, 6);
        C8YN.LJII(this, C4(), new TBT() { // from class: X.SXX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C72231SWl) obj).LJLIL;
            }
        }, null, C72233SWn.LJLIL, 6);
        C8YN.LJII(this, C4(), new TBT() { // from class: X.SXZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C72231SWl) obj).LJLJL;
            }
        }, C213688a4.LIZLLL(), SW3.LJLIL, 4);
        C8YN.LJII(this, z4(), new TBT() { // from class: X.8tD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LJLLILLLL;
            }
        }, null, C187647Ya.LJLIL, 6);
        C8YN.LJII(this, z4(), new TBT() { // from class: X.8UM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LL;
            }
        }, null, C7YZ.LJLIL, 6);
        C8YN.LJII(this, z4(), new TBT() { // from class: X.8UN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LLD;
            }
        }, null, C7YY.LJLIL, 6);
        C8YN.LJII(this, z4(), new TBT() { // from class: X.SXc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LLF;
            }
        }, null, C72229SWj.LJLIL, 6);
        C8YN.LJII(this, z4(), new TBT() { // from class: X.SWZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LLFF;
            }
        }, null, SWB.LJLIL, 6);
        C8YN.LJII(this, z4(), new TBT() { // from class: X.SWa
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LLFFF;
            }
        }, null, SWD.LJLIL, 6);
        C8YN.LJII(this, z4(), new TBT() { // from class: X.SXa
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LLFII;
            }
        }, null, SW8.LJLIL, 6);
    }

    public final List<MusicOwnerInfo> u4(String str) {
        VideoMusicCacheDataVM D4 = D4();
        D4.getClass();
        List<MusicOwnerInfo> list = D4.LJLJLLL.get(str);
        if (list == null) {
            return C61878OQg.INSTANCE;
        }
        return list;
    }

    public static final void I4(Aweme aweme, VideoMusicTitleAssem videoMusicTitleAssem) {
        HashMap hashMap = new HashMap();
        hashMap.put("group_id", aweme.getAid());
        String str = ((VideoItemParams) C51029K0z.LJIILLIIL(videoMusicTitleAssem)).mEventType;
        if (str == null) {
            str = "'";
        }
        hashMap.put("enter_from", str);
        hashMap.put("music_id", aweme.getMusic().getMid());
        hashMap.put("music_volume", aweme.getMusicVolume());
        hashMap.put("button_name", SWI.LIZIZ.LJI(((VideoItemParams) C51029K0z.LJIILLIIL(videoMusicTitleAssem)).getAweme().getMusic()).getEventName());
        hashMap.put("button_type", "small");
        FMX.LJIIL("show_tttodsp_music", hashMap);
    }

    public final void O4(C218518hr c218518hr, LinearLayout.LayoutParams layoutParams) {
        if (C52552Kjs.LIZ()) {
            layoutParams.bottomMargin = C8ON.LIZ();
        } else {
            layoutParams.bottomMargin = C8ON.LIZIZ();
        }
        c218518hr.setLayoutParams(layoutParams);
        ImageView imageView = this.LLIIL;
        if (imageView != null) {
            q4(0, imageView);
        }
        LinearLayout linearLayout = this.LLIILII;
        if (linearLayout != null) {
            q4(0, linearLayout);
        }
        C81155Vt9 c81155Vt9 = this.LLIIIZ;
        if (c81155Vt9 != null) {
            q4(0, c81155Vt9);
        }
        TuxTextView tuxTextView = this.LLIIJI;
        if (tuxTextView != null) {
            q4(0, tuxTextView);
        }
        TuxIconView tuxIconView = this.LLIIIL;
        if (tuxIconView != null) {
            q4(0, tuxIconView);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Sn(ReusedUIAssem<? extends C3C8> ins, InterfaceC65784Pro<C76800UCe> win) {
        o.LJIIIZ(ins, "ins");
        o.LJIIIZ(win, "win");
        C2053083y.LIZ(ins, win);
    }

    public final void q4(int i, View view) {
        View view2;
        Object parent = view.getParent();
        if ((parent instanceof FrameLayout) && (view2 = (View) parent) != null) {
            OUP.LJJJJI(i, view2);
        }
    }
}
