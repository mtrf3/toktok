package X;

import Y.AObjectS86S0100000_7;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.HYt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44263HYt extends AbstractC29891Fh<InterfaceC44264HYu> implements InterfaceC44264HYu, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJI;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final ShortVideoContext LJLJI;

    static {
        TBT tbt = new TBT(C44263HYt.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJI = new InterfaceC74236TBo[]{tbt};
    }

    public InterfaceC44264HYu LJJLI() {
        return this;
    }

    private final WRP getFilterApiComponent() {
        return (WRP) this.LJLILLLLZI.LIZ(this, LJLJJI[0]);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        getFilterApiComponent().getFilterUpdateEvent().LIZLLL(this, new AObjectS86S0100000_7(this, 85));
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC44264HYu getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C44263HYt(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), WRP.class, null);
        this.LJLJI = (ShortVideoContext) getDiContainer().LJ(ShortVideoContext.class, null);
    }

    public final void LJJLIIIIJ(C44262HYs c44262HYs) {
        String str;
        String str2;
        float f;
        InterfaceC142225i6 interfaceC142225i6;
        WPD isBuildIn = c44262HYs.LJLILLLLZI;
        o.LJIIIZ(isBuildIn, "$this$isBuildIn");
        if (o.LJ(isBuildIn.LJLIL, "build_in") && c44262HYs.LJLJI) {
            EffectCategoryResponse LJIIL = TMC.LJIIL(c44262HYs.LJLIL, c44262HYs.LJLILLLLZI.LJLILLLLZI.LJJJJIZL());
            if (LJIIL == null || (str = LJIIL.getName()) == null) {
                str = "";
            }
            ShortVideoContext shortVideoContext = this.LJLJI;
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", shortVideoContext.LJI());
            c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
            c145995oB.LIZ(shortVideoContext.draftId, "draft_id");
            if (!o.LJ(c44262HYs.LJLJJI, "slide")) {
                str2 = "click";
            } else {
                str2 = c44262HYs.LJLJJI;
            }
            c145995oB.LJI("enter_method", str2);
            c145995oB.LIZ(!o.LJ(c44262HYs.LJLJJI, "slide") ? 1 : 0, "is_selected_from_entrance");
            c145995oB.LJI("enter_from", "video_shoot_page");
            c145995oB.LJI("filter_name", c44262HYs.LJLIL.getEnName());
            c145995oB.LIZ(c44262HYs.LJLIL.getId(), "filter_id");
            WPD value = getFilterApiComponent().getCurrentFilterSource().getValue();
            if (value != null && (interfaceC142225i6 = value.LJLJI) != null) {
                f = TMC.LJIJJ(interfaceC142225i6, c44262HYs.LJLIL);
            } else {
                f = -1.0f;
            }
            c145995oB.LIZJ(Float.valueOf(f), "filter_value");
            c145995oB.LJI("tab_name", str);
            c145995oB.LJI("content_source", shortVideoContext.LIZLLL().getContentSource());
            c145995oB.LJI("content_type", shortVideoContext.LIZLLL().getContentType());
            c145995oB.LJI("enter_from", "video_shoot_page");
            GXR.LIZ("select_filter", c145995oB.LIZ);
        }
    }
}
