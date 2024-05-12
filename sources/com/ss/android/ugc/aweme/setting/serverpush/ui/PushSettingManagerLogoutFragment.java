package com.ss.android.ugc.aweme.setting.serverpush.ui;

import X.AD3;
import X.AD4;
import X.AEB;
import X.AEG;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C235119Kp;
import X.C252709vu;
import X.C25848ACm;
import X.C25851ACp;
import X.C29S;
import X.C3C5;
import X.C40322Fs6;
import X.C5S1;
import X.C62822Ol8;
import X.C76800UCe;
import X.C78598Ut0;
import X.C78840Uwu;
import X.C85894XnO;
import X.C85915Xnj;
import X.C85926Xnu;
import X.C85938Xo6;
import X.C85939Xo7;
import X.C85942XoA;
import X.C85943XoB;
import X.C85944XoC;
import X.C85945XoD;
import X.C90903hW;
import X.EF7;
import X.FMX;
import X.InterfaceC85902XnW;
import X.InterfaceC85916Xnk;
import X.J89;
import X.J8A;
import Y.ACListenerS24S0100000_4;
import Y.ACListenerS49S0200000_15;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.setting.serverpush.model.NotificationSettings;
import com.ss.android.ugc.aweme.setting.serverpush.model.NotificationSettingsInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS29S0001000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PushSettingManagerLogoutFragment extends AmeBaseFragment implements InterfaceC85902XnW, InterfaceC85916Xnk {
    public static NotificationSettings LJZ;
    public C252709vu LJLIL;
    public AD4 LJLILLLLZI;
    public C85938Xo6 LJLJI;
    public C85938Xo6 LJLJJI;
    public C85894XnO LJLJJL;
    public C85915Xnj LJLJJLL;
    public AEG LJLJL;
    public AEG LJLJLJ;
    public C85938Xo6 LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public NotificationSettings LJLLL;
    public Keva LJLLLLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();
    public final List<C85938Xo6> LJLJLLL = new ArrayList();
    public final List<Runnable> LJLLJ = new ArrayList();
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 811));

    public final void Al() {
        Iterator it = ((ArrayList) this.LJLLJ).iterator();
        while (it.hasNext()) {
            Runnable runnable = (Runnable) it.next();
            runnable.run();
            ((ArrayList) this.LJLLJ).remove(runnable);
        }
    }

    @Override // X.InterfaceC85916Xnk
    public final void fd0() {
        C5S1 c5s1 = new C5S1(EF7.LIZIZ());
        c5s1.LIZJ(R.string.im9);
        c5s1.LJ();
        this.LJLLI = false;
        C85938Xo6 c85938Xo6 = this.LJLL;
        if (c85938Xo6 != null) {
            c85938Xo6.LJIIJ(J89.LJLIL);
            String str = c85938Xo6.LJLJJLL;
            o.LJII(str, "null cannot be cast to non-null type kotlin.String");
            Dl(c85938Xo6.LJFF().LJZI ? 1 : 0, str);
        }
    }

    public final Keva vl() {
        if (this.LJLLLLLL == null) {
            this.LJLLLLLL = Keva.getRepo("push_logout");
        }
        Keva keva = this.LJLLLLLL;
        o.LJI(keva);
        return keva;
    }

    public final C25851ACp wl() {
        return (C25851ACp) this.LJLLLL.getValue();
    }

    public final void Gl() {
        String string;
        if (C40322Fs6.LIZJ(getContext())) {
            string = getString(R.string.r13);
            o.LJIIIIZZ(string, "getString(R.string.settings_push_notifications_on)");
            AD4 ad4 = this.LJLILLLLZI;
            if (ad4 != null) {
                ad4.LJIIJ(new AqS29S0001000_4(8, 10));
            }
            AEG aeg = this.LJLJL;
            if (aeg != null) {
                aeg.LJIIJ(C85942XoA.LJLIL);
            }
            AEG aeg2 = this.LJLJLJ;
            if (aeg2 != null) {
                aeg2.LJIIJ(C85943XoB.LJLIL);
            }
        } else {
            string = getString(R.string.r12);
            o.LJIIIIZZ(string, "getString(R.string.setti…s_push_notifications_off)");
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("status", "off");
            FMX.LJIIL("notifications_show", c188727au.LIZ);
            AD4 ad42 = this.LJLILLLLZI;
            if (ad42 != null) {
                ad42.LJIIJ(new AqS29S0001000_4(0, 10));
            }
            AEG aeg3 = this.LJLJL;
            if (aeg3 != null) {
                aeg3.LJIIJ(C85944XoC.LJLIL);
            }
            AEG aeg4 = this.LJLJLJ;
            if (aeg4 != null) {
                aeg4.LJIIJ(C85945XoD.LJLIL);
            }
        }
        AD4 ad43 = this.LJLILLLLZI;
        if (ad43 != null) {
            ad43.LJIIJ(new AqS170S0100000_4((CharSequence) string, 954));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C85894XnO c85894XnO = this.LJLJJL;
        if (c85894XnO != null) {
            c85894XnO.LIZIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[EDGE_INSN: B:25:0x0087->B:26:0x0087 BREAK  A[LOOP:0: B:8:0x0034->B:24:0x0034], SYNTHETIC] */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r6 = this;
            super.onResume()
            com.ss.android.ugc.aweme.setting.serverpush.model.NotificationSettings r0 = com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerLogoutFragment.LJZ
            r6.LJLLL = r0
            r6.Gl()
            android.content.Context r0 = r6.getContext()
            boolean r3 = X.C40322Fs6.LIZJ(r0)
            X.Xo6 r2 = r6.LJLJI
            if (r2 == 0) goto L1f
            kotlin.jvm.internal.AqS13S0010000_8 r1 = new kotlin.jvm.internal.AqS13S0010000_8
            r0 = 3
            r1.<init>(r3, r0)
            r2.LJIIJ(r1)
        L1f:
            X.Xo6 r2 = r6.LJLJJI
            if (r2 == 0) goto L2c
            kotlin.jvm.internal.AqS13S0010000_8 r1 = new kotlin.jvm.internal.AqS13S0010000_8
            r0 = 3
            r1.<init>(r3, r0)
            r2.LJIIJ(r1)
        L2c:
            java.util.List<X.Xo6> r0 = r6.LJLJLLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r5 = r0.iterator()
        L34:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r3 = r5.next()
            X.Xo6 r3 = (X.C85938Xo6) r3
            com.ss.android.ugc.aweme.setting.serverpush.model.NotificationSettings r0 = r6.LJLLL
            if (r0 == 0) goto L34
            java.lang.String r4 = r3.LJLJJLL
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.o.LJII(r4, r0)
            com.ss.android.ugc.aweme.setting.serverpush.model.NotificationSettings r1 = r6.LJLLL
            r2 = -1
            if (r1 == 0) goto L85
            java.lang.String r0 = "recommend_video_push"
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r0)
            if (r0 == 0) goto L76
            com.ss.android.ugc.aweme.setting.serverpush.model.NotificationSettingsInfo r0 = r1.notificationSettingsInfo
            if (r0 == 0) goto L85
            int r0 = r0.pushDeviceRecommendVideo
        L5e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 == r2) goto L87
            int r2 = r1.intValue()
            kotlin.jvm.internal.AqS102S0101000_15 r1 = new kotlin.jvm.internal.AqS102S0101000_15
            r0 = 6
            r1.<init>(r2, r3, r0)
            r3.LJIIJ(r1)
            goto L34
        L76:
            java.lang.String r0 = "other_channel"
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r0)
            if (r0 == 0) goto L85
            com.ss.android.ugc.aweme.setting.serverpush.model.NotificationSettingsInfo r0 = r1.notificationSettingsInfo
            if (r0 == 0) goto L85
            int r0 = r0.pushDeviceOtherChannel
            goto L5e
        L85:
            r0 = -1
            goto L5e
        L87:
            com.bytedance.keva.Keva r0 = r6.vl()
            java.lang.String r2 = "need_sync_channel_push_logout"
            java.lang.String r1 = ""
            java.lang.String r0 = r0.getString(r2, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Le7
            android.content.Context r0 = r6.getContext()
            boolean r0 = X.C40322Fs6.LIZJ(r0)
            if (r0 == 0) goto Le7
            com.bytedance.keva.Keva r0 = r6.vl()
            java.lang.String r4 = r0.getString(r2, r1)
            java.util.List<X.Xo6> r0 = r6.LJLJLLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r3 = r0.iterator()
        Lb3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Le7
            java.lang.Object r2 = r3.next()
            X.Xo6 r2 = (X.C85938Xo6) r2
            java.lang.String r0 = r2.LJLJJLL
            if (r0 != 0) goto Lc4
            goto Lb3
        Lc4:
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 == 0) goto Lb3
            boolean r0 = X.C85926Xnu.LIZ(r4)
            if (r0 == 0) goto Lb3
            Y.ARunnableS34S0200000_15 r1 = new Y.ARunnableS34S0200000_15
            r0 = 23
            r1.<init>(r6, r2, r0)
            boolean r0 = r6.LJLLILLLL
            if (r0 == 0) goto Le3
            java.util.List<java.lang.Runnable> r0 = r6.LJLLJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r1)
            goto Lb3
        Le3:
            r1.run()
            goto Lb3
        Le7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerLogoutFragment.onResume():void");
    }

    @Override // X.InterfaceC85902XnW
    public final void cL(NotificationSettings notificationSettings) {
        this.LJLLL = notificationSettings;
        NotificationSettingsInfo notificationSettingsInfo = notificationSettings.notificationSettingsInfo;
        if (notificationSettingsInfo != null) {
            C85938Xo6 c85938Xo6 = this.LJLJI;
            if (c85938Xo6 != null) {
                c85938Xo6.LJIIJ(new AqS146S0200000_15(notificationSettingsInfo, this, 43));
            }
            C85938Xo6 c85938Xo62 = this.LJLJJI;
            if (c85938Xo62 != null) {
                c85938Xo62.LJIIJ(new AqS146S0200000_15(notificationSettingsInfo, this, 44));
            }
        }
        LJZ = notificationSettings;
        this.LJLLILLLL = false;
        Al();
    }

    @Override // X.InterfaceC85902XnW
    public final void onFailed(Exception exc) {
        C5S1 c5s1 = new C5S1(EF7.LIZIZ());
        c5s1.LIZJ(R.string.im9);
        c5s1.LJ();
        this.LJLLILLLL = false;
        Al();
    }

    @Override // X.InterfaceC85916Xnk
    public final void xc0(BaseResponse baseResponse) {
        C85938Xo6 c85938Xo6;
        this.LJLLI = false;
        if (baseResponse.status_code != 0 && (c85938Xo6 = this.LJLL) != null) {
            c85938Xo6.LJIIJ(C85939Xo7.LJLIL);
            String str = c85938Xo6.LJLJJLL;
            o.LJII(str, "null cannot be cast to non-null type kotlin.String");
            Dl(c85938Xo6.LJFF().LJZI ? 1 : 0, str);
        }
    }

    public final void xl(C85938Xo6 c85938Xo6) {
        String str;
        Object obj;
        if (!this.LJLLI) {
            this.LJLL = c85938Xo6;
            this.LJLLI = true;
            if (!PushSettingManagerFragmentSecondVersion.wl(getContext())) {
                this.LJLLI = false;
                return;
            }
            if (!c85938Xo6.LJFF().LJZI) {
                String str2 = c85938Xo6.LJLJJLL;
                o.LJII(str2, "null cannot be cast to non-null type kotlin.String");
                if (!C85926Xnu.LIZ(str2)) {
                    String str3 = c85938Xo6.LJLJJLL;
                    o.LJII(str3, "null cannot be cast to non-null type kotlin.String");
                    if (Build.VERSION.SDK_INT >= 26) {
                        String LIZJ = C85926Xnu.LIZJ(str3);
                        Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                        intent.setFlags(268435456);
                        intent.putExtra("android.provider.extra.APP_PACKAGE", EF7.LIZIZ().getPackageName());
                        intent.putExtra("android.provider.extra.CHANNEL_ID", LIZJ);
                        if (EF7.LIZIZ().getPackageManager().resolveActivity(intent, 65536) != null) {
                            C78598Ut0.LJIJJ(intent, this);
                            startActivity(intent);
                        }
                    } else {
                        C40322Fs6.LIZLLL(EF7.LIZIZ());
                    }
                    Keva vl = vl();
                    String str4 = c85938Xo6.LJLJJLL;
                    o.LJII(str4, "null cannot be cast to non-null type kotlin.String");
                    vl.storeString("need_sync_channel_push_logout", str4);
                    this.LJLLI = false;
                    return;
                }
            }
            c85938Xo6.LJIIJ(J8A.LJLIL);
            String str5 = c85938Xo6.LJLJJLL;
            o.LJII(str5, "null cannot be cast to non-null type kotlin.String");
            Dl(c85938Xo6.LJFF().LJZI ? 1 : 0, str5);
            C85915Xnj c85915Xnj = this.LJLJJLL;
            if (c85915Xnj != null) {
                Object[] objArr = new Object[2];
                String str6 = c85938Xo6.LJLJJLL;
                o.LJII(str6, "null cannot be cast to non-null type kotlin.String");
                if (o.LJ(str6, "recommend_video_push")) {
                    obj = "push_device_recommend_video";
                } else if (o.LJ(str6, "other_channel")) {
                    obj = "push_device_other_channel";
                } else {
                    obj = null;
                }
                objArr[0] = obj;
                objArr[1] = Integer.valueOf(c85938Xo6.LJFF().LJZI ? 1 : 0);
                c85915Xnj.LJIILL(objArr);
            }
            String str7 = c85938Xo6.LJLJJLL;
            o.LJII(str7, "null cannot be cast to non-null type kotlin.String");
            if (c85938Xo6.LJFF().LJZI) {
                str = "on";
            } else {
                str = "off";
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("label", str7);
            c188727au.LJIIIZ("to_status", str);
            FMX.LJIIL("notification_switch", c188727au.LIZ);
        }
    }

    public final void Dl(int i, String str) {
        NotificationSettingsInfo notificationSettingsInfo;
        NotificationSettings notificationSettings = this.LJLLL;
        if (notificationSettings != null) {
            if (o.LJ(str, "recommend_video_push")) {
                NotificationSettingsInfo notificationSettingsInfo2 = notificationSettings.notificationSettingsInfo;
                if (notificationSettingsInfo2 != null) {
                    notificationSettingsInfo2.pushDeviceRecommendVideo = i;
                }
            } else if (o.LJ(str, "other_channel") && (notificationSettingsInfo = notificationSettings.notificationSettingsInfo) != null) {
                notificationSettingsInfo.pushDeviceOtherChannel = i;
            }
        }
        LJZ = this.LJLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLIL = (C252709vu) view.findViewById(R.id.la4);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            String string = mo49getActivity.getString(R.string.r0q);
            o.LJIIIIZZ(string, "getString(R.string.settings_push_notifications)");
            AD4 ad4 = new AD4(new AD3("", string, null, 0 == true ? 1 : 0, new ACListenerS24S0100000_4(this, 256), 126958));
            wl().LIZ(ad4);
            this.LJLILLLLZI = ad4;
            String string2 = mo49getActivity.getString(R.string.tn3);
            o.LJIIIIZZ(string2, "getString(R.string.video_push_title_non_log)");
            AEG aeg = new AEG(new AEB(string2, false, false, false, false, null, null, null, null, null, null, 16382));
            wl().LIZ(aeg);
            this.LJLJLJ = aeg;
            String string3 = mo49getActivity.getString(R.string.tn3);
            o.LJIIIIZZ(string3, "getString(R.string.video_push_title_non_log)");
            AEG aeg2 = new AEG(new AEB(string3, true, false, false, false, null, null, null, null, null, null, 16380));
            wl().LIZ(aeg2);
            this.LJLJL = aeg2;
            String string4 = mo49getActivity.getString(R.string.tn2);
            o.LJIIIIZZ(string4, "getString(R.string.video_push_name_non_log)");
            C85938Xo6 c85938Xo6 = new C85938Xo6(new C25848ACm(false, string4, null, false, null, null, null, null, false, false, false, null, 65533));
            wl().LIZ(c85938Xo6);
            c85938Xo6.LJIIJ(new AqS146S0200000_15(c85938Xo6, (View.OnClickListener) new ACListenerS49S0200000_15(this, c85938Xo6, 29), 45));
            this.LJLJI = c85938Xo6;
            C25851ACp wl = wl();
            String string5 = mo49getActivity.getString(R.string.jc9);
            o.LJIIIIZZ(string5, "getString(R.string.oper_push_title_non_log)");
            wl.LIZ(new AEG(new AEB(string5, true, false, false, false, null, null, null, null, null, null, 16380)));
            String string6 = mo49getActivity.getString(R.string.jc8);
            o.LJIIIIZZ(string6, "getString(R.string.oper_push_name_non_log)");
            C85938Xo6 c85938Xo62 = new C85938Xo6(new C25848ACm(false, string6, null, false, null, null, null, null, false, false, false, null, 65533));
            wl().LIZ(c85938Xo62);
            c85938Xo62.LJIIJ(new AqS146S0200000_15(c85938Xo62, (View.OnClickListener) new ACListenerS49S0200000_15(this, c85938Xo62, 30), 45));
            this.LJLJJI = c85938Xo62;
        }
        C252709vu c252709vu = this.LJLIL;
        if (c252709vu != null) {
            C235119Kp c235119Kp = new C235119Kp();
            String string7 = getString(R.string.qv1);
            o.LJIIIIZZ(string7, "getString(R.string.setting_notification_manager)");
            C78840Uwu.LJJIZ(c235119Kp, string7, new AqS165S0100000_15(this, 818));
            c252709vu.setNavActions(c235119Kp);
        }
        Gl();
        C85938Xo6 c85938Xo63 = this.LJLJI;
        if (c85938Xo63 != null) {
            c85938Xo63.LJLJJLL = "recommend_video_push";
            ((ArrayList) this.LJLJLLL).add(c85938Xo63);
        }
        C85938Xo6 c85938Xo64 = this.LJLJJI;
        if (c85938Xo64 != null) {
            c85938Xo64.LJLJJLL = "other_channel";
            ((ArrayList) this.LJLJLLL).add(c85938Xo64);
        }
        C85894XnO c85894XnO = new C85894XnO();
        this.LJLJJL = c85894XnO;
        c85894XnO.LJLILLLLZI = this;
        c85894XnO.LJIILL(new Object[0]);
        this.LJLLILLLL = true;
        C85915Xnj c85915Xnj = new C85915Xnj();
        this.LJLJJLL = c85915Xnj;
        c85915Xnj.LJLILLLLZI = this;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ckv, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
