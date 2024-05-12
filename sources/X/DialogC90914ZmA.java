package X;

import Y.IDCListenerS136S0100000_24;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.ZmA, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class DialogC90914ZmA extends DialogInterfaceC39771hF {
    public static final int LLJJIJIL = (int) TimeUnit.SECONDS.toMillis(30);
    public final ZY5 LJLJJI;
    public final C90579Zgl LJLJJL;
    public final ZY4 LJLJJLL;
    public final Context LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public Button LJLLI;
    public Button LJLLILLLL;
    public ImageButton LJLLJ;
    public C90571Zgd LJLLL;
    public FrameLayout LJLLLL;
    public LinearLayout LJLLLLLL;
    public FrameLayout LJLZ;
    public FrameLayout LJZ;
    public ImageView LJZI;
    public TextView LJZL;
    public TextView LL;
    public TextView LLD;
    public final boolean LLF;
    public LinearLayout LLFF;
    public RelativeLayout LLFFF;
    public LinearLayout LLFII;
    public View LLFZ;
    public ZX7 LLI;
    public ZXH LLIFFJFJJ;
    public List<ZY4> LLII;
    public java.util.Set<ZY4> LLIIII;
    public java.util.Set<ZY4> LLIIIILZ;
    public java.util.Set<ZY4> LLIIIJ;
    public SeekBar LLIIIL;
    public ZXG LLIIIZ;
    public ZY4 LLIIJI;
    public int LLIIJLIL;
    public int LLIIL;
    public int LLIILII;
    public final int LLIILZL;
    public java.util.Map<ZY4, SeekBar> LLIIZ;
    public MediaControllerCompat LLIL;
    public final C90578Zgk LLILII;
    public PlaybackStateCompat LLILIL;
    public MediaDescriptionCompat LLILL;
    public AsyncTaskC90577Zgj LLILLIZIL;
    public Bitmap LLILLJJLI;
    public android.net.Uri LLILLL;
    public boolean LLILZ;
    public Bitmap LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public Interpolator LLJJ;
    public final Interpolator LLJJI;
    public final Interpolator LLJJIII;
    public final AccessibilityManager LLJJIJI;
    public final Runnable LLJJIJIIJIL;

    public final boolean LJIL() {
        if (this.LLILL != null || this.LLILIL != null) {
            return true;
        }
        return false;
    }

    public final void LJJIIJZLJL() {
        Bitmap bitmap;
        Bitmap bitmap2;
        android.net.Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.LLILL;
        android.net.Uri uri2 = null;
        if (mediaDescriptionCompat == null) {
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.mIcon;
            uri2 = mediaDescriptionCompat.mIconUri;
        }
        AsyncTaskC90577Zgj asyncTaskC90577Zgj = this.LLILLIZIL;
        if (asyncTaskC90577Zgj == null) {
            bitmap2 = this.LLILLJJLI;
            uri = this.LLILLL;
        } else {
            bitmap2 = asyncTaskC90577Zgj.LIZ;
            uri = asyncTaskC90577Zgj.LIZIZ;
        }
        if (bitmap2 == bitmap) {
            if (bitmap2 != null) {
                return;
            }
            if (uri != null) {
                if (uri.equals(uri2)) {
                    return;
                }
            } else if (uri2 == null) {
                return;
            }
        }
        AsyncTaskC90577Zgj asyncTaskC90577Zgj2 = this.LLILLIZIL;
        if (asyncTaskC90577Zgj2 != null) {
            asyncTaskC90577Zgj2.cancel(true);
        }
        AsyncTaskC90577Zgj asyncTaskC90577Zgj3 = new AsyncTaskC90577Zgj(this);
        this.LLILLIZIL = asyncTaskC90577Zgj3;
        asyncTaskC90577Zgj3.execute1(new Void[0]);
    }

    public final void LJJIIZ() {
        int LIZ = ZXL.LIZ(this.LJLJL);
        getWindow().setLayout(LIZ, -2);
        View decorView = getWindow().getDecorView();
        this.LJLL = (LIZ - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.LJLJL.getResources();
        this.LLIIJLIL = resources.getDimensionPixelSize(R.dimen.af);
        this.LLIIL = resources.getDimensionPixelSize(R.dimen.ae);
        this.LLIILII = resources.getDimensionPixelSize(R.dimen.ag);
        this.LLILLJJLI = null;
        this.LLILLL = null;
        LJJIIJZLJL();
        LJJIIJ(false);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.LJLJJI.LJI(this.LJLJJL);
        LJJIII(null);
        this.LJLJLLL = false;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLJLLL = true;
        this.LJLJJI.LIZ(C90101ZXt.LIZJ, this.LJLJJL, 2);
        this.LJLJJI.getClass();
        LJJIII(ZY5.LIZLLL());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC90914ZmA(android.content.Context r5) {
        /*
            r4 = this;
            r1 = 1
            android.content.Context r3 = X.ZXT.LIZ(r5, r1)
            int r0 = X.ZXT.LIZIZ(r3)
            r4.<init>(r3, r0)
            r4.LLF = r1
            Y.IDRunnableS86S0100000_24 r1 = new Y.IDRunnableS86S0100000_24
            r0 = 1
            r1.<init>(r4, r0)
            r4.LLJJIJIIJIL = r1
            android.content.Context r2 = r4.getContext()
            r4.LJLJL = r2
            X.Zgk r0 = new X.Zgk
            r0.<init>(r4)
            r4.LLILII = r0
            X.ZY5 r0 = X.ZY5.LIZJ(r2)
            r4.LJLJJI = r0
            X.Zgl r0 = new X.Zgl
            r0.<init>(r4)
            r4.LJLJJL = r0
            X.ZY4 r0 = X.ZY5.LJ()
            r4.LJLJJLL = r0
            android.support.v4.media.session.MediaSessionCompat$Token r0 = X.ZY5.LIZLLL()
            r4.LJJIII(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 1812267052(0x6c05002c, float:6.431518E26)
            int r0 = r1.getDimensionPixelSize(r0)
            r4.LLIILZL = r0
            java.lang.String r0 = "accessibility"
            java.lang.Object r0 = X.C16880lQ.LLILL(r2, r0)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r4.LLJJIJI = r0
            r0 = 1812529153(0x6c090001, float:6.624914E26)
            android.view.animation.Interpolator r0 = android.view.animation.AnimationUtils.loadInterpolator(r3, r0)
            r4.LLJJI = r0
            r0 = 1812529152(0x6c090000, float:6.6249135E26)
            android.view.animation.Interpolator r0 = android.view.animation.AnimationUtils.loadInterpolator(r3, r0)
            r4.LLJJIII = r0
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC90914ZmA.<init>(android.content.Context):void");
    }

    public final void LJJ(boolean z) {
        java.util.Set<ZY4> set;
        int firstVisiblePosition = this.LLI.getFirstVisiblePosition();
        for (int i = 0; i < this.LLI.getChildCount(); i++) {
            View childAt = this.LLI.getChildAt(i);
            ZY4 item = this.LLIFFJFJJ.getItem(firstVisiblePosition + i);
            if (!z || (set = this.LLIIII) == null || !((HashSet) set).contains(item)) {
                childAt.findViewById(R.id.bz).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        Iterator it = ((ArrayList) this.LLI.LJLIL).iterator();
        while (it.hasNext()) {
            ZX6 zx6 = (ZX6) it.next();
            zx6.LJIIJ = true;
            zx6.LJIIJJI = true;
            ZX5 zx5 = zx6.LJIIL;
            if (zx5 != null) {
                C90576Zgi c90576Zgi = (C90576Zgi) zx5;
                ((HashSet) c90576Zgi.LIZIZ.LLIIIJ).remove(c90576Zgi.LIZ);
                c90576Zgi.LIZIZ.LLIFFJFJJ.notifyDataSetChanged();
            }
        }
        if (!z) {
            LJJI(false);
        }
    }

    public final void LJJI(boolean z) {
        this.LLIIII = null;
        this.LLIIIILZ = null;
        this.LLJI = false;
        if (this.LLJIJIL) {
            this.LLJIJIL = false;
            LJJIIZI(z);
        }
        this.LLI.setEnabled(true);
    }

    public final int LJJIFFI(boolean z) {
        if (!z && this.LLFII.getVisibility() != 0) {
            return 0;
        }
        int paddingTop = 0 + this.LLFF.getPaddingTop() + this.LLFF.getPaddingBottom();
        if (z) {
            paddingTop += this.LLFFF.getMeasuredHeight();
        }
        if (this.LLFII.getVisibility() == 0) {
            paddingTop += this.LLFII.getMeasuredHeight();
        }
        if (z && this.LLFII.getVisibility() == 0) {
            return paddingTop + this.LLFZ.getMeasuredHeight();
        }
        return paddingTop;
    }

    public final void LJJIII(MediaSessionCompat.Token token) {
        MediaDescriptionCompat LIZIZ;
        MediaControllerCompat mediaControllerCompat = this.LLIL;
        PlaybackStateCompat playbackStateCompat = null;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.LIZJ(this.LLILII);
            this.LLIL = null;
        }
        if (token == null || !this.LJLJLLL) {
            return;
        }
        MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.LJLJL, token);
        this.LLIL = mediaControllerCompat2;
        mediaControllerCompat2.LIZIZ(this.LLILII);
        MediaMetadataCompat LIZ = this.LLIL.LIZ();
        if (LIZ == null) {
            LIZIZ = null;
        } else {
            LIZIZ = LIZ.LIZIZ();
        }
        this.LLILL = LIZIZ;
        MediaControllerCompat.MediaControllerImplApi21 mediaControllerImplApi21 = this.LLIL.LIZ;
        if (mediaControllerImplApi21.LJ.LIZ() != null) {
            try {
                playbackStateCompat = mediaControllerImplApi21.LJ.LIZ().LJIIZILJ();
            } catch (RemoteException unused) {
            }
            this.LLILIL = playbackStateCompat;
            LJJIIJZLJL();
            LJJIIJ(false);
        }
        PlaybackState playbackState = mediaControllerImplApi21.LIZ.getPlaybackState();
        if (playbackState != null) {
            playbackStateCompat = PlaybackStateCompat.LIZ(playbackState);
        }
        this.LLILIL = playbackStateCompat;
        LJJIIJZLJL();
        LJJIIJ(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ(boolean r10) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC90914ZmA.LJJIIJ(boolean):void");
    }

    public final void LJJIIZI(boolean z) {
        this.LJLZ.requestLayout();
        this.LJLZ.getViewTreeObserver().addOnGlobalLayoutListener(new ZXE(this, z));
    }

    public final void LJJIJ(boolean z) {
        int i;
        View view = this.LLFZ;
        int i2 = 0;
        if (this.LLFII.getVisibility() == 0 && z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        LinearLayout linearLayout = this.LLFF;
        if (this.LLFII.getVisibility() == 8 && !z) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
    }

    @Override // X.DialogInterfaceC39771hF, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        Interpolator interpolator;
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setContentView(R.layout.o);
        findViewById(android.R.id.button3).setVisibility(8);
        ZXF zxf = new ZXF(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.b_);
        this.LJLLLL = frameLayout;
        C16880lQ.LJIILJJIL(frameLayout, new IDCListenerS136S0100000_24(this, 0));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.b9);
        this.LJLLLLLL = linearLayout;
        C16880lQ.LJIIZILJ(linearLayout, new ZXD());
        Context context = this.LJLJL;
        int LJI = ZXT.LJI(R.attr.a4r, context);
        if (C07290Qj.LJI(LJI, ZXT.LJI(android.R.attr.colorBackground, context)) < 3.0d) {
            LJI = ZXT.LJI(R.attr.a4e, context);
        }
        Button button = (Button) findViewById(android.R.id.button2);
        this.LJLLI = button;
        button.setText(R.string.au);
        this.LJLLI.setTextColor(LJI);
        C16880lQ.LJIILIIL(this.LJLLI, zxf);
        Button button2 = (Button) findViewById(android.R.id.button1);
        this.LJLLILLLL = button2;
        button2.setText(R.string.b1);
        this.LJLLILLLL.setTextColor(LJI);
        C16880lQ.LJIILIIL(this.LJLLILLLL, zxf);
        this.LLD = (TextView) findViewById(R.id.bd);
        C16880lQ.LJIILL((ImageButton) findViewById(R.id.b1), zxf);
        this.LJZ = (FrameLayout) findViewById(R.id.b7);
        this.LJLZ = (FrameLayout) findViewById(R.id.b8);
        IDCListenerS136S0100000_24 iDCListenerS136S0100000_24 = new IDCListenerS136S0100000_24(this, 1);
        ImageView imageView = (ImageView) findViewById(R.id.aa);
        this.LJZI = imageView;
        C16880lQ.LJIILLIIL(imageView, iDCListenerS136S0100000_24);
        C16880lQ.LJIIJ(iDCListenerS136S0100000_24, findViewById(R.id.b6));
        this.LLFF = (LinearLayout) findViewById(R.id.bc);
        this.LLFZ = findViewById(R.id.b2);
        this.LLFFF = (RelativeLayout) findViewById(R.id.bk);
        this.LJZL = (TextView) findViewById(R.id.b5);
        this.LL = (TextView) findViewById(R.id.b4);
        ImageButton imageButton = (ImageButton) findViewById(R.id.b3);
        this.LJLLJ = imageButton;
        C16880lQ.LJIILL(imageButton, zxf);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.bm);
        this.LLFII = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.bp);
        this.LLIIIL = seekBar;
        seekBar.setTag(this.LJLJJLL);
        ZXG zxg = new ZXG(this);
        this.LLIIIZ = zxg;
        this.LLIIIL.setOnSeekBarChangeListener(zxg);
        this.LLI = (ZX7) findViewById(R.id.bn);
        this.LLII = new ArrayList();
        ZXH zxh = new ZXH(this, this.LLI.getContext(), this.LLII);
        this.LLIFFJFJJ = zxh;
        this.LLI.setAdapter((ListAdapter) zxh);
        this.LLIIIJ = new HashSet();
        Context context2 = this.LJLJL;
        LinearLayout linearLayout3 = this.LLFF;
        ZX7 zx7 = this.LLI;
        boolean LJ = this.LJLJJLL.LJ();
        int LJI2 = ZXT.LJI(R.attr.a4r, context2);
        int LJI3 = ZXT.LJI(R.attr.a4s, context2);
        if (LJ && ZXT.LIZJ(context2) == -570425344) {
            LJI3 = LJI2;
            LJI2 = -1;
        }
        linearLayout3.setBackgroundColor(LJI2);
        zx7.setBackgroundColor(LJI3);
        linearLayout3.setTag(Integer.valueOf(LJI2));
        zx7.setTag(Integer.valueOf(LJI3));
        ZXT.LJIIJJI(this.LJLJL, (C90572Zge) this.LLIIIL, this.LLFF);
        HashMap hashMap = new HashMap();
        this.LLIIZ = hashMap;
        hashMap.put(this.LJLJJLL, this.LLIIIL);
        C90571Zgd c90571Zgd = (C90571Zgd) findViewById(R.id.ba);
        this.LJLLL = c90571Zgd;
        c90571Zgd.setOnClickListener(new ViewOnClickListenerC13880ga(new IDCListenerS136S0100000_24(this, 2)));
        if (this.LLJ) {
            interpolator = this.LLJJI;
        } else {
            interpolator = this.LLJJIII;
        }
        this.LLJJ = interpolator;
        this.LLJILJIL = this.LJLJL.getResources().getInteger(R.integer.c);
        this.LLJILJILJ = this.LJLJL.getResources().getInteger(R.integer.d);
        this.LLJILLL = this.LJLJL.getResources().getInteger(R.integer.e);
        this.LJLJLJ = true;
        LJJIIZ();
    }

    public static void LJJII(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public final void LJIJJLI(int i, View view) {
        ZXI zxi = new ZXI(view.getLayoutParams().height, i, view);
        zxi.setDuration(this.LLJILJIL);
        zxi.setInterpolator(this.LLJJ);
        view.startAnimation(zxi);
    }

    @Override // X.DialogInterfaceC39771hF, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2;
        if (i == 25 || i == 24) {
            ZY4 zy4 = this.LJLJJLL;
            if (i == 25) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            zy4.LJIIJ(i2);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.DialogInterfaceC39771hF, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
