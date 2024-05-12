package X;

import Y.ARunnableS23S0200000_4;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.paid.content.consumption.PaidContentCustomAnchorViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A8W extends C8IM {
    public final PaidContentCustomAnchorViewModel LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final A8U LJLJLJ;

    @Override // X.C8IG
    public final void LIZIZ() {
        A8R a8r;
        A8U a8u = this.LJLJLJ;
        if (a8u != null && (a8r = a8u.LIZIZ) != null) {
            C45804HyK.LJJIJIIJIL(a8r.LIZ(R.id.a44));
            C45804HyK.LJJLL(a8r.LIZ(R.id.a22));
        }
        this.LJLJJLL = false;
    }

    public final boolean getHasAnim() {
        return this.LJLJJLL;
    }

    public final boolean getHasInit() {
        return this.LJLJL;
    }

    public final PaidContentCustomAnchorViewModel getViewModel() {
        return this.LJLJJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A8W(Context context) {
        super(context);
        a1.LJFF(context, "context");
        this.LJLJJL = new PaidContentCustomAnchorViewModel();
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.LJLJLJ = new A8U(this);
    }

    @Override // X.C8IM
    public final void LJFF(double d) {
        A8R a8r;
        CharSequence text;
        this.LJLJI = d;
        if (d >= 2.0d && !this.LJLJJLL) {
            A8U a8u = this.LJLJLJ;
            if (a8u != null && (a8r = a8u.LIZIZ) != null && (text = ((AppCompatTextView) a8r.LIZ(R.id.a46)).getText()) != null && text.length() != 0) {
                a8r.setPivotX(0.0f);
                a8r.setPivotY(a8r.getHeight());
                C119774mz anchor_subtitle_flow = (C119774mz) a8r.LIZ(R.id.a44);
                o.LJIIIIZZ(anchor_subtitle_flow, "anchor_subtitle_flow");
                ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(anchor_subtitle_flow, new ARunnableS23S0200000_4(anchor_subtitle_flow, a8r, 1));
            }
            this.LJLJJLL = true;
        }
    }

    @Override // X.C8IM
    public final boolean LJII(C188727au c188727au) {
        this.LJLJJLL = false;
        return true;
    }

    public final void setHasAnim(boolean z) {
        this.LJLJJLL = z;
    }

    public final void setHasInit(boolean z) {
        this.LJLJL = z;
    }

    @Override // X.C8IG
    public final void LJ(C188727au c188727au, InterfaceC88472Yns<? super Boolean, C76800UCe> useCustomAction) {
        Aweme aweme;
        String str;
        String str2;
        String str3;
        o.LJIIIZ(useCustomAction, "useCustomAction");
        PaidContentCustomAnchorViewModel paidContentCustomAnchorViewModel = this.LJLJJL;
        Context context = getContext();
        InterfaceC44105HSr interfaceC44105HSr = paidContentCustomAnchorViewModel.LJLIL;
        String str4 = null;
        if (interfaceC44105HSr != null) {
            aweme = interfaceC44105HSr.LJJLL();
        } else {
            aweme = null;
        }
        AnchorCommonStruct anchorCommonStruct = paidContentCustomAnchorViewModel.LJLILLLLZI;
        if (anchorCommonStruct != null) {
            str = anchorCommonStruct.getSchema();
        } else {
            str = null;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, str);
        buildRoute.withParam("entry_source", EnumC25627A3z.ANCHOR);
        AnchorCommonStruct anchorCommonStruct2 = paidContentCustomAnchorViewModel.LJLILLLLZI;
        if (anchorCommonStruct2 != null) {
            str2 = anchorCommonStruct2.getId();
        } else {
            str2 = null;
        }
        buildRoute.withParam("anchor_id", str2);
        if (aweme != null) {
            str3 = aweme.getAid();
        } else {
            str3 = null;
        }
        buildRoute.withParam("anchor_video_id", str3);
        if (aweme != null) {
            str4 = aweme.getGroupId();
        }
        buildRoute.withParam("anchor_group_id", str4);
        buildRoute.open();
    }

    @Override // X.C8IG
    public final void LIZLLL(AnchorCommonStruct anchorCommonStruct, InterfaceC44105HSr interfaceC44105HSr, int i, InterfaceC65784Pro commonClickAction) {
        o.LJIIIZ(commonClickAction, "commonClickAction");
        if (!this.LJLJL) {
            XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new A8Q(this, anchorCommonStruct, interfaceC44105HSr, false, i, null), 2);
            this.LJLJL = true;
        }
    }
}
