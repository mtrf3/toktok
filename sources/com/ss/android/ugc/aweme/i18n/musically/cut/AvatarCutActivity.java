package com.ss.android.ugc.aweme.i18n.musically.cut;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C244309iM;
import X.C244319iN;
import X.C244329iO;
import X.C244379iT;
import X.C26048AKe;
import X.C36922EeM;
import X.C38816FLg;
import X.C42530Gmc;
import X.C5S1;
import X.C65803Ps7;
import X.C6ZT;
import X.C85519XhL;
import X.C9WB;
import X.DialogC25756A8y;
import X.InterfaceC26189APp;
import X.InterfaceC26315AUl;
import X.KL2;
import X.ProgressDialogC43241Gy5;
import X.TextureViewSurfaceTextureListenerC85043XZf;
import Y.ALAdapterS12S0100000_15;
import Y.AObjectS15S0001000_14;
import Y.AObjectS21S0001000_5;
import Y.AObjectS52S0101000_7;
import Y.ARunnableS43S0100000_7;
import Y.ARunnableS51S0100000_15;
import Y.IDrS53S0100000_15;
import android.animation.ValueAnimator;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.edit.AvatarVideoPresenter;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserPresenter;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public class AvatarCutActivity extends ActivityC86117Xqz implements View.OnTouchListener, View.OnClickListener, InterfaceC26315AUl, InterfaceC26189APp {
    public static final /* synthetic */ int LLILII = 0;
    public MediaPlayer LJLIL;
    public TextureView LJLILLLLZI;
    public RelativeLayout LJLJI;
    public String LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public AvatarVideoPresenter LJLL;
    public FrameLayout LJLLI;
    public RecyclerView LJLLILLLL;
    public FrameLayout LJLLJ;
    public ImageView LJLLL;
    public ImageView LJLLLL;
    public int LJLLLLLL;
    public TextView LJLZ;
    public int LJZ;
    public int LJZI;
    public int LJZL;
    public int LL;
    public ProgressDialogC43241Gy5 LLD;
    public View LLF;
    public View LLFF;
    public ARunnableS51S0100000_15 LLFFF;
    public TextView LLFII;
    public TextView LLFZ;
    public String LLI;
    public boolean LLIFFJFJJ;
    public int LLIIII;
    public float LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;
    public UserPresenter LLIIIZ;
    public DialogC25756A8y LLIIJI;
    public C244379iT LLIIJLIL;
    public float LLIILII;
    public float LLIILZL;
    public long LLII = -1;
    public final ARunnableS43S0100000_7 LLIIL = new ARunnableS43S0100000_7(this, 20);
    public int LLIIZ = 0;
    public final AObjectS52S0101000_7 LLIL = new AObjectS52S0101000_7(0, this, 0);

    public static float LLIIIZ() {
        return (6 * 1.0f) / 5.0f;
    }

    @Override // X.InterfaceC26189APp
    public final void Pp0(User user, int i) {
    }

    @Override // X.InterfaceC26189APp
    public final void Xa(Exception exc, int i) {
    }

    @Override // X.InterfaceC26320AUq
    public final void cq(Exception exc) {
    }

    @Override // X.InterfaceC26315AUl
    public final void fT() {
    }

    @Override // X.InterfaceC26315AUl
    public final void iS(String str) {
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC26320AUq
    public final void rs0(String str) {
    }

    @Override // X.InterfaceC26189APp
    public final void vb0(String str, boolean z) {
    }

    @Override // X.InterfaceC26320AUq
    public final void yH(AvatarUri avatarUri) {
    }

    static {
        C16880lQ.LJLLILLLL(AvatarCutActivity.class);
    }

    public final void LLFII() {
        int LLIIIZ;
        int i;
        ImageView imageView = this.LJLLLL;
        if (imageView == null) {
            return;
        }
        if (((int) imageView.getX()) != this.LJZL || ((int) this.LJLLL.getX()) != this.LL - this.LJLJLJ || (LLIIIZ = this.LJLJL) > 6000) {
            LLIIIZ = (int) (LLIIIZ() * (((this.LJLLLL.getX() - this.LJLLL.getX()) - this.LJLJLJ) / this.LLIIII) * 1000.0f);
        }
        if (LLIIIZ < 2500) {
            return;
        }
        int x = (int) (((this.LJLLL.getX() + this.LLIIZ) + this.LJLJLJ) - this.LL);
        if (x < 0) {
            x = 0;
        }
        float f = this.LLIIIILZ;
        int i2 = (int) (((f * 1000.0d) * x) / this.LJLLLLLL);
        if (LLIIIZ < 3000) {
            LLIIIZ = 3000;
        }
        int i3 = this.LJLJL;
        if (LLIIIZ > i3) {
            LLIIIZ = i3;
        }
        if (LLIIIZ + i2 > i3) {
            i2 = i3 - LLIIIZ;
        }
        this.LJZI = LLIIIZ;
        float f2 = f * 5.0f;
        if (LLIIIZ <= 1000.0f * f2) {
            i = (int) Math.round(LLIIIZ / 1000.0d);
        } else {
            i = (int) f2;
        }
        if (i < 3) {
            i = 3;
        }
        float f3 = i;
        float f4 = this.LLIIIILZ * 5.0f;
        if (f3 > f4) {
            i = Math.round(f4);
        }
        this.LJLZ.setText(getResources().getString(R.string.cqs, Integer.valueOf(i)));
        this.LJZ = i2;
    }

    public final void LLII() {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer == null) {
            return;
        }
        if (mediaPlayer.isPlaying()) {
            this.LJLIL.pause();
        }
        ARunnableS51S0100000_15 aRunnableS51S0100000_15 = this.LLFFF;
        if (aRunnableS51S0100000_15 != null) {
            this.LJLJI.removeCallbacks(aRunnableS51S0100000_15);
        }
        this.LLFFF = new ARunnableS51S0100000_15(this, 31);
        this.LJLIL.seekTo(this.LJZ);
        this.LJLJI.postDelayed(this.LLFFF, this.LJZI);
        this.LJLIL.start();
    }

    public final float LLIIIILZ() {
        return (6.0f / LLIIIZ()) * this.LLIIII;
    }

    public final float LLIIIJ() {
        return (3.0f / LLIIIZ()) * this.LLIIII;
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.LLFII.performClick();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        try {
            throw null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            super.onDestroy();
            this.LJLJI.removeCallbacks(this.LLFFF);
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onResume", true);
        super.onResume();
        if (this.LLIFFJFJJ) {
            C38816FLg.LIZJ(this.LLIIL);
            this.LLIFFJFJJ = false;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.LJLIL.stop();
            }
            this.LJLIL.release();
            this.LJLIL = null;
        }
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.InterfaceC26189APp
    public final void FI(boolean z) {
        DialogC25756A8y dialogC25756A8y;
        if (z && (dialogC25756A8y = this.LLIIJI) != null && dialogC25756A8y.isShowing()) {
            this.LLIIJI.dismiss();
            C26048AKe c26048AKe = new C26048AKe(this);
            c26048AKe.LIZJ(R.raw.icon_tick_circle);
            c26048AKe.LJ(R.attr.dj);
            c26048AKe.LJFF(R.string.tnd);
            c26048AKe.LIZIZ(500L);
            c26048AKe.LIZ(this.LLIL);
            c26048AKe.LJII();
        }
    }

    @Override // X.InterfaceC26315AUl
    public final void Ni(AvatarUri avatarUri) {
        C244379iT c244379iT = this.LLIIJLIL;
        if (c244379iT == null) {
            return;
        }
        String str = avatarUri.uri;
        c244379iT.LJ = TextUtils.isEmpty(str);
        c244379iT.LIZLLL = str;
        this.LLIIIZ.updateUserInfo(this.LLIIJLIL.LIZ());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        float f;
        if (this.LLFII != null && view.getId() == this.LLFII.getId()) {
            finish();
            return;
        }
        if (view.getId() == this.LLFZ.getId()) {
            if (C6ZT.LIZ(this.LLFZ)) {
                return;
            }
            C244309iM.LJ(new C244319iN(new C244329iO("click_save", C9WB.VIDEO_AVATAR)));
            this.LJLJI.removeCallbacks(this.LLFFF);
            this.LLFFF = null;
            try {
                if (this.LJLIL.isPlaying()) {
                    this.LJLIL.pause();
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            this.LLII = System.currentTimeMillis();
            ProgressDialogC43241Gy5 LIZIZ = ProgressDialogC43241Gy5.LIZIZ(this, getResources().getString(R.string.ra6));
            this.LLD = LIZIZ;
            LIZIZ.setIndeterminate(false);
            LLFII();
            C38816FLg.LJ(new ARunnableS43S0100000_7(this, 19));
            return;
        }
        if (view.getId() != R.id.j89) {
            return;
        }
        float f2 = 1.0f;
        if (this.LLIIIJ % 180 == 0) {
            f2 = (this.LJLJJL * 1.0f) / this.LJLJJLL;
            f = 1.0f;
        } else {
            f = (this.LJLJJL * 1.0f) / this.LJLJJLL;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C85519XhL(this, f, f2 - f));
        ofFloat.addListener(new ALAdapterS12S0100000_15(this, 0));
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        float LLIIIZ = LLIIIZ();
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onCreate", true);
        activityConfiguration(new AObjectS15S0001000_14(0, 0));
        super.onCreate(bundle);
        setContentView(R.layout.c2q);
        this.LJLLI = (FrameLayout) findViewById(R.id.kus);
        this.LLIIII = KL2.LJIIJJI(this) / 6;
        this.LLIIIL = (int) KL2.LIZJ(this, 2.0f);
        this.LJLJJI = ((AvatarCutActivityArgs) RouteArgExtension.INSTANCE.navArg(this, new AObjectS21S0001000_5(2, 1)).getValue()).getFilePath();
        this.LJLJI = (RelativeLayout) findViewById(R.id.aod);
        this.LJLLILLLL = (RecyclerView) findViewById(R.id.isf);
        this.LJLZ = (TextView) findViewById(R.id.mnh);
        this.LJLLJ = (FrameLayout) findViewById(R.id.j89);
        TextureView textureView = (TextureView) findViewById(R.id.kuj);
        this.LJLILLLLZI = textureView;
        textureView.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC85043XZf(this));
        int[] videoFileInfo = AVExternalServiceImpl.LIZ().abilityService().processService().getVideoFileInfo(this.LJLJJI);
        if (videoFileInfo[0] == 0) {
            int i = videoFileInfo[1];
            this.LJLJL = i;
            this.LJZI = i;
            this.LJLJJL = videoFileInfo[2];
            this.LJLJJLL = videoFileInfo[3];
            this.LLIIIILZ = LLIIIZ;
            int i2 = this.LJLJL;
            this.LJLJLLL = ((i2 + r1) - 1) / Math.round(LLIIIZ * 1000.0f);
            int i3 = videoFileInfo[4];
            int i4 = videoFileInfo[5];
            String str = this.LJLJJI;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.LJLLILLLL.getLayoutParams();
            layoutParams.width = KL2.LJIIJJI(this);
            int i5 = this.LLIIII;
            this.LL = i5 >> 1;
            layoutParams.leftMargin = 0;
            this.LJLLLLLL = i5;
            layoutParams.height = i5;
            this.LJLLILLLL.setLayoutParams(layoutParams);
            WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(0);
            this.LJLLILLLL.LJIIJJI(new IDrS53S0100000_15(this, 0));
            this.LJLLILLLL.setLayoutManager(wrapLinearLayoutManager);
            this.LJLLILLLL.setAdapter(new C42530Gmc(this, this.LJLLLLLL, this.LJZI, LLIIIZ, this.LJLJLJ, str, i3, i4, this.LJLJLLL));
            this.LJLLILLLL.LJIIJJI(new IDrS53S0100000_15(this, 1));
            KL2.LJIIIZ(this);
            int LJIIJJI = KL2.LJIIJJI(this);
            ViewGroup.LayoutParams layoutParams2 = this.LJLLI.getLayoutParams();
            layoutParams2.height = LJIIJJI;
            layoutParams2.width = LJIIJJI;
            this.LJLLI.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.LJLILLLLZI.getLayoutParams();
            layoutParams3.height = (int) (((LJIIJJI * 1.0d) * this.LJLJJLL) / this.LJLJJL);
            this.LJLILLLLZI.setLayoutParams(layoutParams3);
            TextView textView = (TextView) findViewById(R.id.aeg);
            this.LLFII = textView;
            C16880lQ.LJIJI(textView, this);
            TextView textView2 = (TextView) findViewById(R.id.h0u);
            this.LLFZ = textView2;
            C16880lQ.LJIJI(textView2, this);
            ImageView imageView = new ImageView(this);
            this.LJLLLL = imageView;
            imageView.setPadding(0, 0, this.LLIIIL, 0);
            this.LJLLLL.setScaleType(ImageView.ScaleType.FIT_XY);
            this.LJLJI.addView(this.LJLLLL);
            this.LJLLLL.setImageResource(R.drawable.byf);
            int LIZJ = (int) (KL2.LIZJ(this, 4.0f) + this.LLIIII);
            this.LJLJLJ = (int) ((LIZJ * 3.0d) / 26.0d);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(this.LJLJLJ + this.LLIIIL, LIZJ);
            layoutParams4.topMargin = (int) KL2.LIZJ(this, 5.0f);
            layoutParams4.addRule(10);
            layoutParams4.addRule(9);
            int i6 = this.LJLJLLL;
            if (i6 >= 5) {
                i6 = 5;
            }
            layoutParams4.leftMargin = (int) ((i6 * 1.0d * this.LLIIII) + this.LL);
            float f = this.LJZI;
            float f2 = this.LLIIIILZ;
            if (f < f2 * 5.0f * 1000.0f) {
                int round = Math.round(f % (f2 * 1000.0f));
                float f3 = this.LLIIIILZ * 1000.0f;
                layoutParams4.leftMargin -= (int) Math.ceil(((f3 - round) / f3) * layoutParams4.height);
            }
            this.LJZL = layoutParams4.leftMargin;
            if (SharePrefCache.inst().getLongVideoPermitted().LIZ().booleanValue() && this.LJZI >= 6000) {
                layoutParams4.leftMargin = Math.round(((this.LLIIII * 1.0f) / LLIIIZ) * 6) + this.LL;
            }
            this.LJLLLL.setLayoutParams(layoutParams4);
            this.LJLLLL.setTag("right");
            ImageView imageView2 = new ImageView(this);
            this.LJLLL = imageView2;
            imageView2.setPadding(this.LLIIIL, 0, 0, 0);
            this.LJLLL.setScaleType(ImageView.ScaleType.FIT_XY);
            this.LJLJI.addView(this.LJLLL);
            this.LJLLL.setImageResource(R.drawable.byf);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(this.LJLJLJ + this.LLIIIL, LIZJ);
            layoutParams5.addRule(10);
            layoutParams5.addRule(9);
            layoutParams5.topMargin = (int) KL2.LIZJ(this, 5.0f);
            layoutParams5.leftMargin = this.LL - this.LJLJLJ;
            this.LJLLL.setLayoutParams(layoutParams5);
            this.LJLLL.setOnTouchListener(this);
            this.LJLLLL.setOnTouchListener(this);
            this.LJLLL.setTag("left");
            this.LJLLILLLL.post(new ARunnableS51S0100000_15(this, 3));
            AvatarVideoPresenter avatarVideoPresenter = new AvatarVideoPresenter();
            this.LJLL = avatarVideoPresenter;
            avatarVideoPresenter.bindView((InterfaceC26315AUl) this);
            this.LJLL.initHeadVideoUploadHelper(this, null);
            UserPresenter userPresenter = new UserPresenter();
            this.LLIIIZ = userPresenter;
            this.LLIIJLIL = new C244379iT();
            userPresenter.bindView(this);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onCreate", false);
            return;
        }
        C5S1 c5s1 = new C5S1(this);
        c5s1.LIZJ(R.string.jei);
        c5s1.LJ();
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onCreate", false);
    }

    @Override // X.InterfaceC26315AUl
    public final void rr(Exception exc) {
        DialogC25756A8y dialogC25756A8y;
        if (!isFinishing() && (dialogC25756A8y = this.LLIIJI) != null && dialogC25756A8y.isShowing()) {
            this.LLIIJI.dismiss();
        }
        C36922EeM.LIZ(exc);
    }

    public final void LLFZ(int i, int i2) {
        int i3 = this.LLIIIL;
        int i4 = i + i3;
        int i5 = i2 - (i3 * 2);
        float f = 2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i5, (int) KL2.LIZJ(this, f));
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        layoutParams.leftMargin = i4;
        layoutParams.topMargin = (int) KL2.LIZJ(this, 5);
        this.LLF.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i5, (int) KL2.LIZJ(this, f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(9);
        layoutParams2.leftMargin = i4;
        layoutParams2.topMargin = ((int) KL2.LIZJ(this, 7)) + this.LJLLLLLL;
        this.LLFF.setLayoutParams(layoutParams2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
