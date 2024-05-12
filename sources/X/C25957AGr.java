package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterFragment;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AGr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25957AGr implements C44 {
    public final /* synthetic */ CreatorCenterFragment LIZ;

    public C25957AGr(CreatorCenterFragment creatorCenterFragment) {
        this.LIZ = creatorCenterFragment;
    }

    @Override // X.C44
    public final void onFailed(Throwable e) {
        o.LJIIIZ(e, "e");
        this.LIZ.vl();
        C73305Spp c73305Spp = this.LIZ.LJLJJLL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(8);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("check_status", "api_fail");
        FMX.LJIIL("cc_live_permission_api_check", c188727au.LIZ);
    }

    @Override // X.C44
    public final void LIZ(Boolean bool, C29180Bcm c29180Bcm, BUT but) {
        String str;
        if (o.LJ(bool, Boolean.TRUE)) {
            CreatorCenterFragment creatorCenterFragment = this.LIZ;
            creatorCenterFragment.getClass();
            ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
            o.LJIIIIZZ(LJJJLL, "get().getService(ILiveOuterService::class.java)");
            C86393XvR LJJIJIL = LJJJLL.LJJIJIL();
            if (LJJIJIL != null) {
                str = LJJIJIL.LJJLIIIJL();
            } else {
                str = null;
            }
            if (C78685UuP.LJJJZ(str)) {
                SparkContext sparkContext = new SparkContext();
                String LJJJ = LJJJLL.LJJJ(creatorCenterFragment.getContext(), UriProtector.parse(str).buildUpon().appendQueryParameter("enter_from", "creator_center").build());
                o.LJIIIIZZ(LJJJ, "liveOuterService.convert…creator_center\").build())");
                sparkContext.LJJIJLIJ(LJJJ);
                Fragment fragment = (Fragment) creatorCenterFragment.LJLILLLLZI.getValue();
                Bundle bundle = new Bundle();
                C117144ik.LIZIZ.getClass();
                C117144ik.LIZIZ(sparkContext);
                bundle.putString("SparkContextContainerId", sparkContext.containerId);
                fragment.setArguments(bundle);
            }
            CreatorCenterFragment creatorCenterFragment2 = this.LIZ;
            C25959AGt c25959AGt = new C25959AGt(creatorCenterFragment2, creatorCenterFragment2.getChildFragmentManager());
            ViewPager viewPager = this.LIZ.LJLJJL;
            if (viewPager != null) {
                viewPager.setAdapter(c25959AGt);
                CreatorCenterFragment creatorCenterFragment3 = this.LIZ;
                C74053T4n c74053T4n = creatorCenterFragment3.LJLJJI;
                if (c74053T4n != null) {
                    C74053T4n.LIZJ(c74053T4n, c74053T4n.LJII(), 0, false, 6);
                    C74053T4n c74053T4n2 = creatorCenterFragment3.LJLJJI;
                    if (c74053T4n2 != null) {
                        C74053T4n.LIZJ(c74053T4n2, c74053T4n2.LJII(), 0, false, 6);
                        C74053T4n c74053T4n3 = creatorCenterFragment3.LJLJJI;
                        if (c74053T4n3 != null) {
                            ViewPager viewPager2 = creatorCenterFragment3.LJLJJL;
                            if (viewPager2 != null) {
                                C74053T4n.LJIILJJIL(c74053T4n3, viewPager2);
                                C74053T4n c74053T4n4 = creatorCenterFragment3.LJLJJI;
                                if (c74053T4n4 != null) {
                                    c74053T4n4.LIZ(new C25958AGs(creatorCenterFragment3));
                                    C74053T4n c74053T4n5 = creatorCenterFragment3.LJLJJI;
                                    if (c74053T4n5 != null) {
                                        c74053T4n5.setHasStartFadingEdge(false);
                                        Context requireContext = creatorCenterFragment3.requireContext();
                                        o.LJIIIIZZ(requireContext, "requireContext()");
                                        Integer LJI = C79045V0n.LJI(R.attr.c9, requireContext);
                                        if (LJI != null) {
                                            int intValue = LJI.intValue();
                                            C74053T4n c74053T4n6 = creatorCenterFragment3.LJLJJI;
                                            if (c74053T4n6 != null) {
                                                c74053T4n6.setBackgroundColor(intValue);
                                            } else {
                                                o.LJIJI("tabBar");
                                                throw null;
                                            }
                                        }
                                        C74053T4n c74053T4n7 = creatorCenterFragment3.LJLJJI;
                                        if (c74053T4n7 != null) {
                                            c74053T4n7.setVisibility(0);
                                            C188727au c188727au = new C188727au();
                                            c188727au.LJIIIZ("tab_name", creatorCenterFragment3.LJLL.get(0));
                                            FMX.LJIIL("cc_live_permission_api_check", C44847Hit.LIZIZ("creator_center_tab_show", c188727au.LIZ, "check_status", "has_permission").LIZ);
                                        } else {
                                            o.LJIJI("tabBar");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("tabBar");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("tabBar");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("viewPager");
                                throw null;
                            }
                        } else {
                            o.LJIJI("tabBar");
                            throw null;
                        }
                    } else {
                        o.LJIJI("tabBar");
                        throw null;
                    }
                } else {
                    o.LJIJI("tabBar");
                    throw null;
                }
            } else {
                o.LJIJI("viewPager");
                throw null;
            }
        } else {
            this.LIZ.vl();
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("check_status", "no_permission");
            FMX.LJIIL("cc_live_permission_api_check", c188727au2.LIZ);
        }
        C73305Spp c73305Spp = this.LIZ.LJLJJLL;
        if (c73305Spp == null) {
            return;
        }
        c73305Spp.setVisibility(8);
    }
}
