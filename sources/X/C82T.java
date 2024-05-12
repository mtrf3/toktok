package X;

import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.experiment.ExpandVideoConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.82T, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C82T extends C82N {
    public final ViewGroup LJIIZILJ;
    public final ViewOnTouchListenerC82716WdE LJIJ;
    public final FrameLayout LJIJI;
    public final C82X LJIJJ;
    public final C82W LJIJJLI;

    @Override // X.C82N
    public final Bitmap LIZJ() {
        Drawable drawable;
        if (this.LJIILJJIL < 0 || (drawable = this.LJIJ.getDrawable()) == null) {
            return null;
        }
        return C1DH.LJJIZ(drawable, this.LJIILJJIL, this.LJIILL, C82P.LJIIL);
    }

    @Override // X.C82N
    public final void LJI() {
        float f;
        ViewGroup viewGroup;
        View childAt;
        RectF rectF = new RectF();
        this.LJIJ.getHierarchy().LJIIJ(rectF);
        rectF.top = this.LJIJ.getTranslationY() + rectF.top;
        rectF.bottom = this.LJIJ.getTranslationY() + rectF.bottom;
        int[] iArr = new int[2];
        ViewGroup viewGroup2 = this.LJI;
        if (viewGroup2 != null && (viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.hos)) != null && (childAt = viewGroup.getChildAt(0)) != null) {
            childAt.getLocationOnScreen(iArr);
        }
        if (iArr[1] != 0) {
            int[] iArr2 = new int[2];
            this.LJIIZILJ.getLocationOnScreen(iArr2);
            iArr[1] = iArr[1] - iArr2[1];
        }
        FrameLayout frameLayout = this.LJIJI;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = (int) rectF.top;
        int i = iArr[1];
        if (i == 0 || rectF.bottom <= i) {
            f = rectF.bottom;
        } else {
            f = i;
        }
        marginLayoutParams.height = (int) ((f - rectF.top) - C7MY.LIZIZ(8));
        frameLayout.setLayoutParams(marginLayoutParams);
    }

    @Override // X.C82N
    public final Drawable LJIIIIZZ() {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap = C2049182l.LIZ;
        InterfaceC78716Uuu interfaceC78716Uuu = null;
        if (bitmap != null) {
            Resources resources = this.LJIIIZ.getResources();
            o.LJIIIIZZ(resources, "context.resources");
            bitmapDrawable = new BitmapDrawable(resources, bitmap);
        } else {
            bitmapDrawable = null;
        }
        C2049182l.LIZ = null;
        if (bitmapDrawable != null) {
            LJIIJJI(bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight(), null);
            V92 hierarchy = this.LJIJ.getHierarchy();
            V92 hierarchy2 = this.LJIJ.getHierarchy();
            if (hierarchy2.LJIIJJI(2) instanceof C79265V8z) {
                interfaceC78716Uuu = hierarchy2.LJIIL(2).LJLJJL;
            }
            hierarchy.LJIJJ(bitmapDrawable, interfaceC78716Uuu);
        }
        return bitmapDrawable;
    }

    @Override // X.C82N
    public final void LJIIIZ() {
        if (this.LJIILJJIL != -1 || this.LJIIJJI == null || this.LJIJ.getHierarchy().LJ.LIZ(1) != null) {
            return;
        }
        this.LJIJJLI.LJI();
    }

    @Override // X.C82N
    public final void LJIIJ() {
        ConstraintLayout constraintLayout;
        InterfaceC161306Us interfaceC161306Us;
        super.LJIIJ();
        C82X c82x = this.LJIJJ;
        C161266Uo c161266Uo = c82x.LIZLLL;
        if (c161266Uo != null && (interfaceC161306Us = c161266Uo.LJLIL) != null) {
            interfaceC161306Us.destroy();
        }
        C161266Uo c161266Uo2 = c82x.LIZLLL;
        if (c161266Uo2 != null) {
            c161266Uo2.setVisibility(8);
        }
        this.LJIJ.setTouchEnabled(false);
        if (!C83A.LIZ()) {
            View view = this.LIZ;
            if ((view instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view) != null) {
                AnonymousClass064 LIZ = C57396Mfo.LIZ(constraintLayout);
                LIZ.LJIILL(R.id.hot).LIZLLL.LJJJJZI = 1.0f;
                LIZ.LIZIZ(constraintLayout);
            }
        }
        this.LJIJ.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.LJIJ.setActualImageScaleType(EnumC72807Shn.CENTER_CROP);
    }

    @Override // X.C82N
    public final C82P LJ() {
        return this.LJIJJLI;
    }

    @Override // X.C82N
    public final void LJFF(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        LJIIL(bitmap.getWidth(), bitmap.getHeight(), bitmap);
    }

    public final void LJIIJJI(int i, int i2, Bitmap bitmap) {
        float f;
        EnumC72807Shn enumC72807Shn;
        OSZ osz;
        OSZ osz2;
        Aweme aweme;
        List<InteractStickerStruct> interactStickerStructs;
        int height;
        String str;
        ConstraintLayout constraintLayout;
        VideoItemParams Ig;
        EnumC2053484c LIZ = C2053384b.LIZ(this.LJIIIZ, LIZIZ());
        ImageView.ScaleType scaleType = C2049182l.LIZIZ(C2049182l.LIZ(Integer.valueOf(i), Integer.valueOf(i2)), LIZ);
        ArrayList arrayList = null;
        if (!this.LJFF.Vf() && (!((Boolean) C2048782h.LIZ.getValue()).booleanValue() || ((Ig = this.LJFF.Ig()) != null && !C78963Uyt.LJJIII(Ig)))) {
            Aweme LIZIZ = LIZIZ();
            int i3 = this.LIZJ;
            if (this.LIZ.getHeight() == 0) {
                height = C63081OpJ.LJJJJJL(this.LJIIIZ);
            } else {
                height = this.LIZ.getHeight();
            }
            f = C2049182l.LIZJ(scaleType, LIZ, height, LIZIZ, i3);
            View view = this.LIZ;
            if ((view instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view) != null) {
                AnonymousClass064 LIZ2 = C57396Mfo.LIZ(constraintLayout);
                LIZ2.LJIILL(R.id.hot).LIZLLL.LJJJJZI = f;
                LIZ2.LIZIZ(constraintLayout);
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("ViewHolder awemeId: ");
            Aweme LIZIZ2 = LIZIZ();
            if (LIZIZ2 != null) {
                str = LIZIZ2.getAid();
            } else {
                str = null;
            }
            LIZ3.append(str);
            LIZ3.append(", heightPercent: ");
            LIZ3.append(f);
            LIZ3.append(", scaleType: ");
            LIZ3.append(scaleType);
            LIZ3.append(", position: ");
            LIZ3.append(this.LIZJ);
            LIZ3.append(", longTextType: ");
            LIZ3.append(LIZ);
            X1D.LIZIZ(LIZ3);
        } else {
            f = 1.0f;
        }
        if (bitmap != null) {
            this.LJIJ.setScaleType(scaleType);
            this.LJIJ.setImageBitmap(bitmap);
        } else {
            ViewOnTouchListenerC82716WdE viewOnTouchListenerC82716WdE = this.LJIJ;
            switch (C2050082u.LIZ[scaleType.ordinal()]) {
                case 1:
                    enumC72807Shn = EnumC72807Shn.FIT_XY;
                    break;
                case 2:
                    enumC72807Shn = EnumC72807Shn.FIT_START;
                    break;
                case 3:
                    enumC72807Shn = EnumC72807Shn.FIT_CENTER;
                    break;
                case 4:
                    enumC72807Shn = EnumC72807Shn.FIT_END;
                    break;
                case 5:
                    enumC72807Shn = EnumC72807Shn.CENTER;
                    break;
                case 6:
                    enumC72807Shn = EnumC72807Shn.CENTER_CROP;
                    break;
                case 7:
                    enumC72807Shn = EnumC72807Shn.CENTER_INSIDE;
                    break;
                default:
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("Unsupported scale type ");
                    LIZ4.append(scaleType);
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ4));
            }
            viewOnTouchListenerC82716WdE.setActualImageScaleType(enumC72807Shn);
        }
        if (C188907bC.LIZ()) {
            C82X c82x = this.LJIJJ;
            VideoItemParams Ig2 = this.LJFF.Ig();
            if (Ig2 != null && (aweme = Ig2.getAweme()) != null && (interactStickerStructs = aweme.getInteractStickerStructs()) != null) {
                arrayList = new ArrayList();
                for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                    InteractStickerStruct interactStickerStruct2 = interactStickerStruct;
                    if (interactStickerStruct2.getNoGlobal() && interactStickerStruct2.getMaterialIndex() == this.LIZJ) {
                        arrayList.add(interactStickerStruct);
                    }
                }
            }
            float f2 = this.LJIILJJIL / this.LJIILL;
            boolean Vf = this.LJFF.Vf();
            c82x.getClass();
            o.LJIIIZ(scaleType, "scaleType");
            if (arrayList != null && !arrayList.isEmpty()) {
                if (c82x.LIZLLL == null) {
                    View findViewById = c82x.LIZ.findViewById(R.id.hox);
                    o.LJII(findViewById, "null cannot be cast to non-null type android.view.ViewStub");
                    ((ViewStub) findViewById).inflate();
                    c82x.LIZLLL = (C161266Uo) c82x.LIZ.findViewById(R.id.hov);
                }
                if (Vf) {
                    Context context = c82x.LIZ.getContext();
                    o.LJIIIIZZ(context, "itemView.context");
                    float LJIILJJIL = C77119UOl.LJIILJJIL(context);
                    osz = new OSZ(Float.valueOf(LJIILJJIL), Float.valueOf((LJIILJJIL * 4.0f) / 3.0f));
                } else {
                    osz = new OSZ(Float.valueOf(c82x.LIZ.getWidth()), Float.valueOf(c82x.LIZ.getHeight() * f));
                }
                float floatValue = ((Number) osz.getFirst()).floatValue();
                float floatValue2 = ((Number) osz.getSecond()).floatValue();
                float f3 = floatValue / floatValue2;
                if (scaleType == ImageView.ScaleType.FIT_CENTER) {
                    if (f2 < f3) {
                        osz2 = new OSZ(Float.valueOf(f2 * floatValue2), Float.valueOf(floatValue2));
                    } else {
                        osz2 = new OSZ(Float.valueOf(floatValue), Float.valueOf(floatValue / f2));
                    }
                } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    if (f2 < f3) {
                        osz2 = new OSZ(Float.valueOf(floatValue), Float.valueOf(floatValue / f2));
                    } else {
                        osz2 = new OSZ(Float.valueOf(f2 * floatValue2), Float.valueOf(floatValue2));
                    }
                } else {
                    osz2 = new OSZ(Float.valueOf(floatValue), Float.valueOf(floatValue2));
                }
                C161266Uo c161266Uo = c82x.LIZLLL;
                if (c161266Uo != null) {
                    C161266Uo.LIZ(c161266Uo, new RectF(0.0f, 0.0f, ((Number) osz2.getFirst()).floatValue(), ((Number) osz2.getSecond()).floatValue()));
                }
                C161266Uo c161266Uo2 = c82x.LIZLLL;
                if (c161266Uo2 != null) {
                    C161266Uo.LIZJ(c161266Uo2, c82x.LIZJ);
                }
                C161266Uo c161266Uo3 = c82x.LIZLLL;
                if (c161266Uo3 != null) {
                    c161266Uo3.LIZIZ(c82x.LIZIZ, arrayList);
                }
                C161266Uo c161266Uo4 = c82x.LIZLLL;
                if (c161266Uo4 != null) {
                    c161266Uo4.setVisibility(0);
                }
            }
        }
        this.LJIJ.postDelayed(new ARunnableS39S0100000_3(this, 222), 100L);
    }

    public final void LJIIL(final int i, final int i2, Bitmap bitmap) {
        PhotoModeImage LJJIII;
        Aweme LIZIZ;
        PhotoModeImageInfo photoModeImageInfo;
        this.LJIJ.setTouchEnabled(true);
        C38995FSd.LIZLLL().submit(new Runnable() { // from class: X.82H
            public final void LIZ() {
                Integer num;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("index=");
                C82I c82i = C82N.this.LJIIJJI;
                String str = null;
                if (c82i != null) {
                    num = Integer.valueOf(c82i.LIZ);
                } else {
                    num = null;
                }
                LIZ.append(num);
                LIZ.append(", imageWidth=");
                LIZ.append(i);
                LIZ.append(", imageHeight=");
                LIZ.append(i2);
                LIZ.append(", calculateScreenWidth=");
                C82N.this.getClass();
                LIZ.append(C53946LFe.LIZJ(C82N.this.LJIIIZ, null));
                LIZ.append(", aid=");
                Aweme LIZIZ2 = C82N.this.LIZIZ();
                if (LIZIZ2 != null) {
                    str = LIZIZ2.getAid();
                }
                C1FJ.LJFF(LIZ, str, LIZ, 6, "PhotoMode");
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
        Aweme LIZIZ2 = LIZIZ();
        if (LIZIZ2 != null && (LJJIII = C62819Ol5.LJJIII(this.LIZJ, LIZIZ2)) != null && ((LJJIII.width != i || LJJIII.height != i2) && (LIZIZ = LIZIZ()) != null && (photoModeImageInfo = LIZIZ.getPhotoModeImageInfo()) != null)) {
            ListProtector.set(C62819Ol5.LJIILLIIL(photoModeImageInfo), this.LIZJ, new PhotoModeImage(LJJIII.urlModel, i, i2));
        }
        LJIIJJI(i, i2, bitmap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.82Q] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.82V] */
    public C82T(View view, C83G touchInterceptor, C82Y multiFingerCallBack, C6U6 stickerClickListener, C82S feedPhotoParams, ViewGroup viewGroup, InterfaceC2048082a interfaceC2048082a, C81I c81i, InterfaceC201357vH photosSharedProvider) {
        super(view, multiFingerCallBack, stickerClickListener, feedPhotoParams, viewGroup, c81i, photosSharedProvider);
        Aweme aweme;
        o.LJIIIZ(touchInterceptor, "touchInterceptor");
        o.LJIIIZ(multiFingerCallBack, "multiFingerCallBack");
        o.LJIIIZ(stickerClickListener, "stickerClickListener");
        o.LJIIIZ(feedPhotoParams, "feedPhotoParams");
        o.LJIIIZ(photosSharedProvider, "photosSharedProvider");
        View findViewById = this.LIZ.findViewById(R.id.hot);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.photos_img_container)");
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        this.LJIIZILJ = viewGroup2;
        View findViewById2 = viewGroup2.findViewById(R.id.k5v);
        o.LJIIIIZZ(findViewById2, "imgContainer.findViewById(R.id.smart_image_view)");
        ViewOnTouchListenerC82716WdE viewOnTouchListenerC82716WdE = (ViewOnTouchListenerC82716WdE) findViewById2;
        this.LJIJ = viewOnTouchListenerC82716WdE;
        this.LJIJI = (FrameLayout) this.LIZ.findViewById(R.id.bmz);
        View view2 = this.LIZ;
        VideoItemParams Ig = feedPhotoParams.Ig();
        if (Ig != null) {
            aweme = Ig.getAweme();
        } else {
            aweme = null;
        }
        this.LJIJJ = new C82X(view2, aweme, new C161296Ur(stickerClickListener, null, null, null, 14));
        this.LJIJJLI = new C82W(feedPhotoParams, interfaceC2048082a, this.LIZ, new InterfaceC2048182b() { // from class: X.82Q
            @Override // X.InterfaceC2048182b
            public final void LIZ(int i, int i2) {
                C82T c82t = C82T.this;
                c82t.LJIILJJIL = i;
                c82t.LJIILL = i2;
                c82t.LJIIL(i, i2, null);
            }
        });
        ?? r0 = new InterfaceC82719WdH() { // from class: X.82V
            public float LIZ = 1.0f;
            public boolean LIZIZ;

            @Override // X.InterfaceC82719WdH
            public final void LLJLIL() {
                C82T c82t = C82T.this;
                float f = this.LIZ;
                boolean z = this.LIZIZ;
                c82t.getClass();
                HomePageUIFrameServiceImpl.LIZ().setTitleTabVisibility(true);
                c82t.LJ.E0(Float.valueOf(f), Boolean.valueOf(z));
                if (C57272Mp.LIZ()) {
                    ExpandVideoConfig expandVideoConfig = (ExpandVideoConfig) C57272Mp.LIZIZ.getValue();
                    if (expandVideoConfig == null) {
                        expandVideoConfig = C57272Mp.LIZ;
                    }
                    if (expandVideoConfig.expandVibrationType == 2 && c82t.LJIIL) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            ((C61995OUt) c82t.LJIIJ.getValue()).LIZ();
                        } else {
                            ((C61995OUt) c82t.LJIIJ.getValue()).LIZIZ(85, 61);
                        }
                    }
                }
                c82t.LJIIL = false;
            }

            @Override // X.InterfaceC82719WdH
            public final void m() {
                C82T c82t = C82T.this;
                c82t.getClass();
                HomePageUIFrameServiceImpl.LIZ().setTitleTabVisibility(false);
                c82t.LJ.p2();
                this.LIZ = 1.0f;
                this.LIZIZ = false;
            }

            @Override // X.InterfaceC82719WdH
            public final void onScale(float f) {
                if (f >= 1.01f) {
                    C82T c82t = C82T.this;
                    if (!c82t.LJIIL) {
                        c82t.LJIIL = true;
                        if (C57272Mp.LIZ()) {
                            ExpandVideoConfig expandVideoConfig = (ExpandVideoConfig) C57272Mp.LIZIZ.getValue();
                            if (expandVideoConfig == null) {
                                expandVideoConfig = C57272Mp.LIZ;
                            }
                            if (expandVideoConfig.expandVibrationType == 1) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    ((C61995OUt) c82t.LJIIJ.getValue()).LIZ();
                                } else {
                                    ((C61995OUt) c82t.LJIIJ.getValue()).LIZIZ(85, 61);
                                }
                            }
                        }
                    }
                }
                if (this.LIZ > f) {
                    this.LIZIZ = true;
                }
                this.LIZ = f;
            }
        };
        viewGroup2.setOnTouchListener(viewOnTouchListenerC82716WdE);
        if (viewGroup != null) {
            viewOnTouchListenerC82716WdE.LJLLL = new C82718WdG(viewOnTouchListenerC82716WdE, viewGroup2, viewGroup, r0, touchInterceptor);
        }
        if (!feedPhotoParams.Vf() && ((Boolean) C2048982j.LIZ.getValue()).booleanValue()) {
            viewOnTouchListenerC82716WdE.setZoomOutDuration(200L);
        }
    }
}
