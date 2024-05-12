package com.ss.android.ugc.aweme.nows.feed.ui;

import X.AbstractC193947jK;
import X.C193867jC;
import X.C194437k7;
import X.C195937mX;
import X.C196207my;
import X.C214348b8;
import X.C221108m2;
import X.C32151Nz;
import X.C3C8;
import X.C51029K0z;
import X.C61328O5c;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C7ML;
import X.C8XO;
import X.InterfaceC115514g7;
import X.InterfaceC193877jD;
import X.InterfaceC194547kI;
import X.InterfaceC74236TBo;
import X.TBT;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostCellViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class NowPostTypeAssem<ASSEM extends ReusedUISlotAssem<? extends C3C8>, T extends InterfaceC194547kI> extends ReusedUISlotAssem<ASSEM> implements C8XO<T>, InterfaceC193877jD {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFZ;
    public final InterfaceC115514g7 LLFF;
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;

    static {
        TBT tbt = new TBT(NowPostTypeAssem.class, "nowCellVM", "getNowCellVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowPostCellViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLFZ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    public abstract SmartImageView n4();

    public SmartImageView q4() {
        return null;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public NowPostTypeAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(NowPostCellViewModel.class);
        this.LLFF = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 623), null, C196207my.INSTANCE, null, null);
        this.LLFFF = C221108m2.LIZIZ(new AqS153S0100000_3((NowPostTypeAssem) this, 621));
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3((NowPostTypeAssem) this, 622));
    }

    public final Drawable m4() {
        return (Drawable) this.LLFFF.getValue();
    }

    public final NowPostCellViewModel p4() {
        return (NowPostCellViewModel) this.LLFF.LIZ(this, LLFZ[0]);
    }

    private final void r4() {
        SmartImageView q4 = q4();
        if (q4 != null) {
            q4.setVisibility(8);
        }
        SmartImageView q42 = q4();
        if (q42 != null) {
            q42.setImageDrawable(null);
        }
        n4().setImageDrawable(null);
    }

    @Override // X.InterfaceC193877jD
    public final void LLLLLLLZIL(C194437k7 nowPostCellState) {
        UrlModel urlModel;
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        SmartImageView q4 = q4();
        if (q4 != null) {
            q4.setVisibility(8);
        }
        SmartImageView n4 = n4();
        n4.setVisibility(0);
        C7ML c7ml = (C7ML) C51029K0z.LJIILLIIL(this);
        NowPostInfo nowPostInfo = ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().nowPostInfo;
        if (nowPostInfo != null) {
            urlModel = nowPostInfo.getFuzzyImage();
        } else {
            urlModel = null;
        }
        C195937mX.LJIIJJI(n4, c7ml, 0, urlModel, m4(), null, 48);
    }

    @Override // X.InterfaceC193877jD
    public final void LLLZIL(C194437k7 nowPostCellState) {
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        r4();
        n4().setVisibility(8);
    }

    @Override // X.InterfaceC193877jD
    public final void LLZL(C194437k7 nowPostCellState) {
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        r4();
        n4().setVisibility(0);
        n4().setImageDrawable((Drawable) this.LLFII.getValue());
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(Object obj) {
        return true;
    }

    public void t1(C194437k7 nowPostCellState) {
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
    }

    public void x1(C194437k7 nowPostCellState) {
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
    }

    @Override // X.InterfaceC193877jD
    public final void y1(C194437k7 nowPostCellState) {
        final Bitmap bitmap;
        final Bitmap bitmap2;
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        NowPostInfo nowPostInfo = ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().nowPostInfo;
        SmartImageView q4 = q4();
        if (q4 != null) {
            C195937mX.LIZIZ(q4, nowPostInfo, 0);
        }
        SmartImageView q42 = q4();
        final Float f = null;
        if (q42 != null) {
            q42.setImageDrawable(null);
            q42.setImageDrawable(null);
        }
        final SmartImageView q43 = q4();
        if (q43 != null) {
            if (nowPostInfo != null) {
                bitmap2 = nowPostInfo.getFrontBitmap();
            } else {
                bitmap2 = null;
            }
            final float LJIIZILJ = C32151Nz.LJIIZILJ(18);
            final Float LIZJ = C61328O5c.LIZJ(2);
            if (bitmap2 != null) {
                q43.post(new Runnable() { // from class: X.4mu
                    public final void LIZ() {
                        if (SmartImageView.this.getMeasuredWidth() <= 0 || SmartImageView.this.getMeasuredHeight() <= 0) {
                            SmartImageView.this.setImageBitmap(bitmap2);
                            return;
                        }
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, SmartImageView.this.getMeasuredWidth(), SmartImageView.this.getMeasuredHeight(), false);
                        Bitmap createBitmap = Bitmap.createBitmap(SmartImageView.this.getMeasuredWidth(), SmartImageView.this.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint();
                        Rect rect = new Rect(0, 0, SmartImageView.this.getMeasuredWidth(), SmartImageView.this.getMeasuredHeight());
                        RectF rectF = new RectF(rect);
                        paint.setAntiAlias(true);
                        paint.setColor(-1);
                        paint.setStyle(Paint.Style.FILL);
                        canvas.drawARGB(0, 0, 0, 0);
                        float f2 = LJIIZILJ;
                        canvas.drawRoundRect(rectF, f2, f2, paint);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        canvas.drawBitmap(createScaledBitmap, rect, rect, paint);
                        Float f3 = LIZJ;
                        if (f3 != null) {
                            float f4 = LJIIZILJ;
                            f3.floatValue();
                            paint.setColor(-16777216);
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setStrokeWidth(f3.floatValue());
                            canvas.drawRoundRect(rectF, f4, f4, paint);
                        }
                        SmartImageView.this.setImageBitmap(createBitmap);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ;
                        try {
                            LIZ();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
        }
        n4().setVisibility(0);
        SmartImageView n4 = n4();
        Drawable m4 = m4();
        o.LJIIIZ(n4, "<this>");
        n4.setImageDrawable(null);
        n4.setImageDrawable(m4);
        final SmartImageView n42 = n4();
        if (nowPostInfo != null) {
            bitmap = nowPostInfo.getBackBitmap();
        } else {
            bitmap = null;
        }
        final float LJIIZILJ2 = C32151Nz.LJIIZILJ(28);
        o.LJIIIZ(n42, "<this>");
        if (bitmap == null) {
            return;
        }
        n42.post(new Runnable() { // from class: X.4mu
            public final void LIZ() {
                if (SmartImageView.this.getMeasuredWidth() <= 0 || SmartImageView.this.getMeasuredHeight() <= 0) {
                    SmartImageView.this.setImageBitmap(bitmap);
                    return;
                }
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, SmartImageView.this.getMeasuredWidth(), SmartImageView.this.getMeasuredHeight(), false);
                Bitmap createBitmap = Bitmap.createBitmap(SmartImageView.this.getMeasuredWidth(), SmartImageView.this.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                Rect rect = new Rect(0, 0, SmartImageView.this.getMeasuredWidth(), SmartImageView.this.getMeasuredHeight());
                RectF rectF = new RectF(rect);
                paint.setAntiAlias(true);
                paint.setColor(-1);
                paint.setStyle(Paint.Style.FILL);
                canvas.drawARGB(0, 0, 0, 0);
                float f2 = LJIIZILJ2;
                canvas.drawRoundRect(rectF, f2, f2, paint);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(createScaledBitmap, rect, rect, paint);
                Float f3 = f;
                if (f3 != null) {
                    float f4 = LJIIZILJ2;
                    f3.floatValue();
                    paint.setColor(-16777216);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(f3.floatValue());
                    canvas.drawRoundRect(rectF, f4, f4, paint);
                }
                SmartImageView.this.setImageBitmap(createBitmap);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    LIZ();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(Object obj) {
    }

    @Override // X.InterfaceC194257jp
    public void LLIIJLIL(AbstractC193947jK abstractC193947jK, C194437k7 c194437k7) {
        C193867jC.LIZ(this, abstractC193947jK, c194437k7);
    }
}
