package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Ij, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30691Ij extends AbstractC029409q<C30701Ik> {
    public static String LJLJJI;
    public final List<String> LJLIL = new ArrayList();
    public final IHostCreativeTool LJLILLLLZI = (IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class);
    public LiveEffect LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLIL).size();
    }

    public C30691Ij(String str) {
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C30701Ik c30701Ik, int i) {
        C30701Ik holder = c30701Ik;
        o.LJIIIZ(holder, "holder");
        final String str = (String) ListProtector.get(this.LJLIL, i);
        C15650jR.LIZ().setUrl(str).LJIIJJI(holder.LJLILLLLZI);
        if (o.LJ(LJLJJI, str)) {
            C29306Beo.LJJLJLI(holder.LJLIL);
        } else {
            C29306Beo.LJI(holder.LJLIL);
        }
        C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.0PM
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2;
                LiveEffect.StickerSDKExtra stickerSDKExtra;
                LiveEffect.PlDataBean plDataBean;
                if (!o.LJ(C30691Ij.LJLJJI, str)) {
                    this.notifyDataSetChanged();
                }
                C30691Ij.LJLJJI = str;
                C30691Ij c30691Ij = this;
                IHostCreativeTool iHostCreativeTool = c30691Ij.LJLILLLLZI;
                LiveEffect liveEffect = c30691Ij.LJLJI;
                if (liveEffect == null || (stickerSDKExtra = liveEffect.sdkExtraModel) == null || (plDataBean = stickerSDKExtra.pl) == null || (str2 = plDataBean.getImgK()) == null) {
                    str2 = "";
                }
                iHostCreativeTool.resizePhoto(str2, str);
            }
        }, holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C30701Ik com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C30701Ik c30701Ik = new C30701Ik(C1FL.LIZIZ(parent, R.layout.d5n, parent, false, "from(parent.context)\n   …em_layout, parent, false)"));
        C0AX.LIZ(parent, c30701Ik.itemView, R.id.lj7);
        View view = c30701Ik.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c30701Ik.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C30701Ik.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c30701Ik.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c30701Ik.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C30701Ik.class.getName();
        return c30701Ik;
    }
}
