package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.U8p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76707U8p extends C76703U8l {
    public final Context LJIIJ;
    public final U92 LJIIJJI;
    public final U9E LJIIL;
    public final C62822Ol8 LJIILIIL;

    public final C76708U8q LJIILLIIL() {
        return (C76708U8q) this.LJIILIIL.getValue();
    }

    @Override // X.C76703U8l
    public final void LIZ() {
        LJIILLIIL().LIZ();
    }

    @Override // X.C76703U8l
    public final List<C76711U8t> LIZIZ() {
        return LJIILLIIL().LJFF;
    }

    @Override // X.C76703U8l
    public final String LJIIIIZZ() {
        return LJIILLIIL().LJ;
    }

    @Override // X.C76703U8l
    public final Layout LIZJ(boolean z) {
        return LJIILLIIL().LIZLLL;
    }

    @Override // X.C76703U8l
    public final C76711U8t LJFF(int i) {
        String str;
        String str2;
        C76708U8q LJIILLIIL = LJIILLIIL();
        Layout layout = LJIILLIIL.LIZLLL;
        if (layout == null) {
            C0K2.LIZ("live currentLayout is null.", new Throwable());
            return LJIILLIIL.LJI(i);
        }
        C76711U8t c76711U8t = null;
        if (layout.isFixedType() || LJIILLIIL.LIZJ.LIZ()) {
            for (Map.Entry<String, OnLineMicInfo> entry : LJIILLIIL.LJII.LIZ().entrySet()) {
                if (LJIILLIIL.LJII.LJIIIZ()) {
                    MicPositionInfo micPositionData = entry.getValue().getMicPositionData();
                    if (micPositionData != null && micPositionData.getUiPos() == i) {
                        str = entry.getKey();
                        break;
                    }
                } else {
                    MicPositionInfo micPositionData2 = entry.getValue().getMicPositionData();
                    if (micPositionData2 != null && micPositionData2.getPosition() == i) {
                        str = entry.getKey();
                        break;
                    }
                }
            }
            str = null;
            Iterator<C76711U8t> it = LJIILLIIL.LJFF.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C76711U8t next = it.next();
                C76711U8t c76711U8t2 = next;
                if (str != null && o.LJ(c76711U8t2.LJLIL.LIZJ, str)) {
                    c76711U8t = next;
                    break;
                }
            }
            C76711U8t c76711U8t3 = c76711U8t;
            if (c76711U8t3 != null) {
                return c76711U8t3;
            }
            return LJIILLIIL.LJI(i);
        }
        for (Map.Entry<String, OnLineMicInfo> entry2 : LJIILLIIL.LJII.LJIILJJIL().entrySet()) {
            if (LJIILLIIL.LJII.LJIIIZ()) {
                MicPositionInfo micPositionData3 = entry2.getValue().getMicPositionData();
                if (micPositionData3 != null && micPositionData3.getUiPos() == i) {
                    str2 = entry2.getKey();
                    break;
                }
            } else {
                MicPositionInfo micPositionData4 = entry2.getValue().getMicPositionData();
                if (micPositionData4 != null && micPositionData4.getPosition() == i) {
                    str2 = entry2.getKey();
                    break;
                }
            }
        }
        str2 = null;
        Iterator<C76711U8t> it2 = LJIILLIIL.LJFF.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C76711U8t next2 = it2.next();
            C76711U8t c76711U8t4 = next2;
            if (str2 != null && o.LJ(c76711U8t4.LJLIL.LIZJ, str2)) {
                c76711U8t = next2;
                break;
            }
        }
        C76711U8t c76711U8t5 = c76711U8t;
        if (c76711U8t5 != null) {
            return c76711U8t5;
        }
        return LJIILLIIL.LJI(i);
    }

    @Override // X.C76703U8l
    public final C76711U8t LJI(String linkMicId) {
        C76711U8t c76711U8t;
        o.LJIIIZ(linkMicId, "linkMicId");
        C76708U8q LJIILLIIL = LJIILLIIL();
        LJIILLIIL.getClass();
        Iterator<C76711U8t> it = LJIILLIIL.LJFF.iterator();
        while (true) {
            if (it.hasNext()) {
                c76711U8t = it.next();
                if (o.LJ(linkMicId, c76711U8t.LJLIL.LIZJ)) {
                    break;
                }
            } else {
                c76711U8t = null;
                break;
            }
        }
        return c76711U8t;
    }

    @Override // X.C76703U8l
    public final void LJIIJJI(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        LJIILLIIL().LIZLLL(linkMicId);
    }

    @Override // X.C76703U8l
    public final void LJIILIIL(Layout layout) {
        o.LJIIIZ(layout, "layout");
        this.LJIIIIZZ = layout;
        LJIILLIIL().LJ(layout);
    }

    @Override // X.C76703U8l
    public final boolean LJIILJJIL(C76701U8j c76701U8j, FrameLayout frameLayout) {
        return LJIILLIIL().LJFF(c76701U8j, frameLayout);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76707U8p(AtomicBoolean isLinked, boolean z, Context context, U92 positionManager, U9E mappingHelper) {
        super(isLinked, z, context, positionManager, mappingHelper);
        o.LJIIIZ(isLinked, "isLinked");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(positionManager, "positionManager");
        o.LJIIIZ(mappingHelper, "mappingHelper");
        this.LJIIJ = context;
        this.LJIIJJI = positionManager;
        this.LJIIL = mappingHelper;
        this.LJIILIIL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 526));
    }
}
