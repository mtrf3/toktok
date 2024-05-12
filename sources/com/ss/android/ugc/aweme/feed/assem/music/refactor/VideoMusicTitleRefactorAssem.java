package com.ss.android.ugc.aweme.feed.assem.music.refactor;

import X.AV1;
import X.C16880lQ;
import X.C17N;
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
import X.C2S6;
import X.C30581Hy;
import X.C34561DhN;
import X.C35570Dxe;
import X.C3C8;
import X.C40010Fn4;
import X.C45804HyK;
import X.C51029K0z;
import X.C52552Kjs;
import X.C52939Kq7;
import X.C53110Kss;
import X.C53326KwM;
import X.C54333LUb;
import X.C54838Lfe;
import X.C54944LhM;
import X.C55096Ljo;
import X.C55723Ltv;
import X.C57188McS;
import X.C58452Mwq;
import X.C5H3;
import X.C61845OOz;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72224SWe;
import X.C72225SWf;
import X.C72226SWg;
import X.C72227SWh;
import X.C72228SWi;
import X.C72230SWk;
import X.C72232SWm;
import X.C72234SWo;
import X.C72236SWq;
import X.C72238SWs;
import X.C72243SWx;
import X.C72244SWy;
import X.C72245SWz;
import X.C72253SXh;
import X.C73098SmU;
import X.C76800UCe;
import X.C79057V0z;
import X.C7MY;
import X.C81155Vt9;
import X.C8D3;
import X.C8MM;
import X.C8ON;
import X.C8PQ;
import X.C8T7;
import X.C8YN;
import X.C9BE;
import X.DTI;
import X.InterfaceC115514g7;
import X.InterfaceC55102Lju;
import X.InterfaceC65784Pro;
import X.InterfaceC74236TBo;
import X.OUP;
import X.SV5;
import X.SW9;
import X.SWC;
import X.SWE;
import X.SWH;
import X.SWI;
import X.SX0;
import X.SX2;
import X.SX5;
import X.SXF;
import X.SXG;
import X.SXH;
import X.SXI;
import X.SXJ;
import X.SXL;
import X.SXM;
import X.SXO;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import X.Z9N;
import Y.ACListenerS32S0100000_12;
import Y.ARunnableS40S0100000_4;
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
import com.google.gson.Gson;
import com.google.gson.g;
import com.google.gson.j;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.music.InteractInfoMusicTitleAbility;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleVM;
import com.ss.android.ugc.aweme.feed.assem.music.artistprofile.VideoMusicCacheDataVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicInfo;
import com.ss.android.ugc.aweme.music.service.MusicDetailService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS110S0101000_12;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class VideoMusicTitleRefactorAssem extends BaseCellSlotComponent implements InteractInfoMusicTitleAbility, ComponentPriorityProtocol, InterfaceC55102Lju {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLILLJJLI;
    public final C62822Ol8 LLFII;
    public final InterfaceC115514g7 LLFZ;
    public final InterfaceC115514g7 LLI;
    public final InterfaceC115514g7 LLIFFJFJJ;
    public final C5H3 LLII;
    public final C5H3 LLIIII;
    public final C5H3 LLIIIILZ;
    public TuxIconView LLIIIJ;
    public C81155Vt9 LLIIIL;
    public TuxTextView LLIIIZ;
    public LinearLayout LLIIJI;
    public ImageView LLIIJLIL;
    public LinearLayout LLIIL;
    public boolean LLIILII;
    public boolean LLIILZL;
    public C72232SWm LLIIZ;
    public boolean LLIL;
    public boolean LLILII;
    public boolean LLILIL;
    public boolean LLILL;
    public final C62822Ol8 LLILLIZIL;

    static {
        TBT tbt = new TBT(VideoMusicTitleRefactorAssem.class, "musicTitleVM", "getMusicTitleVM()Lcom/ss/android/ugc/aweme/feed/assem/music/VideoMusicTitleVM;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLILLJJLI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(VideoMusicTitleRefactorAssem.class, "musicBaseVM", "getMusicBaseVM()Lcom/ss/android/ugc/aweme/feed/assem/music/VideoMusicBaseVM;", 0, c65351Pkp), C61845OOz.LIZJ(VideoMusicTitleRefactorAssem.class, "videoMusicCacheDataVM", "getVideoMusicCacheDataVM()Lcom/ss/android/ugc/aweme/feed/assem/music/artistprofile/VideoMusicCacheDataVM;", 0, c65351Pkp)};
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

    public VideoMusicTitleRefactorAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS162S0100000_12(this, 573));
        C65776Prg LIZ = C65352Pkq.LIZ(VideoMusicTitleVM.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 350), null, SXF.INSTANCE, null, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(VideoMusicBaseVM.class);
        this.LLI = C214348b8.LIZ(this, LIZ2, null, new AqS153S0100000_3(LIZ2, 351), null, SXO.INSTANCE, null, null);
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ3 = C65352Pkq.LIZ(VideoMusicCacheDataVM.class);
        this.LLIFFJFJJ = C214348b8.LIZ(this, LIZ3, c9be, new AqS153S0100000_3(LIZ3, 352), null, SXG.INSTANCE, null, null);
        this.LLII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), SXH.INSTANCE);
        this.LLIIII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), SXI.INSTANCE);
        this.LLIIIILZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), SXJ.INSTANCE);
        this.LLILLIZIL = C221108m2.LIZIZ(SXM.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.HashSet, java.util.Set<java.lang.String>, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Set] */
    public static Set u4() {
        boolean z;
        C58452Mwq.LIZ.getClass();
        ?? r4 = C58452Mwq.LIZJ;
        if (r4 == 0 || r4.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            r4 = new LinkedHashSet();
            g value = (g) C58452Mwq.LJ.getValue();
            o.LJIIIIZZ(value, "value");
            Iterator<j> it = value.iterator();
            while (it.hasNext()) {
                j next = it.next();
                try {
                    C58452Mwq.LIZ.getClass();
                    String str = (String) ((Gson) C58452Mwq.LIZLLL.getValue()).LIZJ(next, String.class);
                    if (str != null) {
                        r4.add(str);
                    }
                } catch (Exception unused) {
                }
            }
            if (!r4.contains("music_title_icon_default")) {
                r4.add("music_title_icon_default");
            }
            C58452Mwq.LIZJ = r4;
        }
        return r4;
    }

    public final VideoMusicTitleVM B4() {
        return (VideoMusicTitleVM) this.LLFZ.LIZ(this, LLILLJJLI[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void a4() {
        if (((Boolean) C53110Kss.LIZ.getValue()).booleanValue()) {
            if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
                C35570Dxe.LIZJ(this.LLIIIL);
                C81155Vt9 c81155Vt9 = this.LLIIIL;
                if (c81155Vt9 != null) {
                    c81155Vt9.LIZ();
                    return;
                }
                return;
            }
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS48S0100000_12(this, 42));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void b4() {
        G4(new AqS162S0100000_12(this, 574));
    }

    public final void r4() {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout linearLayout = this.LLIIJI;
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
                if ((C30581Hy.LJIL(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType) && A4() != null) || R4(aweme) || P4(aweme)) {
                    if (i > 0) {
                        layoutParams.bottomMargin = 0;
                        c218518hr.setLayoutParams(layoutParams);
                        View view = this.LLIIJLIL;
                        if (view != null) {
                            q4(i, view);
                        }
                        View view2 = this.LLIIL;
                        if (view2 != null) {
                            q4(i, view2);
                        }
                        View view3 = this.LLIIIL;
                        if (view3 != null) {
                            q4(i, view3);
                        }
                        View view4 = this.LLIIIZ;
                        if (view4 != null) {
                            q4(i, view4);
                        }
                        View view5 = this.LLIIIJ;
                        if (view5 != null) {
                            q4(i, view5);
                        }
                        ImageView imageView = this.LLIIJLIL;
                        if (imageView != null) {
                            C72253SXh.LIZ(imageView, 0, 0, 0, i);
                        }
                        LinearLayout linearLayout2 = this.LLIIL;
                        if (linearLayout2 != null) {
                            C72253SXh.LIZ(linearLayout2, 0, 0, 0, i);
                        }
                        C81155Vt9 c81155Vt9 = this.LLIIIL;
                        if (c81155Vt9 != null) {
                            C72253SXh.LIZ(c81155Vt9, 0, 0, 0, i);
                        }
                        TuxTextView tuxTextView = this.LLIIIZ;
                        if (tuxTextView != null) {
                            C72253SXh.LIZ(tuxTextView, 0, 0, 0, i);
                            return;
                        }
                        return;
                    }
                    return;
                }
                F4(c218518hr, layoutParams);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final void unBind() {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout linearLayout = this.LLIIJI;
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
            F4(c218518hr, layoutParams);
        }
    }

    public final VideoMusicBaseVM z4() {
        return (VideoMusicBaseVM) this.LLI.LIZ(this, LLILLJJLI[1]);
    }

    public final MusicInfo A4() {
        return MusicDetailService.LJIJJ().LJIJI(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme());
    }

    public final boolean D4() {
        Aweme aweme;
        Music music;
        if (((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().hasCreationIntention()) {
            Z9N z9n = Z9N.LIZIZ;
            if (z9n.LLILZ().LJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType) && z9n.LLILZ().LIZJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                return true;
            }
        }
        if (B4().mv0()) {
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
        if (music.getMatchedPGCSoundInfo() != null && !C4(music.getMatchedPGCSoundInfo().getMixedTitle())) {
            return false;
        }
        return C4(music.getMusicName());
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.music.InteractInfoMusicTitleAbility
    public final void Yp() {
        LinearLayout linearLayout;
        boolean z;
        int dimension;
        if (C40010Fn4.LIZJ().LIZLLL() || C54333LUb.LIZJ || this.LLIILII) {
            this.LLIILZL = true;
            TuxTextView tuxTextView = this.LLIIIZ;
            if (tuxTextView != null) {
                C17N.LJJLIIIJJI(tuxTextView);
            }
            C81155Vt9 c81155Vt9 = this.LLIIIL;
            if (c81155Vt9 != null) {
                C17N.LJJIIJZLJL(c81155Vt9);
            }
        } else {
            this.LLIILZL = false;
            TuxTextView tuxTextView2 = this.LLIIIZ;
            if (tuxTextView2 != null) {
                C17N.LJJIIJZLJL(tuxTextView2);
            }
            C81155Vt9 c81155Vt92 = this.LLIIIL;
            if (c81155Vt92 != null) {
                C17N.LJJLIIIJJI(c81155Vt92);
            }
        }
        TuxTextView tuxTextView3 = this.LLIIIZ;
        if (tuxTextView3 != null) {
            tuxTextView3.setMaxWidth(Integer.MAX_VALUE);
        }
        C81155Vt9 c81155Vt93 = this.LLIIIL;
        int i = -2;
        if (c81155Vt93 != null) {
            ViewGroup.LayoutParams layoutParams = c81155Vt93.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = -2;
                c81155Vt93.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        Iterator it = u4().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SXL sxl = (SXL) ((Map) this.LLILLIZIL.getValue()).get(it.next());
            if (sxl != null && sxl.LIZIZ((VideoItemParams) C51029K0z.LJIILLIIL(this))) {
                sxl.LIZJ((VideoItemParams) C51029K0z.LJIILLIIL(this));
                break;
            }
        }
        View containerView = getContainerView();
        ViewGroup.LayoutParams layoutParams2 = containerView.getLayoutParams();
        if (layoutParams2 != null) {
            if (!C34561DhN.LIZ()) {
                layoutParams2.width = getContainerView().getContext().getResources().getDimensionPixelSize(R.dimen.kf);
            }
            if (C2S6.LIZ(containerView.getContext()).isHideMusicText()) {
                containerView.setPadding(getContainerView().getLeft(), 0, getContainerView().getRight(), 0);
                if (containerView.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                    C45804HyK.LJJLIIIJ(0, containerView);
                    C45804HyK.LJJL(0, containerView);
                }
            }
            ImageView imageView = this.LLIIJLIL;
            if ((imageView != null && imageView.getVisibility() == 0) || ((linearLayout = this.LLIIL) != null && linearLayout.getVisibility() == 0)) {
                z = true;
            } else {
                z = false;
            }
            if (e1.LIZ(31744, "marquee_title_opt", true, false) || C40010Fn4.LIZJ().LIZLLL() || C54333LUb.LIZJ) {
                if (!z) {
                    i = C17N.LJIILL(250.0d);
                }
                layoutParams2.width = i;
            } else {
                if (z) {
                    dimension = -2;
                } else {
                    dimension = (int) containerView.getResources().getDimension(R.dimen.kg);
                }
                layoutParams2.width = dimension;
                layoutParams2.height = -2;
            }
            containerView.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
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

    public final boolean C4(String str) {
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

    public final void E4(View view) {
        MusicInfo A4 = A4();
        if (A4 != null) {
            A4.setClickSource("click_source_music_title");
        }
        VideoMusicBaseVM z4 = z4();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "it.context");
        VideoMusicBaseVM.mv0(z4, context, view.getId(), false, null, this.LLILII, 28);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        this.LLIL = false;
        this.LLILII = false;
        Yp();
        r4();
        Aweme aweme = item.getAweme();
        Context context = getContext();
        VideoMusicCacheDataVM videoMusicCacheDataVM = (VideoMusicCacheDataVM) this.LLIFFJFJJ.LIZ(this, LLILLJJLI[2]);
        String aid = item.getAweme().getAid();
        if (aid == null) {
            aid = "";
        }
        if (C57188McS.LIZJ(aweme, context, videoMusicCacheDataVM.LJLL.get(aid)) || D4()) {
            C79057V0z.LJJJ(getContainerView(), new ARunnableS40S0100000_4(this, 145));
        } else {
            C79057V0z.LJJJ(getContainerView(), new ARunnableS40S0100000_4(this, 146));
            InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLFII.getValue();
            if (interactAreaCommonAbility != null) {
                interactAreaCommonAbility.U00(this, null, null);
            }
        }
        C54944LhM.LJFF(item.getAweme(), item.mEventType);
    }

    public final void G4(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            interfaceC65784Pro.invoke();
        } else {
            C1DH.LJJIJIIJI(new ARunnableS40S0100000_4((InterfaceC65784Pro) interfaceC65784Pro, 49));
        }
    }

    public final void I4(int i) {
        if (C51029K0z.LJIILLIIL(this) != null) {
            getContainerView();
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
            Context context = getContext();
            VideoMusicCacheDataVM videoMusicCacheDataVM = (VideoMusicCacheDataVM) this.LLIFFJFJJ.LIZ(this, LLILLJJLI[2]);
            String aid = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getAid();
            if (aid == null) {
                aid = "";
            }
            if (C57188McS.LIZJ(aweme, context, videoMusicCacheDataVM.LJLL.get(aid)) || D4()) {
                G4(new AqS162S0100000_12(this, 575));
            } else if (O4((VideoItemParams) C51029K0z.LJIILLIIL(this)) && C57188McS.LIZ()) {
                G4(new AqS162S0100000_12(this, 576));
            } else {
                G4(new AqS110S0101000_12(this, i, 1));
            }
        }
    }

    public final void J4(String str) {
        C2059186h.LIZ(this.LLIIIZ, str);
        C81155Vt9 c81155Vt9 = this.LLIIIL;
        if (c81155Vt9 != null) {
            c81155Vt9.setText(str);
        }
    }

    public final boolean O4(VideoItemParams videoItemParams) {
        if (!C52939Kq7.LIZ()) {
            return false;
        }
        Aweme aweme = videoItemParams.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        if ((C30581Hy.LJIL(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType) && A4() != null) || R4(aweme) || P4(aweme)) {
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

    public final boolean P4(Aweme aweme) {
        boolean z = this.LLILL;
        this.LLILL = false;
        if (!C30581Hy.LJIL(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType) || aweme.isAd() || C54838Lfe.LJJI(aweme) || aweme.isPhotoMode()) {
            return false;
        }
        if (!SWI.LIZIZ.LJIILL(aweme.getMusic(), aweme.getAid(), z)) {
            return false;
        }
        return true;
    }

    public final boolean R4(Aweme aweme) {
        if (MusicDetailService.LJIJJ().LJIIJ(aweme) && !aweme.isAd() && !C54838Lfe.LJJI(aweme) && !aweme.isPhotoMode() && C30581Hy.LJIL(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType)) {
            return true;
        }
        return false;
    }

    public final void S4(Music music) {
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
        I4(0);
        Yp();
        TuxIconView tuxIconView = this.LLIIIJ;
        if (tuxIconView != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZIZ = C7MY.LIZIZ(14);
            c2068389v.LIZJ = C7MY.LIZIZ(14);
            c2068389v.LIZ = R.raw.icon_music_note_s_alt;
            c2068389v.LJ = Integer.valueOf(R.attr.dj);
            c2068389v.LJFF = true;
            tuxIconView.setTuxIcon(c2068389v);
        }
        Aweme aweme4 = null;
        r4 = null;
        String str10 = null;
        if (B4().lv0()) {
            Context context = getContext();
            if (context != null && (resources10 = context.getResources()) != null) {
                str10 = resources10.getString(R.string.phm);
            }
            J4(str10);
        } else {
            VideoItemParams gv0 = B4().gv0();
            if (gv0 != null && (aweme3 = gv0.getAweme()) != null) {
                user = aweme3.getAuthor();
            } else {
                user = null;
            }
            if (C8D3.LIZJ() || C55723Ltv.LIZIZ.LJIJ().LJIJ(C212428Vi.LIZLLL(this))) {
                C81155Vt9 c81155Vt9 = this.LLIIIL;
                if (c81155Vt9 != null) {
                    c81155Vt9.setTuxFont(51);
                }
                TuxTextView tuxTextView = this.LLIIIZ;
                if (tuxTextView != null) {
                    tuxTextView.setTuxFont(51);
                }
            }
            String str11 = "";
            if (music != null) {
                if (music.getMatchedPGCSoundInfo() != null && !TextUtils.isEmpty(music.getMatchedPGCSoundInfo().getMixedTitle())) {
                    J4(music.getMatchedPGCSoundInfo().getMixedTitle());
                } else {
                    if (TextUtils.isEmpty(music.getAuthorName())) {
                        J4(music.getMusicName());
                    } else if (TextUtils.isEmpty(music.getOwnerId())) {
                        if (TextUtils.isEmpty(music.getMusicName()) && TextUtils.isEmpty(music.getAuthorName())) {
                            Context context2 = getContext();
                            if (context2 != null && (resources9 = context2.getResources()) != null) {
                                str9 = resources9.getString(R.string.jdk);
                            } else {
                                str9 = null;
                            }
                            J4(str9);
                        } else {
                            Context context3 = getContext();
                            if (context3 != null && (resources8 = context3.getResources()) != null) {
                                str8 = resources8.getString(R.string.ij4, music.getMusicName(), music.getAuthorName());
                            } else {
                                str8 = null;
                            }
                            J4(str8);
                        }
                    } else {
                        Context context4 = getContext();
                        if (context4 != null && (resources7 = context4.getResources()) != null) {
                            str5 = resources7.getString(R.string.ij4, music.getMusicName(), music.getAuthorName());
                        } else {
                            str5 = null;
                        }
                        J4(str5);
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
                            J4(str6);
                        }
                    }
                    VideoItemParams gv02 = B4().gv0();
                    if ((gv02 == null || (aweme2 = gv02.getAweme()) == null || !aweme2.isCanPlay()) && z4().lv0()) {
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
                    J4(str3);
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
                    J4(str);
                }
            }
            VideoItemParams gv03 = B4().gv0();
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
                J4(str4);
            }
            VideoItemParams gv04 = B4().gv0();
            if (gv04 != null) {
                aweme4 = gv04.getAweme();
            }
            if (C63081OpJ.LJLJLLL(aweme4)) {
                I4(8);
            }
        }
        if (this.LLIIZ == null) {
            C72232SWm c72232SWm = new C72232SWm();
            this.LLIIZ = c72232SWm;
            c72232SWm.LIZIZ = this.LLIIIJ;
        }
        C72232SWm c72232SWm2 = this.LLIIZ;
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
        c8mm.LIZ("event_component_clickable", new AqS178S0100000_12(this, 197));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* renamed from: m4 */
    public final boolean c2(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if (!C53326KwM.LIZIZ() && O4(item) && C57188McS.LIZ()) {
            return false;
        }
        return super.c2(item);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxIconView tuxIconView;
        o.LJIIIZ(view, "view");
        I4(0);
        this.LLIIIL = (C81155Vt9) Y3().findViewById(R.id.gu7);
        this.LLIIIZ = (TuxTextView) Y3().findViewById(R.id.gu_);
        TuxIconView tuxIconView2 = (TuxIconView) Y3().findViewById(R.id.gt3);
        this.LLIIIJ = tuxIconView2;
        DTI.LJLIL.LJLIL(tuxIconView2);
        this.LLIIJI = (LinearLayout) Y3().findViewById(R.id.g4l);
        this.LLIIJLIL = (ImageView) Y3().findViewById(R.id.gqn);
        this.LLIIL = (LinearLayout) Y3().findViewById(R.id.gqe);
        this.LLIILII = e1.LIZ(31744, "marquee_title_opt", true, false);
        TuxTextView tuxTextView = this.LLIIIZ;
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS32S0100000_12(this, 59));
        }
        C81155Vt9 c81155Vt9 = this.LLIIIL;
        if (c81155Vt9 != null) {
            c81155Vt9.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS32S0100000_12(this, 60)));
        }
        if (C8PQ.LIZ() && (tuxIconView = this.LLIIIJ) != null) {
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
            this.LLIILII = true;
            TuxTextView tuxTextView2 = this.LLIIIZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(0);
            }
            C81155Vt9 c81155Vt92 = this.LLIIIL;
            if (c81155Vt92 != null) {
                c81155Vt92.setVisibility(8);
            }
        }
        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.NbK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), SX2.LJLIL, 4);
        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.8Tq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), C72243SWx.LJLIL, 4);
        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.Md6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), C72244SWy.LJLIL, 4);
        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.8Uv
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), C72245SWz.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.OPc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, C213688a4.LJ(), C72226SWg.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.OPe
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, C213688a4.LJ(), C72228SWi.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.8Ik
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLLLL;
            }
        }, null, C72227SWh.LJLIL, 6);
        C8YN.LJII(this, B4(), new TBT() { // from class: X.SXW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C72231SWl) obj).LJLJJI);
            }
        }, null, C72238SWs.LJLIL, 6);
        C8YN.LJII(this, B4(), new TBT() { // from class: X.SXQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C72231SWl) obj).LJLJJL);
            }
        }, null, C72236SWq.LJLIL, 6);
        C8YN.LJII(this, B4(), new TBT() { // from class: X.SXS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C72231SWl) obj).LJLJJLL);
            }
        }, null, SX0.LJLIL, 6);
        C8YN.LJII(this, B4(), new TBT() { // from class: X.SXU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C72231SWl) obj).LJLILLLLZI);
            }
        }, null, SX5.LJLIL, 6);
        C8YN.LJII(this, B4(), new TBT() { // from class: X.SXY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C72231SWl) obj).LJLIL;
            }
        }, null, C72234SWo.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIIILZ.getValue(), new TBT() { // from class: X.SXd
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LLF;
            }
        }, null, C72230SWk.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIIILZ.getValue(), new TBT() { // from class: X.SWc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LLFF;
            }
        }, null, SWC.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIIILZ.getValue(), new TBT() { // from class: X.SWb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LLFFF;
            }
        }, null, SWE.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIIIILZ.getValue(), new TBT() { // from class: X.SXb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LLFII;
            }
        }, null, SW9.LJLIL, 6);
        ((Map) this.LLILLIZIL.getValue()).put("music_title_icon_add_song_to_dsp", new SWH(this, this.LLIIL, this.LLIIJLIL, this.LLIIIJ, new AqS162S0100000_12(this, 1189), new AqS170S0100000_4(this, 1319)));
        ((Map) this.LLILLIZIL.getValue()).put("music_title_icon_tiktok_music", new SV5(this, this.LLIIL, this.LLIIJLIL, this.LLIIIJ, new AqS162S0100000_12(this, 1190), new AqS170S0100000_4(this, 1320), new AqS162S0100000_12(this, 1191), new AqS162S0100000_12(this, 1192)));
        ((Map) this.LLILLIZIL.getValue()).put("music_title_icon_new_release", new C72225SWf(this, this.LLIIL, this.LLIIJLIL, this.LLIIIJ, new AqS162S0100000_12(this, 1193), new AqS170S0100000_4(this, 1321), new AqS162S0100000_12(this, 1187), new AqS178S0100000_12(this, 645)));
        ((Map) this.LLILLIZIL.getValue()).put("music_title_icon_default", new C72224SWe(this, this.LLIIL, this.LLIIJLIL, this.LLIIIJ, new AqS162S0100000_12(this, 1188)));
    }

    public final void F4(C218518hr c218518hr, LinearLayout.LayoutParams layoutParams) {
        if (C52552Kjs.LIZ()) {
            layoutParams.bottomMargin = C8ON.LIZ();
        } else {
            layoutParams.bottomMargin = C8ON.LIZIZ();
        }
        c218518hr.setLayoutParams(layoutParams);
        ImageView imageView = this.LLIIJLIL;
        if (imageView != null) {
            q4(0, imageView);
        }
        LinearLayout linearLayout = this.LLIIL;
        if (linearLayout != null) {
            q4(0, linearLayout);
        }
        C81155Vt9 c81155Vt9 = this.LLIIIL;
        if (c81155Vt9 != null) {
            q4(0, c81155Vt9);
        }
        TuxTextView tuxTextView = this.LLIIIZ;
        if (tuxTextView != null) {
            q4(0, tuxTextView);
        }
        TuxIconView tuxIconView = this.LLIIIJ;
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
