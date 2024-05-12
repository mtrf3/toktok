package com.ss.android.ugc.aweme.deeplink;

import X.ActivityC86117Xqz;
import X.C03880Dg;
import X.C04250Er;
import X.C16880lQ;
import X.C1791471i;
import X.C1AT;
import X.C40372Fsu;
import X.C55427Lp9;
import X.C55494LqE;
import X.C56235M5f;
import X.C56662Kg;
import X.C65300Pk0;
import X.C65803Ps7;
import X.C78598Ut0;
import X.C79004UzY;
import X.C85990Xow;
import X.C88547Yp5;
import X.FWS;
import X.HG3;
import X.RBX;
import X.RunnableC23230vf;
import Y.ARunnableS9S0301000_9;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.DetailFeedServiceImpl;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class DeepLinkHandlerActivity extends ActivityC86117Xqz {
    public static final /* synthetic */ int LJLZ = 0;
    public Uri LJLILLLLZI;
    public final C40372Fsu LJLIL = new C40372Fsu();
    public boolean LJLJI = false;
    public boolean LJLJJI = false;
    public String LJLJJL = null;
    public boolean LJLJJLL = false;
    public boolean LJLJL = false;
    public ArrayList<String> LJLJLJ = new ArrayList<>();
    public final ArrayList<Intent> LJLJLLL = new ArrayList<>();
    public Intent LJLL = null;
    public boolean LJLLI = false;
    public boolean LJLLILLLL = false;
    public final IAccountUserService LJLLJ = AccountService.LJIJ().LJFF();
    public final IDeepLinkService LJLLL = DeepLinkServiceImpl.LIZ();
    public String LJLLLL = "";
    public boolean LJLLLLLL = false;

    public static boolean LLII() {
        return MainServiceImpl.createIMainServicebyMonsterPlugin(false).isAppHot();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLIIIJ() {
        String str;
        String str2 = "";
        Intent intent = getIntent();
        this.LJLJLJ = intent.getStringArrayListExtra("pre_o_urls");
        try {
            if (!LLFII(intent)) {
                return;
            }
            if (!this.LJLLILLLL) {
                LLIIIILZ(this.LJLL, this.LJLJLLL);
            }
            C56235M5f.LIZLLL(LiveNetAdaptiveHurryTimeSetting.DEFAULT, this.LJLILLLLZI, "Transfer");
            FWS.LIZ().LIZ = false;
            IDeepLinkService iDeepLinkService = this.LJLLL;
            Uri uri = this.LJLILLLLZI;
            ArrayList<String> arrayList = this.LJLJLJ;
            if (uri != null) {
                str = uri.toString();
            } else if (!C79004UzY.LJJIFFI(arrayList)) {
                str = arrayList.toString();
            } else {
                str = "";
            }
            iDeepLinkService.LJIL(str, "", true);
            C88547Yp5.LIZIZ.LJIILLIIL(this.LJLJJI, this.LJLILLLLZI);
            if (this.LJLJJI && this.LJLJL) {
                if (LLII()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String lable = this.LJLLLL;
                    o.LJIIIZ(lable, "lable");
                    C55427Lp9.LIZ = currentTimeMillis;
                    C55427Lp9.LIZLLL = lable;
                    C55427Lp9.LJ = 0;
                    return;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                String label = this.LJLLLL;
                o.LJIIIZ(label, "label");
                C55427Lp9.LIZIZ = currentTimeMillis2;
                C55427Lp9.LIZLLL = label;
                C55427Lp9.LJ = 0;
                C55427Lp9.LIZJ = 1;
                C55427Lp9.LIZ = C56662Kg.LIZ().LJIIJ;
                C55427Lp9.LIZ();
            }
        } catch (Exception e) {
            IDeepLinkService iDeepLinkService2 = this.LJLLL;
            Uri uri2 = this.LJLILLLLZI;
            ArrayList<String> arrayList2 = this.LJLJLJ;
            if (uri2 != null) {
                str2 = uri2.toString();
            } else if (!C79004UzY.LJJIFFI(arrayList2)) {
                str2 = arrayList2.toString();
            }
            iDeepLinkService2.LJIL(str2, e.getMessage(), false);
            Uri uri3 = this.LJLILLLLZI;
            e.getMessage();
            C56235M5f.LIZLLL(2014, uri3, "Transfer");
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        this.LJLLI = false;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity", "onStart", true);
        super.onStart();
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity", "onStart", false);
    }

    public final boolean LLFII(final Intent intent) {
        String str;
        boolean z;
        String uri;
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "rule_id");
        Uri data = intent.getData();
        List<String> allUidList = this.LJLLJ.allUidList();
        String curUserId = this.LJLLJ.getCurUserId();
        if (data != null) {
            str = UriProtector.getQueryParameter(data, "multi_account_push_uid");
        } else {
            str = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
        boolean equals = TextUtils.equals(str, curUserId);
        final boolean contains = allUidList.contains(str);
        if (C85990Xow.LJIIIZ() && !isEmpty && isLogin && !equals) {
            this.LJLLILLLL = true;
            if (AVExternalServiceImpl.LIZ().publishService().isPublishing()) {
                new Handler().post(new RunnableC23230vf(6, this));
                C56235M5f.LIZLLL(2011, this.LJLILLLLZI, "Transfer");
                return false;
            }
            Activity previousActivity = ActivityStack.getPreviousActivity();
            if (previousActivity != null) {
                String LJLLILLLL = C16880lQ.LJLLILLLL(previousActivity.getClass());
                ArrayList arrayList = new ArrayList();
                arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
                arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity");
                arrayList.add("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity");
                if (arrayList.contains(LJLLILLLL)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(previousActivity, R.style.po);
                    builder.setMessage(R.string.pk4);
                    builder.setNegativeButton(R.string.cg_, new DialogInterface.OnClickListener() { // from class: X.M67
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                        }
                    });
                    builder.setPositiveButton(R.string.dsg, new DialogInterface.OnClickListener() { // from class: X.M5y
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            DeepLinkHandlerActivity.this.LLIIIZ(intent, contains);
                        }
                    });
                    AlertDialog create = builder.create();
                    create.setCanceledOnTouchOutside(false);
                    create.setCancelable(false);
                    try {
                        if (!new C03880Dg(2).LIZJ(300000, "android/app/AlertDialog", "show", create, new Object[0], "void", new C65300Pk0(false, "()V", "1531544676278681073")).LIZ) {
                            create.show();
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    arrayList.clear();
                } else {
                    arrayList.clear();
                }
            }
            LLIIIZ(intent, contains);
        }
        if (intent.getBooleanExtra("second_jump", false)) {
            z = true;
        } else {
            z = false;
        }
        if (!C79004UzY.LJJIFFI(this.LJLJLJ)) {
            if (((RBX) HG3.LJIILL()).isLogin() && !TextUtils.isEmpty(str) && !TextUtils.equals(str, this.LJLLJ.getCurUserId())) {
                if (LLII()) {
                    this.LJLLL.LJIL(this.LJLJLJ.toString(), "abs isAppHot == true", false);
                    return false;
                }
                this.LJLL = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(this);
            } else if (!LLII() || z) {
                Iterator<String> it = this.LJLJLJ.iterator();
                while (it.hasNext()) {
                    Intent LLFZ = LLFZ(UriProtector.parse(it.next()), false);
                    if (LLFZ != null) {
                        LLFZ.putExtra("is_have_intents", true);
                        LLFZ.putExtra("rule_id", LLJJIJIIJIL);
                        ListProtector.add(this.LJLJLLL, 0, LLFZ);
                    }
                }
            }
        }
        if (this.LJLL == null) {
            this.LJLL = LLFZ(this.LJLILLLLZI, true);
        }
        Intent intent2 = this.LJLL;
        if (intent2 == null) {
            IDeepLinkService iDeepLinkService = this.LJLLL;
            Uri uri2 = this.LJLILLLLZI;
            if (uri2 == null) {
                uri = "";
            } else {
                uri = uri2.toString();
            }
            iDeepLinkService.LJIL(uri, "abs intent == null", false);
            if (!LLII() && this.LJLLI) {
                Intent mainActivityIntent = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(this);
                this.LJLL = mainActivityIntent;
                C16880lQ.LJ(this, mainActivityIntent, null);
            }
            return false;
        }
        intent2.putExtra("from_notification", this.LJLJJI);
        this.LJLL.putExtra("from_notification_uuid", this.LJLJJL);
        this.LJLL.putExtra("rule_id", LLJJIJIIJIL);
        if (!this.LJLJI) {
            this.LJLL.addFlags(268435456);
        }
        if (this.LJLJLLL.size() > 0) {
            if (this.LJLL.getComponent() != null && (TextUtils.equals(MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityClass().getName(), this.LJLL.getComponent().getClassName()) || TextUtils.equals(MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityClass().getName(), this.LJLL.getComponent().getClassName()))) {
                this.LJLJLLL.clear();
            } else {
                this.LJLL.putExtra("is_have_intents", true);
                this.LJLJLLL.add(this.LJLL);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        try {
            super.setTheme(i);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.Intent LLFZ(android.net.Uri r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity.LLFZ(android.net.Uri, boolean):android.content.Intent");
    }

    public final void LLIIIILZ(Intent intent, ArrayList arrayList) {
        if (getIntent() != null) {
            C16880lQ.LLJJIJIIJIL(getIntent(), "rule_id");
        }
        Bundle bundle = null;
        if (TextUtils.equals(intent.getComponent().getClassName(), DetailFeedServiceImpl.LJIIJ().LJIIIZ().getName())) {
            bundle = new C1AT(ActivityOptions.makeCustomAnimation(this, R.anim.dl, R.anim.dl)).LIZLLL();
        }
        if (arrayList.size() > 1) {
            C04250Er.LIZ(this, (Intent[]) arrayList.toArray(new Intent[arrayList.size()]), bundle);
        } else if (intent.getBooleanExtra("need_post", false)) {
            new Handler().post(new ARunnableS9S0301000_9(1, bundle, this, intent, 0));
        } else {
            C16880lQ.LJ(this, intent, bundle);
        }
    }

    public final void LLIIIZ(Intent intent, boolean z) {
        Uri uri;
        String str;
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        if (uri != null) {
            str = UriProtector.getQueryParameter(uri, "multi_account_push_uid");
        } else {
            str = null;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("push_intent", intent);
        bundle.putBoolean("mFromNotification", this.LJLJJI);
        bundle.putString("from_notification_uuid", this.LJLJJL);
        bundle.putBoolean("cancelRestoreOnMain", true);
        if (z) {
            bundle.putBoolean("switch_jump", true);
            SignificantUserInfo findSignificanUserInfo = ((RBX) HG3.LJIILL()).findSignificanUserInfo(str);
            if (findSignificanUserInfo == null) {
                return;
            }
            HG3.LJIIIIZZ().switchAccount(findSignificanUserInfo, bundle, new C55494LqE(this, bundle));
            return;
        }
        Intent intent2 = new Intent(C1791471i.LIZ, AccountService.LJIJ().LJI().getPushLoginActivityClass());
        intent2.putExtra("multi_account_push_uid", str);
        intent2.putExtra("multi_account", bundle);
        if (LLII()) {
            C78598Ut0.LJIJJ(intent2, this);
            startActivity(intent2);
        } else {
            C04250Er.LIZ(this, new Intent[]{MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(this), intent2}, null);
        }
    }
}
