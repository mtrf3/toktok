package X;

import Y.ACListenerS46S0200000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.ComposerNode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TDc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74276TDc extends AbstractC029409q<C74278TDe> {
    public ComposerNode LJLIL;
    public List<? extends ComposerNode> LJLILLLLZI;
    public final /* synthetic */ C74277TDd LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List LJLLLLLL;
        ComposerNode composerNode = this.LJLIL;
        if (composerNode != null && (LJLLLLLL = LJLLLLLL(composerNode)) != null) {
            return LJLLLLLL.size();
        }
        return 0;
    }

    public C74276TDc(C74277TDd c74277TDd) {
        this.LJLJI = c74277TDd;
    }

    public static List LJLLLLLL(ComposerNode composerNode) {
        if (composerNode.children == null) {
            return C47261Igj.LJJIJ(composerNode);
        }
        ArrayList arrayList = new ArrayList();
        List<ComposerNode> list = composerNode.children;
        if (list != null) {
            Iterator it = ((ArrayList) ORZ.LJLL(list)).iterator();
            while (it.hasNext()) {
                it.next();
                arrayList.addAll(LJLLLLLL(composerNode));
            }
        }
        return ORZ.LLJI(arrayList);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C74278TDe c74278TDe, int i) {
        ComposerNode composerNode;
        List<String> urlList;
        C74278TDe holder = c74278TDe;
        o.LJIIIZ(holder, "holder");
        List<? extends ComposerNode> list = this.LJLILLLLZI;
        String str = null;
        if (list != null) {
            composerNode = (ComposerNode) ListProtector.get(list, i);
        } else {
            composerNode = null;
        }
        o.LJI(composerNode);
        InterfaceC88472Yns<ComposerNode, C76800UCe> onClick = this.LJLJI.LJ;
        o.LJIIIZ(onClick, "onClick");
        holder.LJLIL.setText(composerNode.UI_name);
        holder.LJLIL.setShowDownloadIcon(true);
        TDE tde = holder.LJLIL;
        UrlModel iconUrl = composerNode.effect.getIconUrl();
        if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null) {
            str = (String) ListProtector.get(urlList, 0);
        }
        C51029K0z.LJFF(tde, str);
        String id = composerNode.effect.getId();
        if (id != null && id.length() != 0) {
            InterfaceC73389SrB LJ = holder.LJLILLLLZI.LIZ.LJJJJLL().LJ();
            Effect effect = composerNode.effect;
            o.LJIIIIZZ(effect, "node.effect");
            if (!LJ.LIZ(effect)) {
                holder.LJLIL.LJIL();
                holder.LJLIL.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS46S0200000_12(onClick, composerNode, 60)));
                TDE tde2 = holder.LJLIL;
                List<ComposerNode> value = holder.LJLILLLLZI.LIZJ.getValue();
                o.LJI(value);
                tde2.setCustomSelected(value.contains(composerNode));
            }
        }
        holder.LJLIL.LJIJJ();
        holder.LJLIL.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS46S0200000_12(onClick, composerNode, 60)));
        TDE tde22 = holder.LJLIL;
        List<ComposerNode> value2 = holder.LJLILLLLZI.LIZJ.getValue();
        o.LJI(value2);
        tde22.setCustomSelected(value2.contains(composerNode));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C74278TDe com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        TKR tkr = this.LJLJI.LIZLLL;
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        OSZ LIZ = TKO.LIZ(tkr, context, this.LJLJI.LIZLLL.LLIIIILZ, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, C74280TDg.LJLIL, 508);
        C74278TDe c74278TDe = new C74278TDe(this.LJLJI, (View) LIZ.getFirst(), (TDE) LIZ.getSecond());
        C0AX.LIZ(parent, c74278TDe.itemView, R.id.lj7);
        View view = c74278TDe.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c74278TDe.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C74278TDe.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c74278TDe.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c74278TDe.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C74278TDe.class.getName();
        return c74278TDe;
    }
}
