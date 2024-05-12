package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.impl.revenue.portal.model.EnvelopPortal4FEModelReceiver;
import com.bytedance.android.livesdk.impl.revenue.portal.model.EnvelopPortalInfoWithDisplay;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.HashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.impl.revenue.portal.PortalLeaf$notifyPortal$4$5", f = "PortalLeaf.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.BSl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28811BSl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ C34K LJLILLLLZI;
    public final /* synthetic */ C34K LJLJI;
    public final /* synthetic */ EnvelopePortalMessage LJLJJI;
    public final /* synthetic */ C28817BSr LJLJJL;
    public final /* synthetic */ C68322mC<Bitmap> LJLJJLL;
    public final /* synthetic */ C68322mC<Bitmap> LJLJL;
    public final /* synthetic */ InterfaceC28808BSi LJLJLJ;
    public final /* synthetic */ C68322mC<View> LJLJLLL;
    public final /* synthetic */ C68322mC<String> LJLL;
    public final /* synthetic */ C68322mC<String> LJLLI;
    public final /* synthetic */ C68322mC<ValueAnimator> LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28811BSl(C34K c34k, C34K c34k2, C34K c34k3, EnvelopePortalMessage envelopePortalMessage, C28817BSr c28817BSr, C68322mC<Bitmap> c68322mC, C68322mC<Bitmap> c68322mC2, InterfaceC28808BSi interfaceC28808BSi, C68322mC<View> c68322mC3, C68322mC<String> c68322mC4, C68322mC<String> c68322mC5, C68322mC<ValueAnimator> c68322mC6, InterfaceC67352kd<? super C28811BSl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c34k;
        this.LJLILLLLZI = c34k2;
        this.LJLJI = c34k3;
        this.LJLJJI = envelopePortalMessage;
        this.LJLJJL = c28817BSr;
        this.LJLJJLL = c68322mC;
        this.LJLJL = c68322mC2;
        this.LJLJLJ = interfaceC28808BSi;
        this.LJLJLLL = c68322mC3;
        this.LJLL = c68322mC4;
        this.LJLLI = c68322mC5;
        this.LJLLILLLL = c68322mC6;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28811BSl(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r1v14, types: [T, android.graphics.Bitmap] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        T t;
        T t2;
        String str;
        int height;
        int width;
        int i;
        int height2;
        String str2;
        Object obj2;
        String str3;
        C141335gf.LIZJ(obj);
        int i2 = !this.LJLIL.element ? 1 : 0;
        int i3 = !this.LJLILLLLZI.element ? 1 : 0;
        int i4 = !this.LJLJI.element ? 1 : 0;
        EnvelopePortalMessage envelopePortalMessage = this.LJLJJI;
        String str4 = "1";
        if (envelopePortalMessage != null) {
            boolean LJJI = this.LJLJJL.LJJI();
            HashMap hashMap = new HashMap(11);
            EnvelopePortalMessage.PortalInfo portalInfo = envelopePortalMessage.portalInfo;
            if (portalInfo != null) {
                str2 = portalInfo.id;
            } else {
                str2 = null;
            }
            String str5 = "";
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("portal_id", str2);
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                String idStr = room.getIdStr();
                if (idStr == null) {
                    idStr = String.valueOf(room.getId());
                }
                hashMap.put("room_id", idStr);
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            }
            if (LJJI) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_anchor", obj2);
            EnvelopePortalMessage.PortalInfo portalInfo2 = envelopePortalMessage.portalInfo;
            if (portalInfo2 != null && (str3 = portalInfo2.senderId) != null) {
                str5 = str3;
            }
            hashMap.put("sender_id", str5);
            hashMap.put("error_code", String.valueOf(i4));
            hashMap.put("anchor_image_error_code", String.valueOf(i2));
            hashMap.put("cover_image_error_code", String.valueOf(i3));
            BZI LIZ = C28787BRn.LIZ("livesdk_portal_load_lottie");
            LIZ.LJJIFFI(hashMap);
            LIZ.LJIIZILJ();
            LIZ.LJJIIJZLJL();
        }
        C68322mC c68322mC = new C68322mC();
        C28817BSr c28817BSr = this.LJLJJL;
        Bitmap bitmap = this.LJLJJLL.element;
        c28817BSr.getClass();
        if (bitmap != null) {
            int width2 = bitmap.getWidth();
            int height3 = bitmap.getHeight();
            if (bitmap.getWidth() < bitmap.getHeight()) {
                height2 = bitmap.getWidth();
            } else {
                height2 = bitmap.getHeight();
            }
            float f = 192 / height2;
            Matrix matrix = new Matrix();
            matrix.postScale(f, f);
            t = Bitmap.createBitmap(bitmap, (width2 - height2) / 2, (height3 - height2) / 2, height2, height2, matrix, true);
        } else {
            t = 0;
        }
        c68322mC.element = t;
        C68322mC c68322mC2 = new C68322mC();
        C28817BSr c28817BSr2 = this.LJLJJL;
        Bitmap bitmap2 = this.LJLJL.element;
        c28817BSr2.getClass();
        if (bitmap2 != null) {
            if (bitmap2.getWidth() < bitmap2.getHeight()) {
                height = bitmap2.getWidth();
            } else {
                height = bitmap2.getHeight();
            }
            Matrix matrix2 = new Matrix();
            float f2 = 69 / height;
            matrix2.postScale(f2, f2);
            if (bitmap2.getWidth() < bitmap2.getHeight()) {
                width = 0;
            } else {
                width = (bitmap2.getWidth() - bitmap2.getHeight()) / 2;
            }
            if (bitmap2.getWidth() < bitmap2.getHeight()) {
                i = (bitmap2.getHeight() - bitmap2.getWidth()) / 2;
            } else {
                i = 0;
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap2, width, i, height, height, matrix2, true);
            Paint LIZIZ = C6D8.LIZIZ(true);
            Bitmap createBitmap2 = Bitmap.createBitmap(69, 69, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap2);
            canvas.drawCircle(34.5f, 34.5f, 34.5f, LIZIZ);
            LIZIZ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(createBitmap, 0.0f, 0.0f, LIZIZ);
            t2 = createBitmap2;
        } else {
            t2 = 0;
        }
        c68322mC2.element = t2;
        C68322mC c68322mC3 = new C68322mC();
        C28817BSr c28817BSr3 = this.LJLJJL;
        int i5 = ((EnvelopPortalInfoWithDisplay) ListProtector.get(((EnvelopPortal4FEModelReceiver) this.LJLJLJ).portalInfos, 0)).portalInfo.envelopeDiamonds;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(c28817BSr3.LJLIL), R.layout.dg9, null, false);
        TextView textView = (TextView) LLLLIILL.findViewById(R.id.hy5);
        textView.setGravity(3);
        textView.setText(String.valueOf(i5));
        textView.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
        LLLLIILL.measure(View.MeasureSpec.makeMeasureSpec(99, 1073741824), View.MeasureSpec.makeMeasureSpec(49, 1073741824));
        LLLLIILL.layout(0, 0, LLLLIILL.getMeasuredWidth(), LLLLIILL.getMeasuredHeight());
        ?? createBitmap3 = Bitmap.createBitmap(LLLLIILL.getWidth(), LLLLIILL.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap3);
        C37203Eit.LIZJ.getClass();
        C39214FaE.LIZ(LLLLIILL, canvas2);
        c68322mC3.element = createBitmap3;
        C68322mC c68322mC4 = new C68322mC();
        C28817BSr c28817BSr4 = this.LJLJJL;
        View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(c28817BSr4.LJLIL), R.layout.dg8, null, false);
        ((TextView) LLLLIILL2.findViewById(R.id.hy4)).setText(c28817BSr4.LJLIL.getString(R.string.np9));
        LLLLIILL2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(42, 1073741824));
        LLLLIILL2.layout(0, 0, LLLLIILL2.getMeasuredWidth(), LLLLIILL2.getMeasuredHeight());
        ?? createBitmap4 = Bitmap.createBitmap(LLLLIILL2.getWidth(), LLLLIILL2.getHeight(), Bitmap.Config.ARGB_8888);
        C39214FaE.LIZ(LLLLIILL2, new Canvas(createBitmap4));
        c68322mC4.element = createBitmap4;
        C68322mC<View> c68322mC5 = this.LJLJLLL;
        ((C29701Eo) c68322mC5.element).addLottieOnCompositionLoadedListener(new C28802BSc(c68322mC, c68322mC3, c68322mC2, c68322mC4, c68322mC5));
        Uri.Builder appendQueryParameter = UriProtector.parse(this.LJLL.element).buildUpon().appendQueryParameter("initial_data", GsonProtectorUtils.toJson(C09650Zl.LIZIZ, this.LJLJLJ));
        if (!this.LJLJJL.LJJI()) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        android.net.Uri uri = appendQueryParameter.appendQueryParameter("is_anchor", str4).build();
        IShortTouchService iShortTouchService = (IShortTouchService) CN1.LIZ(IShortTouchService.class);
        Context context = this.LJLJJL.LJLIL;
        o.LJIIIIZZ(uri, "uri");
        C31220CNc FX = iShortTouchService.FX(context, uri, this.LJLLI.element, true);
        if (FX != null) {
            InterfaceC28808BSi interfaceC28808BSi = this.LJLJLJ;
            C28817BSr c28817BSr5 = this.LJLJJL;
            EnvelopePortalMessage envelopePortalMessage2 = this.LJLJJI;
            C68322mC<View> c68322mC6 = this.LJLJLLL;
            C68322mC<ValueAnimator> c68322mC7 = this.LJLLILLLL;
            EnvelopPortal4FEModelReceiver envelopPortal4FEModelReceiver = (EnvelopPortal4FEModelReceiver) interfaceC28808BSi;
            if (envelopPortal4FEModelReceiver.portalInfos.size() > 0 && !o.LJ(((EnvelopPortalInfoWithDisplay) ListProtector.get(envelopPortal4FEModelReceiver.portalInfos, 0)).anchorId, String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId())) && (str = c28817BSr5.LJLLL) != null) {
                ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).sX(UOS.ID, str);
            }
            c28817BSr5.LJLLL = FX.LIZ();
            ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).B10(FX, new C28812BSm(c68322mC6, c68322mC7));
            if (envelopePortalMessage2 != null) {
                C28814BSo.LIZIZ(envelopePortalMessage2, c28817BSr5.LJJI());
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
