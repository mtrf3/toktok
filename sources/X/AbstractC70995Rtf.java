package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Rtf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC70995Rtf extends AbstractC71002Rtm {
    public static final ConcurrentHashMap<AbstractC70995Rtf, StringBuilder> LJII = new ConcurrentHashMap<>();
    public boolean LIZLLL;
    public final LaneParams LJ;
    public InterfaceC71003Rtn LJFF;
    public View LJI;

    public void LJ(LaneParams params) {
        o.LJIIIZ(params, "params");
    }

    public void LJFF(LaneParams params) {
        o.LJIIIZ(params, "params");
    }

    public void LJI(LaneParams laneParams, LaneParams preChainParams) {
        o.LJIIIZ(preChainParams, "preChainParams");
    }

    public static void LIZLLL(AbstractC70995Rtf abstractC70995Rtf) {
        InterfaceC70849RrJ interfaceC70849RrJ;
        StringBuilder sb;
        abstractC70995Rtf.getClass();
        C70858RrS c70858RrS = new C70858RrS();
        c70858RrS.LIZ = abstractC70995Rtf;
        c70858RrS.LIZLLL(abstractC70995Rtf.LJ, abstractC70995Rtf.LIZIZ);
        if (!e1.LIZ(31744, "ecom_logmap_memory_leak_settings", true, true) || C70859RrT.LIZ) {
            LJII.put(abstractC70995Rtf, new StringBuilder());
        }
        if (C70859RrT.LIZ && (sb = LJII.get(abstractC70995Rtf)) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("back fill trace: \n *********** EVENT ");
            LIZ.append(abstractC70995Rtf.LIZ);
            LIZ.append(" BACK FILL START *********** \n");
            sb.append(X1D.LIZIZ(LIZ));
        }
        InterfaceC71003Rtn interfaceC71003Rtn = abstractC70995Rtf.LJFF;
        if (interfaceC71003Rtn != null) {
            C70996Rtg.LIZ(interfaceC71003Rtn, c70858RrS, false, null);
        }
        View view = abstractC70995Rtf.LJI;
        if (view != null) {
            Object tag = view.getTag(R.id.clh);
            if ((tag instanceof InterfaceC70849RrJ) && (interfaceC70849RrJ = (InterfaceC70849RrJ) tag) != null) {
                interfaceC70849RrJ.fillNodeParams(c70858RrS);
            }
        }
        LaneParams params = abstractC70995Rtf.LJ;
        o.LJIIIZ(params, "params");
    }

    public final LaneParams LIZIZ(LaneParams laneParams) {
        EnumC35453Dvl enumC35453Dvl;
        if (this.LIZLLL) {
            return laneParams;
        }
        LaneParams laneParams2 = new LaneParams();
        laneParams2.putAll(laneParams.getNotCheckParams$ecommerce_event_release());
        ArrayList arrayList = new ArrayList();
        for (C71006Rtq c71006Rtq : (C71006Rtq[]) this.LIZJ.getValue()) {
            o.LJIIIZ(c71006Rtq, "<this>");
            C71008Rts[] c71008RtsArr = c71006Rtq.LIZIZ;
            if (c71008RtsArr.length == 0) {
                enumC35453Dvl = EnumC35453Dvl.NEEDED;
            } else {
                enumC35453Dvl = EnumC35453Dvl.NO_NEED;
                for (C71008Rts c71008Rts : c71008RtsArr) {
                    o.LJIIIZ(c71008Rts, "<this>");
                    enumC35453Dvl = EnumC35453Dvl.NO_NEED;
                    for (C71005Rtp c71005Rtp : c71008Rts.LIZ) {
                        if (o.LJ(c71005Rtp.LIZ, "")) {
                            enumC35453Dvl = EnumC35453Dvl.TAKE_IF_EXIST;
                        } else if (o.LJ(String.valueOf(laneParams.get((Object) c71005Rtp.LIZ)), c71005Rtp.LIZIZ) || (o.LJ(c71005Rtp.LIZIZ, "******") && laneParams.get((Object) c71005Rtp.LIZ) != null)) {
                            if (enumC35453Dvl == EnumC35453Dvl.NO_NEED) {
                                enumC35453Dvl = EnumC35453Dvl.NEEDED;
                            }
                        } else {
                            enumC35453Dvl = EnumC35453Dvl.NO_NEED;
                            break;
                        }
                    }
                    if (enumC35453Dvl != EnumC35453Dvl.NO_NEED) {
                        break;
                    }
                }
            }
            if (enumC35453Dvl != EnumC35453Dvl.NO_NEED) {
                Object obj = laneParams.get((Object) c71006Rtq.LIZ);
                if (obj != null) {
                    laneParams2.put(c71006Rtq.LIZ, obj);
                } else if (enumC35453Dvl == EnumC35453Dvl.NEEDED) {
                    arrayList.add(c71006Rtq.LIZ);
                }
            }
        }
        if ((!arrayList.isEmpty()) && C70859RrT.LIZ) {
            String LLD = ORZ.LLD(arrayList, ",", null, null, C71004Rto.LJLIL, 30);
            HashMap hashMap = new HashMap();
            hashMap.put("exist", laneParams2);
            hashMap.put("lack", LLD);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("event ");
            XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ.LJJIJIL(), null, new C64312fj(C025908h.LIZIZ(LIZ, this.LIZ, " LACK of params: ", LLD, LIZ), null), 2);
        }
        return laneParams2;
    }

    public final void LIZJ(boolean z) {
        StringBuilder sb;
        if (z) {
            try {
                LIZLLL(this);
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("slark: failed to send event ");
                LIZ.append(this.LIZ);
                C78983UzD.LJIJ(e, X1D.LIZIZ(LIZ));
                return;
            }
        }
        if (C70859RrT.LIZ && (sb = LJII.get(this)) != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(" *********** EVENT ");
            LIZ2.append(this.LIZ);
            LIZ2.append(" BACK FILL END *********** \n");
            sb.append(X1D.LIZIZ(LIZ2));
        }
        ConcurrentHashMap<AbstractC70995Rtf, StringBuilder> concurrentHashMap = LJII;
        if (concurrentHashMap.get(this) != null) {
            concurrentHashMap.remove(this);
        }
        LJFF(this.LJ);
        LaneParams LIZIZ = LIZIZ(this.LJ);
        LJ(LIZIZ);
        C48658J7u.LIZIZ(this.LIZ, LIZIZ.toJSONObject());
    }

    public final void LJII(InterfaceC88472Yns interfaceC88472Yns) {
        StringBuilder sb;
        LaneParams laneParams = new LaneParams();
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(laneParams);
        }
        if (C70859RrT.LIZ && (sb = LJII.get(this)) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("self params:\n");
            LIZ.append(C87277YNd.LJJIL(laneParams));
            LIZ.append('\n');
            sb.append(X1D.LIZIZ(LIZ));
        }
        LJI(laneParams, this.LJ);
        this.LJ.withNotCheckParams(laneParams.getNotCheckParams$ecommerce_event_release());
        this.LJ.putAll(laneParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC70995Rtf(String str, String lane) {
        super(str, lane);
        o.LJIIIZ(lane, "lane");
        this.LJ = new LaneParams();
    }
}
