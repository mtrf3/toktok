package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class CXQ extends HandlerThread implements Handler.Callback {
    public final C30712C3o LJLIL;
    public int LJLILLLLZI;
    public Bitmap LJLJI;
    public Bitmap LJLJJI;
    public Bitmap LJLJJL;
    public final Paint LJLJJLL;
    public final Rect LJLJL;
    public final Rect LJLJLJ;
    public Handler LJLJLLL;
    public boolean LJLL;
    public final LiveCore LJLLI;

    public final void LIZ() {
        try {
            Bitmap bitmap = this.LJLJJI;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.LJLJJI.recycle();
            }
            Bitmap bitmap2 = this.LJLJI;
            C30712C3o c30712C3o = this.LJLIL;
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, c30712C3o.LIZIZ, c30712C3o.LIZJ, false);
            this.LJLJJI = createScaledBitmap;
            NativeBlurFilter.iterativeBoxBlur(createScaledBitmap, 3, 10);
            Bitmap bitmap3 = this.LJLJJL;
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                this.LJLJJL.recycle();
            }
            int i = (int) (this.LJLIL.LIZIZ * 0.41935483f);
            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(this.LJLJI, i, i, false);
            this.LJLJJL = C15380j0.LJ(createScaledBitmap2);
            createScaledBitmap2.recycle();
            Handler handler = this.LJLJLLL;
            if (handler != null) {
                handler.sendEmptyMessage(233);
            }
        } catch (Exception e) {
            C0NB.LJ("interact", e.toString());
        }
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        this.LJLJLLL = new Handler(getLooper(), this);
        LIZ();
        W8E.LJII().LJI().LJ(W5O.LIZIZ(this.LJLIL.LIZ), null).LJ(new CXR(this), C79561VKj.LJLIL);
    }

    @Override // android.os.HandlerThread
    public final boolean quitSafely() {
        boolean quitSafely = super.quitSafely();
        Handler handler = this.LJLJLLL;
        if (handler != null) {
            handler.sendEmptyMessage(235);
        }
        return quitSafely;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        return true;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r9) {
        /*
            r8 = this;
            int r0 = r9.what
            r7 = 0
            r6 = 0
            r4 = 1
            switch(r0) {
                case 233: goto L46;
                case 234: goto L3f;
                case 235: goto L9;
                default: goto L8;
            }
        L8:
            return r4
        L9:
            r8.LJLL = r4
            android.graphics.Bitmap r0 = r8.LJLJI
            if (r0 == 0) goto L1c
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L1c
            android.graphics.Bitmap r0 = r8.LJLJI
            r0.recycle()
            r8.LJLJI = r6
        L1c:
            android.graphics.Bitmap r0 = r8.LJLJJI
            if (r0 == 0) goto L2d
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L2d
            android.graphics.Bitmap r0 = r8.LJLJJI
            r0.recycle()
            r8.LJLJJI = r6
        L2d:
            android.graphics.Bitmap r0 = r8.LJLJJL
            if (r0 == 0) goto L8
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L8
            android.graphics.Bitmap r0 = r8.LJLJJL
            r0.recycle()
            r8.LJLJJL = r6
            goto L8
        L3f:
            int r0 = r8.LJLILLLLZI
            if (r0 >= 0) goto L8
            r8.LJLILLLLZI = r7
            goto L8
        L46:
            boolean r0 = r8.LJLL
            if (r0 == 0) goto L4b
            goto L8
        L4b:
            X.C3o r0 = r8.LJLIL     // Catch: java.lang.Exception -> Lb4
            int r2 = r0.LIZIZ     // Catch: java.lang.Exception -> Lb4
            int r1 = r0.LIZJ     // Catch: java.lang.Exception -> Lb4
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Exception -> Lb4
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r2, r1, r0)     // Catch: java.lang.Exception -> Lb4
            android.graphics.Canvas r3 = new android.graphics.Canvas     // Catch: java.lang.Exception -> Lb4
            r3.<init>(r5)     // Catch: java.lang.Exception -> Lb4
            r3.save()     // Catch: java.lang.Exception -> Lb4
            X.C3o r0 = r8.LJLIL     // Catch: java.lang.Exception -> Lb4
            int r0 = r0.LIZJ     // Catch: java.lang.Exception -> Lb4
            float r1 = (float) r0     // Catch: java.lang.Exception -> Lb4
            r0 = 0
            r3.translate(r0, r1)     // Catch: java.lang.Exception -> Lb4
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.scale(r1, r0)     // Catch: java.lang.Exception -> Lb4
            android.graphics.Bitmap r0 = r8.LJLJJI     // Catch: java.lang.Exception -> Lb4
            boolean r0 = r0.isRecycled()     // Catch: java.lang.Exception -> Lb4
            if (r0 == 0) goto L8f
            android.graphics.Bitmap r0 = r8.LJLJI     // Catch: java.lang.Exception -> Lb4
            if (r0 == 0) goto L8f
            boolean r0 = r0.isRecycled()     // Catch: java.lang.Exception -> Lb4
            if (r0 != 0) goto L8f
            android.graphics.Bitmap r2 = r8.LJLJI     // Catch: java.lang.Exception -> Lb4
            X.C3o r0 = r8.LJLIL     // Catch: java.lang.Exception -> Lb4
            int r1 = r0.LIZIZ     // Catch: java.lang.Exception -> Lb4
            int r0 = r0.LIZJ     // Catch: java.lang.Exception -> Lb4
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r2, r1, r0, r7)     // Catch: java.lang.Exception -> Lb4
            r8.LJLJJI = r0     // Catch: java.lang.Exception -> Lb4
        L8f:
            android.graphics.Bitmap r1 = r8.LJLJJI     // Catch: java.lang.Exception -> Lb4
            android.graphics.Rect r0 = r8.LJLJL     // Catch: java.lang.Exception -> Lb4
            r3.drawBitmap(r1, r6, r0, r6)     // Catch: java.lang.Exception -> Lb4
            android.graphics.Bitmap r0 = r8.LJLJJL     // Catch: java.lang.Exception -> Lb4
            if (r0 == 0) goto La9
            boolean r0 = r0.isRecycled()     // Catch: java.lang.Exception -> Lb4
            if (r0 != 0) goto La9
            android.graphics.Bitmap r2 = r8.LJLJJL     // Catch: java.lang.Exception -> Lb4
            android.graphics.Rect r1 = r8.LJLJLJ     // Catch: java.lang.Exception -> Lb4
            android.graphics.Paint r0 = r8.LJLJJLL     // Catch: java.lang.Exception -> Lb4
            r3.drawBitmap(r2, r6, r1, r0)     // Catch: java.lang.Exception -> Lb4
        La9:
            r3.restore()     // Catch: java.lang.Exception -> Lb4
            com.ss.ttlivestreamer.livestreamv2.core.LiveCore r0 = r8.LJLLI     // Catch: java.lang.Exception -> Lb4
            if (r0 == 0) goto Lc4
            r0.setRadioModeBgBitmap(r5)     // Catch: java.lang.Exception -> Lb4
            goto Lc4
        Lb4:
            r1 = move-exception
            X.BPl r0 = X.C28733BPl.LJIILIIL()
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            r0.getClass()
            r0 = 6
            X.C0NE.LJIIL(r0, r1)
        Lc4:
            android.os.Handler r3 = r8.LJLJLLL
            if (r3 == 0) goto L8
            r2 = 233(0xe9, float:3.27E-43)
            r0 = 130(0x82, double:6.4E-322)
            r3.sendEmptyMessageDelayed(r2, r0)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CXQ.handleMessage(android.os.Message):boolean");
    }

    public CXQ(LiveCore liveCore, C30712C3o c30712C3o) {
        super("AudioEffectDrewThread");
        this.LJLILLLLZI = -1;
        this.LJLLI = liveCore;
        this.LJLIL = c30712C3o;
        this.LJLJL = new Rect(0, 0, c30712C3o.LIZIZ, c30712C3o.LIZJ);
        int i = c30712C3o.LIZIZ;
        int i2 = (int) (i * 0.41935483f);
        int i3 = (i - i2) / 2;
        int i4 = (int) ((c30712C3o.LIZJ - i2) / 2.4d);
        this.LJLJLJ = new Rect(i3, i4, i3 + i2, i2 + i4);
        Paint paint = new Paint(1);
        this.LJLJJLL = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        Paint paint2 = new Paint(1);
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        paint2.setDither(true);
        paint2.setColor(ColorProtector.parseColor("#80000000"));
        this.LJLJI = BitmapFactory.decodeResource(C15380j0.LIZLLL().getResources(), R.drawable.cqu);
    }
}
