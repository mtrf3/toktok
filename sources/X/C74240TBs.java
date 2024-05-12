package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.global.config.settings.pojo.ContentLanguageGuideSetting;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import o53.IDdS197S0200000_12;

/* renamed from: X.TBs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74240TBs extends AbstractC029409q<C74243TBv> {
    public final List<ContentLanguageGuideSetting> LJLIL;
    public final InterfaceC74242TBu LJLILLLLZI;
    public final String LJLJI;
    public final ArrayList<String> LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C74240TBs(String enterFrom, InterfaceC74242TBu itemListener) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(itemListener, "itemListener");
        List<ContentLanguageGuideSetting> contentLanguageGuideCodes = C2YJ.LIZIZ.LIZ.getContentLanguageGuideCodes();
        o.LJIIIIZZ(contentLanguageGuideCodes, "get().contentLanguageGuideCodes");
        this.LJLIL = contentLanguageGuideCodes;
        this.LJLILLLLZI = itemListener;
        this.LJLJI = enterFrom;
        this.LJLJJI = new ArrayList<>();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.W5O, REQUEST] */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C74243TBv c74243TBv, int i) {
        C74243TBv viewHolder = c74243TBv;
        o.LJIIIZ(viewHolder, "viewHolder");
        ContentLanguageGuideSetting contentLanguageGuideSetting = (ContentLanguageGuideSetting) ListProtector.get(this.LJLIL, i);
        try {
            Object value = viewHolder.LJLIL.getValue();
            o.LJIIIIZZ(value, "<get-mTvLocalName>(...)");
            ((TextView) value).setText(contentLanguageGuideSetting.getLocalName());
            Object value2 = viewHolder.LJLILLLLZI.getValue();
            o.LJIIIIZZ(value2, "<get-mTvEnName>(...)");
            ((TextView) value2).setText(contentLanguageGuideSetting.getEnName());
            if (TextUtils.isEmpty(contentLanguageGuideSetting.getIcon())) {
                C78765Uvh.LIZ(viewHolder.M(), R.drawable.b0p);
            } else {
                ?? LIZ = W5P.LIZLLL(UriProtector.parse(contentLanguageGuideSetting.getIcon())).LIZ();
                C81705W4v LIZJ = W5I.LIZJ();
                LIZJ.LJIIL = viewHolder.M().getController();
                LIZJ.LIZLLL = LIZ;
                LIZJ.LJII = new IDdS197S0200000_12(this, contentLanguageGuideSetting, 1);
                viewHolder.M().setController(LIZJ.LIZ());
            }
            viewHolder.itemView.setOnTouchListener(new C74241TBt(this, viewHolder, contentLanguageGuideSetting));
            viewHolder.L().setTag(contentLanguageGuideSetting.getHighlightColor());
        } catch (C158056If e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C74243TBv com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C74243TBv c74243TBv = new C74243TBv(C1FL.LIZIZ(parent, R.layout.bbn, parent, false, "from(parent.context).inf…age_guide, parent, false)"));
        C0AX.LIZ(parent, c74243TBv.itemView, R.id.lj7);
        View view = c74243TBv.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c74243TBv.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C74243TBv.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c74243TBv.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c74243TBv.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C74243TBv.class.getName();
        return c74243TBv;
    }
}
