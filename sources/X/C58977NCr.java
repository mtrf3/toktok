package X;

import Y.ARunnableS12S0101000_8;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridContainerManager;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAnimationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.a;
import defpackage.g;
import defpackage.n;
import defpackage.o;
import defpackage.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* renamed from: X.NCr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58977NCr extends AbstractC58982NCw implements NV4 {
    public static final java.util.Map<String, Integer> LLD = new LinkedHashMap();
    public final String LJLLLL;
    public AbstractC59064NGa LJLLLLLL;
    public boolean LJLZ;
    public String LJZ;
    public String LJZI;
    public boolean LJZL;
    public List<? extends Number> LL;

    public final int LJIIJJI() {
        Integer num;
        String str = this.LJZI;
        if (str == null || (num = (Integer) ((LinkedHashMap) LLD).get(str)) == null) {
            return -1;
        }
        return num.intValue();
    }

    public final void LJIIL() {
        List<? extends Number> list;
        if (this.LJZL && (list = this.LL) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<? extends Number> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.next().intValue()));
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RegisterPlayback JSB timeList:");
            LIZ.append(arrayList);
            C242549fW.LIZ(X1D.LIZIZ(LIZ));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int intValue = ((Number) it2.next()).intValue();
                this.LJLJI.LJ(new ARunnableS12S0101000_8(intValue, this, 36), intValue, "JSB_" + this.LJLIL.getID() + '_' + intValue);
            }
        }
    }

    @Override // X.AbstractC58982NCw, X.NC9
    public final void clear() {
        String str = this.LJZI;
        if (str != null) {
            LLD.remove(str);
        }
        this.LJLZ = false;
        this.LJLJLJ = null;
        this.LJZI = null;
        AbstractC59064NGa abstractC59064NGa = this.LJLLLLLL;
        if (abstractC59064NGa != null) {
            String aid = this.LJLILLLLZI.getAid();
            o.LJIIIIZZ(aid, "awemeModel.aid");
            abstractC59064NGa.LJIJI(aid);
        }
        C242549fW.LIZ("releaseCache");
    }

    @Override // X.AbstractC58982NCw, X.NC9
    public final C58983NCx isReady() {
        if (!this.LJLZ) {
            return new C58983NCx(false, "data_load_fail");
        }
        if (LJIIJJI() != 1) {
            return new C58983NCx(false, "load_timeout");
        }
        return new C58983NCx(true, null);
    }

    @Override // X.AbstractC58982NCw, X.NC9
    public final void LIZ() {
        NBS LJI;
        Activity LJI2 = AbstractC58982NCw.LJI();
        String lynxSchema = this.LJLIL.getLynxSchema();
        if (lynxSchema != null && (LJI = this.LJLJI.LJI()) != null && LJI2 != null) {
            AdHybridContainerManager.LIZLLL().LIZIZ(C78983UzD.LJJI(this, (ActivityC45651qj) LJI2), C78983UzD.LJJIFFI(this, this.LJLILLLLZI, lynxSchema, LJI));
        }
        C242549fW.LIZ("prerender");
    }

    @Override // X.AbstractC58982NCw, X.NC9
    public final void LIZIZ() {
        LJIIJ();
        b.LJJIII(this, "disappear", new JSONObject());
        C42625Go9.LIZJ(this);
    }

    @Override // X.AbstractC58982NCw, X.NC9
    public final void LJFF() {
        String lynxSchema;
        NBS LJI;
        Activity LJI2;
        C42625Go9.LIZIZ(this);
        if (this.LJLJLJ == null && (lynxSchema = this.LJLIL.getLynxSchema()) != null && (LJI = this.LJLJI.LJI()) != null && (LJI2 = AbstractC58982NCw.LJI()) != null) {
            C59421NTt LJJIFFI = C78983UzD.LJJIFFI(this, this.LJLILLLLZI, lynxSchema, LJI);
            AbstractC59064NGa LIZJ = AdHybridContainerManager.LIZLLL().LIZJ(C78983UzD.LJJI(this, (ActivityC45651qj) LJI2), LJJIFFI);
            this.LJLLLLLL = LIZJ;
            if (LIZJ != null) {
                LIZJ.LJIJJ(LJJIFFI, this, null);
            }
            C242549fW.LIZ("render");
        }
        b.LJJIII(this, "appear", new JSONObject());
    }

    @Override // X.AbstractC58982NCw
    public final void LJIIJ() {
        super.LJIIJ();
        this.LJZL = false;
        this.LL = null;
        this.LJLJJLL = null;
    }

    @Override // X.AbstractC58982NCw
    public final String LJII() {
        return this.LJLLLL;
    }

    @Override // X.AbstractC58982NCw
    public final void LIZLLL(AnoleComponentAppearModel appearModel) {
        o.LJIIIZ(appearModel, "appearModel");
        super.LIZLLL(appearModel);
        AbstractC59064NGa abstractC59064NGa = this.LJLLLLLL;
        if (abstractC59064NGa != null) {
            abstractC59064NGa.LJIIJJI();
        }
        b.LJJIII(this, "show", new JSONObject());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    @Override // X.AbstractC58982NCw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58977NCr.LJ(java.lang.String):void");
    }

    @Override // X.AbstractC58982NCw, X.NC9
    public final void Q0(NCI event) {
        InterfaceC58980NCu interfaceC58980NCu;
        o.LJIIIZ(event, "event");
        if (!(event instanceof C58968NCi)) {
            if (!(event instanceof C58967NCh)) {
                if (!(event instanceof C58965NCf)) {
                    if (!(event instanceof C58966NCg)) {
                        if (event instanceof C58961NCb) {
                            this.LJZL = true;
                            LJIIL();
                            return;
                        } else {
                            if (!(event instanceof NCJ) || (interfaceC58980NCu = this.LJLLL) == null) {
                                return;
                            }
                            interfaceC58980NCu.LIZIZ(((NCJ) event).LIZ);
                            return;
                        }
                    }
                    b.LJJIII(this, "restart", new JSONObject());
                    return;
                }
                b.LJJIII(this, "pause", new JSONObject());
                return;
            }
            b.LJJIII(this, "resume", new JSONObject());
            return;
        }
        b.LJJIII(this, "start", new JSONObject());
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void anoleJSBEvent(N9D event) {
        Object LIZ;
        ViewGroup viewGroup;
        View view;
        AnimatorSet LJJ;
        o.LJIIIZ(event, "event");
        if (!o.LJ(event.LJLILLLLZI, this.LJZI)) {
            return;
        }
        XBaseParamModel xBaseParamModel = event.LJLJI;
        if (xBaseParamModel instanceof n.b) {
            try {
                LIZ = (AnoleComponentAnimationModel) C69432nz.LIZ().LJI(((n.b) xBaseParamModel).getAnimation().toString(), AnoleComponentAnimationModel.class);
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m12isFailureimpl(LIZ) || LIZ == null || (viewGroup = this.LJLJL) == null || (view = this.LJLJLJ) == null || (LJJ = C78949Uyf.LJJ(this, viewGroup, view, C47261Igj.LJJIJ(LIZ), false)) == null) {
                return;
            }
            LJJ.start();
            return;
        }
        if (xBaseParamModel instanceof g.b) {
            this.LL = ((g.b) xBaseParamModel).getTimeList();
            LJIIL();
            return;
        }
        if (xBaseParamModel instanceof a.InterfaceC0002a) {
            this.LJLJJLL = new C58958NBy(((a.InterfaceC0002a) event.LJLJI).getSize().getWidth().doubleValue(), ((a.InterfaceC0002a) event.LJLJI).getSize().getHeight().doubleValue());
            return;
        }
        if (xBaseParamModel instanceof p.b) {
            p.b bVar = (p.b) xBaseParamModel;
            if (o.LJ(bVar.getType(), "byBusiness")) {
                this.LJLJI.LJIIIIZZ(new NC0(bVar.getComponentToShow()), this);
                return;
            }
            return;
        }
        if (xBaseParamModel instanceof o.b) {
            o.b bVar2 = (o.b) xBaseParamModel;
            if (kotlin.jvm.internal.o.LJ(bVar2.getType(), "byBusiness")) {
                this.LJLJI.LJIIIIZZ(new NC1(bVar2.getComponentToHide()), this);
            }
        }
    }

    @Override // X.NV4
    public final void ze(C58978NCs c58978NCs) {
        boolean z;
        if (c58978NCs.LIZIZ == EnumC46475ILv.STATUS_LOAD_SUCCESS) {
            z = true;
        } else {
            z = false;
        }
        this.LJLZ = z;
        this.LJLJLJ = c58978NCs.LIZ;
        this.LJZI = c58978NCs.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadSuccess，contentView hashCode: ");
        LIZ.append(c58978NCs.LIZ.hashCode());
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.NV4
    public final void Zi(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadFailed,code = ");
        LIZ.append(str);
        LIZ.append(", msg=");
        LIZ.append(str2);
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        this.LJLZ = false;
        this.LJZ = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58977NCr(AnoleComponentModel anoleComponentModel, Aweme awemeModel, InterfaceC58979NCt delegate, Context context) {
        super(anoleComponentModel, awemeModel, delegate, context);
        kotlin.jvm.internal.o.LJIIIZ(awemeModel, "awemeModel");
        kotlin.jvm.internal.o.LJIIIZ(delegate, "delegate");
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnoleHybridComponent,type:");
        LIZ.append(anoleComponentModel.getType());
        this.LJLLLL = X1D.LIZIZ(LIZ);
        this.LJZ = "-1";
    }
}
