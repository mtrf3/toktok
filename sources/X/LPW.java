package X;

import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.SelectedTabBackToOriginAbility;
import com.ss.android.ugc.aweme.main.assems.ui.HomepageViewPagerAssem;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class LPW implements C0C3 {
    public final /* synthetic */ HomepageViewPagerAssem LJLIL;
    public final /* synthetic */ ActivityC45651qj LJLILLLLZI;
    public final /* synthetic */ ScrollSwitchStateManager LJLJI;
    public final /* synthetic */ InterfaceC54132LMi LJLJJI;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        C84193Sd.LIZ(this.LJLILLLLZI).LJLJLLL.setValue(Integer.valueOf(i));
        SelectedTabBackToOriginAbility selectedTabBackToOriginAbility = (SelectedTabBackToOriginAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(this.LJLILLLLZI, null), SelectedTabBackToOriginAbility.class, null);
        if (selectedTabBackToOriginAbility != null) {
            selectedTabBackToOriginAbility.EH();
        }
        if (i == 0) {
            HomepageViewPagerAssem homepageViewPagerAssem = this.LJLIL;
            homepageViewPagerAssem.LJLJI = false;
            homepageViewPagerAssem.LJLILLLLZI = false;
        }
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        int doubleValue;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        Object obj;
        String str;
        int i7;
        String groupId;
        C84193Sd.LIZ(this.LJLILLLLZI).LJLJLJ.setValue(Integer.valueOf(i));
        Bundle bundle = new Bundle();
        bundle.putString("fromStart", "RootNode");
        com.bytedance.hox.Hox.LJLLI.LIZ(this.LJLILLLLZI).iv0(i, "RootNode", bundle);
        this.LJLJJI.e(i, false);
        HomePageDataViewModel LIZ = C3SZ.LIZ(this.LJLILLLLZI);
        if (i == 1) {
            C225318sp.LIZJ(this.LJLILLLLZI, "enter_profile", LSC.FEED, LIZ.LJLJLLL);
        }
        String hv0 = C84193Sd.LIZ(this.LJLILLLLZI).hv0();
        Aweme aweme = LIZ.LJLJLLL;
        String eventType = LIZ.getEventType();
        JSONObject jSONObject = LPX.LJFF;
        try {
            if (LPO.LIZ() && o.LJ(hv0, "page_profile") && jSONObject != null) {
                if (!jSONObject.has("downX")) {
                    doubleValue = 0;
                } else {
                    Object obj2 = jSONObject.get("downX");
                    o.LJII(obj2, "null cannot be cast to non-null type kotlin.Double");
                    doubleValue = (int) ((Double) obj2).doubleValue();
                }
                if (jSONObject.has("downY")) {
                    Object obj3 = jSONObject.get("downY");
                    o.LJII(obj3, "null cannot be cast to non-null type kotlin.Double");
                    i2 = (int) ((Double) obj3).doubleValue();
                } else {
                    i2 = 0;
                }
                if (jSONObject.has("upX")) {
                    Object obj4 = jSONObject.get("upX");
                    o.LJII(obj4, "null cannot be cast to non-null type kotlin.Double");
                    i3 = (int) ((Double) obj4).doubleValue();
                } else {
                    i3 = 0;
                }
                if (jSONObject.has("downY")) {
                    Object obj5 = jSONObject.get("upY");
                    o.LJII(obj5, "null cannot be cast to non-null type kotlin.Double");
                    i4 = (int) ((Double) obj5).doubleValue();
                } else {
                    i4 = 0;
                }
                if ((doubleValue != 0 || i2 != 0 || i3 != 0 || i4 != 0) && LPX.LIZLLL != doubleValue && LPX.LJ != i2) {
                    LPX.LIZLLL = doubleValue;
                    LPX.LJ = i2;
                    int i8 = LPX.LIZIZ;
                    int i9 = 2;
                    if (doubleValue > i8 / 2) {
                        i5 = 2;
                    } else {
                        i5 = 1;
                    }
                    if (i3 <= i8 / 2) {
                        i9 = 1;
                    }
                    if (i5 == i9) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (LPX.LIZ()) {
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("type", "scroll_to_profile");
                        c188727au.LIZLLL((doubleValue * 100) / i8, "x");
                        int i10 = LPX.LIZJ;
                        c188727au.LIZLLL((i2 * 100) / i10, "y");
                        c188727au.LIZLLL(((i3 - doubleValue) * 100) / i8, "dx");
                        c188727au.LIZLLL(((i4 - i2) * 100) / i10, "dy");
                        if (!z) {
                            i9 = 0;
                        }
                        c188727au.LIZLLL(i9, "side");
                        if (LPX.LIZIZ()) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        c188727au.LIZLLL(i6, "rtl");
                        String str2 = "";
                        if (eventType == null) {
                            eventType = "";
                        }
                        c188727au.LJIIIZ("enter_from", eventType);
                        if (aweme == null) {
                            obj = "";
                        } else {
                            obj = Integer.valueOf(aweme.getAwemeType());
                        }
                        c188727au.LJFF(obj, "aweme_type");
                        if (aweme != null) {
                            str = aweme.getAuthorUid();
                            if (str == null) {
                            }
                            c188727au.LJIIIZ("author_id", str);
                            if (aweme != null && (groupId = aweme.getGroupId()) != null) {
                                str2 = groupId;
                            }
                            c188727au.LJIIIZ("group_id", str2);
                            if (aweme == null && aweme.isAd() && aweme.getAwemeType() == 0) {
                                i7 = 1;
                            } else {
                                i7 = 0;
                            }
                            c188727au.LIZLLL(i7, "is_ads");
                            FMX.LJIIL("event_hot_area", c188727au.LIZ);
                        }
                        str = "";
                        c188727au.LJIIIZ("author_id", str);
                        if (aweme != null) {
                            str2 = groupId;
                        }
                        c188727au.LJIIIZ("group_id", str2);
                        if (aweme == null) {
                        }
                        i7 = 0;
                        c188727au.LIZLLL(i7, "is_ads");
                        FMX.LJIIL("event_hot_area", c188727au.LIZ);
                    }
                    Keva keva = LPX.LIZ;
                    keva.storeInt("scroll_to_profile", keva.getInt("scroll_to_profile", 0) + 1);
                    keva.storeLong("scroll_to_profile_time", System.currentTimeMillis());
                }
            }
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
        C221008ls.LIZIZ(C3SZ.LIZ(this.LJLILLLLZI).LJLJLLL);
        AbstractC48820JEa LIZIZ = C224888s8.LIZIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("position:");
        LIZ2.append(i);
        LIZIZ.LJ("HomepageViewPagerAssem", X1D.LIZIZ(LIZ2));
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        if (!this.LJLIL.LJLILLLLZI) {
            C84193Sd.LIZ(this.LJLILLLLZI).sv0(f, i, i2);
            this.LJLIL.LJLILLLLZI = true;
        }
        if (i == this.LJLJI.nv0("page_feed")) {
            HomepageViewPagerAssem homepageViewPagerAssem = this.LJLIL;
            if (!homepageViewPagerAssem.LJLJI) {
                homepageViewPagerAssem.LJLJI = true;
                C2U8.LIZ(new C46141I8z());
            }
        }
    }

    public LPW(HomepageViewPagerAssem homepageViewPagerAssem, ActivityC45651qj activityC45651qj, ScrollSwitchStateManager scrollSwitchStateManager, InterfaceC54132LMi interfaceC54132LMi) {
        this.LJLIL = homepageViewPagerAssem;
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = scrollSwitchStateManager;
        this.LJLJJI = interfaceC54132LMi;
    }
}
