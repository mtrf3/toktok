package Y;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C188727au;
import X.C200757uJ;
import X.C4LD;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56492MFc;
import X.C62381Oe1;
import X.C62399OeJ;
import X.C81074Vrq;
import X.C81075Vrr;
import X.C81078Vru;
import X.EnumC62459OfH;
import X.FMX;
import X.FWZ;
import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.presenter.MusicShareModel;
import com.ss.android.ugc.aweme.music.presenter.MusicSharePackageV2;
import com.ss.android.ugc.aweme.music.ui.MusicDetailAwemeListFragment;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDetailFragmentProvider;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDetailNavBarAssem;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivity;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ACListenerS32S0400000_10 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS32S0400000_10 aCListenerS32S0400000_10, View view) {
        MusicDetailFragmentProvider musicDetailFragmentProvider;
        MusicDetailAwemeListFragment YD;
        C56492MFc c56492MFc;
        MusicDetailFragmentProvider musicDetailFragmentProvider2;
        MusicDetailAwemeListFragment YD2;
        C56492MFc c56492MFc2;
        if (!MusicService.LJJLIIIJJI().LJJIL((MusicModel) aCListenerS32S0400000_10.l0, ((MusicDetailNavBarAssem.ShareMusicAction) aCListenerS32S0400000_10.l1).LIZIZ, true)) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("previous_page", "music_hot");
            c188727au.LJIIIZ("action_type", "share");
            c188727au.LJIIIZ("music_id", ((Music) aCListenerS32S0400000_10.l2).getMid());
            c188727au.LJIIIZ("enter_from", (String) ((MusicDetailNavBarAssem) aCListenerS32S0400000_10.l3).LJLLL.getValue());
            FMX.LJIIL("user_music_failed", c188727au.LIZ);
            return;
        }
        C16880lQ.LLLLLILLIL(((MusicDetailNavBarAssem.ShareMusicAction) aCListenerS32S0400000_10.l1).LIZIZ);
        FMX.LJII("click_share_button", 0L, "music_hot", ((Music) aCListenerS32S0400000_10.l2).getMid());
        C200757uJ c200757uJ = new C200757uJ();
        c200757uJ.LIZLLL = "music_hot";
        c200757uJ.LJJLIIJ = "music_hot";
        c200757uJ.LJJL = (String) ((MusicDetailNavBarAssem) aCListenerS32S0400000_10.l3).LJLLJ.getValue();
        c200757uJ.LJIILIIL();
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("song_id", ((MusicModel) aCListenerS32S0400000_10.l0).getMusicId());
        c188727au2.LJIIIZ("enter_from", "single_song");
        c188727au2.LJIIIZ("process_id", ((MusicDetailNavBarAssem) aCListenerS32S0400000_10.l3).N3());
        FMX.LJIIL("share_single_song", c188727au2.LIZ);
        SecApiImpl.LIZ().reportData(FWZ.MUSIC_SHARE.getReportName());
        if (((Music) aCListenerS32S0400000_10.l2).getShareInfo() != null) {
            List list = null;
            if (ShareExtServiceImpl.LJJLIIJ().LJJIFFI()) {
                Music music = (Music) aCListenerS32S0400000_10.l2;
                Fragment LJIIIZ = C55096Ljo.LJIIIZ((MusicDetailNavBarAssem) aCListenerS32S0400000_10.l3);
                if (LJIIIZ != null && (musicDetailFragmentProvider2 = (MusicDetailFragmentProvider) C55096Ljo.LIZ(C55230Lly.LIZJ(LJIIIZ, null), MusicDetailFragmentProvider.class, null)) != null && (YD2 = musicDetailFragmentProvider2.YD()) != null && (c56492MFc2 = YD2.LLD) != null) {
                    list = c56492MFc2.mmItems;
                }
                MusicSharePackageV2 musicSharePackageV2 = new MusicSharePackageV2(new C62399OeJ(new MusicShareModel(music, list, ((MusicDetailNavBarAssem) aCListenerS32S0400000_10.l3).N3()), ((MusicDetailNavBarAssem.ShareMusicAction) aCListenerS32S0400000_10.l1).LIZIZ).LJLLLLLL());
                ShareService shareService = C4LD.LIZ;
                o.LJIIIIZZ(shareService, "shareService()");
                shareService.LJJJJJL(((MusicDetailNavBarAssem.ShareMusicAction) aCListenerS32S0400000_10.l1).LIZIZ, musicSharePackageV2, EnumC62459OfH.SHARE_DEFAULT.getType());
                return;
            }
            ShareService shareService2 = C4LD.LIZ;
            ActivityC45651qj activityC45651qj = ((MusicDetailNavBarAssem.ShareMusicAction) aCListenerS32S0400000_10.l1).LIZIZ;
            Music music2 = (Music) aCListenerS32S0400000_10.l2;
            C62381Oe1 c62381Oe1 = new C62381Oe1(music2, (MusicDetailNavBarAssem) aCListenerS32S0400000_10.l3);
            Fragment LJIIIZ2 = C55096Ljo.LJIIIZ((MusicDetailNavBarAssem) aCListenerS32S0400000_10.l3);
            if (LJIIIZ2 != null && (musicDetailFragmentProvider = (MusicDetailFragmentProvider) C55096Ljo.LIZ(C55230Lly.LIZJ(LJIIIZ2, null), MusicDetailFragmentProvider.class, null)) != null && (YD = musicDetailFragmentProvider.YD()) != null && (c56492MFc = YD.LLD) != null) {
                list = c56492MFc.mmItems;
            }
            shareService2.LJIJJLI(activityC45651qj, music2, c62381Oe1, list, ((MusicDetailNavBarAssem) aCListenerS32S0400000_10.l3).N3());
        }
    }

    public static final void onClick$1(ACListenerS32S0400000_10 aCListenerS32S0400000_10, View view) {
        ArrayList arrayList = (ArrayList) ((PoiGalleryActivity) aCListenerS32S0400000_10.l0).LJLJI.getValue();
        C81075Vrr c81075Vrr = ((PoiGalleryActivity) aCListenerS32S0400000_10.l0).LJLJJI;
        if (c81075Vrr != null) {
            if (C81074Vrq.LIZIZ(c81075Vrr.LJLJJLL, arrayList)) {
                C81075Vrr c81075Vrr2 = ((PoiGalleryActivity) aCListenerS32S0400000_10.l0).LJLJJI;
                if (c81075Vrr2 != null) {
                    if (c81075Vrr2.LJLJL != null) {
                        Context context = view.getContext();
                        o.LJIIIIZZ(context, "it.context");
                        View view2 = (View) aCListenerS32S0400000_10.l1;
                        ArrayList arrayList2 = (ArrayList) ((PoiGalleryActivity) aCListenerS32S0400000_10.l0).LJLJI.getValue();
                        if (arrayList2 == null) {
                            return;
                        }
                        C81075Vrr c81075Vrr3 = ((PoiGalleryActivity) aCListenerS32S0400000_10.l0).LJLJJI;
                        if (c81075Vrr3 != null) {
                            C81078Vru c81078Vru = c81075Vrr3.LJLJL;
                            if (c81078Vru == null) {
                                return;
                            }
                            C81074Vrq.LIZ(context, view2, arrayList2, c81078Vru, c81075Vrr3.LJLJJLL);
                            return;
                        }
                        o.LJIJI("pageAdapter");
                        throw null;
                    }
                } else {
                    o.LJIJI("pageAdapter");
                    throw null;
                }
            }
            FrameLayout navBar = (FrameLayout) aCListenerS32S0400000_10.l2;
            o.LJIIIIZZ(navBar, "navBar");
            View background = (View) aCListenerS32S0400000_10.l1;
            o.LJIIIIZZ(background, "background");
            ViewPager pager = (ViewPager) aCListenerS32S0400000_10.l3;
            o.LJIIIIZZ(pager, "pager");
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setDuration(200L);
            alphaAnimation.setStartOffset(100L);
            navBar.startAnimation(alphaAnimation);
            background.startAnimation(alphaAnimation);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setFillAfter(true);
            alphaAnimation2.setDuration(200L);
            pager.startAnimation(alphaAnimation2);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f);
            scaleAnimation.setFillAfter(true);
            scaleAnimation.setDuration(200L);
            pager.startAnimation(scaleAnimation);
            ((PoiGalleryActivity) aCListenerS32S0400000_10.l0).finish();
            return;
        }
        o.LJIJI("pageAdapter");
        throw null;
    }

    public ACListenerS32S0400000_10(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
