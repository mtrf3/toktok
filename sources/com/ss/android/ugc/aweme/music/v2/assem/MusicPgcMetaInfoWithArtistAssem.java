package com.ss.android.ugc.aweme.music.v2.assem;

import X.C00F;
import X.C113554cx;
import X.C16880lQ;
import X.C175046tw;
import X.C214298b3;
import X.C221108m2;
import X.C57434MgQ;
import X.C57446Mgc;
import X.C62395OeF;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78897Uxp;
import X.C78926UyI;
import X.C78939UyV;
import X.C79146V4k;
import X.C7Y9;
import X.C7YF;
import X.C7YH;
import X.C7YQ;
import X.C7YW;
import X.C8YN;
import X.C9BE;
import X.EnumC57119MbL;
import X.OSZ;
import X.QD3;
import X.TBT;
import Y.ACListenerS38S0200000_3;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.v2.assem.MusicPgcMetaInfoWithArtistAssem;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS166S0200000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class MusicPgcMetaInfoWithArtistAssem extends DynamicAssem {
    public TuxIconView LJLJLLL;
    public TuxIconView LJLL;
    public TuxTextView LJLLI;
    public TuxTextView LJLLILLLL;
    public C7YF LJLLJ;
    public View LJLLL;
    public View LJLLLL;
    public TuxIconView LJLLLLLL;
    public TuxTextView LJLZ;
    public TuxTextView LJZ;
    public TuxTextView LJZI;
    public TuxIconView LJZL;
    public C57446Mgc LL;
    public TuxIconView LLD;
    public View LLF;
    public View LLFF;
    public Music LLFFF;
    public final boolean LLFII;
    public final C62822Ol8 LLFZ;
    public final C214298b3 LLI;
    public boolean LLIFFJFJJ;
    public List<MusicOwnerInfo> LLII;
    public boolean LLIIII;

    public MusicPgcMetaInfoWithArtistAssem() {
        this.LLFII = C00F.LIZ(31744, 0, "show_pgc_artist_info", true) == 1;
        this.LLFZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 550));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicDetailViewModel.class);
        this.LLI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 551), C7YH.INSTANCE, null);
    }

    public final void L3() {
        int i;
        String str;
        Resources resources;
        View view;
        int i2;
        Integer followStatus;
        int i3;
        int i4;
        Integer followStatus2;
        final List<MusicOwnerInfo> list = this.LLII;
        if (list == null || list.isEmpty()) {
            View view2 = this.LLF;
            if (view2 != null) {
                C79146V4k.LJJIJLIJ(view2);
                return;
            }
            return;
        }
        View view3 = this.LLF;
        if (view3 != null) {
            C79146V4k.LJJLIIIJLJLI(view3);
        }
        TuxIconView tuxIconView = this.LJLLLLLL;
        if (tuxIconView != null) {
            C79146V4k.LJJLIIIJLJLI(tuxIconView);
        }
        TuxIconView tuxIconView2 = this.LLD;
        if (tuxIconView2 != null) {
            C79146V4k.LJJLIIIJLJLI(tuxIconView2);
        }
        TuxTextView tuxTextView = this.LJLZ;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(51);
        }
        TuxTextView tuxTextView2 = this.LJLZ;
        if (tuxTextView2 != null) {
            tuxTextView2.setTextColorRes(R.attr.go);
        }
        TuxTextView tuxTextView3 = this.LJZ;
        if (tuxTextView3 != null) {
            tuxTextView3.setTuxFont(52);
        }
        TuxTextView tuxTextView4 = this.LJZI;
        if (tuxTextView4 != null) {
            tuxTextView4.setTuxFont(52);
        }
        if (this.LLFII) {
            i = R.string.t27;
        } else {
            i = R.string.t29;
        }
        TuxTextView tuxTextView5 = this.LJLZ;
        if (tuxTextView5 != null) {
            tuxTextView5.setText(i);
        }
        if (list.size() == 1) {
            MusicOwnerInfo musicOwnerInfo = (MusicOwnerInfo) ListProtector.get(list, 0);
            String nickName = musicOwnerInfo.getNickName();
            TuxTextView tuxTextView6 = this.LJZ;
            if (tuxTextView6 != null) {
                tuxTextView6.setText(nickName);
            }
            TuxTextView tuxTextView7 = this.LJZI;
            if (tuxTextView7 != null) {
                C79146V4k.LJJIJLIJ(tuxTextView7);
            }
            TuxIconView tuxIconView3 = this.LJZL;
            if (tuxIconView3 != null) {
                if (musicOwnerInfo.getVerified()) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                tuxIconView3.setVisibility(i2);
            }
            if (!C78939UyV.LJJJJLL(musicOwnerInfo) || (((followStatus = musicOwnerInfo.getFollowStatus()) == null || followStatus.intValue() != 0) && (((followStatus2 = musicOwnerInfo.getFollowStatus()) == null || followStatus2.intValue() != 4) && !this.LLIIII))) {
                C57446Mgc c57446Mgc = this.LL;
                if (c57446Mgc != null) {
                    C79146V4k.LJJIJLIJ(c57446Mgc);
                }
            } else {
                this.LLIIII = true;
                C57446Mgc c57446Mgc2 = this.LL;
                if (c57446Mgc2 != null) {
                    C79146V4k.LJJLIIIJLJLI(c57446Mgc2);
                }
                Integer followStatus3 = musicOwnerInfo.getFollowStatus();
                LifecycleOwner lifecycleOwner = null;
                if (followStatus3 == null || followStatus3.intValue() != 1) {
                    C57446Mgc c57446Mgc3 = this.LL;
                    if (c57446Mgc3 != null) {
                        C78897Uxp.LJJJJLI(c57446Mgc3, null);
                    }
                } else {
                    C57446Mgc c57446Mgc4 = this.LL;
                    if (c57446Mgc4 != null) {
                        c57446Mgc4.setOnTouchListener(null);
                    }
                }
                C57446Mgc c57446Mgc5 = this.LL;
                if (c57446Mgc5 != null) {
                    c57446Mgc5.setDataChangeListener(new AqS134S0200000_3(this, musicOwnerInfo, 271));
                }
                User user = new User();
                user.setUid(musicOwnerInfo.getUid());
                user.setSecUid(musicOwnerInfo.getSecUid());
                user.setNickname(musicOwnerInfo.getNickName());
                Integer followStatus4 = musicOwnerInfo.getFollowStatus();
                if (followStatus4 != null) {
                    i3 = followStatus4.intValue();
                } else {
                    i3 = 0;
                }
                user.setFollowStatus(i3);
                Integer followerStatus = musicOwnerInfo.getFollowerStatus();
                if (followerStatus != null) {
                    i4 = followerStatus.intValue();
                } else {
                    i4 = 0;
                }
                user.setFollowerStatus(i4);
                user.setPrivateAccount(musicOwnerInfo.isPrivateAccount());
                C57446Mgc c57446Mgc6 = this.LL;
                if (c57446Mgc6 != null) {
                    C7YW c7yw = new C7YW();
                    c7yw.LIZ = user;
                    c7yw.LIZIZ(EnumC57119MbL.NORMAL);
                    Context context = getContext();
                    if (context != null) {
                        lifecycleOwner = C57434MgQ.LIZIZ(context);
                    }
                    c7yw.LJFF = lifecycleOwner;
                    c7yw.LIZLLL = C113554cx.LJJL(new OSZ(Boolean.FALSE, 52), new OSZ(Boolean.TRUE, 52));
                    c57446Mgc6.LJLILLLLZI.LJJJJJL(c7yw.LIZ());
                }
                C57446Mgc c57446Mgc7 = this.LL;
                if (c57446Mgc7 != null) {
                    c57446Mgc7.setTracker(new AqS153S0100000_3(this, 1639));
                }
            }
            View view4 = this.LLF;
            if (view4 != null) {
                C16880lQ.LJIIJ(new ACListenerS38S0200000_3(this, musicOwnerInfo, 40), view4);
            }
        } else {
            String nickName2 = ((MusicOwnerInfo) ListProtector.get(list, 0)).getNickName();
            TuxTextView tuxTextView8 = this.LJZ;
            if (tuxTextView8 != null) {
                tuxTextView8.setText(nickName2);
            }
            Context context2 = getContext();
            if (context2 == null || (resources = context2.getResources()) == null || (str = resources.getString(R.string.iic, Integer.valueOf(list.size() - 1))) == null) {
                str = "";
            }
            TuxTextView tuxTextView9 = this.LJZI;
            if (tuxTextView9 != null) {
                tuxTextView9.setText(str);
            }
            TuxTextView tuxTextView10 = this.LJZI;
            if (tuxTextView10 != null) {
                C79146V4k.LJJLIIIJLJLI(tuxTextView10);
            }
            TuxIconView tuxIconView4 = this.LJZL;
            if (tuxIconView4 != null) {
                C79146V4k.LJJIJLIJ(tuxIconView4);
            }
            C57446Mgc c57446Mgc8 = this.LL;
            if (c57446Mgc8 != null) {
                C79146V4k.LJJIJLIJ(c57446Mgc8);
            }
            View view5 = this.LLF;
            if (view5 != null) {
                C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.7YI
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        MatchedPGCSoundInfo matchedPGCSoundInfo;
                        FragmentManager childFragmentManager;
                        MusicPgcMetaInfoWithArtistAssem musicPgcMetaInfoWithArtistAssem = MusicPgcMetaInfoWithArtistAssem.this;
                        List<MusicOwnerInfo> list2 = list;
                        musicPgcMetaInfoWithArtistAssem.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putString("extra_artist_profile", JsonParseUtils.LIZLLL(list2));
                        Music music = musicPgcMetaInfoWithArtistAssem.LLFFF;
                        if (music != null) {
                            matchedPGCSoundInfo = music.getMatchedPGCSoundInfo();
                        } else {
                            matchedPGCSoundInfo = null;
                        }
                        bundle.putSerializable("extra_music", matchedPGCSoundInfo);
                        bundle.putString("extra_enter_type", "single_song");
                        bundle.putString("extra_enter_method", "music_feedback");
                        bundle.putBoolean("extra_show_follow_btn", true);
                        Fragment LJIIJ = CommonFeedApiService.LIZ().LJIIJ(bundle);
                        Fragment LIZLLL = C212428Vi.LIZLLL(musicPgcMetaInfoWithArtistAssem);
                        if (LIZLLL != null && (childFragmentManager = LIZLLL.getChildFragmentManager()) != null) {
                            ASL asl = new ASL();
                            asl.LIZIZ(LJIIJ);
                            asl.LJI(0);
                            TuxSheet tuxSheet = asl.LIZ;
                            tuxSheet.LJZI = false;
                            tuxSheet.show(childFragmentManager, "ArtistProfileTuxSheetFragment");
                        }
                    }
                }, view5);
            }
        }
        if (this.LLFII && (view = this.LLF) != null) {
            C78897Uxp.LJJJJJL(view, 0.0f);
        }
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        if (this.LLFII) {
            return R.layout.bv3;
        }
        return R.layout.bv2;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    public final void M3(String str) {
        boolean z;
        String str2;
        MatchedPGCSoundInfo matchedPGCSoundInfo;
        MusicReleaseInfo musicReleaseInfo;
        boolean z2 = false;
        if (str == null || str.length() == 0) {
            return;
        }
        Music music = this.LLFFF;
        if (music != null && (matchedPGCSoundInfo = music.getMatchedPGCSoundInfo()) != null && (musicReleaseInfo = matchedPGCSoundInfo.getMusicReleaseInfo()) != null && musicReleaseInfo.isNewReleaseSong()) {
            z = true;
        } else {
            z = false;
        }
        Music music2 = this.LLFFF;
        if (music2 != null) {
            str2 = music2.getMid();
        } else {
            str2 = null;
        }
        String str3 = (String) this.LLFZ.getValue();
        if (z && C7Y9.LIZ()) {
            z2 = true;
        }
        C62395OeF.LIZJ(str, str2, z, str3, z2);
        String uuid = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid, "randomUUID().toString()");
        SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "aweme://music/detail/");
        buildRoute.withParam("id", str);
        buildRoute.withParam("process_id", uuid);
        buildRoute.open();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onBlockUserEvent(C175046tw c175046tw) {
        User user;
        if (c175046tw != null) {
            user = c175046tw.LJLIL;
        } else {
            user = null;
        }
        List<MusicOwnerInfo> list = this.LLII;
        boolean z = false;
        if (user == null || list == null) {
            return;
        }
        for (MusicOwnerInfo musicOwnerInfo : list) {
            if (musicOwnerInfo != null && TextUtils.equals(musicOwnerInfo.getUid(), user.getUid())) {
                musicOwnerInfo.setFollowStatus(Integer.valueOf(user.getFollowStatus()));
                musicOwnerInfo.setFollowerStatus(Integer.valueOf(user.getFollowerStatus()));
                musicOwnerInfo.setBlock(user.isBlock());
                musicOwnerInfo.setBlocked(user.isBlocked());
                z = true;
            }
        }
        if (!z) {
            return;
        }
        L3();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onFollowStatus(FollowStatusEvent followStatusEvent) {
        FollowStatus followStatus;
        List<MusicOwnerInfo> list;
        if (followStatusEvent == null || (followStatus = followStatusEvent.status) == null || (list = this.LLII) == null) {
            return;
        }
        boolean z = false;
        for (MusicOwnerInfo musicOwnerInfo : list) {
            if (musicOwnerInfo != null && TextUtils.equals(musicOwnerInfo.getUid(), followStatus.userId)) {
                musicOwnerInfo.setFollowStatus(Integer.valueOf(followStatus.followStatus));
                int i = followStatus.followerStatus;
                if (i != 0 && i != -1) {
                    musicOwnerInfo.setBlock(false);
                    musicOwnerInfo.setBlocked(false);
                }
                z = true;
            }
        }
        if (!z) {
            return;
        }
        L3();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUnBlockUserEvent(C7YQ c7yq) {
        User user;
        if (c7yq != null) {
            user = c7yq.LJLIL;
        } else {
            user = null;
        }
        List<MusicOwnerInfo> list = this.LLII;
        boolean z = false;
        if (user == null || list == null) {
            return;
        }
        for (MusicOwnerInfo musicOwnerInfo : list) {
            if (musicOwnerInfo != null && TextUtils.equals(musicOwnerInfo.getUid(), user.getUid())) {
                musicOwnerInfo.setFollowStatus(Integer.valueOf(user.getFollowStatus()));
                musicOwnerInfo.setFollowerStatus(Integer.valueOf(user.getFollowerStatus()));
                musicOwnerInfo.setBlock(user.isBlock());
                musicOwnerInfo.setBlocked(user.isBlocked());
                z = true;
            }
        }
        if (!z) {
            return;
        }
        L3();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        assembleChildren();
        EventBus.LIZJ().LJIILJJIL(this);
        this.LLFF = view.findViewById(R.id.ngi);
        this.LJLLLL = view.findViewById(R.id.g50);
        this.LJLJLLL = (TuxIconView) view.findViewById(R.id.f73);
        this.LJLL = (TuxIconView) view.findViewById(R.id.f7c);
        this.LJLLI = (TuxTextView) view.findViewById(R.id.mdu);
        this.LJLLL = view.findViewById(R.id.g4m);
        this.LJLLILLLL = (TuxTextView) view.findViewById(R.id.mdt);
        this.LJLLJ = (C7YF) view.findViewById(R.id.l08);
        this.LJLLLLLL = (TuxIconView) view.findViewById(R.id.ey5);
        this.LJLZ = (TuxTextView) view.findViewById(R.id.mds);
        this.LJZ = (TuxTextView) view.findViewById(R.id.mdq);
        this.LJZI = (TuxTextView) view.findViewById(R.id.mdr);
        this.LJZL = (TuxIconView) view.findViewById(R.id.ey7);
        this.LL = (C57446Mgc) view.findViewById(R.id.j98);
        this.LLD = (TuxIconView) view.findViewById(R.id.ey6);
        this.LLF = view.findViewById(R.id.gro);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLI.getValue(), new TBT() { // from class: X.7Xx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C187447Xg) obj).LJLIL;
            }
        }, null, null, null, new AqS134S0200000_3(this, view, 103), 14, null);
        C8YN.LJII(this, (AssemViewModel) this.LLI.getValue(), new TBT() { // from class: X.7Xw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C187447Xg) obj).LJLILLLLZI);
            }
        }, null, new AqS166S0200000_3(this, view, 10), 6);
    }
}
