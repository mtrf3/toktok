package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.mvtemplate.impl.MovieReuseServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.CommercePermissionStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.setting.IPromoteEntryCheckService;
import com.ss.android.ugc.aweme.setting.PromoteEntryCheckServiceImpl;
import com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.ss.android.ugc.aweme.share.improve.channel.SubscribeInviteChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveSubscribeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.tools.detail.IMovieReuseService;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class OVQ implements ShareDependService {
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C109324Qu.LJLIL);

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public boolean LJII() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public void LJIL(Context context, Aweme aweme, String str, String enterFrom, String str2, String str3) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final boolean LJIILJJIL() {
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null) {
            return false;
        }
        if ((LJIIIIZZ instanceof MainActivity) && C54153LNd.LIZ((ActivityC45651qj) LJIIIIZZ)) {
            MainActivity mainActivity = (MainActivity) LJIIIIZZ;
            if (mainActivity.getCurFragment() != null && (mainActivity.getCurFragment() instanceof InterfaceC54054LJi)) {
                InterfaceC36571c5 curFragment = mainActivity.getCurFragment();
                o.LJII(curFragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.IMainFragment");
                if (((InterfaceC54054LJi) curFragment).lj() && !((RBX) HG3.LJIILL()).isLogin()) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return LJIIIIZZ instanceof DetailActivity;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final SubscribeInviteChannel LIZLLL(LiveSubscribeSharePackage liveSubscribeSharePackage) {
        return new SubscribeInviteChannel(liveSubscribeSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIIJ(boolean z) {
        FullFeedFragmentPanel.LLIILII = z;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIIL(C188727au c188727au) {
        FMX.LJIIL("download", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final int LJIILL(Aweme aweme) {
        CommercePermissionStruct commercePermission;
        o.LJIIIZ(aweme, "aweme");
        User author = aweme.getAuthor();
        if (author == null || !HG3.LJIILL().isMe(author.getUid()) || (commercePermission = HG3.LJIILL().getCurUser().getCommercePermission()) == null || commercePermission.topItem != 1) {
            return 0;
        }
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final C44423Hc3 LJJIIZ(User user) {
        o.LJIIIZ(user, "user");
        return new C44423Hc3(user);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final boolean LJJIJLIJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        if (aweme.getAuthor() == null || !TextUtils.equals(aweme.getAuthorUid(), HG3.LJIILL().getCurUserId())) {
            return false;
        }
        if (HG3.LJIILL().getCurUser().getCommerceUserLevel() == 0 && aweme.getAuthor() != null && aweme.getAuthor().getCommerceUserLevel() == 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIILLIIL(String str, BaseSharePackage sharePackage) {
        AwemeRawAd awemeRawAd;
        o.LJIIIZ(sharePackage, "sharePackage");
        if (!C52230Keg.LIZ()) {
            return;
        }
        Aweme o6 = AwemeService.LIZ().o6(str);
        if (o6 != null) {
            awemeRawAd = o6.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL("landing_ad", "share", awemeRawAd);
        LIZLLL.LIZIZ(C16880lQ.LLJJIII(sharePackage.extras, "current_url"), "url");
        LIZLLL.LIZIZ(C16880lQ.LLJJIII(sharePackage.extras, "first_page"), "first_page");
        LIZLLL.LIZIZ(C16880lQ.LLJJIII(sharePackage.extras, "shareIdList"), "share_uid");
        LIZLLL.LJI();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIJI(Context context, boolean z) {
        o.LJIIIZ(context, "context");
        ((OVU) C63081OpJ.LJJJJJ(context, OVU.class)).LIZ(z);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIJJLI(Context context, String str) {
        AwemeRawAd awemeRawAd;
        if (C52230Keg.LIZ()) {
            return;
        }
        Aweme o6 = AwemeService.LIZ().o6(str);
        NN1.LJJJIL(context, "share", o6, NN1.LJIIIZ(context, o6));
        if (o6 != null) {
            awemeRawAd = o6.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C0DC.LIZJ(o6, C58704N2e.LIZLLL("landing_ad", "share", awemeRawAd), "anchor_id", o6, "room_id");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L11;
     */
    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(android.app.Activity r6, com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            r5 = this;
            java.lang.String r0 = "aweme"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            X.OW6 r3 = new X.OW6
            r3.<init>(r6)
            android.app.Activity r1 = r3.LIZIZ
            java.lang.String r0 = r7.getAid()
            boolean r0 = X.C62011OVj.LJIILIIL(r1, r7, r0)
            if (r0 == 0) goto L17
        L16:
            return
        L17:
            android.app.Activity r0 = r3.LIZIZ
            r4 = 0
            if (r0 == 0) goto L41
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L41
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> L2a
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L2a
            if (r0 != 0) goto L41
        L2a:
            X.5S1 r2 = new X.5S1
            android.app.Activity r0 = r3.LIZIZ
            r2.<init>(r0)
            android.app.Activity r1 = r3.LIZIZ
            r0 = 2131844121(0x7f115c19, float:1.9321626E38)
            java.lang.String r0 = r1.getString(r0)
            r2.LIZLLL(r0)
            r2.LJ()
            goto L16
        L41:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r7.getVideo()
            if (r0 == 0) goto L16
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r0.getCover()
            if (r2 != 0) goto L4e
            goto L16
        L4e:
            android.app.Activity r0 = r3.LIZIZ
            if (r0 == 0) goto L7e
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L7e
            android.app.Activity r1 = r3.LIZIZ
            r0 = 2131832317(0x7f112dfd, float:1.9297684E38)
            java.lang.String r1 = r1.getString(r0)
        L61:
            X.Gy5 r0 = r3.LIZJ
            if (r0 != 0) goto L70
            android.app.Activity r0 = r3.LIZIZ
            X.Gy5 r0 = X.ProgressDialogC43241Gy5.LIZIZ(r0, r1)
            r3.LIZJ = r0
            r0.setIndeterminate(r4)
        L70:
            X.Gy5 r0 = r3.LIZJ
            r0.setProgress(r4)
            X.OVV r0 = new X.OVV
            r0.<init>(r3, r7)
            X.C78765Uvh.LJIILL(r2, r0)
            goto L16
        L7e:
            java.lang.String r1 = ""
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OVQ.LJJIIJZLJL(android.app.Activity, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJJIJ(Context context, Aweme aweme) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        Intent intent = new Intent(context, (Class<?>) AdSettingsActivity.class);
        intent.putExtra("id", aweme.getAid());
        AdSettingsActivity.LJLL = aweme;
        C16880lQ.LIZJ(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final ImChannel LJJIJIIJI(SharePackage awemePackage, String enterFrom) {
        o.LJIIIZ(awemePackage, "awemePackage");
        o.LJIIIZ(enterFrom, "enterFrom");
        return new ImChannel(awemePackage, enterFrom);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJJIJL(Context context, String awemeInsightUrl) {
        o.LJIIIZ(awemeInsightUrl, "awemeInsightUrl");
        o.LJIIIZ(context, "context");
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_type", "analytics");
        C59974NgI.LIZ(context, awemeInsightUrl, hashMap, C113554cx.LJJJLIIL());
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final C76L LIZ(String str, long j, String str2) {
        IPromoteEntryCheckService iPromoteEntryCheckService;
        Object LIZ = C58096Mr6.LIZ(IPromoteEntryCheckService.class, false);
        if (LIZ != null) {
            iPromoteEntryCheckService = (IPromoteEntryCheckService) LIZ;
        } else {
            if (C58096Mr6.s6 == null) {
                synchronized (IPromoteEntryCheckService.class) {
                    if (C58096Mr6.s6 == null) {
                        C58096Mr6.s6 = new PromoteEntryCheckServiceImpl();
                    }
                }
            }
            iPromoteEntryCheckService = C58096Mr6.s6;
        }
        return iPromoteEntryCheckService.LIZ(str, j, str2);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LIZJ(String str, String str2, String str3) {
        new C44065HRd();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("author_id", str2);
        c188727au.LJIIIZ("group_id", str3);
        FMX.LJIIL("stitch_button_show", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final DialogC109334Qv LJI(Activity activity, C62387Oe7 c62387Oe7, int i) {
        o.LJIIIZ(activity, "activity");
        return new DialogC109334Qv(activity, c62387Oe7, i);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIIJJI(Context context, Aweme aweme, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        if (C52230Keg.LIZ()) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("landing_ad", "copy", aweme.getAwemeRawAd());
            LIZLLL.LIZIZ(C16880lQ.LLJJIII(sharePackage.extras, "current_url"), "url");
            LIZLLL.LIZIZ(C16880lQ.LLJJIII(sharePackage.extras, "first_page"), "first_page");
            LIZLLL.LJI();
            return;
        }
        NN1.LJJJIL(context, "copy", aweme, NN1.LJIIIZ(context, aweme));
        C58704N2e.LIZLLL("landing_ad", "copy", aweme.getAwemeRawAd()).LJII();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIILIIL(String str, String str2, String str3) {
        new C44066HRe();
        C188727au c188727au = new C188727au();
        c188727au.LJI("enter_from", str);
        c188727au.LJI("author_id", str2);
        c188727au.LJI("group_id", str3);
        AVExternalServiceImpl.LIZ().getAVMobService().onEventV3("duet_button_click", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIIZILJ(String str, String str2, String str3) {
        new C44066HRe();
        C188727au c188727au = new C188727au();
        c188727au.LJI("enter_from", str);
        c188727au.LJI("author_id", str2);
        c188727au.LJI("group_id", str3);
        AVExternalServiceImpl.LIZ().getAVMobService().onEventV3("duet_button_show", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJJIFFI(Context context, Aweme aweme, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        if (!C52230Keg.LIZ()) {
            return;
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL("landing_ad", "refresh", aweme.getAwemeRawAd());
        LIZLLL.LIZIZ(C16880lQ.LLJJIII(sharePackage.extras, "current_url"), "url");
        LIZLLL.LIZIZ(C16880lQ.LLJJIII(sharePackage.extras, "first_page"), "first_page");
        LIZLLL.LJI();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJJII(Context context, Aweme aweme, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        if (C52230Keg.LIZ()) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("landing_ad", "report", aweme.getAwemeRawAd());
            LIZLLL.LIZIZ(C16880lQ.LLJJIII(sharePackage.extras, "current_url"), "url");
            LIZLLL.LIZIZ(C16880lQ.LLJJIII(sharePackage.extras, "first_page"), "first_page");
            LIZLLL.LJI();
            return;
        }
        NN1.LJJJIL(context, "report", aweme, NN1.LJIIIZ(context, aweme));
        C58704N2e.LIZLLL("landing_ad", "report", aweme.getAwemeRawAd()).LJII();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJJIII(Context context, Aweme aweme, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        if (C52230Keg.LIZ()) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("landing_ad", "open_url_h5", aweme.getAwemeRawAd());
            LIZLLL.LIZIZ(C16880lQ.LLJJIII(sharePackage.extras, "current_url"), "url");
            LIZLLL.LIZIZ(C16880lQ.LLJJIII(sharePackage.extras, "first_page"), "first_page");
            LIZLLL.LJI();
            return;
        }
        NN1.LJJJIL(context, "open_url_h5", aweme, NN1.LJIIIZ(context, aweme));
        C58704N2e.LIZLLL("landing_ad", "open_url_h5", aweme.getAwemeRawAd()).LJII();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final String LJJIIZI(int i, String str, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return Z8A.LIZIZ.LIZ.disLikeAweme(aweme, i, str);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LIZIZ(Aweme aweme, Activity activity, String enterFrom, String panelSource) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(panelSource, "panelSource");
        new C44065HRd().LIZJ(aweme, activity, enterFrom, panelSource, true);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJIIIZ(Context context, String str, int i, int i2) {
        o.LJIIIZ(context, "context");
        IMovieReuseService LJ = MovieReuseServiceImpl.LJ();
        IMovieReuseService.LIZ.getClass();
        LJ.LIZLLL(context, 2, str, Integer.valueOf(i), null, null, i2, true);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final TuxSheet LJJIIJ(Activity originActivity, C62387Oe7 config, Bundle bundle, boolean z) {
        ActivityC45651qj activityC45651qj;
        Object obj;
        boolean z2;
        View view;
        boolean z3;
        OVR ovr;
        List<InterfaceC62480Ofc> list;
        OVR ovr2;
        o.LJIIIZ(originActivity, "originActivity");
        o.LJIIIZ(config, "config");
        if (!(originActivity instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) originActivity) == null) {
            return null;
        }
        Object[] objArr = new Object[3];
        boolean z4 = false;
        objArr[0] = activityC45651qj;
        if (bundle == null || (obj = C16880lQ.LLJJIII(bundle, "enter_method")) == null) {
            obj = "share_panel";
        }
        objArr[1] = obj;
        if (config.LJJIIZ && config.LJJIIZI != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        objArr[2] = Boolean.valueOf(z2);
        int LIZ = C53796L9k.LIZ(objArr);
        LinkedHashMap linkedHashMap = (LinkedHashMap) C53796L9k.LIZ;
        SoftReference softReference = (SoftReference) linkedHashMap.get(Integer.valueOf(LIZ));
        if (softReference != null && (ovr2 = (OVR) softReference.get()) != null) {
            view = ovr2.LJLIL;
        } else {
            view = null;
        }
        if (z && OVS.LIZ()) {
            SystemClock.elapsedRealtime();
            if (!C78966Uyw.LJJIJ().LIZIZ() && config.LJIIJJI) {
                z3 = true;
            } else {
                z3 = false;
            }
            ArrayList arrayList = new ArrayList();
            if (z3) {
                arrayList.add(EnumC110664Vy.IM_HEADER);
            }
            if (config.LJFF) {
                ORS.LJJLIL(new AqS167S0100000_1(activityC45651qj, 194), config.LIZ);
            }
            List<InterfaceC62225ObV> list2 = config.LIZ;
            if (list2 != null && !list2.isEmpty() && !config.LJ) {
                arrayList.add(EnumC110664Vy.CHANNEL_BAR);
            }
            List<InterfaceC62486Ofi> list3 = config.LIZJ;
            if (list3 != null && !list3.isEmpty() && !config.LJIJI) {
                arrayList.add(EnumC110664Vy.ACTION_BAR);
            }
            SoftReference softReference2 = (SoftReference) linkedHashMap.get(Integer.valueOf(LIZ));
            if (softReference2 != null && (ovr = (OVR) softReference2.get()) != null && (list = ovr.LJLILLLLZI) != null) {
                Iterator<InterfaceC62480Ofc> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!arrayList.contains(it.next().getWidgetType())) {
                            break;
                        }
                    } else if (list.size() == arrayList.size() && view != null) {
                        z4 = true;
                    }
                }
            }
            SkeletonSharePanelFragment skeletonSharePanelFragment = new SkeletonSharePanelFragment();
            skeletonSharePanelFragment.setArguments(bundle);
            LJJIL(skeletonSharePanelFragment, bundle, config, !z4);
            ((RBX) HG3.LJIILL()).isLogin();
            TuxSheet xl = skeletonSharePanelFragment.xl(config, activityC45651qj, view, true);
            SystemClock.elapsedRealtime();
            return xl;
        }
        SkeletonSharePanelFragment skeletonSharePanelFragment2 = new SkeletonSharePanelFragment();
        skeletonSharePanelFragment2.setArguments(bundle);
        LJJIL(skeletonSharePanelFragment2, bundle, config, true);
        ((RBX) HG3.LJIILL()).isLogin();
        return skeletonSharePanelFragment2.xl(config, activityC45651qj, null, false);
    }

    public final void LJJIL(SkeletonSharePanelFragment skeletonSharePanelFragment, Bundle bundle, C62387Oe7 c62387Oe7, boolean z) {
        String str;
        String str2;
        c62387Oe7.LJIL = C78966Uyw.LJJIJ().LIZIZ();
        if (bundle == null || (str = bundle.getString("enter_method")) == null) {
            str = "share_panel";
        }
        Bundle bundle2 = c62387Oe7.LJIIJ.extras;
        if (!bundle2.containsKey("panel_source")) {
            bundle2.putString("panel_source", str);
        }
        if (!c62387Oe7.LJIL && c62387Oe7.LJIIJJI) {
            if (bundle == null || (str2 = bundle.getString("enter_from")) == null) {
                str2 = "";
            }
            if (z) {
                C108834Ox widget = IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIJJI(str2, str);
                o.LJIIIZ(widget, "widget");
                ((ArrayList) skeletonSharePanelFragment.LJLIL).add(widget);
                skeletonSharePanelFragment.LLI = true;
            }
            C109314Qt action = C109314Qt.LJLIL;
            o.LJIIIZ(action, "action");
            skeletonSharePanelFragment.LLFFF = action;
            skeletonSharePanelFragment.LLFII = new AqS167S0100000_1(this, 195);
        }
        List<InterfaceC62225ObV> list = c62387Oe7.LIZ;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC62225ObV interfaceC62225ObV : list) {
            if (interfaceC62225ObV instanceof ImChannel) {
                arrayList.add(interfaceC62225ObV);
            }
        }
        if (arrayList.size() == 1) {
            Object obj = ListProtector.get(arrayList, 0);
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.share.improve.channel.ImChannel");
            ImChannel imChannel = (ImChannel) obj;
            if (imChannel != null) {
                if (C78966Uyw.LJJIJ().LIZIZ() && ((RBX) HG3.LJIILL()).isLogin()) {
                    c62387Oe7.LIZ.remove(imChannel);
                }
                imChannel.LJLJJI = c62387Oe7.LJIILJJIL;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJJIJIIJIL(Context context, Aweme aweme, boolean z, ArrayList arrayList, int i, boolean z2, String buttonMethod) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(buttonMethod, "buttonMethod");
        MBR mbr = new MBR();
        mbr.LJIIJJI = Integer.valueOf(i);
        if (aweme.getMusic() != null) {
            Music music = aweme.getMusic();
            o.LJIIIIZZ(music, "aweme.music");
            mbr.LIZJ = music;
        }
        if (z) {
            mbr.LIZIZ = "green_screen";
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            mbr.LJ = aid;
        } else {
            mbr.LIZLLL = "prop_auto";
        }
        mbr.LJI = "prop_reuse";
        mbr.LJII = buttonMethod;
        mbr.LJIILL = true;
        PropReuseServiceImpl.LJIIJ().LJFF(context, arrayList, mbr.LIZ(), z2);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void LJJIJIL(String str, Aweme aweme, Activity activity, String enterFrom, java.util.Map<String, String> map, boolean z, boolean z2) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(enterFrom, "enterFrom");
        C44066HRe c44066HRe = new C44066HRe();
        c44066HRe.LIZIZ = str;
        c44066HRe.LIZJ = map;
        c44066HRe.LJIIZILJ = z;
        c44066HRe.LJJIFFI = z2;
        c44066HRe.LIZIZ(activity, aweme, enterFrom);
    }
}
