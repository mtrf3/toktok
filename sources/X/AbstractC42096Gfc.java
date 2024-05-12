package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gfc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42096Gfc implements InterfaceC42565GnB {
    public final java.util.Map LIZ = new LinkedHashMap();
    public final int LIZIZ = 5;
    public final boolean LIZJ = !C1DG.LJIIIIZZ();

    public abstract List LIZJ(InterfaceC42095Gfb interfaceC42095Gfb, InterfaceC42095Gfb interfaceC42095Gfb2, EnumC42099Gff enumC42099Gff, EnumC42099Gff enumC42099Gff2);

    public abstract InterfaceC42095Gfb LIZLLL();

    public abstract InterfaceC42095Gfb LJ(ShortVideoContext shortVideoContext, List list, EnumC42099Gff enumC42099Gff);

    @Override // X.InterfaceC42565GnB
    public final boolean getEnable() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC42565GnB
    public final void LIZIZ(String str) {
        if (str != null) {
            this.LIZ.remove(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC42565GnB
    public final List LIZ(String str, C42097Gfd node) {
        InterfaceC42095Gfb data;
        o.LJIIIZ(node, "node");
        if (str == null) {
            return C61878OQg.INSTANCE;
        }
        T data2 = node.LIZIZ;
        List<InterfaceC42095Gfb> list = node.LIZJ;
        EnumC42099Gff curNode = node.LIZ;
        o.LJIIIZ(curNode, "curNode");
        if (data2 instanceof ShortVideoContext) {
            data = LJ((ShortVideoContext) data2, list, curNode);
        } else if (data2 instanceof VideoPublishEditModel) {
            data = LJFF((VideoPublishEditModel) data2, curNode);
        } else if (data2 instanceof Intent) {
            data = LJI((Intent) data2, curNode);
        } else if (data2 instanceof LinkedHashMap) {
            data = LJII((LinkedHashMap) data2, curNode);
        } else if (data2 instanceof InterfaceC42095Gfb) {
            o.LJIIIZ(data2, "data");
            data = LIZLLL();
        } else {
            data = LIZLLL();
        }
        EnumC42099Gff node2 = node.LIZ;
        o.LJIIIZ(node2, "node");
        o.LJIIIZ(data, "data");
        String data3 = data.toString();
        o.LJIIIZ(data3, "data");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FundSafetyMonitor ");
        LIZ.append(node2.getValue());
        LIZ.append(": ");
        LIZ.append(data3);
        H78.LJI(X1D.LIZIZ(LIZ));
        C42097Gfd c42097Gfd = (C42097Gfd) ((LinkedHashMap) this.LIZ).get(str);
        if (c42097Gfd == null) {
            if (this.LIZ.size() > this.LIZIZ) {
                ((LinkedHashMap) this.LIZ).clear();
            }
            this.LIZ.put(str, new C42097Gfd(node.LIZ, data, null));
            return C61878OQg.INSTANCE;
        }
        InterfaceC42095Gfb interfaceC42095Gfb = (InterfaceC42095Gfb) c42097Gfd.LIZIZ;
        EnumC42099Gff enumC42099Gff = c42097Gfd.LIZ;
        this.LIZ.put(str, new C42097Gfd(node.LIZ, data, null));
        if (interfaceC42095Gfb == null) {
            return C61878OQg.INSTANCE;
        }
        return LIZJ(interfaceC42095Gfb, data, enumC42099Gff, node.LIZ);
    }

    public InterfaceC42095Gfb LJFF(VideoPublishEditModel model, EnumC42099Gff enumC42099Gff) {
        o.LJIIIZ(model, "model");
        return LIZLLL();
    }

    public InterfaceC42095Gfb LJI(Intent intent, EnumC42099Gff enumC42099Gff) {
        o.LJIIIZ(intent, "intent");
        return LIZLLL();
    }

    public InterfaceC42095Gfb LJII(LinkedHashMap publishMap, EnumC42099Gff enumC42099Gff) {
        o.LJIIIZ(publishMap, "publishMap");
        return LIZLLL();
    }
}
