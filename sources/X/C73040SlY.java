package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.ecommercelive.business.feed.popcard.data.FeedProduct;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMMessage;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS13S0000100_1;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.SlY, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73040SlY implements InterfaceC71472S3g, InterfaceC14120gy, InterfaceC162186Yc, IBR, C14Q, C0K7, X5O {
    public static Context LJLJI;
    public static C37050EgQ LJLJJI;
    public static boolean LJLJJL;
    public static final C73040SlY LJLIL = new C73040SlY();
    public static final C73040SlY LJLILLLLZI = new C73040SlY();
    public static final C73040SlY LJLJJLL = new C73040SlY();
    public static final char[] LJLJL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final C73040SlY LJLJLJ = new C73040SlY();
    public static final C73040SlY LJLJLLL = new C73040SlY();

    @Override // X.X5O
    public void onStart(int i) {
    }

    public static String LJIIIZ(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= bArr.length) {
                int i = length * 2;
                char[] cArr = new char[i];
                int i2 = 0;
                for (byte b : bArr) {
                    int i3 = b & 255;
                    int i4 = i2 + 1;
                    char[] cArr2 = LJLJL;
                    cArr[i2] = cArr2[i3 >> 4];
                    i2 = i4 + 1;
                    cArr[i4] = cArr2[i3 & 15];
                }
                return new String(cArr, 0, i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    @Override // X.C14Q
    public Object apply(Object obj) {
        AbstractC72932td<C223208pQ> abstractC72932td = ((C57778Mly) obj).LIZ;
        boolean z = true;
        if (!(abstractC72932td instanceof C33X) && !(abstractC72932td instanceof C72922tc)) {
            boolean z2 = abstractC72932td instanceof C72912tb;
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC162186Yc
    public void onError(String str) {
        C0JU.LIZLLL(str);
    }

    public static final Typeface LJFF(Context context, C32961Rc c32961Rc) {
        Typeface LIZJ;
        if (Build.VERSION.SDK_INT >= 26) {
            return C13380fm.LIZ(context, c32961Rc);
        }
        c32961Rc.getClass();
        if (context.isRestricted()) {
            LIZJ = null;
        } else {
            LIZJ = C06690Ob.LIZJ(context, 0, new TypedValue(), 0, null, false);
        }
        o.LJI(LIZJ);
        return LIZJ;
    }

    public static final int LJI(long j, List list) {
        int size = list.size() - 1;
        if (list.size() - 1 < 0) {
            return -1;
        }
        C109544Rq message = ((IMMessage) ListProtector.get(list, size)).getMessage();
        C109544Rq message2 = ((IMMessage) ListProtector.get(list, 0)).getMessage();
        long index = message.getIndex();
        if (j > message2.getIndex() || index > j) {
            return -1;
        }
        return C47261Igj.LJIIIZ(list, new AqS13S0000100_1(j, 1));
    }

    @Override // X.InterfaceC71472S3g
    public Animator LIZIZ(ViewGroup viewGroup, S21 s21) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(s21, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, s21.getAlpha(), 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, s21.getTranslationY(), s21.getLayoutParams().height));
        ofPropertyValuesHolder.setDuration(290L);
        return ofPropertyValuesHolder;
    }

    @Override // X.InterfaceC71472S3g
    public Animator LIZJ(ViewGroup viewGroup, S21 s21) {
        s21.setAlpha(0.0f);
        s21.setTranslationY(s21.getLayoutParams().height);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(s21, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, s21.getLayoutParams().height, 0.0f));
        ofPropertyValuesHolder.setStartDelay(200L);
        ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
        ofPropertyValuesHolder.setDuration(290L);
        return ofPropertyValuesHolder;
    }

    public static void LJII(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str) && context != null) {
            AppLog.onEvent(context, str, str2);
        }
    }

    @Override // X.InterfaceC14120gy
    public void LJ(View view, C0KG c0kg, LiveActionSheetDialog liveActionSheetDialog) {
        o.LJIIIZ(view, "<anonymous parameter 0>");
        liveActionSheetDialog.dismiss();
    }

    @Override // X.InterfaceC71472S3g
    public S21 LIZ(FeedProduct feedProduct, long j, Context context, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(context, "context");
        C71477S3l c71477S3l = new C71477S3l();
        c71477S3l.LIZ = feedProduct;
        c71477S3l.LIZIZ = j;
        c71477S3l.LIZJ = 1;
        c71477S3l.LIZLLL = z;
        S21 LIZ = c71477S3l.LIZ(context);
        if (LIZ != null) {
            if (z) {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, context.getResources().getDimensionPixelOffset(R.dimen.ow));
            } else {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, context.getResources().getDimensionPixelOffset(R.dimen.oo));
            }
            LIZ.setLayoutParams(marginLayoutParams);
            return LIZ;
        }
        return null;
    }

    public static void LJIIIIZZ(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "event_v1";
        }
        if (context != null) {
            AppLog.onEvent(context, str, str2, str3, j, j2, jSONObject);
            "event_v1".equals(str);
        }
    }

    @Override // X.IBR
    public T4C LIZLLL(C29S activity, TEZ stickerDataManager, InterfaceC46204IBk clickController, InterfaceC84497XEf interfaceC84497XEf, ShortVideoContext shortVideoContext, I9W i9w, InterfaceC45540Hu4 interfaceC45540Hu4) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(clickController, "clickController");
        return new T4C();
    }
}
