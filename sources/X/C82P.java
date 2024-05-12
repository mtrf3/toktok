package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.82P, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C82P {
    public static final Bitmap.Config LJIIL = Bitmap.Config.RGB_565;
    public final C82S LIZ;
    public final InterfaceC2048082a LIZIZ;
    public final Context LIZJ;
    public final ImageView LIZLLL;
    public final ImageView LJ;
    public PhotoModeImageUrlModel LJFF;
    public String LJI;
    public VideoItemParams LJII;
    public int LJIIIIZZ;
    public long LJIIIZ;
    public boolean LJIIJ;
    public final C82R LJIIJJI;

    public abstract void LIZIZ();

    public abstract void LJ(W5F w5f);

    public final void LIZLLL() {
        C29701Eo c29701Eo;
        this.LIZLLL.setVisibility(8);
        ImageView imageView = this.LIZLLL;
        if ((imageView instanceof C29701Eo) && (c29701Eo = (C29701Eo) imageView) != null) {
            c29701Eo.cancelAnimation();
        }
    }

    public final void LJI() {
        C29701Eo c29701Eo;
        if ((this.LIZ.Sd() && !this.LIZ.or0()) || this.LJ.getVisibility() == 0) {
            return;
        }
        ImageView imageView = this.LIZLLL;
        if (!(imageView instanceof C29701Eo) && imageView.getDrawable() == null) {
            ImageView imageView2 = this.LIZLLL;
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_tiktok_logo;
            c2068389v.LIZLLL = C79045V0n.LJI(R.attr.dn, this.LIZJ);
            imageView2.setImageDrawable(c2068389v.LIZ(this.LIZJ));
        }
        this.LIZLLL.setVisibility(0);
        ImageView imageView3 = this.LIZLLL;
        if ((imageView3 instanceof C29701Eo) && (c29701Eo = (C29701Eo) imageView3) != null) {
            c29701Eo.playAnimation();
        }
    }

    public void LJFF() {
        LIZLLL();
        this.LJ.setVisibility(8);
        this.LJFF = null;
        this.LJI = "";
        this.LJII = null;
        this.LJIIIIZZ = -1;
        this.LJIIIZ = SystemClock.elapsedRealtime();
        this.LJIIJ = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r4 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.model.SlidesImageLoadParams LIZ(int r28, long r29) {
        /*
            r27 = this;
            r2 = r27
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r1 = r2.LJFF
            r0 = 0
            if (r1 == 0) goto L38
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r1.getDisplayImageNoWatermark()
        Lb:
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r1 = r2.LJFF
            if (r1 == 0) goto L40
            java.util.List r3 = r1.getBitrateImages()
            if (r3 == 0) goto L40
            java.util.ArrayList r4 = new java.util.ArrayList
            r1 = 10
            int r1 = X.C32I.LJJL(r3, r1)
            r4.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L24:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r3.next()
            com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo r1 = (com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo) r1
            java.lang.String r1 = r1.getName()
            r4.add(r1)
            goto L24
        L38:
            r5 = r0
            goto Lb
        L3a:
            java.util.List r4 = X.ORZ.LLJI(r4)
            if (r4 != 0) goto L42
        L40:
            X.OQg r4 = X.C61878OQg.INSTANCE
        L42:
            java.lang.String r7 = r2.LJI
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r1 = r2.LJII
            if (r1 == 0) goto L54
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.getAweme()
            if (r1 == 0) goto L54
            java.lang.String r9 = r1.getAid()
            if (r9 != 0) goto L56
        L54:
            java.lang.String r9 = ""
        L56:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r1 = r2.LJII
            if (r1 == 0) goto Lf1
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.getAweme()
            if (r1 == 0) goto Lf1
            int r8 = X.V16.LJJIFFI(r1)
        L64:
            int r6 = r2.LJIIIIZZ
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r1 = r2.LJFF
            if (r1 == 0) goto Lef
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getTargetMultiRateImageUrl()
            if (r1 == 0) goto Lef
            r10 = 1
        L71:
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r1 = r2.LJFF
            if (r1 == 0) goto Le8
            int r3 = r1.getAdaptMultiRateErrCode()
        L79:
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r1 = r2.LJFF
            if (r1 == 0) goto Le6
            java.lang.String r13 = r1.getGearName()
        L81:
            java.lang.String r14 = r4.toString()
            if (r5 == 0) goto Le1
            int r1 = r5.getWidth()
            java.lang.Integer r18 = java.lang.Integer.valueOf(r1)
            int r1 = r5.getHeight()
            java.lang.Integer r19 = java.lang.Integer.valueOf(r1)
        L97:
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r1 = r2.LJFF
            if (r1 == 0) goto La7
            com.ss.android.ugc.aweme.feed.model.PhotoSourceFromScene r1 = r1.getSourceFrom()
            if (r1 == 0) goto La7
            java.lang.String r11 = r1.getDesc()
            if (r11 != 0) goto Lad
        La7:
            com.ss.android.ugc.aweme.feed.model.PhotoSourceFromScene r1 = com.ss.android.ugc.aweme.feed.model.PhotoSourceFromScene.DEFAULT
            java.lang.String r11 = r1.getDesc()
        Lad:
            if (r5 == 0) goto Lbb
            java.util.List r1 = r5.getUrlList()
            if (r1 == 0) goto Lbb
            java.lang.Object r0 = X.ORZ.LJLLLL(r1)
            java.lang.String r0 = (java.lang.String) r0
        Lbb:
            boolean r1 = r2.LJIIJ
            r21 = r1 ^ 1
            r2.LIZIZ()
            java.lang.String r23 = "DISPLAY"
            com.ss.android.ugc.aweme.model.SlidesImageLoadParams r2 = new com.ss.android.ugc.aweme.model.SlidesImageLoadParams
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r15 = 0
            r5 = r28
            r3 = r29
            r16 = r15
            r17 = r15
            r20 = r15
            r22 = r0
            r24 = r15
            r25 = r15
            r26 = r15
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r2
        Le1:
            r18 = r0
            r19 = r0
            goto L97
        Le6:
            r13 = r0
            goto L81
        Le8:
            com.ss.android.ugc.aweme.feed.model.MultiBitrateAdapterErrorCode r1 = com.ss.android.ugc.aweme.feed.model.MultiBitrateAdapterErrorCode.DEFAULT_CODE
            int r3 = r1.getCode()
            goto L79
        Lef:
            r10 = 0
            goto L71
        Lf1:
            r8 = 0
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82P.LIZ(int, long):com.ss.android.ugc.aweme.model.SlidesImageLoadParams");
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.82R] */
    public C82P(C82S feedPhotoParams, InterfaceC2048082a interfaceC2048082a, View itemView) {
        o.LJIIIZ(feedPhotoParams, "feedPhotoParams");
        o.LJIIIZ(itemView, "itemView");
        this.LIZ = feedPhotoParams;
        this.LIZIZ = interfaceC2048082a;
        Context context = itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        this.LIZJ = context;
        View findViewById = itemView.findViewById(R.id.g94);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.loading_view)");
        this.LIZLLL = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.ehl);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.image_load_fail)");
        this.LJ = (ImageView) findViewById2;
        this.LJI = "";
        this.LJIIIIZZ = -1;
        this.LJIIJJI = new SIR() { // from class: X.82R
            @Override // X.SIR
            public final void LJJLIIIJLLLLLLLZ(JSONObject jSONObject, String str, boolean z) {
            }

            @Override // X.SIR
            public final void LIZ(JSONObject jSONObject) {
                boolean z;
                C82P c82p = C82P.this;
                if (jSONObject.optInt("from") == 0) {
                    z = true;
                } else {
                    z = false;
                }
                c82p.LJIIJ = z;
            }
        };
    }

    public final void LIZJ(int i, String str, String str2) {
        LIZLLL();
        if (this.LJ.getDrawable() == null) {
            ImageView imageView = this.LJ;
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_color_tiktok_logo_light;
            imageView.setImageDrawable(c2068389v.LIZ(this.LIZJ));
        }
        this.LJ.setVisibility(0);
        SlidesImageLoadParams LIZ = SlidesImageLoadParams.LIZ(LIZ(1, SystemClock.elapsedRealtime() - this.LJIIIZ), null, null, null, null, Integer.valueOf(i), str2, str, 1048575);
        InterfaceC2048082a interfaceC2048082a = this.LIZIZ;
        if (interfaceC2048082a != null) {
            interfaceC2048082a.LIZJ(LIZ);
        }
    }
}
