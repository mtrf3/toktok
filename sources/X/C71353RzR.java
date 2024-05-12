package X;

import Y.AObserverS80S0100000_12;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.EcommerceCommentAnchorViewModel;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RzR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71353RzR extends ConstraintLayout implements InterfaceC60061Nhh {
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public TuxIconView LJLJI;
    public TuxTextView LJLJJI;
    public TuxTextView LJLJJL;
    public List<ShopWindowAnchorModel> LJLJJLL;
    public boolean LJLJL;
    public EcommerceCommentAnchorViewModel LJLJLJ;
    public CommonVideoAnchorModel LJLJLLL;
    public String LJLL;

    private final List<ShopWindowAnchorModel> getAnchorData() {
        AnchorCommonStruct anchorCommonStruct;
        List<ShopWindowAnchorModel> LJIIJJI;
        List<AnchorCommonStruct> anchors = this.LJLIL.getAnchors();
        if (anchors != null) {
            Iterator<AnchorCommonStruct> it = anchors.iterator();
            while (true) {
                if (it.hasNext()) {
                    anchorCommonStruct = it.next();
                    AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
                    if (anchorCommonStruct2.getType() == 35 && anchorCommonStruct2.getExtra().length() > 0) {
                        break;
                    }
                } else {
                    anchorCommonStruct = null;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct3 = anchorCommonStruct;
            if (anchorCommonStruct3 != null && (LJIIJJI = C71360RzY.LJIIJJI(anchorCommonStruct3)) != null) {
                return LJIIJJI;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLJLI() {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71353RzR.LJJLJLI():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z = this.LJLJL;
        String str = this.LJLILLLLZI;
        Aweme aweme = this.LJLIL;
        C188727au LIZ = C71363Rzb.LIZ(z, str, aweme, null, this.LJLJJLL, "comment_anchor");
        C211648Si.LIZ(LIZ, aweme, str, true);
        FMX.LJIIL("multi_anchor_entrance_show", LIZ.LIZ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventCenter.LJ().LIZIZ("ec_anchor_open_comment", this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC60061Nhh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onEvent(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "eventName"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "ec_anchor_open_comment"
            boolean r0 = kotlin.jvm.internal.o.LJ(r8, r0)
            if (r0 == 0) goto L81
            r5 = 0
            com.google.gson.Gson r1 = X.C27739Aud.LJFF()     // Catch: com.google.gson.s -> L2e
            java.lang.Class<X.2UD> r0 = X.C2UD.class
            X.Pkc r0 = X.C65352Pkq.LJI(r0)     // Catch: com.google.gson.s -> L2e
            java.lang.reflect.Type r0 = X.C65330PkU.LIZJ(r0)     // Catch: com.google.gson.s -> L2e
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r9, r0)     // Catch: com.google.gson.s -> L2e
            boolean r0 = r1 instanceof X.C2UD     // Catch: com.google.gson.s -> L2e
            if (r0 != 0) goto L25
            r1 = r5
        L25:
            X.2UD r1 = (X.C2UD) r1     // Catch: com.google.gson.s -> L2e
            if (r1 == 0) goto L2e
            java.lang.String r1 = r1.getEventType()
            goto L2f
        L2e:
            r1 = r5
        L2f:
            java.lang.String r0 = r7.LJLILLLLZI
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L81
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LJLIL
            java.lang.String r3 = r0.getRequestId()
            java.lang.String r2 = ""
            if (r3 != 0) goto L42
            r3 = r2
        L42:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LJLIL
            java.lang.String r1 = r0.getAid()
            if (r1 != 0) goto L4b
            r1 = r2
        L4b:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel> r0 = r7.LJLJJLL
            if (r0 == 0) goto L65
            java.lang.Object r0 = X.ORZ.LJLLLL(r0)
            com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel r0 = (com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel) r0
            if (r0 == 0) goto L65
            com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel r0 = r0.LIZ
            if (r0 == 0) goto L65
            java.lang.Long r0 = r0.productId
            if (r0 == 0) goto L65
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L82
        L65:
            java.lang.String r3 = X.C70570Rmo.LIZ(r3, r1, r2)
            r7.LJLL = r3
            r1 = 1
            boolean r0 = r7.LJLJL
            r2 = r0 ^ 1
            java.lang.String r4 = r7.LJLILLLLZI
            java.util.List<com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel> r0 = r7.LJLJJLL
            if (r0 == 0) goto L7c
            java.lang.Object r5 = X.ORZ.LJLLLL(r0)
            com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel r5 = (com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel) r5
        L7c:
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r7.LJLIL
            X.C71363Rzb.LJIIIZ(r1, r2, r3, r4, r5, r6)
        L81:
            return
        L82:
            r2 = r0
            goto L65
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71353RzR.onEvent(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71353RzR(Context context, Aweme aweme, String str) {
        super(context);
        boolean z;
        EcommerceCommentAnchorViewModel ecommerceCommentAnchorViewModel;
        MutableLiveData<C71352RzQ> mutableLiveData;
        o.LJIIIZ(aweme, "aweme");
        new LinkedHashMap();
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        this.LJLL = "";
        this.LJLJJLL = getAnchorData();
        List<ShopWindowAnchorModel> anchorData = getAnchorData();
        if (anchorData != null && anchorData.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJL = z;
        this.LJLJLLL = C71360RzY.LJJIIZ(aweme, str);
        EcommerceCommentAnchorViewModel ecommerceCommentAnchorViewModel2 = new EcommerceCommentAnchorViewModel();
        this.LJLJLJ = ecommerceCommentAnchorViewModel2;
        ecommerceCommentAnchorViewModel2.LJLIL = this.LJLJLLL;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context2);
        if (LJJIFFI != null && (ecommerceCommentAnchorViewModel = this.LJLJLJ) != null && (mutableLiveData = ecommerceCommentAnchorViewModel.LJLILLLLZI) != null) {
            mutableLiveData.observe(LJJIFFI, new AObserverS80S0100000_12(this, 74));
        }
        EventCenter.LJ().LIZJ("ec_anchor_open_comment", this);
        if (this.LJLJL) {
            C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.y6, this, true);
            findViewById(R.id.gmn);
            LJJLJLI();
        } else {
            C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.y7, this, true);
            LJJLJLI();
        }
    }
}
