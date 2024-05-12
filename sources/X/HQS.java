package X;

import android.app.Dialog;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.api.AnchorBusinessApiImpl;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HQS extends HSS {
    @Override // X.S1E
    public final S1E clone() {
        return new HQS();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        String str;
        AnchorCommonStruct anchorCommonStruct;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        List<AnchorCommonStruct> anchors = LJJII().getAnchors();
        o.LJIIIIZZ(anchors, "aweme().anchors");
        Iterator<AnchorCommonStruct> it = anchors.iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                anchorCommonStruct = it.next();
                if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                    break;
                }
            } else {
                anchorCommonStruct = null;
                break;
            }
        }
        AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
        if (anchorCommonStruct2 != null) {
            str = anchorCommonStruct2.getId();
        }
        eventMapBuilder.LJI("TT_template_id", str);
        LJJJI(eventMapBuilder);
    }

    @Override // X.HSS, X.S1E
    public final EnumC26289ATl LJFF(List<AnchorCommonStruct> list) {
        if (!AnchorBusinessApiImpl.LIZIZ().LIZ(LJJII())) {
            return EnumC26289ATl.NOT_FOUND;
        }
        return super.LJFF(list);
    }

    @Override // X.HSS, X.S1E
    public final void LJI(C188727au c188727au) {
        String str;
        AnchorCommonStruct anchorCommonStruct;
        List<AnchorCommonStruct> anchors = LJJII().getAnchors();
        o.LJIIIIZZ(anchors, "aweme().anchors");
        Iterator<AnchorCommonStruct> it = anchors.iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                anchorCommonStruct = it.next();
                if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                    break;
                }
            } else {
                anchorCommonStruct = null;
                break;
            }
        }
        AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
        if (anchorCommonStruct2 != null) {
            str = anchorCommonStruct2.getId();
        }
        c188727au.LJI("TT_template_id", str);
        LJJJ(c188727au);
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        String str;
        AnchorCommonStruct anchorCommonStruct;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        LJJJJIZL(new AqS173S0100000_7(this, 246));
        List<AnchorCommonStruct> anchors = LJJII().getAnchors();
        o.LJIIIIZZ(anchors, "aweme().anchors");
        Iterator<AnchorCommonStruct> it = anchors.iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                anchorCommonStruct = it.next();
                if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                    break;
                }
            } else {
                anchorCommonStruct = null;
                break;
            }
        }
        AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
        if (anchorCommonStruct2 != null) {
            str = anchorCommonStruct2.getId();
        }
        eventMapBuilder.LJI("TT_template_id", str);
        HSS.LJJIZ(this, eventMapBuilder, 6);
    }

    @Override // X.HSS, X.S1E
    public final void LJIIJ(ViewGroup viewGroup, Dialog dialog, C188727au c188727au, int i) {
        o.LJIIIZ(dialog, "dialog");
        LJJJJIZL(new AqS111S0300000_7(viewGroup, this, c188727au, 17));
    }
}
