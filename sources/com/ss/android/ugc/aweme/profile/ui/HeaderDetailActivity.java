package com.ss.android.ugc.aweme.profile.ui;

import X.AV1;
import X.ActivityC86117Xqz;
import X.C136245Wi;
import X.C149985uc;
import X.C16880lQ;
import X.C1A7;
import X.C38306F1q;
import X.C38333F2r;
import X.C38352F3k;
import X.C38354F3m;
import X.C38891fp;
import X.C39579Fg7;
import X.C5S1;
import X.C62846OlW;
import X.C65803Ps7;
import X.C73040SlY;
import X.C78688UuS;
import X.C78697Uub;
import X.C78765Uvh;
import X.C79238V7y;
import X.C81705W4v;
import X.C81810W8w;
import X.EF7;
import X.EnumC26164AOq;
import X.HG3;
import X.InterfaceC26189APp;
import X.InterfaceC26320AUq;
import X.InterfaceC78716Uuu;
import X.KL2;
import X.R3A;
import X.W5I;
import X.W5O;
import X.W5P;
import X.W6J;
import X.X1D;
import Y.ACListenerS22S0101000_3;
import Y.ACListenerS24S0100000_4;
import Y.ACListenerS26S0101000_8;
import Y.ACListenerS32S0101000_15;
import Y.IDAListenerS79S0100000_12;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.christmas.AvatarDetailEntity;
import com.ss.android.ugc.aweme.christmas.FestivalEntity;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.AvatarPresenter;
import com.ss.android.ugc.aweme.profile.presenter.UserPresenter;
import com.ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public class HeaderDetailActivity extends ActivityC86117Xqz implements InterfaceC26320AUq, InterfaceC26189APp {
    public static final /* synthetic */ int LLI = 0;
    public View LJLIL;
    public C62846OlW LJLILLLLZI;
    public View LJLJI;
    public FixedRatioFrameLayout LJLJJI;
    public ViewGroup LJLJJL;
    public ImageView LJLJJLL;
    public ImageView LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public TextView LJLL;
    public View LJLLI;
    public TextView LJLLILLLL;
    public TextView LJLLJ;
    public RelativeLayout LJLLL;
    public C62846OlW LJLLLL;
    public float LJLLLLLL;
    public Bitmap LJLZ;
    public User LJZ;
    public boolean LJZI = true;
    public boolean LJZL = true;
    public Challenge LL;
    public String[] LLD;
    public W5O[] LLF;
    public AvatarPresenter LLFF;
    public UserPresenter LLFFF;
    public String LLFII;
    public ObjectAnimator LLFZ;

    @Override // X.InterfaceC26189APp
    public final void FI(boolean z) {
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
    public void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void LLFZ() {
        this.LLFF.onClickUploadAvatarImage(0);
    }

    public void LLIIIILZ() {
        getIntent().getParcelableExtra("extra_zoom_info");
        this.LLD = getIntent().getStringArrayExtra("uri");
        this.LJLLLLLL = getIntent().getFloatExtra("wh_ratio", 1.0f);
        this.LJZ = (User) getIntent().getSerializableExtra("share_info");
        boolean z = true;
        this.LJZI = getIntent().getBooleanExtra("enable_download_img", true);
        Intent intent = getIntent();
        if (this.LJZ == null || !HG3.LJIILL().isMe(this.LJZ.getUid())) {
            z = false;
        }
        this.LJZL = intent.getBooleanExtra("enable_edit_img", z);
        this.LL = (Challenge) getIntent().getSerializableExtra("challenge_info");
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.dg);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        ObjectAnimator objectAnimator = this.LLFZ;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final W5O LLII(String str) {
        int i;
        int i2;
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
        imageDecodeOptionsBuilder.LJ = false;
        C81810W8w c81810W8w = new C81810W8w(imageDecodeOptionsBuilder);
        W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(str));
        LIZLLL.LJ = c81810W8w;
        Uri parse = UriProtector.parse(str);
        if (C39579Fg7.LIZIZ(parse.getPath())) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(parse.getPath(), options);
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            if (i3 > 720 || i4 > 1280) {
                int i5 = i3 >> 1;
                int i6 = i4 >> 1;
                i = 1;
                while (i5 / i > 720 && i6 / i > 1280) {
                    i <<= 1;
                }
            } else {
                i = 1;
            }
            int[] iArr = {i3 >> i, i4 >> i};
            int i7 = iArr[0];
            if (i7 > 0 && (i2 = iArr[1]) > 0) {
                LIZLLL.LIZJ = new C79238V7y(i7, i2);
            }
        }
        return LIZLLL.LIZ();
    }

    @Override // X.InterfaceC26320AUq
    public final void cq(Exception exc) {
        AvatarPresenter avatarPresenter;
        if (isDestroyed() || (avatarPresenter = this.LLFF) == null) {
            return;
        }
        avatarPresenter.dismissProgressDialog();
        if ((exc instanceof C38333F2r) && ((C38306F1q) exc).getErrorCode() == 20022) {
            C73040SlY.LJII(this, "profile_image_setting", "review_failure");
        }
        C1A7.LJIJJLI(this, exc, R.string.b5f);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        User user;
        AvatarDetailEntity avatarDetailEntity;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.c2s);
        this.LJLIL = findViewById(R.id.l_2);
        findViewById(R.id.eys);
        this.LJLILLLLZI = (C62846OlW) findViewById(R.id.my9);
        this.LJLJJI = (FixedRatioFrameLayout) findViewById(R.id.dmz);
        this.LJLJJL = (ViewGroup) findViewById(R.id.j83);
        this.LJLJJLL = (ImageView) findViewById(R.id.f23);
        this.LJLJL = (ImageView) findViewById(R.id.f95);
        this.LJLJLJ = findViewById(R.id.f96);
        this.LJLJLLL = findViewById(R.id.aiv);
        this.LJLL = (TextView) findViewById(R.id.m5x);
        this.LJLLI = findViewById(R.id.ac0);
        this.LJLLILLLL = (TextView) findViewById(R.id.ac1);
        this.LJLLJ = (TextView) findViewById(R.id.abz);
        this.LJLLL = (RelativeLayout) findViewById(R.id.abx);
        this.LJLLLL = (C62846OlW) findViewById(R.id.aby);
        View findViewById = findViewById(R.id.eys);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS22S0101000_3(1, this, 8), findViewById);
        }
        View findViewById2 = findViewById(R.id.f23);
        if (findViewById2 != null) {
            C16880lQ.LJIIJ(new ACListenerS32S0101000_15(1, this, 8), findViewById2);
        }
        View findViewById3 = findViewById(R.id.m5x);
        if (findViewById3 != null) {
            C16880lQ.LJIIJ(new ACListenerS26S0101000_8(0, this, 2), findViewById3);
        }
        overridePendingTransition(R.anim.df, R.anim.dg);
        this.LJLJI = findViewById(android.R.id.content);
        LLIIIILZ();
        if (getResources().getConfiguration().orientation == 2) {
            i = 1;
        } else {
            i = 0;
        }
        FixedRatioFrameLayout fixedRatioFrameLayout = this.LJLJJI;
        if (fixedRatioFrameLayout != null) {
            fixedRatioFrameLayout.LJLILLLLZI = this.LJLLLLLL;
            fixedRatioFrameLayout.LJLIL = i ^ 1;
        }
        this.LJLILLLLZI.getHierarchy().LJIILJJIL(InterfaceC78716Uuu.LJJL);
        LLFII(this.LJLILLLLZI, true, this.LLD);
        AvatarPresenter avatarPresenter = new AvatarPresenter();
        this.LLFF = avatarPresenter;
        avatarPresenter.bindView(this);
        Drawable drawable = null;
        this.LLFF.initHeadUploadHelper(this, null);
        UserPresenter userPresenter = new UserPresenter(EnumC26164AOq.PROFILE.getValue());
        this.LLFFF = userPresenter;
        userPresenter.bindView(this);
        this.LJLJJL.setBackgroundColor(-16777216);
        C16880lQ.LJIIL(this.LJLJJL, new ACListenerS24S0100000_4(this, 118));
        if (this.LJZI) {
            this.LJLJJLL.setVisibility(0);
            this.LJLJLLL.setVisibility(0);
        }
        if (R3A.LJII() && (user = this.LJZ) != null && !AV1.LJIJ(user) && this.LL == null && this.LJZ.isActivityUser()) {
            this.LJLLI.setVisibility(0);
            this.LJLLL.setVisibility(0);
            FestivalEntity LJI = R3A.LJI();
            if (LJI != null && (avatarDetailEntity = LJI.avatarDetailEntity) != null) {
                this.LJLLJ.setText(avatarDetailEntity.linkMessage);
                this.LJLLILLLL.setText(LJI.avatarDetailEntity.eventDescription);
                C62846OlW c62846OlW = this.LJLLLL;
                LruCache<String, Drawable> lruCache = C136245Wi.LIZ;
                Drawable drawable2 = lruCache.get("avatar_hat.png");
                if (drawable2 == null) {
                    C78697Uub LJI2 = C78697Uub.LJI();
                    String str = LJI2.LJLILLLLZI;
                    if (TextUtils.isEmpty(str)) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(C78697Uub.LJLJJL);
                        LIZ.append(File.separator);
                        LIZ.append(C38352F3k.LIZJ(C78697Uub.LJFF()));
                        str = X1D.LIZIZ(LIZ);
                        LJI2.LJLILLLLZI = str;
                    }
                    File file = new File(str);
                    if (file.exists() && file.isDirectory() && file.exists() && file.isDirectory()) {
                        File file2 = new File(file, "avatar_hat.png");
                        if (file2.exists() && file2.isFile() && file2.exists()) {
                            drawable = Drawable.createFromPath(file2.getPath());
                            if (drawable instanceof BitmapDrawable) {
                                ((BitmapDrawable) drawable).setTargetDensity((KL2.LJIIIIZZ(EF7.LIZIZ()) * KL2.LJIIIIZZ(EF7.LIZIZ())) / 480);
                            }
                            if (drawable != null) {
                                lruCache.put("avatar_hat.png", drawable);
                            }
                        }
                    }
                    drawable2 = drawable;
                }
                c62846OlW.setImageDrawable(drawable2);
            }
        }
        if (this.LJZL && !AV1.LJIIJJI()) {
            this.LJLL.setVisibility(0);
        }
        if (this.LL != null) {
            this.LJLIL.setVisibility(0);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onCreate", false);
    }

    @Override // X.InterfaceC26320AUq
    public final void rs0(String str) {
        this.LLFII = str;
        AvatarPresenter avatarPresenter = this.LLFF;
        if (avatarPresenter != null) {
            avatarPresenter.uploadAvatar(0);
        }
    }

    public void showLoadAnim(View view) {
        if (this.LLFZ == null) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", 0.0f, 360.0f);
        this.LLFZ = ofFloat;
        ofFloat.setDuration(600L);
        this.LLFZ.setRepeatCount(-1);
        C149985uc.LIZ(this.LLFZ);
        this.LLFZ.start();
        this.LLFZ.addListener(new IDAListenerS79S0100000_12(view, 2));
    }

    @Override // X.InterfaceC26320AUq
    public final void yH(AvatarUri avatarUri) {
        this.LLFF.dismissProgressDialog();
        if (avatarUri == null) {
            C5S1 c5s1 = new C5S1(this);
            c5s1.LIZJ(R.string.b5f);
            c5s1.LJ();
            return;
        }
        this.LLFFF.updateAvatar(avatarUri.uri);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("file://");
        LIZ.append(this.LLFII);
        Uri parse = UriProtector.parse(X1D.LIZIZ(LIZ));
        W5I.LIZ().LIZIZ(parse);
        LLFII(this.LJLILLLLZI, false, parse.toString());
    }

    public static void LLIIIJ(Activity activity, Bundle bundle) {
        if (activity != null) {
            Intent intent = new Intent(activity, (Class<?>) I18nHeaderDetailActivity.class);
            intent.putExtras(bundle);
            C16880lQ.LIZIZ(activity, intent);
            activity.overridePendingTransition(0, 0);
        }
    }

    @Override // X.InterfaceC26189APp
    public final void Pp0(User user, int i) {
        if (i == 4) {
            if (user.getAvatarMedium() != null) {
                LLFII(this.LJLILLLLZI, false, (String[]) user.getAvatarMedium().getUrlList().toArray(new String[user.getAvatarMedium().getUrlList().size()]));
            } else {
                C78765Uvh.LJFF(this.LJLILLLLZI, user.getAvatarMedium());
            }
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZJ(R.string.pfa);
            c5s1.LJ();
        }
        AvatarPresenter avatarPresenter = this.LLFF;
        if (avatarPresenter != null) {
            avatarPresenter.dismissProgressDialog();
        }
    }

    @Override // X.InterfaceC26189APp
    public final void Xa(Exception exc, int i) {
        AvatarPresenter avatarPresenter;
        if (isDestroyed() || this.LLFFF == null || (avatarPresenter = this.LLFF) == null) {
            return;
        }
        if (4 == i) {
            avatarPresenter.dismissProgressDialog();
            if ((exc instanceof C38333F2r) && ((C38306F1q) exc).getErrorCode() == 20022) {
                C73040SlY.LJII(this, "profile_image_setting", "review_failure");
            }
        } else if (i == 116) {
            return;
        }
        C1A7.LJIJJLI(this, exc, R.string.pg9);
    }

    @Override // X.InterfaceC26189APp
    public final void vb0(String str, boolean z) {
        if (isDestroyed()) {
            return;
        }
        this.LLFF.dismissProgressDialog();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C5S1 c5s1 = new C5S1(EF7.LIZIZ());
        c5s1.LIZLLL(str);
        c5s1.LJ();
        if (z) {
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLFII(C62846OlW c62846OlW, boolean z, String... strArr) {
        String str;
        List<String> urlList;
        if (c62846OlW == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (strArr != null && strArr.length != 0) {
            for (String str2 : strArr) {
                if (!C38354F3m.LJ(str2)) {
                    arrayList.add(LLII(str2));
                }
            }
        }
        REQUEST request = 0;
        W5O w5o = null;
        if (z) {
            UrlModel LJJI = C78688UuS.LJJI(this.LJZ);
            if (LJJI != null && (urlList = LJJI.getUrlList()) != null) {
                W6J LIZ = W5I.LIZ();
                Iterator<String> it = urlList.iterator();
                while (it.hasNext()) {
                    str = it.next();
                    if (LIZ.LJII(UriProtector.parse(str))) {
                        break;
                    }
                }
            }
            str = null;
            if (!TextUtils.isEmpty(str)) {
                w5o = LLII(str);
            }
            request = w5o;
            if (C38891fp.LJJI(arrayList)) {
                C78765Uvh.LIZ(c62846OlW, R.drawable.b0p);
                return;
            }
        }
        this.LLF = new W5O[arrayList.size()];
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJFF(true, arrayList.toArray(this.LLF));
        LIZJ.LJIIL = c62846OlW.getController();
        LIZJ.LJIIJ = this instanceof I18nHeaderDetailActivity;
        if (request != 0) {
            LIZJ.LJ = request;
        }
        c62846OlW.setController(LIZJ.LIZ());
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.LLFF.onActivityResult(i, i2, intent);
    }

    public static void LLIIIZ(Activity activity, View view, float f, User user, boolean z, boolean z2, Challenge challenge, String... strArr) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_zoom_info", ZoomAnimationUtils.LIZ(view));
        bundle.putStringArray("uri", strArr);
        bundle.putFloat("wh_ratio", f);
        bundle.putBoolean("enable_download_img", z);
        bundle.putBoolean("handle_with_video_avatar", z2);
        if (user != null) {
            bundle.putSerializable("share_info", user);
        }
        if (challenge != null) {
            bundle.putSerializable("challenge_info", challenge);
        }
        LLIIIJ(activity, bundle);
    }
}
