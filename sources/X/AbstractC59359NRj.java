package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridContainerManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NRj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC59359NRj implements InterfaceC59366NRq<NS7>, NV4 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJLL;
    public final OF1 LJLIL = C1DF.LJJIFFI(this, NS0.LJLIL);
    public final OF1 LJLILLLLZI = C1DF.LJJIFFI(this, C59372NRw.LJLIL);
    public AbstractC59064NGa LJLJI;
    public boolean LJLJJI;
    public View LJLJJL;

    static {
        TBT tbt = new TBT(AbstractC59359NRj.class, "aweme", "getAweme()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(AbstractC59359NRj.class, "container", "getContainer()Landroid/view/ViewGroup;", 0, c65351Pkp)};
    }

    public abstract C59066NGc LIZ(Context context, Aweme aweme);

    public abstract C59421NTt LIZIZ(Context context, Aweme aweme);

    public final ViewGroup LIZJ() {
        return (ViewGroup) this.LJLILLLLZI.LIZ(this, LJLJJLL[1]);
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
        IAdHybridContainerManager LIZLLL = AdHybridContainerManager.LIZLLL();
        Context context = LIZJ().getContext();
        o.LJIIIIZZ(context, "container.context");
        OF1 of1 = this.LJLIL;
        InterfaceC74236TBo<Object>[] interfaceC74236TBoArr = LJLJJLL;
        C59066NGc LIZ = LIZ(context, (Aweme) of1.LIZ(this, interfaceC74236TBoArr[0]));
        Context context2 = LIZJ().getContext();
        o.LJIIIIZZ(context2, "container.context");
        AbstractC59064NGa LIZJ = LIZLLL.LIZJ(LIZ, LIZIZ(context2, (Aweme) this.LJLIL.LIZ(this, interfaceC74236TBoArr[0])));
        this.LJLJI = LIZJ;
        if (LIZJ != null) {
            Context context3 = LIZJ().getContext();
            o.LJIIIIZZ(context3, "container.context");
            LIZJ.LJIJJ(LIZIZ(context3, (Aweme) this.LJLIL.LIZ(this, interfaceC74236TBoArr[0])), this, null);
            return;
        }
        o.LJIJI("hybridContainer");
        throw null;
    }

    public final void LIZLLL(OSZ... oszArr) {
        boolean z;
        JSONObject jSONObject;
        try {
            if (oszArr.length != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                jSONObject = null;
            } else {
                jSONObject = new JSONObject();
                C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(oszArr);
                while (LJJIIJZLJL.hasNext()) {
                    OSZ osz = (OSZ) LJJIIJZLJL.next();
                    jSONObject.put((String) osz.getFirst(), osz.getSecond());
                }
            }
            AbstractC59064NGa abstractC59064NGa = this.LJLJI;
            if (abstractC59064NGa != null) {
                abstractC59064NGa.LJIIIIZZ("change_stage_event", jSONObject);
            } else {
                o.LJIJI("hybridContainer");
                throw null;
            }
        } catch (Exception unused) {
        }
    }

    @Override // X.InterfaceC59366NRq
    public final void LJJLIIIIJ(int i) {
        ((NSG) L9()).getContainer().setBackgroundColor(i);
    }

    @Override // X.InterfaceC59366NRq
    public final void LLZZZIL(int i) {
        C59363NRn.LIZ(this, i);
    }

    @Override // X.InterfaceC59366NRq
    public final void qM(int i) {
        C59363NRn.LIZIZ(this, i);
    }

    @Override // X.InterfaceC59366NRq
    public final void setVisibility(int i) {
        C59363NRn.LIZJ(this, i);
    }

    @Override // X.InterfaceC59366NRq
    public final void ur0(float f) {
        ((NSG) L9()).getContainer().setRotation(f);
    }

    @Override // X.NV4
    public final void ze(C58978NCs c58978NCs) {
        Object obj;
        this.LJLJJI = true;
        View view = c58978NCs.LIZ;
        this.LJLJJL = view;
        ViewGroup viewGroup = null;
        if (view != null) {
            obj = view.getParent();
        } else {
            obj = null;
        }
        if (obj instanceof ViewGroup) {
            viewGroup = (ViewGroup) obj;
        }
        if (viewGroup == LIZJ()) {
            return;
        }
        if (viewGroup != null) {
            C16880lQ.LJLLL(this.LJLJJL, viewGroup);
        }
        LIZJ().removeAllViews();
        View view2 = this.LJLJJL;
        if (view2 != null) {
            C278517l.LIZIZ(-1, -1, view2);
        }
        LIZJ().addView(this.LJLJJL);
    }

    @Override // X.NV4
    public final void Zi(String str, String str2) {
        this.LJLJJI = false;
    }
}
