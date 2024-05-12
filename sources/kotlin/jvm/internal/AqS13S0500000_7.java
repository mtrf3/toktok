package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC42651GoZ;
import X.AbstractC65781Prl;
import X.C0I6;
import X.C10K;
import X.C16880lQ;
import X.C42190Gh8;
import X.C42299Git;
import X.C43703HDf;
import X.C43707HDj;
import X.C43722HDy;
import X.C76800UCe;
import X.C78897Uxp;
import X.C82622Wbi;
import X.HRO;
import X.InterfaceC65784Pro;
import X.InterfaceC82199WNv;
import X.InterfaceC83142Wk6;
import X.InterfaceC88472Yns;
import X.WMH;
import Y.ACallableS9S1400000_7;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.widget.FrameLayout;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.common.ShareKitPanel;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public class AqS13S0500000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$1(AqS13S0500000_7 aqS13S0500000_7, Object obj) {
        aqS13S0500000_7.invoke$0((C0I6) obj);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(InterfaceC82199WNv it) {
        o.LJIIIZ(it, "it");
        String lF = it.lF();
        ShortVideoContext shortVideoContext = (ShortVideoContext) this.l0;
        InterfaceC83142Wk6 interfaceC83142Wk6 = (InterfaceC83142Wk6) this.l1;
        C10K.LIZJ(new ACallableS9S1400000_7((Activity) this.l2, (C82622Wbi) this.l4, (EditEffectAnchorManager) this.l3, shortVideoContext, interfaceC83142Wk6, lF, 0));
    }

    public final void invoke$1(ClosingChooseMediaPageState it) {
        o.LJIIIZ(it, "it");
        if (o.LJ(it, ClosingChooseMediaPageState.Closed.INSTANCE)) {
            ((WMH) this.l0).remove((NavigationScene) this.l1);
            C16880lQ.LJLLLL((FrameLayout) this.l3, (FrameLayout) this.l2);
            C78897Uxp.LJJJJ((HRO) this.l4).remove((HRO) this.l4);
        }
    }

    public static final Object invoke$0(AqS13S0500000_7 aqS13S0500000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String string = ((Activity) aqS13S0500000_7.l0).getString(R.string.gti);
        o.LJIIIIZZ(string, "activity.getString(R.str…_kit_loading_error_cta_2)");
        actionGroup.LJII(string, new AqS111S0300000_7((C43703HDf) aqS13S0500000_7.l1, (C43703HDf) aqS13S0500000_7.l2, (ShareKitPanel) aqS13S0500000_7.l3, (InterfaceC65784Pro<C76800UCe>) 3));
        String string2 = ((Activity) aqS13S0500000_7.l0).getString(R.string.gth);
        o.LJIIIIZZ(string2, "activity.getString(R.str…_kit_loading_error_cta_1)");
        actionGroup.LJIIIZ(string2, new AqS53S0400000_7((Activity) aqS13S0500000_7.l0, (C43703HDf) aqS13S0500000_7.l1, (ShareKitPanel) aqS13S0500000_7.l2, (C43722HDy) aqS13S0500000_7.l4, 1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS13S0500000_7 aqS13S0500000_7, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            C42190Gh8 c42190Gh8 = (C42190Gh8) aqS13S0500000_7.l0;
            int height = ((Bitmap) aqS13S0500000_7.l1).getHeight();
            if (!c42190Gh8.LIZLLL) {
                c42190Gh8.LIZIZ.setShader(new LinearGradient(0.0f, height - 300, 0.0f, height, 0, c42190Gh8.LIZJ, Shader.TileMode.CLAMP));
                c42190Gh8.LIZLLL = true;
            }
            ((Canvas) aqS13S0500000_7.l2).drawRect(0.0f, ((Bitmap) aqS13S0500000_7.l1).getHeight() - 300, ((Bitmap) aqS13S0500000_7.l1).getWidth(), ((Bitmap) aqS13S0500000_7.l1).getHeight(), ((C42190Gh8) aqS13S0500000_7.l0).LIZIZ);
            Canvas canvas = (Canvas) aqS13S0500000_7.l2;
            C42190Gh8 c42190Gh82 = (C42190Gh8) aqS13S0500000_7.l0;
            Bitmap bitmap2 = (Bitmap) aqS13S0500000_7.l1;
            canvas.drawBitmap(bitmap, (Rect) null, new Rect((int) ((bitmap2.getWidth() - (bitmap.getWidth() * (c42190Gh82.LJ / bitmap.getHeight()))) - c42190Gh82.LJFF), (bitmap2.getHeight() - c42190Gh82.LJ) - c42190Gh82.LJFF, bitmap2.getWidth() - c42190Gh82.LJFF, bitmap2.getHeight() - c42190Gh82.LJFF), (Paint) null);
            ((Canvas) aqS13S0500000_7.l2).save();
            ((Canvas) aqS13S0500000_7.l2).restore();
            ((InterfaceC88472Yns) aqS13S0500000_7.l3).invoke((Bitmap) aqS13S0500000_7.l4);
            C42299Git.LJ(bitmap);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AqS13S0500000_7 aqS13S0500000_7, Object obj) {
        aqS13S0500000_7.invoke$1((ClosingChooseMediaPageState) obj);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS13S0500000_7(C42190Gh8 c42190Gh8, C42190Gh8 c42190Gh82, Bitmap bitmap, Canvas canvas, InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns, Bitmap bitmap2) {
        super(1);
        this.$t = bitmap2;
        this.l0 = c42190Gh8;
        this.l1 = c42190Gh82;
        this.l2 = bitmap;
        this.l3 = canvas;
        this.l4 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S0500000_7(AbstractC42651GoZ abstractC42651GoZ, NavigationScene navigationScene, FrameLayout frameLayout, FrameLayout frameLayout2, HRO hro, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC42651GoZ;
        this.l1 = navigationScene;
        this.l2 = frameLayout;
        this.l3 = frameLayout2;
        this.l4 = hro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S0500000_7(Activity activity, C43703HDf c43703HDf, ShareKitPanel shareKitPanel, C43707HDj c43707HDj, C43722HDy c43722HDy, int i) {
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.l1 = c43703HDf;
        this.l2 = shareKitPanel;
        this.l3 = c43707HDj;
        this.l4 = c43722HDy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S0500000_7(ShortVideoContext shortVideoContext, InterfaceC83142Wk6 interfaceC83142Wk6, Activity activity, EditEffectAnchorManager editEffectAnchorManager, C82622Wbi c82622Wbi, int i) {
        super(1);
        this.$t = i;
        this.l0 = shortVideoContext;
        this.l1 = interfaceC83142Wk6;
        this.l2 = activity;
        this.l3 = editEffectAnchorManager;
        this.l4 = c82622Wbi;
    }
}
