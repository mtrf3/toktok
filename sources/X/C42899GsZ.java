package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS31S0001000_7;
import kotlin.jvm.internal.AqS67S0400000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GsZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C42899GsZ extends TBS implements InterfaceC88472Yns<View, C76800UCe> {
    public C42899GsZ(Object obj) {
        super(1, obj, C42898GsY.class, "onAddClick", "onAddClick(Landroid/view/View;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(View view) {
        int i;
        int i2;
        AnchorPublishStruct anchorPublishStruct;
        View p0 = view;
        o.LJIIIZ(p0, "p0");
        C42898GsY c42898GsY = (C42898GsY) this.receiver;
        c42898GsY.getClass();
        if (C53258KvG.LIZIZ() && !c42898GsY.LJLZ.LJII(1)) {
            C26045AKb c26045AKb = new C26045AKb(p0);
            c26045AKb.LJIIIZ(c42898GsY.LJLZ.LJ(p0.getContext()));
            c26045AKb.LJIIJ();
        } else {
            List<AnchorTransData> value = c42898GsY.LJ().getExtensionDataRepo().getUpdateAnchors().getValue();
            if (value != null) {
                if (value.size() >= 10) {
                    AnonymousClass030.LJ(p0, R.string.bpu);
                } else {
                    p0.getContext();
                    if (C2NU.LIZ.LIZIZ()) {
                        C188727au c188727au = new C188727au();
                        if (AnchorListManager.LJI > 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        c188727au.LIZLLL(i, "awareness_dot");
                        FMX.LJIIL("open_label_panel", c188727au.LIZ);
                        if (c42898GsY.LJLLJ == null) {
                            AVExternalServiceImpl.LIZ().publishService();
                            List<AnchorPublishStruct> LIZIZ = C65777Prh.LIZIZ(AnchorListManager.LJFF());
                            if (!c42898GsY.LJLLLL) {
                                ORS.LJJLIL(new AqS31S0001000_7(EnumC42934Gt8.ARTICLE_PHOTO_MODE.getTYPE(), 6), LIZIZ);
                            }
                            Iterator it = LIZIZ.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (((AnchorPublishStruct) it.next()).type == EnumC42934Gt8.ARTICLE_PHOTO_MODE.getTYPE()) {
                                    ORS.LJJLIL(new AqS31S0001000_7(EnumC42934Gt8.NEWS.getTYPE(), 6), LIZIZ);
                                    break;
                                }
                            }
                            if (5 == C53258KvG.LIZ() && (anchorPublishStruct = c42898GsY.LJZ) != null) {
                                ListProtector.add(LIZIZ, 0, anchorPublishStruct);
                            }
                            for (AnchorPublishStruct anchorPublishStruct2 : LIZIZ) {
                                anchorPublishStruct2.enable = true;
                                if (((anchorPublishStruct2.type == EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE() || anchorPublishStruct2.type == EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE()) && (!c42898GsY.LJIIIZ() || (c42898GsY.LJLLLLLL >= 1 && ((i2 = c42898GsY.LJZL) == 1 ? !(!anchorPublishStruct2.getEcIncrementalCreator()) : i2 == 2)))) || c42898GsY.LJIILLIIL(anchorPublishStruct2) || (anchorPublishStruct2.type == EnumC42934Gt8.BA_PRODUCT_ANCHOR.getTYPE() && (anchorPublishStruct2.baProductLinkState != 5 || !c42898GsY.LJIIIZ()))) {
                                    anchorPublishStruct2.enable = false;
                                }
                                if (anchorPublishStruct2.type == EnumC42934Gt8.GET_LEADS.getTYPE() && anchorPublishStruct2.getLeadsAnchorState != 0) {
                                    anchorPublishStruct2.enable = false;
                                }
                            }
                            Context context = p0.getContext();
                            o.LJIIIIZZ(context, "view.context");
                            LifecycleOwner lifecycleOwner = c42898GsY.LJLJJI;
                            if (lifecycleOwner != null) {
                                c42898GsY.LJLLJ = new DialogC42922Gsw(context, lifecycleOwner, LIZIZ);
                                for (AnchorPublishStruct anchorPublishStruct3 : LIZIZ) {
                                    anchorPublishStruct3.setExtensionMisc(c42898GsY.LJ());
                                    anchorPublishStruct3.setOnClickAction(new AqS67S0400000_7(p0, (View) c42898GsY, (C42898GsY) anchorPublishStruct3, (AnchorPublishStruct) LIZIZ, (List<AnchorPublishStruct>) 3));
                                }
                            } else {
                                o.LJIJI("lifecycleOwner");
                                throw null;
                            }
                        }
                        DialogC42922Gsw dialogC42922Gsw = c42898GsY.LJLLJ;
                        o.LJI(dialogC42922Gsw);
                        if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/commercialize/anchor/AnchorPanel", "show", dialogC42922Gsw, new Object[0], "void", new C65300Pk0(false, "()V", "3063604610028001079")).LIZ) {
                            dialogC42922Gsw.show();
                        }
                    } else {
                        AnonymousClass030.LJ(p0, R.string.e45);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
