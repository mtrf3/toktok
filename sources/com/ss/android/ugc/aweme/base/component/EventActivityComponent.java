package com.ss.android.ugc.aweme.base.component;

import X.ActivityC45651qj;
import X.C116694i1;
import X.C12460eI;
import X.C162226Yg;
import X.C16880lQ;
import X.C2304092m;
import X.C26045AKb;
import X.C36922EeM;
import X.C40328FsC;
import X.C43694HCw;
import X.C43695HCx;
import X.C45804HyK;
import X.C4LD;
import X.C4PN;
import X.C54838Lfe;
import X.C55888Lwa;
import X.C78966Uyw;
import X.C84763XOl;
import X.C8RI;
import X.C8RJ;
import X.C9WI;
import X.GVS;
import X.H7B;
import X.HG3;
import X.InterfaceC44975Hkx;
import X.InterfaceC45040Hm0;
import X.J1R;
import X.L1F;
import X.QD3;
import X.RBX;
import X.V1B;
import X.Z89;
import X.Z8A;
import Y.ACListenerS24S0100000_4;
import Y.ARunnableS21S0200000_2;
import Y.ARunnableS8S0301000_7;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.component.EventActivityComponent;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.port.internal.MainActivityCallback;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import yq4.a;

/* loaded from: classes8.dex */
public class EventActivityComponent implements GenericLifecycleObserver {
    public static C9WI LJLJJI;
    public InterfaceC44975Hkx LJLIL;
    public final ActivityC45651qj LJLILLLLZI;
    public C8RJ LJLJI;

    public EventActivityComponent(ActivityC45651qj activityC45651qj) {
        this.LJLILLLLZI = activityC45651qj;
    }

    @QD3(sticky = true)
    public void onNotificationRetry(GVS gvs) {
        ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
        if (activityC45651qj instanceof MainActivity) {
            new MainActivityCallback(activityC45651qj, gvs.LJLIL, true);
            EventBus.LIZJ().LJIILLIIL(gvs);
        }
    }

    @QD3(sticky = true)
    public void onPoiVideoPublish(C43695HCx c43695HCx) {
        IPoiService LIZIZ = PoiServiceImpl.LIZIZ();
        if (!LIZIZ.LJI()) {
            return;
        }
        EventBus.LIZJ().LJIILLIIL(c43695HCx);
        ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
        if (activityC45651qj == null || !V1B.LJLI(activityC45651qj)) {
            return;
        }
        C8RJ c8rj = this.LJLJI;
        if (c8rj != null) {
            int status = c8rj.status();
            if (status == 1 || status == 3 || status == 4) {
                return;
            }
        } else {
            this.LJLJI = LIZIZ.LJJJJLI();
        }
        this.LJLJI.LIZ(activityC45651qj, c43695HCx.LJLIL);
    }

    @QD3(priority = -1, sticky = true)
    public void onPublishStatus(C43694HCw c43694HCw) {
        String LJJLIIIIJ;
        IPoiService LIZIZ = PoiServiceImpl.LIZIZ();
        if (LIZIZ.LJI() && (LJJLIIIIJ = LIZIZ.LJJLIIIIJ((Aweme) c43694HCw.LJLJI)) != null) {
            C8RI c8ri = C8RJ.LJJJLL;
            C8RJ c8rj = this.LJLJI;
            c8ri.getClass();
            Integer num = (Integer) ((LinkedHashMap) C8RI.LIZIZ).get(LJJLIIIIJ);
            if (num != null) {
                if (c8rj == null) {
                    return;
                }
                if (num.intValue() != System.identityHashCode(c8rj)) {
                    return;
                }
            }
        }
        ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
        if (activityC45651qj == null || !V1B.LJLI(activityC45651qj)) {
            return;
        }
        int i = c43694HCw.LJLIL;
        if (i == 12) {
            if (activityC45651qj == C84763XOl.LJIIIIZZ()) {
                C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI);
                c26045AKb.LJIIIIZZ(R.string.gi9);
                c26045AKb.LJIIJ();
            }
            C36922EeM.LJFF(new Exception(c43694HCw.toString()));
        } else if (i == 9) {
            if (activityC45651qj == C84763XOl.LJIIIIZZ() && c43694HCw.LJLL) {
                String str = c43694HCw.LJLJJI;
                if (TextUtils.isEmpty(str)) {
                    str = activityC45651qj.getResources().getString(R.string.piq);
                }
                C16880lQ.LLZILL(Toast.makeText(this.LJLILLLLZI, str, 1));
            }
            C36922EeM.LJFF(new Exception(c43694HCw.toString()));
        } else if (i == 10) {
            ARunnableS8S0301000_7 aRunnableS8S0301000_7 = new ARunnableS8S0301000_7(0, this, c43694HCw, activityC45651qj, 1);
            CreateBaseAwemeResponse createBaseAwemeResponse = c43694HCw.LJLJLJ;
            if ((createBaseAwemeResponse instanceof CreateAwemeResponse) && ((CreateAwemeResponse) createBaseAwemeResponse).couponInfo != null) {
                MusicService.LJJLIIIJJI().LJJJI();
            } else {
                aRunnableS8S0301000_7.run();
            }
        }
        AVExternalServiceImpl.LIZ().publishService().setPublishStatus(c43694HCw.LJLIL);
    }

    public final void LIZ(C43694HCw c43694HCw, ActivityC45651qj activityC45651qj) {
        String nv0;
        if (!C4LD.LIZIZ.LJJJIL(c43694HCw, activityC45651qj)) {
            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) c43694HCw.LJLJLJ;
            Aweme aweme = createAwemeResponse.aweme;
            ShareService shareService = C4LD.LIZ;
            Aweme aweme2 = (Aweme) c43694HCw.LJLJI;
            String[] strArr = new String[1];
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLILLLLZI);
            if (LJJIFFI == null || (nv0 = C116694i1.LIZ(LJJIFFI).nv0()) == null) {
                nv0 = "";
            }
            strArr[0] = nv0;
            this.LJLIL = shareService.LJJIL(activityC45651qj, aweme2, createAwemeResponse, strArr);
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            Z8A z8a = Z8A.LIZIZ;
            final long lastTimeShowPublishSuccessWindow = z8a.getLastTimeShowPublishSuccessWindow(curUserId, 0L);
            this.LJLIL.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.9iR
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v0, types: [X.9WI, java.lang.Object, android.app.Dialog] */
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    EventActivityComponent eventActivityComponent = EventActivityComponent.this;
                    long j = lastTimeShowPublishSuccessWindow;
                    eventActivityComponent.getClass();
                    User curUser = ((RBX) HG3.LJIILL()).getCurUser();
                    if ((Z8A.LIZIZ.userNameLegitimate() && (curUser == null || !curUser.nicknameUpdateReminder())) || a.LJ().LJ(4)) {
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis <= j) {
                        return;
                    }
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(currentTimeMillis);
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    if (calendar.getTimeInMillis() < j) {
                        return;
                    }
                    if (curUser.nicknameUpdateReminder()) {
                        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                        if (LJIIIIZZ == null) {
                            return;
                        }
                        C9WI c9wi = EventActivityComponent.LJLJJI;
                        if (c9wi != null && c9wi.isShowing()) {
                            return;
                        }
                        ?? r8 = new DialogC26391AXj(LJIIIIZZ, curUser) { // from class: X.9WI
                            public final User LJLIL;
                            public final int LJLILLLLZI = 1;
                            public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1260));
                            public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1261));
                            public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1262));
                            public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1258));
                            public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1259));

                            @Override // android.app.Dialog
                            public final void onCreate(Bundle bundle) {
                                UrlModel urlModel;
                                super.onCreate(bundle);
                                setContentView(R.layout.bk5);
                                View findViewById = findViewById(R.id.avd);
                                C110614Vt c110614Vt = new C110614Vt();
                                c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
                                c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(2));
                                Context context = getContext();
                                o.LJIIIIZZ(context, "context");
                                findViewById.setBackground(c110614Vt.LIZ(context));
                                C78897Uxp.LJJJJJL(findViewById, C32151Nz.LJIIZILJ(2));
                                setCanceledOnTouchOutside(false);
                                setCancelable(false);
                                User user = this.LJLIL;
                                if (user != null) {
                                    urlModel = user.getAvatarMedium();
                                } else {
                                    urlModel = null;
                                }
                                W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
                                S3I s3i = new S3I();
                                s3i.LIZ = true;
                                LJII.LJIJJLI = new S3L(s3i);
                                Object value = this.LJLJI.getValue();
                                o.LJIIIIZZ(value, "<get-ivAvatar>(...)");
                                LJII.LJJIIJ = (SmartImageView) value;
                                C16880lQ.LLJJJ(LJII);
                                Object value2 = this.LJLJJL.getValue();
                                o.LJIIIIZZ(value2, "<get-tvUsername>(...)");
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append('@');
                                LIZ.append(AV1.LIZLLL(user));
                                ((TextView) value2).setText(X1D.LIZIZ(LIZ));
                                Object value3 = this.LJLJJI.getValue();
                                o.LJIIIIZZ(value3, "<get-ivCancel>(...)");
                                C16880lQ.LJIILLIIL((ImageView) value3, new ACListenerS24S0100000_4(this, 323));
                                Object value4 = this.LJLJJLL.getValue();
                                o.LJIIIIZZ(value4, "<get-btnUpdate>(...)");
                                TextView textView = (TextView) value4;
                                textView.post(new ARunnableS21S0200000_2(textView, this, 71));
                                Object value5 = this.LJLJJLL.getValue();
                                o.LJIIIIZZ(value5, "<get-btnUpdate>(...)");
                                C16880lQ.LJIJI((TextView) value5, new ACListenerS24S0100000_4(this, 324));
                                if (this.LJLILLLLZI == 1) {
                                    Object value6 = this.LJLJL.getValue();
                                    o.LJIIIIZZ(value6, "<get-dialogDate>(...)");
                                    ((TextView) value6).setText(getContext().getString(R.string.cle));
                                }
                            }

                            {
                                this.LJLIL = curUser;
                            }
                        };
                        EventActivityComponent.LJLJJI = r8;
                        if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/base/component/TTChangeUsernameDialog", "show", r8, new Object[0], "void", new C65300Pk0(false, "()V", "-3991403272173850915")).LIZ) {
                            r8.show();
                        }
                        FMX.onEventV3("modify_username_notify");
                        return;
                    }
                    MainServiceImpl.createIMainServicebyMonsterPlugin(false).tryShowIllegalUsernameDialog("publish", null, null);
                }
            });
            if (!Z89.LIZIZ.LIZIZ(aweme) || !C78966Uyw.LJJIJ().LIZIZ()) {
                this.LJLIL.show();
            }
            if (aweme != null && aweme.getAid() != null) {
                ShareExtServiceImpl.LJJLIIJ().LJJLIIIJ(aweme.getAid());
            }
            z8a.LIZ.setLastTimeShowPublishSuccessWindow(curUserId, System.currentTimeMillis());
            H7B.LIZ("PublishDurationMonitor MANUAL_END showSuccessWindow");
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        InterfaceC44975Hkx interfaceC44975Hkx;
        int i = C162226Yg.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || (interfaceC44975Hkx = this.LJLIL) == null) {
                        return;
                    }
                    interfaceC44975Hkx.onDismiss();
                    return;
                }
                EventBus.LIZJ().LJIJ(this);
                return;
            }
            EventBus.LIZJ().LJIILJJIL(this);
            return;
        }
        if (!(this.LJLILLLLZI instanceof InterfaceC45040Hm0)) {
            return;
        }
        new WeakReference(this.LJLILLLLZI);
    }

    public static void LIZIZ(ActivityC45651qj activityC45651qj, Aweme aweme, PublishModel publishModel) {
        if (L1F.LIZIZ() && C54838Lfe.LJIILIIL(aweme)) {
            return;
        }
        if (C54838Lfe.LJIIZILJ(aweme) && C2304092m.LIZ()) {
            return;
        }
        if (publishModel == null || publishModel.storyGroupPublishModel == null || AVExternalServiceImpl.LIZ().storyService().storyPublishService().getGroupScheduleService().isAllTaskInGroupPublishFinished(publishModel.storyGroupPublishModel)) {
            if (C4PN.LIZ()) {
                int privateStatus = aweme.getStatus().getPrivateStatus();
                int i = R.string.p8s;
                if (privateStatus != 0) {
                    if (privateStatus != 1) {
                        if (privateStatus != 2) {
                            C40328FsC.LIZLLL(activityC45651qj, R.string.p8s);
                        } else {
                            C40328FsC.LIZLLL(activityC45651qj, R.string.p8u);
                            return;
                        }
                    } else {
                        C40328FsC.LIZLLL(activityC45651qj, R.string.p8v);
                        return;
                    }
                } else {
                    C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
                    if (((RBX) HG3.LJIILL()).getCurUser().isSecret()) {
                        i = R.string.p8t;
                    }
                    c26045AKb.LJIIIIZZ(i);
                    c26045AKb.LJIIJ();
                    return;
                }
            } else {
                C40328FsC.LIZLLL(activityC45651qj, R.string.rr5);
            }
            C55888Lwa.LIZIZ.LIZ(activityC45651qj, new GuideOutPushParam("normal", J1R.LIZ(C12460eI.LJFF()), "", "publish", ""));
        }
    }
}
