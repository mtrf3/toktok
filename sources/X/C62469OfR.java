package X;

import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.OfR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62469OfR extends AbstractC62520OgG {
    public final /* synthetic */ C62387Oe7 LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ C62477OfZ LJLJJL;
    public final /* synthetic */ C4P8 LJLJJLL;

    @Override // X.AbstractC62520OgG, X.InterfaceC62548Ogi
    public final void LJIIIZ() {
        this.LJLJJLL.Vd(new C62551Ogl());
    }

    @Override // X.AbstractC62520OgG
    public final void LIZ(InterfaceC62486Ofi action) {
        Integer num;
        o.LJIIIZ(action, "action");
        if (C62468OfQ.LJIJ) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("enter_from", C62468OfQ.LJ);
            linkedHashMap.put("panel_source", C62468OfQ.LJI);
            linkedHashMap.put("item_type", C62468OfQ.LJII);
            linkedHashMap.put("item_id", C62468OfQ.LJIIIIZZ);
            linkedHashMap.put("unique_id", C62468OfQ.LJIIL);
            linkedHashMap.put("action_id", C62468OfQ.LJIILL);
            Boolean bool = C62468OfQ.LJIIZILJ;
            if (bool != null) {
                num = Integer.valueOf(bool.booleanValue() ? 1 : 0);
            } else {
                num = null;
            }
            linkedHashMap.put("enabled", num);
            linkedHashMap.put("detail_tab_name", C62468OfQ.LJJIII);
            InterfaceC114054dl interfaceC114054dl = C62494Ofq.LIZIZ;
            if (interfaceC114054dl != null) {
                interfaceC114054dl.LIZIZ("action_clicked_end", linkedHashMap);
            }
        }
        if (!this.LJLJI.LJIIJ.LJIIIIZZ(action, this.LJLJJI)) {
            action.LIZIZ(this.LJLJJL, this.LJLJI.LJIIJ);
        }
        C62387Oe7 c62387Oe7 = this.LJLJI;
        InterfaceC62474OfW interfaceC62474OfW = c62387Oe7.LJIILIIL;
        if (interfaceC62474OfW != null) {
            interfaceC62474OfW.LIZIZ(this.LJLJJI, c62387Oe7.LJIIJ, action);
        }
        if (action.enable() && action.LJJI()) {
            this.LJLJJLL.Vd(new C62551Ogl());
        } else {
            if (!action.LJJIIJZLJL()) {
                return;
            }
            this.LJLJJLL.Vd(new C62551Ogl());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62469OfR(C62387Oe7 c62387Oe7, Context context, C62477OfZ c62477OfZ, C4P8 c4p8, Context context2, BaseSharePackage baseSharePackage) {
        super(context2, baseSharePackage);
        this.LJLJI = c62387Oe7;
        this.LJLJJI = context;
        this.LJLJJL = c62477OfZ;
        this.LJLJJLL = c4p8;
    }
}
