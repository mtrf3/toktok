package q03;

import X.ActivityC45651qj;
import X.C17J;
import X.C188727au;
import X.C1DJ;
import X.C239829b8;
import X.C240719cZ;
import X.C27355AoR;
import X.C45804HyK;
import X.C4LD;
import X.C51029K0z;
import X.C55096Ljo;
import X.C55230Lly;
import X.C98T;
import X.EnumC53663L4h;
import X.FMX;
import X.InterfaceC27359AoV;
import X.InterfaceC57784Mm4;
import X.L4T;
import X.L69;
import X.X1D;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabRouterAbility;
import com.ss.android.ugc.aweme.mix.platform.PlaylistBottomBarComponent;
import com.ss.android.ugc.aweme.mix.videodetail.MixVideoPlayDetailPageFragment;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.assem.MusicMiniBarAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellSimilarSoundsAssem;
import com.ss.android.ugc.aweme.music.ghost.ClaimStatusMusicAssem;
import com.ss.android.ugc.aweme.music.ghost.GhostMusicAssem;
import com.ss.android.ugc.aweme.music.highlight.HighlightSelectListViewModel;
import com.ss.android.ugc.aweme.music.highlight.cell.assem.HighlightSelectMusicBaseAssem;
import com.ss.android.ugc.aweme.music.highlight.cell.assem.HighlightSelectMusicSelectIconAssem;
import com.ss.android.ugc.aweme.music.highlight.cell.assem.HighlightSelectMusicSimilarSoundsAssem;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.offlinemode.ui.sheet.OfflineModeSheetPageAssem;
import com.ss.android.ugc.aweme.profile.widgets.qrcode.ProfileUserQrcodeEntranceAssem;
import com.ss.android.ugc.aweme.profile.widgets.recommend.UserProfileUserCardAssem;
import com.ss.android.ugc.aweme.profile.widgets.recommend.UserProfileUserCardVM;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideCardComponent;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS29S0001000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDaS484S0100000_4 extends C98T {
    public final int $t;
    public Object l0;

    @Override // X.C98T
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            case 4:
                LIZ$4(this, view);
                return;
            case 5:
                LIZ$5(this, view);
                return;
            case 6:
                LIZ$6(this, view);
                return;
            case 7:
                LIZ$7(this, view);
                return;
            case 8:
                LIZ$8(this, view);
                return;
            case 9:
                LIZ$9(this, view);
                return;
            case 10:
                LIZ$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LIZ$11(this, view);
                return;
            case 12:
                LIZ$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LIZ$13(this, view);
                return;
            case 14:
                LIZ$14(this, view);
                return;
            case 15:
                LIZ$15(this, view);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                LIZ$16(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS484S0100000_4(Object obj, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(IDaS484S0100000_4 iDaS484S0100000_4, View view) {
        MixVideoPlayDetailPageFragment mixVideoPlayDetailPageFragment;
        if (view != null) {
            Fragment fragment = ((PlaylistBottomBarComponent) iDaS484S0100000_4.l0).getPanelContext().LJ;
            if ((fragment instanceof MixVideoPlayDetailPageFragment) && (mixVideoPlayDetailPageFragment = (MixVideoPlayDetailPageFragment) fragment) != null) {
                mixVideoPlayDetailPageFragment.km();
            }
        }
    }

    public static final void LIZ$1(IDaS484S0100000_4 iDaS484S0100000_4, View view) {
        MusicMiniBarAssem musicMiniBarAssem;
        C240719cZ c240719cZ;
        if (view != null && (c240719cZ = (musicMiniBarAssem = (MusicMiniBarAssem) iDaS484S0100000_4.l0).LJLJL) != null) {
            musicMiniBarAssem.E3().gv0(c240719cZ, -1);
        }
    }

    public static final void LIZ$10(IDaS484S0100000_4 iDaS484S0100000_4, View view) {
        List gv0;
        if (view != null) {
            HighlightSelectListViewModel highlightSelectListViewModel = (HighlightSelectListViewModel) ((HighlightSelectMusicSimilarSoundsAssem) iDaS484S0100000_4.l0).LLFZ.getValue();
            C240719cZ item = (C240719cZ) C51029K0z.LJIILLIIL((HighlightSelectMusicSimilarSoundsAssem) iDaS484S0100000_4.l0);
            o.LJIIIZ(item, "item");
            if (item.LJLILLLLZI.LJLJJL) {
                gv0 = HighlightSelectListViewModel.gv0(highlightSelectListViewModel, null, null, item.LJLIL.getMusicId(), null, 11);
            } else {
                gv0 = HighlightSelectListViewModel.gv0(highlightSelectListViewModel, null, null, null, item.LJLIL.getMusicId(), 7);
            }
            highlightSelectListViewModel.listSetItems(gv0);
            HighlightSelectMusicSimilarSoundsAssem highlightSelectMusicSimilarSoundsAssem = (HighlightSelectMusicSimilarSoundsAssem) iDaS484S0100000_4.l0;
            C240719cZ c240719cZ = (C240719cZ) C51029K0z.LJIILLIIL(highlightSelectMusicSimilarSoundsAssem);
            HashMap hashMap = new HashMap();
            hashMap.put("music_id", c240719cZ.LJLIL.getMusicId());
            hashMap.put("song_number", String.valueOf(c240719cZ.LJLILLLLZI.LJLJJI));
            hashMap.put("to_user_id", highlightSelectMusicSimilarSoundsAssem.LLFII.getValue());
            FMX.LJIIL("similar_song_click", hashMap);
        }
    }

    public static final void LIZ$11(IDaS484S0100000_4 iDaS484S0100000_4, View view) {
        if (view != null) {
            ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((ProfileUserQrcodeEntranceAssem) iDaS484S0100000_4.l0);
            if (LJIIIIZZ != null) {
                ShareService shareService = C4LD.LIZ;
                o.LJIIIIZZ(shareService, "shareService()");
                shareService.LJFF(LJIIIIZZ, null, null, null);
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "personal_homepage");
            c188727au.LJIIIZ("enter_method", "personal_homepage_icon");
            FMX.LJIIL("enter_qr_code_page", c188727au.LIZ);
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", "personal_homepage");
            c188727au2.LJIIIZ("action_type", "click");
            FMX.LJIIL("qr_code_icon", c188727au2.LIZ);
        }
    }

    public static final void LIZ$12(IDaS484S0100000_4 iDaS484S0100000_4, View view) {
        if (view != null) {
            UserProfileUserCardVM O3 = ((UserProfileUserCardAssem) iDaS484S0100000_4.l0).O3();
            O3.getClass();
            O3.withState(new AqS170S0100000_4(O3, 989));
            C17J.LJJJ((UserProfileUserCardAssem) iDaS484S0100000_4.l0, false, "spread_follow");
        }
    }

    public static final void LIZ$13(IDaS484S0100000_4 iDaS484S0100000_4, View view) {
        L69 r4;
        if (view != null && (r4 = ((StoryGuideCardComponent) iDaS484S0100000_4.l0).r4()) != null) {
            EnumC53663L4h businessTag = EnumC53663L4h.STORY;
            L4T nodeType = L4T.RING;
            o.LJIIIZ(businessTag, "businessTag");
            o.LJIIIZ(nodeType, "nodeType");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(businessTag.getString());
            LIZ.append(nodeType.getString());
            LIZ.append("");
            View findViewById = r4.findViewById(X1D.LIZIZ(LIZ).hashCode());
            if (findViewById != null) {
                findViewById.performClick();
            }
        }
    }

    public static final void LIZ$14(IDaS484S0100000_4 iDaS484S0100000_4, View view) {
        InterfaceC27359AoV interfaceC27359AoV;
        if (view != null) {
            ((C27355AoR) iDaS484S0100000_4.l0).LIZ();
            Reference reference = ((C27355AoR) iDaS484S0100000_4.l0).LJIIIZ;
            if (reference != null && (interfaceC27359AoV = (InterfaceC27359AoV) reference.get()) != null) {
                interfaceC27359AoV.c7();
            }
        }
    }

    public static final void LIZ$15(IDaS484S0100000_4 iDaS484S0100000_4, View view) {
        if (view != null) {
            ((OfflineModeSheetPageAssem) iDaS484S0100000_4.l0).v3().qv0(null);
        }
    }

    public static final void LIZ$16(IDaS484S0100000_4 iDaS484S0100000_4, View view) {
        Context context;
        ActivityC45651qj LJJIFFI;
        IFriendsTabRouterAbility iFriendsTabRouterAbility;
        if (view != null && (context = ((View) iDaS484S0100000_4.l0).getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (iFriendsTabRouterAbility = (IFriendsTabRouterAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LJJIFFI, null), IFriendsTabRouterAbility.class, null)) != null) {
            iFriendsTabRouterAbility.O30();
        }
    }

    public static final void LIZ$2(IDaS484S0100000_4 iDaS484S0100000_4, View view) {
        MusicMiniBarAssem musicMiniBarAssem;
        C240719cZ c240719cZ;
        if (view != null && (c240719cZ = (musicMiniBarAssem = (MusicMiniBarAssem) iDaS484S0100000_4.l0).LJLJL) != null) {
            musicMiniBarAssem.E3().ov0(c240719cZ, -1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$3(IDaS484S0100000_4 iDaS484S0100000_4, View view) {
        MusicMiniBarAssem musicMiniBarAssem;
        C240719cZ c240719cZ;
        String str;
        if (view != null && (c240719cZ = (musicMiniBarAssem = (MusicMiniBarAssem) iDaS484S0100000_4.l0).LJLJL) != null) {
            OriginMusicListViewModel C3 = musicMiniBarAssem.C3();
            C3.getClass();
            List<InterfaceC57784Mm4> list = ((C239829b8) C3.getState()).LJLJJLL.LJLJJI;
            if (list != null) {
                Iterator<InterfaceC57784Mm4> it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InterfaceC57784Mm4 next = it.next();
                    if ((next instanceof C240719cZ) && o.LJ(next, c240719cZ)) {
                        if (i > 0) {
                            C3.setState(new AqS29S0001000_4(i, 25));
                            return;
                        }
                    } else {
                        i++;
                    }
                }
            }
            List<MusicGroup> list2 = C3.LJLJL;
            String musicId = c240719cZ.LJLIL.getMusicId();
            o.LJIIIIZZ(musicId, "item.musicModel.musicId");
            MusicGroup LJIIJJI = C1DJ.LJIIJJI(musicId, list2);
            if (LJIIJJI == null) {
                return;
            }
            Music sourceMusic = LJIIJJI.getSourceMusic();
            if (sourceMusic != null) {
                str = sourceMusic.getIdStr();
            } else {
                str = null;
            }
            List hv0 = OriginMusicListViewModel.hv0(C3, null, null, null, null, null, str, 31);
            C3.listSetItems(hv0);
            Iterator it2 = ((ArrayList) hv0).iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if ((next2 instanceof C240719cZ) && o.LJ(next2, c240719cZ)) {
                    if (i2 <= 0) {
                        return;
                    }
                    C3.setState(new AqS29S0001000_4(i2, 26));
                    return;
                }
                i2++;
            }
        }
    }

    public static final void LIZ$4(IDaS484S0100000_4 iDaS484S0100000_4, View view) {
        List hv0;
        if (view != null) {
            MusicCellSimilarSoundsAssem musicCellSimilarSoundsAssem = (MusicCellSimilarSoundsAssem) iDaS484S0100000_4.l0;
            OriginMusicListViewModel originMusicListViewModel = (OriginMusicListViewModel) musicCellSimilarSoundsAssem.LLFZ.LIZ(musicCellSimilarSoundsAssem, MusicCellSimilarSoundsAssem.LLI[0]);
            C240719cZ item = (C240719cZ) C51029K0z.LJIILLIIL((MusicCellSimilarSoundsAssem) iDaS484S0100000_4.l0);
            originMusicListViewModel.getClass();
            o.LJIIIZ(item, "item");
            if (item.LJLILLLLZI.LJLJJL) {
                hv0 = OriginMusicListViewModel.hv0(originMusicListViewModel, null, null, null, null, item.LJLIL.getMusicId(), null, 47);
            } else {
                hv0 = OriginMusicListViewModel.hv0(originMusicListViewModel, null, null, null, null, null, item.LJLIL.getMusicId(), 31);
            }
            originMusicListViewModel.listSetItems(hv0);
            MusicCellSimilarSoundsAssem musicCellSimilarSoundsAssem2 = (MusicCellSimilarSoundsAssem) iDaS484S0100000_4.l0;
            C240719cZ c240719cZ = (C240719cZ) C51029K0z.LJIILLIIL(musicCellSimilarSoundsAssem2);
            HashMap hashMap = new HashMap();
            hashMap.put("music_id", c240719cZ.LJLIL.getMusicId());
            hashMap.put("song_number", String.valueOf(c240719cZ.LJLILLLLZI.LJLJJI));
            hashMap.put("to_user_id", ((OriginMusicArg) musicCellSimilarSoundsAssem2.LLFII.getValue()).getUserId());
            FMX.LJIIL("similar_song_click", hashMap);
        }
    }

    public static final void LIZ$5(IDaS484S0100000_4 iDaS484S0100000_4, View view) {
        if (view != null) {
            ((ClaimStatusMusicAssem) iDaS484S0100000_4.l0).L3();
            ((ClaimStatusMusicAssem) iDaS484S0100000_4.l0).I3("later");
        }
    }

    public static final void LIZ$6(IDaS484S0100000_4 iDaS484S0100000_4, View view) {
        if (view != null) {
            ((GhostMusicAssem) iDaS484S0100000_4.l0).L3(true);
            ((GhostMusicAssem) iDaS484S0100000_4.l0).K3();
        }
    }

    public static final void LIZ$7(IDaS484S0100000_4 iDaS484S0100000_4, View view) {
        if (view != null) {
            ((GhostMusicAssem) iDaS484S0100000_4.l0).L3(false);
            ((GhostMusicAssem) iDaS484S0100000_4.l0).O3();
        }
    }

    public static final void LIZ$8(IDaS484S0100000_4 iDaS484S0100000_4, View view) {
        if (view != null) {
            HighlightSelectMusicBaseAssem highlightSelectMusicBaseAssem = (HighlightSelectMusicBaseAssem) iDaS484S0100000_4.l0;
            highlightSelectMusicBaseAssem.getClass();
            if (((C240719cZ) C51029K0z.LJIILLIIL(highlightSelectMusicBaseAssem)).LJLILLLLZI.LJLJI) {
                return;
            }
            if (((C240719cZ) C51029K0z.LJIILLIIL(highlightSelectMusicBaseAssem)).LJLILLLLZI.LJLJLJ) {
                HighlightSelectListViewModel highlightSelectListViewModel = (HighlightSelectListViewModel) highlightSelectMusicBaseAssem.LLFF.getValue();
                String musicId = ((C240719cZ) C51029K0z.LJIILLIIL(highlightSelectMusicBaseAssem)).LJLIL.getMusicId();
                o.LJIIIIZZ(musicId, "item.musicModel.musicId");
                highlightSelectListViewModel.listSetItems(HighlightSelectListViewModel.gv0(highlightSelectListViewModel, null, musicId, null, null, 13));
                return;
            }
            HighlightSelectListViewModel highlightSelectListViewModel2 = (HighlightSelectListViewModel) highlightSelectMusicBaseAssem.LLFF.getValue();
            String musicId2 = ((C240719cZ) C51029K0z.LJIILLIIL(highlightSelectMusicBaseAssem)).LJLIL.getMusicId();
            o.LJIIIIZZ(musicId2, "item.musicModel.musicId");
            highlightSelectListViewModel2.listSetItems(HighlightSelectListViewModel.gv0(highlightSelectListViewModel2, musicId2, null, null, null, 14));
        }
    }

    public static final void LIZ$9(IDaS484S0100000_4 iDaS484S0100000_4, View view) {
        if (view != null) {
            HighlightSelectMusicSelectIconAssem highlightSelectMusicSelectIconAssem = (HighlightSelectMusicSelectIconAssem) iDaS484S0100000_4.l0;
            highlightSelectMusicSelectIconAssem.getClass();
            if (((C240719cZ) C51029K0z.LJIILLIIL(highlightSelectMusicSelectIconAssem)).LJLILLLLZI.LJLJI) {
                return;
            }
            if (((C240719cZ) C51029K0z.LJIILLIIL(highlightSelectMusicSelectIconAssem)).LJLILLLLZI.LJLJLJ) {
                HighlightSelectListViewModel highlightSelectListViewModel = (HighlightSelectListViewModel) highlightSelectMusicSelectIconAssem.LLFZ.getValue();
                String musicId = ((C240719cZ) C51029K0z.LJIILLIIL(highlightSelectMusicSelectIconAssem)).LJLIL.getMusicId();
                o.LJIIIIZZ(musicId, "item.musicModel.musicId");
                highlightSelectListViewModel.listSetItems(HighlightSelectListViewModel.gv0(highlightSelectListViewModel, null, musicId, null, null, 13));
                return;
            }
            HighlightSelectListViewModel highlightSelectListViewModel2 = (HighlightSelectListViewModel) highlightSelectMusicSelectIconAssem.LLFZ.getValue();
            String musicId2 = ((C240719cZ) C51029K0z.LJIILLIIL(highlightSelectMusicSelectIconAssem)).LJLIL.getMusicId();
            o.LJIIIIZZ(musicId2, "item.musicModel.musicId");
            highlightSelectListViewModel2.listSetItems(HighlightSelectListViewModel.gv0(highlightSelectListViewModel2, musicId2, null, null, null, 14));
        }
    }
}
