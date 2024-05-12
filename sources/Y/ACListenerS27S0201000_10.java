package Y;

import X.C09900aA;
import X.C0RN;
import X.C188727au;
import X.C198517qh;
import X.C251669uE;
import X.C44694HgQ;
import X.C47261Igj;
import X.C59406NTe;
import X.C61716OKa;
import X.C61720OKe;
import X.C61803ONj;
import X.C61804ONk;
import X.C61805ONl;
import X.C62468OfQ;
import X.C62487Ofj;
import X.C62491Ofn;
import X.C62494Ofq;
import X.C6ZT;
import X.C76732zl;
import X.C76L;
import X.C78939UyV;
import X.C85990Xow;
import X.ExecutorC142245i8;
import X.FMX;
import X.InterfaceC114054dl;
import X.InterfaceC50599JtT;
import X.InterfaceC62486Ofi;
import X.NQA;
import X.ON3;
import X.ON6;
import X.ON7;
import X.ONR;
import X.ONS;
import X.ONV;
import X.OXB;
import X.OXC;
import X.RunnableC65751PrH;
import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import com.ss.android.ugc.aweme.feed.model.PromoteEntryCheck;
import com.ss.android.ugc.aweme.setting.api.PromoteEntryCheckApi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ACListenerS27S0201000_10 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.Ynr, X.Prl] */
    public static final void onClick$0(ACListenerS27S0201000_10 aCListenerS27S0201000_10, View v) {
        OXB oxb = (OXB) aCListenerS27S0201000_10.l0;
        if (oxb.LJLLI) {
            return;
        }
        if (aCListenerS27S0201000_10.i2 < 0) {
            List<Integer> list = oxb.LJLJLJ;
            o.LJI(list);
            if (((ArrayList) list).size() >= ((OXB) aCListenerS27S0201000_10.l0).LJLILLLLZI) {
                return;
            }
        }
        ?? r1 = ((OXB) aCListenerS27S0201000_10.l0).LJLLILLLL;
        if (r1 == 0) {
            return;
        }
        o.LJIIIIZZ(v, "v");
        r1.invoke(v, C44694HgQ.LJIIIIZZ(((OXC) aCListenerS27S0201000_10.l1).LJLJJL).toString());
    }

    public static final void onClick$1(ACListenerS27S0201000_10 aCListenerS27S0201000_10, View view) {
        boolean LIZ;
        String str;
        boolean z;
        LIZ = C251669uE.LIZ(view, LinkMicRtcMixBitrateSetting.DEFAULT);
        if (LIZ) {
            return;
        }
        InterfaceC62486Ofi interfaceC62486Ofi = ((C62491Ofn) aCListenerS27S0201000_10.l1).LJLJJL;
        C62468OfQ.LJIIL = UUID.randomUUID().toString();
        Integer num = null;
        if (interfaceC62486Ofi == null || (str = interfaceC62486Ofi.key()) == null) {
            str = "";
        }
        C62468OfQ.LJIILL = str;
        if (interfaceC62486Ofi != null) {
            z = interfaceC62486Ofi.enable();
        } else {
            z = false;
        }
        C62468OfQ.LJIIZILJ = Boolean.valueOf(z);
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
            }
            linkedHashMap.put("enabled", num);
            linkedHashMap.put("detail_tab_name", C62468OfQ.LJJIII);
            InterfaceC114054dl interfaceC114054dl = C62494Ofq.LIZIZ;
            if (interfaceC114054dl != null) {
                interfaceC114054dl.LIZIZ("action_clicked_start", linkedHashMap);
            }
        }
        C62487Ofj c62487Ofj = (C62487Ofj) aCListenerS27S0201000_10.l0;
        c62487Ofj.LJLJI.LIZIZ((InterfaceC62486Ofi) ListProtector.get(c62487Ofj.LJLIL, aCListenerS27S0201000_10.i2));
    }

    public static final void onClick$2(ACListenerS27S0201000_10 aCListenerS27S0201000_10, View view) {
        ON3 on3 = ((ON6) aCListenerS27S0201000_10.l0).LJLJJI;
        if (on3 != null) {
            View view2 = ((ON7) aCListenerS27S0201000_10.l1).itemView;
            o.LJIIIIZZ(view2, "holder.itemView");
            on3.LIZ(aCListenerS27S0201000_10.i2, view2);
        }
    }

    public static final void onClick$3(ACListenerS27S0201000_10 aCListenerS27S0201000_10, View view) {
        ONR onr = ((ONS) aCListenerS27S0201000_10.l0).LJLJJI;
        if (onr != null) {
            View view2 = ((ONV) aCListenerS27S0201000_10.l1).itemView;
            o.LJIIIIZZ(view2, "holder.itemView");
            onr.LIZ(aCListenerS27S0201000_10.i2, view2);
        }
    }

    public static final void onClick$4(ACListenerS27S0201000_10 aCListenerS27S0201000_10, View view) {
        InterfaceC50599JtT interfaceC50599JtT = ((C61803ONj) aCListenerS27S0201000_10.l0).LJLJJI;
        if (interfaceC50599JtT != null) {
            View view2 = ((RecyclerView.ViewHolder) aCListenerS27S0201000_10.l1).itemView;
            o.LJIIIIZZ(view2, "holder.itemView");
            interfaceC50599JtT.LIZ(aCListenerS27S0201000_10.i2, view2);
        }
    }

    public static final void onClick$5(ACListenerS27S0201000_10 aCListenerS27S0201000_10, View view) {
        InterfaceC50599JtT interfaceC50599JtT = ((C61804ONk) aCListenerS27S0201000_10.l0).LJLJJI;
        if (interfaceC50599JtT != null) {
            View view2 = ((RecyclerView.ViewHolder) aCListenerS27S0201000_10.l1).itemView;
            o.LJIIIIZZ(view2, "holder.itemView");
            interfaceC50599JtT.LIZ(aCListenerS27S0201000_10.i2, view2);
        }
    }

    public static final void onClick$6(ACListenerS27S0201000_10 aCListenerS27S0201000_10, View view) {
        InterfaceC50599JtT interfaceC50599JtT = ((C61805ONl) aCListenerS27S0201000_10.l0).LJLJJI;
        if (interfaceC50599JtT != null) {
            View view2 = ((RecyclerView.ViewHolder) aCListenerS27S0201000_10.l1).itemView;
            o.LJIIIIZZ(view2, "holder.itemView");
            interfaceC50599JtT.LIZ(aCListenerS27S0201000_10.i2, view2);
        }
    }

    public static final void onClick$7(ACListenerS27S0201000_10 aCListenerS27S0201000_10, View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        CreatorToolsActivity creatorToolsActivity = (CreatorToolsActivity) aCListenerS27S0201000_10.l0;
        int i = aCListenerS27S0201000_10.i2;
        int i2 = ((C76732zl) aCListenerS27S0201000_10.l1).element;
        creatorToolsActivity.getClass();
        NQA nqa = NQA.LIZIZ;
        String LIZJ = nqa.LIZJ();
        long currentTimeMillis = System.currentTimeMillis();
        if (C59406NTe.LJ()) {
            String builder = UriProtector.parse(C59406NTe.LJFF(Long.valueOf(currentTimeMillis), "", "creator_tools")).buildUpon().appendQueryParameter("session_id", LIZJ).toString();
            o.LJIIIIZZ(builder, "parse(schema).buildUpon(…              .toString()");
            if (nqa.LIZ()) {
                Uri parse = UriProtector.parse(builder);
                o.LJIIIIZZ(parse, "parse(schema)");
                String uri = C78939UyV.LJJJJJ(parse, C47261Igj.LJJIJIL("enable_prefetch", "enable_pending_js_task")).toString();
                o.LJIIIIZZ(uri, "tempUri.toString()");
                C59406NTe.LJIIL(creatorToolsActivity, uri);
            } else {
                SmartRouter.buildRoute(creatorToolsActivity, builder).open();
            }
            C188727au LIZJ2 = C0RN.LIZJ(0, "promote_status", i, "user_account_type");
            LIZJ2.LIZLLL(i2, "promote_version");
            LIZJ2.LJIIIZ("enter_from", "creator_tools");
            FMX.LJIIL("Promote_profile_entrance_click", LIZJ2.LIZ);
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("entry_from", "creator_tools");
            c198517qh.LIZ.put("carrier_region", C85990Xow.LJ());
            c198517qh.LIZ.put("url", builder);
            C09900aA.LJIIJJI("promote_entry_check", 1, c198517qh.LJ());
            nqa.LJII(LIZJ, "creator_tools", "myself");
            return;
        }
        PromoteEntryCheckApi.LIZ.getClass();
        C76L<PromoteEntryCheck> promoteEntryCheck = C61720OKe.LIZ().getPromoteEntryCheck("", "creator_tools", currentTimeMillis, "");
        C61716OKa c61716OKa = new C61716OKa(creatorToolsActivity, i, i2);
        promoteEntryCheck.LJFF(new RunnableC65751PrH(promoteEntryCheck, c61716OKa), ExecutorC142245i8.LJLILLLLZI);
    }

    public ACListenerS27S0201000_10(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
