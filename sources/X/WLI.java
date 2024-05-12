package X;

import Y.AObjectS89S0100000_14;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WLI extends AbstractC29891Fh<WTU> implements WTU, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public final WMH LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final WTU LJLJI;
    public final InterfaceC45999I3n LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final I0N LJLJJLL;
    public final ShortVideoContext LJLJL;
    public final C46611sH<Boolean> LJLJLJ;
    public boolean LJLJLLL;

    static {
        TBT tbt = new TBT(WLI.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt};
    }

    private final WIF LJJLI() {
        return (WIF) this.LJLJJL.LIZ(this, LJLL[0]);
    }

    @Override // X.WTU
    public void po() {
        FaceStickerBean Z5 = this.LJLJJLL.Z5();
        if (Z5 != null && V3N.LJJIJ(Z5)) {
            LJJLI().h1(false);
        }
        refresh();
    }

    public final void refresh() {
        boolean z;
        FaceStickerBean Z5 = this.LJLJJLL.Z5();
        boolean z2 = false;
        if (Z5 != null) {
            z = V3N.LJJIJ(Z5);
        } else {
            z = false;
        }
        if (this.LJLJLLL && z) {
            Boolean LIZ = this.LJLJLJ.LIZ();
            o.LJIIIIZZ(LIZ, "commerceTagCanShow.value");
            if (LIZ.booleanValue()) {
                C143945ks c143945ks = (C143945ks) this.LJLIL.findSceneByTag("RecordCommerceTagScene");
                if (c143945ks != null) {
                    ShortVideoContext shortVideoContext = this.LJLJL;
                    FaceStickerBean Z52 = this.LJLJJLL.Z5();
                    String str = this.LJLJL.shootWay;
                    C72850SiU c72850SiU = new C72850SiU(Z52, str);
                    o.LJIIIZ(shortVideoContext, "shortVideoContext");
                    if (Z52 == null || !V3N.LJJIJ(Z52)) {
                        WM7 wm7 = c143945ks.mParentScene;
                        o.LJII(wm7, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
                        ((WMH) wm7).hide(c143945ks);
                        return;
                    }
                    WM7 wm72 = c143945ks.mParentScene;
                    o.LJII(wm72, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
                    ((WMH) wm72).show(c143945ks);
                    FaceStickerCommerceBean faceStickerCommerceBean = Z52.getFaceStickerCommerceBean();
                    o.LJI(faceStickerCommerceBean);
                    CommerceToolsModel commerceToolsModel = shortVideoContext.creativeModel.commerceModel;
                    if (!commerceToolsModel.isShowedCommerceTransformBottomButton()) {
                        C145995oB c145995oB = new C145995oB();
                        c145995oB.LIZIZ(Z52.getStickerId(), "prop_id");
                        c145995oB.LJI("shoot_way", str);
                        c145995oB.LJI("carrier_type", "video_shoot_page");
                        GXR.LIZ("show_transform_link", c145995oB.LIZ);
                        z2 = true;
                    }
                    Z52.getStickerId();
                    TuxTextView tuxTextView = c143945ks.LJLJI;
                    if (tuxTextView != null) {
                        tuxTextView.setText(faceStickerCommerceBean.commerceStickerBuyText);
                        LinearLayout linearLayout = c143945ks.LJLILLLLZI;
                        if (linearLayout != null) {
                            C16880lQ.LJIIZILJ(linearLayout, new ViewOnClickListenerC72849SiT(commerceToolsModel, Z52, c72850SiU, c143945ks, faceStickerCommerceBean));
                            if (!z2) {
                                return;
                            }
                            CommerceToolsModel commerceToolsModel2 = this.LJLJL.creativeModel.commerceModel;
                            commerceToolsModel2.setShowedCommerceTransformButton(true);
                            commerceToolsModel2.setShowedCommerceTransformBottomButton(true);
                            return;
                        }
                        o.LJIJI("commerceStickerGoods");
                        throw null;
                    }
                    o.LJIJI("commerceStickerText");
                    throw null;
                }
                return;
            }
        }
        C79234V7u.LJIL(this.LJLIL, "RecordCommerceTagScene");
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        C79234V7u.LIZIZ(this.LJLIL, R.id.iri, new C143945ks(this.LJLJJI.RH()), "RecordCommerceTagScene");
        this.LJLJLJ.LIZIZ(this, new AObjectS89S0100000_14(this, 221));
        this.LJLJJI.Et().LIZIZ(this, new AObjectS89S0100000_14(this, 222));
        this.LJLJJLL.CY().LIZLLL(this, new AObjectS89S0100000_14(this, 223));
        this.LJLJJLL.sF().LIZLLL(this, new AObjectS89S0100000_14(this, 224));
    }

    @Override // X.AbstractC29891Fh
    public void onPause() {
        super.onPause();
        if (this.LJLIL.findSceneByTag("RecordCommerceTagScene") != null) {
            FaceStickerBean.NONE.getStickerId();
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ WTU getApiComponent() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.WTU
    public void FL(boolean z) {
        this.LJLJLJ.LJI(Boolean.valueOf(z));
    }

    public final void LJJLIIIIJ(Effect effect) {
        po();
    }

    public WLI(WMH parent, C82622Wbi diContainer) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = parent;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = this;
        this.LJLJJI = (InterfaceC45999I3n) getDiContainer().LJ(InterfaceC45999I3n.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), WIF.class, null);
        this.LJLJJLL = (I0N) getDiContainer().LJ(I0N.class, null);
        this.LJLJL = (ShortVideoContext) getDiContainer().LJ(ShortVideoContext.class, null);
        this.LJLJLJ = new C46611sH<>(Boolean.TRUE);
    }
}
